package org.chromium.network.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.url.internal.mojom.Origin;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface RestrictedCookieManager extends Interface {
    public static final Manager<RestrictedCookieManager, Proxy> MANAGER = RestrictedCookieManager_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface AddChangeListenerResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface CookiesEnabledForResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface GetAllForUrlResponse extends Callbacks.Callback1<CookieWithAccessResult[]> {
    }

    /* loaded from: classes2.dex */
    public interface GetCookiesStringResponse extends Callbacks.Callback1<String> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends RestrictedCookieManager, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface SetCanonicalCookieResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface SetCookieFromStringResponse extends Callbacks.Callback0 {
    }

    void addChangeListener(Url url, SiteForCookies siteForCookies, Origin origin, CookieChangeListener cookieChangeListener, AddChangeListenerResponse addChangeListenerResponse);

    void cookiesEnabledFor(Url url, SiteForCookies siteForCookies, Origin origin, CookiesEnabledForResponse cookiesEnabledForResponse);

    void getAllForUrl(Url url, SiteForCookies siteForCookies, Origin origin, CookieManagerGetOptions cookieManagerGetOptions, GetAllForUrlResponse getAllForUrlResponse);

    void getCookiesString(Url url, SiteForCookies siteForCookies, Origin origin, GetCookiesStringResponse getCookiesStringResponse);

    void setCanonicalCookie(CanonicalCookie canonicalCookie, Url url, SiteForCookies siteForCookies, Origin origin, SetCanonicalCookieResponse setCanonicalCookieResponse);

    void setCookieFromString(Url url, SiteForCookies siteForCookies, Origin origin, String str, SetCookieFromStringResponse setCookieFromStringResponse);
}
