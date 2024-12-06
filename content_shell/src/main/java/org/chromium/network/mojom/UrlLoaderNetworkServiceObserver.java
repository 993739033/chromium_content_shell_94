package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo_base.mojom.UnguessableToken;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface UrlLoaderNetworkServiceObserver extends Interface {
    public static final Manager<UrlLoaderNetworkServiceObserver, Proxy> MANAGER = UrlLoaderNetworkServiceObserver_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface OnClearSiteDataResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface OnLoadingStateUpdateResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface OnSslCertificateErrorResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends UrlLoaderNetworkServiceObserver, Interface.Proxy {
    }

    void clone(InterfaceRequest<UrlLoaderNetworkServiceObserver> interfaceRequest);

    void onAuthRequired(UnguessableToken unguessableToken, int i, Url url, boolean z, AuthChallengeInfo authChallengeInfo, HttpResponseHeaders httpResponseHeaders, AuthChallengeResponder authChallengeResponder);

    void onCertificateRequested(UnguessableToken unguessableToken, SslCertRequestInfo sslCertRequestInfo, ClientCertificateResponder clientCertificateResponder);

    void onClearSiteData(Url url, String str, int i, OnClearSiteDataResponse onClearSiteDataResponse);

    void onDataUseUpdate(int i, long j, long j2);

    void onLoadingStateUpdate(LoadInfo loadInfo, OnLoadingStateUpdateResponse onLoadingStateUpdateResponse);

    void onSslCertificateError(Url url, int i, SslInfo sslInfo, boolean z, OnSslCertificateErrorResponse onSslCertificateErrorResponse);
}
