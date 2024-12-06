package org.chromium.blink.mojom;

import org.chromium.device.mojom.WakeLock;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
/* loaded from: classes2.dex */
public interface WakeLockService extends Interface {
    public static final Manager<WakeLockService, Proxy> MANAGER = WakeLockService_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends WakeLockService, Interface.Proxy {
    }

    void getWakeLock(int i, int i2, String str, InterfaceRequest<WakeLock> interfaceRequest);
}
