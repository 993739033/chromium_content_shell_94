package org.chromium.device.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface GeolocationControl extends Interface {
    public static final Manager<GeolocationControl, Proxy> MANAGER = GeolocationControl_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends GeolocationControl, Interface.Proxy {
    }

    void userDidOptIntoLocationServices();
}
