package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
/* loaded from: classes2.dex */
public interface AppBannerController extends Interface {
    public static final Manager<AppBannerController, Proxy> MANAGER = AppBannerController_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface BannerPromptRequestResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends AppBannerController, Interface.Proxy {
    }

    void bannerPromptRequest(AppBannerService appBannerService, InterfaceRequest<AppBannerEvent> interfaceRequest, String[] strArr, BannerPromptRequestResponse bannerPromptRequestResponse);
}
