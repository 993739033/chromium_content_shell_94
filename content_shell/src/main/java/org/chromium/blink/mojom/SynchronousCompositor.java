package org.chromium.blink.mojom;

import java.util.Map;
import org.chromium.gfx.mojom.Point;
import org.chromium.gfx.mojom.ScrollOffset;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.WritableSharedMemoryRegion;
import org.chromium.viz.mojom.BeginFrameArgs;
import org.chromium.viz.mojom.CompositorFrame;
import org.chromium.viz.mojom.CompositorFrameMetadata;
import org.chromium.viz.mojom.FrameTimingDetails;
import org.chromium.viz.mojom.HitTestRegionList;
import org.chromium.viz.mojom.LocalSurfaceId;
import org.chromium.viz.mojom.ReturnedResource;
/* loaded from: classes2.dex */
public interface SynchronousCompositor extends Interface {
    public static final Manager<SynchronousCompositor, Proxy> MANAGER = SynchronousCompositor_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface DemandDrawHwResponse extends Callbacks.Callback6<SyncCompositorCommonRendererParams, Integer, Integer, LocalSurfaceId, CompositorFrame, HitTestRegionList> {
    }

    /* loaded from: classes2.dex */
    public interface DemandDrawSwResponse extends Callbacks.Callback3<SyncCompositorCommonRendererParams, Integer, CompositorFrameMetadata> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends SynchronousCompositor, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface SetSharedMemoryResponse extends Callbacks.Callback2<Boolean, SyncCompositorCommonRendererParams> {
    }

    /* loaded from: classes2.dex */
    public interface ZoomByResponse extends Callbacks.Callback1<SyncCompositorCommonRendererParams> {
    }

    void beginFrame(BeginFrameArgs beginFrameArgs, Map<Integer, FrameTimingDetails> map);

    void demandDrawHw(SyncCompositorDemandDrawHwParams syncCompositorDemandDrawHwParams, DemandDrawHwResponse demandDrawHwResponse);

    void demandDrawHwAsync(SyncCompositorDemandDrawHwParams syncCompositorDemandDrawHwParams);

    void demandDrawSw(SyncCompositorDemandDrawSwParams syncCompositorDemandDrawSwParams, DemandDrawSwResponse demandDrawSwResponse);

    void reclaimResources(int i, ReturnedResource[] returnedResourceArr);

    void setBeginFrameSourcePaused(boolean z);

    void setMemoryPolicy(int i);

    void setScroll(ScrollOffset scrollOffset);

    void setSharedMemory(WritableSharedMemoryRegion writableSharedMemoryRegion, SetSharedMemoryResponse setSharedMemoryResponse);

    void willSkipDraw();

    void zeroSharedMemory();

    void zoomBy(float f, Point point, ZoomByResponse zoomByResponse);
}
