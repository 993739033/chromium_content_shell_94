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
import org.chromium.mojo_base.mojom.UnguessableToken;
import org.chromium.network.mojom.UrlLoaderNetworkServiceObserver;
import org.chromium.url.mojom.Url;

/* loaded from: classes2.dex */
class UrlLoaderNetworkServiceObserver_Internal {
    private static final int CLONE_ORDINAL = 6;
    public static final Interface.Manager<UrlLoaderNetworkServiceObserver, UrlLoaderNetworkServiceObserver.Proxy> MANAGER = new Interface.Manager<UrlLoaderNetworkServiceObserver, UrlLoaderNetworkServiceObserver.Proxy>() { // from class: org.chromium.network.mojom.UrlLoaderNetworkServiceObserver_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "network.mojom.URLLoaderNetworkServiceObserver";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public UrlLoaderNetworkServiceObserver.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, UrlLoaderNetworkServiceObserver impl) {
            return new Stub(core, impl);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public UrlLoaderNetworkServiceObserver[] buildArray(int size) {
            return new UrlLoaderNetworkServiceObserver[size];
        }
    };
    private static final int ON_AUTH_REQUIRED_ORDINAL = 2;
    private static final int ON_CERTIFICATE_REQUESTED_ORDINAL = 1;
    private static final int ON_CLEAR_SITE_DATA_ORDINAL = 3;
    private static final int ON_DATA_USE_UPDATE_ORDINAL = 5;
    private static final int ON_LOADING_STATE_UPDATE_ORDINAL = 4;
    private static final int ON_SSL_CERTIFICATE_ERROR_ORDINAL = 0;

