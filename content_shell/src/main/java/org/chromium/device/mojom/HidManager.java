package org.chromium.device.mojom;

import org.chromium.mojo.bindings.AssociatedInterfaceNotSupported;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
/* loaded from: classes2.dex */
public interface HidManager extends Interface {
    public static final Manager<HidManager, Proxy> MANAGER = HidManager_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface ConnectResponse extends Callbacks.Callback1<HidConnection> {
    }

    /* loaded from: classes2.dex */
    public interface GetDevicesAndSetClientResponse extends Callbacks.Callback1<HidDeviceInfo[]> {
    }

    /* loaded from: classes2.dex */
    public interface GetDevicesResponse extends Callbacks.Callback1<HidDeviceInfo[]> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends HidManager, Interface.Proxy {
    }

    void addReceiver(InterfaceRequest<HidManager> interfaceRequest);

    void connect(String str, HidConnectionClient hidConnectionClient, HidConnectionWatcher hidConnectionWatcher, boolean z, boolean z2, ConnectResponse connectResponse);

    void getDevices(GetDevicesResponse getDevicesResponse);

    void getDevicesAndSetClient(AssociatedInterfaceNotSupported associatedInterfaceNotSupported, GetDevicesAndSetClientResponse getDevicesAndSetClientResponse);
}
