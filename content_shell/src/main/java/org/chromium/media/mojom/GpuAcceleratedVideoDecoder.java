package org.chromium.media.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface GpuAcceleratedVideoDecoder extends Interface {
    public static final Manager<GpuAcceleratedVideoDecoder, Proxy> MANAGER = GpuAcceleratedVideoDecoder_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface FlushResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends GpuAcceleratedVideoDecoder, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface ResetResponse extends Callbacks.Callback0 {
    }

    void assignPictureBuffers(PictureBufferAssignment[] pictureBufferAssignmentArr);

    void decode(BitstreamBuffer bitstreamBuffer);

    void flush(FlushResponse flushResponse);

    void reset(ResetResponse resetResponse);

    void reusePictureBuffer(int i);

    void setOverlayInfo(OverlayInfo overlayInfo);
}
