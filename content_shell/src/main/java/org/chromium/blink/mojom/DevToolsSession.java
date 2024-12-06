package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.ReadOnlyBuffer;
/* loaded from: classes2.dex */
public interface DevToolsSession extends Interface {
    public static final Manager<DevToolsSession, Proxy> MANAGER = DevToolsSession_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends DevToolsSession, Interface.Proxy {
    }

    void dispatchProtocolCommand(int i, String str, ReadOnlyBuffer readOnlyBuffer);
}
