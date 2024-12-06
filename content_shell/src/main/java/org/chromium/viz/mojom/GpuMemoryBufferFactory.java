package org.chromium.viz.mojom;

import org.chromium.gfx.mojom.GpuMemoryBufferHandle;
import org.chromium.gfx.mojom.GpuMemoryBufferId;
import org.chromium.gfx.mojom.Size;
import org.chromium.gpu.mojom.SyncToken;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.UnsafeSharedMemoryRegion;
/* loaded from: classes2.dex */
public interface GpuMemoryBufferFactory extends Interface {
    public static final Manager<GpuMemoryBufferFactory, Proxy> MANAGER = GpuMemoryBufferFactory_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface CopyGpuMemoryBufferResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface CreateGpuMemoryBufferResponse extends Callbacks.Callback1<GpuMemoryBufferHandle> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends GpuMemoryBufferFactory, Interface.Proxy {
    }

    void copyGpuMemoryBuffer(GpuMemoryBufferHandle gpuMemoryBufferHandle, UnsafeSharedMemoryRegion unsafeSharedMemoryRegion, CopyGpuMemoryBufferResponse copyGpuMemoryBufferResponse);

    void createGpuMemoryBuffer(GpuMemoryBufferId gpuMemoryBufferId, Size size, int i, int i2, CreateGpuMemoryBufferResponse createGpuMemoryBufferResponse);

    void destroyGpuMemoryBuffer(GpuMemoryBufferId gpuMemoryBufferId, SyncToken syncToken);
}
