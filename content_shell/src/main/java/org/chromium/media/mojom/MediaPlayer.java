package org.chromium.media.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.TimeDelta;
/* loaded from: classes2.dex */
public interface MediaPlayer extends Interface {
    public static final Manager<MediaPlayer, Proxy> MANAGER = MediaPlayer_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends MediaPlayer, Interface.Proxy {
    }

    void requestEnterPictureInPicture();

    void requestExitPictureInPicture();

    void requestPause(boolean z);

    void requestPlay();

    void requestSeekBackward(TimeDelta timeDelta);

    void requestSeekForward(TimeDelta timeDelta);

    void requestSeekTo(TimeDelta timeDelta);

    void setAudioSinkId(String str);

    void setPersistentState(boolean z);

    void setPowerExperimentState(boolean z);

    void setVolumeMultiplier(double d);

    void suspendForFrameClosed();
}
