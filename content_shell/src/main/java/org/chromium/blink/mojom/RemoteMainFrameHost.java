package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface RemoteMainFrameHost extends Interface {
    public static final Manager<RemoteMainFrameHost, Proxy> MANAGER = RemoteMainFrameHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends RemoteMainFrameHost, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface UpdateTargetUrlResponse extends Callbacks.Callback0 {
    }

    void focusPage();

    void routeCloseEvent();

    void takeFocus(boolean z);

    void updateTargetUrl(Url url, UpdateTargetUrlResponse updateTargetUrlResponse);
}
