package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.GenericPendingReceiver;
/* loaded from: classes2.dex */
public interface BrowserInterfaceBroker extends Interface {
    public static final Manager<BrowserInterfaceBroker, Proxy> MANAGER = BrowserInterfaceBroker_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends BrowserInterfaceBroker, Interface.Proxy {
    }

    void getInterface(GenericPendingReceiver genericPendingReceiver);
}
