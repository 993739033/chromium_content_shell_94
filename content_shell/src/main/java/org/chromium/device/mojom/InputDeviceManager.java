package org.chromium.device.mojom;

import org.chromium.mojo.bindings.AssociatedInterfaceNotSupported;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface InputDeviceManager extends Interface {
    public static final Manager<InputDeviceManager, Proxy> MANAGER = InputDeviceManager_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetDevicesAndSetClientResponse extends Callbacks.Callback1<InputDeviceInfo[]> {
    }

    /* loaded from: classes2.dex */
    public interface GetDevicesResponse extends Callbacks.Callback1<InputDeviceInfo[]> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends InputDeviceManager, Interface.Proxy {
    }

    void getDevices(GetDevicesResponse getDevicesResponse);

    void getDevicesAndSetClient(AssociatedInterfaceNotSupported associatedInterfaceNotSupported, GetDevicesAndSetClientResponse getDevicesAndSetClientResponse);
}
