package org.chromium.media_session.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.UnguessableToken;
/* loaded from: classes2.dex */
public interface MediaControllerObserver extends Interface {
    public static final Manager<MediaControllerObserver, Proxy> MANAGER = MediaControllerObserver_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends MediaControllerObserver, Interface.Proxy {
    }

    void mediaSessionActionsChanged(int[] iArr);

    void mediaSessionChanged(UnguessableToken unguessableToken);

    void mediaSessionInfoChanged(MediaSessionInfo mediaSessionInfo);

    void mediaSessionMetadataChanged(MediaMetadata mediaMetadata);

    void mediaSessionPositionChanged(MediaPosition mediaPosition);
}
