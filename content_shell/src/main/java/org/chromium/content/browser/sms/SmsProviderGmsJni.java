package org.chromium.content.browser.sms;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content.browser.sms.SmsProviderGms;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class SmsProviderGmsJni implements SmsProviderGms.Natives {
    public static final JniStaticTestMocker<SmsProviderGms.Natives> TEST_HOOKS = new JniStaticTestMocker<SmsProviderGms.Natives>() { // from class: org.chromium.content.browser.sms.SmsProviderGmsJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(SmsProviderGms.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                SmsProviderGms.Natives unused = SmsProviderGmsJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static SmsProviderGms.Natives testInstance;

    SmsProviderGmsJni() {
    }

    @Override // org.chromium.content.browser.sms.SmsProviderGms.Natives
    public void onReceive(long nativeSmsProviderGms, String sms, int backend) {
        GEN_JNI.org_chromium_content_browser_sms_SmsProviderGms_onReceive(nativeSmsProviderGms, sms, backend);
    }

    @Override // org.chromium.content.browser.sms.SmsProviderGms.Natives
    public void onTimeout(long nativeSmsProviderGms) {
        GEN_JNI.org_chromium_content_browser_sms_SmsProviderGms_onTimeout(nativeSmsProviderGms);
    }

    @Override // org.chromium.content.browser.sms.SmsProviderGms.Natives
    public void onCancel(long nativeSmsProviderGms) {
        GEN_JNI.org_chromium_content_browser_sms_SmsProviderGms_onCancel(nativeSmsProviderGms);
    }

    @Override // org.chromium.content.browser.sms.SmsProviderGms.Natives
    public void onNotAvailable(long nativeSmsProviderGms) {
        GEN_JNI.org_chromium_content_browser_sms_SmsProviderGms_onNotAvailable(nativeSmsProviderGms);
    }

    public static SmsProviderGms.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            SmsProviderGms.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.sms.SmsProviderGms.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new SmsProviderGmsJni();
    }
}
