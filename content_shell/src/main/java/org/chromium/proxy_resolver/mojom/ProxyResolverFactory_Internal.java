package org.chromium.proxy_resolver.mojom;

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
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo.system.Core;
import org.chromium.proxy_resolver.mojom.ProxyResolverFactory;
/* loaded from: classes2.dex */
class ProxyResolverFactory_Internal {
    private static final int CREATE_RESOLVER_ORDINAL = 0;
    public static final Interface.Manager<ProxyResolverFactory, ProxyResolverFactory.Proxy> MANAGER = new Interface.Manager<ProxyResolverFactory, ProxyResolverFactory.Proxy>() { // from class: org.chromium.proxy_resolver.mojom.ProxyResolverFactory_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "proxy_resolver.mojom.ProxyResolverFactory";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public ProxyResolverFactory.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, ProxyResolverFactory impl) {
            return new Stub(core, impl);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public ProxyResolverFactory[] buildArray(int size) {
            return new ProxyResolverFactory[size];
        }
    };

    ProxyResolverFactory_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements ProxyResolverFactory.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.proxy_resolver.mojom.ProxyResolverFactory
        public void createResolver(String pacScript, InterfaceRequest<ProxyResolver> receiver, ProxyResolverFactoryRequestClient client) {
            ProxyResolverFactoryCreateResolverParams _message = new ProxyResolverFactoryCreateResolverParams();
            _message.pacScript = pacScript;
            _message.receiver = receiver;
            _message.client = client;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<ProxyResolverFactory> {
        Stub(Core core, ProxyResolverFactory impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(ProxyResolverFactory_Internal.MANAGER, messageWithHeader);
                    case -1:
                    default:
                        return false;
                    case 0:
                        ProxyResolverFactoryCreateResolverParams data = ProxyResolverFactoryCreateResolverParams.deserialize(messageWithHeader.getPayload());
                        getImpl().createResolver(data.pacScript, data.receiver, data.client);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), ProxyResolverFactory_Internal.MANAGER, messageWithHeader, receiver);
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
    static final class ProxyResolverFactoryCreateResolverParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public ProxyResolverFactoryRequestClient client;
        public String pacScript;
        public InterfaceRequest<ProxyResolver> receiver;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ProxyResolverFactoryCreateResolverParams(int version) {
            super(32, version);
        }

        public ProxyResolverFactoryCreateResolverParams() {
            this(0);
        }

        public static ProxyResolverFactoryCreateResolverParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ProxyResolverFactoryCreateResolverParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ProxyResolverFactoryCreateResolverParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ProxyResolverFactoryCreateResolverParams result = new ProxyResolverFactoryCreateResolverParams(elementsOrVersion);
                result.pacScript = decoder0.readString(8, false);
                result.receiver = decoder0.readInterfaceRequest(16, false);
                result.client = (ProxyResolverFactoryRequestClient) decoder0.readServiceInterface(20, false, ProxyResolverFactoryRequestClient.MANAGER);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.pacScript, 8, false);
            encoder0.encode((InterfaceRequest) this.receiver, 16, false);
            encoder0.encode( this.client, 20, false,  ProxyResolverFactoryRequestClient.MANAGER);
        }
    }
}
