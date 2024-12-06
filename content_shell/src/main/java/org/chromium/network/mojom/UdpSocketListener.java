package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.ReadOnlyBuffer;
/* loaded from: classes2.dex */
public interface UdpSocketListener extends Interface {
    public static final Manager<UdpSocketListener, Proxy> MANAGER = UdpSocketListener_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends UdpSocketListener, Interface.Proxy {
    }

    void onReceived(int i, IpEndPoint ipEndPoint, ReadOnlyBuffer readOnlyBuffer);
}
