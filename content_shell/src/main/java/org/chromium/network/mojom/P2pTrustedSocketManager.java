package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface P2pTrustedSocketManager extends Interface {
    public static final Manager<P2pTrustedSocketManager, Proxy> MANAGER = P2pTrustedSocketManager_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends P2pTrustedSocketManager, Interface.Proxy {
    }

    void startRtpDump(boolean z, boolean z2);

    void stopRtpDump(boolean z, boolean z2);
}
