package org.chromium.content_shell;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_shell.ShellManager;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ShellManagerJni implements ShellManager.Natives {
    public static final JniStaticTestMocker<ShellManager.Natives> TEST_HOOKS = new JniStaticTestMocker<ShellManager.Natives>() { // from class: org.chromium.content_shell.ShellManagerJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(ShellManager.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                ShellManager.Natives unused = ShellManagerJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static ShellManager.Natives testInstance;

    ShellManagerJni() {
    }

    @Override // org.chromium.content_shell.ShellManager.Natives
    public void init(Object shellManagerInstance) {
        GEN_JNI.org_chromium_content_1shell_ShellManager_init(shellManagerInstance);
    }

    @Override // org.chromium.content_shell.ShellManager.Natives
    public void launchShell(String url) {
        GEN_JNI.org_chromium_content_1shell_ShellManager_launchShell(url);
    }

    public static ShellManager.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            ShellManager.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content_shell.ShellManager.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new ShellManagerJni();
    }
}
