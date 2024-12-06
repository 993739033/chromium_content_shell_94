package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo.system.DataPipe;
/* loaded from: classes2.dex */
public interface TcpConnectedSocket extends Interface {
    public static final Manager<TcpConnectedSocket, Proxy> MANAGER = TcpConnectedSocket_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends TcpConnectedSocket, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface SetKeepAliveResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface SetNoDelayResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface SetReceiveBufferSizeResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface SetSendBufferSizeResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface UpgradeToTlsResponse extends Callbacks.Callback4<Integer, DataPipe.ConsumerHandle, DataPipe.ProducerHandle, SslInfo> {
    }

    void setKeepAlive(boolean z, int i, SetKeepAliveResponse setKeepAliveResponse);

    void setNoDelay(boolean z, SetNoDelayResponse setNoDelayResponse);

    void setReceiveBufferSize(int i, SetReceiveBufferSizeResponse setReceiveBufferSizeResponse);

    void setSendBufferSize(int i, SetSendBufferSizeResponse setSendBufferSizeResponse);

    void upgradeToTls(HostPortPair hostPortPair, TlsClientSocketOptions tlsClientSocketOptions, MutableNetworkTrafficAnnotationTag mutableNetworkTrafficAnnotationTag, InterfaceRequest<TlsClientSocket> interfaceRequest, SocketObserver socketObserver, UpgradeToTlsResponse upgradeToTlsResponse);
}
