package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface SharedWorkerConnector extends Interface {
    public static final Manager<SharedWorkerConnector, Proxy> MANAGER = SharedWorkerConnector_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends SharedWorkerConnector, Interface.Proxy {
    }

    void connect(SharedWorkerInfo sharedWorkerInfo, SharedWorkerClient sharedWorkerClient, int i, MessagePortDescriptor messagePortDescriptor, BlobUrlToken blobUrlToken, long j);
}
