package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;

import org.chromium.blink.mojom.WebSocketConnector;
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
import org.chromium.mojo_base.mojom.UnguessableToken;
import org.chromium.network.mojom.SiteForCookies;
import org.chromium.network.mojom.WebSocketHandshakeClient;
import org.chromium.url.mojom.Url;

/* loaded from: classes2.dex */
class WebSocketConnector_Internal {
    private static final int CONNECT_ORDINAL = 0;
    public static final Interface.Manager<WebSocketConnector, WebSocketConnector.Proxy> MANAGER = new Interface.Manager<WebSocketConnector, WebSocketConnector.Proxy>() { // from class: org.chromium.blink.mojom.WebSocketConnector_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.WebSocketConnector";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public WebSocketConnector.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, WebSocketConnector impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public WebSocketConnector[] buildArray(int size) {
            return new WebSocketConnector[size];
        }
    };

    WebSocketConnector_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements WebSocketConnector.Proxy {
        @Override
        // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.WebSocketConnector
        public void connect(Url url, String[] requestedProtocols, SiteForCookies siteForCookies, String userAgent, WebSocketHandshakeClient handshakeClient, UnguessableToken throttlingProfileId) {
            WebSocketConnectorConnectParams _message = new WebSocketConnectorConnectParams();
            _message.url = url;
            _message.requestedProtocols = requestedProtocols;
            _message.siteForCookies = siteForCookies;
            _message.userAgent = userAgent;
            _message.handshakeClient = handshakeClient;
            _message.throttlingProfileId = throttlingProfileId;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<WebSocketConnector> {
        Stub(Core core, WebSocketConnector impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(WebSocketConnector_Internal.MANAGER, messageWithHeader);
                    case -1:
                    default:
                        return false;
                    case 0:
                        WebSocketConnectorConnectParams data = WebSocketConnectorConnectParams.deserialize(messageWithHeader.getPayload());
                        getImpl().connect(data.url, data.requestedProtocols, data.siteForCookies, data.userAgent, data.handshakeClient, data.throttlingProfileId);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), WebSocketConnector_Internal.MANAGER, messageWithHeader, receiver);
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
    static final class WebSocketConnectorConnectParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 56;
        private static final DataHeader[] VERSION_ARRAY;
        public WebSocketHandshakeClient handshakeClient;
        public String[] requestedProtocols;
        public SiteForCookies siteForCookies;
        public UnguessableToken throttlingProfileId;
        public Url url;
        public String userAgent;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(56, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private WebSocketConnectorConnectParams(int version) {
            super(56, version);
        }

        public WebSocketConnectorConnectParams() {
            this(0);
        }

        public static WebSocketConnectorConnectParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static WebSocketConnectorConnectParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static WebSocketConnectorConnectParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                WebSocketConnectorConnectParams result = new WebSocketConnectorConnectParams(elementsOrVersion);
                result.url = Url.decode(decoder0.readPointer(8, false));
                Decoder decoder1 = decoder0.readPointer(16, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.requestedProtocols = new String[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    result.requestedProtocols[i1] = decoder1.readString((i1 * 8) + 8, false);
                }
                result.siteForCookies = SiteForCookies.decode(decoder0.readPointer(24, false));
                result.userAgent = decoder0.readString(32, true);
                result.handshakeClient = (WebSocketHandshakeClient) decoder0.readServiceInterface(40, false, WebSocketHandshakeClient.MANAGER);
                result.throttlingProfileId = UnguessableToken.decode(decoder0.readPointer(48, true));
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
            String[] strArr = this.requestedProtocols;
            if (strArr == null) {
                encoder0.encodeNullPointer(16, false);
            } else {
                Encoder encoder1 = encoder0.encodePointerArray(strArr.length, 16, -1);
                int i0 = 0;
                while (true) {
                    String[] strArr2 = this.requestedProtocols;
                    if (i0 >= strArr2.length) {
                        break;
                    }
                    encoder1.encode(strArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                }
            }
            encoder0.encode((Struct) this.siteForCookies, 24, false);
            encoder0.encode(this.userAgent, 32, true);
            encoder0.encode(this.handshakeClient, 40, false, WebSocketHandshakeClient.MANAGER);
            encoder0.encode((Struct) this.throttlingProfileId, 48, true);
        }
    }
}
