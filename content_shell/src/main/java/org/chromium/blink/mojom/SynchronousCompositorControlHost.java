package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.viz.mojom.CompositorFrame;
import org.chromium.viz.mojom.HitTestRegionList;
import org.chromium.viz.mojom.LocalSurfaceId;
/* loaded from: classes2.dex */
public interface SynchronousCompositorControlHost extends Interface {
    public static final Manager<SynchronousCompositorControlHost, Proxy> MANAGER = SynchronousCompositorControlHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends SynchronousCompositorControlHost, Interface.Proxy {
    }

    void beginFrameResponse(SyncCompositorCommonRendererParams syncCompositorCommonRendererParams);

    void returnFrame(int i, int i2, LocalSurfaceId localSurfaceId, CompositorFrame compositorFrame, HitTestRegionList hitTestRegionList);
}
