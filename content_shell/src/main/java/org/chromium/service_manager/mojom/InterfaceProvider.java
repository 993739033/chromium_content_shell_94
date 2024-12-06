package org.chromium.service_manager.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.system.MessagePipeHandle;
/* loaded from: classes2.dex */
public interface InterfaceProvider extends Interface {
    public static final Manager<InterfaceProvider, Proxy> MANAGER = InterfaceProvider_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends InterfaceProvider, Interface.Proxy {
    }

    void getInterface(String str, MessagePipeHandle messagePipeHandle);
}
