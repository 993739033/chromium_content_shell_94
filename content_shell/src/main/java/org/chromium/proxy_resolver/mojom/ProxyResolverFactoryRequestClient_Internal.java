package org.chromium.proxy_resolver.mojom;

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
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo.system.Core;
import org.chromium.network.mojom.NetworkIsolationKey;
import org.chromium.proxy_resolver.mojom.ProxyResolverFactoryRequestClient;
/* loaded from: classes2.dex */
class ProxyResolverFactoryRequestClient_Internal {
    private static final int ALERT_ORDINAL = 1;
    public static final Interface.Manager<ProxyResolverFactoryRequestClient, ProxyResolverFactoryRequestClient.Proxy> MANAGER = new Interface.Manager<ProxyResolverFactoryRequestClient, ProxyResolverFactoryRequestClient.Proxy>() { // from class: org.chromium.proxy_resolver.mojom.ProxyResolverFactoryRequestClient_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "proxy_resolver.mojom.ProxyResolverFactoryRequestClient";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public ProxyResolverFactoryRequestClient.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, ProxyResolverFactoryRequestClient impl) {
            return new Stub(core, impl);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public ProxyResolverFactoryRequestClient[] buildArray(int size) {
            return new ProxyResolverFactoryRequestClient[size];
        }
    };
    private static final int ON_ERROR_ORDINAL = 2;
    private static final int REPORT_RESULT_ORDINAL = 0;
    private static final int RESOLVE_DNS_ORDINAL = 3;

    ProxyResolverFactoryRequestClient_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements ProxyResolverFactoryRequestClient.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.proxy_resolver.mojom.ProxyResolverFactoryRequestClient
        public void reportResult(int error) {
            ProxyResolverFactoryRequestClientReportResultParams _message = new ProxyResolverFactoryRequestClientReportResultParams();
            _message.error = error;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }

