package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
/* loaded from: classes2.dex */
public interface P2pSocketManager extends Interface {
    public static final Manager<P2pSocketManager, Proxy> MANAGER = P2pSocketManager_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetHostAddressResponse extends Callbacks.Callback1<IpAddress[]> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends P2pSocketManager, Interface.Proxy {
    }

    void createSocket(int i, IpEndPoint ipEndPoint, P2pPortRange p2pPortRange, P2pHostAndIpEndPoint p2pHostAndIpEndPoint, P2pSocketClient p2pSocketClient, InterfaceRequest<P2pSocket> interfaceRequest);

    void getHostAddress(String str, boolean z, GetHostAddressResponse getHostAddressResponse);

    void startNetworkNotifications(P2pNetworkNotificationClient p2pNetworkNotificationClient);
}
