package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.proxy_resolver.mojom.ProxyInfo;
/* loaded from: classes2.dex */
public interface ProxyLookupClient extends Interface {
    public static final Manager<ProxyLookupClient, Proxy> MANAGER = ProxyLookupClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends ProxyLookupClient, Interface.Proxy {
    }

    void onProxyLookupComplete(int i, ProxyInfo proxyInfo);
}
