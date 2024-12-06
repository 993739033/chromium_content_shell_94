package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.SharedWorkerConnector;
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
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo.system.Core;
/* loaded from: classes2.dex */
class SharedWorkerConnector_Internal {
    private static final int CONNECT_ORDINAL = 0;
    public static final Interface.Manager<SharedWorkerConnector, SharedWorkerConnector.Proxy> MANAGER = new Interface.Manager<SharedWorkerConnector, SharedWorkerConnector.Proxy>() { // from class: org.chromium.blink.mojom.SharedWorkerConnector_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.SharedWorkerConnector";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public SharedWorkerConnector.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, SharedWorkerConnector impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public SharedWorkerConnector[] buildArray(int size) {
            return new SharedWorkerConnector[size];
        }
    };

    SharedWorkerConnector_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements SharedWorkerConnector.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.SharedWorkerConnector
        public void connect(SharedWorkerInfo info, SharedWorkerClient client, int creationContextType, MessagePortDescriptor messagePort, BlobUrlToken blobUrlToken, long clientUkmSourceId) {
            SharedWorkerConnectorConnectParams _message = new SharedWorkerConnectorConnectParams();
            _message.info = info;
            _message.client = client;
            _message.creationContextType = creationContextType;
            _message.messagePort = messagePort;
            _message.blobUrlToken = blobUrlToken;
            _message.clientUkmSourceId = clientUkmSourceId;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<SharedWorkerConnector> {
        Stub(Core core, SharedWorkerConnector impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(SharedWorkerConnector_Internal.MANAGER, messageWithHeader);
                    case -1:
                    default:
                        return false;
                    case 0:
                        SharedWorkerConnectorConnectParams data = SharedWorkerConnectorConnectParams.deserialize(messageWithHeader.getPayload());
                        getImpl().connect(data.info, data.client, data.creationContextType, data.messagePort, data.blobUrlToken, data.clientUkmSourceId);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), SharedWorkerConnector_Internal.MANAGER, messageWithHeader, receiver);
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
    static final class SharedWorkerConnectorConnectParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 56;
        private static final DataHeader[] VERSION_ARRAY;
        public BlobUrlToken blobUrlToken;
        public SharedWorkerClient client;
        public long clientUkmSourceId;
        public int creationContextType;
        public SharedWorkerInfo info;
        public MessagePortDescriptor messagePort;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(56, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private SharedWorkerConnectorConnectParams(int version) {
            super(56, version);
        }

        public SharedWorkerConnectorConnectParams() {
            this(0);
        }

        public static SharedWorkerConnectorConnectParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static SharedWorkerConnectorConnectParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static SharedWorkerConnectorConnectParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                SharedWorkerConnectorConnectParams result = new SharedWorkerConnectorConnectParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.info = SharedWorkerInfo.decode(decoder1);
                result.client = (SharedWorkerClient) decoder0.readServiceInterface(16, false, SharedWorkerClient.MANAGER);
                int readInt = decoder0.readInt(24);
                result.creationContextType = readInt;
                SharedWorkerCreationContextType.validate(readInt);
                result.creationContextType = SharedWorkerCreationContextType.toKnownValue(result.creationContextType);
                Decoder decoder12 = decoder0.readPointer(32, false);
                result.messagePort = MessagePortDescriptor.decode(decoder12);
                result.blobUrlToken = (BlobUrlToken) decoder0.readServiceInterface(40, true, BlobUrlToken.MANAGER);
                result.clientUkmSourceId = decoder0.readLong(48);
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
            encoder0.encode( this.client, 16, false,  SharedWorkerClient.MANAGER);
            encoder0.encode(this.creationContextType, 24);
            encoder0.encode((Struct) this.messagePort, 32, false);
            encoder0.encode( this.blobUrlToken, 40, true,  BlobUrlToken.MANAGER);
            encoder0.encode(this.clientUkmSourceId, 48);
        }
    }
}
