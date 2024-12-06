package org.chromium.device.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface SerialPortManagerClient extends Interface {
    public static final Manager<SerialPortManagerClient, Proxy> MANAGER = SerialPortManagerClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends SerialPortManagerClient, Interface.Proxy {
    }

    void onPortAdded(SerialPortInfo serialPortInfo);

    void onPortRemoved(SerialPortInfo serialPortInfo);
}
