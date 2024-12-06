package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.TimeDelta;
/* loaded from: classes2.dex */
public interface CustomProxyConfigClient extends Interface {
    public static final Manager<CustomProxyConfigClient, Proxy> MANAGER = CustomProxyConfigClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface MarkProxiesAsBadResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends CustomProxyConfigClient, Interface.Proxy {
    }

    void clearBadProxiesCache();

    void markProxiesAsBad(TimeDelta timeDelta, ProxyList proxyList, MarkProxiesAsBadResponse markProxiesAsBadResponse);

    void onCustomProxyConfigUpdated(CustomProxyConfig customProxyConfig);
}
