package org.chromium.device.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.device.mojom.SerialPort;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.DeserializationException;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceControlMessagesHelper;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.MessageHeader;
import org.chromium.mojo.bindings.MessageReceiver;
import org.chromium.mojo.bindings.MessageReceiverWithResponder;
import org.chromium.mojo.bindings.ServiceMessage;
import org.chromium.mojo.bindings.SideEffectFreeCloseable;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo.system.Core;
import org.chromium.mojo.system.DataPipe;
import org.chromium.mojo.system.Handle;
import org.chromium.mojo.system.InvalidHandle;
/* loaded from: classes2.dex */
class SerialPort_Internal {
    private static final int CLOSE_ORDINAL = 8;
    private static final int CONFIGURE_PORT_ORDINAL = 6;
    private static final int DRAIN_ORDINAL = 3;
    private static final int FLUSH_ORDINAL = 2;
    private static final int GET_CONTROL_SIGNALS_ORDINAL = 4;
    private static final int GET_PORT_INFO_ORDINAL = 7;
    public static final Interface.Manager<SerialPort, SerialPort.Proxy> MANAGER = new Interface.Manager<SerialPort, SerialPort.Proxy>() { // from class: org.chromium.device.mojom.SerialPort_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "device.mojom.SerialPort";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public SerialPort.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, SerialPort impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public SerialPort[] buildArray(int size) {
            return new SerialPort[size];
        }
    };
    private static final int SET_CONTROL_SIGNALS_ORDINAL = 5;
    private static final int START_READING_ORDINAL = 1;
    private static final int START_WRITING_ORDINAL = 0;

    SerialPort_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements SerialPort.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.device.mojom.SerialPort
        public void startWriting(DataPipe.ConsumerHandle consumer) {
            SerialPortStartWritingParams _message = new SerialPortStartWritingParams();
            _message.consumer = consumer;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }

        @Override // org.chromium.device.mojom.SerialPort
        public void startReading(DataPipe.ProducerHandle producer) {
            SerialPortStartReadingParams _message = new SerialPortStartReadingParams();
            _message.producer = producer;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1)));
        }

        @Override // org.chromium.device.mojom.SerialPort
        public void flush(int mode, FlushResponse callback) {
            SerialPortFlushParams _message = new SerialPortFlushParams();
            _message.mode = mode;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2, 1, 0L)), new SerialPortFlushResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.device.mojom.SerialPort
        public void drain(DrainResponse callback) {
            SerialPortDrainParams _message = new SerialPortDrainParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3, 1, 0L)), new SerialPortDrainResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.device.mojom.SerialPort
        public void getControlSignals(GetControlSignalsResponse callback) {
            SerialPortGetControlSignalsParams _message = new SerialPortGetControlSignalsParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(4, 1, 0L)), new SerialPortGetControlSignalsResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.device.mojom.SerialPort
        public void setControlSignals(SerialHostControlSignals signals, SetControlSignalsResponse callback) {
            SerialPortSetControlSignalsParams _message = new SerialPortSetControlSignalsParams();
            _message.signals = signals;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(5, 1, 0L)), new SerialPortSetControlSignalsResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.device.mojom.SerialPort
        public void configurePort(SerialConnectionOptions options, ConfigurePortResponse callback) {
            SerialPortConfigurePortParams _message = new SerialPortConfigurePortParams();
            _message.options = options;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(6, 1, 0L)), new SerialPortConfigurePortResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.device.mojom.SerialPort
        public void getPortInfo(GetPortInfoResponse callback) {
            SerialPortGetPortInfoParams _message = new SerialPortGetPortInfoParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(7, 1, 0L)), new SerialPortGetPortInfoResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.device.mojom.SerialPort
        public void close(CloseResponse callback) {
            SerialPortCloseParams _message = new SerialPortCloseParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(8, 1, 0L)), new SerialPortCloseResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<SerialPort> {
        Stub(Core core, SerialPort impl) {
            super(core, impl);
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                int flags = 0;
                if (header.hasFlag(4)) {
                    flags = 0 | 4;
                }
                if (!header.validateHeader(flags)) {
                    return false;
                }
                switch (header.getType()) {
                    case -2:
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(SerialPort_Internal.MANAGER, messageWithHeader);
                    case -1:
                    default:
                        return false;
                    case 0:
                        SerialPortStartWritingParams data = SerialPortStartWritingParams.deserialize(messageWithHeader.getPayload());
                        getImpl().startWriting(data.consumer);
                        return true;
                    case 1:
                        SerialPortStartReadingParams data2 = SerialPortStartReadingParams.deserialize(messageWithHeader.getPayload());
                        getImpl().startReading(data2.producer);
                        return true;
                }
            } catch (DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }

        @Override // org.chromium.mojo.bindings.MessageReceiverWithResponder
        public boolean acceptWithResponder(Message message, MessageReceiver receiver) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                int flags = 1;
                if (header.hasFlag(4)) {
                    flags = 1 | 4;
                }
                if (!header.validateHeader(flags)) {
                    return false;
                }
                switch (header.getType()) {
                    case -1:
                        return InterfaceControlMessagesHelper.handleRun(getCore(), SerialPort_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                    case 1:
                    default:
                        return false;
                    case 2:
                        SerialPortFlushParams data = SerialPortFlushParams.deserialize(messageWithHeader.getPayload());
                        getImpl().flush(data.mode, new SerialPortFlushResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 3:
                        SerialPortDrainParams.deserialize(messageWithHeader.getPayload());
                        getImpl().drain(new SerialPortDrainResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 4:
                        SerialPortGetControlSignalsParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getControlSignals(new SerialPortGetControlSignalsResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 5:
                        SerialPortSetControlSignalsParams data2 = SerialPortSetControlSignalsParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setControlSignals(data2.signals, new SerialPortSetControlSignalsResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 6:
                        SerialPortConfigurePortParams data3 = SerialPortConfigurePortParams.deserialize(messageWithHeader.getPayload());
                        getImpl().configurePort(data3.options, new SerialPortConfigurePortResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 7:
                        SerialPortGetPortInfoParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getPortInfo(new SerialPortGetPortInfoResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 8:
                        SerialPortCloseParams.deserialize(messageWithHeader.getPayload());
                        getImpl().close(new SerialPortCloseResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                }
            } catch (DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class SerialPortStartWritingParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public DataPipe.ConsumerHandle consumer;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private SerialPortStartWritingParams(int version) {
            super(16, version);
            this.consumer = InvalidHandle.INSTANCE;
        }

        public SerialPortStartWritingParams() {
            this(0);
        }

        public static SerialPortStartWritingParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static SerialPortStartWritingParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static SerialPortStartWritingParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                SerialPortStartWritingParams result = new SerialPortStartWritingParams(elementsOrVersion);
                result.consumer = decoder0.readConsumerHandle(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Handle) this.consumer, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class SerialPortStartReadingParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public DataPipe.ProducerHandle producer;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private SerialPortStartReadingParams(int version) {
            super(16, version);
            this.producer = InvalidHandle.INSTANCE;
        }

        public SerialPortStartReadingParams() {
            this(0);
        }

        public static SerialPortStartReadingParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static SerialPortStartReadingParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static SerialPortStartReadingParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                SerialPortStartReadingParams result = new SerialPortStartReadingParams(elementsOrVersion);
                result.producer = decoder0.readProducerHandle(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Handle) this.producer, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class SerialPortFlushParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int mode;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private SerialPortFlushParams(int version) {
            super(16, version);
        }

        public SerialPortFlushParams() {
            this(0);
        }

        public static SerialPortFlushParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static SerialPortFlushParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static SerialPortFlushParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                SerialPortFlushParams result = new SerialPortFlushParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.mode = readInt;
                SerialPortFlushMode.validate(readInt);
                result.mode = SerialPortFlushMode.toKnownValue(result.mode);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.mode, 8);
        }
    }

    /* loaded from: classes2.dex */
    static final class SerialPortFlushResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private SerialPortFlushResponseParams(int version) {
            super(8, version);
        }

        public SerialPortFlushResponseParams() {
            this(0);
        }

        public static SerialPortFlushResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static SerialPortFlushResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static SerialPortFlushResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                SerialPortFlushResponseParams result = new SerialPortFlushResponseParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static class SerialPortFlushResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final SerialPort.FlushResponse mCallback;

        SerialPortFlushResponseParamsForwardToCallback(SerialPort.FlushResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(2, 2)) {
                    return false;
                }
                this.mCallback.call();
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class SerialPortFlushResponseParamsProxyToResponder implements SerialPort.FlushResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        SerialPortFlushResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            SerialPortFlushResponseParams _response = new SerialPortFlushResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(2, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class SerialPortDrainParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private SerialPortDrainParams(int version) {
            super(8, version);
        }

        public SerialPortDrainParams() {
            this(0);
        }

        public static SerialPortDrainParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static SerialPortDrainParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static SerialPortDrainParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                SerialPortDrainParams result = new SerialPortDrainParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static final class SerialPortDrainResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private SerialPortDrainResponseParams(int version) {
            super(8, version);
        }

        public SerialPortDrainResponseParams() {
            this(0);
        }

        public static SerialPortDrainResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static SerialPortDrainResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static SerialPortDrainResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                SerialPortDrainResponseParams result = new SerialPortDrainResponseParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static class SerialPortDrainResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final SerialPort.DrainResponse mCallback;

        SerialPortDrainResponseParamsForwardToCallback(SerialPort.DrainResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(3, 2)) {
                    return false;
                }
                this.mCallback.call();
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class SerialPortDrainResponseParamsProxyToResponder implements SerialPort.DrainResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        SerialPortDrainResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            SerialPortDrainResponseParams _response = new SerialPortDrainResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(3, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class SerialPortGetControlSignalsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private SerialPortGetControlSignalsParams(int version) {
            super(8, version);
        }

        public SerialPortGetControlSignalsParams() {
            this(0);
        }

        public static SerialPortGetControlSignalsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static SerialPortGetControlSignalsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static SerialPortGetControlSignalsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                SerialPortGetControlSignalsParams result = new SerialPortGetControlSignalsParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class SerialPortGetControlSignalsResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public SerialPortControlSignals signals;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private SerialPortGetControlSignalsResponseParams(int version) {
            super(16, version);
        }

        public SerialPortGetControlSignalsResponseParams() {
            this(0);
        }

        public static SerialPortGetControlSignalsResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static SerialPortGetControlSignalsResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static SerialPortGetControlSignalsResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                SerialPortGetControlSignalsResponseParams result = new SerialPortGetControlSignalsResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, true);
                result.signals = SerialPortControlSignals.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.signals, 8, true);
        }
    }

    /* loaded from: classes2.dex */
    static class SerialPortGetControlSignalsResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final SerialPort.GetControlSignalsResponse mCallback;

        SerialPortGetControlSignalsResponseParamsForwardToCallback(SerialPort.GetControlSignalsResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(4, 2)) {
                    return false;
                }
                SerialPortGetControlSignalsResponseParams response = SerialPortGetControlSignalsResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.signals);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class SerialPortGetControlSignalsResponseParamsProxyToResponder implements SerialPort.GetControlSignalsResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        SerialPortGetControlSignalsResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(SerialPortControlSignals signals) {
            SerialPortGetControlSignalsResponseParams _response = new SerialPortGetControlSignalsResponseParams();
            _response.signals = signals;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(4, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class SerialPortSetControlSignalsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public SerialHostControlSignals signals;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private SerialPortSetControlSignalsParams(int version) {
            super(16, version);
        }

        public SerialPortSetControlSignalsParams() {
            this(0);
        }

        public static SerialPortSetControlSignalsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static SerialPortSetControlSignalsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static SerialPortSetControlSignalsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                SerialPortSetControlSignalsParams result = new SerialPortSetControlSignalsParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.signals = SerialHostControlSignals.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.signals, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class SerialPortSetControlSignalsResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private SerialPortSetControlSignalsResponseParams(int version) {
            super(16, version);
        }

        public SerialPortSetControlSignalsResponseParams() {
            this(0);
        }

        public static SerialPortSetControlSignalsResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static SerialPortSetControlSignalsResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static SerialPortSetControlSignalsResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                SerialPortSetControlSignalsResponseParams result = new SerialPortSetControlSignalsResponseParams(elementsOrVersion);
                result.success = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.success, 8, 0);
        }
    }

    /* loaded from: classes2.dex */
    static class SerialPortSetControlSignalsResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final SerialPort.SetControlSignalsResponse mCallback;

        SerialPortSetControlSignalsResponseParamsForwardToCallback(SerialPort.SetControlSignalsResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(5, 2)) {
                    return false;
                }
                SerialPortSetControlSignalsResponseParams response = SerialPortSetControlSignalsResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.success));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class SerialPortSetControlSignalsResponseParamsProxyToResponder implements SerialPort.SetControlSignalsResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        SerialPortSetControlSignalsResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Boolean success) {
            SerialPortSetControlSignalsResponseParams _response = new SerialPortSetControlSignalsResponseParams();
            _response.success = success.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(5, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class SerialPortConfigurePortParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public SerialConnectionOptions options;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private SerialPortConfigurePortParams(int version) {
            super(16, version);
        }

        public SerialPortConfigurePortParams() {
            this(0);
        }

        public static SerialPortConfigurePortParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static SerialPortConfigurePortParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static SerialPortConfigurePortParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                SerialPortConfigurePortParams result = new SerialPortConfigurePortParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.options = SerialConnectionOptions.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.options, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class SerialPortConfigurePortResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private SerialPortConfigurePortResponseParams(int version) {
            super(16, version);
        }

        public SerialPortConfigurePortResponseParams() {
            this(0);
        }

        public static SerialPortConfigurePortResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static SerialPortConfigurePortResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static SerialPortConfigurePortResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                SerialPortConfigurePortResponseParams result = new SerialPortConfigurePortResponseParams(elementsOrVersion);
                result.success = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.success, 8, 0);
        }
    }

    /* loaded from: classes2.dex */
    static class SerialPortConfigurePortResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final SerialPort.ConfigurePortResponse mCallback;

        SerialPortConfigurePortResponseParamsForwardToCallback(SerialPort.ConfigurePortResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(6, 2)) {
                    return false;
                }
                SerialPortConfigurePortResponseParams response = SerialPortConfigurePortResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.success));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class SerialPortConfigurePortResponseParamsProxyToResponder implements SerialPort.ConfigurePortResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        SerialPortConfigurePortResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Boolean success) {
            SerialPortConfigurePortResponseParams _response = new SerialPortConfigurePortResponseParams();
            _response.success = success.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(6, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class SerialPortGetPortInfoParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private SerialPortGetPortInfoParams(int version) {
            super(8, version);
        }

        public SerialPortGetPortInfoParams() {
            this(0);
        }

        public static SerialPortGetPortInfoParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static SerialPortGetPortInfoParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static SerialPortGetPortInfoParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                SerialPortGetPortInfoParams result = new SerialPortGetPortInfoParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class SerialPortGetPortInfoResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public SerialConnectionInfo info;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private SerialPortGetPortInfoResponseParams(int version) {
            super(16, version);
        }

        public SerialPortGetPortInfoResponseParams() {
            this(0);
        }

        public static SerialPortGetPortInfoResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static SerialPortGetPortInfoResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static SerialPortGetPortInfoResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                SerialPortGetPortInfoResponseParams result = new SerialPortGetPortInfoResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.info = SerialConnectionInfo.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.info, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static class SerialPortGetPortInfoResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final SerialPort.GetPortInfoResponse mCallback;

        SerialPortGetPortInfoResponseParamsForwardToCallback(SerialPort.GetPortInfoResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(7, 2)) {
                    return false;
                }
                SerialPortGetPortInfoResponseParams response = SerialPortGetPortInfoResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.info);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class SerialPortGetPortInfoResponseParamsProxyToResponder implements SerialPort.GetPortInfoResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        SerialPortGetPortInfoResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(SerialConnectionInfo info) {
            SerialPortGetPortInfoResponseParams _response = new SerialPortGetPortInfoResponseParams();
            _response.info = info;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(7, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class SerialPortCloseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private SerialPortCloseParams(int version) {
            super(8, version);
        }

        public SerialPortCloseParams() {
            this(0);
        }

        public static SerialPortCloseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static SerialPortCloseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static SerialPortCloseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                SerialPortCloseParams result = new SerialPortCloseParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static final class SerialPortCloseResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private SerialPortCloseResponseParams(int version) {
            super(8, version);
        }

        public SerialPortCloseResponseParams() {
            this(0);
        }

        public static SerialPortCloseResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static SerialPortCloseResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static SerialPortCloseResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                SerialPortCloseResponseParams result = new SerialPortCloseResponseParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static class SerialPortCloseResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final SerialPort.CloseResponse mCallback;

        SerialPortCloseResponseParamsForwardToCallback(SerialPort.CloseResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(8, 2)) {
                    return false;
                }
                this.mCallback.call();
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class SerialPortCloseResponseParamsProxyToResponder implements SerialPort.CloseResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        SerialPortCloseResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            SerialPortCloseResponseParams _response = new SerialPortCloseResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(8, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
