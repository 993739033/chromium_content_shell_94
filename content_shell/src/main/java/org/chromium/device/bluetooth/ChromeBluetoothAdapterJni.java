package org.chromium.device.bluetooth;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.device.bluetooth.ChromeBluetoothAdapter;
import org.chromium.device.bluetooth.Wrappers;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ChromeBluetoothAdapterJni implements ChromeBluetoothAdapter.Natives {
    public static final JniStaticTestMocker<ChromeBluetoothAdapter.Natives> TEST_HOOKS = new JniStaticTestMocker<ChromeBluetoothAdapter.Natives>() { // from class: org.chromium.device.bluetooth.ChromeBluetoothAdapterJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(ChromeBluetoothAdapter.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                ChromeBluetoothAdapter.Natives unused = ChromeBluetoothAdapterJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static ChromeBluetoothAdapter.Natives testInstance;

    ChromeBluetoothAdapterJni() {
    }

    @Override // org.chromium.device.bluetooth.ChromeBluetoothAdapter.Natives
    public void onScanFailed(long nativeBluetoothAdapterAndroid, ChromeBluetoothAdapter caller) {
        GEN_JNI.org_chromium_device_bluetooth_ChromeBluetoothAdapter_onScanFailed(nativeBluetoothAdapterAndroid, caller);
    }

    @Override // org.chromium.device.bluetooth.ChromeBluetoothAdapter.Natives
    public void createOrUpdateDeviceOnScan(long nativeBluetoothAdapterAndroid, ChromeBluetoothAdapter caller, String address, Wrappers.BluetoothDeviceWrapper deviceWrapper, String localName, int rssi, String[] advertisedUuids, int txPower, String[] serviceDataKeys, Object[] serviceDataValues, int[] manufacturerDataKeys, Object[] manufacturerDataValues, int advertiseFlags) {
        GEN_JNI.org_chromium_device_bluetooth_ChromeBluetoothAdapter_createOrUpdateDeviceOnScan(nativeBluetoothAdapterAndroid, caller, address, deviceWrapper, localName, rssi, advertisedUuids, txPower, serviceDataKeys, serviceDataValues, manufacturerDataKeys, manufacturerDataValues, advertiseFlags);
    }

    @Override // org.chromium.device.bluetooth.ChromeBluetoothAdapter.Natives
    public void onAdapterStateChanged(long nativeBluetoothAdapterAndroid, ChromeBluetoothAdapter caller, boolean powered) {
        GEN_JNI.org_chromium_device_bluetooth_ChromeBluetoothAdapter_onAdapterStateChanged(nativeBluetoothAdapterAndroid, caller, powered);
    }

    public static ChromeBluetoothAdapter.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            ChromeBluetoothAdapter.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.device.bluetooth.ChromeBluetoothAdapter.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new ChromeBluetoothAdapterJni();
    }
}
