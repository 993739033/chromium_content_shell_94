package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
/* loaded from: classes2.dex */
public interface CookieAccessObserver extends Interface {
    public static final Manager<CookieAccessObserver, Proxy> MANAGER = CookieAccessObserver_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends CookieAccessObserver, Interface.Proxy {
    }

    void clone(InterfaceRequest<CookieAccessObserver> interfaceRequest);

    void onCookiesAccessed(CookieAccessDetails cookieAccessDetails);
}
