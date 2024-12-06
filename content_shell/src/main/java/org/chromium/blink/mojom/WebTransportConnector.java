package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.network.mojom.WebTransportCertificateFingerprint;
import org.chromium.network.mojom.WebTransportHandshakeClient;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface WebTransportConnector extends Interface {
    public static final Manager<WebTransportConnector, Proxy> MANAGER = WebTransportConnector_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends WebTransportConnector, Interface.Proxy {
    }

    void connect(Url url, WebTransportCertificateFingerprint[] webTransportCertificateFingerprintArr, WebTransportHandshakeClient webTransportHandshakeClient);
}
