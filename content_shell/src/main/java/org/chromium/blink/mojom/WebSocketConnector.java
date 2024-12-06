package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.UnguessableToken;
import org.chromium.network.mojom.SiteForCookies;
import org.chromium.network.mojom.WebSocketHandshakeClient;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface WebSocketConnector extends Interface {
    public static final Manager<WebSocketConnector, Proxy> MANAGER = WebSocketConnector_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends WebSocketConnector, Interface.Proxy {
    }

    void connect(Url url, String[] strArr, SiteForCookies siteForCookies, String str, WebSocketHandshakeClient webSocketHandshakeClient, UnguessableToken unguessableToken);
}
