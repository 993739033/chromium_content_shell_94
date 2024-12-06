package org.chromium.media_session.mojom;

import java.util.Map;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface MediaSessionObserver extends Interface {
    public static final Manager<MediaSessionObserver, Proxy> MANAGER = MediaSessionObserver_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends MediaSessionObserver, Interface.Proxy {
    }

    void mediaSessionActionsChanged(int[] iArr);

    void mediaSessionImagesChanged(Map<Integer, MediaImage[]> map);

    void mediaSessionInfoChanged(MediaSessionInfo mediaSessionInfo);

    void mediaSessionMetadataChanged(MediaMetadata mediaMetadata);

    void mediaSessionPositionChanged(MediaPosition mediaPosition);
}
