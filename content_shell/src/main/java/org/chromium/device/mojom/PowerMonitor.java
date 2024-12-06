package org.chromium.device.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface PowerMonitor extends Interface {
    public static final Manager<PowerMonitor, Proxy> MANAGER = PowerMonitor_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends PowerMonitor, Interface.Proxy {
    }

    void addClient(PowerMonitorClient powerMonitorClient);
}
