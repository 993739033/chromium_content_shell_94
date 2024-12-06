package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.AssociatedInterfaceNotSupported;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface DevToolsFrontend extends Interface {
    public static final Manager<DevToolsFrontend, Proxy> MANAGER = DevToolsFrontend_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends DevToolsFrontend, Interface.Proxy {
    }

    void setupDevToolsExtensionApi(String str);

    void setupDevToolsFrontend(String str, AssociatedInterfaceNotSupported associatedInterfaceNotSupported);
}
