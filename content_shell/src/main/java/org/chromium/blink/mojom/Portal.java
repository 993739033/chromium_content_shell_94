package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.TimeTicks;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface Portal extends Interface {
    public static final Manager<Portal, Proxy> MANAGER = Portal_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface ActivateResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface NavigateResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends Portal, Interface.Proxy {
    }

    void activate(TransferableMessage transferableMessage, TimeTicks timeTicks, long j, ActivateResponse activateResponse);

    void navigate(Url url, Referrer referrer, NavigateResponse navigateResponse);

    void postMessageToGuest(TransferableMessage transferableMessage);
}
