package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo.system.DataPipe;
/* loaded from: classes2.dex */
public interface TcpBoundSocket extends Interface {
    public static final Manager<TcpBoundSocket, Proxy> MANAGER = TcpBoundSocket_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface ConnectResponse extends Callbacks.Callback5<Integer, IpEndPoint, IpEndPoint, DataPipe.ConsumerHandle, DataPipe.ProducerHandle> {
    }

    /* loaded from: classes2.dex */
    public interface ListenResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends TcpBoundSocket, Interface.Proxy {
    }

    void connect(AddressList addressList, TcpConnectedSocketOptions tcpConnectedSocketOptions, InterfaceRequest<TcpConnectedSocket> interfaceRequest, SocketObserver socketObserver, ConnectResponse connectResponse);

    void listen(int i, InterfaceRequest<TcpServerSocket> interfaceRequest, ListenResponse listenResponse);
}
