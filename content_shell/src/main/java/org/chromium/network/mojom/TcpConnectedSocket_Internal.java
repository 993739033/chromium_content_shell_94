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
import org.chromium.network.mojom.TcpConnectedSocket;
/* loaded from: classes2.dex */
class TcpConnectedSocket_Internal {
    public static final Interface.Manager<TcpConnectedSocket, TcpConnectedSocket.Proxy> MANAGER = new Interface.Manager<TcpConnectedSocket, TcpConnectedSocket.Proxy>() { // from class: org.chromium.network.mojom.TcpConnectedSocket_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "network.mojom.TCPConnectedSocket";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public TcpConnectedSocket.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, TcpConnectedSocket impl) {
            return new Stub(core, impl);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public TcpConnectedSocket[] buildArray(int size) {
            return new TcpConnectedSocket[size];
        }
    };
    private static final int SET_KEEP_ALIVE_ORDINAL = 4;
    private static final int SET_NO_DELAY_ORDINAL = 3;
    private static final int SET_RECEIVE_BUFFER_SIZE_ORDINAL = 2;
    private static final int SET_SEND_BUFFER_SIZE_ORDINAL = 1;
    private static final int UPGRADE_TO_TLS_ORDINAL = 0;

    TcpConnectedSocket_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements TcpConnectedSocket.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.network.mojom.TcpConnectedSocket
        public void upgradeToTls(HostPortPair hostPortPair, TlsClientSocketOptions options, MutableNetworkTrafficAnnotationTag trafficAnnotation, InterfaceRequest<TlsClientSocket> receiver, SocketObserver observer, UpgradeToTlsResponse callback) {
            TcpConnectedSocketUpgradeToTlsParams _message = new TcpConnectedSocketUpgradeToTlsParams();
            _message.hostPortPair = hostPortPair;
            _message.options = options;
            _message.trafficAnnotation = trafficAnnotation;
            _message.receiver = receiver;
            _message.observer = observer;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new TcpConnectedSocketUpgradeToTlsResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.TcpConnectedSocket
        public void setSendBufferSize(int sendBufferSize, SetSendBufferSizeResponse callback) {
            TcpConnectedSocketSetSendBufferSizeParams _message = new TcpConnectedSocketSetSendBufferSizeParams();
            _message.sendBufferSize = sendBufferSize;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1, 1, 0L)), new TcpConnectedSocketSetSendBufferSizeResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.TcpConnectedSocket
        public void setReceiveBufferSize(int receiveBufferSize, SetReceiveBufferSizeResponse callback) {
            TcpConnectedSocketSetReceiveBufferSizeParams _message = new TcpConnectedSocketSetReceiveBufferSizeParams();
            _message.receiveBufferSize = receiveBufferSize;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2, 1, 0L)), new TcpConnectedSocketSetReceiveBufferSizeResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.TcpConnectedSocket
        public void setNoDelay(boolean noDelay, SetNoDelayResponse callback) {
            TcpConnectedSocketSetNoDelayParams _message = new TcpConnectedSocketSetNoDelayParams();
            _message.noDelay = noDelay;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3, 1, 0L)), new TcpConnectedSocketSetNoDelayResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.TcpConnectedSocket
        public void setKeepAlive(boolean enable, int delaySecs, SetKeepAliveResponse callback) {
            TcpConnectedSocketSetKeepAliveParams _message = new TcpConnectedSocketSetKeepAliveParams();
            _message.enable = enable;
            _message.delaySecs = delaySecs;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(4, 1, 0L)), new TcpConnectedSocketSetKeepAliveResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<TcpConnectedSocket> {
        Stub(Core core, TcpConnectedSocket impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(TcpConnectedSocket_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), TcpConnectedSocket_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        TcpConnectedSocketUpgradeToTlsParams data = TcpConnectedSocketUpgradeToTlsParams.deserialize(messageWithHeader.getPayload());
                        getImpl().upgradeToTls(data.hostPortPair, data.options, data.trafficAnnotation, data.receiver, data.observer, new TcpConnectedSocketUpgradeToTlsResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 1:
                        getImpl().setSendBufferSize(TcpConnectedSocketSetSendBufferSizeParams.deserialize(messageWithHeader.getPayload()).sendBufferSize, new TcpConnectedSocketSetSendBufferSizeResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 2:
                        getImpl().setReceiveBufferSize(TcpConnectedSocketSetReceiveBufferSizeParams.deserialize(messageWithHeader.getPayload()).receiveBufferSize, new TcpConnectedSocketSetReceiveBufferSizeResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 3:
                        getImpl().setNoDelay(TcpConnectedSocketSetNoDelayParams.deserialize(messageWithHeader.getPayload()).noDelay, new TcpConnectedSocketSetNoDelayResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 4:
                        TcpConnectedSocketSetKeepAliveParams data2 = TcpConnectedSocketSetKeepAliveParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setKeepAlive(data2.enable, data2.delaySecs, new TcpConnectedSocketSetKeepAliveResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class TcpConnectedSocketUpgradeToTlsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 48;
        private static final DataHeader[] VERSION_ARRAY;
        public HostPortPair hostPortPair;
        public SocketObserver observer;
        public TlsClientSocketOptions options;
        public InterfaceRequest<TlsClientSocket> receiver;
        public MutableNetworkTrafficAnnotationTag trafficAnnotation;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(48, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private TcpConnectedSocketUpgradeToTlsParams(int version) {
            super(48, version);
        }

        public TcpConnectedSocketUpgradeToTlsParams() {
            this(0);
        }

        public static TcpConnectedSocketUpgradeToTlsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static TcpConnectedSocketUpgradeToTlsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static TcpConnectedSocketUpgradeToTlsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                TcpConnectedSocketUpgradeToTlsParams result = new TcpConnectedSocketUpgradeToTlsParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.hostPortPair = HostPortPair.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, true);
                result.options = TlsClientSocketOptions.decode(decoder12);
                Decoder decoder13 = decoder0.readPointer(24, false);
                result.trafficAnnotation = MutableNetworkTrafficAnnotationTag.decode(decoder13);
                result.receiver = decoder0.readInterfaceRequest(32, false);
                result.observer = (SocketObserver) decoder0.readServiceInterface(36, true, SocketObserver.MANAGER);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.hostPortPair, 8, false);
            encoder0.encode((Struct) this.options, 16, true);
            encoder0.encode((Struct) this.trafficAnnotation, 24, false);
            encoder0.encode((InterfaceRequest) this.receiver, 32, false);
            encoder0.encode(this.observer, 36, true,  SocketObserver.MANAGER);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class TcpConnectedSocketUpgradeToTlsResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public int netError;
        public DataPipe.ConsumerHandle receiveStream;
        public DataPipe.ProducerHandle sendStream;
        public SslInfo sslInfo;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private TcpConnectedSocketUpgradeToTlsResponseParams(int version) {
            super(32, version);
            this.receiveStream = InvalidHandle.INSTANCE;
            this.sendStream = InvalidHandle.INSTANCE;
        }

        public TcpConnectedSocketUpgradeToTlsResponseParams() {
            this(0);
        }

        public static TcpConnectedSocketUpgradeToTlsResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static TcpConnectedSocketUpgradeToTlsResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static TcpConnectedSocketUpgradeToTlsResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                TcpConnectedSocketUpgradeToTlsResponseParams result = new TcpConnectedSocketUpgradeToTlsResponseParams(elementsOrVersion);
                result.netError = decoder0.readInt(8);
                result.receiveStream = decoder0.readConsumerHandle(12, true);
                result.sendStream = decoder0.readProducerHandle(16, true);
                Decoder decoder1 = decoder0.readPointer(24, true);
                result.sslInfo = SslInfo.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.netError, 8);
            encoder0.encode((Handle) this.receiveStream, 12, true);
            encoder0.encode((Handle) this.sendStream, 16, true);
            encoder0.encode((Struct) this.sslInfo, 24, true);
        }
    }

    /* loaded from: classes2.dex */
    static class TcpConnectedSocketUpgradeToTlsResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final TcpConnectedSocket.UpgradeToTlsResponse mCallback;

        TcpConnectedSocketUpgradeToTlsResponseParamsForwardToCallback(TcpConnectedSocket.UpgradeToTlsResponse callback) {
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
                TcpConnectedSocketUpgradeToTlsResponseParams response = TcpConnectedSocketUpgradeToTlsResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.netError), response.receiveStream, response.sendStream, response.sslInfo);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class TcpConnectedSocketUpgradeToTlsResponseParamsProxyToResponder implements TcpConnectedSocket.UpgradeToTlsResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        TcpConnectedSocketUpgradeToTlsResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback4
        public void call(Integer netError, DataPipe.ConsumerHandle receiveStream, DataPipe.ProducerHandle sendStream, SslInfo sslInfo) {
            TcpConnectedSocketUpgradeToTlsResponseParams _response = new TcpConnectedSocketUpgradeToTlsResponseParams();
            _response.netError = netError.intValue();
            _response.receiveStream = receiveStream;
            _response.sendStream = sendStream;
            _response.sslInfo = sslInfo;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class TcpConnectedSocketSetSendBufferSizeParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int sendBufferSize;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private TcpConnectedSocketSetSendBufferSizeParams(int version) {
            super(16, version);
        }

        public TcpConnectedSocketSetSendBufferSizeParams() {
            this(0);
        }

        public static TcpConnectedSocketSetSendBufferSizeParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static TcpConnectedSocketSetSendBufferSizeParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static TcpConnectedSocketSetSendBufferSizeParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                TcpConnectedSocketSetSendBufferSizeParams result = new TcpConnectedSocketSetSendBufferSizeParams(elementsOrVersion);
                result.sendBufferSize = decoder0.readInt(8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.sendBufferSize, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class TcpConnectedSocketSetSendBufferSizeResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int netError;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private TcpConnectedSocketSetSendBufferSizeResponseParams(int version) {
            super(16, version);
        }

        public TcpConnectedSocketSetSendBufferSizeResponseParams() {
            this(0);
        }

        public static TcpConnectedSocketSetSendBufferSizeResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static TcpConnectedSocketSetSendBufferSizeResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static TcpConnectedSocketSetSendBufferSizeResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                TcpConnectedSocketSetSendBufferSizeResponseParams result = new TcpConnectedSocketSetSendBufferSizeResponseParams(elementsOrVersion);
                result.netError = decoder0.readInt(8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.netError, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class TcpConnectedSocketSetSendBufferSizeResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final TcpConnectedSocket.SetSendBufferSizeResponse mCallback;

        TcpConnectedSocketSetSendBufferSizeResponseParamsForwardToCallback(TcpConnectedSocket.SetSendBufferSizeResponse callback) {
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
                TcpConnectedSocketSetSendBufferSizeResponseParams response = TcpConnectedSocketSetSendBufferSizeResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.netError));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class TcpConnectedSocketSetSendBufferSizeResponseParamsProxyToResponder implements TcpConnectedSocket.SetSendBufferSizeResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        TcpConnectedSocketSetSendBufferSizeResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer netError) {
            TcpConnectedSocketSetSendBufferSizeResponseParams _response = new TcpConnectedSocketSetSendBufferSizeResponseParams();
            _response.netError = netError.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(1, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class TcpConnectedSocketSetReceiveBufferSizeParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int receiveBufferSize;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private TcpConnectedSocketSetReceiveBufferSizeParams(int version) {
            super(16, version);
        }

        public TcpConnectedSocketSetReceiveBufferSizeParams() {
            this(0);
        }

        public static TcpConnectedSocketSetReceiveBufferSizeParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static TcpConnectedSocketSetReceiveBufferSizeParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static TcpConnectedSocketSetReceiveBufferSizeParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                TcpConnectedSocketSetReceiveBufferSizeParams result = new TcpConnectedSocketSetReceiveBufferSizeParams(elementsOrVersion);
                result.receiveBufferSize = decoder0.readInt(8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.receiveBufferSize, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class TcpConnectedSocketSetReceiveBufferSizeResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int netError;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private TcpConnectedSocketSetReceiveBufferSizeResponseParams(int version) {
            super(16, version);
        }

        public TcpConnectedSocketSetReceiveBufferSizeResponseParams() {
            this(0);
        }

        public static TcpConnectedSocketSetReceiveBufferSizeResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static TcpConnectedSocketSetReceiveBufferSizeResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static TcpConnectedSocketSetReceiveBufferSizeResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                TcpConnectedSocketSetReceiveBufferSizeResponseParams result = new TcpConnectedSocketSetReceiveBufferSizeResponseParams(elementsOrVersion);
                result.netError = decoder0.readInt(8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.netError, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class TcpConnectedSocketSetReceiveBufferSizeResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final TcpConnectedSocket.SetReceiveBufferSizeResponse mCallback;

        TcpConnectedSocketSetReceiveBufferSizeResponseParamsForwardToCallback(TcpConnectedSocket.SetReceiveBufferSizeResponse callback) {
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
                TcpConnectedSocketSetReceiveBufferSizeResponseParams response = TcpConnectedSocketSetReceiveBufferSizeResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.netError));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class TcpConnectedSocketSetReceiveBufferSizeResponseParamsProxyToResponder implements TcpConnectedSocket.SetReceiveBufferSizeResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        TcpConnectedSocketSetReceiveBufferSizeResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer netError) {
            TcpConnectedSocketSetReceiveBufferSizeResponseParams _response = new TcpConnectedSocketSetReceiveBufferSizeResponseParams();
            _response.netError = netError.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(2, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class TcpConnectedSocketSetNoDelayParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean noDelay;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private TcpConnectedSocketSetNoDelayParams(int version) {
            super(16, version);
        }

        public TcpConnectedSocketSetNoDelayParams() {
            this(0);
        }

        public static TcpConnectedSocketSetNoDelayParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static TcpConnectedSocketSetNoDelayParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static TcpConnectedSocketSetNoDelayParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                TcpConnectedSocketSetNoDelayParams result = new TcpConnectedSocketSetNoDelayParams(elementsOrVersion);
                result.noDelay = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.noDelay, 8, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class TcpConnectedSocketSetNoDelayResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private TcpConnectedSocketSetNoDelayResponseParams(int version) {
            super(16, version);
        }

        public TcpConnectedSocketSetNoDelayResponseParams() {
            this(0);
        }

        public static TcpConnectedSocketSetNoDelayResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static TcpConnectedSocketSetNoDelayResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static TcpConnectedSocketSetNoDelayResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                TcpConnectedSocketSetNoDelayResponseParams result = new TcpConnectedSocketSetNoDelayResponseParams(elementsOrVersion);
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
    static class TcpConnectedSocketSetNoDelayResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final TcpConnectedSocket.SetNoDelayResponse mCallback;

        TcpConnectedSocketSetNoDelayResponseParamsForwardToCallback(TcpConnectedSocket.SetNoDelayResponse callback) {
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
                TcpConnectedSocketSetNoDelayResponseParams response = TcpConnectedSocketSetNoDelayResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.success));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class TcpConnectedSocketSetNoDelayResponseParamsProxyToResponder implements TcpConnectedSocket.SetNoDelayResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        TcpConnectedSocketSetNoDelayResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Boolean success) {
            TcpConnectedSocketSetNoDelayResponseParams _response = new TcpConnectedSocketSetNoDelayResponseParams();
            _response.success = success.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(3, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class TcpConnectedSocketSetKeepAliveParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int delaySecs;
        public boolean enable;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private TcpConnectedSocketSetKeepAliveParams(int version) {
            super(16, version);
        }

        public TcpConnectedSocketSetKeepAliveParams() {
            this(0);
        }

        public static TcpConnectedSocketSetKeepAliveParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static TcpConnectedSocketSetKeepAliveParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static TcpConnectedSocketSetKeepAliveParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                TcpConnectedSocketSetKeepAliveParams result = new TcpConnectedSocketSetKeepAliveParams(elementsOrVersion);
                result.enable = decoder0.readBoolean(8, 0);
                result.delaySecs = decoder0.readInt(12);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.enable, 8, 0);
            encoder0.encode(this.delaySecs, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class TcpConnectedSocketSetKeepAliveResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private TcpConnectedSocketSetKeepAliveResponseParams(int version) {
            super(16, version);
        }

        public TcpConnectedSocketSetKeepAliveResponseParams() {
            this(0);
        }

        public static TcpConnectedSocketSetKeepAliveResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static TcpConnectedSocketSetKeepAliveResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static TcpConnectedSocketSetKeepAliveResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                TcpConnectedSocketSetKeepAliveResponseParams result = new TcpConnectedSocketSetKeepAliveResponseParams(elementsOrVersion);
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
    static class TcpConnectedSocketSetKeepAliveResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final TcpConnectedSocket.SetKeepAliveResponse mCallback;

        TcpConnectedSocketSetKeepAliveResponseParamsForwardToCallback(TcpConnectedSocket.SetKeepAliveResponse callback) {
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
                TcpConnectedSocketSetKeepAliveResponseParams response = TcpConnectedSocketSetKeepAliveResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.success));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class TcpConnectedSocketSetKeepAliveResponseParamsProxyToResponder implements TcpConnectedSocket.SetKeepAliveResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        TcpConnectedSocketSetKeepAliveResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Boolean success) {
            TcpConnectedSocketSetKeepAliveResponseParams _response = new TcpConnectedSocketSetKeepAliveResponseParams();
            _response.success = success.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(4, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
