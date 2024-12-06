package org.chromium.device.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface PowerMonitorClient extends Interface {
    public static final Manager<PowerMonitorClient, Proxy> MANAGER = PowerMonitorClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends PowerMonitorClient, Interface.Proxy {
    }

    void powerStateChange(boolean z);

    void resume();

    void suspend();
}
