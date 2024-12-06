package org.chromium.network.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;

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
import org.chromium.network.mojom.HostResolver;

/* loaded from: classes2.dex */
class HostResolver_Internal {
    public static final Interface.Manager<HostResolver, HostResolver.Proxy> MANAGER = new Interface.Manager<HostResolver, HostResolver.Proxy>() { // from class: org.chromium.network.mojom.HostResolver_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "network.mojom.HostResolver";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public HostResolver.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, HostResolver impl) {
            return new Stub(core, impl);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public HostResolver[] buildArray(int size) {
            return new HostResolver[size];
        }
    };
    private static final int MDNS_LISTEN_ORDINAL = 1;
    private static final int RESOLVE_HOST_ORDINAL = 0;

    HostResolver_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements HostResolver.Proxy {
        @Override
        // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.network.mojom.HostResolver
        public void resolveHost(HostPortPair host, NetworkIsolationKey networkIsolationKey, ResolveHostParameters optionalParameters, ResolveHostClient responseClient) {
            HostResolverResolveHostParams _message = new HostResolverResolveHostParams();
            _message.host = host;
            _message.networkIsolationKey = networkIsolationKey;
            _message.optionalParameters = optionalParameters;
            _message.responseClient = responseClient;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }

        @Override // org.chromium.network.mojom.HostResolver
        public void mdnsListen(HostPortPair host, int queryType, MdnsListenClient responseClient, MdnsListenResponse callback) {
            HostResolverMdnsListenParams _message = new HostResolverMdnsListenParams();
            _message.host = host;
            _message.queryType = queryType;
            _message.responseClient = responseClient;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1, 1, 0L)), new HostResolverMdnsListenResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<HostResolver> {
        Stub(Core core, HostResolver impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(HostResolver_Internal.MANAGER, messageWithHeader);
                    case -1:
                    default:
                        return false;
                    case 0:
                        HostResolverResolveHostParams data = HostResolverResolveHostParams.deserialize(messageWithHeader.getPayload());
                        getImpl().resolveHost(data.host, data.networkIsolationKey, data.optionalParameters, data.responseClient);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), HostResolver_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                    default:
                        return false;
                    case 1:
                        HostResolverMdnsListenParams data = HostResolverMdnsListenParams.deserialize(messageWithHeader.getPayload());
                        getImpl().mdnsListen(data.host, data.queryType, data.responseClient, new HostResolverMdnsListenResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                }
            } catch (DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class HostResolverResolveHostParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 40;
        private static final DataHeader[] VERSION_ARRAY;
        public HostPortPair host;
        public NetworkIsolationKey networkIsolationKey;
        public ResolveHostParameters optionalParameters;
        public ResolveHostClient responseClient;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private HostResolverResolveHostParams(int version) {
            super(40, version);
        }

        public HostResolverResolveHostParams() {
            this(0);
        }

        public static HostResolverResolveHostParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static HostResolverResolveHostParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static HostResolverResolveHostParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                HostResolverResolveHostParams result = new HostResolverResolveHostParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.host = HostPortPair.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.networkIsolationKey = NetworkIsolationKey.decode(decoder12);
                Decoder decoder13 = decoder0.readPointer(24, true);
                result.optionalParameters = ResolveHostParameters.decode(decoder13);
                result.responseClient = (ResolveHostClient) decoder0.readServiceInterface(32, false, ResolveHostClient.MANAGER);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.host, 8, false);
            encoder0.encode((Struct) this.networkIsolationKey, 16, false);
            encoder0.encode((Struct) this.optionalParameters, 24, true);
            encoder0.encode(this.responseClient, 32, false, ResolveHostClient.MANAGER);
        }
    }

    /* loaded from: classes2.dex */
    static final class HostResolverMdnsListenParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public HostPortPair host;
        public int queryType;
        public MdnsListenClient responseClient;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private HostResolverMdnsListenParams(int version) {
            super(32, version);
        }

        public HostResolverMdnsListenParams() {
            this(0);
        }

        public static HostResolverMdnsListenParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static HostResolverMdnsListenParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static HostResolverMdnsListenParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                HostResolverMdnsListenParams result = new HostResolverMdnsListenParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.host = HostPortPair.decode(decoder1);
                int readInt = decoder0.readInt(16);
                result.queryType = readInt;
                DnsQueryType.validate(readInt);
                result.queryType = DnsQueryType.toKnownValue(result.queryType);
                result.responseClient = (MdnsListenClient) decoder0.readServiceInterface(20, false, MdnsListenClient.MANAGER);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.host, 8, false);
            encoder0.encode(this.queryType, 16);
            encoder0.encode(this.responseClient, 20, false, MdnsListenClient.MANAGER);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class HostResolverMdnsListenResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int result;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private HostResolverMdnsListenResponseParams(int version) {
            super(16, version);
        }

        public HostResolverMdnsListenResponseParams() {
            this(0);
        }

        public static HostResolverMdnsListenResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static HostResolverMdnsListenResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static HostResolverMdnsListenResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                HostResolverMdnsListenResponseParams result = new HostResolverMdnsListenResponseParams(elementsOrVersion);
                result.result = decoder0.readInt(8);
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
        }
    }

    /* loaded from: classes2.dex */
    static class HostResolverMdnsListenResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final HostResolver.MdnsListenResponse mCallback;

        HostResolverMdnsListenResponseParamsForwardToCallback(HostResolver.MdnsListenResponse callback) {
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
                HostResolverMdnsListenResponseParams response = HostResolverMdnsListenResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.result));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class HostResolverMdnsListenResponseParamsProxyToResponder implements HostResolver.MdnsListenResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        HostResolverMdnsListenResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer result) {
            HostResolverMdnsListenResponseParams _response = new HostResolverMdnsListenResponseParams();
            _response.result = result.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(1, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
