package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface ComputePressureHost extends Interface {
    public static final Manager<ComputePressureHost, Proxy> MANAGER = ComputePressureHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface AddObserverResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends ComputePressureHost, Interface.Proxy {
    }

    void addObserver(ComputePressureObserver computePressureObserver, ComputePressureQuantization computePressureQuantization, AddObserverResponse addObserverResponse);
}
