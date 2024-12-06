package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface AppBannerEvent extends Interface {
    public static final Manager<AppBannerEvent, Proxy> MANAGER = AppBannerEvent_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends AppBannerEvent, Interface.Proxy {
    }

    void bannerAccepted(String str);

    void bannerDismissed();
}
