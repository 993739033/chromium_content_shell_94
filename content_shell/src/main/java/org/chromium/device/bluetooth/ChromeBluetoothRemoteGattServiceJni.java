package org.chromium.device.bluetooth;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.device.bluetooth.ChromeBluetoothRemoteGattService;
import org.chromium.device.bluetooth.Wrappers;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ChromeBluetoothRemoteGattServiceJni implements ChromeBluetoothRemoteGattService.Natives {
    public static final JniStaticTestMocker<ChromeBluetoothRemoteGattService.Natives> TEST_HOOKS = new JniStaticTestMocker<ChromeBluetoothRemoteGattService.Natives>() { // from class: org.chromium.device.bluetooth.ChromeBluetoothRemoteGattServiceJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(ChromeBluetoothRemoteGattService.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                ChromeBluetoothRemoteGattService.Natives unused = ChromeBluetoothRemoteGattServiceJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static ChromeBluetoothRemoteGattService.Natives testInstance;

    ChromeBluetoothRemoteGattServiceJni() {
    }

    @Override // org.chromium.device.bluetooth.ChromeBluetoothRemoteGattService.Natives
    public void createGattRemoteCharacteristic(long nativeBluetoothRemoteGattServiceAndroid, ChromeBluetoothRemoteGattService caller, String instanceId, Wrappers.BluetoothGattCharacteristicWrapper characteristicWrapper, ChromeBluetoothDevice chromeBluetoothDevice) {
        GEN_JNI.org_chromium_device_bluetooth_ChromeBluetoothRemoteGattService_createGattRemoteCharacteristic(nativeBluetoothRemoteGattServiceAndroid, caller, instanceId, characteristicWrapper, chromeBluetoothDevice);
    }

    public static ChromeBluetoothRemoteGattService.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            ChromeBluetoothRemoteGattService.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.device.bluetooth.ChromeBluetoothRemoteGattService.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new ChromeBluetoothRemoteGattServiceJni();
    }
}
