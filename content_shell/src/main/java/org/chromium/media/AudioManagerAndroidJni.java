package org.chromium.media;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.media.AudioManagerAndroid;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class AudioManagerAndroidJni implements AudioManagerAndroid.Natives {
    public static final JniStaticTestMocker<AudioManagerAndroid.Natives> TEST_HOOKS = new JniStaticTestMocker<AudioManagerAndroid.Natives>() { // from class: org.chromium.media.AudioManagerAndroidJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(AudioManagerAndroid.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                AudioManagerAndroid.Natives unused = AudioManagerAndroidJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static AudioManagerAndroid.Natives testInstance;

    AudioManagerAndroidJni() {
    }

    @Override // org.chromium.media.AudioManagerAndroid.Natives
    public void setMute(long nativeAudioManagerAndroid, AudioManagerAndroid caller, boolean muted) {
        GEN_JNI.org_chromium_media_AudioManagerAndroid_setMute(nativeAudioManagerAndroid, caller, muted);
    }

    public static AudioManagerAndroid.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            AudioManagerAndroid.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.media.AudioManagerAndroid.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new AudioManagerAndroidJni();
    }
}
