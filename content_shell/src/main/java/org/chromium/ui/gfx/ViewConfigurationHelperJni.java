package org.chromium.ui.gfx;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.ui.gfx.ViewConfigurationHelper;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ViewConfigurationHelperJni implements ViewConfigurationHelper.Natives {
    public static final JniStaticTestMocker<ViewConfigurationHelper.Natives> TEST_HOOKS = new JniStaticTestMocker<ViewConfigurationHelper.Natives>() { // from class: org.chromium.ui.gfx.ViewConfigurationHelperJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(ViewConfigurationHelper.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                ViewConfigurationHelper.Natives unused = ViewConfigurationHelperJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static ViewConfigurationHelper.Natives testInstance;

    ViewConfigurationHelperJni() {
    }

    @Override // org.chromium.ui.gfx.ViewConfigurationHelper.Natives
    public void updateSharedViewConfiguration(ViewConfigurationHelper caller, float maximumFlingVelocity, float minimumFlingVelocity, float touchSlop, float doubleTapSlop, float minScalingSpan) {
        GEN_JNI.org_chromium_ui_gfx_ViewConfigurationHelper_updateSharedViewConfiguration(caller, maximumFlingVelocity, minimumFlingVelocity, touchSlop, doubleTapSlop, minScalingSpan);
    }

    public static ViewConfigurationHelper.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            ViewConfigurationHelper.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.ui.gfx.ViewConfigurationHelper.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new ViewConfigurationHelperJni();
    }
}
