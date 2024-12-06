package org.chromium.content_shell;

import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.scode.content_shell.R;

import org.chromium.base.Callback;
import org.chromium.base.annotations.JNINamespace;
import org.chromium.components.embedder_support.view.ContentView;
import org.chromium.components.embedder_support.view.ContentViewRenderView;
import org.chromium.content_public.browser.ActionModeCallbackHelper;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.NavigationController;
import org.chromium.content_public.browser.SelectionPopupController;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.ViewAndroidDelegate;
import org.chromium.ui.base.WindowAndroid;
@JNINamespace("content")
/* loaded from: classes2.dex */
public class Shell extends LinearLayout {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long COMPLETED_PROGRESS_TIMEOUT_MS = 200;
    private final Runnable mClearProgressRunnable;
    private ContentViewRenderView mContentViewRenderView;
    private boolean mIsFullscreen;
    private boolean mLoading;
    private long mNativeShell;
    private NavigationController mNavigationController;
    private ImageButton mNextButton;
    private Callback<Boolean> mOverlayModeChangedCallbackForTesting;
    private ImageButton mPrevButton;
    private ClipDrawable mProgressDrawable;
    private ImageButton mStopReloadButton;
    private EditText mUrlTextView;
    private ShellViewAndroidDelegate mViewAndroidDelegate;
    private WebContents mWebContents;
    private WindowAndroid mWindow;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface Natives {
        void closeShell(long j);
    }

    public Shell(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mClearProgressRunnable = new Runnable() { // from class: org.chromium.content_shell.Shell.1
            @Override // java.lang.Runnable
            public void run() {
                Shell.this.mProgressDrawable.setLevel(0);
            }
        };
    }

    public void setContentViewRenderView(ContentViewRenderView contentViewRenderView) {
        FrameLayout contentViewHolder = (FrameLayout) findViewById(R.id.contentview_holder);
        if (contentViewRenderView == null) {
            ContentViewRenderView contentViewRenderView2 = this.mContentViewRenderView;
            if (contentViewRenderView2 != null) {
                contentViewHolder.removeView(contentViewRenderView2);
            }
        } else {
            contentViewHolder.addView(contentViewRenderView, new FrameLayout.LayoutParams(-1, -1));
        }
        this.mContentViewRenderView = contentViewRenderView;
    }

    public void initialize(long nativeShell, WindowAndroid window) {
        this.mNativeShell = nativeShell;
        this.mWindow = window;
    }

    public void close() {
        if (this.mNativeShell == 0) {
            return;
        }
        ShellJni.get().closeShell(this.mNativeShell);
    }

    private void onNativeDestroyed() {
        this.mWindow = null;
        this.mNativeShell = 0L;
        this.mWebContents = null;
    }

    public boolean isDestroyed() {
        return this.mNativeShell == 0;
    }

    public boolean isLoading() {
        return this.mLoading;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        View toolbar = findViewById(R.id.toolbar);
        this.mProgressDrawable = (ClipDrawable) toolbar.getBackground();
        initializeUrlField();
        initializeNavigationButtons();
    }

