package org.chromium.content.browser;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content.browser.AppWebMessagePort;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class AppWebMessagePortJni implements AppWebMessagePort.Natives {
    public static final JniStaticTestMocker<AppWebMessagePort.Natives> TEST_HOOKS = new JniStaticTestMocker<AppWebMessagePort.Natives>() { // from class: org.chromium.content.browser.AppWebMessagePortJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(AppWebMessagePort.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                AppWebMessagePort.Natives unused = AppWebMessagePortJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static AppWebMessagePort.Natives testInstance;

    AppWebMessagePortJni() {
    }

    @Override // org.chromium.content.browser.AppWebMessagePort.Natives
    public String decodeStringMessage(byte[] encodedData) {
        return GEN_JNI.org_chromium_content_browser_AppWebMessagePort_decodeStringMessage(encodedData);
    }

    @Override // org.chromium.content.browser.AppWebMessagePort.Natives
    public byte[] encodeStringMessage(String message) {
        return GEN_JNI.org_chromium_content_browser_AppWebMessagePort_encodeStringMessage(message);
    }

    public static AppWebMessagePort.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            AppWebMessagePort.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.AppWebMessagePort.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new AppWebMessagePortJni();
    }
}
