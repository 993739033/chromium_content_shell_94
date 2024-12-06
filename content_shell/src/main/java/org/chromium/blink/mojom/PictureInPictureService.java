package org.chromium.blink.mojom;

import org.chromium.gfx.mojom.Size;
import org.chromium.mojo.bindings.AssociatedInterfaceNotSupported;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.viz.mojom.SurfaceId;
/* loaded from: classes2.dex */
public interface PictureInPictureService extends Interface {
    public static final Manager<PictureInPictureService, Proxy> MANAGER = PictureInPictureService_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends PictureInPictureService, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface StartSessionResponse extends Callbacks.Callback2<PictureInPictureSession, Size> {
    }

    void startSession(int i, AssociatedInterfaceNotSupported associatedInterfaceNotSupported, SurfaceId surfaceId, Size size, boolean z, PictureInPictureSessionObserver pictureInPictureSessionObserver, StartSessionResponse startSessionResponse);
}
