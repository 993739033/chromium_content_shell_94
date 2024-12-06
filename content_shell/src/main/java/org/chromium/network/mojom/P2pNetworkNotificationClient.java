package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface P2pNetworkNotificationClient extends Interface {
    public static final Manager<P2pNetworkNotificationClient, Proxy> MANAGER = P2pNetworkNotificationClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends P2pNetworkNotificationClient, Interface.Proxy {
    }

    void networkListChanged(NetworkInterface[] networkInterfaceArr, IpAddress ipAddress, IpAddress ipAddress2);
}
