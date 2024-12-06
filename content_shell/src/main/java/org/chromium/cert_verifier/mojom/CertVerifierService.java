package org.chromium.cert_verifier.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.network.mojom.UrlLoaderFactory;
/* loaded from: classes2.dex */
public interface CertVerifierService extends Interface {
    public static final Manager<CertVerifierService, Proxy> MANAGER = CertVerifierService_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends CertVerifierService, Interface.Proxy {
    }

    void enableNetworkAccess(UrlLoaderFactory urlLoaderFactory, UrlLoaderFactoryConnector urlLoaderFactoryConnector);

    void setConfig(CertVerifierConfig certVerifierConfig);

    void verify(RequestParams requestParams, CertVerifierRequest certVerifierRequest);
}
