package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.ReadOnlyBuffer;
/* loaded from: classes2.dex */
public interface WebTransportClient extends Interface {
    public static final Manager<WebTransportClient, Proxy> MANAGER = WebTransportClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends WebTransportClient, Interface.Proxy {
    }

    void onDatagramReceived(ReadOnlyBuffer readOnlyBuffer);

    void onIncomingStreamClosed(int i, boolean z);
}
