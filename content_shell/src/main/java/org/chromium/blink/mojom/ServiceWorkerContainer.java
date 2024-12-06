package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface ServiceWorkerContainer extends Interface {
    public static final Manager<ServiceWorkerContainer, Proxy> MANAGER = ServiceWorkerContainer_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends ServiceWorkerContainer, Interface.Proxy {
    }

    void countFeature(int i);

    void postMessageToClient(ServiceWorkerObjectInfo serviceWorkerObjectInfo, TransferableMessage transferableMessage);

    void setController(ControllerServiceWorkerInfo controllerServiceWorkerInfo, boolean z);
}
