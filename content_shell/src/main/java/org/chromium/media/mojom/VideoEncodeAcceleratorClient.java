package org.chromium.media.mojom;

import org.chromium.gfx.mojom.Size;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface VideoEncodeAcceleratorClient extends Interface {
    public static final Manager<VideoEncodeAcceleratorClient, Proxy> MANAGER = VideoEncodeAcceleratorClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends VideoEncodeAcceleratorClient, Interface.Proxy {
    }

    void bitstreamBufferReady(int i, BitstreamBufferMetadata bitstreamBufferMetadata);

    void notifyEncoderInfoChange(VideoEncoderInfo videoEncoderInfo);

    void notifyError(int i);

    void requireBitstreamBuffers(int i, Size size, int i2);
}
