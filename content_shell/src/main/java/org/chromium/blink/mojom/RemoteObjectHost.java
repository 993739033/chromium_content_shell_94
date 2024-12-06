package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
/* loaded from: classes2.dex */
public interface RemoteObjectHost extends Interface {
    public static final Manager<RemoteObjectHost, Proxy> MANAGER = RemoteObjectHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends RemoteObjectHost, Interface.Proxy {
    }

    void acquireObject(int i);

    void getObject(int i, InterfaceRequest<RemoteObject> interfaceRequest);

    void releaseObject(int i);
}
