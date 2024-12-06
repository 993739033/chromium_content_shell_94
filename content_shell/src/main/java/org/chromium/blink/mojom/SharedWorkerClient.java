package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface SharedWorkerClient extends Interface {
    public static final Manager<SharedWorkerClient, Proxy> MANAGER = SharedWorkerClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends SharedWorkerClient, Interface.Proxy {
    }

    void onConnected(int[] iArr);

    void onCreated(int i);

    void onFeatureUsed(int i);

    void onScriptLoadFailed(String str);
}
