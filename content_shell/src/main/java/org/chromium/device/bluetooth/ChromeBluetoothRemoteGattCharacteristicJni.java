package org.chromium.device.bluetooth;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.device.bluetooth.ChromeBluetoothRemoteGattCharacteristic;
import org.chromium.device.bluetooth.Wrappers;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ChromeBluetoothRemoteGattCharacteristicJni implements ChromeBluetoothRemoteGattCharacteristic.Natives {
    public static final JniStaticTestMocker<ChromeBluetoothRemoteGattCharacteristic.Natives> TEST_HOOKS = new JniStaticTestMocker<ChromeBluetoothRemoteGattCharacteristic.Natives>() { // from class: org.chromium.device.bluetooth.ChromeBluetoothRemoteGattCharacteristicJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(ChromeBluetoothRemoteGattCharacteristic.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                ChromeBluetoothRemoteGattCharacteristic.Natives unused = ChromeBluetoothRemoteGattCharacteristicJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static ChromeBluetoothRemoteGattCharacteristic.Natives testInstance;

    ChromeBluetoothRemoteGattCharacteristicJni() {
    }

    @Override // org.chromium.device.bluetooth.ChromeBluetoothRemoteGattCharacteristic.Natives
    public void onChanged(long nativeBluetoothRemoteGattCharacteristicAndroid, ChromeBluetoothRemoteGattCharacteristic caller, byte[] value) {
        GEN_JNI.org_chromium_device_bluetooth_ChromeBluetoothRemoteGattCharacteristic_onChanged(nativeBluetoothRemoteGattCharacteristicAndroid, caller, value);
    }

    @Override // org.chromium.device.bluetooth.ChromeBluetoothRemoteGattCharacteristic.Natives
    public void onRead(long nativeBluetoothRemoteGattCharacteristicAndroid, ChromeBluetoothRemoteGattCharacteristic caller, int status, byte[] value) {
        GEN_JNI.org_chromium_device_bluetooth_ChromeBluetoothRemoteGattCharacteristic_onRead(nativeBluetoothRemoteGattCharacteristicAndroid, caller, status, value);
    }

    @Override // org.chromium.device.bluetooth.ChromeBluetoothRemoteGattCharacteristic.Natives
    public void onWrite(long nativeBluetoothRemoteGattCharacteristicAndroid, ChromeBluetoothRemoteGattCharacteristic caller, int status) {
        GEN_JNI.org_chromium_device_bluetooth_ChromeBluetoothRemoteGattCharacteristic_onWrite(nativeBluetoothRemoteGattCharacteristicAndroid, caller, status);
    }

    @Override // org.chromium.device.bluetooth.ChromeBluetoothRemoteGattCharacteristic.Natives
    public void createGattRemoteDescriptor(long nativeBluetoothRemoteGattCharacteristicAndroid, ChromeBluetoothRemoteGattCharacteristic caller, String instanceId, Wrappers.BluetoothGattDescriptorWrapper descriptorWrapper, ChromeBluetoothDevice chromeBluetoothDevice) {
        GEN_JNI.org_chromium_device_bluetooth_ChromeBluetoothRemoteGattCharacteristic_createGattRemoteDescriptor(nativeBluetoothRemoteGattCharacteristicAndroid, caller, instanceId, descriptorWrapper, chromeBluetoothDevice);
    }

    public static ChromeBluetoothRemoteGattCharacteristic.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            ChromeBluetoothRemoteGattCharacteristic.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.device.bluetooth.ChromeBluetoothRemoteGattCharacteristic.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new ChromeBluetoothRemoteGattCharacteristicJni();
    }
}
