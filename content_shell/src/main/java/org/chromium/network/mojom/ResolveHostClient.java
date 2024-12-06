package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface ResolveHostClient extends Interface {
    public static final Manager<ResolveHostClient, Proxy> MANAGER = ResolveHostClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends ResolveHostClient, Interface.Proxy {
    }

    void onComplete(int i, ResolveErrorInfo resolveErrorInfo, AddressList addressList);

    void onHostnameResults(HostPortPair[] hostPortPairArr);

    void onTextResults(String[] strArr);
}
