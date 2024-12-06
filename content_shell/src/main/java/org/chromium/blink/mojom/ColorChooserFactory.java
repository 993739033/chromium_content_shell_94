package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
/* loaded from: classes2.dex */
public interface ColorChooserFactory extends Interface {
    public static final Manager<ColorChooserFactory, Proxy> MANAGER = ColorChooserFactory_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends ColorChooserFactory, Interface.Proxy {
    }

    void openColorChooser(InterfaceRequest<ColorChooser> interfaceRequest, ColorChooserClient colorChooserClient, int i, ColorSuggestion[] colorSuggestionArr);
}
