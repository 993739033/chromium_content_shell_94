package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface TrustedHeaderClient extends Interface {
    public static final Manager<TrustedHeaderClient, Proxy> MANAGER = TrustedHeaderClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface OnBeforeSendHeadersResponse extends Callbacks.Callback2<Integer, HttpRequestHeaders> {
    }

    /* loaded from: classes2.dex */
    public interface OnHeadersReceivedResponse extends Callbacks.Callback3<Integer, String, Url> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends TrustedHeaderClient, Interface.Proxy {
    }

    void onBeforeSendHeaders(HttpRequestHeaders httpRequestHeaders, OnBeforeSendHeadersResponse onBeforeSendHeadersResponse);

    void onHeadersReceived(String str, IpEndPoint ipEndPoint, OnHeadersReceivedResponse onHeadersReceivedResponse);
}
