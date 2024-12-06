package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface SharedWorker extends Interface {
    public static final Manager<SharedWorker, Proxy> MANAGER = SharedWorker_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends SharedWorker, Interface.Proxy {
    }

    void connect(int i, MessagePortDescriptor messagePortDescriptor);

    void terminate();
}
