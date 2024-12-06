package org.chromium.device.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
/* loaded from: classes2.dex */
public interface WakeLock extends Interface {
    public static final Manager<WakeLock, Proxy> MANAGER = WakeLock_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface ChangeTypeResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface HasWakeLockForTestsResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends WakeLock, Interface.Proxy {
    }

    void addClient(InterfaceRequest<WakeLock> interfaceRequest);

    void cancelWakeLock();

    void changeType(int i, ChangeTypeResponse changeTypeResponse);

    void hasWakeLockForTests(HasWakeLockForTestsResponse hasWakeLockForTestsResponse);

    void requestWakeLock();
}
