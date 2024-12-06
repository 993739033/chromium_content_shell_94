package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface SynchronousCompositorHost extends Interface {
    public static final Manager<SynchronousCompositorHost, Proxy> MANAGER = SynchronousCompositorHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends SynchronousCompositorHost, Interface.Proxy {
    }

    void layerTreeFrameSinkCreated();

    void setNeedsBeginFrames(boolean z);

    void updateState(SyncCompositorCommonRendererParams syncCompositorCommonRendererParams);
}
