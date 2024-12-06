package org.chromium.device.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface Geolocation extends Interface {
    public static final Manager<Geolocation, Proxy> MANAGER = Geolocation_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends Geolocation, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface QueryNextPositionResponse extends Callbacks.Callback1<Geoposition> {
    }

    void queryNextPosition(QueryNextPositionResponse queryNextPositionResponse);

    void setHighAccuracy(boolean z);
}
