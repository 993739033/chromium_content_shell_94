package org.chromium.components.variations;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.components.variations.VariationsAssociatedData;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class VariationsAssociatedDataJni implements VariationsAssociatedData.Natives {
    public static final JniStaticTestMocker<VariationsAssociatedData.Natives> TEST_HOOKS = new JniStaticTestMocker<VariationsAssociatedData.Natives>() { // from class: org.chromium.components.variations.VariationsAssociatedDataJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(VariationsAssociatedData.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                VariationsAssociatedData.Natives unused = VariationsAssociatedDataJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static VariationsAssociatedData.Natives testInstance;

    VariationsAssociatedDataJni() {
    }

    @Override // org.chromium.components.variations.VariationsAssociatedData.Natives
    public String getVariationParamValue(String trialName, String paramName) {
        return GEN_JNI.org_chromium_components_variations_VariationsAssociatedData_getVariationParamValue(trialName, paramName);
    }

    @Override // org.chromium.components.variations.VariationsAssociatedData.Natives
    public String getFeedbackVariations() {
        return GEN_JNI.org_chromium_components_variations_VariationsAssociatedData_getFeedbackVariations();
    }

    @Override // org.chromium.components.variations.VariationsAssociatedData.Natives
    public String getGoogleAppVariations() {
        return GEN_JNI.org_chromium_components_variations_VariationsAssociatedData_getGoogleAppVariations();
    }

    public static VariationsAssociatedData.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            VariationsAssociatedData.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.variations.VariationsAssociatedData.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new VariationsAssociatedDataJni();
    }
}
