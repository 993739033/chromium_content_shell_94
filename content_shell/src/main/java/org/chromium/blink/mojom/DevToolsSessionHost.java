package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface DevToolsSessionHost extends Interface {
    public static final Manager<DevToolsSessionHost, Proxy> MANAGER = DevToolsSessionHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends DevToolsSessionHost, Interface.Proxy {
    }

    void dispatchProtocolNotification(DevToolsMessage devToolsMessage, DevToolsSessionState devToolsSessionState);

    void dispatchProtocolResponse(DevToolsMessage devToolsMessage, int i, DevToolsSessionState devToolsSessionState);
}
