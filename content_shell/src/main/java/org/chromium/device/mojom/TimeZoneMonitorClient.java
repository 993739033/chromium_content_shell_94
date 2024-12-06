package org.chromium.device.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface TimeZoneMonitorClient extends Interface {
    public static final Manager<TimeZoneMonitorClient, Proxy> MANAGER = TimeZoneMonitorClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends TimeZoneMonitorClient, Interface.Proxy {
    }

    void onTimeZoneChange(String str);
}
