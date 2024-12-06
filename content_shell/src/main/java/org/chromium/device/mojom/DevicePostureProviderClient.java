package org.chromium.device.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface DevicePostureProviderClient extends Interface {
    public static final Manager<DevicePostureProviderClient, Proxy> MANAGER = DevicePostureProviderClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends DevicePostureProviderClient, Interface.Proxy {
    }

    void onPostureChanged(int i);
}
