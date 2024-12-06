package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface P2pTrustedSocketManagerClient extends Interface {
    public static final Manager<P2pTrustedSocketManagerClient, Proxy> MANAGER = P2pTrustedSocketManagerClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends P2pTrustedSocketManagerClient, Interface.Proxy {
    }

    void dumpPacket(byte[] bArr, long j, boolean z);

    void invalidSocketPortRangeRequested();
}
