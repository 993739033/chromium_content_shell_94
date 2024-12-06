package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface KeyboardLockService extends Interface {
    public static final Manager<KeyboardLockService, Proxy> MANAGER = KeyboardLockService_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetKeyboardLayoutMapResponse extends Callbacks.Callback1<GetKeyboardLayoutMapResult> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends KeyboardLockService, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface RequestKeyboardLockResponse extends Callbacks.Callback1<Integer> {
    }

    void cancelKeyboardLock();

    void getKeyboardLayoutMap(GetKeyboardLayoutMapResponse getKeyboardLayoutMapResponse);

    void requestKeyboardLock(String[] strArr, RequestKeyboardLockResponse requestKeyboardLockResponse);
}
