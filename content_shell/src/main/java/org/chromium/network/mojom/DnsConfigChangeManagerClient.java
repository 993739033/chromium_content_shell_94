package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface DnsConfigChangeManagerClient extends Interface {
    public static final Manager<DnsConfigChangeManagerClient, Proxy> MANAGER = DnsConfigChangeManagerClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends DnsConfigChangeManagerClient, Interface.Proxy {
    }

    void onDnsConfigChanged();
}
