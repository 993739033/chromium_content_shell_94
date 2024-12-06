package org.chromium.midi;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.midi.UsbMidiDeviceAndroid;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class UsbMidiDeviceAndroidJni implements UsbMidiDeviceAndroid.Natives {
    public static final JniStaticTestMocker<UsbMidiDeviceAndroid.Natives> TEST_HOOKS = new JniStaticTestMocker<UsbMidiDeviceAndroid.Natives>() { // from class: org.chromium.midi.UsbMidiDeviceAndroidJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(UsbMidiDeviceAndroid.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                UsbMidiDeviceAndroid.Natives unused = UsbMidiDeviceAndroidJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static UsbMidiDeviceAndroid.Natives testInstance;

    UsbMidiDeviceAndroidJni() {
    }

    @Override // org.chromium.midi.UsbMidiDeviceAndroid.Natives
    public void onData(long nativeUsbMidiDeviceAndroid, int endpointNumber, byte[] data) {
        GEN_JNI.org_chromium_midi_UsbMidiDeviceAndroid_onData(nativeUsbMidiDeviceAndroid, endpointNumber, data);
    }

    public static UsbMidiDeviceAndroid.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            UsbMidiDeviceAndroid.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.midi.UsbMidiDeviceAndroid.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new UsbMidiDeviceAndroidJni();
    }
}
