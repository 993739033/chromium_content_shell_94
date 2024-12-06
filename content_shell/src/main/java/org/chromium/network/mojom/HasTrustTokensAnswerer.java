package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.url.internal.mojom.Origin;
/* loaded from: classes2.dex */
public interface HasTrustTokensAnswerer extends Interface {
    public static final Manager<HasTrustTokensAnswerer, Proxy> MANAGER = HasTrustTokensAnswerer_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface HasTrustTokensResponse extends Callbacks.Callback1<HasTrustTokensResult> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends HasTrustTokensAnswerer, Interface.Proxy {
    }

    void hasTrustTokens(Origin origin, HasTrustTokensResponse hasTrustTokensResponse);
}
