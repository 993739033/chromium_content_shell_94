package org.chromium.media.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
/* loaded from: classes2.dex */
public interface AndroidOverlayProvider extends Interface {
    public static final Manager<AndroidOverlayProvider, Proxy> MANAGER = AndroidOverlayProvider_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends AndroidOverlayProvider, Interface.Proxy {
    }

    void createOverlay(InterfaceRequest<AndroidOverlay> interfaceRequest, AndroidOverlayClient androidOverlayClient, AndroidOverlayConfig androidOverlayConfig);
}
