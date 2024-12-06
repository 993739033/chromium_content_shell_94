package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface PermissionService extends Interface {
    public static final Manager<PermissionService, Proxy> MANAGER = PermissionService_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface HasPermissionResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends PermissionService, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface RequestPermissionResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface RequestPermissionsResponse extends Callbacks.Callback1<int[]> {
    }

    /* loaded from: classes2.dex */
    public interface RevokePermissionResponse extends Callbacks.Callback1<Integer> {
    }

    void addPermissionObserver(PermissionDescriptor permissionDescriptor, int i, PermissionObserver permissionObserver);

    void hasPermission(PermissionDescriptor permissionDescriptor, HasPermissionResponse hasPermissionResponse);

    void requestPermission(PermissionDescriptor permissionDescriptor, boolean z, RequestPermissionResponse requestPermissionResponse);

    void requestPermissions(PermissionDescriptor[] permissionDescriptorArr, boolean z, RequestPermissionsResponse requestPermissionsResponse);

    void revokePermission(PermissionDescriptor permissionDescriptor, RevokePermissionResponse revokePermissionResponse);
}
