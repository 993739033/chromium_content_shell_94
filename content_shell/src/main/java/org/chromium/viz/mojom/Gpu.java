package org.chromium.viz.mojom;

import org.chromium.gpu.mojom.GpuFeatureInfo;
import org.chromium.gpu.mojom.GpuInfo;
import org.chromium.media.mojom.VideoEncodeAcceleratorProvider;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo.system.MessagePipeHandle;
/* loaded from: classes2.dex */
public interface Gpu extends Interface {
    public static final Manager<Gpu, Proxy> MANAGER = Gpu_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface EstablishGpuChannelResponse extends Callbacks.Callback4<Integer, MessagePipeHandle, GpuInfo, GpuFeatureInfo> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends Gpu, Interface.Proxy {
    }

    void createGpuMemoryBufferFactory(InterfaceRequest<GpuMemoryBufferFactory> interfaceRequest);

    void createVideoEncodeAcceleratorProvider(InterfaceRequest<VideoEncodeAcceleratorProvider> interfaceRequest);

    void establishGpuChannel(EstablishGpuChannelResponse establishGpuChannelResponse);
}
