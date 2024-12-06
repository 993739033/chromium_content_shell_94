package org.chromium.media;

import java.nio.ByteBuffer;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.media.AudioTrackOutputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class AudioTrackOutputStreamJni implements AudioTrackOutputStream.Natives {
    public static final JniStaticTestMocker<AudioTrackOutputStream.Natives> TEST_HOOKS = new JniStaticTestMocker<AudioTrackOutputStream.Natives>() { // from class: org.chromium.media.AudioTrackOutputStreamJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(AudioTrackOutputStream.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                AudioTrackOutputStream.Natives unused = AudioTrackOutputStreamJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static AudioTrackOutputStream.Natives testInstance;

    AudioTrackOutputStreamJni() {
    }

    @Override // org.chromium.media.AudioTrackOutputStream.Natives
    public AudioTrackOutputStream.AudioBufferInfo onMoreData(long nativeAudioTrackOutputStream, AudioTrackOutputStream caller, ByteBuffer audioData, long delayInFrames) {
        return (AudioTrackOutputStream.AudioBufferInfo) GEN_JNI.org_chromium_media_AudioTrackOutputStream_onMoreData(nativeAudioTrackOutputStream, caller, audioData, delayInFrames);
    }

    @Override // org.chromium.media.AudioTrackOutputStream.Natives
    public void onError(long nativeAudioTrackOutputStream, AudioTrackOutputStream caller) {
        GEN_JNI.org_chromium_media_AudioTrackOutputStream_onError(nativeAudioTrackOutputStream, caller);
    }

    @Override // org.chromium.media.AudioTrackOutputStream.Natives
    public long getAddress(long nativeAudioTrackOutputStream, AudioTrackOutputStream caller, ByteBuffer byteBuffer) {
        return GEN_JNI.org_chromium_media_AudioTrackOutputStream_getAddress(nativeAudioTrackOutputStream, caller, byteBuffer);
    }

    public static AudioTrackOutputStream.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            AudioTrackOutputStream.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.media.AudioTrackOutputStream.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new AudioTrackOutputStreamJni();
    }
}
