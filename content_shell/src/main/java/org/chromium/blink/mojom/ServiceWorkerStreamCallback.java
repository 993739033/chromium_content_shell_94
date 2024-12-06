package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface ServiceWorkerStreamCallback extends Interface {
    public static final Manager<ServiceWorkerStreamCallback, Proxy> MANAGER = ServiceWorkerStreamCallback_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends ServiceWorkerStreamCallback, Interface.Proxy {
    }

    void onAborted();

    void onCompleted();
}
