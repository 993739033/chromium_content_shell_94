package org.chromium.device.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface UsbDeviceManagerClient extends Interface {
    public static final Manager<UsbDeviceManagerClient, Proxy> MANAGER = UsbDeviceManagerClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends UsbDeviceManagerClient, Interface.Proxy {
    }

    void onDeviceAdded(UsbDeviceInfo usbDeviceInfo);

    void onDeviceRemoved(UsbDeviceInfo usbDeviceInfo);
}
