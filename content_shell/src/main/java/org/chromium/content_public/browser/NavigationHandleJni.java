package org.chromium.content_public.browser;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.NavigationHandle;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class NavigationHandleJni implements NavigationHandle.Natives {
    public static final JniStaticTestMocker<NavigationHandle.Natives> TEST_HOOKS = new JniStaticTestMocker<NavigationHandle.Natives>() { // from class: org.chromium.content_public.browser.NavigationHandleJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(NavigationHandle.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                NavigationHandle.Natives unused = NavigationHandleJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static NavigationHandle.Natives testInstance;

    NavigationHandleJni() {
    }

    @Override // org.chromium.content_public.browser.NavigationHandle.Natives
    public void setRequestHeader(long nativeNavigationHandleProxy, String headerName, String headerValue) {
        GEN_JNI.org_chromium_content_1public_browser_NavigationHandle_setRequestHeader(nativeNavigationHandleProxy, headerName, headerValue);
    }

    @Override // org.chromium.content_public.browser.NavigationHandle.Natives
    public void removeRequestHeader(long nativeNavigationHandleProxy, String headerName) {
        GEN_JNI.org_chromium_content_1public_browser_NavigationHandle_removeRequestHeader(nativeNavigationHandleProxy, headerName);
    }

    public static NavigationHandle.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            NavigationHandle.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content_public.browser.NavigationHandle.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new NavigationHandleJni();
    }
}
