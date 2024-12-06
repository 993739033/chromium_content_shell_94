package org.chromium.viz.mojom;

import org.chromium.gpu.mojom.Mailbox;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.ReadOnlySharedMemoryRegion;
/* loaded from: classes2.dex */
public interface CompositorFrameSink extends Interface {
    public static final Manager<CompositorFrameSink, Proxy> MANAGER = CompositorFrameSink_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends CompositorFrameSink, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface SubmitCompositorFrameSyncResponse extends Callbacks.Callback1<ReturnedResource[]> {
    }

    void didAllocateSharedBitmap(ReadOnlySharedMemoryRegion readOnlySharedMemoryRegion, Mailbox mailbox);

    void didDeleteSharedBitmap(Mailbox mailbox);

    void didNotProduceFrame(BeginFrameAck beginFrameAck);

    void initializeCompositorFrameSinkType(int i);

    void setNeedsBeginFrame(boolean z);

    void setWantsAnimateOnlyBeginFrames();

    void submitCompositorFrame(LocalSurfaceId localSurfaceId, CompositorFrame compositorFrame, HitTestRegionList hitTestRegionList, long j);

    void submitCompositorFrameSync(LocalSurfaceId localSurfaceId, CompositorFrame compositorFrame, HitTestRegionList hitTestRegionList, long j, SubmitCompositorFrameSyncResponse submitCompositorFrameSyncResponse);
}
