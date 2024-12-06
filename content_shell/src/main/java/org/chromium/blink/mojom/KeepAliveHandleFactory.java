package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
/* loaded from: classes2.dex */
public interface KeepAliveHandleFactory extends Interface {
    public static final Manager<KeepAliveHandleFactory, Proxy> MANAGER = KeepAliveHandleFactory_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends KeepAliveHandleFactory, Interface.Proxy {
    }

    void issueKeepAliveHandle(InterfaceRequest<KeepAliveHandle> interfaceRequest);
}
