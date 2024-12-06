package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface ColorChooser extends Interface {
    public static final Manager<ColorChooser, Proxy> MANAGER = ColorChooser_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends ColorChooser, Interface.Proxy {
    }

    void setSelectedColor(int i);
}
