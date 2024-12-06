package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.Authenticator;
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
/* loaded from: classes2.dex */
class Authenticator_Internal {
    private static final int CANCEL_ORDINAL = 3;
    private static final int GET_ASSERTION_ORDINAL = 1;
    private static final int IS_USER_VERIFYING_PLATFORM_AUTHENTICATOR_AVAILABLE_ORDINAL = 2;
    private static final int MAKE_CREDENTIAL_ORDINAL = 0;
    public static final Interface.Manager<Authenticator, Authenticator.Proxy> MANAGER = new Interface.Manager<Authenticator, Authenticator.Proxy>() { // from class: org.chromium.blink.mojom.Authenticator_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.Authenticator";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public Authenticator.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, Authenticator impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Authenticator[] buildArray(int size) {
            return new Authenticator[size];
        }
    };

    Authenticator_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements Authenticator.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.Authenticator
        public void makeCredential(PublicKeyCredentialCreationOptions options, MakeCredentialResponse callback) {
            AuthenticatorMakeCredentialParams _message = new AuthenticatorMakeCredentialParams();
            _message.options = options;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new AuthenticatorMakeCredentialResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.Authenticator
        public void getAssertion(PublicKeyCredentialRequestOptions options, GetAssertionResponse callback) {
            AuthenticatorGetAssertionParams _message = new AuthenticatorGetAssertionParams();
            _message.options = options;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1, 1, 0L)), new AuthenticatorGetAssertionResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.Authenticator
        public void isUserVerifyingPlatformAuthenticatorAvailable(IsUserVerifyingPlatformAuthenticatorAvailableResponse callback) {
            AuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableParams _message = new AuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2, 1, 0L)), new AuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.Authenticator
        public void cancel() {
            AuthenticatorCancelParams _message = new AuthenticatorCancelParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<Authenticator> {
        Stub(Core core, Authenticator impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(Authenticator_Internal.MANAGER, messageWithHeader);
                    case 3:
                        AuthenticatorCancelParams.deserialize(messageWithHeader.getPayload());
                        getImpl().cancel();
                        return true;
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), Authenticator_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        AuthenticatorMakeCredentialParams data = AuthenticatorMakeCredentialParams.deserialize(messageWithHeader.getPayload());
                        getImpl().makeCredential(data.options, new AuthenticatorMakeCredentialResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 1:
                        AuthenticatorGetAssertionParams data2 = AuthenticatorGetAssertionParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getAssertion(data2.options, new AuthenticatorGetAssertionResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 2:
                        AuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableParams.deserialize(messageWithHeader.getPayload());
                        getImpl().isUserVerifyingPlatformAuthenticatorAvailable(new AuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class AuthenticatorMakeCredentialParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public PublicKeyCredentialCreationOptions options;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private AuthenticatorMakeCredentialParams(int version) {
            super(16, version);
        }

        public AuthenticatorMakeCredentialParams() {
            this(0);
        }

        public static AuthenticatorMakeCredentialParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static AuthenticatorMakeCredentialParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static AuthenticatorMakeCredentialParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                AuthenticatorMakeCredentialParams result = new AuthenticatorMakeCredentialParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.options = PublicKeyCredentialCreationOptions.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.options, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class AuthenticatorMakeCredentialResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public MakeCredentialAuthenticatorResponse credential;
        public int status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private AuthenticatorMakeCredentialResponseParams(int version) {
            super(24, version);
        }

        public AuthenticatorMakeCredentialResponseParams() {
            this(0);
        }

        public static AuthenticatorMakeCredentialResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static AuthenticatorMakeCredentialResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static AuthenticatorMakeCredentialResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                AuthenticatorMakeCredentialResponseParams result = new AuthenticatorMakeCredentialResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.status = readInt;
                AuthenticatorStatus.validate(readInt);
                result.status = AuthenticatorStatus.toKnownValue(result.status);
                Decoder decoder1 = decoder0.readPointer(16, true);
                result.credential = MakeCredentialAuthenticatorResponse.decode(decoder1);
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
            encoder0.encode((Struct) this.credential, 16, true);
        }
    }

    /* loaded from: classes2.dex */
    static class AuthenticatorMakeCredentialResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final Authenticator.MakeCredentialResponse mCallback;

        AuthenticatorMakeCredentialResponseParamsForwardToCallback(Authenticator.MakeCredentialResponse callback) {
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
                AuthenticatorMakeCredentialResponseParams response = AuthenticatorMakeCredentialResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.status), response.credential);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class AuthenticatorMakeCredentialResponseParamsProxyToResponder implements Authenticator.MakeCredentialResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        AuthenticatorMakeCredentialResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Integer status, MakeCredentialAuthenticatorResponse credential) {
            AuthenticatorMakeCredentialResponseParams _response = new AuthenticatorMakeCredentialResponseParams();
            _response.status = status.intValue();
            _response.credential = credential;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class AuthenticatorGetAssertionParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public PublicKeyCredentialRequestOptions options;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private AuthenticatorGetAssertionParams(int version) {
            super(16, version);
        }

        public AuthenticatorGetAssertionParams() {
            this(0);
        }

        public static AuthenticatorGetAssertionParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static AuthenticatorGetAssertionParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static AuthenticatorGetAssertionParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                AuthenticatorGetAssertionParams result = new AuthenticatorGetAssertionParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.options = PublicKeyCredentialRequestOptions.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.options, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class AuthenticatorGetAssertionResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public GetAssertionAuthenticatorResponse credential;
        public int status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private AuthenticatorGetAssertionResponseParams(int version) {
            super(24, version);
        }

        public AuthenticatorGetAssertionResponseParams() {
            this(0);
        }

        public static AuthenticatorGetAssertionResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static AuthenticatorGetAssertionResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static AuthenticatorGetAssertionResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                AuthenticatorGetAssertionResponseParams result = new AuthenticatorGetAssertionResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.status = readInt;
                AuthenticatorStatus.validate(readInt);
                result.status = AuthenticatorStatus.toKnownValue(result.status);
                Decoder decoder1 = decoder0.readPointer(16, true);
                result.credential = GetAssertionAuthenticatorResponse.decode(decoder1);
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
            encoder0.encode((Struct) this.credential, 16, true);
        }
    }

    /* loaded from: classes2.dex */
    static class AuthenticatorGetAssertionResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final Authenticator.GetAssertionResponse mCallback;

        AuthenticatorGetAssertionResponseParamsForwardToCallback(Authenticator.GetAssertionResponse callback) {
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
                AuthenticatorGetAssertionResponseParams response = AuthenticatorGetAssertionResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.status), response.credential);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class AuthenticatorGetAssertionResponseParamsProxyToResponder implements Authenticator.GetAssertionResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        AuthenticatorGetAssertionResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Integer status, GetAssertionAuthenticatorResponse credential) {
            AuthenticatorGetAssertionResponseParams _response = new AuthenticatorGetAssertionResponseParams();
            _response.status = status.intValue();
            _response.credential = credential;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(1, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class AuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private AuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableParams(int version) {
            super(8, version);
        }

        public AuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableParams() {
            this(0);
        }

        public static AuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static AuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static AuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                AuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableParams result = new AuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableParams(elementsOrVersion);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class AuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean available;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private AuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableResponseParams(int version) {
            super(16, version);
        }

        public AuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableResponseParams() {
            this(0);
        }

        public static AuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static AuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static AuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                AuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableResponseParams result = new AuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableResponseParams(elementsOrVersion);
                result.available = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.available, 8, 0);
        }
    }

    /* loaded from: classes2.dex */
    static class AuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final Authenticator.IsUserVerifyingPlatformAuthenticatorAvailableResponse mCallback;

        AuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableResponseParamsForwardToCallback(Authenticator.IsUserVerifyingPlatformAuthenticatorAvailableResponse callback) {
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
                AuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableResponseParams response = AuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.available));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class AuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableResponseParamsProxyToResponder implements Authenticator.IsUserVerifyingPlatformAuthenticatorAvailableResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        AuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Boolean available) {
            AuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableResponseParams _response = new AuthenticatorIsUserVerifyingPlatformAuthenticatorAvailableResponseParams();
            _response.available = available.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(2, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class AuthenticatorCancelParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private AuthenticatorCancelParams(int version) {
            super(8, version);
        }

        public AuthenticatorCancelParams() {
            this(0);
        }

        public static AuthenticatorCancelParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static AuthenticatorCancelParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static AuthenticatorCancelParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                AuthenticatorCancelParams result = new AuthenticatorCancelParams(elementsOrVersion);
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
}
