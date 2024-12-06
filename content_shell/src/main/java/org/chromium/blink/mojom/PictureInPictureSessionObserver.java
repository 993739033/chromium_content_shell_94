package org.chromium.blink.mojom;

import org.chromium.gfx.mojom.Size;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface PictureInPictureSessionObserver extends Interface {
    public static final Manager<PictureInPictureSessionObserver, Proxy> MANAGER = PictureInPictureSessionObserver_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends PictureInPictureSessionObserver, Interface.Proxy {
    }

    void onStopped();

    void onWindowSizeChanged(Size size);
}
