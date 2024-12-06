package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface RemoteObjectGateway extends Interface {
    public static final Manager<RemoteObjectGateway, Proxy> MANAGER = RemoteObjectGateway_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends RemoteObjectGateway, Interface.Proxy {
    }

    void addNamedObject(String str, int i);

    void removeNamedObject(String str);
}
