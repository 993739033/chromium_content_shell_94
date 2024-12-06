package org.chromium.media;

import java.nio.ByteBuffer;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.media.VideoCapture;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class VideoCaptureJni implements VideoCapture.Natives {
    public static final JniStaticTestMocker<VideoCapture.Natives> TEST_HOOKS = new JniStaticTestMocker<VideoCapture.Natives>() { // from class: org.chromium.media.VideoCaptureJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(VideoCapture.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                VideoCapture.Natives unused = VideoCaptureJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static VideoCapture.Natives testInstance;

    VideoCaptureJni() {
    }

    @Override // org.chromium.media.VideoCapture.Natives
    public void onFrameAvailable(long nativeVideoCaptureDeviceAndroid, VideoCapture caller, byte[] data, int length, int rotation) {
        GEN_JNI.org_chromium_media_VideoCapture_onFrameAvailable(nativeVideoCaptureDeviceAndroid, caller, data, length, rotation);
    }

    @Override // org.chromium.media.VideoCapture.Natives
    public void onI420FrameAvailable(long nativeVideoCaptureDeviceAndroid, VideoCapture caller, ByteBuffer yBuffer, int yStride, ByteBuffer uBuffer, ByteBuffer vBuffer, int uvRowStride, int uvPixelStride, int width, int height, int rotation, long timestamp) {
        GEN_JNI.org_chromium_media_VideoCapture_onI420FrameAvailable(nativeVideoCaptureDeviceAndroid, caller, yBuffer, yStride, uBuffer, vBuffer, uvRowStride, uvPixelStride, width, height, rotation, timestamp);
    }

    @Override // org.chromium.media.VideoCapture.Natives
    public void onError(long nativeVideoCaptureDeviceAndroid, VideoCapture caller, int androidVideoCaptureError, String message) {
        GEN_JNI.org_chromium_media_VideoCapture_onError(nativeVideoCaptureDeviceAndroid, caller, androidVideoCaptureError, message);
    }

    @Override // org.chromium.media.VideoCapture.Natives
    public void onFrameDropped(long nativeVideoCaptureDeviceAndroid, VideoCapture caller, int androidVideoCaptureFrameDropReason) {
        GEN_JNI.org_chromium_media_VideoCapture_onFrameDropped(nativeVideoCaptureDeviceAndroid, caller, androidVideoCaptureFrameDropReason);
    }

    @Override // org.chromium.media.VideoCapture.Natives
    public void onGetPhotoCapabilitiesReply(long nativeVideoCaptureDeviceAndroid, VideoCapture caller, long callbackId, PhotoCapabilities result) {
        GEN_JNI.org_chromium_media_VideoCapture_onGetPhotoCapabilitiesReply(nativeVideoCaptureDeviceAndroid, caller, callbackId, result);
    }

    @Override // org.chromium.media.VideoCapture.Natives
    public void onPhotoTaken(long nativeVideoCaptureDeviceAndroid, VideoCapture caller, long callbackId, byte[] data) {
        GEN_JNI.org_chromium_media_VideoCapture_onPhotoTaken(nativeVideoCaptureDeviceAndroid, caller, callbackId, data);
    }

    @Override // org.chromium.media.VideoCapture.Natives
    public void onStarted(long nativeVideoCaptureDeviceAndroid, VideoCapture caller) {
        GEN_JNI.org_chromium_media_VideoCapture_onStarted(nativeVideoCaptureDeviceAndroid, caller);
    }

    @Override // org.chromium.media.VideoCapture.Natives
    public void dCheckCurrentlyOnIncomingTaskRunner(long nativeVideoCaptureDeviceAndroid, VideoCapture caller) {
        GEN_JNI.org_chromium_media_VideoCapture_dCheckCurrentlyOnIncomingTaskRunner(nativeVideoCaptureDeviceAndroid, caller);
    }

    public static VideoCapture.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            VideoCapture.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.media.VideoCapture.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new VideoCaptureJni();
    }
}
