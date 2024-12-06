package org.chromium.media.mojom;

import org.chromium.gfx.mojom.Size;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface GpuAcceleratedVideoDecoderClient extends Interface {
    public static final Manager<GpuAcceleratedVideoDecoderClient, Proxy> MANAGER = GpuAcceleratedVideoDecoderClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends GpuAcceleratedVideoDecoderClient, Interface.Proxy {
    }

    void onBitstreamBufferProcessed(int i);

    void onDismissPictureBuffer(int i);

    void onError(int i);

    void onInitializationComplete(boolean z);

    void onPictureReady(PictureReadyParams pictureReadyParams);

    void onProvidePictureBuffers(int i, int i2, int i3, Size size, int i4);
}
