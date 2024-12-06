package org.chromium.content.browser.webcontents;

import android.graphics.Rect;
import android.view.ViewStructure;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content.browser.RenderWidgetHostViewImpl;
import org.chromium.content.browser.accessibility.ViewStructureBuilder;
import org.chromium.content.browser.webcontents.WebContentsImpl;
import org.chromium.content_public.browser.ImageDownloadCallback;
import org.chromium.content_public.browser.JavaScriptCallback;
import org.chromium.content_public.browser.MessagePort;
import org.chromium.content_public.browser.RenderFrameHost;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.OverscrollRefreshHandler;
import org.chromium.ui.base.EventForwarder;
import org.chromium.ui.base.ViewAndroidDelegate;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class WebContentsImplJni implements WebContentsImpl.Natives {
    public static final JniStaticTestMocker<WebContentsImpl.Natives> TEST_HOOKS = new JniStaticTestMocker<WebContentsImpl.Natives>() { // from class: org.chromium.content.browser.webcontents.WebContentsImplJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(WebContentsImpl.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                WebContentsImpl.Natives unused = WebContentsImplJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static WebContentsImpl.Natives testInstance;

    WebContentsImplJni() {
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public void destroyWebContents(long webContentsAndroidPtr) {
        GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_destroyWebContents(webContentsAndroidPtr);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public WebContents fromNativePtr(long webContentsAndroidPtr) {
        return (WebContents) GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_fromNativePtr(webContentsAndroidPtr);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public void clearNativeReference(long nativeWebContentsAndroid, WebContentsImpl caller) {
        GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_clearNativeReference(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public WindowAndroid getTopLevelNativeWindow(long nativeWebContentsAndroid, WebContentsImpl caller) {
        return (WindowAndroid) GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_getTopLevelNativeWindow(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public void setTopLevelNativeWindow(long nativeWebContentsAndroid, WebContentsImpl caller, WindowAndroid windowAndroid) {
        GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_setTopLevelNativeWindow(nativeWebContentsAndroid, caller, windowAndroid);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public RenderFrameHost getMainFrame(long nativeWebContentsAndroid, WebContentsImpl caller) {
        return (RenderFrameHost) GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_getMainFrame(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public RenderFrameHost getFocusedFrame(long nativeWebContentsAndroid, WebContentsImpl caller) {
        return (RenderFrameHost) GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_getFocusedFrame(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public RenderFrameHost getRenderFrameHostFromId(long nativeWebContentsAndroid, int renderProcessId, int renderFrameId) {
        return (RenderFrameHost) GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_getRenderFrameHostFromId(nativeWebContentsAndroid, renderProcessId, renderFrameId);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public RenderFrameHost[] getAllRenderFrameHosts(long nativeWebContentsAndroid, WebContentsImpl caller) {
        return (RenderFrameHost[]) GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_getAllRenderFrameHosts(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public RenderWidgetHostViewImpl getRenderWidgetHostView(long nativeWebContentsAndroid, WebContentsImpl caller) {
        return (RenderWidgetHostViewImpl) GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_getRenderWidgetHostView(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public WebContentsImpl[] getInnerWebContents(long nativeWebContentsAndroid, WebContentsImpl caller) {
        return (WebContentsImpl[]) GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_getInnerWebContents(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public int getVisibility(long nativeWebContentsAndroid) {
        return GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_getVisibility(nativeWebContentsAndroid);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public String getTitle(long nativeWebContentsAndroid, WebContentsImpl caller) {
        return GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_getTitle(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public GURL getVisibleURL(long nativeWebContentsAndroid, WebContentsImpl caller) {
        return (GURL) GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_getVisibleURL(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public String getEncoding(long nativeWebContentsAndroid, WebContentsImpl caller) {
        return GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_getEncoding(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public boolean isLoading(long nativeWebContentsAndroid, WebContentsImpl caller) {
        return GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_isLoading(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public boolean isLoadingToDifferentDocument(long nativeWebContentsAndroid, WebContentsImpl caller) {
        return GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_isLoadingToDifferentDocument(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public void dispatchBeforeUnload(long nativeWebContentsAndroid, WebContentsImpl caller, boolean autoCancel) {
        GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_dispatchBeforeUnload(nativeWebContentsAndroid, caller, autoCancel);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public void stop(long nativeWebContentsAndroid, WebContentsImpl caller) {
        GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_stop(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public void cut(long nativeWebContentsAndroid, WebContentsImpl caller) {
        GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_cut(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public void copy(long nativeWebContentsAndroid, WebContentsImpl caller) {
        GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_copy(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public void paste(long nativeWebContentsAndroid, WebContentsImpl caller) {
        GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_paste(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public void pasteAsPlainText(long nativeWebContentsAndroid, WebContentsImpl caller) {
        GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_pasteAsPlainText(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public void replace(long nativeWebContentsAndroid, WebContentsImpl caller, String word) {
        GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_replace(nativeWebContentsAndroid, caller, word);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public void selectAll(long nativeWebContentsAndroid, WebContentsImpl caller) {
        GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_selectAll(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public void collapseSelection(long nativeWebContentsAndroid, WebContentsImpl caller) {
        GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_collapseSelection(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public void onHide(long nativeWebContentsAndroid, WebContentsImpl caller) {
        GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_onHide(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public void onShow(long nativeWebContentsAndroid, WebContentsImpl caller) {
        GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_onShow(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public void setImportance(long nativeWebContentsAndroid, WebContentsImpl caller, int importance) {
        GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_setImportance(nativeWebContentsAndroid, caller, importance);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public void suspendAllMediaPlayers(long nativeWebContentsAndroid, WebContentsImpl caller) {
        GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_suspendAllMediaPlayers(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public void setAudioMuted(long nativeWebContentsAndroid, WebContentsImpl caller, boolean mute) {
        GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_setAudioMuted(nativeWebContentsAndroid, caller, mute);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public boolean focusLocationBarByDefault(long nativeWebContentsAndroid, WebContentsImpl caller) {
        return GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_focusLocationBarByDefault(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public boolean isFullscreenForCurrentTab(long nativeWebContentsAndroid, WebContentsImpl caller) {
        return GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_isFullscreenForCurrentTab(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public void exitFullscreen(long nativeWebContentsAndroid, WebContentsImpl caller) {
        GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_exitFullscreen(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public void scrollFocusedEditableNodeIntoView(long nativeWebContentsAndroid, WebContentsImpl caller) {
        GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_scrollFocusedEditableNodeIntoView(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public void selectWordAroundCaret(long nativeWebContentsAndroid, WebContentsImpl caller) {
        GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_selectWordAroundCaret(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public void adjustSelectionByCharacterOffset(long nativeWebContentsAndroid, WebContentsImpl caller, int startAdjust, int endAdjust, boolean showSelectionMenu) {
        GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_adjustSelectionByCharacterOffset(nativeWebContentsAndroid, caller, startAdjust, endAdjust, showSelectionMenu);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public GURL getLastCommittedURL(long nativeWebContentsAndroid, WebContentsImpl caller) {
        return (GURL) GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_getLastCommittedURL(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public boolean isIncognito(long nativeWebContentsAndroid, WebContentsImpl caller) {
        return GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_isIncognito(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public void resumeLoadingCreatedWebContents(long nativeWebContentsAndroid, WebContentsImpl caller) {
        GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_resumeLoadingCreatedWebContents(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public void evaluateJavaScript(long nativeWebContentsAndroid, WebContentsImpl caller, String script, JavaScriptCallback callback) {
        GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_evaluateJavaScript(nativeWebContentsAndroid, caller, script, callback);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public void evaluateJavaScriptForTests(long nativeWebContentsAndroid, WebContentsImpl caller, String script, JavaScriptCallback callback) {
        GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_evaluateJavaScriptForTests(nativeWebContentsAndroid, caller, script, callback);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public void addMessageToDevToolsConsole(long nativeWebContentsAndroid, WebContentsImpl caller, int level, String message) {
        GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_addMessageToDevToolsConsole(nativeWebContentsAndroid, caller, level, message);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public void postMessageToMainFrame(long nativeWebContentsAndroid, WebContentsImpl caller, String message, String sourceOrigin, String targetOrigin, MessagePort[] ports) {
        GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_postMessageToMainFrame(nativeWebContentsAndroid, caller, message, sourceOrigin, targetOrigin, ports);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public boolean hasAccessedInitialDocument(long nativeWebContentsAndroid, WebContentsImpl caller) {
        return GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_hasAccessedInitialDocument(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public int getThemeColor(long nativeWebContentsAndroid, WebContentsImpl caller) {
        return GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_getThemeColor(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public float getLoadProgress(long nativeWebContentsAndroid, WebContentsImpl caller) {
        return GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_getLoadProgress(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public void requestSmartClipExtract(long nativeWebContentsAndroid, WebContentsImpl caller, WebContentsImpl.SmartClipCallback callback, int x, int y, int width, int height) {
        GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_requestSmartClipExtract(nativeWebContentsAndroid, caller, callback, x, y, width, height);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public void requestAccessibilitySnapshot(long nativeWebContentsAndroid, ViewStructure viewStructureRoot, ViewStructureBuilder viewStructureBuilder, Runnable doneCallback) {
        GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_requestAccessibilitySnapshot(nativeWebContentsAndroid, viewStructureRoot, viewStructureBuilder, doneCallback);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public void setOverscrollRefreshHandler(long nativeWebContentsAndroid, WebContentsImpl caller, OverscrollRefreshHandler nativeOverscrollRefreshHandler) {
        GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_setOverscrollRefreshHandler(nativeWebContentsAndroid, caller, nativeOverscrollRefreshHandler);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public void setSpatialNavigationDisabled(long nativeWebContentsAndroid, WebContentsImpl caller, boolean disabled) {
        GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_setSpatialNavigationDisabled(nativeWebContentsAndroid, caller, disabled);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public int downloadImage(long nativeWebContentsAndroid, WebContentsImpl caller, GURL url, boolean isFavicon, int maxBitmapSize, boolean bypassCache, ImageDownloadCallback callback) {
        return GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_downloadImage(nativeWebContentsAndroid, caller, url, isFavicon, maxBitmapSize, bypassCache, callback);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public void setHasPersistentVideo(long nativeWebContentsAndroid, WebContentsImpl caller, boolean value) {
        GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_setHasPersistentVideo(nativeWebContentsAndroid, caller, value);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public boolean hasActiveEffectivelyFullscreenVideo(long nativeWebContentsAndroid, WebContentsImpl caller) {
        return GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_hasActiveEffectivelyFullscreenVideo(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public boolean isPictureInPictureAllowedForFullscreenVideo(long nativeWebContentsAndroid, WebContentsImpl caller) {
        return GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_isPictureInPictureAllowedForFullscreenVideo(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public Rect getFullscreenVideoSize(long nativeWebContentsAndroid, WebContentsImpl caller) {
        return (Rect) GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_getFullscreenVideoSize(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public void setSize(long nativeWebContentsAndroid, WebContentsImpl caller, int width, int height) {
        GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_setSize(nativeWebContentsAndroid, caller, width, height);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public int getWidth(long nativeWebContentsAndroid, WebContentsImpl caller) {
        return GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_getWidth(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public int getHeight(long nativeWebContentsAndroid, WebContentsImpl caller) {
        return GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_getHeight(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public EventForwarder getOrCreateEventForwarder(long nativeWebContentsAndroid, WebContentsImpl caller) {
        return (EventForwarder) GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_getOrCreateEventForwarder(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public void setViewAndroidDelegate(long nativeWebContentsAndroid, WebContentsImpl caller, ViewAndroidDelegate viewDelegate) {
        GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_setViewAndroidDelegate(nativeWebContentsAndroid, caller, viewDelegate);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public void sendOrientationChangeEvent(long nativeWebContentsAndroid, WebContentsImpl caller, int orientation) {
        GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_sendOrientationChangeEvent(nativeWebContentsAndroid, caller, orientation);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public void onScaleFactorChanged(long nativeWebContentsAndroid, WebContentsImpl caller) {
        GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_onScaleFactorChanged(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public void setFocus(long nativeWebContentsAndroid, WebContentsImpl caller, boolean focused) {
        GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_setFocus(nativeWebContentsAndroid, caller, focused);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public void setDisplayCutoutSafeArea(long nativeWebContentsAndroid, WebContentsImpl caller, int top, int left, int bottom, int right) {
        GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_setDisplayCutoutSafeArea(nativeWebContentsAndroid, caller, top, left, bottom, right);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public void notifyRendererPreferenceUpdate(long nativeWebContentsAndroid, WebContentsImpl caller) {
        GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_notifyRendererPreferenceUpdate(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public void notifyBrowserControlsHeightChanged(long nativeWebContentsAndroid, WebContentsImpl caller) {
        GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_notifyBrowserControlsHeightChanged(nativeWebContentsAndroid, caller);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsImpl.Natives
    public boolean isBeingDestroyed(long nativeWebContentsAndroid, WebContentsImpl caller) {
        return GEN_JNI.org_chromium_content_browser_webcontents_WebContentsImpl_isBeingDestroyed(nativeWebContentsAndroid, caller);
    }

    public static WebContentsImpl.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            WebContentsImpl.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.webcontents.WebContentsImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new WebContentsImplJni();
    }
}
