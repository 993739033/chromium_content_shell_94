package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.AssociatedInterfaceNotSupported;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface LockRequest extends Interface {
    public static final Manager<LockRequest, Proxy> MANAGER = LockRequest_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends LockRequest, Interface.Proxy {
    }

    void abort(String str);

    void failed();

    void granted(AssociatedInterfaceNotSupported associatedInterfaceNotSupported);
}
