package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface DnsConfigChangeManager extends Interface {
    public static final Manager<DnsConfigChangeManager, Proxy> MANAGER = DnsConfigChangeManager_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends DnsConfigChangeManager, Interface.Proxy {
    }

    void requestNotifications(DnsConfigChangeManagerClient dnsConfigChangeManagerClient);
}
