package org.chromium.proxy_resolver.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.network.mojom.NetworkIsolationKey;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface ProxyResolver extends Interface {
    public static final Manager<ProxyResolver, Proxy> MANAGER = ProxyResolver_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends ProxyResolver, Interface.Proxy {
    }

    void getProxyForUrl(Url url, NetworkIsolationKey networkIsolationKey, ProxyResolverRequestClient proxyResolverRequestClient);
}
