package org.chromium.media_session.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface MediaControllerImageObserver extends Interface {
    public static final Manager<MediaControllerImageObserver, Proxy> MANAGER = MediaControllerImageObserver_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends MediaControllerImageObserver, Interface.Proxy {
    }

    void mediaControllerImageChanged(int i, MediaImageBitmap mediaImageBitmap);
}
