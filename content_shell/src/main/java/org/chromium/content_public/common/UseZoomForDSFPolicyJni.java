package org.chromium.content_public.common;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.common.UseZoomForDSFPolicy;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class UseZoomForDSFPolicyJni implements UseZoomForDSFPolicy.Natives {
    public static final JniStaticTestMocker<UseZoomForDSFPolicy.Natives> TEST_HOOKS = new JniStaticTestMocker<UseZoomForDSFPolicy.Natives>() { // from class: org.chromium.content_public.common.UseZoomForDSFPolicyJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(UseZoomForDSFPolicy.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                UseZoomForDSFPolicy.Natives unused = UseZoomForDSFPolicyJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static UseZoomForDSFPolicy.Natives testInstance;

    UseZoomForDSFPolicyJni() {
    }

    @Override // org.chromium.content_public.common.UseZoomForDSFPolicy.Natives
    public boolean isUseZoomForDSFEnabled() {
        return GEN_JNI.org_chromium_content_1public_common_UseZoomForDSFPolicy_isUseZoomForDSFEnabled();
    }

    public static UseZoomForDSFPolicy.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            UseZoomForDSFPolicy.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content_public.common.UseZoomForDSFPolicy.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new UseZoomForDSFPolicyJni();
    }
}
