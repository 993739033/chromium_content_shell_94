package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface DisplayCutoutClient extends Interface {
    public static final Manager<DisplayCutoutClient, Proxy> MANAGER = DisplayCutoutClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends DisplayCutoutClient, Interface.Proxy {
    }

    void setSafeArea(DisplayCutoutSafeArea displayCutoutSafeArea);
}
