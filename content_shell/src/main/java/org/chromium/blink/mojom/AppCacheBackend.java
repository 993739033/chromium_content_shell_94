package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo_base.mojom.UnguessableToken;
/* loaded from: classes2.dex */
public interface AppCacheBackend extends Interface {
    public static final Manager<AppCacheBackend, Proxy> MANAGER = AppCacheBackend_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends AppCacheBackend, Interface.Proxy {
    }

    void registerHost(InterfaceRequest<AppCacheHost> interfaceRequest, AppCacheFrontend appCacheFrontend, UnguessableToken unguessableToken);
}
