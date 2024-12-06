package org.chromium.device.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
/* loaded from: classes2.dex */
public interface BluetoothSystemFactory extends Interface {
    public static final Manager<BluetoothSystemFactory, Proxy> MANAGER = BluetoothSystemFactory_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends BluetoothSystemFactory, Interface.Proxy {
    }

    void create(InterfaceRequest<BluetoothSystem> interfaceRequest, BluetoothSystemClient bluetoothSystemClient);
}
