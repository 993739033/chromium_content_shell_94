package org.chromium.media;

import java.nio.ByteBuffer;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.media.ScreenCapture;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ScreenCaptureJni implements ScreenCapture.Natives {
    public static final JniStaticTestMocker<ScreenCapture.Natives> TEST_HOOKS = new JniStaticTestMocker<ScreenCapture.Natives>() { // from class: org.chromium.media.ScreenCaptureJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(ScreenCapture.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                ScreenCapture.Natives unused = ScreenCaptureJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static ScreenCapture.Natives testInstance;

    ScreenCaptureJni() {
    }

    @Override // org.chromium.media.ScreenCapture.Natives
    public void onRGBAFrameAvailable(long nativeScreenCaptureMachineAndroid, ScreenCapture caller, ByteBuffer buf, int rowStride, int left, int top, int width, int height, long timestamp) {
        GEN_JNI.org_chromium_media_ScreenCapture_onRGBAFrameAvailable(nativeScreenCaptureMachineAndroid, caller, buf, rowStride, left, top, width, height, timestamp);
    }

    @Override // org.chromium.media.ScreenCapture.Natives
    public void onI420FrameAvailable(long nativeScreenCaptureMachineAndroid, ScreenCapture caller, ByteBuffer yBuffer, int yStride, ByteBuffer uBuffer, ByteBuffer vBuffer, int uvRowStride, int uvPixelStride, int left, int top, int width, int height, long timestamp) {
        GEN_JNI.org_chromium_media_ScreenCapture_onI420FrameAvailable(nativeScreenCaptureMachineAndroid, caller, yBuffer, yStride, uBuffer, vBuffer, uvRowStride, uvPixelStride, left, top, width, height, timestamp);
    }

    @Override // org.chromium.media.ScreenCapture.Natives
    public void onActivityResult(long nativeScreenCaptureMachineAndroid, ScreenCapture caller, boolean result) {
        GEN_JNI.org_chromium_media_ScreenCapture_onActivityResult(nativeScreenCaptureMachineAndroid, caller, result);
    }

    @Override // org.chromium.media.ScreenCapture.Natives
    public void onOrientationChange(long nativeScreenCaptureMachineAndroid, ScreenCapture caller, int rotation) {
        GEN_JNI.org_chromium_media_ScreenCapture_onOrientationChange(nativeScreenCaptureMachineAndroid, caller, rotation);
    }

    public static ScreenCapture.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            ScreenCapture.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.media.ScreenCapture.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new ScreenCaptureJni();
    }
}
