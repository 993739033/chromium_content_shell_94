package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface AppBannerService extends Interface {
    public static final Manager<AppBannerService, Proxy> MANAGER = AppBannerService_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends AppBannerService, Interface.Proxy {
    }

    void displayAppBanner();
}
