package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface ServiceWorkerWorkerClient extends Interface {
    public static final Manager<ServiceWorkerWorkerClient, Proxy> MANAGER = ServiceWorkerWorkerClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends ServiceWorkerWorkerClient, Interface.Proxy {
    }

    void onControllerChanged(int i);
}
