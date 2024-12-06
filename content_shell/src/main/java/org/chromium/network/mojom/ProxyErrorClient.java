package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface ProxyErrorClient extends Interface {
    public static final Manager<ProxyErrorClient, Proxy> MANAGER = ProxyErrorClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends ProxyErrorClient, Interface.Proxy {
    }

    void onPacScriptError(int i, String str);

    void onRequestMaybeFailedDueToProxySettings(int i);
}
