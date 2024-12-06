package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface ModalCloseListener extends Interface {
    public static final Manager<ModalCloseListener, Proxy> MANAGER = ModalCloseListener_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends ModalCloseListener, Interface.Proxy {
    }

    void signal();
}
