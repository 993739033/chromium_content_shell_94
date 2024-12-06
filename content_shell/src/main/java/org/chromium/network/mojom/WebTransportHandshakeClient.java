package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
/* loaded from: classes2.dex */
public interface WebTransportHandshakeClient extends Interface {
    public static final Manager<WebTransportHandshakeClient, Proxy> MANAGER = WebTransportHandshakeClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends WebTransportHandshakeClient, Interface.Proxy {
    }

    void onConnectionEstablished(WebTransport webTransport, InterfaceRequest<WebTransportClient> interfaceRequest);

    void onHandshakeFailed(WebTransportError webTransportError);
}
