package org.chromium.device.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface SensorProvider extends Interface {
    public static final Manager<SensorProvider, Proxy> MANAGER = SensorProvider_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface GetSensorResponse extends Callbacks.Callback2<Integer, SensorInitParams> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends SensorProvider, Interface.Proxy {
    }

    void getSensor(int i, GetSensorResponse getSensorResponse);
}
