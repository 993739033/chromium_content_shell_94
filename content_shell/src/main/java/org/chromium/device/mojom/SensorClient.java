package org.chromium.device.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface SensorClient extends Interface {
    public static final Manager<SensorClient, Proxy> MANAGER = SensorClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends SensorClient, Interface.Proxy {
    }

    void raiseError();

    void sensorReadingChanged();
}
