package org.chromium.content_shell;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.scode.content_shell.R;

import org.chromium.base.ThreadUtils;
import org.chromium.base.annotations.JNINamespace;
import org.chromium.components.embedder_support.view.ContentViewRenderView;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;
@JNINamespace("content")
/* loaded from: classes2.dex */
public class ShellManager extends FrameLayout {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String DEFAULT_SHELL_URL = "http://www.baidu.com";
//    public static final String DEFAULT_SHELL_URL = "http://47.102.202.2:8080/app/js1.html";
    private Shell mActiveShell;
    private ContentViewRenderView mContentViewRenderView;
    private String mStartupUrl;
    private WindowAndroid mWindow;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface Natives {
        void init(Object obj);

        void launchShell(String str);
    }

    public ShellManager(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mStartupUrl = DEFAULT_SHELL_URL;
        ShellManagerJni.get().init(this);
    }

    public void setWindow(WindowAndroid window) {
        if (window == null) {
            throw new AssertionError();
        }
        this.mWindow = window;
        ContentViewRenderView contentViewRenderView = new ContentViewRenderView(getContext());
        this.mContentViewRenderView = contentViewRenderView;
        contentViewRenderView.onNativeLibraryLoaded(window);
    }

    public WindowAndroid getWindow() {
        return this.mWindow;
    }

    public ContentViewRenderView getContentViewRenderView() {
        return this.mContentViewRenderView;
    }

    public void setStartupUrl(String url) {
        this.mStartupUrl = url;
    }

    public Shell getActiveShell() {
        return this.mActiveShell;
    }

    public void launchShell(String url) {
        ThreadUtils.assertOnUiThread();
        Shell previousShell = this.mActiveShell;
        ShellManagerJni.get().launchShell(url);
        if (previousShell != null) {
            previousShell.close();
        }
    }

    private Object createShell(long nativeShellPtr) {
        if (this.mContentViewRenderView == null) {
            ContentViewRenderView contentViewRenderView = new ContentViewRenderView(getContext());
            this.mContentViewRenderView = contentViewRenderView;
            contentViewRenderView.onNativeLibraryLoaded(this.mWindow);
        }
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        Shell shellView = (Shell) inflater.inflate(R.layout.shell_view, (ViewGroup) null);
        shellView.initialize(nativeShellPtr, this.mWindow);
        Shell shell = this.mActiveShell;
        if (shell != null) {
            removeShell(shell);
        }
        showShell(shellView);
        return shellView;
    }

    private void showShell(Shell shellView) {
        shellView.setContentViewRenderView(this.mContentViewRenderView);
        addView(shellView, new LayoutParams(-1, -1));
        this.mActiveShell = shellView;
        WebContents webContents = shellView.getWebContents();
        if (webContents != null) {
            this.mContentViewRenderView.setCurrentWebContents(webContents);
            webContents.onShow();
        }
    }

    private void removeShell(Shell shellView) {
        if (shellView == this.mActiveShell) {
            this.mActiveShell = null;
        }
        if (shellView.getParent() == null) {
            return;
        }
        shellView.setContentViewRenderView(null);
        removeView(shellView);
    }

    public void destroy() {
        Shell shell = this.mActiveShell;
        if (shell != null) {
            removeShell(shell);
        }
        ContentViewRenderView contentViewRenderView = this.mContentViewRenderView;
        if (contentViewRenderView != null) {
            contentViewRenderView.destroy();
            this.mContentViewRenderView = null;
        }
    }
}
