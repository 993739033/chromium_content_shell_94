package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface SessionStorageNamespace extends Interface {
    public static final Manager<SessionStorageNamespace, Proxy> MANAGER = SessionStorageNamespace_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends SessionStorageNamespace, Interface.Proxy {
    }

    void clone(String str);
}
