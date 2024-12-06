package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface IdleMonitor extends Interface {
    public static final Manager<IdleMonitor, Proxy> MANAGER = IdleMonitor_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends IdleMonitor, Interface.Proxy {
    }

    void update(IdleState idleState);
}
