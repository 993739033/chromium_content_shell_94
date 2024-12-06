package org.chromium.media;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.media.MediaCodecBridge;
/* JADX INFO: Access modifiers changed from: package-private */
@MainDex
/* loaded from: classes2.dex */
public class MediaCodecBridgeJni implements MediaCodecBridge.Natives {
    public static final JniStaticTestMocker<MediaCodecBridge.Natives> TEST_HOOKS = new JniStaticTestMocker<MediaCodecBridge.Natives>() { // from class: org.chromium.media.MediaCodecBridgeJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(MediaCodecBridge.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                MediaCodecBridge.Natives unused = MediaCodecBridgeJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static MediaCodecBridge.Natives testInstance;

    MediaCodecBridgeJni() {
    }

    @Override // org.chromium.media.MediaCodecBridge.Natives
    public void onBuffersAvailable(long nativeMediaCodecBridge, MediaCodecBridge caller) {
        GEN_JNI.org_chromium_media_MediaCodecBridge_onBuffersAvailable(nativeMediaCodecBridge, caller);
    }

    public static MediaCodecBridge.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            MediaCodecBridge.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.media.MediaCodecBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(true);
        return new MediaCodecBridgeJni();
    }
}
