package org.chromium.components.crash;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.components.crash.CrashKeys;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class CrashKeysJni implements CrashKeys.Natives {
    public static final JniStaticTestMocker<CrashKeys.Natives> TEST_HOOKS = new JniStaticTestMocker<CrashKeys.Natives>() { // from class: org.chromium.components.crash.CrashKeysJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(CrashKeys.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                CrashKeys.Natives unused = CrashKeysJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static CrashKeys.Natives testInstance;

    CrashKeysJni() {
    }

    @Override // org.chromium.components.crash.CrashKeys.Natives
    public void set(CrashKeys caller, int key, String value) {
        GEN_JNI.org_chromium_components_crash_CrashKeys_set(caller, key, value);
    }

    public static CrashKeys.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            CrashKeys.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.crash.CrashKeys.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new CrashKeysJni();
    }
}
