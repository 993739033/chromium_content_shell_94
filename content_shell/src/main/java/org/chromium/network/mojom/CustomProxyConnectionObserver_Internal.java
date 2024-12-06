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
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo.system.Core;
import org.chromium.network.mojom.CustomProxyConnectionObserver;
import org.chromium.proxy_resolver.mojom.ProxyServer;
/* loaded from: classes2.dex */
class CustomProxyConnectionObserver_Internal {
    public static final Interface.Manager<CustomProxyConnectionObserver, CustomProxyConnectionObserver.Proxy> MANAGER = new Interface.Manager<CustomProxyConnectionObserver, CustomProxyConnectionObserver.Proxy>() { // from class: org.chromium.network.mojom.CustomProxyConnectionObserver_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "network.mojom.CustomProxyConnectionObserver";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public CustomProxyConnectionObserver.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, CustomProxyConnectionObserver impl) {
            return new Stub(core, impl);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public CustomProxyConnectionObserver[] buildArray(int size) {
            return new CustomProxyConnectionObserver[size];
        }
    };
    private static final int ON_FALLBACK_ORDINAL = 0;
    private static final int ON_TUNNEL_HEADERS_RECEIVED_ORDINAL = 1;

    CustomProxyConnectionObserver_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements CustomProxyConnectionObserver.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.network.mojom.CustomProxyConnectionObserver
        public void onFallback(ProxyServer badProxy, int netError) {
            CustomProxyConnectionObserverOnFallbackParams _message = new CustomProxyConnectionObserverOnFallbackParams();
            _message.badProxy = badProxy;
            _message.netError = netError;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }

        @Override // org.chromium.network.mojom.CustomProxyConnectionObserver
        public void onTunnelHeadersReceived(ProxyServer proxyServer, HttpResponseHeaders responseHeaders) {
            CustomProxyConnectionObserverOnTunnelHeadersReceivedParams _message = new CustomProxyConnectionObserverOnTunnelHeadersReceivedParams();
            _message.proxyServer = proxyServer;
            _message.responseHeaders = responseHeaders;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<CustomProxyConnectionObserver> {
        Stub(Core core, CustomProxyConnectionObserver impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(CustomProxyConnectionObserver_Internal.MANAGER, messageWithHeader);
                    case -1:
                    default:
                        return false;
                    case 0:
                        CustomProxyConnectionObserverOnFallbackParams data = CustomProxyConnectionObserverOnFallbackParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onFallback(data.badProxy, data.netError);
                        return true;
                    case 1:
                        CustomProxyConnectionObserverOnTunnelHeadersReceivedParams data2 = CustomProxyConnectionObserverOnTunnelHeadersReceivedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onTunnelHeadersReceived(data2.proxyServer, data2.responseHeaders);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), CustomProxyConnectionObserver_Internal.MANAGER, messageWithHeader, receiver);
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
    static final class CustomProxyConnectionObserverOnFallbackParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public ProxyServer badProxy;
        public int netError;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private CustomProxyConnectionObserverOnFallbackParams(int version) {
            super(24, version);
        }

        public CustomProxyConnectionObserverOnFallbackParams() {
            this(0);
        }

        public static CustomProxyConnectionObserverOnFallbackParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static CustomProxyConnectionObserverOnFallbackParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static CustomProxyConnectionObserverOnFallbackParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                CustomProxyConnectionObserverOnFallbackParams result = new CustomProxyConnectionObserverOnFallbackParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.badProxy = ProxyServer.decode(decoder1);
                result.netError = decoder0.readInt(16);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.badProxy, 8, false);
            encoder0.encode(this.netError, 16);
        }
    }

    /* loaded from: classes2.dex */
    static final class CustomProxyConnectionObserverOnTunnelHeadersReceivedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public ProxyServer proxyServer;
        public HttpResponseHeaders responseHeaders;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private CustomProxyConnectionObserverOnTunnelHeadersReceivedParams(int version) {
            super(24, version);
        }

        public CustomProxyConnectionObserverOnTunnelHeadersReceivedParams() {
            this(0);
        }

        public static CustomProxyConnectionObserverOnTunnelHeadersReceivedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static CustomProxyConnectionObserverOnTunnelHeadersReceivedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static CustomProxyConnectionObserverOnTunnelHeadersReceivedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                CustomProxyConnectionObserverOnTunnelHeadersReceivedParams result = new CustomProxyConnectionObserverOnTunnelHeadersReceivedParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.proxyServer = ProxyServer.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.responseHeaders = HttpResponseHeaders.decode(decoder12);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.proxyServer, 8, false);
            encoder0.encode((Struct) this.responseHeaders, 16, false);
        }
    }
}
