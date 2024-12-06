package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface HostResolver extends Interface {
    public static final Manager<HostResolver, Proxy> MANAGER = HostResolver_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface MdnsListenResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends HostResolver, Interface.Proxy {
    }

    void mdnsListen(HostPortPair hostPortPair, int i, MdnsListenClient mdnsListenClient, MdnsListenResponse mdnsListenResponse);

    void resolveHost(HostPortPair hostPortPair, NetworkIsolationKey networkIsolationKey, ResolveHostParameters resolveHostParameters, ResolveHostClient resolveHostClient);
}
