package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo_base.mojom.UnguessableToken;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface DevToolsAgentHost extends Interface {
    public static final Manager<DevToolsAgentHost, Proxy> MANAGER = DevToolsAgentHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends DevToolsAgentHost, Interface.Proxy {
    }

    void childWorkerCreated(DevToolsAgent devToolsAgent, InterfaceRequest<DevToolsAgentHost> interfaceRequest, Url url, String str, UnguessableToken unguessableToken, boolean z);
}
