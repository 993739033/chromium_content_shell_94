package org.chromium.content.browser;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content.browser.ChildProcessLauncherHelperImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ChildProcessLauncherHelperImplJni implements ChildProcessLauncherHelperImpl.Natives {
    public static final JniStaticTestMocker<ChildProcessLauncherHelperImpl.Natives> TEST_HOOKS = new JniStaticTestMocker<ChildProcessLauncherHelperImpl.Natives>() { // from class: org.chromium.content.browser.ChildProcessLauncherHelperImplJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(ChildProcessLauncherHelperImpl.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                ChildProcessLauncherHelperImpl.Natives unused = ChildProcessLauncherHelperImplJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static ChildProcessLauncherHelperImpl.Natives testInstance;

    ChildProcessLauncherHelperImplJni() {
    }

    @Override // org.chromium.content.browser.ChildProcessLauncherHelperImpl.Natives
    public void onChildProcessStarted(long nativeChildProcessLauncherHelper, int pid) {
        GEN_JNI.org_chromium_content_browser_ChildProcessLauncherHelperImpl_onChildProcessStarted(nativeChildProcessLauncherHelper, pid);
    }

    @Override // org.chromium.content.browser.ChildProcessLauncherHelperImpl.Natives
    public void setTerminationInfo(long termiantionInfoPtr, int bindingState, boolean killedByUs, boolean cleanExit, boolean exceptionDuringInit, int reverseRank) {
        GEN_JNI.org_chromium_content_browser_ChildProcessLauncherHelperImpl_setTerminationInfo(termiantionInfoPtr, bindingState, killedByUs, cleanExit, exceptionDuringInit, reverseRank);
    }

    @Override // org.chromium.content.browser.ChildProcessLauncherHelperImpl.Natives
    public boolean serviceGroupImportanceEnabled() {
        return GEN_JNI.org_chromium_content_browser_ChildProcessLauncherHelperImpl_serviceGroupImportanceEnabled();
    }

    public static ChildProcessLauncherHelperImpl.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            ChildProcessLauncherHelperImpl.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.ChildProcessLauncherHelperImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new ChildProcessLauncherHelperImplJni();
    }
}
