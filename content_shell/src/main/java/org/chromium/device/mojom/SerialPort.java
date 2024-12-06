package org.chromium.device.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.system.DataPipe;
/* loaded from: classes2.dex */
public interface SerialPort extends Interface {
    public static final Manager<SerialPort, Proxy> MANAGER = SerialPort_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface CloseResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface ConfigurePortResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface DrainResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface FlushResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface GetControlSignalsResponse extends Callbacks.Callback1<SerialPortControlSignals> {
    }

    /* loaded from: classes2.dex */
    public interface GetPortInfoResponse extends Callbacks.Callback1<SerialConnectionInfo> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends SerialPort, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface SetControlSignalsResponse extends Callbacks.Callback1<Boolean> {
    }

    void close(CloseResponse closeResponse);

    void configurePort(SerialConnectionOptions serialConnectionOptions, ConfigurePortResponse configurePortResponse);

    void drain(DrainResponse drainResponse);

    void flush(int i, FlushResponse flushResponse);

    void getControlSignals(GetControlSignalsResponse getControlSignalsResponse);

    void getPortInfo(GetPortInfoResponse getPortInfoResponse);

    void setControlSignals(SerialHostControlSignals serialHostControlSignals, SetControlSignalsResponse setControlSignalsResponse);

    void startReading(DataPipe.ProducerHandle producerHandle);

    void startWriting(DataPipe.ConsumerHandle consumerHandle);
}
