package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface CookieChangeListener extends Interface {
    public static final Manager<CookieChangeListener, Proxy> MANAGER = CookieChangeListener_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends CookieChangeListener, Interface.Proxy {
    }

    void onCookieChange(CookieChangeInfo cookieChangeInfo);
}
