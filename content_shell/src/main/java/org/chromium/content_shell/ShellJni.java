package org.chromium.content_shell;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_shell.Shell;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ShellJni implements Shell.Natives {
    public static final JniStaticTestMocker<Shell.Natives> TEST_HOOKS = new JniStaticTestMocker<Shell.Natives>() { // from class: org.chromium.content_shell.ShellJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(Shell.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                Shell.Natives unused = ShellJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static Shell.Natives testInstance;

    ShellJni() {
    }

    @Override // org.chromium.content_shell.Shell.Natives
    public void closeShell(long shellPtr) {
        GEN_JNI.org_chromium_content_1shell_Shell_closeShell(shellPtr);
    }

    public static Shell.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            Shell.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content_shell.Shell.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new ShellJni();
    }
}
