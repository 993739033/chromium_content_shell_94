package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface PermissionObserver extends Interface {
    public static final Manager<PermissionObserver, Proxy> MANAGER = PermissionObserver_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends PermissionObserver, Interface.Proxy {
    }

    void onPermissionStatusChange(int i);
}
