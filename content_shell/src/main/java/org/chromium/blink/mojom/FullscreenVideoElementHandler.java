package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface FullscreenVideoElementHandler extends Interface {
    public static final Manager<FullscreenVideoElementHandler, Proxy> MANAGER = FullscreenVideoElementHandler_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends FullscreenVideoElementHandler, Interface.Proxy {
    }

    void requestFullscreenVideoElement();
}
