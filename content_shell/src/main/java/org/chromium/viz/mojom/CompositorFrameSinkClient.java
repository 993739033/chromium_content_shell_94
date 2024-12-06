package org.chromium.viz.mojom;

import java.util.Map;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface CompositorFrameSinkClient extends Interface {
    public static final Manager<CompositorFrameSinkClient, Proxy> MANAGER = CompositorFrameSinkClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends CompositorFrameSinkClient, Interface.Proxy {
    }

    void didReceiveCompositorFrameAck(ReturnedResource[] returnedResourceArr);

    void onBeginFrame(BeginFrameArgs beginFrameArgs, Map<Integer, FrameTimingDetails> map);

    void onBeginFramePausedChanged(boolean z);

    void onCompositorFrameTransitionDirectiveProcessed(int i);

    void reclaimResources(ReturnedResource[] returnedResourceArr);
}
