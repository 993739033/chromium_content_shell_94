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
import org.chromium.network.mojom.WebSocketAuthenticationHandler;
/* loaded from: classes2.dex */
class WebSocketAuthenticationHandler_Internal {
    public static final Interface.Manager<WebSocketAuthenticationHandler, WebSocketAuthenticationHandler.Proxy> MANAGER = new Interface.Manager<WebSocketAuthenticationHandler, WebSocketAuthenticationHandler.Proxy>() { // from class: org.chromium.network.mojom.WebSocketAuthenticationHandler_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "network.mojom.WebSocketAuthenticationHandler";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public WebSocketAuthenticationHandler.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, WebSocketAuthenticationHandler impl) {
            return new Stub(core, impl);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public WebSocketAuthenticationHandler[] buildArray(int size) {
            return new WebSocketAuthenticationHandler[size];
        }
    };
    private static final int ON_AUTH_REQUIRED_ORDINAL = 0;

    WebSocketAuthenticationHandler_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements WebSocketAuthenticationHandler.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.network.mojom.WebSocketAuthenticationHandler
        public void onAuthRequired(AuthChallengeInfo info, HttpResponseHeaders headers, IpEndPoint remoteEndpoint, OnAuthRequiredResponse callback) {
            WebSocketAuthenticationHandlerOnAuthRequiredParams _message = new WebSocketAuthenticationHandlerOnAuthRequiredParams();
            _message.info = info;
            _message.headers = headers;
            _message.remoteEndpoint = remoteEndpoint;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new WebSocketAuthenticationHandlerOnAuthRequiredResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<WebSocketAuthenticationHandler> {
        Stub(Core core, WebSocketAuthenticationHandler impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(WebSocketAuthenticationHandler_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), WebSocketAuthenticationHandler_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        WebSocketAuthenticationHandlerOnAuthRequiredParams data = WebSocketAuthenticationHandlerOnAuthRequiredParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onAuthRequired(data.info, data.headers, data.remoteEndpoint, new WebSocketAuthenticationHandlerOnAuthRequiredResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class WebSocketAuthenticationHandlerOnAuthRequiredParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public HttpResponseHeaders headers;
        public AuthChallengeInfo info;
        public IpEndPoint remoteEndpoint;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private WebSocketAuthenticationHandlerOnAuthRequiredParams(int version) {
            super(32, version);
        }

        public WebSocketAuthenticationHandlerOnAuthRequiredParams() {
            this(0);
        }

        public static WebSocketAuthenticationHandlerOnAuthRequiredParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static WebSocketAuthenticationHandlerOnAuthRequiredParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static WebSocketAuthenticationHandlerOnAuthRequiredParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                WebSocketAuthenticationHandlerOnAuthRequiredParams result = new WebSocketAuthenticationHandlerOnAuthRequiredParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.info = AuthChallengeInfo.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.headers = HttpResponseHeaders.decode(decoder12);
                Decoder decoder13 = decoder0.readPointer(24, false);
                result.remoteEndpoint = IpEndPoint.decode(decoder13);
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
            encoder0.encode((Struct) this.headers, 16, false);
            encoder0.encode((Struct) this.remoteEndpoint, 24, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class WebSocketAuthenticationHandlerOnAuthRequiredResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public AuthCredentials credentials;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private WebSocketAuthenticationHandlerOnAuthRequiredResponseParams(int version) {
            super(16, version);
        }

        public WebSocketAuthenticationHandlerOnAuthRequiredResponseParams() {
            this(0);
        }

        public static WebSocketAuthenticationHandlerOnAuthRequiredResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static WebSocketAuthenticationHandlerOnAuthRequiredResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static WebSocketAuthenticationHandlerOnAuthRequiredResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                WebSocketAuthenticationHandlerOnAuthRequiredResponseParams result = new WebSocketAuthenticationHandlerOnAuthRequiredResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, true);
                result.credentials = AuthCredentials.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.credentials, 8, true);
        }
    }

    /* loaded from: classes2.dex */
    static class WebSocketAuthenticationHandlerOnAuthRequiredResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final WebSocketAuthenticationHandler.OnAuthRequiredResponse mCallback;

        WebSocketAuthenticationHandlerOnAuthRequiredResponseParamsForwardToCallback(WebSocketAuthenticationHandler.OnAuthRequiredResponse callback) {
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
                WebSocketAuthenticationHandlerOnAuthRequiredResponseParams response = WebSocketAuthenticationHandlerOnAuthRequiredResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.credentials);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class WebSocketAuthenticationHandlerOnAuthRequiredResponseParamsProxyToResponder implements WebSocketAuthenticationHandler.OnAuthRequiredResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        WebSocketAuthenticationHandlerOnAuthRequiredResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(AuthCredentials credentials) {
            WebSocketAuthenticationHandlerOnAuthRequiredResponseParams _response = new WebSocketAuthenticationHandlerOnAuthRequiredResponseParams();
            _response.credentials = credentials;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
