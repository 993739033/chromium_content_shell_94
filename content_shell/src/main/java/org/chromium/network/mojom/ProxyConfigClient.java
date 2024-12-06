package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface ProxyConfigClient extends Interface {
    public static final Manager<ProxyConfigClient, Proxy> MANAGER = ProxyConfigClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface FlushProxyConfigResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends ProxyConfigClient, Interface.Proxy {
    }

    void flushProxyConfig(FlushProxyConfigResponse flushProxyConfigResponse);

    void onProxyConfigUpdated(ProxyConfigWithAnnotation proxyConfigWithAnnotation);
}
