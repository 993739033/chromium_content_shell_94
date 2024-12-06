package org.chromium.device.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface GeolocationConfig extends Interface {
    public static final Manager<GeolocationConfig, Proxy> MANAGER = GeolocationConfig_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface IsHighAccuracyLocationBeingCapturedResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends GeolocationConfig, Interface.Proxy {
    }

    void isHighAccuracyLocationBeingCaptured(IsHighAccuracyLocationBeingCapturedResponse isHighAccuracyLocationBeingCapturedResponse);
}
