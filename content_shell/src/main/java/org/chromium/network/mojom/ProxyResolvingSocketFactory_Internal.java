package org.chromium.network.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
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
import org.chromium.mojo.system.DataPipe;
import org.chromium.mojo.system.Handle;
import org.chromium.mojo.system.InvalidHandle;
import org.chromium.network.mojom.ProxyResolvingSocketFactory;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
class ProxyResolvingSocketFactory_Internal {
    private static final int CREATE_PROXY_RESOLVING_SOCKET_ORDINAL = 0;
    public static final Interface.Manager<ProxyResolvingSocketFactory, ProxyResolvingSocketFactory.Proxy> MANAGER = new Interface.Manager<ProxyResolvingSocketFactory, ProxyResolvingSocketFactory.Proxy>() { // from class: org.chromium.network.mojom.ProxyResolvingSocketFactory_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "network.mojom.ProxyResolvingSocketFactory";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public ProxyResolvingSocketFactory.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, ProxyResolvingSocketFactory impl) {
            return new Stub(core, impl);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public ProxyResolvingSocketFactory[] buildArray(int size) {
            return new ProxyResolvingSocketFactory[size];
        }
    };

    ProxyResolvingSocketFactory_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements ProxyResolvingSocketFactory.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.network.mojom.ProxyResolvingSocketFactory
        public void createProxyResolvingSocket(Url url, NetworkIsolationKey networkIsolationKey, ProxyResolvingSocketOptions options, MutableNetworkTrafficAnnotationTag trafficAnnotation, InterfaceRequest<ProxyResolvingSocket> socket, SocketObserver observer, CreateProxyResolvingSocketResponse callback) {
            ProxyResolvingSocketFactoryCreateProxyResolvingSocketParams _message = new ProxyResolvingSocketFactoryCreateProxyResolvingSocketParams();
            _message.url = url;
            _message.networkIsolationKey = networkIsolationKey;
            _message.options = options;
            _message.trafficAnnotation = trafficAnnotation;
            _message.socket = socket;
            _message.observer = observer;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new ProxyResolvingSocketFactoryCreateProxyResolvingSocketResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<ProxyResolvingSocketFactory> {
        Stub(Core core, ProxyResolvingSocketFactory impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(ProxyResolvingSocketFactory_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), ProxyResolvingSocketFactory_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        ProxyResolvingSocketFactoryCreateProxyResolvingSocketParams data = ProxyResolvingSocketFactoryCreateProxyResolvingSocketParams.deserialize(messageWithHeader.getPayload());
                        getImpl().createProxyResolvingSocket(data.url, data.networkIsolationKey, data.options, data.trafficAnnotation, data.socket, data.observer, new ProxyResolvingSocketFactoryCreateProxyResolvingSocketResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class ProxyResolvingSocketFactoryCreateProxyResolvingSocketParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 56;
        private static final DataHeader[] VERSION_ARRAY;
        public NetworkIsolationKey networkIsolationKey;
        public SocketObserver observer;
        public ProxyResolvingSocketOptions options;
        public InterfaceRequest<ProxyResolvingSocket> socket;
        public MutableNetworkTrafficAnnotationTag trafficAnnotation;
        public Url url;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(56, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ProxyResolvingSocketFactoryCreateProxyResolvingSocketParams(int version) {
            super(56, version);
        }

        public ProxyResolvingSocketFactoryCreateProxyResolvingSocketParams() {
            this(0);
        }

        public static ProxyResolvingSocketFactoryCreateProxyResolvingSocketParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ProxyResolvingSocketFactoryCreateProxyResolvingSocketParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ProxyResolvingSocketFactoryCreateProxyResolvingSocketParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ProxyResolvingSocketFactoryCreateProxyResolvingSocketParams result = new ProxyResolvingSocketFactoryCreateProxyResolvingSocketParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.url = Url.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.networkIsolationKey = NetworkIsolationKey.decode(decoder12);
                Decoder decoder13 = decoder0.readPointer(24, true);
                result.options = ProxyResolvingSocketOptions.decode(decoder13);
                Decoder decoder14 = decoder0.readPointer(32, false);
                result.trafficAnnotation = MutableNetworkTrafficAnnotationTag.decode(decoder14);
                result.socket = decoder0.readInterfaceRequest(40, false);
                result.observer = (SocketObserver) decoder0.readServiceInterface(44, true, SocketObserver.MANAGER);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.url, 8, false);
            encoder0.encode((Struct) this.networkIsolationKey, 16, false);
            encoder0.encode((Struct) this.options, 24, true);
            encoder0.encode((Struct) this.trafficAnnotation, 32, false);
            encoder0.encode((InterfaceRequest) this.socket, 40, false);
            encoder0.encode( this.observer, 44, true, SocketObserver.MANAGER);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ProxyResolvingSocketFactoryCreateProxyResolvingSocketResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 40;
        private static final DataHeader[] VERSION_ARRAY;
        public IpEndPoint localAddr;
        public IpEndPoint peerAddr;
        public DataPipe.ConsumerHandle receiveStream;
        public int result;
        public DataPipe.ProducerHandle sendStream;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ProxyResolvingSocketFactoryCreateProxyResolvingSocketResponseParams(int version) {
            super(40, version);
            this.receiveStream = InvalidHandle.INSTANCE;
            this.sendStream = InvalidHandle.INSTANCE;
        }

        public ProxyResolvingSocketFactoryCreateProxyResolvingSocketResponseParams() {
            this(0);
        }

        public static ProxyResolvingSocketFactoryCreateProxyResolvingSocketResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ProxyResolvingSocketFactoryCreateProxyResolvingSocketResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ProxyResolvingSocketFactoryCreateProxyResolvingSocketResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ProxyResolvingSocketFactoryCreateProxyResolvingSocketResponseParams result = new ProxyResolvingSocketFactoryCreateProxyResolvingSocketResponseParams(elementsOrVersion);
                result.result = decoder0.readInt(8);
                result.receiveStream = decoder0.readConsumerHandle(12, true);
                Decoder decoder1 = decoder0.readPointer(16, true);
                result.localAddr = IpEndPoint.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(24, true);
                result.peerAddr = IpEndPoint.decode(decoder12);
                result.sendStream = decoder0.readProducerHandle(32, true);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.result, 8);
            encoder0.encode((Handle) this.receiveStream, 12, true);
            encoder0.encode((Struct) this.localAddr, 16, true);
            encoder0.encode((Struct) this.peerAddr, 24, true);
            encoder0.encode((Handle) this.sendStream, 32, true);
        }
    }

    /* loaded from: classes2.dex */
    static class ProxyResolvingSocketFactoryCreateProxyResolvingSocketResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final ProxyResolvingSocketFactory.CreateProxyResolvingSocketResponse mCallback;

        ProxyResolvingSocketFactoryCreateProxyResolvingSocketResponseParamsForwardToCallback(ProxyResolvingSocketFactory.CreateProxyResolvingSocketResponse callback) {
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
                ProxyResolvingSocketFactoryCreateProxyResolvingSocketResponseParams response = ProxyResolvingSocketFactoryCreateProxyResolvingSocketResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.result), response.localAddr, response.peerAddr, response.receiveStream, response.sendStream);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class ProxyResolvingSocketFactoryCreateProxyResolvingSocketResponseParamsProxyToResponder implements ProxyResolvingSocketFactory.CreateProxyResolvingSocketResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ProxyResolvingSocketFactoryCreateProxyResolvingSocketResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback5
        public void call(Integer result, IpEndPoint localAddr, IpEndPoint peerAddr, DataPipe.ConsumerHandle receiveStream, DataPipe.ProducerHandle sendStream) {
            ProxyResolvingSocketFactoryCreateProxyResolvingSocketResponseParams _response = new ProxyResolvingSocketFactoryCreateProxyResolvingSocketResponseParams();
            _response.result = result.intValue();
            _response.localAddr = localAddr;
            _response.peerAddr = peerAddr;
            _response.receiveStream = receiveStream;
            _response.sendStream = sendStream;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
