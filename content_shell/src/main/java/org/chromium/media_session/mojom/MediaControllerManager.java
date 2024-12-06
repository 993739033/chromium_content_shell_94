package org.chromium.media_session.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo_base.mojom.UnguessableToken;
/* loaded from: classes2.dex */
public interface MediaControllerManager extends Interface {
    public static final Manager<MediaControllerManager, Proxy> MANAGER = MediaControllerManager_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends MediaControllerManager, Interface.Proxy {
    }

    void createActiveMediaController(InterfaceRequest<MediaController> interfaceRequest);

    void createMediaControllerForSession(InterfaceRequest<MediaController> interfaceRequest, UnguessableToken unguessableToken);

    void suspendAllSessions();
}
