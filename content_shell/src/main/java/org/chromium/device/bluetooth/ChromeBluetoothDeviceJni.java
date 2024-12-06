package org.chromium.device.bluetooth;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.device.bluetooth.ChromeBluetoothDevice;
import org.chromium.device.bluetooth.Wrappers;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ChromeBluetoothDeviceJni implements ChromeBluetoothDevice.Natives {
    public static final JniStaticTestMocker<ChromeBluetoothDevice.Natives> TEST_HOOKS = new JniStaticTestMocker<ChromeBluetoothDevice.Natives>() { // from class: org.chromium.device.bluetooth.ChromeBluetoothDeviceJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(ChromeBluetoothDevice.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                ChromeBluetoothDevice.Natives unused = ChromeBluetoothDeviceJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static ChromeBluetoothDevice.Natives testInstance;

    ChromeBluetoothDeviceJni() {
    }

    @Override // org.chromium.device.bluetooth.ChromeBluetoothDevice.Natives
    public void onConnectionStateChange(long nativeBluetoothDeviceAndroid, ChromeBluetoothDevice caller, int status, boolean connected) {
        GEN_JNI.org_chromium_device_bluetooth_ChromeBluetoothDevice_onConnectionStateChange(nativeBluetoothDeviceAndroid, caller, status, connected);
    }

    @Override // org.chromium.device.bluetooth.ChromeBluetoothDevice.Natives
    public void createGattRemoteService(long nativeBluetoothDeviceAndroid, ChromeBluetoothDevice caller, String instanceId, Wrappers.BluetoothGattServiceWrapper serviceWrapper) {
        GEN_JNI.org_chromium_device_bluetooth_ChromeBluetoothDevice_createGattRemoteService(nativeBluetoothDeviceAndroid, caller, instanceId, serviceWrapper);
    }

    @Override // org.chromium.device.bluetooth.ChromeBluetoothDevice.Natives
    public void onGattServicesDiscovered(long nativeBluetoothDeviceAndroid, ChromeBluetoothDevice caller) {
        GEN_JNI.org_chromium_device_bluetooth_ChromeBluetoothDevice_onGattServicesDiscovered(nativeBluetoothDeviceAndroid, caller);
    }

    public static ChromeBluetoothDevice.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            ChromeBluetoothDevice.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.device.bluetooth.ChromeBluetoothDevice.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new ChromeBluetoothDeviceJni();
    }
}
