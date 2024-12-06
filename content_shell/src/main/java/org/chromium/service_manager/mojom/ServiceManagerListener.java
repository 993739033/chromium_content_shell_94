package org.chromium.service_manager.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface ServiceManagerListener extends Interface {
    public static final Manager<ServiceManagerListener, Proxy> MANAGER = ServiceManagerListener_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends ServiceManagerListener, Interface.Proxy {
    }

    void onInit(RunningServiceInfo[] runningServiceInfoArr);

    void onServiceCreated(RunningServiceInfo runningServiceInfo);

    void onServiceFailedToStart(Identity identity);

    void onServicePidReceived(Identity identity, int i);

    void onServiceStarted(Identity identity, int i);

    void onServiceStopped(Identity identity);
}
