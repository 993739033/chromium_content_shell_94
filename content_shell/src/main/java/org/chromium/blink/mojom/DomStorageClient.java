package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface DomStorageClient extends Interface {
    public static final Manager<DomStorageClient, Proxy> MANAGER = DomStorageClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends DomStorageClient, Interface.Proxy {
    }

    void resetStorageAreaAndNamespaceConnections();
}
