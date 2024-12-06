package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo_base.mojom.UnguessableToken;
import org.chromium.network.mojom.UrlLoaderFactory;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface BlobUrlStore extends Interface {
    public static final Manager<BlobUrlStore, Proxy> MANAGER = BlobUrlStore_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends BlobUrlStore, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface RegisterResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface ResolveAsUrlLoaderFactoryResponse extends Callbacks.Callback1<UnguessableToken> {
    }

    /* loaded from: classes2.dex */
    public interface ResolveForNavigationResponse extends Callbacks.Callback1<UnguessableToken> {
    }

    /* loaded from: classes2.dex */
    public interface ResolveResponse extends Callbacks.Callback2<Blob, UnguessableToken> {
    }

    void register(Blob blob, Url url, UnguessableToken unguessableToken, RegisterResponse registerResponse);

    void resolve(Url url, ResolveResponse resolveResponse);

    void resolveAsUrlLoaderFactory(Url url, InterfaceRequest<UrlLoaderFactory> interfaceRequest, ResolveAsUrlLoaderFactoryResponse resolveAsUrlLoaderFactoryResponse);

    void resolveForNavigation(Url url, InterfaceRequest<BlobUrlToken> interfaceRequest, ResolveForNavigationResponse resolveForNavigationResponse);

    void revoke(Url url);
}
