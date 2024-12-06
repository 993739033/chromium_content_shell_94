package org.chromium.midi;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.midi.MidiManagerAndroid;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class MidiManagerAndroidJni implements MidiManagerAndroid.Natives {
    public static final JniStaticTestMocker<MidiManagerAndroid.Natives> TEST_HOOKS = new JniStaticTestMocker<MidiManagerAndroid.Natives>() { // from class: org.chromium.midi.MidiManagerAndroidJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(MidiManagerAndroid.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                MidiManagerAndroid.Natives unused = MidiManagerAndroidJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static MidiManagerAndroid.Natives testInstance;

    MidiManagerAndroidJni() {
    }

    @Override // org.chromium.midi.MidiManagerAndroid.Natives
    public void onInitialized(long nativeMidiManagerAndroid, MidiDeviceAndroid[] devices) {
        GEN_JNI.org_chromium_midi_MidiManagerAndroid_onInitialized(nativeMidiManagerAndroid, devices);
    }

    @Override // org.chromium.midi.MidiManagerAndroid.Natives
    public void onInitializationFailed(long nativeMidiManagerAndroid) {
        GEN_JNI.org_chromium_midi_MidiManagerAndroid_onInitializationFailed(nativeMidiManagerAndroid);
    }

    @Override // org.chromium.midi.MidiManagerAndroid.Natives
    public void onAttached(long nativeMidiManagerAndroid, MidiDeviceAndroid device) {
        GEN_JNI.org_chromium_midi_MidiManagerAndroid_onAttached(nativeMidiManagerAndroid, device);
    }

    @Override // org.chromium.midi.MidiManagerAndroid.Natives
    public void onDetached(long nativeMidiManagerAndroid, MidiDeviceAndroid device) {
        GEN_JNI.org_chromium_midi_MidiManagerAndroid_onDetached(nativeMidiManagerAndroid, device);
    }

    public static MidiManagerAndroid.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            MidiManagerAndroid.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.midi.MidiManagerAndroid.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new MidiManagerAndroidJni();
    }
}
