package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface ServiceWorkerObject extends Interface {
    public static final Manager<ServiceWorkerObject, Proxy> MANAGER = ServiceWorkerObject_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends ServiceWorkerObject, Interface.Proxy {
    }

    void stateChanged(int i);
}
