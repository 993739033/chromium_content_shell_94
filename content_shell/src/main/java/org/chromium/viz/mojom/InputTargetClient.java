package org.chromium.viz.mojom;

import org.chromium.gfx.mojom.PointF;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface InputTargetClient extends Interface {
    public static final Manager<InputTargetClient, Proxy> MANAGER = InputTargetClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface FrameSinkIdAtResponse extends Callbacks.Callback2<FrameSinkId, PointF> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends InputTargetClient, Interface.Proxy {
    }

    void frameSinkIdAt(PointF pointF, long j, FrameSinkIdAtResponse frameSinkIdAtResponse);
}
