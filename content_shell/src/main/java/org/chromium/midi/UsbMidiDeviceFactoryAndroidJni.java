package org.chromium.midi;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.midi.UsbMidiDeviceFactoryAndroid;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class UsbMidiDeviceFactoryAndroidJni implements UsbMidiDeviceFactoryAndroid.Natives {
    public static final JniStaticTestMocker<UsbMidiDeviceFactoryAndroid.Natives> TEST_HOOKS = new JniStaticTestMocker<UsbMidiDeviceFactoryAndroid.Natives>() { // from class: org.chromium.midi.UsbMidiDeviceFactoryAndroidJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(UsbMidiDeviceFactoryAndroid.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                UsbMidiDeviceFactoryAndroid.Natives unused = UsbMidiDeviceFactoryAndroidJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static UsbMidiDeviceFactoryAndroid.Natives testInstance;

    UsbMidiDeviceFactoryAndroidJni() {
    }

    @Override // org.chromium.midi.UsbMidiDeviceFactoryAndroid.Natives
    public void onUsbMidiDeviceRequestDone(long nativeUsbMidiDeviceFactoryAndroid, Object[] devices) {
        GEN_JNI.org_chromium_midi_UsbMidiDeviceFactoryAndroid_onUsbMidiDeviceRequestDone(nativeUsbMidiDeviceFactoryAndroid, devices);
    }

    @Override // org.chromium.midi.UsbMidiDeviceFactoryAndroid.Natives
    public void onUsbMidiDeviceAttached(long nativeUsbMidiDeviceFactoryAndroid, Object device) {
        GEN_JNI.org_chromium_midi_UsbMidiDeviceFactoryAndroid_onUsbMidiDeviceAttached(nativeUsbMidiDeviceFactoryAndroid, device);
    }

    @Override // org.chromium.midi.UsbMidiDeviceFactoryAndroid.Natives
    public void onUsbMidiDeviceDetached(long nativeUsbMidiDeviceFactoryAndroid, int index) {
        GEN_JNI.org_chromium_midi_UsbMidiDeviceFactoryAndroid_onUsbMidiDeviceDetached(nativeUsbMidiDeviceFactoryAndroid, index);
    }

    public static UsbMidiDeviceFactoryAndroid.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            UsbMidiDeviceFactoryAndroid.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.midi.UsbMidiDeviceFactoryAndroid.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new UsbMidiDeviceFactoryAndroidJni();
    }
}
