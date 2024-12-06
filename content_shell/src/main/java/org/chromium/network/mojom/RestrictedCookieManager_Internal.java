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
import org.chromium.network.mojom.RestrictedCookieManager;
import org.chromium.url.internal.mojom.Origin;
import org.chromium.url.mojom.Url;

/* loaded from: classes2.dex */
class RestrictedCookieManager_Internal {
    private static final int ADD_CHANGE_LISTENER_ORDINAL = 2;
    private static final int COOKIES_ENABLED_FOR_ORDINAL = 5;
    private static final int GET_ALL_FOR_URL_ORDINAL = 0;
    private static final int GET_COOKIES_STRING_ORDINAL = 4;
    public static final Interface.Manager<RestrictedCookieManager, RestrictedCookieManager.Proxy> MANAGER = new Interface.Manager<RestrictedCookieManager, RestrictedCookieManager.Proxy>() { // from class: org.chromium.network.mojom.RestrictedCookieManager_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "network.mojom.RestrictedCookieManager";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public RestrictedCookieManager.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, RestrictedCookieManager impl) {
            return new Stub(core, impl);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public RestrictedCookieManager[] buildArray(int size) {
            return new RestrictedCookieManager[size];
        }
    };
    private static final int SET_CANONICAL_COOKIE_ORDINAL = 1;
    private static final int SET_COOKIE_FROM_STRING_ORDINAL = 3;

