package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.proxy_resolver.mojom.ProxyServer;
/* loaded from: classes2.dex */
public interface CustomProxyConnectionObserver extends Interface {
    public static final Manager<CustomProxyConnectionObserver, Proxy> MANAGER = CustomProxyConnectionObserver_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends CustomProxyConnectionObserver, Interface.Proxy {
    }

    void onFallback(ProxyServer proxyServer, int i);

    void onTunnelHeadersReceived(ProxyServer proxyServer, HttpResponseHeaders httpResponseHeaders);
}
