package org.chromium.blink.mojom;

import org.chromium.device.mojom.HidConnection;
import org.chromium.device.mojom.HidConnectionClient;
import org.chromium.device.mojom.HidDeviceInfo;
import org.chromium.mojo.bindings.AssociatedInterfaceNotSupported;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface HidService extends Interface {
    public static final Manager<HidService, Proxy> MANAGER = HidService_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface ConnectResponse extends Callbacks.Callback1<HidConnection> {
    }

    /* loaded from: classes2.dex */
    public interface GetDevicesResponse extends Callbacks.Callback1<HidDeviceInfo[]> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends HidService, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface RequestDeviceResponse extends Callbacks.Callback1<HidDeviceInfo[]> {
    }

    void connect(String str, HidConnectionClient hidConnectionClient, ConnectResponse connectResponse);

    void getDevices(GetDevicesResponse getDevicesResponse);

    void registerClient(AssociatedInterfaceNotSupported associatedInterfaceNotSupported);

    void requestDevice(HidDeviceFilter[] hidDeviceFilterArr, RequestDeviceResponse requestDeviceResponse);
}
