package org.chromium.media.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.UnguessableToken;
/* loaded from: classes2.dex */
public interface MediaPlayerRendererExtension extends Interface {
    public static final Manager<MediaPlayerRendererExtension, Proxy> MANAGER = MediaPlayerRendererExtension_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface InitiateScopedSurfaceRequestResponse extends Callbacks.Callback1<UnguessableToken> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends MediaPlayerRendererExtension, Interface.Proxy {
    }

    void initiateScopedSurfaceRequest(InitiateScopedSurfaceRequestResponse initiateScopedSurfaceRequestResponse);
}
