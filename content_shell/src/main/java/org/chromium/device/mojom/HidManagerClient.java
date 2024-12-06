package org.chromium.device.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface HidManagerClient extends Interface {
    public static final Manager<HidManagerClient, Proxy> MANAGER = HidManagerClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends HidManagerClient, Interface.Proxy {
    }

    void deviceAdded(HidDeviceInfo hidDeviceInfo);

    void deviceChanged(HidDeviceInfo hidDeviceInfo);

    void deviceRemoved(HidDeviceInfo hidDeviceInfo);
}
