package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface ControllerServiceWorkerConnector extends Interface {
    public static final Manager<ControllerServiceWorkerConnector, Proxy> MANAGER = ControllerServiceWorkerConnector_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends ControllerServiceWorkerConnector, Interface.Proxy {
    }

    void updateController(ControllerServiceWorker controllerServiceWorker);
}
