package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface SocketObserver extends Interface {
    public static final Manager<SocketObserver, Proxy> MANAGER = SocketObserver_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends SocketObserver, Interface.Proxy {
    }

    void onReadError(int i);

    void onWriteError(int i);
}
