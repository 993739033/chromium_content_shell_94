package org.chromium.media_session.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.TimeDelta;
/* loaded from: classes2.dex */
public interface MediaController extends Interface {
    public static final Manager<MediaController, Proxy> MANAGER = MediaController_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends MediaController, Interface.Proxy {
    }

    void addObserver(MediaControllerObserver mediaControllerObserver);

    void enterPictureInPicture();

    void exitPictureInPicture();

    void hangUp();

    void nextTrack();

    void observeImages(int i, int i2, int i3, MediaControllerImageObserver mediaControllerImageObserver);

    void previousTrack();

    void raise();

    void resume();

    void scrubTo(TimeDelta timeDelta);

    void seek(TimeDelta timeDelta);

    void seekTo(TimeDelta timeDelta);

    void setAudioSinkId(String str);

    void stop();

    void suspend();

    void toggleCamera();

    void toggleMicrophone();

    void toggleSuspendResume();
}
