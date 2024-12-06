package org.chromium.device.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface BluetoothSystemClient extends Interface {
    public static final Manager<BluetoothSystemClient, Proxy> MANAGER = BluetoothSystemClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends BluetoothSystemClient, Interface.Proxy {
    }

    void onScanStateChanged(int i);

    void onStateChanged(int i);
}
