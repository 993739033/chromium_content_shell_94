package org.chromium.device.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
/* loaded from: classes2.dex */
public interface WakeLockProvider extends Interface {
    public static final Manager<WakeLockProvider, Proxy> MANAGER = WakeLockProvider_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetActiveWakeLocksForTestsResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends WakeLockProvider, Interface.Proxy {
    }

    void getActiveWakeLocksForTests(int i, GetActiveWakeLocksForTestsResponse getActiveWakeLocksForTestsResponse);

    void getWakeLockContextForId(int i, InterfaceRequest<WakeLockContext> interfaceRequest);

    void getWakeLockWithoutContext(int i, int i2, String str, InterfaceRequest<WakeLock> interfaceRequest);

    void notifyOnWakeLockDeactivation(int i, WakeLockObserver wakeLockObserver);
}
