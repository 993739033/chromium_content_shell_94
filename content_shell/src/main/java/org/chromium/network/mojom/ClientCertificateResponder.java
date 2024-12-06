package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface ClientCertificateResponder extends Interface {
    public static final Manager<ClientCertificateResponder, Proxy> MANAGER = ClientCertificateResponder_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends ClientCertificateResponder, Interface.Proxy {
    }

    void cancelRequest();

    void continueWithCertificate(X509Certificate x509Certificate, String str, short[] sArr, SslPrivateKey sslPrivateKey);

    void continueWithoutCertificate();
}
