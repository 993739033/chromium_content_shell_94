package org.chromium.blink.mojom;

import org.chromium.gfx.mojom.Size;
import org.chromium.mojo.bindings.AssociatedInterfaceNotSupported;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.viz.mojom.SurfaceId;
/* loaded from: classes2.dex */
public interface PictureInPictureSession extends Interface {
    public static final Manager<PictureInPictureSession, Proxy> MANAGER = PictureInPictureSession_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends PictureInPictureSession, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface StopResponse extends Callbacks.Callback0 {
    }

    void stop(StopResponse stopResponse);

    void update(int i, AssociatedInterfaceNotSupported associatedInterfaceNotSupported, SurfaceId surfaceId, Size size, boolean z);
}
