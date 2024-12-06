package org.chromium.device.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface Sensor extends Interface {
    public static final Manager<Sensor, Proxy> MANAGER = Sensor_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface AddConfigurationResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface GetDefaultConfigurationResponse extends Callbacks.Callback1<SensorConfiguration> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends Sensor, Interface.Proxy {
    }

    void addConfiguration(SensorConfiguration sensorConfiguration, AddConfigurationResponse addConfigurationResponse);

    void configureReadingChangeNotifications(boolean z);

    void getDefaultConfiguration(GetDefaultConfigurationResponse getDefaultConfigurationResponse);

    void removeConfiguration(SensorConfiguration sensorConfiguration);

    void resume();

    void suspend();
}
