package org.chromium.viz.mojom;

import org.chromium.gpu.mojom.Mailbox;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.ReadOnlySharedMemoryRegion;
/* loaded from: classes2.dex */
public interface FrameSinkBundle extends Interface {
    public static final Manager<FrameSinkBundle, Proxy> MANAGER = FrameSinkBundle_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends FrameSinkBundle, Interface.Proxy {
    }

    void didAllocateSharedBitmap(int i, ReadOnlySharedMemoryRegion readOnlySharedMemoryRegion, Mailbox mailbox);

    void initializeCompositorFrameSinkType(int i, int i2);

    void setNeedsBeginFrame(int i, boolean z);

    void submit(BundledFrameSubmission[] bundledFrameSubmissionArr);
}
