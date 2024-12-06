package org.chromium.service_manager.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface ServiceControl extends Interface {
    public static final Manager<ServiceControl, Proxy> MANAGER = ServiceControl_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends ServiceControl, Interface.Proxy {
    }

    void requestQuit();
}
