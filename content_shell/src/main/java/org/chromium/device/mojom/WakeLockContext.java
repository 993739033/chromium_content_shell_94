package org.chromium.device.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
/* loaded from: classes2.dex */
public interface WakeLockContext extends Interface {
    public static final Manager<WakeLockContext, Proxy> MANAGER = WakeLockContext_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends WakeLockContext, Interface.Proxy {
    }

    void getWakeLock(int i, int i2, String str, InterfaceRequest<WakeLock> interfaceRequest);
}
