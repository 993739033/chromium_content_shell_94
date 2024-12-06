package org.chromium.device.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface DevicePostureProvider extends Interface {
    public static final Manager<DevicePostureProvider, Proxy> MANAGER = DevicePostureProvider_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface AddListenerAndGetCurrentPostureResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends DevicePostureProvider, Interface.Proxy {
    }

    void addListenerAndGetCurrentPosture(DevicePostureProviderClient devicePostureProviderClient, AddListenerAndGetCurrentPostureResponse addListenerAndGetCurrentPostureResponse);
}
