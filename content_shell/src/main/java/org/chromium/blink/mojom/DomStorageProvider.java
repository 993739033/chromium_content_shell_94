package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
/* loaded from: classes2.dex */
public interface DomStorageProvider extends Interface {
    public static final Manager<DomStorageProvider, Proxy> MANAGER = DomStorageProvider_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends DomStorageProvider, Interface.Proxy {
    }

    void bindDomStorage(InterfaceRequest<DomStorage> interfaceRequest, DomStorageClient domStorageClient);
}
