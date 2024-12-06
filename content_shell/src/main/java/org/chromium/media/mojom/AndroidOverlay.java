package org.chromium.media.mojom;

import org.chromium.gfx.mojom.Rect;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface AndroidOverlay extends Interface {
    public static final Manager<AndroidOverlay, Proxy> MANAGER = AndroidOverlay_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends AndroidOverlay, Interface.Proxy {
    }

    void scheduleLayout(Rect rect);
}
