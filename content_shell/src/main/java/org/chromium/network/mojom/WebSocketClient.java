package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface WebSocketClient extends Interface {
    public static final Manager<WebSocketClient, Proxy> MANAGER = WebSocketClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends WebSocketClient, Interface.Proxy {
    }

    void onClosingHandshake();

    void onDataFrame(boolean z, int i, long j);

    void onDropChannel(boolean z, short s, String str);
}
