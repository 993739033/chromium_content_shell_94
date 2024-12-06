package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
/* loaded from: classes2.dex */
public interface SharedWorkerHost extends Interface {
    public static final Manager<SharedWorkerHost, Proxy> MANAGER = SharedWorkerHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends SharedWorkerHost, Interface.Proxy {
    }

    void onConnected(int i);

    void onContextClosed();

    void onFeatureUsed(int i);

    void onReadyForInspection(DevToolsAgent devToolsAgent, InterfaceRequest<DevToolsAgentHost> interfaceRequest);

    void onScriptLoadFailed(String str);
}
