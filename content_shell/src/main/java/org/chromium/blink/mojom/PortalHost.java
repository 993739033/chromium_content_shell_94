package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface PortalHost extends Interface {
    public static final Manager<PortalHost, Proxy> MANAGER = PortalHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends PortalHost, Interface.Proxy {
    }

    void postMessageToHost(TransferableMessage transferableMessage);
}
