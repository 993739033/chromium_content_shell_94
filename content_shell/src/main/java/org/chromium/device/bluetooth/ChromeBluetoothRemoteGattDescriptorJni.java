package org.chromium.device.bluetooth;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.device.bluetooth.ChromeBluetoothRemoteGattDescriptor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ChromeBluetoothRemoteGattDescriptorJni implements ChromeBluetoothRemoteGattDescriptor.Natives {
    public static final JniStaticTestMocker<ChromeBluetoothRemoteGattDescriptor.Natives> TEST_HOOKS = new JniStaticTestMocker<ChromeBluetoothRemoteGattDescriptor.Natives>() { // from class: org.chromium.device.bluetooth.ChromeBluetoothRemoteGattDescriptorJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(ChromeBluetoothRemoteGattDescriptor.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                ChromeBluetoothRemoteGattDescriptor.Natives unused = ChromeBluetoothRemoteGattDescriptorJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static ChromeBluetoothRemoteGattDescriptor.Natives testInstance;

    ChromeBluetoothRemoteGattDescriptorJni() {
    }

    @Override // org.chromium.device.bluetooth.ChromeBluetoothRemoteGattDescriptor.Natives
    public void onRead(long nativeBluetoothRemoteGattDescriptorAndroid, ChromeBluetoothRemoteGattDescriptor caller, int status, byte[] value) {
        GEN_JNI.org_chromium_device_bluetooth_ChromeBluetoothRemoteGattDescriptor_onRead(nativeBluetoothRemoteGattDescriptorAndroid, caller, status, value);
    }

    @Override // org.chromium.device.bluetooth.ChromeBluetoothRemoteGattDescriptor.Natives
    public void onWrite(long nativeBluetoothRemoteGattDescriptorAndroid, ChromeBluetoothRemoteGattDescriptor caller, int status) {
        GEN_JNI.org_chromium_device_bluetooth_ChromeBluetoothRemoteGattDescriptor_onWrite(nativeBluetoothRemoteGattDescriptorAndroid, caller, status);
    }

    public static ChromeBluetoothRemoteGattDescriptor.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            ChromeBluetoothRemoteGattDescriptor.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.device.bluetooth.ChromeBluetoothRemoteGattDescriptor.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new ChromeBluetoothRemoteGattDescriptorJni();
    }
}
