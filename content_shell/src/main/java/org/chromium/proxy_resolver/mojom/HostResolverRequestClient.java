package org.chromium.proxy_resolver.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.network.mojom.IpAddress;
/* loaded from: classes2.dex */
public interface HostResolverRequestClient extends Interface {
    public static final Manager<HostResolverRequestClient, Proxy> MANAGER = HostResolverRequestClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends HostResolverRequestClient, Interface.Proxy {
    }

    void reportResult(int i, IpAddress[] ipAddressArr);
}
