package org.chromium.cert_verifier.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.network.mojom.CertVerifyResult;
/* loaded from: classes2.dex */
public interface CertVerifierRequest extends Interface {
    public static final Manager<CertVerifierRequest, Proxy> MANAGER = CertVerifierRequest_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends CertVerifierRequest, Interface.Proxy {
    }

    void complete(CertVerifyResult certVerifyResult, int i);
}
