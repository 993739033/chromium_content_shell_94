package org.chromium.device.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface InputDeviceManagerClient extends Interface {
    public static final Manager<InputDeviceManagerClient, Proxy> MANAGER = InputDeviceManagerClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends InputDeviceManagerClient, Interface.Proxy {
    }

    void inputDeviceAdded(InputDeviceInfo inputDeviceInfo);

    void inputDeviceRemoved(String str);
}
