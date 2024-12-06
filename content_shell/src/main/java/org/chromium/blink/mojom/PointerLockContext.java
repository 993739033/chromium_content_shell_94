package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface PointerLockContext extends Interface {
    public static final Manager<PointerLockContext, Proxy> MANAGER = PointerLockContext_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends PointerLockContext, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface RequestMouseLockChangeResponse extends Callbacks.Callback1<Integer> {
    }

    void requestMouseLockChange(boolean z, RequestMouseLockChangeResponse requestMouseLockChangeResponse);
}
