package org.chromium.content.browser;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content.browser.AppWebMessagePortDescriptor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class AppWebMessagePortDescriptorJni implements AppWebMessagePortDescriptor.Native {
    public static final JniStaticTestMocker<AppWebMessagePortDescriptor.Native> TEST_HOOKS = new JniStaticTestMocker<AppWebMessagePortDescriptor.Native>() { // from class: org.chromium.content.browser.AppWebMessagePortDescriptorJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(AppWebMessagePortDescriptor.Native instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                AppWebMessagePortDescriptor.Native unused = AppWebMessagePortDescriptorJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static AppWebMessagePortDescriptor.Native testInstance;

    AppWebMessagePortDescriptorJni() {
    }

    @Override // org.chromium.content.browser.AppWebMessagePortDescriptor.Native
    public long[] createPair() {
        return GEN_JNI.org_chromium_content_browser_AppWebMessagePortDescriptor_createPair();
    }

    @Override // org.chromium.content.browser.AppWebMessagePortDescriptor.Native
    public long create(int nativeHandle, long idLow, long idHigh, long sequenceNumber) {
        return GEN_JNI.org_chromium_content_browser_AppWebMessagePortDescriptor_create(nativeHandle, idLow, idHigh, sequenceNumber);
    }

    @Override // org.chromium.content.browser.AppWebMessagePortDescriptor.Native
    public int takeHandleToEntangle(long blinkMessagePortDescriptor) {
        return GEN_JNI.org_chromium_content_browser_AppWebMessagePortDescriptor_takeHandleToEntangle(blinkMessagePortDescriptor);
    }

    @Override // org.chromium.content.browser.AppWebMessagePortDescriptor.Native
    public void giveDisentangledHandle(long blinkMessagePortDescriptor, int nativeHandle) {
        GEN_JNI.org_chromium_content_browser_AppWebMessagePortDescriptor_giveDisentangledHandle(blinkMessagePortDescriptor, nativeHandle);
    }

    @Override // org.chromium.content.browser.AppWebMessagePortDescriptor.Native
    public void onConnectionError(long blinkMessagePortDescriptor) {
        GEN_JNI.org_chromium_content_browser_AppWebMessagePortDescriptor_onConnectionError(blinkMessagePortDescriptor);
    }

    @Override // org.chromium.content.browser.AppWebMessagePortDescriptor.Native
    public long[] passSerialized(long blinkMessagePortDescriptor) {
        return GEN_JNI.org_chromium_content_browser_AppWebMessagePortDescriptor_passSerialized(blinkMessagePortDescriptor);
    }

    @Override // org.chromium.content.browser.AppWebMessagePortDescriptor.Native
    public void closeAndDestroy(long blinkMessagePortDescriptor) {
        GEN_JNI.org_chromium_content_browser_AppWebMessagePortDescriptor_closeAndDestroy(blinkMessagePortDescriptor);
    }

    @Override // org.chromium.content.browser.AppWebMessagePortDescriptor.Native
    public void disentangleCloseAndDestroy(long blinkMessagePortDescriptor) {
        GEN_JNI.org_chromium_content_browser_AppWebMessagePortDescriptor_disentangleCloseAndDestroy(blinkMessagePortDescriptor);
    }

    public static AppWebMessagePortDescriptor.Native get() {
        if (GEN_JNI.TESTING_ENABLED) {
            AppWebMessagePortDescriptor.Native r0 = testInstance;
            if (r0 != null) {
                return r0;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.AppWebMessagePortDescriptor.Native. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new AppWebMessagePortDescriptorJni();
    }
}
