package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo.system.DataPipe;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface ProxyResolvingSocketFactory extends Interface {
    public static final Manager<ProxyResolvingSocketFactory, Proxy> MANAGER = ProxyResolvingSocketFactory_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface CreateProxyResolvingSocketResponse extends Callbacks.Callback5<Integer, IpEndPoint, IpEndPoint, DataPipe.ConsumerHandle, DataPipe.ProducerHandle> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends ProxyResolvingSocketFactory, Interface.Proxy {
    }

    void createProxyResolvingSocket(Url url, NetworkIsolationKey networkIsolationKey, ProxyResolvingSocketOptions proxyResolvingSocketOptions, MutableNetworkTrafficAnnotationTag mutableNetworkTrafficAnnotationTag, InterfaceRequest<ProxyResolvingSocket> interfaceRequest, SocketObserver socketObserver, CreateProxyResolvingSocketResponse createProxyResolvingSocketResponse);
}
