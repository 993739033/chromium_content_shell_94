package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.system.DataPipe;
/* loaded from: classes2.dex */
public interface TcpServerSocket extends Interface {
    public static final Manager<TcpServerSocket, Proxy> MANAGER = TcpServerSocket_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface AcceptResponse extends Callbacks.Callback5<Integer, IpEndPoint, TcpConnectedSocket, DataPipe.ConsumerHandle, DataPipe.ProducerHandle> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends TcpServerSocket, Interface.Proxy {
    }

    void accept(SocketObserver socketObserver, AcceptResponse acceptResponse);
}
