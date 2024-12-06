package org.chromium.media_session.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.TimeDelta;
/* loaded from: classes2.dex */
public interface MediaSession extends Interface {
    public static final Manager<MediaSession, Proxy> MANAGER = MediaSession_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetDebugInfoResponse extends Callbacks.Callback1<MediaSessionDebugInfo> {
    }

    /* loaded from: classes2.dex */
    public interface GetMediaImageBitmapResponse extends Callbacks.Callback1<MediaImageBitmap> {
    }

    /* loaded from: classes2.dex */
    public interface GetMediaSessionInfoResponse extends Callbacks.Callback1<MediaSessionInfo> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends MediaSession, Interface.Proxy {
    }

    void addObserver(MediaSessionObserver mediaSessionObserver);

    void enterPictureInPicture();

    void exitPictureInPicture();

    void getDebugInfo(GetDebugInfoResponse getDebugInfoResponse);

    void getMediaImageBitmap(MediaImage mediaImage, int i, int i2, GetMediaImageBitmapResponse getMediaImageBitmapResponse);

    void getMediaSessionInfo(GetMediaSessionInfoResponse getMediaSessionInfoResponse);

    void hangUp();

    void nextTrack();

    void previousTrack();

    void raise();

    void resume(int i);

    void scrubTo(TimeDelta timeDelta);

    void seek(TimeDelta timeDelta);

    void seekTo(TimeDelta timeDelta);

    void setAudioSinkId(String str);

    void skipAd();

    void startDucking();

    void stop(int i);

    void stopDucking();

    void suspend(int i);

    void toggleCamera();

    void toggleMicrophone();

    /* loaded from: classes2.dex */
    public static final class SuspendType {
        public static final int CONTENT = 2;
        private static final boolean IS_EXTENSIBLE = true;
        public static final int MAX_VALUE = 2;
        public static final int MIN_VALUE = 0;
        public static final int SYSTEM = 0;
        public static final int UI = 1;

        /* loaded from: classes2.dex */
        public @interface EnumType {
        }

        public static boolean isKnownValue(int value) {
            return value >= 0 && value <= 2;
        }

        public static void validate(int value) {
        }

        public static int toKnownValue(int value) {
            return value;
        }

        private SuspendType() {
        }
    }
}
