package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface WebSocketAuthenticationHandler extends Interface {
    public static final Manager<WebSocketAuthenticationHandler, Proxy> MANAGER = WebSocketAuthenticationHandler_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface OnAuthRequiredResponse extends Callbacks.Callback1<AuthCredentials> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends WebSocketAuthenticationHandler, Interface.Proxy {
    }

    void onAuthRequired(AuthChallengeInfo authChallengeInfo, HttpResponseHeaders httpResponseHeaders, IpEndPoint ipEndPoint, OnAuthRequiredResponse onAuthRequiredResponse);
}
