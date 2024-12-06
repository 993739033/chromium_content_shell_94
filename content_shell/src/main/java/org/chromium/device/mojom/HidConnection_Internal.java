package org.chromium.device.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.device.mojom.HidConnection;
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
/* loaded from: classes2.dex */
class HidConnection_Internal {
    private static final int GET_FEATURE_REPORT_ORDINAL = 2;
    public static final Interface.Manager<HidConnection, HidConnection.Proxy> MANAGER = new Interface.Manager<HidConnection, HidConnection.Proxy>() { // from class: org.chromium.device.mojom.HidConnection_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "device.mojom.HidConnection";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public HidConnection.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, HidConnection impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public HidConnection[] buildArray(int size) {
            return new HidConnection[size];
        }
    };
    private static final int READ_ORDINAL = 0;
    private static final int SEND_FEATURE_REPORT_ORDINAL = 3;
    private static final int WRITE_ORDINAL = 1;

    HidConnection_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements HidConnection.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.device.mojom.HidConnection
        public void read(ReadResponse callback) {
            HidConnectionReadParams _message = new HidConnectionReadParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new HidConnectionReadResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.device.mojom.HidConnection
        public void write(byte reportId, byte[] buffer, WriteResponse callback) {
            HidConnectionWriteParams _message = new HidConnectionWriteParams();
            _message.reportId = reportId;
            _message.buffer = buffer;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1, 1, 0L)), new HidConnectionWriteResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.device.mojom.HidConnection
        public void getFeatureReport(byte reportId, GetFeatureReportResponse callback) {
            HidConnectionGetFeatureReportParams _message = new HidConnectionGetFeatureReportParams();
            _message.reportId = reportId;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2, 1, 0L)), new HidConnectionGetFeatureReportResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.device.mojom.HidConnection
        public void sendFeatureReport(byte reportId, byte[] buffer, SendFeatureReportResponse callback) {
            HidConnectionSendFeatureReportParams _message = new HidConnectionSendFeatureReportParams();
            _message.reportId = reportId;
            _message.buffer = buffer;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3, 1, 0L)), new HidConnectionSendFeatureReportResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<HidConnection> {
        Stub(Core core, HidConnection impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(HidConnection_Internal.MANAGER, messageWithHeader);
                    default:
                        return false;
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), HidConnection_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        HidConnectionReadParams.deserialize(messageWithHeader.getPayload());
                        getImpl().read(new HidConnectionReadResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 1:
                        HidConnectionWriteParams data = HidConnectionWriteParams.deserialize(messageWithHeader.getPayload());
                        getImpl().write(data.reportId, data.buffer, new HidConnectionWriteResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 2:
                        getImpl().getFeatureReport(HidConnectionGetFeatureReportParams.deserialize(messageWithHeader.getPayload()).reportId, new HidConnectionGetFeatureReportResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 3:
                        HidConnectionSendFeatureReportParams data2 = HidConnectionSendFeatureReportParams.deserialize(messageWithHeader.getPayload());
                        getImpl().sendFeatureReport(data2.reportId, data2.buffer, new HidConnectionSendFeatureReportResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    default:
                        return false;
                }
            } catch (DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class HidConnectionReadParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private HidConnectionReadParams(int version) {
            super(8, version);
        }

        public HidConnectionReadParams() {
            this(0);
        }

        public static HidConnectionReadParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static HidConnectionReadParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static HidConnectionReadParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                HidConnectionReadParams result = new HidConnectionReadParams(elementsOrVersion);
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
    public static final class HidConnectionReadResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public byte[] buffer;
        public byte reportId;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private HidConnectionReadResponseParams(int version) {
            super(24, version);
        }

        public HidConnectionReadResponseParams() {
            this(0);
        }

        public static HidConnectionReadResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static HidConnectionReadResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static HidConnectionReadResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                HidConnectionReadResponseParams result = new HidConnectionReadResponseParams(elementsOrVersion);
                result.success = decoder0.readBoolean(8, 0);
                result.reportId = decoder0.readByte(9);
                result.buffer = decoder0.readBytes(16, 1, -1);
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
            encoder0.encode(this.reportId, 9);
            encoder0.encode(this.buffer, 16, 1, -1);
        }
    }

    /* loaded from: classes2.dex */
    static class HidConnectionReadResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final HidConnection.ReadResponse mCallback;

        HidConnectionReadResponseParamsForwardToCallback(HidConnection.ReadResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(0, 2)) {
                    return false;
                }
                HidConnectionReadResponseParams response = HidConnectionReadResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.success), Byte.valueOf(response.reportId), response.buffer);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class HidConnectionReadResponseParamsProxyToResponder implements HidConnection.ReadResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        HidConnectionReadResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback3
        public void call(Boolean success, Byte reportId, byte[] buffer) {
            HidConnectionReadResponseParams _response = new HidConnectionReadResponseParams();
            _response.success = success.booleanValue();
            _response.reportId = reportId.byteValue();
            _response.buffer = buffer;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class HidConnectionWriteParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public byte[] buffer;
        public byte reportId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private HidConnectionWriteParams(int version) {
            super(24, version);
        }

        public HidConnectionWriteParams() {
            this(0);
        }

        public static HidConnectionWriteParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static HidConnectionWriteParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static HidConnectionWriteParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                HidConnectionWriteParams result = new HidConnectionWriteParams(elementsOrVersion);
                result.reportId = decoder0.readByte(8);
                result.buffer = decoder0.readBytes(16, 0, -1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.reportId, 8);
            encoder0.encode(this.buffer, 16, 0, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class HidConnectionWriteResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private HidConnectionWriteResponseParams(int version) {
            super(16, version);
        }

        public HidConnectionWriteResponseParams() {
            this(0);
        }

        public static HidConnectionWriteResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static HidConnectionWriteResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static HidConnectionWriteResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                HidConnectionWriteResponseParams result = new HidConnectionWriteResponseParams(elementsOrVersion);
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
    static class HidConnectionWriteResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final HidConnection.WriteResponse mCallback;

        HidConnectionWriteResponseParamsForwardToCallback(HidConnection.WriteResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(1, 2)) {
                    return false;
                }
                HidConnectionWriteResponseParams response = HidConnectionWriteResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.success));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class HidConnectionWriteResponseParamsProxyToResponder implements HidConnection.WriteResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        HidConnectionWriteResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Boolean success) {
            HidConnectionWriteResponseParams _response = new HidConnectionWriteResponseParams();
            _response.success = success.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(1, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class HidConnectionGetFeatureReportParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public byte reportId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private HidConnectionGetFeatureReportParams(int version) {
            super(16, version);
        }

        public HidConnectionGetFeatureReportParams() {
            this(0);
        }

        public static HidConnectionGetFeatureReportParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static HidConnectionGetFeatureReportParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static HidConnectionGetFeatureReportParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                HidConnectionGetFeatureReportParams result = new HidConnectionGetFeatureReportParams(elementsOrVersion);
                result.reportId = decoder0.readByte(8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.reportId, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class HidConnectionGetFeatureReportResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public byte[] buffer;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private HidConnectionGetFeatureReportResponseParams(int version) {
            super(24, version);
        }

        public HidConnectionGetFeatureReportResponseParams() {
            this(0);
        }

        public static HidConnectionGetFeatureReportResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static HidConnectionGetFeatureReportResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static HidConnectionGetFeatureReportResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                HidConnectionGetFeatureReportResponseParams result = new HidConnectionGetFeatureReportResponseParams(elementsOrVersion);
                result.success = decoder0.readBoolean(8, 0);
                result.buffer = decoder0.readBytes(16, 1, -1);
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
            encoder0.encode(this.buffer, 16, 1, -1);
        }
    }

    /* loaded from: classes2.dex */
    static class HidConnectionGetFeatureReportResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final HidConnection.GetFeatureReportResponse mCallback;

        HidConnectionGetFeatureReportResponseParamsForwardToCallback(HidConnection.GetFeatureReportResponse callback) {
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
                HidConnectionGetFeatureReportResponseParams response = HidConnectionGetFeatureReportResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.success), response.buffer);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class HidConnectionGetFeatureReportResponseParamsProxyToResponder implements HidConnection.GetFeatureReportResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        HidConnectionGetFeatureReportResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Boolean success, byte[] buffer) {
            HidConnectionGetFeatureReportResponseParams _response = new HidConnectionGetFeatureReportResponseParams();
            _response.success = success.booleanValue();
            _response.buffer = buffer;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(2, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class HidConnectionSendFeatureReportParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public byte[] buffer;
        public byte reportId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private HidConnectionSendFeatureReportParams(int version) {
            super(24, version);
        }

        public HidConnectionSendFeatureReportParams() {
            this(0);
        }

        public static HidConnectionSendFeatureReportParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static HidConnectionSendFeatureReportParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static HidConnectionSendFeatureReportParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                HidConnectionSendFeatureReportParams result = new HidConnectionSendFeatureReportParams(elementsOrVersion);
                result.reportId = decoder0.readByte(8);
                result.buffer = decoder0.readBytes(16, 0, -1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.reportId, 8);
            encoder0.encode(this.buffer, 16, 0, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class HidConnectionSendFeatureReportResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private HidConnectionSendFeatureReportResponseParams(int version) {
            super(16, version);
        }

        public HidConnectionSendFeatureReportResponseParams() {
            this(0);
        }

        public static HidConnectionSendFeatureReportResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static HidConnectionSendFeatureReportResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static HidConnectionSendFeatureReportResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                HidConnectionSendFeatureReportResponseParams result = new HidConnectionSendFeatureReportResponseParams(elementsOrVersion);
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
    static class HidConnectionSendFeatureReportResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final HidConnection.SendFeatureReportResponse mCallback;

        HidConnectionSendFeatureReportResponseParamsForwardToCallback(HidConnection.SendFeatureReportResponse callback) {
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
                HidConnectionSendFeatureReportResponseParams response = HidConnectionSendFeatureReportResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.success));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class HidConnectionSendFeatureReportResponseParamsProxyToResponder implements HidConnection.SendFeatureReportResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        HidConnectionSendFeatureReportResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Boolean success) {
            HidConnectionSendFeatureReportResponseParams _response = new HidConnectionSendFeatureReportResponseParams();
            _response.success = success.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(3, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
