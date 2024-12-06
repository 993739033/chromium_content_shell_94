package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.GeolocationService;
import org.chromium.device.mojom.Geolocation;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.DeserializationException;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceControlMessagesHelper;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.MessageHeader;
import org.chromium.mojo.bindings.MessageReceiver;
import org.chromium.mojo.bindings.MessageReceiverWithResponder;
import org.chromium.mojo.bindings.ServiceMessage;
import org.chromium.mojo.bindings.SideEffectFreeCloseable;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo.system.Core;
/* loaded from: classes2.dex */
class GeolocationService_Internal {
    private static final int CREATE_GEOLOCATION_ORDINAL = 0;
    public static final Interface.Manager<GeolocationService, GeolocationService.Proxy> MANAGER = new Interface.Manager<GeolocationService, GeolocationService.Proxy>() { // from class: org.chromium.blink.mojom.GeolocationService_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.GeolocationService";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public GeolocationService.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, GeolocationService impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public GeolocationService[] buildArray(int size) {
            return new GeolocationService[size];
        }
    };

    GeolocationService_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements GeolocationService.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.GeolocationService
        public void createGeolocation(InterfaceRequest<Geolocation> receiver, boolean userGesture, CreateGeolocationResponse callback) {
            GeolocationServiceCreateGeolocationParams _message = new GeolocationServiceCreateGeolocationParams();
            _message.receiver = receiver;
            _message.userGesture = userGesture;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new GeolocationServiceCreateGeolocationResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<GeolocationService> {
        Stub(Core core, GeolocationService impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(GeolocationService_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), GeolocationService_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        GeolocationServiceCreateGeolocationParams data = GeolocationServiceCreateGeolocationParams.deserialize(messageWithHeader.getPayload());
                        getImpl().createGeolocation(data.receiver, data.userGesture, new GeolocationServiceCreateGeolocationResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class GeolocationServiceCreateGeolocationParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public InterfaceRequest<Geolocation> receiver;
        public boolean userGesture;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private GeolocationServiceCreateGeolocationParams(int version) {
            super(16, version);
        }

        public GeolocationServiceCreateGeolocationParams() {
            this(0);
        }

        public static GeolocationServiceCreateGeolocationParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static GeolocationServiceCreateGeolocationParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static GeolocationServiceCreateGeolocationParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                GeolocationServiceCreateGeolocationParams result = new GeolocationServiceCreateGeolocationParams(elementsOrVersion);
                result.receiver = decoder0.readInterfaceRequest(8, false);
                result.userGesture = decoder0.readBoolean(12, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((InterfaceRequest) this.receiver, 8, false);
            encoder0.encode(this.userGesture, 12, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class GeolocationServiceCreateGeolocationResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private GeolocationServiceCreateGeolocationResponseParams(int version) {
            super(16, version);
        }

        public GeolocationServiceCreateGeolocationResponseParams() {
            this(0);
        }

        public static GeolocationServiceCreateGeolocationResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static GeolocationServiceCreateGeolocationResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static GeolocationServiceCreateGeolocationResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                GeolocationServiceCreateGeolocationResponseParams result = new GeolocationServiceCreateGeolocationResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.status = readInt;
                PermissionStatus.validate(readInt);
                result.status = PermissionStatus.toKnownValue(result.status);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.status, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class GeolocationServiceCreateGeolocationResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final GeolocationService.CreateGeolocationResponse mCallback;

        GeolocationServiceCreateGeolocationResponseParamsForwardToCallback(GeolocationService.CreateGeolocationResponse callback) {
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
                GeolocationServiceCreateGeolocationResponseParams response = GeolocationServiceCreateGeolocationResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.status));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class GeolocationServiceCreateGeolocationResponseParamsProxyToResponder implements GeolocationService.CreateGeolocationResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        GeolocationServiceCreateGeolocationResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer status) {
            GeolocationServiceCreateGeolocationResponseParams _response = new GeolocationServiceCreateGeolocationResponseParams();
            _response.status = status.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
