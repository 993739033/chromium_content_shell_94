package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.DomStorage;
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
import org.chromium.url.internal.mojom.Origin;
/* loaded from: classes2.dex */
class DomStorage_Internal {
    private static final int BIND_SESSION_STORAGE_AREA_ORDINAL = 2;
    private static final int BIND_SESSION_STORAGE_NAMESPACE_ORDINAL = 1;
    public static final Interface.Manager<DomStorage, DomStorage.Proxy> MANAGER = new Interface.Manager<DomStorage, DomStorage.Proxy>() { // from class: org.chromium.blink.mojom.DomStorage_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.DomStorage";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public DomStorage.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, DomStorage impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public DomStorage[] buildArray(int size) {
            return new DomStorage[size];
        }
    };
    private static final int OPEN_LOCAL_STORAGE_ORDINAL = 0;

    DomStorage_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements DomStorage.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.DomStorage
        public void openLocalStorage(Origin origin, InterfaceRequest<StorageArea> area) {
            DomStorageOpenLocalStorageParams _message = new DomStorageOpenLocalStorageParams();
            _message.origin = origin;
            _message.area = area;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }

        @Override // org.chromium.blink.mojom.DomStorage
        public void bindSessionStorageNamespace(String namespaceId, InterfaceRequest<SessionStorageNamespace> receiver) {
            DomStorageBindSessionStorageNamespaceParams _message = new DomStorageBindSessionStorageNamespaceParams();
            _message.namespaceId = namespaceId;
            _message.receiver = receiver;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1)));
        }

        @Override // org.chromium.blink.mojom.DomStorage
        public void bindSessionStorageArea(Origin origin, String namespaceId, InterfaceRequest<StorageArea> sessionNamespace) {
            DomStorageBindSessionStorageAreaParams _message = new DomStorageBindSessionStorageAreaParams();
            _message.origin = origin;
            _message.namespaceId = namespaceId;
            _message.sessionNamespace = sessionNamespace;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<DomStorage> {
        Stub(Core core, DomStorage impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(DomStorage_Internal.MANAGER, messageWithHeader);
                    case -1:
                    default:
                        return false;
                    case 0:
                        DomStorageOpenLocalStorageParams data = DomStorageOpenLocalStorageParams.deserialize(messageWithHeader.getPayload());
                        getImpl().openLocalStorage(data.origin, data.area);
                        return true;
                    case 1:
                        DomStorageBindSessionStorageNamespaceParams data2 = DomStorageBindSessionStorageNamespaceParams.deserialize(messageWithHeader.getPayload());
                        getImpl().bindSessionStorageNamespace(data2.namespaceId, data2.receiver);
                        return true;
                    case 2:
                        DomStorageBindSessionStorageAreaParams data3 = DomStorageBindSessionStorageAreaParams.deserialize(messageWithHeader.getPayload());
                        getImpl().bindSessionStorageArea(data3.origin, data3.namespaceId, data3.sessionNamespace);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), DomStorage_Internal.MANAGER, messageWithHeader, receiver);
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
    static final class DomStorageOpenLocalStorageParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public InterfaceRequest<StorageArea> area;
        public Origin origin;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private DomStorageOpenLocalStorageParams(int version) {
            super(24, version);
        }

        public DomStorageOpenLocalStorageParams() {
            this(0);
        }

        public static DomStorageOpenLocalStorageParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static DomStorageOpenLocalStorageParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static DomStorageOpenLocalStorageParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                DomStorageOpenLocalStorageParams result = new DomStorageOpenLocalStorageParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.origin = Origin.decode(decoder1);
                result.area = decoder0.readInterfaceRequest(16, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.origin, 8, false);
            encoder0.encode((InterfaceRequest) this.area, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class DomStorageBindSessionStorageNamespaceParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public String namespaceId;
        public InterfaceRequest<SessionStorageNamespace> receiver;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private DomStorageBindSessionStorageNamespaceParams(int version) {
            super(24, version);
        }

        public DomStorageBindSessionStorageNamespaceParams() {
            this(0);
        }

        public static DomStorageBindSessionStorageNamespaceParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static DomStorageBindSessionStorageNamespaceParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static DomStorageBindSessionStorageNamespaceParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                DomStorageBindSessionStorageNamespaceParams result = new DomStorageBindSessionStorageNamespaceParams(elementsOrVersion);
                result.namespaceId = decoder0.readString(8, false);
                result.receiver = decoder0.readInterfaceRequest(16, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.namespaceId, 8, false);
            encoder0.encode((InterfaceRequest) this.receiver, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class DomStorageBindSessionStorageAreaParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public String namespaceId;
        public Origin origin;
        public InterfaceRequest<StorageArea> sessionNamespace;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private DomStorageBindSessionStorageAreaParams(int version) {
            super(32, version);
        }

        public DomStorageBindSessionStorageAreaParams() {
            this(0);
        }

        public static DomStorageBindSessionStorageAreaParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static DomStorageBindSessionStorageAreaParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static DomStorageBindSessionStorageAreaParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                DomStorageBindSessionStorageAreaParams result = new DomStorageBindSessionStorageAreaParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.origin = Origin.decode(decoder1);
                result.namespaceId = decoder0.readString(16, false);
                result.sessionNamespace = decoder0.readInterfaceRequest(24, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.origin, 8, false);
            encoder0.encode(this.namespaceId, 16, false);
            encoder0.encode((InterfaceRequest) this.sessionNamespace, 24, false);
        }
    }
}
