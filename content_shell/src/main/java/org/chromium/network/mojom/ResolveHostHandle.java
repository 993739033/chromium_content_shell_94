package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface ResolveHostHandle extends Interface {
    public static final Manager<ResolveHostHandle, Proxy> MANAGER = ResolveHostHandle_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends ResolveHostHandle, Interface.Proxy {
    }

    void cancel(int i);
}
