package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.FederatedAuthRequest;
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
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
class FederatedAuthRequest_Internal {
    private static final int LOGOUT_ORDINAL = 1;
    public static final Interface.Manager<FederatedAuthRequest, FederatedAuthRequest.Proxy> MANAGER = new Interface.Manager<FederatedAuthRequest, FederatedAuthRequest.Proxy>() { // from class: org.chromium.blink.mojom.FederatedAuthRequest_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.FederatedAuthRequest";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public FederatedAuthRequest.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, FederatedAuthRequest impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public FederatedAuthRequest[] buildArray(int size) {
            return new FederatedAuthRequest[size];
        }
    };
    private static final int REQUEST_ID_TOKEN_ORDINAL = 0;

    FederatedAuthRequest_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements FederatedAuthRequest.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.FederatedAuthRequest
        public void requestIdToken(Url provider, String clientId, String nonce, int mode, RequestIdTokenResponse callback) {
            FederatedAuthRequestRequestIdTokenParams _message = new FederatedAuthRequestRequestIdTokenParams();
            _message.provider = provider;
            _message.clientId = clientId;
            _message.nonce = nonce;
            _message.mode = mode;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new FederatedAuthRequestRequestIdTokenResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.FederatedAuthRequest
        public void logout(String[] rpLogoutEndpoints, LogoutResponse callback) {
            FederatedAuthRequestLogoutParams _message = new FederatedAuthRequestLogoutParams();
            _message.rpLogoutEndpoints = rpLogoutEndpoints;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1, 1, 0L)), new FederatedAuthRequestLogoutResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<FederatedAuthRequest> {
        Stub(Core core, FederatedAuthRequest impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(FederatedAuthRequest_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), FederatedAuthRequest_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        FederatedAuthRequestRequestIdTokenParams data = FederatedAuthRequestRequestIdTokenParams.deserialize(messageWithHeader.getPayload());
                        getImpl().requestIdToken(data.provider, data.clientId, data.nonce, data.mode, new FederatedAuthRequestRequestIdTokenResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 1:
                        getImpl().logout(FederatedAuthRequestLogoutParams.deserialize(messageWithHeader.getPayload()).rpLogoutEndpoints, new FederatedAuthRequestLogoutResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class FederatedAuthRequestRequestIdTokenParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 40;
        private static final DataHeader[] VERSION_ARRAY;
        public String clientId;
        public int mode;
        public String nonce;
        public Url provider;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FederatedAuthRequestRequestIdTokenParams(int version) {
            super(40, version);
        }

        public FederatedAuthRequestRequestIdTokenParams() {
            this(0);
        }

        public static FederatedAuthRequestRequestIdTokenParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FederatedAuthRequestRequestIdTokenParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FederatedAuthRequestRequestIdTokenParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FederatedAuthRequestRequestIdTokenParams result = new FederatedAuthRequestRequestIdTokenParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.provider = Url.decode(decoder1);
                result.clientId = decoder0.readString(16, false);
                result.nonce = decoder0.readString(24, false);
                int readInt = decoder0.readInt(32);
                result.mode = readInt;
                RequestMode.validate(readInt);
                result.mode = RequestMode.toKnownValue(result.mode);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.provider, 8, false);
            encoder0.encode(this.clientId, 16, false);
            encoder0.encode(this.nonce, 24, false);
            encoder0.encode(this.mode, 32);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class FederatedAuthRequestRequestIdTokenResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public String idToken;
        public int status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FederatedAuthRequestRequestIdTokenResponseParams(int version) {
            super(24, version);
        }

        public FederatedAuthRequestRequestIdTokenResponseParams() {
            this(0);
        }

        public static FederatedAuthRequestRequestIdTokenResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FederatedAuthRequestRequestIdTokenResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FederatedAuthRequestRequestIdTokenResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FederatedAuthRequestRequestIdTokenResponseParams result = new FederatedAuthRequestRequestIdTokenResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.status = readInt;
                RequestIdTokenStatus.validate(readInt);
                result.status = RequestIdTokenStatus.toKnownValue(result.status);
                result.idToken = decoder0.readString(16, true);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.status, 8);
            encoder0.encode(this.idToken, 16, true);
        }
    }

    /* loaded from: classes2.dex */
    static class FederatedAuthRequestRequestIdTokenResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final FederatedAuthRequest.RequestIdTokenResponse mCallback;

        FederatedAuthRequestRequestIdTokenResponseParamsForwardToCallback(FederatedAuthRequest.RequestIdTokenResponse callback) {
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
                FederatedAuthRequestRequestIdTokenResponseParams response = FederatedAuthRequestRequestIdTokenResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.status), response.idToken);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class FederatedAuthRequestRequestIdTokenResponseParamsProxyToResponder implements FederatedAuthRequest.RequestIdTokenResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        FederatedAuthRequestRequestIdTokenResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Integer status, String idToken) {
            FederatedAuthRequestRequestIdTokenResponseParams _response = new FederatedAuthRequestRequestIdTokenResponseParams();
            _response.status = status.intValue();
            _response.idToken = idToken;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class FederatedAuthRequestLogoutParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public String[] rpLogoutEndpoints;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FederatedAuthRequestLogoutParams(int version) {
            super(16, version);
        }

        public FederatedAuthRequestLogoutParams() {
            this(0);
        }

        public static FederatedAuthRequestLogoutParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FederatedAuthRequestLogoutParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FederatedAuthRequestLogoutParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FederatedAuthRequestLogoutParams result = new FederatedAuthRequestLogoutParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.rpLogoutEndpoints = new String[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    result.rpLogoutEndpoints[i1] = decoder1.readString((i1 * 8) + 8, false);
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
            String[] strArr = this.rpLogoutEndpoints;
            if (strArr == null) {
                encoder0.encodeNullPointer(8, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(strArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                String[] strArr2 = this.rpLogoutEndpoints;
                if (i0 < strArr2.length) {
                    encoder1.encode(strArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class FederatedAuthRequestLogoutResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private FederatedAuthRequestLogoutResponseParams(int version) {
            super(16, version);
        }

        public FederatedAuthRequestLogoutResponseParams() {
            this(0);
        }

        public static FederatedAuthRequestLogoutResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static FederatedAuthRequestLogoutResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static FederatedAuthRequestLogoutResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                FederatedAuthRequestLogoutResponseParams result = new FederatedAuthRequestLogoutResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.status = readInt;
                LogoutStatus.validate(readInt);
                result.status = LogoutStatus.toKnownValue(result.status);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.status, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class FederatedAuthRequestLogoutResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final FederatedAuthRequest.LogoutResponse mCallback;

        FederatedAuthRequestLogoutResponseParamsForwardToCallback(FederatedAuthRequest.LogoutResponse callback) {
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
                FederatedAuthRequestLogoutResponseParams response = FederatedAuthRequestLogoutResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.status));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class FederatedAuthRequestLogoutResponseParamsProxyToResponder implements FederatedAuthRequest.LogoutResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        FederatedAuthRequestLogoutResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer status) {
            FederatedAuthRequestLogoutResponseParams _response = new FederatedAuthRequestLogoutResponseParams();
            _response.status = status.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(1, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
