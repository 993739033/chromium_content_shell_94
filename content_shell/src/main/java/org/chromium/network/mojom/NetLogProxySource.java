package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface NetLogProxySource extends Interface {
    public static final Manager<NetLogProxySource, Proxy> MANAGER = NetLogProxySource_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends NetLogProxySource, Interface.Proxy {
    }

    void updateCaptureModes(int i);
}
