package org.chromium.cc.mojom;

import org.chromium.gfx.mojom.Vector2dF;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface RenderFrameMetadataObserverClient extends Interface {
    public static final Manager<RenderFrameMetadataObserverClient, Proxy> MANAGER = RenderFrameMetadataObserverClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends RenderFrameMetadataObserverClient, Interface.Proxy {
    }

    void onFrameSubmissionForTesting(int i);

    void onRenderFrameMetadataChanged(int i, RenderFrameMetadata renderFrameMetadata);

    void onRootScrollOffsetChanged(Vector2dF vector2dF);
}