    UrlLoaderNetworkServiceObserver_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements UrlLoaderNetworkServiceObserver.Proxy {
        @Override
        // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.network.mojom.UrlLoaderNetworkServiceObserver
        public void onSslCertificateError(Url url, int netError, SslInfo sslInfo, boolean fatal, OnSslCertificateErrorResponse callback) {
            UrlLoaderNetworkServiceObserverOnSslCertificateErrorParams _message = new UrlLoaderNetworkServiceObserverOnSslCertificateErrorParams();
            _message.url = url;
            _message.netError = netError;
            _message.sslInfo = sslInfo;
            _message.fatal = fatal;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new UrlLoaderNetworkServiceObserverOnSslCertificateErrorResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.UrlLoaderNetworkServiceObserver
        public void onCertificateRequested(UnguessableToken windowId, SslCertRequestInfo certInfo, ClientCertificateResponder certResponder) {
            UrlLoaderNetworkServiceObserverOnCertificateRequestedParams _message = new UrlLoaderNetworkServiceObserverOnCertificateRequestedParams();
            _message.windowId = windowId;
            _message.certInfo = certInfo;
            _message.certResponder = certResponder;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1)));
        }

        @Override // org.chromium.network.mojom.UrlLoaderNetworkServiceObserver
        public void onAuthRequired(UnguessableToken windowId, int requestId, Url url, boolean firstAuthAttempt, AuthChallengeInfo authInfo, HttpResponseHeaders headHeaders, AuthChallengeResponder authChallengeResponder) {
            UrlLoaderNetworkServiceObserverOnAuthRequiredParams _message = new UrlLoaderNetworkServiceObserverOnAuthRequiredParams();
            _message.windowId = windowId;
            _message.requestId = requestId;
            _message.url = url;
            _message.firstAuthAttempt = firstAuthAttempt;
            _message.authInfo = authInfo;
            _message.headHeaders = headHeaders;
            _message.authChallengeResponder = authChallengeResponder;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2)));
        }

        @Override // org.chromium.network.mojom.UrlLoaderNetworkServiceObserver
        public void onClearSiteData(Url url, String headerValue, int loadFlags, OnClearSiteDataResponse callback) {
            UrlLoaderNetworkServiceObserverOnClearSiteDataParams _message = new UrlLoaderNetworkServiceObserverOnClearSiteDataParams();
            _message.url = url;
            _message.headerValue = headerValue;
            _message.loadFlags = loadFlags;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3, 1, 0L)), new UrlLoaderNetworkServiceObserverOnClearSiteDataResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.UrlLoaderNetworkServiceObserver
        public void onLoadingStateUpdate(LoadInfo info, OnLoadingStateUpdateResponse callback) {
            UrlLoaderNetworkServiceObserverOnLoadingStateUpdateParams _message = new UrlLoaderNetworkServiceObserverOnLoadingStateUpdateParams();
            _message.info = info;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(4, 1, 0L)), new UrlLoaderNetworkServiceObserverOnLoadingStateUpdateResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.UrlLoaderNetworkServiceObserver
        public void onDataUseUpdate(int networkTrafficAnnotationIdHash, long recvBytes, long sentBytes) {
            UrlLoaderNetworkServiceObserverOnDataUseUpdateParams _message = new UrlLoaderNetworkServiceObserverOnDataUseUpdateParams();
            _message.networkTrafficAnnotationIdHash = networkTrafficAnnotationIdHash;
            _message.recvBytes = recvBytes;
            _message.sentBytes = sentBytes;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(5)));
        }

        @Override // org.chromium.network.mojom.UrlLoaderNetworkServiceObserver
        public void clone(InterfaceRequest<UrlLoaderNetworkServiceObserver> listener) {
            UrlLoaderNetworkServiceObserverCloneParams _message = new UrlLoaderNetworkServiceObserverCloneParams();
            _message.listener = listener;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(6)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<UrlLoaderNetworkServiceObserver> {
        Stub(Core core, UrlLoaderNetworkServiceObserver impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(UrlLoaderNetworkServiceObserver_Internal.MANAGER, messageWithHeader);
                    case -1:
                    case 0:
                    case 3:
                    case 4:
                    default:
                        return false;
                    case 1:
                        UrlLoaderNetworkServiceObserverOnCertificateRequestedParams data = UrlLoaderNetworkServiceObserverOnCertificateRequestedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onCertificateRequested(data.windowId, data.certInfo, data.certResponder);
                        return true;
                    case 2:
                        UrlLoaderNetworkServiceObserverOnAuthRequiredParams data2 = UrlLoaderNetworkServiceObserverOnAuthRequiredParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onAuthRequired(data2.windowId, data2.requestId, data2.url, data2.firstAuthAttempt, data2.authInfo, data2.headHeaders, data2.authChallengeResponder);
                        return true;
                    case 5:
                        UrlLoaderNetworkServiceObserverOnDataUseUpdateParams data3 = UrlLoaderNetworkServiceObserverOnDataUseUpdateParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onDataUseUpdate(data3.networkTrafficAnnotationIdHash, data3.recvBytes, data3.sentBytes);
                        return true;
                    case 6:
                        getImpl().clone(UrlLoaderNetworkServiceObserverCloneParams.deserialize(messageWithHeader.getPayload()).listener);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), UrlLoaderNetworkServiceObserver_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        UrlLoaderNetworkServiceObserverOnSslCertificateErrorParams data = UrlLoaderNetworkServiceObserverOnSslCertificateErrorParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onSslCertificateError(data.url, data.netError, data.sslInfo, data.fatal, new UrlLoaderNetworkServiceObserverOnSslCertificateErrorResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 1:
                    case 2:
                    default:
                        return false;
                    case 3:
                        UrlLoaderNetworkServiceObserverOnClearSiteDataParams data2 = UrlLoaderNetworkServiceObserverOnClearSiteDataParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onClearSiteData(data2.url, data2.headerValue, data2.loadFlags, new UrlLoaderNetworkServiceObserverOnClearSiteDataResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 4:
                        getImpl().onLoadingStateUpdate(UrlLoaderNetworkServiceObserverOnLoadingStateUpdateParams.deserialize(messageWithHeader.getPayload()).info, new UrlLoaderNetworkServiceObserverOnLoadingStateUpdateResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                }
            } catch (DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class UrlLoaderNetworkServiceObserverOnSslCertificateErrorParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean fatal;
        public int netError;
        public SslInfo sslInfo;
        public Url url;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UrlLoaderNetworkServiceObserverOnSslCertificateErrorParams(int version) {
            super(32, version);
        }

        public UrlLoaderNetworkServiceObserverOnSslCertificateErrorParams() {
            this(0);
        }

        public static UrlLoaderNetworkServiceObserverOnSslCertificateErrorParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UrlLoaderNetworkServiceObserverOnSslCertificateErrorParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UrlLoaderNetworkServiceObserverOnSslCertificateErrorParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UrlLoaderNetworkServiceObserverOnSslCertificateErrorParams result = new UrlLoaderNetworkServiceObserverOnSslCertificateErrorParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.url = Url.decode(decoder1);
                result.netError = decoder0.readInt(16);
                result.fatal = decoder0.readBoolean(20, 0);
                Decoder decoder12 = decoder0.readPointer(24, false);
                result.sslInfo = SslInfo.decode(decoder12);
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
            encoder0.encode(this.netError, 16);
            encoder0.encode(this.fatal, 20, 0);
            encoder0.encode((Struct) this.sslInfo, 24, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class UrlLoaderNetworkServiceObserverOnSslCertificateErrorResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int netError;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UrlLoaderNetworkServiceObserverOnSslCertificateErrorResponseParams(int version) {
            super(16, version);
        }

        public UrlLoaderNetworkServiceObserverOnSslCertificateErrorResponseParams() {
            this(0);
        }

        public static UrlLoaderNetworkServiceObserverOnSslCertificateErrorResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UrlLoaderNetworkServiceObserverOnSslCertificateErrorResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UrlLoaderNetworkServiceObserverOnSslCertificateErrorResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UrlLoaderNetworkServiceObserverOnSslCertificateErrorResponseParams result = new UrlLoaderNetworkServiceObserverOnSslCertificateErrorResponseParams(elementsOrVersion);
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
    static class UrlLoaderNetworkServiceObserverOnSslCertificateErrorResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final UrlLoaderNetworkServiceObserver.OnSslCertificateErrorResponse mCallback;

        UrlLoaderNetworkServiceObserverOnSslCertificateErrorResponseParamsForwardToCallback(UrlLoaderNetworkServiceObserver.OnSslCertificateErrorResponse callback) {
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
                UrlLoaderNetworkServiceObserverOnSslCertificateErrorResponseParams response = UrlLoaderNetworkServiceObserverOnSslCertificateErrorResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.netError));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class UrlLoaderNetworkServiceObserverOnSslCertificateErrorResponseParamsProxyToResponder implements UrlLoaderNetworkServiceObserver.OnSslCertificateErrorResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        UrlLoaderNetworkServiceObserverOnSslCertificateErrorResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer netError) {
            UrlLoaderNetworkServiceObserverOnSslCertificateErrorResponseParams _response = new UrlLoaderNetworkServiceObserverOnSslCertificateErrorResponseParams();
            _response.netError = netError.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class UrlLoaderNetworkServiceObserverOnCertificateRequestedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public SslCertRequestInfo certInfo;
        public ClientCertificateResponder certResponder;
        public UnguessableToken windowId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UrlLoaderNetworkServiceObserverOnCertificateRequestedParams(int version) {
            super(32, version);
        }

        public UrlLoaderNetworkServiceObserverOnCertificateRequestedParams() {
            this(0);
        }

        public static UrlLoaderNetworkServiceObserverOnCertificateRequestedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UrlLoaderNetworkServiceObserverOnCertificateRequestedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UrlLoaderNetworkServiceObserverOnCertificateRequestedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UrlLoaderNetworkServiceObserverOnCertificateRequestedParams result = new UrlLoaderNetworkServiceObserverOnCertificateRequestedParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, true);
                result.windowId = UnguessableToken.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.certInfo = SslCertRequestInfo.decode(decoder12);
                result.certResponder = (ClientCertificateResponder) decoder0.readServiceInterface(24, false, ClientCertificateResponder.MANAGER);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.windowId, 8, true);
            encoder0.encode((Struct) this.certInfo, 16, false);
            encoder0.encode(this.certResponder, 24, false, ClientCertificateResponder.MANAGER);
        }
    }

    /* loaded from: classes2.dex */
    static final class UrlLoaderNetworkServiceObserverOnAuthRequiredParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 56;
        private static final DataHeader[] VERSION_ARRAY;
        public AuthChallengeResponder authChallengeResponder;
        public AuthChallengeInfo authInfo;
        public boolean firstAuthAttempt;
        public HttpResponseHeaders headHeaders;
        public int requestId;
        public Url url;
        public UnguessableToken windowId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(56, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UrlLoaderNetworkServiceObserverOnAuthRequiredParams(int version) {
            super(56, version);
        }

        public UrlLoaderNetworkServiceObserverOnAuthRequiredParams() {
            this(0);
        }

        public static UrlLoaderNetworkServiceObserverOnAuthRequiredParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UrlLoaderNetworkServiceObserverOnAuthRequiredParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UrlLoaderNetworkServiceObserverOnAuthRequiredParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UrlLoaderNetworkServiceObserverOnAuthRequiredParams result = new UrlLoaderNetworkServiceObserverOnAuthRequiredParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, true);
                result.windowId = UnguessableToken.decode(decoder1);
                result.requestId = decoder0.readInt(16);
                result.firstAuthAttempt = decoder0.readBoolean(20, 0);
                Decoder decoder12 = decoder0.readPointer(24, false);
                result.url = Url.decode(decoder12);
                Decoder decoder13 = decoder0.readPointer(32, false);
                result.authInfo = AuthChallengeInfo.decode(decoder13);
                Decoder decoder14 = decoder0.readPointer(40, true);
                result.headHeaders = HttpResponseHeaders.decode(decoder14);
                result.authChallengeResponder = (AuthChallengeResponder) decoder0.readServiceInterface(48, false, AuthChallengeResponder.MANAGER);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.windowId, 8, true);
            encoder0.encode(this.requestId, 16);
            encoder0.encode(this.firstAuthAttempt, 20, 0);
            encoder0.encode((Struct) this.url, 24, false);
            encoder0.encode((Struct) this.authInfo, 32, false);
            encoder0.encode((Struct) this.headHeaders, 40, true);
            encoder0.encode(this.authChallengeResponder, 48, false, AuthChallengeResponder.MANAGER);
        }
    }

    /* loaded from: classes2.dex */
    static final class UrlLoaderNetworkServiceObserverOnClearSiteDataParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public String headerValue;
        public int loadFlags;
        public Url url;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UrlLoaderNetworkServiceObserverOnClearSiteDataParams(int version) {
            super(32, version);
        }

        public UrlLoaderNetworkServiceObserverOnClearSiteDataParams() {
            this(0);
        }

        public static UrlLoaderNetworkServiceObserverOnClearSiteDataParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UrlLoaderNetworkServiceObserverOnClearSiteDataParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UrlLoaderNetworkServiceObserverOnClearSiteDataParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UrlLoaderNetworkServiceObserverOnClearSiteDataParams result = new UrlLoaderNetworkServiceObserverOnClearSiteDataParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.url = Url.decode(decoder1);
                result.headerValue = decoder0.readString(16, false);
                result.loadFlags = decoder0.readInt(24);
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
            encoder0.encode(this.headerValue, 16, false);
            encoder0.encode(this.loadFlags, 24);
        }
    }

    /* loaded from: classes2.dex */
    static final class UrlLoaderNetworkServiceObserverOnClearSiteDataResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UrlLoaderNetworkServiceObserverOnClearSiteDataResponseParams(int version) {
            super(8, version);
        }

        public UrlLoaderNetworkServiceObserverOnClearSiteDataResponseParams() {
            this(0);
        }

        public static UrlLoaderNetworkServiceObserverOnClearSiteDataResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UrlLoaderNetworkServiceObserverOnClearSiteDataResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UrlLoaderNetworkServiceObserverOnClearSiteDataResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UrlLoaderNetworkServiceObserverOnClearSiteDataResponseParams result = new UrlLoaderNetworkServiceObserverOnClearSiteDataResponseParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static class UrlLoaderNetworkServiceObserverOnClearSiteDataResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final UrlLoaderNetworkServiceObserver.OnClearSiteDataResponse mCallback;

        UrlLoaderNetworkServiceObserverOnClearSiteDataResponseParamsForwardToCallback(UrlLoaderNetworkServiceObserver.OnClearSiteDataResponse callback) {
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
                this.mCallback.call();
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class UrlLoaderNetworkServiceObserverOnClearSiteDataResponseParamsProxyToResponder implements UrlLoaderNetworkServiceObserver.OnClearSiteDataResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        UrlLoaderNetworkServiceObserverOnClearSiteDataResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            UrlLoaderNetworkServiceObserverOnClearSiteDataResponseParams _response = new UrlLoaderNetworkServiceObserverOnClearSiteDataResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(3, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class UrlLoaderNetworkServiceObserverOnLoadingStateUpdateParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public LoadInfo info;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UrlLoaderNetworkServiceObserverOnLoadingStateUpdateParams(int version) {
            super(16, version);
        }

        public UrlLoaderNetworkServiceObserverOnLoadingStateUpdateParams() {
            this(0);
        }

        public static UrlLoaderNetworkServiceObserverOnLoadingStateUpdateParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UrlLoaderNetworkServiceObserverOnLoadingStateUpdateParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UrlLoaderNetworkServiceObserverOnLoadingStateUpdateParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UrlLoaderNetworkServiceObserverOnLoadingStateUpdateParams result = new UrlLoaderNetworkServiceObserverOnLoadingStateUpdateParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.info = LoadInfo.decode(decoder1);
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
        }
    }

    /* loaded from: classes2.dex */
    static final class UrlLoaderNetworkServiceObserverOnLoadingStateUpdateResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UrlLoaderNetworkServiceObserverOnLoadingStateUpdateResponseParams(int version) {
            super(8, version);
        }

        public UrlLoaderNetworkServiceObserverOnLoadingStateUpdateResponseParams() {
            this(0);
        }

        public static UrlLoaderNetworkServiceObserverOnLoadingStateUpdateResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UrlLoaderNetworkServiceObserverOnLoadingStateUpdateResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UrlLoaderNetworkServiceObserverOnLoadingStateUpdateResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UrlLoaderNetworkServiceObserverOnLoadingStateUpdateResponseParams result = new UrlLoaderNetworkServiceObserverOnLoadingStateUpdateResponseParams(elementsOrVersion);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        }
    }

    /* loaded from: classes2.dex */
    static class UrlLoaderNetworkServiceObserverOnLoadingStateUpdateResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final UrlLoaderNetworkServiceObserver.OnLoadingStateUpdateResponse mCallback;

        UrlLoaderNetworkServiceObserverOnLoadingStateUpdateResponseParamsForwardToCallback(UrlLoaderNetworkServiceObserver.OnLoadingStateUpdateResponse callback) {
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
                this.mCallback.call();
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class UrlLoaderNetworkServiceObserverOnLoadingStateUpdateResponseParamsProxyToResponder implements UrlLoaderNetworkServiceObserver.OnLoadingStateUpdateResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        UrlLoaderNetworkServiceObserverOnLoadingStateUpdateResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            UrlLoaderNetworkServiceObserverOnLoadingStateUpdateResponseParams _response = new UrlLoaderNetworkServiceObserverOnLoadingStateUpdateResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(4, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class UrlLoaderNetworkServiceObserverOnDataUseUpdateParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public int networkTrafficAnnotationIdHash;
        public long recvBytes;
        public long sentBytes;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UrlLoaderNetworkServiceObserverOnDataUseUpdateParams(int version) {
            super(32, version);
        }

        public UrlLoaderNetworkServiceObserverOnDataUseUpdateParams() {
            this(0);
        }

        public static UrlLoaderNetworkServiceObserverOnDataUseUpdateParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UrlLoaderNetworkServiceObserverOnDataUseUpdateParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UrlLoaderNetworkServiceObserverOnDataUseUpdateParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UrlLoaderNetworkServiceObserverOnDataUseUpdateParams result = new UrlLoaderNetworkServiceObserverOnDataUseUpdateParams(elementsOrVersion);
                result.networkTrafficAnnotationIdHash = decoder0.readInt(8);
                result.recvBytes = decoder0.readLong(16);
                result.sentBytes = decoder0.readLong(24);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.networkTrafficAnnotationIdHash, 8);
            encoder0.encode(this.recvBytes, 16);
            encoder0.encode(this.sentBytes, 24);
        }
    }

    /* loaded from: classes2.dex */
    static final class UrlLoaderNetworkServiceObserverCloneParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public InterfaceRequest<UrlLoaderNetworkServiceObserver> listener;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UrlLoaderNetworkServiceObserverCloneParams(int version) {
            super(16, version);
        }

        public UrlLoaderNetworkServiceObserverCloneParams() {
            this(0);
        }

        public static UrlLoaderNetworkServiceObserverCloneParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UrlLoaderNetworkServiceObserverCloneParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UrlLoaderNetworkServiceObserverCloneParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UrlLoaderNetworkServiceObserverCloneParams result = new UrlLoaderNetworkServiceObserverCloneParams(elementsOrVersion);
                result.listener = decoder0.readInterfaceRequest(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((InterfaceRequest) this.listener, 8, false);
        }
    }
}
