package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.network.mojom.CrossOriginEmbedderPolicy;
import org.chromium.network.mojom.CrossOriginEmbedderPolicyReporter;
/* loaded from: classes2.dex */
public interface ControllerServiceWorker extends Interface {
    public static final Manager<ControllerServiceWorker, Proxy> MANAGER = ControllerServiceWorker_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface DispatchFetchEventForSubresourceResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends ControllerServiceWorker, Interface.Proxy {
    }

    void clone(InterfaceRequest<ControllerServiceWorker> interfaceRequest, CrossOriginEmbedderPolicy crossOriginEmbedderPolicy, CrossOriginEmbedderPolicyReporter crossOriginEmbedderPolicyReporter);

    void dispatchFetchEventForSubresource(DispatchFetchEventParams dispatchFetchEventParams, ServiceWorkerFetchResponseCallback serviceWorkerFetchResponseCallback, DispatchFetchEventForSubresourceResponse dispatchFetchEventForSubresourceResponse);
}
