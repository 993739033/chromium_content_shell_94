package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface ManagedConfigurationObserver extends Interface {
    public static final Manager<ManagedConfigurationObserver, Proxy> MANAGER = ManagedConfigurationObserver_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends ManagedConfigurationObserver, Interface.Proxy {
    }

    void onConfigurationChanged();
}
