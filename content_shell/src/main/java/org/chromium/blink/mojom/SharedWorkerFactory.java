package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo_base.mojom.UnguessableToken;
import org.chromium.url.internal.mojom.Origin;
/* loaded from: classes2.dex */
public interface SharedWorkerFactory extends Interface {
    public static final Manager<SharedWorkerFactory, Proxy> MANAGER = SharedWorkerFactory_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends SharedWorkerFactory, Interface.Proxy {
    }

    void createSharedWorker(SharedWorkerInfo sharedWorkerInfo, SharedWorkerToken sharedWorkerToken, Origin origin, String str, UserAgentMetadata userAgentMetadata, boolean z, UnguessableToken unguessableToken, RendererPreferences rendererPreferences, InterfaceRequest<RendererPreferenceWatcher> interfaceRequest, WorkerContentSettingsProxy workerContentSettingsProxy, ServiceWorkerContainerInfoForClient serviceWorkerContainerInfoForClient, UnguessableToken unguessableToken2, WorkerMainScriptLoadParams workerMainScriptLoadParams, UrlLoaderFactoryBundle urlLoaderFactoryBundle, ControllerServiceWorkerInfo controllerServiceWorkerInfo, SharedWorkerHost sharedWorkerHost, InterfaceRequest<SharedWorker> interfaceRequest2, BrowserInterfaceBroker browserInterfaceBroker, long j);
}
