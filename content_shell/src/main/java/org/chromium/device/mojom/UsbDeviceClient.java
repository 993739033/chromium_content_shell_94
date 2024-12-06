package org.chromium.device.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface UsbDeviceClient extends Interface {
    public static final Manager<UsbDeviceClient, Proxy> MANAGER = UsbDeviceClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends UsbDeviceClient, Interface.Proxy {
    }

    void onDeviceClosed();

    void onDeviceOpened();
}
