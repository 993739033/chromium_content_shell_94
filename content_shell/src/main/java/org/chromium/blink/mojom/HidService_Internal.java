package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;

import org.chromium.blink.mojom.HidService;
import org.chromium.device.mojom.HidConnection;
import org.chromium.device.mojom.HidConnectionClient;
import org.chromium.device.mojom.HidDeviceInfo;
import org.chromium.mojo.bindings.AssociatedInterfaceNotSupported;
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
class HidService_Internal {
    private static final int CONNECT_ORDINAL = 3;
    private static final int GET_DEVICES_ORDINAL = 1;
    public static final Interface.Manager<HidService, HidService.Proxy> MANAGER = new Interface.Manager<HidService, HidService.Proxy>() { // from class: org.chromium.blink.mojom.HidService_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.HidService";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public HidService.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, HidService impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public HidService[] buildArray(int size) {
            return new HidService[size];
        }
    };
    private static final int REGISTER_CLIENT_ORDINAL = 0;
    private static final int REQUEST_DEVICE_ORDINAL = 2;

    HidService_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements HidService.Proxy {
        @Override
        // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.HidService
        public void registerClient(AssociatedInterfaceNotSupported client) {
            HidServiceRegisterClientParams _message = new HidServiceRegisterClientParams();
            _message.client = client;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }

        @Override // org.chromium.blink.mojom.HidService
        public void getDevices(GetDevicesResponse callback) {
            HidServiceGetDevicesParams _message = new HidServiceGetDevicesParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1, 1, 0L)), new HidServiceGetDevicesResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.HidService
        public void requestDevice(HidDeviceFilter[] filters, RequestDeviceResponse callback) {
            HidServiceRequestDeviceParams _message = new HidServiceRequestDeviceParams();
            _message.filters = filters;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2, 1, 0L)), new HidServiceRequestDeviceResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.HidService
        public void connect(String deviceGuid, HidConnectionClient client, ConnectResponse callback) {
            HidServiceConnectParams _message = new HidServiceConnectParams();
            _message.deviceGuid = deviceGuid;
            _message.client = client;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3, 1, 0L)), new HidServiceConnectResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<HidService> {
        Stub(Core core, HidService impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(HidService_Internal.MANAGER, messageWithHeader);
                    case -1:
                    default:
                        return false;
                    case 0:
                        HidServiceRegisterClientParams data = HidServiceRegisterClientParams.deserialize(messageWithHeader.getPayload());
                        getImpl().registerClient(data.client);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), HidService_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                    default:
                        return false;
                    case 1:
                        HidServiceGetDevicesParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getDevices(new HidServiceGetDevicesResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 2:
                        getImpl().requestDevice(HidServiceRequestDeviceParams.deserialize(messageWithHeader.getPayload()).filters, new HidServiceRequestDeviceResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 3:
                        HidServiceConnectParams data = HidServiceConnectParams.deserialize(messageWithHeader.getPayload());
                        getImpl().connect(data.deviceGuid, data.client, new HidServiceConnectResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                }
            } catch (DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class HidServiceRegisterClientParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public AssociatedInterfaceNotSupported client;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private HidServiceRegisterClientParams(int version) {
            super(16, version);
        }

        public HidServiceRegisterClientParams() {
            this(0);
        }

        public static HidServiceRegisterClientParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static HidServiceRegisterClientParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static HidServiceRegisterClientParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                HidServiceRegisterClientParams result = new HidServiceRegisterClientParams(elementsOrVersion);
                result.client = decoder0.readAssociatedServiceInterfaceNotSupported(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.client, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class HidServiceGetDevicesParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private HidServiceGetDevicesParams(int version) {
            super(8, version);
        }

        public HidServiceGetDevicesParams() {
            this(0);
        }

        public static HidServiceGetDevicesParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static HidServiceGetDevicesParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static HidServiceGetDevicesParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                HidServiceGetDevicesParams result = new HidServiceGetDevicesParams(elementsOrVersion);
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
    public static final class HidServiceGetDevicesResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public HidDeviceInfo[] devices;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private HidServiceGetDevicesResponseParams(int version) {
            super(16, version);
        }

        public HidServiceGetDevicesResponseParams() {
            this(0);
        }

        public static HidServiceGetDevicesResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static HidServiceGetDevicesResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static HidServiceGetDevicesResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                HidServiceGetDevicesResponseParams result = new HidServiceGetDevicesResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.devices = new HidDeviceInfo[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.devices[i1] = HidDeviceInfo.decode(decoder2);
                }
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            HidDeviceInfo[] hidDeviceInfoArr = this.devices;
            if (hidDeviceInfoArr == null) {
                encoder0.encodeNullPointer(8, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(hidDeviceInfoArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                HidDeviceInfo[] hidDeviceInfoArr2 = this.devices;
                if (i0 < hidDeviceInfoArr2.length) {
                    encoder1.encode((Struct) hidDeviceInfoArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static class HidServiceGetDevicesResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final HidService.GetDevicesResponse mCallback;

        HidServiceGetDevicesResponseParamsForwardToCallback(HidService.GetDevicesResponse callback) {
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
                HidServiceGetDevicesResponseParams response = HidServiceGetDevicesResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.devices);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class HidServiceGetDevicesResponseParamsProxyToResponder implements HidService.GetDevicesResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        HidServiceGetDevicesResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(HidDeviceInfo[] devices) {
            HidServiceGetDevicesResponseParams _response = new HidServiceGetDevicesResponseParams();
            _response.devices = devices;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(1, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class HidServiceRequestDeviceParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public HidDeviceFilter[] filters;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private HidServiceRequestDeviceParams(int version) {
            super(16, version);
        }

        public HidServiceRequestDeviceParams() {
            this(0);
        }

        public static HidServiceRequestDeviceParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static HidServiceRequestDeviceParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static HidServiceRequestDeviceParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                HidServiceRequestDeviceParams result = new HidServiceRequestDeviceParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.filters = new HidDeviceFilter[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.filters[i1] = HidDeviceFilter.decode(decoder2);
                }
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            HidDeviceFilter[] hidDeviceFilterArr = this.filters;
            if (hidDeviceFilterArr == null) {
                encoder0.encodeNullPointer(8, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(hidDeviceFilterArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                HidDeviceFilter[] hidDeviceFilterArr2 = this.filters;
                if (i0 < hidDeviceFilterArr2.length) {
                    encoder1.encode((Struct) hidDeviceFilterArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class HidServiceRequestDeviceResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public HidDeviceInfo[] devices;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private HidServiceRequestDeviceResponseParams(int version) {
            super(16, version);
        }

        public HidServiceRequestDeviceResponseParams() {
            this(0);
        }

        public static HidServiceRequestDeviceResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static HidServiceRequestDeviceResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static HidServiceRequestDeviceResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                HidServiceRequestDeviceResponseParams result = new HidServiceRequestDeviceResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.devices = new HidDeviceInfo[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.devices[i1] = HidDeviceInfo.decode(decoder2);
                }
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            HidDeviceInfo[] hidDeviceInfoArr = this.devices;
            if (hidDeviceInfoArr == null) {
                encoder0.encodeNullPointer(8, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(hidDeviceInfoArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                HidDeviceInfo[] hidDeviceInfoArr2 = this.devices;
                if (i0 < hidDeviceInfoArr2.length) {
                    encoder1.encode((Struct) hidDeviceInfoArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static class HidServiceRequestDeviceResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final HidService.RequestDeviceResponse mCallback;

        HidServiceRequestDeviceResponseParamsForwardToCallback(HidService.RequestDeviceResponse callback) {
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
                HidServiceRequestDeviceResponseParams response = HidServiceRequestDeviceResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.devices);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class HidServiceRequestDeviceResponseParamsProxyToResponder implements HidService.RequestDeviceResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        HidServiceRequestDeviceResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(HidDeviceInfo[] devices) {
            HidServiceRequestDeviceResponseParams _response = new HidServiceRequestDeviceResponseParams();
            _response.devices = devices;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(2, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class HidServiceConnectParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public HidConnectionClient client;
        public String deviceGuid;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private HidServiceConnectParams(int version) {
            super(24, version);
        }

        public HidServiceConnectParams() {
            this(0);
        }

        public static HidServiceConnectParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static HidServiceConnectParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static HidServiceConnectParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                HidServiceConnectParams result = new HidServiceConnectParams(elementsOrVersion);
                result.deviceGuid = decoder0.readString(8, false);
                result.client = (HidConnectionClient) decoder0.readServiceInterface(16, false, HidConnectionClient.MANAGER);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.deviceGuid, 8, false);
            encoder0.encode(this.client, 16, false, HidConnectionClient.MANAGER);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class HidServiceConnectResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public HidConnection connection;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private HidServiceConnectResponseParams(int version) {
            super(16, version);
        }

        public HidServiceConnectResponseParams() {
            this(0);
        }

        public static HidServiceConnectResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static HidServiceConnectResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static HidServiceConnectResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                HidServiceConnectResponseParams result = new HidServiceConnectResponseParams(elementsOrVersion);
                result.connection = (HidConnection) decoder0.readServiceInterface(8, true, HidConnection.MANAGER);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.connection, 8, true, HidConnection.MANAGER);
        }
    }

    /* loaded from: classes2.dex */
    static class HidServiceConnectResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final HidService.ConnectResponse mCallback;

        HidServiceConnectResponseParamsForwardToCallback(HidService.ConnectResponse callback) {
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
                HidServiceConnectResponseParams response = HidServiceConnectResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.connection);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class HidServiceConnectResponseParamsProxyToResponder implements HidService.ConnectResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        HidServiceConnectResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(HidConnection connection) {
            HidServiceConnectResponseParams _response = new HidServiceConnectResponseParams();
            _response.connection = connection;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(3, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
