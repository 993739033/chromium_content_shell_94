package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface ServiceWorkerObjectHost extends Interface {
    public static final Manager<ServiceWorkerObjectHost, Proxy> MANAGER = ServiceWorkerObjectHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends ServiceWorkerObjectHost, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface TerminateForTestingResponse extends Callbacks.Callback0 {
    }

    void postMessageToServiceWorker(TransferableMessage transferableMessage);

    void terminateForTesting(TerminateForTestingResponse terminateForTestingResponse);
}
