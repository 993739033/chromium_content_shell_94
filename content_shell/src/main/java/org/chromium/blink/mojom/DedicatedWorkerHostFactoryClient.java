package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
/* loaded from: classes2.dex */
public interface DedicatedWorkerHostFactoryClient extends Interface {
    public static final Manager<DedicatedWorkerHostFactoryClient, Proxy> MANAGER = DedicatedWorkerHostFactoryClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends DedicatedWorkerHostFactoryClient, Interface.Proxy {
    }

    void onScriptLoadStartFailed();

    void onScriptLoadStarted(ServiceWorkerContainerInfoForClient serviceWorkerContainerInfoForClient, WorkerMainScriptLoadParams workerMainScriptLoadParams, UrlLoaderFactoryBundle urlLoaderFactoryBundle, InterfaceRequest<SubresourceLoaderUpdater> interfaceRequest, ControllerServiceWorkerInfo controllerServiceWorkerInfo);

    void onWorkerHostCreated(BrowserInterfaceBroker browserInterfaceBroker, DedicatedWorkerHost dedicatedWorkerHost);
}
