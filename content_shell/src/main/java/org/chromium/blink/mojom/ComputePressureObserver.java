package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface ComputePressureObserver extends Interface {
    public static final Manager<ComputePressureObserver, Proxy> MANAGER = ComputePressureObserver_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends ComputePressureObserver, Interface.Proxy {
    }

    void onUpdate(ComputePressureState computePressureState);
}
