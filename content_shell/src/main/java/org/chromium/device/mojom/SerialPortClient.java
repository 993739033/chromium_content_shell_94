package org.chromium.device.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface SerialPortClient extends Interface {
    public static final Manager<SerialPortClient, Proxy> MANAGER = SerialPortClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends SerialPortClient, Interface.Proxy {
    }

    void onReadError(int i);

    void onSendError(int i);
}
