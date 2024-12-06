package org.chromium.content.browser.webcontents;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content.browser.webcontents.WebContentsObserverProxy;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class WebContentsObserverProxyJni implements WebContentsObserverProxy.Natives {
    public static final JniStaticTestMocker<WebContentsObserverProxy.Natives> TEST_HOOKS = new JniStaticTestMocker<WebContentsObserverProxy.Natives>() { // from class: org.chromium.content.browser.webcontents.WebContentsObserverProxyJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(WebContentsObserverProxy.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                WebContentsObserverProxy.Natives unused = WebContentsObserverProxyJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static WebContentsObserverProxy.Natives testInstance;

    WebContentsObserverProxyJni() {
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsObserverProxy.Natives
    public long init(WebContentsObserverProxy caller, WebContentsImpl webContents) {
        return GEN_JNI.org_chromium_content_browser_webcontents_WebContentsObserverProxy_init(caller, webContents);
    }

    @Override // org.chromium.content.browser.webcontents.WebContentsObserverProxy.Natives
    public void destroy(long nativeWebContentsObserverProxy, WebContentsObserverProxy caller) {
        GEN_JNI.org_chromium_content_browser_webcontents_WebContentsObserverProxy_destroy(nativeWebContentsObserverProxy, caller);
    }

    public static WebContentsObserverProxy.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            WebContentsObserverProxy.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.webcontents.WebContentsObserverProxy.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new WebContentsObserverProxyJni();
    }
}
