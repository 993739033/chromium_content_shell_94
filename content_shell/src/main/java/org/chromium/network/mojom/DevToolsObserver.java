package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo_base.mojom.UnguessableToken;
import org.chromium.url.internal.mojom.Origin;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface DevToolsObserver extends Interface {
    public static final Manager<DevToolsObserver, Proxy> MANAGER = DevToolsObserver_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends DevToolsObserver, Interface.Proxy {
    }

    void clone(InterfaceRequest<DevToolsObserver> interfaceRequest);

    void onCorsError(String str, Origin origin, Url url, CorsErrorStatus corsErrorStatus);

    void onCorsPreflightRequest(UnguessableToken unguessableToken, HttpRequestHeaders httpRequestHeaders, UrlRequestDevToolsInfo urlRequestDevToolsInfo, Url url, String str);

    void onCorsPreflightRequestCompleted(UnguessableToken unguessableToken, UrlLoaderCompletionStatus urlLoaderCompletionStatus);

    void onCorsPreflightResponse(UnguessableToken unguessableToken, Url url, UrlResponseHead urlResponseHead);

    void onPrivateNetworkRequest(String str, Url url, boolean z, int i, ClientSecurityState clientSecurityState);

    void onRawRequest(String str, CookieWithAccessResult[] cookieWithAccessResultArr, HttpRawHeaderPair[] httpRawHeaderPairArr, ClientSecurityState clientSecurityState);

    void onRawResponse(String str, CookieAndLineWithAccessResult[] cookieAndLineWithAccessResultArr, HttpRawHeaderPair[] httpRawHeaderPairArr, String str2, int i, int i2);

    void onSubresourceWebBundleInnerResponse(String str, Url url, String str2);

    void onSubresourceWebBundleInnerResponseError(String str, Url url, String str2, String str3);

    void onSubresourceWebBundleMetadata(String str, Url[] urlArr);

    void onSubresourceWebBundleMetadataError(String str, String str2);

    void onTrustTokenOperationDone(String str, TrustTokenOperationResult trustTokenOperationResult);
}
