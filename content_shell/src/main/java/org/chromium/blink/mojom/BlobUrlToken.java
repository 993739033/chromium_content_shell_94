package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo_base.mojom.UnguessableToken;
/* loaded from: classes2.dex */
public interface BlobUrlToken extends Interface {
    public static final Manager<BlobUrlToken, Proxy> MANAGER = BlobUrlToken_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetTokenResponse extends Callbacks.Callback1<UnguessableToken> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends BlobUrlToken, Interface.Proxy {
    }

    void clone(InterfaceRequest<BlobUrlToken> interfaceRequest);

    void getToken(GetTokenResponse getTokenResponse);
}
