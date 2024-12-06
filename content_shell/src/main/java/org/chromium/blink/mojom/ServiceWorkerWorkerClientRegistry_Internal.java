package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.ServiceWorkerWorkerClientRegistry;
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
/* loaded from: classes2.dex */
class ServiceWorkerWorkerClientRegistry_Internal {
    private static final int CLONE_WORKER_CLIENT_REGISTRY_ORDINAL = 1;
    public static final Interface.Manager<ServiceWorkerWorkerClientRegistry, ServiceWorkerWorkerClientRegistry.Proxy> MANAGER = new Interface.Manager<ServiceWorkerWorkerClientRegistry, ServiceWorkerWorkerClientRegistry.Proxy>() { // from class: org.chromium.blink.mojom.ServiceWorkerWorkerClientRegistry_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.ServiceWorkerWorkerClientRegistry";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public ServiceWorkerWorkerClientRegistry.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, ServiceWorkerWorkerClientRegistry impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public ServiceWorkerWorkerClientRegistry[] buildArray(int size) {
            return new ServiceWorkerWorkerClientRegistry[size];
        }
    };
    private static final int REGISTER_WORKER_CLIENT_ORDINAL = 0;

    ServiceWorkerWorkerClientRegistry_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements ServiceWorkerWorkerClientRegistry.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.ServiceWorkerWorkerClientRegistry
        public void registerWorkerClient(ServiceWorkerWorkerClient client) {
            ServiceWorkerWorkerClientRegistryRegisterWorkerClientParams _message = new ServiceWorkerWorkerClientRegistryRegisterWorkerClientParams();
            _message.client = client;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }

        @Override // org.chromium.blink.mojom.ServiceWorkerWorkerClientRegistry
        public void cloneWorkerClientRegistry(InterfaceRequest<ServiceWorkerWorkerClientRegistry> host) {
            ServiceWorkerWorkerClientRegistryCloneWorkerClientRegistryParams _message = new ServiceWorkerWorkerClientRegistryCloneWorkerClientRegistryParams();
            _message.host = host;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<ServiceWorkerWorkerClientRegistry> {
        Stub(Core core, ServiceWorkerWorkerClientRegistry impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(ServiceWorkerWorkerClientRegistry_Internal.MANAGER, messageWithHeader);
                    case -1:
                    default:
                        return false;
                    case 0:
                        ServiceWorkerWorkerClientRegistryRegisterWorkerClientParams data = ServiceWorkerWorkerClientRegistryRegisterWorkerClientParams.deserialize(messageWithHeader.getPayload());
                        getImpl().registerWorkerClient(data.client);
                        return true;
                    case 1:
                        ServiceWorkerWorkerClientRegistryCloneWorkerClientRegistryParams data2 = ServiceWorkerWorkerClientRegistryCloneWorkerClientRegistryParams.deserialize(messageWithHeader.getPayload());
                        getImpl().cloneWorkerClientRegistry(data2.host);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), ServiceWorkerWorkerClientRegistry_Internal.MANAGER, messageWithHeader, receiver);
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
    static final class ServiceWorkerWorkerClientRegistryRegisterWorkerClientParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public ServiceWorkerWorkerClient client;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerWorkerClientRegistryRegisterWorkerClientParams(int version) {
            super(16, version);
        }

        public ServiceWorkerWorkerClientRegistryRegisterWorkerClientParams() {
            this(0);
        }

        public static ServiceWorkerWorkerClientRegistryRegisterWorkerClientParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerWorkerClientRegistryRegisterWorkerClientParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerWorkerClientRegistryRegisterWorkerClientParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerWorkerClientRegistryRegisterWorkerClientParams result = new ServiceWorkerWorkerClientRegistryRegisterWorkerClientParams(elementsOrVersion);
                result.client = (ServiceWorkerWorkerClient) decoder0.readServiceInterface(8, false, ServiceWorkerWorkerClient.MANAGER);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode( this.client, 8, false,  ServiceWorkerWorkerClient.MANAGER);
        }
    }

    /* loaded from: classes2.dex */
    static final class ServiceWorkerWorkerClientRegistryCloneWorkerClientRegistryParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public InterfaceRequest<ServiceWorkerWorkerClientRegistry> host;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerWorkerClientRegistryCloneWorkerClientRegistryParams(int version) {
            super(16, version);
        }

        public ServiceWorkerWorkerClientRegistryCloneWorkerClientRegistryParams() {
            this(0);
        }

        public static ServiceWorkerWorkerClientRegistryCloneWorkerClientRegistryParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerWorkerClientRegistryCloneWorkerClientRegistryParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerWorkerClientRegistryCloneWorkerClientRegistryParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerWorkerClientRegistryCloneWorkerClientRegistryParams result = new ServiceWorkerWorkerClientRegistryCloneWorkerClientRegistryParams(elementsOrVersion);
                result.host = decoder0.readInterfaceRequest(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((InterfaceRequest) this.host, 8, false);
        }
    }
}
