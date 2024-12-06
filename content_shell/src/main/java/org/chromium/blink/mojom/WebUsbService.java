package org.chromium.blink.mojom;

import org.chromium.device.mojom.UsbDevice;
import org.chromium.device.mojom.UsbDeviceFilter;
import org.chromium.device.mojom.UsbDeviceInfo;
import org.chromium.mojo.bindings.AssociatedInterfaceNotSupported;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
/* loaded from: classes2.dex */
public interface WebUsbService extends Interface {
    public static final Manager<WebUsbService, Proxy> MANAGER = WebUsbService_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetDevicesResponse extends Callbacks.Callback1<UsbDeviceInfo[]> {
    }

    /* loaded from: classes2.dex */
    public interface GetPermissionResponse extends Callbacks.Callback1<UsbDeviceInfo> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends WebUsbService, Interface.Proxy {
    }

    void getDevice(String str, InterfaceRequest<UsbDevice> interfaceRequest);

    void getDevices(GetDevicesResponse getDevicesResponse);

    void getPermission(UsbDeviceFilter[] usbDeviceFilterArr, GetPermissionResponse getPermissionResponse);

    void setClient(AssociatedInterfaceNotSupported associatedInterfaceNotSupported);
}
