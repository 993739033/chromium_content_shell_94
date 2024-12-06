package org.chromium.device.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.UnguessableToken;
/* loaded from: classes2.dex */
public interface SerialPortManager extends Interface {
    public static final Manager<SerialPortManager, Proxy> MANAGER = SerialPortManager_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetDevicesResponse extends Callbacks.Callback1<SerialPortInfo[]> {
    }

    /* loaded from: classes2.dex */
    public interface OpenPortResponse extends Callbacks.Callback1<SerialPort> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends SerialPortManager, Interface.Proxy {
    }

    void getDevices(GetDevicesResponse getDevicesResponse);

    void openPort(UnguessableToken unguessableToken, boolean z, SerialConnectionOptions serialConnectionOptions, SerialPortClient serialPortClient, SerialPortConnectionWatcher serialPortConnectionWatcher, OpenPortResponse openPortResponse);

    void setClient(SerialPortManagerClient serialPortManagerClient);
}
