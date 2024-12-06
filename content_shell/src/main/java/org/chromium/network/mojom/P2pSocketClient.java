package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo_base.mojom.TimeTicks;
/* loaded from: classes2.dex */
public interface P2pSocketClient extends Interface {
    public static final Manager<P2pSocketClient, Proxy> MANAGER = P2pSocketClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends P2pSocketClient, Interface.Proxy {
    }

    void dataReceived(IpEndPoint ipEndPoint, byte[] bArr, TimeTicks timeTicks);

    void incomingTcpConnection(IpEndPoint ipEndPoint, P2pSocket p2pSocket, InterfaceRequest<P2pSocketClient> interfaceRequest);

    void sendComplete(P2pSendPacketMetrics p2pSendPacketMetrics);

    void socketCreated(IpEndPoint ipEndPoint, IpEndPoint ipEndPoint2);
}
