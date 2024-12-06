package org.chromium.ui.base;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.ui.base.LocalizationUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class LocalizationUtilsJni implements LocalizationUtils.Natives {
    public static final JniStaticTestMocker<LocalizationUtils.Natives> TEST_HOOKS = new JniStaticTestMocker<LocalizationUtils.Natives>() { // from class: org.chromium.ui.base.LocalizationUtilsJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(LocalizationUtils.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                LocalizationUtils.Natives unused = LocalizationUtilsJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static LocalizationUtils.Natives testInstance;

    LocalizationUtilsJni() {
    }

    @Override // org.chromium.ui.base.LocalizationUtils.Natives
    public int getFirstStrongCharacterDirection(String string) {
        return GEN_JNI.org_chromium_ui_base_LocalizationUtils_getFirstStrongCharacterDirection(string);
    }

    @Override // org.chromium.ui.base.LocalizationUtils.Natives
    public String getNativeUiLocale() {
        return GEN_JNI.org_chromium_ui_base_LocalizationUtils_getNativeUiLocale();
    }

    public static LocalizationUtils.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            LocalizationUtils.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.ui.base.LocalizationUtils.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new LocalizationUtilsJni();
    }
}
