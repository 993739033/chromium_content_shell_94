package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface DisplayCutoutHost extends Interface {
    public static final Manager<DisplayCutoutHost, Proxy> MANAGER = DisplayCutoutHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends DisplayCutoutHost, Interface.Proxy {
    }

    void notifyViewportFitChanged(int i);
}
