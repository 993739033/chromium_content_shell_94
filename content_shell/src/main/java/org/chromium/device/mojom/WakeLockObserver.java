package org.chromium.device.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface WakeLockObserver extends Interface {
    public static final Manager<WakeLockObserver, Proxy> MANAGER = WakeLockObserver_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends WakeLockObserver, Interface.Proxy {
    }

    void onWakeLockDeactivated(int i);
}