    RestrictedCookieManager_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements RestrictedCookieManager.Proxy {
        @Override
        // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.network.mojom.RestrictedCookieManager
        public void getAllForUrl(Url url, SiteForCookies siteForCookies, Origin topFrameOrigin, CookieManagerGetOptions options, GetAllForUrlResponse callback) {
            RestrictedCookieManagerGetAllForUrlParams _message = new RestrictedCookieManagerGetAllForUrlParams();
            _message.url = url;
            _message.siteForCookies = siteForCookies;
            _message.topFrameOrigin = topFrameOrigin;
            _message.options = options;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new RestrictedCookieManagerGetAllForUrlResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.RestrictedCookieManager
        public void setCanonicalCookie(CanonicalCookie cookie, Url url, SiteForCookies siteForCookies, Origin topFrameOrigin, SetCanonicalCookieResponse callback) {
            RestrictedCookieManagerSetCanonicalCookieParams _message = new RestrictedCookieManagerSetCanonicalCookieParams();
            _message.cookie = cookie;
            _message.url = url;
            _message.siteForCookies = siteForCookies;
            _message.topFrameOrigin = topFrameOrigin;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1, 1, 0L)), new RestrictedCookieManagerSetCanonicalCookieResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.RestrictedCookieManager
        public void addChangeListener(Url url, SiteForCookies siteForCookies, Origin topFrameOrigin, CookieChangeListener listener, AddChangeListenerResponse callback) {
            RestrictedCookieManagerAddChangeListenerParams _message = new RestrictedCookieManagerAddChangeListenerParams();
            _message.url = url;
            _message.siteForCookies = siteForCookies;
            _message.topFrameOrigin = topFrameOrigin;
            _message.listener = listener;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2, 1, 0L)), new RestrictedCookieManagerAddChangeListenerResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.RestrictedCookieManager
        public void setCookieFromString(Url url, SiteForCookies siteForCookies, Origin topFrameOrigin, String cookie, SetCookieFromStringResponse callback) {
            RestrictedCookieManagerSetCookieFromStringParams _message = new RestrictedCookieManagerSetCookieFromStringParams();
            _message.url = url;
            _message.siteForCookies = siteForCookies;
            _message.topFrameOrigin = topFrameOrigin;
            _message.cookie = cookie;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3, 1, 0L)), new RestrictedCookieManagerSetCookieFromStringResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.RestrictedCookieManager
        public void getCookiesString(Url url, SiteForCookies siteForCookies, Origin topFrameOrigin, GetCookiesStringResponse callback) {
            RestrictedCookieManagerGetCookiesStringParams _message = new RestrictedCookieManagerGetCookiesStringParams();
            _message.url = url;
            _message.siteForCookies = siteForCookies;
            _message.topFrameOrigin = topFrameOrigin;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(4, 1, 0L)), new RestrictedCookieManagerGetCookiesStringResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.RestrictedCookieManager
        public void cookiesEnabledFor(Url url, SiteForCookies siteForCookies, Origin topFrameOrigin, CookiesEnabledForResponse callback) {
            RestrictedCookieManagerCookiesEnabledForParams _message = new RestrictedCookieManagerCookiesEnabledForParams();
            _message.url = url;
            _message.siteForCookies = siteForCookies;
            _message.topFrameOrigin = topFrameOrigin;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(5, 1, 0L)), new RestrictedCookieManagerCookiesEnabledForResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<RestrictedCookieManager> {
        Stub(Core core, RestrictedCookieManager impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(RestrictedCookieManager_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), RestrictedCookieManager_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        RestrictedCookieManagerGetAllForUrlParams data = RestrictedCookieManagerGetAllForUrlParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getAllForUrl(data.url, data.siteForCookies, data.topFrameOrigin, data.options, new RestrictedCookieManagerGetAllForUrlResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 1:
                        RestrictedCookieManagerSetCanonicalCookieParams data2 = RestrictedCookieManagerSetCanonicalCookieParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setCanonicalCookie(data2.cookie, data2.url, data2.siteForCookies, data2.topFrameOrigin, new RestrictedCookieManagerSetCanonicalCookieResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 2:
                        RestrictedCookieManagerAddChangeListenerParams data3 = RestrictedCookieManagerAddChangeListenerParams.deserialize(messageWithHeader.getPayload());
                        getImpl().addChangeListener(data3.url, data3.siteForCookies, data3.topFrameOrigin, data3.listener, new RestrictedCookieManagerAddChangeListenerResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 3:
                        RestrictedCookieManagerSetCookieFromStringParams data4 = RestrictedCookieManagerSetCookieFromStringParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setCookieFromString(data4.url, data4.siteForCookies, data4.topFrameOrigin, data4.cookie, new RestrictedCookieManagerSetCookieFromStringResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 4:
                        RestrictedCookieManagerGetCookiesStringParams data5 = RestrictedCookieManagerGetCookiesStringParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getCookiesString(data5.url, data5.siteForCookies, data5.topFrameOrigin, new RestrictedCookieManagerGetCookiesStringResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 5:
                        RestrictedCookieManagerCookiesEnabledForParams data6 = RestrictedCookieManagerCookiesEnabledForParams.deserialize(messageWithHeader.getPayload());
                        getImpl().cookiesEnabledFor(data6.url, data6.siteForCookies, data6.topFrameOrigin, new RestrictedCookieManagerCookiesEnabledForResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class RestrictedCookieManagerGetAllForUrlParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 40;
        private static final DataHeader[] VERSION_ARRAY;
        public CookieManagerGetOptions options;
        public SiteForCookies siteForCookies;
        public Origin topFrameOrigin;
        public Url url;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RestrictedCookieManagerGetAllForUrlParams(int version) {
            super(40, version);
        }

        public RestrictedCookieManagerGetAllForUrlParams() {
            this(0);
        }

        public static RestrictedCookieManagerGetAllForUrlParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RestrictedCookieManagerGetAllForUrlParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RestrictedCookieManagerGetAllForUrlParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RestrictedCookieManagerGetAllForUrlParams result = new RestrictedCookieManagerGetAllForUrlParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.url = Url.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.siteForCookies = SiteForCookies.decode(decoder12);
                Decoder decoder13 = decoder0.readPointer(24, false);
                result.topFrameOrigin = Origin.decode(decoder13);
                Decoder decoder14 = decoder0.readPointer(32, false);
                result.options = CookieManagerGetOptions.decode(decoder14);
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
            encoder0.encode((Struct) this.siteForCookies, 16, false);
            encoder0.encode((Struct) this.topFrameOrigin, 24, false);
            encoder0.encode((Struct) this.options, 32, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class RestrictedCookieManagerGetAllForUrlResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public CookieWithAccessResult[] cookies;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RestrictedCookieManagerGetAllForUrlResponseParams(int version) {
            super(16, version);
        }

        public RestrictedCookieManagerGetAllForUrlResponseParams() {
            this(0);
        }

        public static RestrictedCookieManagerGetAllForUrlResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RestrictedCookieManagerGetAllForUrlResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RestrictedCookieManagerGetAllForUrlResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RestrictedCookieManagerGetAllForUrlResponseParams result = new RestrictedCookieManagerGetAllForUrlResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.cookies = new CookieWithAccessResult[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.cookies[i1] = CookieWithAccessResult.decode(decoder2);
                }
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            CookieWithAccessResult[] cookieWithAccessResultArr = this.cookies;
            if (cookieWithAccessResultArr == null) {
                encoder0.encodeNullPointer(8, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(cookieWithAccessResultArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                CookieWithAccessResult[] cookieWithAccessResultArr2 = this.cookies;
                if (i0 < cookieWithAccessResultArr2.length) {
                    encoder1.encode((Struct) cookieWithAccessResultArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static class RestrictedCookieManagerGetAllForUrlResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final RestrictedCookieManager.GetAllForUrlResponse mCallback;

        RestrictedCookieManagerGetAllForUrlResponseParamsForwardToCallback(RestrictedCookieManager.GetAllForUrlResponse callback) {
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
                RestrictedCookieManagerGetAllForUrlResponseParams response = RestrictedCookieManagerGetAllForUrlResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.cookies);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class RestrictedCookieManagerGetAllForUrlResponseParamsProxyToResponder implements RestrictedCookieManager.GetAllForUrlResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        RestrictedCookieManagerGetAllForUrlResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(CookieWithAccessResult[] cookies) {
            RestrictedCookieManagerGetAllForUrlResponseParams _response = new RestrictedCookieManagerGetAllForUrlResponseParams();
            _response.cookies = cookies;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class RestrictedCookieManagerSetCanonicalCookieParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 40;
        private static final DataHeader[] VERSION_ARRAY;
        public CanonicalCookie cookie;
        public SiteForCookies siteForCookies;
        public Origin topFrameOrigin;
        public Url url;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RestrictedCookieManagerSetCanonicalCookieParams(int version) {
            super(40, version);
        }

        public RestrictedCookieManagerSetCanonicalCookieParams() {
            this(0);
        }

        public static RestrictedCookieManagerSetCanonicalCookieParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RestrictedCookieManagerSetCanonicalCookieParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RestrictedCookieManagerSetCanonicalCookieParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RestrictedCookieManagerSetCanonicalCookieParams result = new RestrictedCookieManagerSetCanonicalCookieParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.cookie = CanonicalCookie.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.url = Url.decode(decoder12);
                Decoder decoder13 = decoder0.readPointer(24, false);
                result.siteForCookies = SiteForCookies.decode(decoder13);
                Decoder decoder14 = decoder0.readPointer(32, false);
                result.topFrameOrigin = Origin.decode(decoder14);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.cookie, 8, false);
            encoder0.encode((Struct) this.url, 16, false);
            encoder0.encode((Struct) this.siteForCookies, 24, false);
            encoder0.encode((Struct) this.topFrameOrigin, 32, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class RestrictedCookieManagerSetCanonicalCookieResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RestrictedCookieManagerSetCanonicalCookieResponseParams(int version) {
            super(16, version);
        }

        public RestrictedCookieManagerSetCanonicalCookieResponseParams() {
            this(0);
        }

        public static RestrictedCookieManagerSetCanonicalCookieResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RestrictedCookieManagerSetCanonicalCookieResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RestrictedCookieManagerSetCanonicalCookieResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RestrictedCookieManagerSetCanonicalCookieResponseParams result = new RestrictedCookieManagerSetCanonicalCookieResponseParams(elementsOrVersion);
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
    static class RestrictedCookieManagerSetCanonicalCookieResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final RestrictedCookieManager.SetCanonicalCookieResponse mCallback;

        RestrictedCookieManagerSetCanonicalCookieResponseParamsForwardToCallback(RestrictedCookieManager.SetCanonicalCookieResponse callback) {
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
                RestrictedCookieManagerSetCanonicalCookieResponseParams response = RestrictedCookieManagerSetCanonicalCookieResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.success));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class RestrictedCookieManagerSetCanonicalCookieResponseParamsProxyToResponder implements RestrictedCookieManager.SetCanonicalCookieResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        RestrictedCookieManagerSetCanonicalCookieResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Boolean success) {
            RestrictedCookieManagerSetCanonicalCookieResponseParams _response = new RestrictedCookieManagerSetCanonicalCookieResponseParams();
            _response.success = success.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(1, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class RestrictedCookieManagerAddChangeListenerParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 40;
        private static final DataHeader[] VERSION_ARRAY;
        public CookieChangeListener listener;
        public SiteForCookies siteForCookies;
        public Origin topFrameOrigin;
        public Url url;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RestrictedCookieManagerAddChangeListenerParams(int version) {
            super(40, version);
        }

        public RestrictedCookieManagerAddChangeListenerParams() {
            this(0);
        }

        public static RestrictedCookieManagerAddChangeListenerParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RestrictedCookieManagerAddChangeListenerParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RestrictedCookieManagerAddChangeListenerParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RestrictedCookieManagerAddChangeListenerParams result = new RestrictedCookieManagerAddChangeListenerParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.url = Url.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.siteForCookies = SiteForCookies.decode(decoder12);
                Decoder decoder13 = decoder0.readPointer(24, false);
                result.topFrameOrigin = Origin.decode(decoder13);
                result.listener = (CookieChangeListener) decoder0.readServiceInterface(32, false, CookieChangeListener.MANAGER);
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
            encoder0.encode((Struct) this.siteForCookies, 16, false);
            encoder0.encode((Struct) this.topFrameOrigin, 24, false);
            encoder0.encode(this.listener, 32, false, CookieChangeListener.MANAGER);
        }
    }

    /* loaded from: classes2.dex */
    static final class RestrictedCookieManagerAddChangeListenerResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RestrictedCookieManagerAddChangeListenerResponseParams(int version) {
            super(8, version);
        }

        public RestrictedCookieManagerAddChangeListenerResponseParams() {
            this(0);
        }

        public static RestrictedCookieManagerAddChangeListenerResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RestrictedCookieManagerAddChangeListenerResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RestrictedCookieManagerAddChangeListenerResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RestrictedCookieManagerAddChangeListenerResponseParams result = new RestrictedCookieManagerAddChangeListenerResponseParams(elementsOrVersion);
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
    static class RestrictedCookieManagerAddChangeListenerResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final RestrictedCookieManager.AddChangeListenerResponse mCallback;

        RestrictedCookieManagerAddChangeListenerResponseParamsForwardToCallback(RestrictedCookieManager.AddChangeListenerResponse callback) {
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
                this.mCallback.call();
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class RestrictedCookieManagerAddChangeListenerResponseParamsProxyToResponder implements RestrictedCookieManager.AddChangeListenerResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        RestrictedCookieManagerAddChangeListenerResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            RestrictedCookieManagerAddChangeListenerResponseParams _response = new RestrictedCookieManagerAddChangeListenerResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(2, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class RestrictedCookieManagerSetCookieFromStringParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 40;
        private static final DataHeader[] VERSION_ARRAY;
        public String cookie;
        public SiteForCookies siteForCookies;
        public Origin topFrameOrigin;
        public Url url;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RestrictedCookieManagerSetCookieFromStringParams(int version) {
            super(40, version);
        }

        public RestrictedCookieManagerSetCookieFromStringParams() {
            this(0);
        }

        public static RestrictedCookieManagerSetCookieFromStringParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RestrictedCookieManagerSetCookieFromStringParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RestrictedCookieManagerSetCookieFromStringParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RestrictedCookieManagerSetCookieFromStringParams result = new RestrictedCookieManagerSetCookieFromStringParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.url = Url.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.siteForCookies = SiteForCookies.decode(decoder12);
                Decoder decoder13 = decoder0.readPointer(24, false);
                result.topFrameOrigin = Origin.decode(decoder13);
                result.cookie = decoder0.readString(32, false);
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
            encoder0.encode((Struct) this.siteForCookies, 16, false);
            encoder0.encode((Struct) this.topFrameOrigin, 24, false);
            encoder0.encode(this.cookie, 32, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class RestrictedCookieManagerSetCookieFromStringResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RestrictedCookieManagerSetCookieFromStringResponseParams(int version) {
            super(8, version);
        }

        public RestrictedCookieManagerSetCookieFromStringResponseParams() {
            this(0);
        }

        public static RestrictedCookieManagerSetCookieFromStringResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RestrictedCookieManagerSetCookieFromStringResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RestrictedCookieManagerSetCookieFromStringResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RestrictedCookieManagerSetCookieFromStringResponseParams result = new RestrictedCookieManagerSetCookieFromStringResponseParams(elementsOrVersion);
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
    static class RestrictedCookieManagerSetCookieFromStringResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final RestrictedCookieManager.SetCookieFromStringResponse mCallback;

        RestrictedCookieManagerSetCookieFromStringResponseParamsForwardToCallback(RestrictedCookieManager.SetCookieFromStringResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(3, 6)) {
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
    static class RestrictedCookieManagerSetCookieFromStringResponseParamsProxyToResponder implements RestrictedCookieManager.SetCookieFromStringResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        RestrictedCookieManagerSetCookieFromStringResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            RestrictedCookieManagerSetCookieFromStringResponseParams _response = new RestrictedCookieManagerSetCookieFromStringResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(3, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class RestrictedCookieManagerGetCookiesStringParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public SiteForCookies siteForCookies;
        public Origin topFrameOrigin;
        public Url url;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RestrictedCookieManagerGetCookiesStringParams(int version) {
            super(32, version);
        }

        public RestrictedCookieManagerGetCookiesStringParams() {
            this(0);
        }

        public static RestrictedCookieManagerGetCookiesStringParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RestrictedCookieManagerGetCookiesStringParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RestrictedCookieManagerGetCookiesStringParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RestrictedCookieManagerGetCookiesStringParams result = new RestrictedCookieManagerGetCookiesStringParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.url = Url.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.siteForCookies = SiteForCookies.decode(decoder12);
                Decoder decoder13 = decoder0.readPointer(24, false);
                result.topFrameOrigin = Origin.decode(decoder13);
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
            encoder0.encode((Struct) this.siteForCookies, 16, false);
            encoder0.encode((Struct) this.topFrameOrigin, 24, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class RestrictedCookieManagerGetCookiesStringResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public String cookies;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RestrictedCookieManagerGetCookiesStringResponseParams(int version) {
            super(16, version);
        }

        public RestrictedCookieManagerGetCookiesStringResponseParams() {
            this(0);
        }

        public static RestrictedCookieManagerGetCookiesStringResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RestrictedCookieManagerGetCookiesStringResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RestrictedCookieManagerGetCookiesStringResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RestrictedCookieManagerGetCookiesStringResponseParams result = new RestrictedCookieManagerGetCookiesStringResponseParams(elementsOrVersion);
                result.cookies = decoder0.readString(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.cookies, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static class RestrictedCookieManagerGetCookiesStringResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final RestrictedCookieManager.GetCookiesStringResponse mCallback;

        RestrictedCookieManagerGetCookiesStringResponseParamsForwardToCallback(RestrictedCookieManager.GetCookiesStringResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(4, 6)) {
                    return false;
                }
                RestrictedCookieManagerGetCookiesStringResponseParams response = RestrictedCookieManagerGetCookiesStringResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.cookies);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class RestrictedCookieManagerGetCookiesStringResponseParamsProxyToResponder implements RestrictedCookieManager.GetCookiesStringResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        RestrictedCookieManagerGetCookiesStringResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(String cookies) {
            RestrictedCookieManagerGetCookiesStringResponseParams _response = new RestrictedCookieManagerGetCookiesStringResponseParams();
            _response.cookies = cookies;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(4, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class RestrictedCookieManagerCookiesEnabledForParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public SiteForCookies siteForCookies;
        public Origin topFrameOrigin;
        public Url url;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RestrictedCookieManagerCookiesEnabledForParams(int version) {
            super(32, version);
        }

        public RestrictedCookieManagerCookiesEnabledForParams() {
            this(0);
        }

        public static RestrictedCookieManagerCookiesEnabledForParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RestrictedCookieManagerCookiesEnabledForParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RestrictedCookieManagerCookiesEnabledForParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RestrictedCookieManagerCookiesEnabledForParams result = new RestrictedCookieManagerCookiesEnabledForParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.url = Url.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.siteForCookies = SiteForCookies.decode(decoder12);
                Decoder decoder13 = decoder0.readPointer(24, false);
                result.topFrameOrigin = Origin.decode(decoder13);
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
            encoder0.encode((Struct) this.siteForCookies, 16, false);
            encoder0.encode((Struct) this.topFrameOrigin, 24, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class RestrictedCookieManagerCookiesEnabledForResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean cookiesEnabled;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RestrictedCookieManagerCookiesEnabledForResponseParams(int version) {
            super(16, version);
        }

        public RestrictedCookieManagerCookiesEnabledForResponseParams() {
            this(0);
        }

        public static RestrictedCookieManagerCookiesEnabledForResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RestrictedCookieManagerCookiesEnabledForResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RestrictedCookieManagerCookiesEnabledForResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RestrictedCookieManagerCookiesEnabledForResponseParams result = new RestrictedCookieManagerCookiesEnabledForResponseParams(elementsOrVersion);
                result.cookiesEnabled = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.cookiesEnabled, 8, 0);
        }
    }

    /* loaded from: classes2.dex */
    static class RestrictedCookieManagerCookiesEnabledForResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final RestrictedCookieManager.CookiesEnabledForResponse mCallback;

        RestrictedCookieManagerCookiesEnabledForResponseParamsForwardToCallback(RestrictedCookieManager.CookiesEnabledForResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(5, 6)) {
                    return false;
                }
                RestrictedCookieManagerCookiesEnabledForResponseParams response = RestrictedCookieManagerCookiesEnabledForResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.cookiesEnabled));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class RestrictedCookieManagerCookiesEnabledForResponseParamsProxyToResponder implements RestrictedCookieManager.CookiesEnabledForResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        RestrictedCookieManagerCookiesEnabledForResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Boolean cookiesEnabled) {
            RestrictedCookieManagerCookiesEnabledForResponseParams _response = new RestrictedCookieManagerCookiesEnabledForResponseParams();
            _response.cookiesEnabled = cookiesEnabled.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(5, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
