package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface NetworkChangeManagerClient extends Interface {
    public static final Manager<NetworkChangeManagerClient, Proxy> MANAGER = NetworkChangeManagerClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends NetworkChangeManagerClient, Interface.Proxy {
    }

    void onInitialConnectionType(int i);

    void onNetworkChanged(int i);
}
