package org.chromium.blink.mojom;

import org.chromium.media_session.mojom.MediaPosition;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface MediaSessionService extends Interface {
    public static final Manager<MediaSessionService, Proxy> MANAGER = MediaSessionService_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends MediaSessionService, Interface.Proxy {
    }

    void disableAction(int i);

    void enableAction(int i);

    void setCameraState(int i);

    void setClient(MediaSessionClient mediaSessionClient);

    void setMetadata(SpecMediaMetadata specMediaMetadata);

    void setMicrophoneState(int i);

    void setPlaybackState(int i);

    void setPositionState(MediaPosition mediaPosition);
}
