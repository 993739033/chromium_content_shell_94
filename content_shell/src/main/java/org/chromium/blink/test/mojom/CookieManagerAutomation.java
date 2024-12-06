package org.chromium.blink.test.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface CookieManagerAutomation extends Interface {
    public static final Manager<CookieManagerAutomation, Proxy> MANAGER = CookieManagerAutomation_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface DeleteAllCookiesResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends CookieManagerAutomation, Interface.Proxy {
    }

    void deleteAllCookies(DeleteAllCookiesResponse deleteAllCookiesResponse);
}
