package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.network.mojom.CrossOriginEmbedderPolicy;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface DedicatedWorkerHostFactory extends Interface {
    public static final Manager<DedicatedWorkerHostFactory, Proxy> MANAGER = DedicatedWorkerHostFactory_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface CreateWorkerHostResponse extends Callbacks.Callback1<CrossOriginEmbedderPolicy> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends DedicatedWorkerHostFactory, Interface.Proxy {
    }

    void createWorkerHost(DedicatedWorkerToken dedicatedWorkerToken, Url url, InterfaceRequest<BrowserInterfaceBroker> interfaceRequest, InterfaceRequest<DedicatedWorkerHost> interfaceRequest2, CreateWorkerHostResponse createWorkerHostResponse);

    void createWorkerHostAndStartScriptLoad(DedicatedWorkerToken dedicatedWorkerToken, Url url, int i, FetchClientSettingsObject fetchClientSettingsObject, BlobUrlToken blobUrlToken, DedicatedWorkerHostFactoryClient dedicatedWorkerHostFactoryClient);
}
