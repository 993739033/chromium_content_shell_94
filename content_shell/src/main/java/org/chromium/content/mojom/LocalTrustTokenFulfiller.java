package org.chromium.content.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.network.mojom.FulfillTrustTokenIssuanceAnswer;
import org.chromium.network.mojom.FulfillTrustTokenIssuanceRequest;
/* loaded from: classes2.dex */
public interface LocalTrustTokenFulfiller extends Interface {
    public static final Manager<LocalTrustTokenFulfiller, Proxy> MANAGER = LocalTrustTokenFulfiller_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface FulfillTrustTokenIssuanceResponse extends Callbacks.Callback1<FulfillTrustTokenIssuanceAnswer> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends LocalTrustTokenFulfiller, Interface.Proxy {
    }

    void fulfillTrustTokenIssuance(FulfillTrustTokenIssuanceRequest fulfillTrustTokenIssuanceRequest, FulfillTrustTokenIssuanceResponse fulfillTrustTokenIssuanceResponse);
}
