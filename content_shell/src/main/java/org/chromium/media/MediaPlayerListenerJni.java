package org.chromium.media;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.media.MediaPlayerListener;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class MediaPlayerListenerJni implements MediaPlayerListener.Natives {
    public static final JniStaticTestMocker<MediaPlayerListener.Natives> TEST_HOOKS = new JniStaticTestMocker<MediaPlayerListener.Natives>() { // from class: org.chromium.media.MediaPlayerListenerJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(MediaPlayerListener.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                MediaPlayerListener.Natives unused = MediaPlayerListenerJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static MediaPlayerListener.Natives testInstance;

    MediaPlayerListenerJni() {
    }

    @Override // org.chromium.media.MediaPlayerListener.Natives
    public void onMediaError(long nativeMediaPlayerListener, MediaPlayerListener caller, int errorType) {
        GEN_JNI.org_chromium_media_MediaPlayerListener_onMediaError(nativeMediaPlayerListener, caller, errorType);
    }

    @Override // org.chromium.media.MediaPlayerListener.Natives
    public void onVideoSizeChanged(long nativeMediaPlayerListener, MediaPlayerListener caller, int width, int height) {
        GEN_JNI.org_chromium_media_MediaPlayerListener_onVideoSizeChanged(nativeMediaPlayerListener, caller, width, height);
    }

    @Override // org.chromium.media.MediaPlayerListener.Natives
    public void onMediaPrepared(long nativeMediaPlayerListener, MediaPlayerListener caller) {
        GEN_JNI.org_chromium_media_MediaPlayerListener_onMediaPrepared(nativeMediaPlayerListener, caller);
    }

    @Override // org.chromium.media.MediaPlayerListener.Natives
    public void onPlaybackComplete(long nativeMediaPlayerListener, MediaPlayerListener caller) {
        GEN_JNI.org_chromium_media_MediaPlayerListener_onPlaybackComplete(nativeMediaPlayerListener, caller);
    }

    public static MediaPlayerListener.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            MediaPlayerListener.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.media.MediaPlayerListener.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new MediaPlayerListenerJni();
    }
}
