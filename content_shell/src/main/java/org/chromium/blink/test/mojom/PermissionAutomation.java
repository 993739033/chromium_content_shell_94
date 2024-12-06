package org.chromium.blink.test.mojom;

import org.chromium.blink.mojom.PermissionDescriptor;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface PermissionAutomation extends Interface {
    public static final Manager<PermissionAutomation, Proxy> MANAGER = PermissionAutomation_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends PermissionAutomation, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface SetPermissionResponse extends Callbacks.Callback1<Boolean> {
    }

    void setPermission(PermissionDescriptor permissionDescriptor, int i, Url url, Url url2, SetPermissionResponse setPermissionResponse);
}
