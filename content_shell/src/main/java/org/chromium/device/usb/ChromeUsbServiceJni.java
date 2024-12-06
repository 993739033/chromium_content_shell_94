package org.chromium.device.usb;

import android.hardware.usb.UsbDevice;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.device.usb.ChromeUsbService;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ChromeUsbServiceJni implements ChromeUsbService.Natives {
    public static final JniStaticTestMocker<ChromeUsbService.Natives> TEST_HOOKS = new JniStaticTestMocker<ChromeUsbService.Natives>() { // from class: org.chromium.device.usb.ChromeUsbServiceJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(ChromeUsbService.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                ChromeUsbService.Natives unused = ChromeUsbServiceJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static ChromeUsbService.Natives testInstance;

    ChromeUsbServiceJni() {
    }

    @Override // org.chromium.device.usb.ChromeUsbService.Natives
    public void deviceAttached(long nativeUsbServiceAndroid, ChromeUsbService caller, UsbDevice device) {
        GEN_JNI.org_chromium_device_usb_ChromeUsbService_deviceAttached(nativeUsbServiceAndroid, caller, device);
    }

    @Override // org.chromium.device.usb.ChromeUsbService.Natives
    public void deviceDetached(long nativeUsbServiceAndroid, ChromeUsbService caller, int deviceId) {
        GEN_JNI.org_chromium_device_usb_ChromeUsbService_deviceDetached(nativeUsbServiceAndroid, caller, deviceId);
    }

    @Override // org.chromium.device.usb.ChromeUsbService.Natives
    public void devicePermissionRequestComplete(long nativeUsbServiceAndroid, ChromeUsbService caller, int deviceId, boolean granted) {
        GEN_JNI.org_chromium_device_usb_ChromeUsbService_devicePermissionRequestComplete(nativeUsbServiceAndroid, caller, deviceId, granted);
    }

    public static ChromeUsbService.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            ChromeUsbService.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.device.usb.ChromeUsbService.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new ChromeUsbServiceJni();
    }
}
