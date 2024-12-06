package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface WebSocket extends Interface {
    public static final Manager<WebSocket, Proxy> MANAGER = WebSocket_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends WebSocket, Interface.Proxy {
    }

    void sendMessage(int i, long j);

    void startClosingHandshake(short s, String str);

    void startReceiving();
}
