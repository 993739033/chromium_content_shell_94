package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.AssociatedInterfaceRequestNotSupported;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface AssociatedInterfaceProvider extends Interface {
    public static final Manager<AssociatedInterfaceProvider, Proxy> MANAGER = AssociatedInterfaceProvider_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends AssociatedInterfaceProvider, Interface.Proxy {
    }

    void getAssociatedInterface(String str, AssociatedInterfaceRequestNotSupported associatedInterfaceRequestNotSupported);
}
