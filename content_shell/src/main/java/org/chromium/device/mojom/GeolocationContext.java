package org.chromium.device.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public interface GeolocationContext extends Interface {
    public static final Manager<GeolocationContext, Proxy> MANAGER = GeolocationContext_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends GeolocationContext, Interface.Proxy {
    }

    void bindGeolocation(InterfaceRequest<Geolocation> interfaceRequest, Url url);

    void clearOverride();

    void setOverride(Geoposition geoposition);
}
