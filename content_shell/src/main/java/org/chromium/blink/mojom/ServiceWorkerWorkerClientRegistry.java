package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
/* loaded from: classes2.dex */
public interface ServiceWorkerWorkerClientRegistry extends Interface {
    public static final Manager<ServiceWorkerWorkerClientRegistry, Proxy> MANAGER = ServiceWorkerWorkerClientRegistry_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends ServiceWorkerWorkerClientRegistry, Interface.Proxy {
    }

    void cloneWorkerClientRegistry(InterfaceRequest<ServiceWorkerWorkerClientRegistry> interfaceRequest);

    void registerWorkerClient(ServiceWorkerWorkerClient serviceWorkerWorkerClient);
}