    private void initializeUrlField() {
        EditText editText = (EditText) findViewById(R.id.url);
        this.mUrlTextView = editText;
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.chromium.content_shell.Shell.2
            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId != 2 && (event == null || event.getKeyCode() != 66 || event.getAction() != 0)) {
                    return false;
                }
                Shell shell = Shell.this;
                shell.loadUrl(shell.mUrlTextView.getText().toString());
                Shell.this.setKeyboardVisibilityForUrl(false);
                Shell.this.getContentView().requestFocus();
                return true;
            }
        });
        this.mUrlTextView.setOnFocusChangeListener(new OnFocusChangeListener() { // from class: org.chromium.content_shell.Shell.3
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View v, boolean hasFocus) {
                Shell.this.setKeyboardVisibilityForUrl(hasFocus);
                Shell.this.mNextButton.setVisibility(hasFocus ? GONE : VISIBLE);
                Shell.this.mPrevButton.setVisibility(hasFocus ? GONE : VISIBLE);
                Shell.this.mStopReloadButton.setVisibility(hasFocus ? GONE : VISIBLE);
                if (!hasFocus) {
                    Shell.this.mUrlTextView.setText(Shell.this.mWebContents.getVisibleUrl().getSpec());
                }
            }
        });
        this.mUrlTextView.setOnKeyListener(new OnKeyListener() { // from class: org.chromium.content_shell.Shell.4
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (keyCode == 4) {
                    Shell.this.getContentView().requestFocus();
                    return true;
                }
                return false;
            }
        });
    }

    public void loadUrl(String url) {
        if (url == null) {
            return;
        }
        if (TextUtils.equals(url, this.mWebContents.getLastCommittedUrl().getSpec())) {
            this.mNavigationController.reload(true);
        } else {
            this.mNavigationController.loadUrl(new LoadUrlParams(sanitizeUrl(url)));
        }
        this.mUrlTextView.clearFocus();
        getContentView().clearFocus();
        getContentView().requestFocus();
    }

    public static String sanitizeUrl(String url) {
        if (url == null) {
            return null;
        }
        if (url.startsWith("www.") || url.indexOf(":") == -1) {
            return "http://" + url;
        }
        return url;
    }

    private void initializeNavigationButtons() {
        ImageButton imageButton = (ImageButton) findViewById(R.id.prev);
        this.mPrevButton = imageButton;
        imageButton.setOnClickListener(new OnClickListener() { // from class: org.chromium.content_shell.Shell.5
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                if (Shell.this.mNavigationController.canGoBack()) {
                    Shell.this.mNavigationController.goBack();
                }
            }
        });
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.next);
        this.mNextButton = imageButton2;
        imageButton2.setOnClickListener(new OnClickListener() { // from class: org.chromium.content_shell.Shell.6
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                if (Shell.this.mNavigationController.canGoForward()) {
                    Shell.this.mNavigationController.goForward();
                }
            }
        });
        ImageButton imageButton3 = (ImageButton) findViewById(R.id.stop_reload_button);
        this.mStopReloadButton = imageButton3;
        imageButton3.setOnClickListener(new OnClickListener() { // from class: org.chromium.content_shell.Shell.7
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                if (Shell.this.mLoading) {
                    Shell.this.mWebContents.stop();
                } else {
                    Shell.this.mNavigationController.reload(true);
                }
            }
        });
    }

    private void onUpdateUrl(String url) {
        this.mUrlTextView.setText(url);
    }

    private void onLoadProgressChanged(double progress) {
        removeCallbacks(this.mClearProgressRunnable);
        this.mProgressDrawable.setLevel((int) (10000.0d * progress));
        if (progress == 1.0d) {
            postDelayed(this.mClearProgressRunnable, COMPLETED_PROGRESS_TIMEOUT_MS);
        }
    }

    private void toggleFullscreenModeForTab(boolean enterFullscreen) {
        this.mIsFullscreen = enterFullscreen;
        LinearLayout toolBar = (LinearLayout) findViewById(R.id.toolbar);
        toolBar.setVisibility(enterFullscreen ? GONE : VISIBLE);
    }

    private boolean isFullscreenForTabOrPending() {
        return this.mIsFullscreen;
    }

    private void setIsLoading(boolean loading) {
        this.mLoading = loading;
        if (loading) {
            this.mStopReloadButton.setImageResource(R.drawable.btn_close);
        } else {
            this.mStopReloadButton.setImageResource(R.drawable.ic_refresh);
        }
    }

    public ShellViewAndroidDelegate getViewAndroidDelegate() {
        return this.mViewAndroidDelegate;
    }

    private void initFromNativeTabContents(WebContents webContents) {
        Context context = getContext();
        ContentView cv = ContentView.createContentView(context, null, webContents);
        this.mViewAndroidDelegate = new ShellViewAndroidDelegate(cv);
        WebContents webContents2 = this.mWebContents;
        if (webContents2 == webContents) {
            throw new AssertionError();
        }
        if (webContents2 != null) {
            webContents2.clearNativeReference();
        }
        webContents.initialize("", this.mViewAndroidDelegate, cv, this.mWindow, WebContents.createDefaultInternalsHolder());
        this.mWebContents = webContents;
        SelectionPopupController.fromWebContents(webContents).setActionModeCallback(defaultActionCallback());
        this.mNavigationController = this.mWebContents.getNavigationController();
        if (getParent() != null) {
            this.mWebContents.onShow();
        }
        this.mUrlTextView.setText(this.mWebContents.getVisibleUrl().getSpec());
        ((FrameLayout) findViewById(R.id.contentview_holder)).addView(cv, new FrameLayout.LayoutParams(-1, -1));
        cv.requestFocus();
        this.mContentViewRenderView.setCurrentWebContents(this.mWebContents);
    }

    private ActionMode.Callback defaultActionCallback() {
        final ActionModeCallbackHelper helper = SelectionPopupController.fromWebContents(this.mWebContents).getActionModeCallbackHelper();
        return new ActionMode.Callback() { // from class: org.chromium.content_shell.Shell.8
            @Override // android.view.ActionMode.Callback
            public boolean onCreateActionMode(ActionMode mode, Menu menu) {
                helper.onCreateActionMode(mode, menu);
                return true;
            }

            @Override // android.view.ActionMode.Callback
            public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
                return helper.onPrepareActionMode(mode, menu);
            }

            @Override // android.view.ActionMode.Callback
            public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
                return helper.onActionItemClicked(mode, item);
            }

            @Override // android.view.ActionMode.Callback
            public void onDestroyActionMode(ActionMode mode) {
                helper.onDestroyActionMode();
            }
        };
    }

    public void setOverlayMode(boolean useOverlayMode) {
        this.mContentViewRenderView.setOverlayVideoMode(useOverlayMode);
        Callback<Boolean> callback = this.mOverlayModeChangedCallbackForTesting;
        if (callback != null) {
            callback.onResult(Boolean.valueOf(useOverlayMode));
        }
    }

    public void setOverayModeChangedCallbackForTesting(Callback<Boolean> callback) {
        this.mOverlayModeChangedCallbackForTesting = callback;
    }

    private void enableUiControl(int controlId, boolean enabled) {
        if (controlId == 0) {
            this.mPrevButton.setEnabled(enabled);
        } else if (controlId == 1) {
            this.mNextButton.setEnabled(enabled);
        }
    }

    public View getContentView() {
        ViewAndroidDelegate viewDelegate = this.mWebContents.getViewAndroidDelegate();
        if (viewDelegate != null) {
            return viewDelegate.getContainerView();
        }
        return null;
    }

    public WebContents getWebContents() {
        return this.mWebContents;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyboardVisibilityForUrl(boolean visible) {
        InputMethodManager imm = (InputMethodManager) getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
        if (visible) {
            imm.showSoftInput(this.mUrlTextView, 1);
        } else {
            imm.hideSoftInputFromWindow(this.mUrlTextView.getWindowToken(), 0);
        }
    }
}
