package org.chromium.device.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.device.mojom.GeolocationContext;
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
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo.system.Core;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
class GeolocationContext_Internal {
    private static final int BIND_GEOLOCATION_ORDINAL = 0;
    private static final int CLEAR_OVERRIDE_ORDINAL = 2;
    public static final Interface.Manager<GeolocationContext, GeolocationContext.Proxy> MANAGER = new Interface.Manager<GeolocationContext, GeolocationContext.Proxy>() { // from class: org.chromium.device.mojom.GeolocationContext_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "device.mojom.GeolocationContext";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public GeolocationContext.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, GeolocationContext impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public GeolocationContext[] buildArray(int size) {
            return new GeolocationContext[size];
        }
    };
    private static final int SET_OVERRIDE_ORDINAL = 1;

    GeolocationContext_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements GeolocationContext.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.device.mojom.GeolocationContext
        public void bindGeolocation(InterfaceRequest<Geolocation> receiver, Url origin) {
            GeolocationContextBindGeolocationParams _message = new GeolocationContextBindGeolocationParams();
            _message.receiver = receiver;
            _message.origin = origin;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }

        @Override // org.chromium.device.mojom.GeolocationContext
        public void setOverride(Geoposition geoposition) {
            GeolocationContextSetOverrideParams _message = new GeolocationContextSetOverrideParams();
            _message.geoposition = geoposition;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1)));
        }

        @Override // org.chromium.device.mojom.GeolocationContext
        public void clearOverride() {
            GeolocationContextClearOverrideParams _message = new GeolocationContextClearOverrideParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<GeolocationContext> {
        Stub(Core core, GeolocationContext impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(GeolocationContext_Internal.MANAGER, messageWithHeader);
                    case -1:
                    default:
                        return false;
                    case 0:
                        GeolocationContextBindGeolocationParams data = GeolocationContextBindGeolocationParams.deserialize(messageWithHeader.getPayload());
                        getImpl().bindGeolocation(data.receiver, data.origin);
                        return true;
                    case 1:
                        getImpl().setOverride(GeolocationContextSetOverrideParams.deserialize(messageWithHeader.getPayload()).geoposition);
                        return true;
                    case 2:
                        GeolocationContextClearOverrideParams.deserialize(messageWithHeader.getPayload());
                        getImpl().clearOverride();
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), GeolocationContext_Internal.MANAGER, messageWithHeader, receiver);
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
    static final class GeolocationContextBindGeolocationParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public Url origin;
        public InterfaceRequest<Geolocation> receiver;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private GeolocationContextBindGeolocationParams(int version) {
            super(24, version);
        }

        public GeolocationContextBindGeolocationParams() {
            this(0);
        }

        public static GeolocationContextBindGeolocationParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static GeolocationContextBindGeolocationParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static GeolocationContextBindGeolocationParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                GeolocationContextBindGeolocationParams result = new GeolocationContextBindGeolocationParams(elementsOrVersion);
                result.receiver = decoder0.readInterfaceRequest(8, false);
                Decoder decoder1 = decoder0.readPointer(16, false);
                result.origin = Url.decode(decoder1);
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
            encoder0.encode((Struct) this.origin, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class GeolocationContextSetOverrideParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public Geoposition geoposition;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private GeolocationContextSetOverrideParams(int version) {
            super(16, version);
        }

        public GeolocationContextSetOverrideParams() {
            this(0);
        }

        public static GeolocationContextSetOverrideParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static GeolocationContextSetOverrideParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static GeolocationContextSetOverrideParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                GeolocationContextSetOverrideParams result = new GeolocationContextSetOverrideParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.geoposition = Geoposition.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.geoposition, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class GeolocationContextClearOverrideParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private GeolocationContextClearOverrideParams(int version) {
            super(8, version);
        }

        public GeolocationContextClearOverrideParams() {
            this(0);
        }

        public static GeolocationContextClearOverrideParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static GeolocationContextClearOverrideParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static GeolocationContextClearOverrideParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                GeolocationContextClearOverrideParams result = new GeolocationContextClearOverrideParams(elementsOrVersion);
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
}
