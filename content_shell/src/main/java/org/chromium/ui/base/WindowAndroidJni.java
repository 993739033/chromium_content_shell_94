package org.chromium.ui.base;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.ui.base.WindowAndroid;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class WindowAndroidJni implements WindowAndroid.Natives {
    public static final JniStaticTestMocker<WindowAndroid.Natives> TEST_HOOKS = new JniStaticTestMocker<WindowAndroid.Natives>() { // from class: org.chromium.ui.base.WindowAndroidJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(WindowAndroid.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                WindowAndroid.Natives unused = WindowAndroidJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static WindowAndroid.Natives testInstance;

    WindowAndroidJni() {
    }

    @Override // org.chromium.ui.base.WindowAndroid.Natives
    public long init(WindowAndroid caller, int displayId, float scrollFactor, boolean windowIsWideColorGamut) {
        return GEN_JNI.org_chromium_ui_base_WindowAndroid_init(caller, displayId, scrollFactor, windowIsWideColorGamut);
    }

    @Override // org.chromium.ui.base.WindowAndroid.Natives
    public void onVisibilityChanged(long nativeWindowAndroid, WindowAndroid caller, boolean visible) {
        GEN_JNI.org_chromium_ui_base_WindowAndroid_onVisibilityChanged(nativeWindowAndroid, caller, visible);
    }

    @Override // org.chromium.ui.base.WindowAndroid.Natives
    public void onActivityStopped(long nativeWindowAndroid, WindowAndroid caller) {
        GEN_JNI.org_chromium_ui_base_WindowAndroid_onActivityStopped(nativeWindowAndroid, caller);
    }

    @Override // org.chromium.ui.base.WindowAndroid.Natives
    public void onActivityStarted(long nativeWindowAndroid, WindowAndroid caller) {
        GEN_JNI.org_chromium_ui_base_WindowAndroid_onActivityStarted(nativeWindowAndroid, caller);
    }

    @Override // org.chromium.ui.base.WindowAndroid.Natives
    public void setVSyncPaused(long nativeWindowAndroid, WindowAndroid caller, boolean paused) {
        GEN_JNI.org_chromium_ui_base_WindowAndroid_setVSyncPaused(nativeWindowAndroid, caller, paused);
    }

    @Override // org.chromium.ui.base.WindowAndroid.Natives
    public void onUpdateRefreshRate(long nativeWindowAndroid, WindowAndroid caller, float refreshRate) {
        GEN_JNI.org_chromium_ui_base_WindowAndroid_onUpdateRefreshRate(nativeWindowAndroid, caller, refreshRate);
    }

    @Override // org.chromium.ui.base.WindowAndroid.Natives
    public void destroy(long nativeWindowAndroid, WindowAndroid caller) {
        GEN_JNI.org_chromium_ui_base_WindowAndroid_destroy(nativeWindowAndroid, caller);
    }

    @Override // org.chromium.ui.base.WindowAndroid.Natives
    public void onSupportedRefreshRatesUpdated(long nativeWindowAndroid, WindowAndroid caller, float[] supportedRefreshRates) {
        GEN_JNI.org_chromium_ui_base_WindowAndroid_onSupportedRefreshRatesUpdated(nativeWindowAndroid, caller, supportedRefreshRates);
    }

    public static WindowAndroid.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            WindowAndroid.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.ui.base.WindowAndroid.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new WindowAndroidJni();
    }
}
