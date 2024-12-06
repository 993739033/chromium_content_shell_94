package org.chromium.service_manager.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface ServiceManager extends Interface {
    public static final Manager<ServiceManager, Proxy> MANAGER = ServiceManager_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends ServiceManager, Interface.Proxy {
    }

    void addListener(ServiceManagerListener serviceManagerListener);
}
