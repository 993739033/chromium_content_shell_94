package org.chromium.blink.mojom;

import org.chromium.gfx.mojom.Point;
import org.chromium.mojo.bindings.AssociatedInterfaceNotSupported;
import org.chromium.mojo.bindings.AssociatedInterfaceRequestNotSupported;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
/* loaded from: classes2.dex */
public interface DevToolsAgent extends Interface {
    public static final Manager<DevToolsAgent, Proxy> MANAGER = DevToolsAgent_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends DevToolsAgent, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface ReportChildWorkersResponse extends Callbacks.Callback0 {
    }

    void attachDevToolsSession(AssociatedInterfaceNotSupported associatedInterfaceNotSupported, AssociatedInterfaceRequestNotSupported associatedInterfaceRequestNotSupported, InterfaceRequest<DevToolsSession> interfaceRequest, DevToolsSessionState devToolsSessionState, boolean z, String str);

    void inspectElement(Point point);

    void reportChildWorkers(boolean z, boolean z2, ReportChildWorkersResponse reportChildWorkersResponse);
}
