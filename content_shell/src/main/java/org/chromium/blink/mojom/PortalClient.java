package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.url.internal.mojom.Origin;
/* loaded from: classes2.dex */
public interface PortalClient extends Interface {
    public static final Manager<PortalClient, Proxy> MANAGER = PortalClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends PortalClient, Interface.Proxy {
    }

    void dispatchLoadEvent();

    void forwardMessageFromGuest(TransferableMessage transferableMessage, Origin origin);
}
