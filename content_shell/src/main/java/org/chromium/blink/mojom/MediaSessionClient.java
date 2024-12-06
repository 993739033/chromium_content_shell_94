package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface MediaSessionClient extends Interface {
    public static final Manager<MediaSessionClient, Proxy> MANAGER = MediaSessionClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends MediaSessionClient, Interface.Proxy {
    }

    void didReceiveAction(int i, MediaSessionActionDetails mediaSessionActionDetails);
}
