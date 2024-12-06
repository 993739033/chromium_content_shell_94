package org.chromium.blink.mojom;

import org.chromium.device.mojom.Geolocation;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
/* loaded from: classes2.dex */
public interface GeolocationService extends Interface {
    public static final Manager<GeolocationService, Proxy> MANAGER = GeolocationService_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface CreateGeolocationResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends GeolocationService, Interface.Proxy {
    }

    void createGeolocation(InterfaceRequest<Geolocation> interfaceRequest, boolean z, CreateGeolocationResponse createGeolocationResponse);
}
