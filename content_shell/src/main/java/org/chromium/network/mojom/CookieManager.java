package org.chromium.network.mojom;

import org.chromium.content_settings.mojom.ContentSettingPatternSource;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface CookieManager extends Interface {
    public static final Manager<CookieManager, Proxy> MANAGER = CookieManager_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface AllowFileSchemeCookiesResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface DeleteCanonicalCookieResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface DeleteCookiesResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface DeleteSessionOnlyCookiesResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface FlushCookieStoreResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface GetAllCookiesResponse extends Callbacks.Callback1<CanonicalCookie[]> {
    }

    /* loaded from: classes2.dex */
    public interface GetAllCookiesWithAccessSemanticsResponse extends Callbacks.Callback2<CanonicalCookie[], int[]> {
    }

    /* loaded from: classes2.dex */
    public interface GetCookieListResponse extends Callbacks.Callback2<CookieWithAccessResult[], CookieWithAccessResult[]> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends CookieManager, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface SetCanonicalCookieResponse extends Callbacks.Callback1<CookieAccessResult> {
    }

    /* loaded from: classes2.dex */
    public interface SetStorageAccessGrantSettingsResponse extends Callbacks.Callback0 {
    }

    void addCookieChangeListener(Url url, String str, CookieChangeListener cookieChangeListener);

    void addGlobalChangeListener(CookieChangeListener cookieChangeListener);

    void allowFileSchemeCookies(boolean z, AllowFileSchemeCookiesResponse allowFileSchemeCookiesResponse);

    void blockThirdPartyCookies(boolean z);

    void cloneInterface(InterfaceRequest<CookieManager> interfaceRequest);

    void deleteCanonicalCookie(CanonicalCookie canonicalCookie, DeleteCanonicalCookieResponse deleteCanonicalCookieResponse);

    void deleteCookies(CookieDeletionFilter cookieDeletionFilter, DeleteCookiesResponse deleteCookiesResponse);

    void deleteSessionOnlyCookies(DeleteSessionOnlyCookiesResponse deleteSessionOnlyCookiesResponse);

    void flushCookieStore(FlushCookieStoreResponse flushCookieStoreResponse);

    void getAllCookies(GetAllCookiesResponse getAllCookiesResponse);

    void getAllCookiesWithAccessSemantics(GetAllCookiesWithAccessSemanticsResponse getAllCookiesWithAccessSemanticsResponse);

    void getCookieList(Url url, CookieOptions cookieOptions, GetCookieListResponse getCookieListResponse);

    void setCanonicalCookie(CanonicalCookie canonicalCookie, Url url, CookieOptions cookieOptions, SetCanonicalCookieResponse setCanonicalCookieResponse);

    void setContentSettings(ContentSettingPatternSource[] contentSettingPatternSourceArr);

    void setContentSettingsForLegacyCookieAccess(ContentSettingPatternSource[] contentSettingPatternSourceArr);

    void setForceKeepSessionState();

    void setStorageAccessGrantSettings(ContentSettingPatternSource[] contentSettingPatternSourceArr, SetStorageAccessGrantSettingsResponse setStorageAccessGrantSettingsResponse);
}
