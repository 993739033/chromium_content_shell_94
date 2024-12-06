package org.chromium.device.mojom;

import org.chromium.mojo.bindings.AssociatedInterfaceNotSupported;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
/* loaded from: classes2.dex */
public interface UsbDeviceManager extends Interface {
    public static final Manager<UsbDeviceManager, Proxy> MANAGER = UsbDeviceManager_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface EnumerateDevicesAndSetClientResponse extends Callbacks.Callback1<UsbDeviceInfo[]> {
    }

    /* loaded from: classes2.dex */
    public interface GetDevicesResponse extends Callbacks.Callback1<UsbDeviceInfo[]> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends UsbDeviceManager, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface RefreshDeviceInfoResponse extends Callbacks.Callback1<UsbDeviceInfo> {
    }

    void enumerateDevicesAndSetClient(AssociatedInterfaceNotSupported associatedInterfaceNotSupported, EnumerateDevicesAndSetClientResponse enumerateDevicesAndSetClientResponse);

    void getDevice(String str, byte[] bArr, InterfaceRequest<UsbDevice> interfaceRequest, UsbDeviceClient usbDeviceClient);

    void getDevices(UsbEnumerationOptions usbEnumerationOptions, GetDevicesResponse getDevicesResponse);

    void getSecurityKeyDevice(String str, InterfaceRequest<UsbDevice> interfaceRequest, UsbDeviceClient usbDeviceClient);

    void refreshDeviceInfo(String str, RefreshDeviceInfoResponse refreshDeviceInfoResponse);

    void setClient(AssociatedInterfaceNotSupported associatedInterfaceNotSupported);
}
