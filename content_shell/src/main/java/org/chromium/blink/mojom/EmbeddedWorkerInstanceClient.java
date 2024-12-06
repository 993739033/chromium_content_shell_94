package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface EmbeddedWorkerInstanceClient extends Interface {
    public static final Manager<EmbeddedWorkerInstanceClient, Proxy> MANAGER = EmbeddedWorkerInstanceClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends EmbeddedWorkerInstanceClient, Interface.Proxy {
    }

    void startWorker(EmbeddedWorkerStartParams embeddedWorkerStartParams);

    void stopWorker();
}
