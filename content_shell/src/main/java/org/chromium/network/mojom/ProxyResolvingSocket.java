package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo.system.DataPipe;
/* loaded from: classes2.dex */
public interface ProxyResolvingSocket extends Interface {
    public static final Manager<ProxyResolvingSocket, Proxy> MANAGER = ProxyResolvingSocket_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends ProxyResolvingSocket, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface UpgradeToTlsResponse extends Callbacks.Callback3<Integer, DataPipe.ConsumerHandle, DataPipe.ProducerHandle> {
    }

    void upgradeToTls(HostPortPair hostPortPair, MutableNetworkTrafficAnnotationTag mutableNetworkTrafficAnnotationTag, InterfaceRequest<TlsClientSocket> interfaceRequest, SocketObserver socketObserver, UpgradeToTlsResponse upgradeToTlsResponse);
}
