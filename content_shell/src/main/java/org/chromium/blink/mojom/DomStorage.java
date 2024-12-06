package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.url.internal.mojom.Origin;
/* loaded from: classes2.dex */
public interface DomStorage extends Interface {
    public static final Manager<DomStorage, Proxy> MANAGER = DomStorage_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends DomStorage, Interface.Proxy {
    }

    void bindSessionStorageArea(Origin origin, String str, InterfaceRequest<StorageArea> interfaceRequest);

    void bindSessionStorageNamespace(String str, InterfaceRequest<SessionStorageNamespace> interfaceRequest);

    void openLocalStorage(Origin origin, InterfaceRequest<StorageArea> interfaceRequest);
}
