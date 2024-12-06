package org.chromium.media.mojom;

import org.chromium.mojo.bindings.AssociatedInterfaceNotSupported;
import org.chromium.mojo.bindings.AssociatedInterfaceRequestNotSupported;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface GpuAcceleratedVideoDecoderProvider extends Interface {
    public static final Manager<GpuAcceleratedVideoDecoderProvider, Proxy> MANAGER = GpuAcceleratedVideoDecoderProvider_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface CreateAcceleratedVideoDecoderResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends GpuAcceleratedVideoDecoderProvider, Interface.Proxy {
    }

    void createAcceleratedVideoDecoder(VideoDecodeAcceleratorConfig videoDecodeAcceleratorConfig, AssociatedInterfaceRequestNotSupported associatedInterfaceRequestNotSupported, AssociatedInterfaceNotSupported associatedInterfaceNotSupported, CreateAcceleratedVideoDecoderResponse createAcceleratedVideoDecoderResponse);
}
