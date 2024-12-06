package org.chromium.midi;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.midi.MidiInputPortAndroid;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class MidiInputPortAndroidJni implements MidiInputPortAndroid.Natives {
    public static final JniStaticTestMocker<MidiInputPortAndroid.Natives> TEST_HOOKS = new JniStaticTestMocker<MidiInputPortAndroid.Natives>() { // from class: org.chromium.midi.MidiInputPortAndroidJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(MidiInputPortAndroid.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                MidiInputPortAndroid.Natives unused = MidiInputPortAndroidJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static MidiInputPortAndroid.Natives testInstance;

    MidiInputPortAndroidJni() {
    }

    @Override // org.chromium.midi.MidiInputPortAndroid.Natives
    public void onData(long nativeMidiInputPortAndroid, byte[] bs, int offset, int count, long timestamp) {
        GEN_JNI.org_chromium_midi_MidiInputPortAndroid_onData(nativeMidiInputPortAndroid, bs, offset, count, timestamp);
    }

    public static MidiInputPortAndroid.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            MidiInputPortAndroid.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.midi.MidiInputPortAndroid.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new MidiInputPortAndroidJni();
    }
}
