package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface ColorChooserClient extends Interface {
    public static final Manager<ColorChooserClient, Proxy> MANAGER = ColorChooserClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends ColorChooserClient, Interface.Proxy {
    }

    void didChooseColor(int i);
}
