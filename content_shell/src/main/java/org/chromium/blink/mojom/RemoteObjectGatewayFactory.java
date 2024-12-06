package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
/* loaded from: classes2.dex */
public interface RemoteObjectGatewayFactory extends Interface {
    public static final Manager<RemoteObjectGatewayFactory, Proxy> MANAGER = RemoteObjectGatewayFactory_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends RemoteObjectGatewayFactory, Interface.Proxy {
    }

    void createRemoteObjectGateway(RemoteObjectHost remoteObjectHost, InterfaceRequest<RemoteObjectGateway> interfaceRequest);
}
