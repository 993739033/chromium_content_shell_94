package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface NetworkChangeManager extends Interface {
    public static final Manager<NetworkChangeManager, Proxy> MANAGER = NetworkChangeManager_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends NetworkChangeManager, Interface.Proxy {
    }

    void onNetworkChanged(boolean z, boolean z2, boolean z3, int i, boolean z4, int i2);

    void requestNotifications(NetworkChangeManagerClient networkChangeManagerClient);
}
