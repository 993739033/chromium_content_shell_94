package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface ConversionHost extends Interface {
    public static final Manager<ConversionHost, Proxy> MANAGER = ConversionHost_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends ConversionHost, Interface.Proxy {
    }

    void registerConversion(Conversion conversion);

    void registerImpression(Impression impression);
}
