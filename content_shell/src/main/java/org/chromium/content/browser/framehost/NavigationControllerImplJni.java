package org.chromium.content.browser.framehost;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content.browser.framehost.NavigationControllerImpl;
import org.chromium.content_public.browser.NavigationEntry;
import org.chromium.content_public.browser.NavigationHistory;
import org.chromium.content_public.common.ResourceRequestBody;
import org.chromium.url.Origin;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class NavigationControllerImplJni implements NavigationControllerImpl.Natives {
    public static final JniStaticTestMocker<NavigationControllerImpl.Natives> TEST_HOOKS = new JniStaticTestMocker<NavigationControllerImpl.Natives>() { // from class: org.chromium.content.browser.framehost.NavigationControllerImplJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(NavigationControllerImpl.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                NavigationControllerImpl.Natives unused = NavigationControllerImplJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static NavigationControllerImpl.Natives testInstance;

    NavigationControllerImplJni() {
    }

    @Override // org.chromium.content.browser.framehost.NavigationControllerImpl.Natives
    public boolean canGoBack(long nativeNavigationControllerAndroid, NavigationControllerImpl caller) {
        return GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_canGoBack(nativeNavigationControllerAndroid, caller);
    }

    @Override // org.chromium.content.browser.framehost.NavigationControllerImpl.Natives
    public boolean canGoForward(long nativeNavigationControllerAndroid, NavigationControllerImpl caller) {
        return GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_canGoForward(nativeNavigationControllerAndroid, caller);
    }

    @Override // org.chromium.content.browser.framehost.NavigationControllerImpl.Natives
    public boolean isInitialNavigation(long nativeNavigationControllerAndroid, NavigationControllerImpl caller) {
        return GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_isInitialNavigation(nativeNavigationControllerAndroid, caller);
    }

    @Override // org.chromium.content.browser.framehost.NavigationControllerImpl.Natives
    public void loadIfNecessary(long nativeNavigationControllerAndroid, NavigationControllerImpl caller) {
        GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_loadIfNecessary(nativeNavigationControllerAndroid, caller);
    }

    @Override // org.chromium.content.browser.framehost.NavigationControllerImpl.Natives
    public boolean needsReload(long nativeNavigationControllerAndroid, NavigationControllerImpl caller) {
        return GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_needsReload(nativeNavigationControllerAndroid, caller);
    }

    @Override // org.chromium.content.browser.framehost.NavigationControllerImpl.Natives
    public void setNeedsReload(long nativeNavigationControllerAndroid, NavigationControllerImpl caller) {
        GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_setNeedsReload(nativeNavigationControllerAndroid, caller);
    }

    @Override // org.chromium.content.browser.framehost.NavigationControllerImpl.Natives
    public boolean canGoToOffset(long nativeNavigationControllerAndroid, NavigationControllerImpl caller, int offset) {
        return GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_canGoToOffset(nativeNavigationControllerAndroid, caller, offset);
    }

    @Override // org.chromium.content.browser.framehost.NavigationControllerImpl.Natives
    public void goBack(long nativeNavigationControllerAndroid, NavigationControllerImpl caller) {
        GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_goBack(nativeNavigationControllerAndroid, caller);
    }

    @Override // org.chromium.content.browser.framehost.NavigationControllerImpl.Natives
    public void goForward(long nativeNavigationControllerAndroid, NavigationControllerImpl caller) {
        GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_goForward(nativeNavigationControllerAndroid, caller);
    }

    @Override // org.chromium.content.browser.framehost.NavigationControllerImpl.Natives
    public void goToOffset(long nativeNavigationControllerAndroid, NavigationControllerImpl caller, int offset) {
        GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_goToOffset(nativeNavigationControllerAndroid, caller, offset);
    }

    @Override // org.chromium.content.browser.framehost.NavigationControllerImpl.Natives
    public void goToNavigationIndex(long nativeNavigationControllerAndroid, NavigationControllerImpl caller, int index) {
        GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_goToNavigationIndex(nativeNavigationControllerAndroid, caller, index);
    }

    @Override // org.chromium.content.browser.framehost.NavigationControllerImpl.Natives
    public void cancelPendingReload(long nativeNavigationControllerAndroid, NavigationControllerImpl caller) {
        GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_cancelPendingReload(nativeNavigationControllerAndroid, caller);
    }

    @Override // org.chromium.content.browser.framehost.NavigationControllerImpl.Natives
    public void continuePendingReload(long nativeNavigationControllerAndroid, NavigationControllerImpl caller) {
        GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_continuePendingReload(nativeNavigationControllerAndroid, caller);
    }

    @Override // org.chromium.content.browser.framehost.NavigationControllerImpl.Natives
    public void reload(long nativeNavigationControllerAndroid, NavigationControllerImpl caller, boolean checkForRepost) {
        GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_reload(nativeNavigationControllerAndroid, caller, checkForRepost);
    }

    @Override // org.chromium.content.browser.framehost.NavigationControllerImpl.Natives
    public void reloadBypassingCache(long nativeNavigationControllerAndroid, NavigationControllerImpl caller, boolean checkForRepost) {
        GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_reloadBypassingCache(nativeNavigationControllerAndroid, caller, checkForRepost);
    }

    @Override // org.chromium.content.browser.framehost.NavigationControllerImpl.Natives
    public void loadUrl(long nativeNavigationControllerAndroid, NavigationControllerImpl caller, String url, int loadUrlType, int transitionType, String referrerUrl, int referrerPolicy, int uaOverrideOption, String extraHeaders, ResourceRequestBody postData, String baseUrlForDataUrl, String virtualUrlForDataUrl, String dataUrlAsString, boolean canLoadLocalResources, boolean isRendererInitiated, boolean shouldReplaceCurrentEntry, Origin initiatorOrigin, boolean hasUserGesture, boolean shouldClearHistoryList, long inputStart, String sourcePackageName, String attributionSourceEventId, String attributionDestination, String attributionReportTo, long attributionExpiry) {
        GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_loadUrl(nativeNavigationControllerAndroid, caller, url, loadUrlType, transitionType, referrerUrl, referrerPolicy, uaOverrideOption, extraHeaders, postData, baseUrlForDataUrl, virtualUrlForDataUrl, dataUrlAsString, canLoadLocalResources, isRendererInitiated, shouldReplaceCurrentEntry, initiatorOrigin, hasUserGesture, shouldClearHistoryList, inputStart, sourcePackageName, attributionSourceEventId, attributionDestination, attributionReportTo, attributionExpiry);
    }

    @Override // org.chromium.content.browser.framehost.NavigationControllerImpl.Natives
    public void clearHistory(long nativeNavigationControllerAndroid, NavigationControllerImpl caller) {
        GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_clearHistory(nativeNavigationControllerAndroid, caller);
    }

    @Override // org.chromium.content.browser.framehost.NavigationControllerImpl.Natives
    public int getNavigationHistory(long nativeNavigationControllerAndroid, NavigationControllerImpl caller, Object history) {
        return GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_getNavigationHistory(nativeNavigationControllerAndroid, caller, history);
    }

    @Override // org.chromium.content.browser.framehost.NavigationControllerImpl.Natives
    public void getDirectedNavigationHistory(long nativeNavigationControllerAndroid, NavigationControllerImpl caller, NavigationHistory history, boolean isForward, int itemLimit) {
        GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_getDirectedNavigationHistory(nativeNavigationControllerAndroid, caller, history, isForward, itemLimit);
    }

    @Override // org.chromium.content.browser.framehost.NavigationControllerImpl.Natives
    public void clearSslPreferences(long nativeNavigationControllerAndroid, NavigationControllerImpl caller) {
        GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_clearSslPreferences(nativeNavigationControllerAndroid, caller);
    }

    @Override // org.chromium.content.browser.framehost.NavigationControllerImpl.Natives
    public boolean getUseDesktopUserAgent(long nativeNavigationControllerAndroid, NavigationControllerImpl caller) {
        return GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_getUseDesktopUserAgent(nativeNavigationControllerAndroid, caller);
    }

    @Override // org.chromium.content.browser.framehost.NavigationControllerImpl.Natives
    public void setUseDesktopUserAgent(long nativeNavigationControllerAndroid, NavigationControllerImpl caller, boolean override, boolean reloadOnChange) {
        GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_setUseDesktopUserAgent(nativeNavigationControllerAndroid, caller, override, reloadOnChange);
    }

    @Override // org.chromium.content.browser.framehost.NavigationControllerImpl.Natives
    public NavigationEntry getEntryAtIndex(long nativeNavigationControllerAndroid, NavigationControllerImpl caller, int index) {
        return (NavigationEntry) GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_getEntryAtIndex(nativeNavigationControllerAndroid, caller, index);
    }

    @Override // org.chromium.content.browser.framehost.NavigationControllerImpl.Natives
    public NavigationEntry getVisibleEntry(long nativeNavigationControllerAndroid, NavigationControllerImpl caller) {
        return (NavigationEntry) GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_getVisibleEntry(nativeNavigationControllerAndroid, caller);
    }

    @Override // org.chromium.content.browser.framehost.NavigationControllerImpl.Natives
    public NavigationEntry getPendingEntry(long nativeNavigationControllerAndroid, NavigationControllerImpl caller) {
        return (NavigationEntry) GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_getPendingEntry(nativeNavigationControllerAndroid, caller);
    }

    @Override // org.chromium.content.browser.framehost.NavigationControllerImpl.Natives
    public int getLastCommittedEntryIndex(long nativeNavigationControllerAndroid, NavigationControllerImpl caller) {
        return GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_getLastCommittedEntryIndex(nativeNavigationControllerAndroid, caller);
    }

    @Override // org.chromium.content.browser.framehost.NavigationControllerImpl.Natives
    public boolean removeEntryAtIndex(long nativeNavigationControllerAndroid, NavigationControllerImpl caller, int index) {
        return GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_removeEntryAtIndex(nativeNavigationControllerAndroid, caller, index);
    }

    @Override // org.chromium.content.browser.framehost.NavigationControllerImpl.Natives
    public void pruneForwardEntries(long nativeNavigationControllerAndroid, NavigationControllerImpl caller) {
        GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_pruneForwardEntries(nativeNavigationControllerAndroid, caller);
    }

    @Override // org.chromium.content.browser.framehost.NavigationControllerImpl.Natives
    public String getEntryExtraData(long nativeNavigationControllerAndroid, NavigationControllerImpl caller, int index, String key) {
        return GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_getEntryExtraData(nativeNavigationControllerAndroid, caller, index, key);
    }

    @Override // org.chromium.content.browser.framehost.NavigationControllerImpl.Natives
    public void setEntryExtraData(long nativeNavigationControllerAndroid, NavigationControllerImpl caller, int index, String key, String value) {
        GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_setEntryExtraData(nativeNavigationControllerAndroid, caller, index, key, value);
    }

    @Override // org.chromium.content.browser.framehost.NavigationControllerImpl.Natives
    public boolean isEntryMarkedToBeSkipped(long nativeNavigationControllerAndroid, NavigationControllerImpl caller, int index) {
        return GEN_JNI.org_chromium_content_browser_framehost_NavigationControllerImpl_isEntryMarkedToBeSkipped(nativeNavigationControllerAndroid, caller, index);
    }

    public static NavigationControllerImpl.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            NavigationControllerImpl.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.framehost.NavigationControllerImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new NavigationControllerImplJni();
    }
}