        @Override // org.chromium.proxy_resolver.mojom.ProxyResolverFactoryRequestClient
        public void alert(String error) {
            ProxyResolverFactoryRequestClientAlertParams _message = new ProxyResolverFactoryRequestClientAlertParams();
            _message.error = error;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1)));
        }

        @Override // org.chromium.proxy_resolver.mojom.ProxyResolverFactoryRequestClient
        public void onError(int lineNumber, String error) {
            ProxyResolverFactoryRequestClientOnErrorParams _message = new ProxyResolverFactoryRequestClientOnErrorParams();
            _message.lineNumber = lineNumber;
            _message.error = error;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2)));
        }

        @Override // org.chromium.proxy_resolver.mojom.ProxyResolverFactoryRequestClient
        public void resolveDns(String host, int operation, NetworkIsolationKey networkIsolationKey, HostResolverRequestClient client) {
            ProxyResolverFactoryRequestClientResolveDnsParams _message = new ProxyResolverFactoryRequestClientResolveDnsParams();
            _message.host = host;
            _message.operation = operation;
            _message.networkIsolationKey = networkIsolationKey;
            _message.client = client;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<ProxyResolverFactoryRequestClient> {
        Stub(Core core, ProxyResolverFactoryRequestClient impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(ProxyResolverFactoryRequestClient_Internal.MANAGER, messageWithHeader);
                    case -1:
                    default:
                        return false;
                    case 0:
                        ProxyResolverFactoryRequestClientReportResultParams data = ProxyResolverFactoryRequestClientReportResultParams.deserialize(messageWithHeader.getPayload());
                        getImpl().reportResult(data.error);
                        return true;
                    case 1:
                        ProxyResolverFactoryRequestClientAlertParams data2 = ProxyResolverFactoryRequestClientAlertParams.deserialize(messageWithHeader.getPayload());
                        getImpl().alert(data2.error);
                        return true;
                    case 2:
                        ProxyResolverFactoryRequestClientOnErrorParams data3 = ProxyResolverFactoryRequestClientOnErrorParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onError(data3.lineNumber, data3.error);
                        return true;
                    case 3:
                        ProxyResolverFactoryRequestClientResolveDnsParams data4 = ProxyResolverFactoryRequestClientResolveDnsParams.deserialize(messageWithHeader.getPayload());
                        getImpl().resolveDns(data4.host, data4.operation, data4.networkIsolationKey, data4.client);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), ProxyResolverFactoryRequestClient_Internal.MANAGER, messageWithHeader, receiver);
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
    static final class ProxyResolverFactoryRequestClientReportResultParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int error;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ProxyResolverFactoryRequestClientReportResultParams(int version) {
            super(16, version);
        }

        public ProxyResolverFactoryRequestClientReportResultParams() {
            this(0);
        }

        public static ProxyResolverFactoryRequestClientReportResultParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ProxyResolverFactoryRequestClientReportResultParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ProxyResolverFactoryRequestClientReportResultParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ProxyResolverFactoryRequestClientReportResultParams result = new ProxyResolverFactoryRequestClientReportResultParams(elementsOrVersion);
                result.error = decoder0.readInt(8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.error, 8);
        }
    }

    /* loaded from: classes2.dex */
    static final class ProxyResolverFactoryRequestClientAlertParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public String error;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ProxyResolverFactoryRequestClientAlertParams(int version) {
            super(16, version);
        }

        public ProxyResolverFactoryRequestClientAlertParams() {
            this(0);
        }

        public static ProxyResolverFactoryRequestClientAlertParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ProxyResolverFactoryRequestClientAlertParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ProxyResolverFactoryRequestClientAlertParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ProxyResolverFactoryRequestClientAlertParams result = new ProxyResolverFactoryRequestClientAlertParams(elementsOrVersion);
                result.error = decoder0.readString(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.error, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class ProxyResolverFactoryRequestClientOnErrorParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public String error;
        public int lineNumber;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ProxyResolverFactoryRequestClientOnErrorParams(int version) {
            super(24, version);
        }

        public ProxyResolverFactoryRequestClientOnErrorParams() {
            this(0);
        }

        public static ProxyResolverFactoryRequestClientOnErrorParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ProxyResolverFactoryRequestClientOnErrorParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ProxyResolverFactoryRequestClientOnErrorParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ProxyResolverFactoryRequestClientOnErrorParams result = new ProxyResolverFactoryRequestClientOnErrorParams(elementsOrVersion);
                result.lineNumber = decoder0.readInt(8);
                result.error = decoder0.readString(16, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.lineNumber, 8);
            encoder0.encode(this.error, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class ProxyResolverFactoryRequestClientResolveDnsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 40;
        private static final DataHeader[] VERSION_ARRAY;
        public HostResolverRequestClient client;
        public String host;
        public NetworkIsolationKey networkIsolationKey;
        public int operation;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ProxyResolverFactoryRequestClientResolveDnsParams(int version) {
            super(40, version);
        }

        public ProxyResolverFactoryRequestClientResolveDnsParams() {
            this(0);
        }

        public static ProxyResolverFactoryRequestClientResolveDnsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ProxyResolverFactoryRequestClientResolveDnsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ProxyResolverFactoryRequestClientResolveDnsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ProxyResolverFactoryRequestClientResolveDnsParams result = new ProxyResolverFactoryRequestClientResolveDnsParams(elementsOrVersion);
                result.host = decoder0.readString(8, false);
                int readInt = decoder0.readInt(16);
                result.operation = readInt;
                HostResolveOperation.validate(readInt);
                result.operation = HostResolveOperation.toKnownValue(result.operation);
                Decoder decoder1 = decoder0.readPointer(24, false);
                result.networkIsolationKey = NetworkIsolationKey.decode(decoder1);
                result.client = (HostResolverRequestClient) decoder0.readServiceInterface(32, false, HostResolverRequestClient.MANAGER);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.host, 8, false);
            encoder0.encode(this.operation, 16);
            encoder0.encode((Struct) this.networkIsolationKey, 24, false);
            encoder0.encode( this.client, 32, false, HostResolverRequestClient.MANAGER);
        }
    }
}
