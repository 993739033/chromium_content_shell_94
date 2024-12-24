package org.chromium.content_shell;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.JavascriptInterface;

import androidx.annotation.NonNull;

import org.chromium.content_public.browser.JavascriptInjector;

public class ChromiumWebView extends ShellManager{
    public ChromiumWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void initWebView() {
//        getActiveShell().getWebContents().se().
    }


    public void setRendererPriorityPolicyImport() {
        getActiveShell().getWebContents().setImportance(2);
    }

    public void addJavascriptInterface(@NonNull Object object, @NonNull String name) {
        JavascriptInjector javascriptInjector =
                JavascriptInjector.fromWebContents(getActiveShell().getWebContents(), false);
        javascriptInjector.setAllowInspection(true);
        javascriptInjector.addPossiblyUnsafeInterface(object, name, JavascriptInterface.class);
    }

    public void removeJavascriptInterface(@NonNull String name) {
        JavascriptInjector javascriptInjector =
                JavascriptInjector.fromWebContents(getActiveShell().getWebContents(), false);
        javascriptInjector.removeInterface(name);
    }

    public void stopLoading() {
        getActiveShell().getWebContents().stop();
    }

    public void reload() {
        getActiveShell().getWebContents().getNavigationController().reload(true);
    }

    public boolean canGoBack() {
        return getActiveShell().getWebContents().getNavigationController().canGoBack();
    }

    public void goBack() {
        if (canGoBack()) {
            getActiveShell().getWebContents().getNavigationController().goBack();
        }
    }

    public boolean canGoForward() {
        return getActiveShell().getWebContents().getNavigationController().canGoForward();
    }

    public void goForward() {
        if (canGoForward()) {
            getActiveShell().getWebContents().getNavigationController().goForward();
        }
    }

    public boolean canGoBackOrForward(int steps) {
        return getActiveShell().getWebContents().getNavigationController().canGoToOffset(steps);
    }

    public void goBackOrForward(int steps) {
        if (canGoBackOrForward(steps)) {
            getActiveShell().getWebContents().getNavigationController().goToOffset(steps);
        }
    }


}
