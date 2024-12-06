package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface NonPersistentNotificationListener extends Interface {
    public static final Manager<NonPersistentNotificationListener, Proxy> MANAGER = NonPersistentNotificationListener_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface OnClickResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface OnCloseResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends NonPersistentNotificationListener, Interface.Proxy {
    }

    void onClick(OnClickResponse onClickResponse);

    void onClose(OnCloseResponse onCloseResponse);

    void onShow();
}
