package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface ProxyConfigPollerClient extends Interface {
    public static final Manager<ProxyConfigPollerClient, Proxy> MANAGER = ProxyConfigPollerClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends ProxyConfigPollerClient, Interface.Proxy {
    }

    void onLazyProxyConfigPoll();
}
