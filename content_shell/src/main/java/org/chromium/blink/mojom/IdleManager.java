package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.TimeDelta;
/* loaded from: classes2.dex */
public interface IdleManager extends Interface {
    public static final Manager<IdleManager, Proxy> MANAGER = IdleManager_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface AddMonitorResponse extends Callbacks.Callback2<Integer, IdleState> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends IdleManager, Interface.Proxy {
    }

    void addMonitor(TimeDelta timeDelta, IdleMonitor idleMonitor, AddMonitorResponse addMonitorResponse);
}
