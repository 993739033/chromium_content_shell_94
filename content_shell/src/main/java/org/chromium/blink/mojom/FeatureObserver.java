package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
/* loaded from: classes2.dex */
public interface FeatureObserver extends Interface {
    public static final Manager<FeatureObserver, Proxy> MANAGER = FeatureObserver_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends FeatureObserver, Interface.Proxy {
    }

    void register(InterfaceRequest<ObservedFeature> interfaceRequest, int i);
}
