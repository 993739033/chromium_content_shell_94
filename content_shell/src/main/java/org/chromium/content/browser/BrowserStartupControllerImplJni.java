package org.chromium.content.browser;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content.browser.BrowserStartupControllerImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class BrowserStartupControllerImplJni implements BrowserStartupControllerImpl.Natives {
    public static final JniStaticTestMocker<BrowserStartupControllerImpl.Natives> TEST_HOOKS = new JniStaticTestMocker<BrowserStartupControllerImpl.Natives>() { // from class: org.chromium.content.browser.BrowserStartupControllerImplJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(BrowserStartupControllerImpl.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                BrowserStartupControllerImpl.Natives unused = BrowserStartupControllerImplJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static BrowserStartupControllerImpl.Natives testInstance;

    BrowserStartupControllerImplJni() {
    }

    @Override // org.chromium.content.browser.BrowserStartupControllerImpl.Natives
    public void setCommandLineFlags(boolean singleProcess) {
        GEN_JNI.org_chromium_content_browser_BrowserStartupControllerImpl_setCommandLineFlags(singleProcess);
    }

    @Override // org.chromium.content.browser.BrowserStartupControllerImpl.Natives
    public void flushStartupTasks() {
        GEN_JNI.org_chromium_content_browser_BrowserStartupControllerImpl_flushStartupTasks();
    }

    public static BrowserStartupControllerImpl.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            BrowserStartupControllerImpl.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.BrowserStartupControllerImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new BrowserStartupControllerImplJni();
    }
}
