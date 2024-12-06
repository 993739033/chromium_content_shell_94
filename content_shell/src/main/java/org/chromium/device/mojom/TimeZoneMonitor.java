package org.chromium.device.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface TimeZoneMonitor extends Interface {
    public static final Manager<TimeZoneMonitor, Proxy> MANAGER = TimeZoneMonitor_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends TimeZoneMonitor, Interface.Proxy {
    }

    void addClient(TimeZoneMonitorClient timeZoneMonitorClient);
}
