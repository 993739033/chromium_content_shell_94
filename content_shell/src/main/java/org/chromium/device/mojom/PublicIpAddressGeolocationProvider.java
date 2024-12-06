package org.chromium.device.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.network.mojom.MutablePartialNetworkTrafficAnnotationTag;
/* loaded from: classes2.dex */
public interface PublicIpAddressGeolocationProvider extends Interface {
    public static final Manager<PublicIpAddressGeolocationProvider, Proxy> MANAGER = PublicIpAddressGeolocationProvider_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends PublicIpAddressGeolocationProvider, Interface.Proxy {
    }

    void createGeolocation(MutablePartialNetworkTrafficAnnotationTag mutablePartialNetworkTrafficAnnotationTag, InterfaceRequest<Geolocation> interfaceRequest);
}
