package org.chromium.mojo_base.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface Binder extends Interface {
    public static final Manager<Binder, Proxy> MANAGER = Binder_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends Binder, Interface.Proxy {
    }

    void bind(GenericPendingReceiver genericPendingReceiver);
}
