package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface SslConfigClient extends Interface {
    public static final Manager<SslConfigClient, Proxy> MANAGER = SslConfigClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends SslConfigClient, Interface.Proxy {
    }

    void onSslConfigUpdated(SslConfig sslConfig);
}
