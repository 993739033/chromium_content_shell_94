package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface P2pSocket extends Interface {
    public static final Manager<P2pSocket, Proxy> MANAGER = P2pSocket_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends P2pSocket, Interface.Proxy {
    }

    void send(byte[] bArr, P2pPacketInfo p2pPacketInfo, MutableNetworkTrafficAnnotationTag mutableNetworkTrafficAnnotationTag);

    void setOption(int i, int i2);
}
