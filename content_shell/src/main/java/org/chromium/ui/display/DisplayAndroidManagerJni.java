package org.chromium.ui.display;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.ui.display.DisplayAndroidManager;
/* JADX INFO: Access modifiers changed from: package-private */
@MainDex
/* loaded from: classes2.dex */
public class DisplayAndroidManagerJni implements DisplayAndroidManager.Natives {
    public static final JniStaticTestMocker<DisplayAndroidManager.Natives> TEST_HOOKS = new JniStaticTestMocker<DisplayAndroidManager.Natives>() { // from class: org.chromium.ui.display.DisplayAndroidManagerJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(DisplayAndroidManager.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                DisplayAndroidManager.Natives unused = DisplayAndroidManagerJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static DisplayAndroidManager.Natives testInstance;

    DisplayAndroidManagerJni() {
    }

    @Override // org.chromium.ui.display.DisplayAndroidManager.Natives
    public void updateDisplay(long nativeDisplayAndroidManager, DisplayAndroidManager caller, int sdkDisplayId, int width, int height, float dipScale, int rotationDegrees, int bitsPerPixel, int bitsPerComponent, boolean isWideColorGamut) {
        GEN_JNI.org_chromium_ui_display_DisplayAndroidManager_updateDisplay(nativeDisplayAndroidManager, caller, sdkDisplayId, width, height, dipScale, rotationDegrees, bitsPerPixel, bitsPerComponent, isWideColorGamut);
    }

    @Override // org.chromium.ui.display.DisplayAndroidManager.Natives
    public void removeDisplay(long nativeDisplayAndroidManager, DisplayAndroidManager caller, int sdkDisplayId) {
        GEN_JNI.org_chromium_ui_display_DisplayAndroidManager_removeDisplay(nativeDisplayAndroidManager, caller, sdkDisplayId);
    }

    @Override // org.chromium.ui.display.DisplayAndroidManager.Natives
    public void setPrimaryDisplayId(long nativeDisplayAndroidManager, DisplayAndroidManager caller, int sdkDisplayId) {
        GEN_JNI.org_chromium_ui_display_DisplayAndroidManager_setPrimaryDisplayId(nativeDisplayAndroidManager, caller, sdkDisplayId);
    }

    public static DisplayAndroidManager.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            DisplayAndroidManager.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.ui.display.DisplayAndroidManager.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(true);
        return new DisplayAndroidManagerJni();
    }
}
