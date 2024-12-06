package org.chromium.device.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface BatteryMonitor extends Interface {
    public static final Manager<BatteryMonitor, Proxy> MANAGER = BatteryMonitor_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends BatteryMonitor, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface QueryNextStatusResponse extends Callbacks.Callback1<BatteryStatus> {
    }

    void queryNextStatus(QueryNextStatusResponse queryNextStatusResponse);
}
