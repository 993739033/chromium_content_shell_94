package org.chromium.content.browser;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content.browser.GestureListenerManagerImpl;
import org.chromium.content.browser.webcontents.WebContentsImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class GestureListenerManagerImplJni implements GestureListenerManagerImpl.Natives {
    public static final JniStaticTestMocker<GestureListenerManagerImpl.Natives> TEST_HOOKS = new JniStaticTestMocker<GestureListenerManagerImpl.Natives>() { // from class: org.chromium.content.browser.GestureListenerManagerImplJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(GestureListenerManagerImpl.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                GestureListenerManagerImpl.Natives unused = GestureListenerManagerImplJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static GestureListenerManagerImpl.Natives testInstance;

    GestureListenerManagerImplJni() {
    }

    @Override // org.chromium.content.browser.GestureListenerManagerImpl.Natives
    public long init(GestureListenerManagerImpl caller, WebContentsImpl webContents) {
        return GEN_JNI.org_chromium_content_browser_GestureListenerManagerImpl_init(caller, webContents);
    }

    @Override // org.chromium.content.browser.GestureListenerManagerImpl.Natives
    public void resetGestureDetection(long nativeGestureListenerManager, GestureListenerManagerImpl caller) {
        GEN_JNI.org_chromium_content_browser_GestureListenerManagerImpl_resetGestureDetection(nativeGestureListenerManager, caller);
    }

    @Override // org.chromium.content.browser.GestureListenerManagerImpl.Natives
    public void setDoubleTapSupportEnabled(long nativeGestureListenerManager, GestureListenerManagerImpl caller, boolean enabled) {
        GEN_JNI.org_chromium_content_browser_GestureListenerManagerImpl_setDoubleTapSupportEnabled(nativeGestureListenerManager, caller, enabled);
    }

    @Override // org.chromium.content.browser.GestureListenerManagerImpl.Natives
    public void setMultiTouchZoomSupportEnabled(long nativeGestureListenerManager, GestureListenerManagerImpl caller, boolean enabled) {
        GEN_JNI.org_chromium_content_browser_GestureListenerManagerImpl_setMultiTouchZoomSupportEnabled(nativeGestureListenerManager, caller, enabled);
    }

    @Override // org.chromium.content.browser.GestureListenerManagerImpl.Natives
    public void setHasListenersAttached(long nativeGestureListenerManager, boolean hasListeners) {
        GEN_JNI.org_chromium_content_browser_GestureListenerManagerImpl_setHasListenersAttached(nativeGestureListenerManager, hasListeners);
    }

    public static GestureListenerManagerImpl.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            GestureListenerManagerImpl.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.GestureListenerManagerImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new GestureListenerManagerImplJni();
    }
}
