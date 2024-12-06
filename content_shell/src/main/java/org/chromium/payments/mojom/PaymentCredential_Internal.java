package org.chromium.payments.mojom;

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
import org.chromium.payments.mojom.PaymentCredential;
/* loaded from: classes2.dex */
class PaymentCredential_Internal {
    private static final int DOWNLOAD_ICON_AND_SHOW_USER_PROMPT_ORDINAL = 0;
    private static final int HIDE_USER_PROMPT_ORDINAL = 2;
    public static final Interface.Manager<PaymentCredential, PaymentCredential.Proxy> MANAGER = new Interface.Manager<PaymentCredential, PaymentCredential.Proxy>() { // from class: org.chromium.payments.mojom.PaymentCredential_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "payments.mojom.PaymentCredential";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public PaymentCredential.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, PaymentCredential impl) {
            return new Stub(core, impl);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public PaymentCredential[] buildArray(int size) {
            return new PaymentCredential[size];
        }
    };
    private static final int STORE_PAYMENT_CREDENTIAL_AND_HIDE_USER_PROMPT_ORDINAL = 1;

    PaymentCredential_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements PaymentCredential.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.payments.mojom.PaymentCredential
        public void downloadIconAndShowUserPrompt(PaymentCredentialInstrument instrument, DownloadIconAndShowUserPromptResponse callback) {
            PaymentCredentialDownloadIconAndShowUserPromptParams _message = new PaymentCredentialDownloadIconAndShowUserPromptParams();
            _message.instrument = instrument;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new PaymentCredentialDownloadIconAndShowUserPromptResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.payments.mojom.PaymentCredential
        public void storePaymentCredentialAndHideUserPrompt(PaymentCredentialInstrument instrument, byte[] credentialId, String rpId, StorePaymentCredentialAndHideUserPromptResponse callback) {
            PaymentCredentialStorePaymentCredentialAndHideUserPromptParams _message = new PaymentCredentialStorePaymentCredentialAndHideUserPromptParams();
            _message.instrument = instrument;
            _message.credentialId = credentialId;
            _message.rpId = rpId;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1, 1, 0L)), new PaymentCredentialStorePaymentCredentialAndHideUserPromptResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.payments.mojom.PaymentCredential
        public void hideUserPrompt(HideUserPromptResponse callback) {
            PaymentCredentialHideUserPromptParams _message = new PaymentCredentialHideUserPromptParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2, 1, 0L)), new PaymentCredentialHideUserPromptResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<PaymentCredential> {
        Stub(Core core, PaymentCredential impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(PaymentCredential_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), PaymentCredential_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        getImpl().downloadIconAndShowUserPrompt(PaymentCredentialDownloadIconAndShowUserPromptParams.deserialize(messageWithHeader.getPayload()).instrument, new PaymentCredentialDownloadIconAndShowUserPromptResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 1:
                        PaymentCredentialStorePaymentCredentialAndHideUserPromptParams data = PaymentCredentialStorePaymentCredentialAndHideUserPromptParams.deserialize(messageWithHeader.getPayload());
                        getImpl().storePaymentCredentialAndHideUserPrompt(data.instrument, data.credentialId, data.rpId, new PaymentCredentialStorePaymentCredentialAndHideUserPromptResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 2:
                        PaymentCredentialHideUserPromptParams.deserialize(messageWithHeader.getPayload());
                        getImpl().hideUserPrompt(new PaymentCredentialHideUserPromptResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class PaymentCredentialDownloadIconAndShowUserPromptParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public PaymentCredentialInstrument instrument;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PaymentCredentialDownloadIconAndShowUserPromptParams(int version) {
            super(16, version);
        }

        public PaymentCredentialDownloadIconAndShowUserPromptParams() {
            this(0);
        }

        public static PaymentCredentialDownloadIconAndShowUserPromptParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PaymentCredentialDownloadIconAndShowUserPromptParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PaymentCredentialDownloadIconAndShowUserPromptParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PaymentCredentialDownloadIconAndShowUserPromptParams result = new PaymentCredentialDownloadIconAndShowUserPromptParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.instrument = PaymentCredentialInstrument.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.instrument, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class PaymentCredentialDownloadIconAndShowUserPromptResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PaymentCredentialDownloadIconAndShowUserPromptResponseParams(int version) {
            super(16, version);
        }

        public PaymentCredentialDownloadIconAndShowUserPromptResponseParams() {
            this(0);
        }

        public static PaymentCredentialDownloadIconAndShowUserPromptResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PaymentCredentialDownloadIconAndShowUserPromptResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PaymentCredentialDownloadIconAndShowUserPromptResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PaymentCredentialDownloadIconAndShowUserPromptResponseParams result = new PaymentCredentialDownloadIconAndShowUserPromptResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.status = readInt;
                PaymentCredentialUserPromptStatus.validate(readInt);
                result.status = PaymentCredentialUserPromptStatus.toKnownValue(result.status);
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
    static class PaymentCredentialDownloadIconAndShowUserPromptResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final PaymentCredential.DownloadIconAndShowUserPromptResponse mCallback;

        PaymentCredentialDownloadIconAndShowUserPromptResponseParamsForwardToCallback(PaymentCredential.DownloadIconAndShowUserPromptResponse callback) {
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
                PaymentCredentialDownloadIconAndShowUserPromptResponseParams response = PaymentCredentialDownloadIconAndShowUserPromptResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.status));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class PaymentCredentialDownloadIconAndShowUserPromptResponseParamsProxyToResponder implements PaymentCredential.DownloadIconAndShowUserPromptResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        PaymentCredentialDownloadIconAndShowUserPromptResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer status) {
            PaymentCredentialDownloadIconAndShowUserPromptResponseParams _response = new PaymentCredentialDownloadIconAndShowUserPromptResponseParams();
            _response.status = status.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class PaymentCredentialStorePaymentCredentialAndHideUserPromptParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public byte[] credentialId;
        public PaymentCredentialInstrument instrument;
        public String rpId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PaymentCredentialStorePaymentCredentialAndHideUserPromptParams(int version) {
            super(32, version);
        }

        public PaymentCredentialStorePaymentCredentialAndHideUserPromptParams() {
            this(0);
        }

        public static PaymentCredentialStorePaymentCredentialAndHideUserPromptParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PaymentCredentialStorePaymentCredentialAndHideUserPromptParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PaymentCredentialStorePaymentCredentialAndHideUserPromptParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PaymentCredentialStorePaymentCredentialAndHideUserPromptParams result = new PaymentCredentialStorePaymentCredentialAndHideUserPromptParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.instrument = PaymentCredentialInstrument.decode(decoder1);
                result.credentialId = decoder0.readBytes(16, 0, -1);
                result.rpId = decoder0.readString(24, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.instrument, 8, false);
            encoder0.encode(this.credentialId, 16, 0, -1);
            encoder0.encode(this.rpId, 24, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class PaymentCredentialStorePaymentCredentialAndHideUserPromptResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PaymentCredentialStorePaymentCredentialAndHideUserPromptResponseParams(int version) {
            super(16, version);
        }

        public PaymentCredentialStorePaymentCredentialAndHideUserPromptResponseParams() {
            this(0);
        }

        public static PaymentCredentialStorePaymentCredentialAndHideUserPromptResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PaymentCredentialStorePaymentCredentialAndHideUserPromptResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PaymentCredentialStorePaymentCredentialAndHideUserPromptResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PaymentCredentialStorePaymentCredentialAndHideUserPromptResponseParams result = new PaymentCredentialStorePaymentCredentialAndHideUserPromptResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.status = readInt;
                PaymentCredentialStorageStatus.validate(readInt);
                result.status = PaymentCredentialStorageStatus.toKnownValue(result.status);
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
    static class PaymentCredentialStorePaymentCredentialAndHideUserPromptResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final PaymentCredential.StorePaymentCredentialAndHideUserPromptResponse mCallback;

        PaymentCredentialStorePaymentCredentialAndHideUserPromptResponseParamsForwardToCallback(PaymentCredential.StorePaymentCredentialAndHideUserPromptResponse callback) {
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
                PaymentCredentialStorePaymentCredentialAndHideUserPromptResponseParams response = PaymentCredentialStorePaymentCredentialAndHideUserPromptResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.status));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class PaymentCredentialStorePaymentCredentialAndHideUserPromptResponseParamsProxyToResponder implements PaymentCredential.StorePaymentCredentialAndHideUserPromptResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        PaymentCredentialStorePaymentCredentialAndHideUserPromptResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer status) {
            PaymentCredentialStorePaymentCredentialAndHideUserPromptResponseParams _response = new PaymentCredentialStorePaymentCredentialAndHideUserPromptResponseParams();
            _response.status = status.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(1, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class PaymentCredentialHideUserPromptParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PaymentCredentialHideUserPromptParams(int version) {
            super(8, version);
        }

        public PaymentCredentialHideUserPromptParams() {
            this(0);
        }

        public static PaymentCredentialHideUserPromptParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PaymentCredentialHideUserPromptParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PaymentCredentialHideUserPromptParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PaymentCredentialHideUserPromptParams result = new PaymentCredentialHideUserPromptParams(elementsOrVersion);
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
    static final class PaymentCredentialHideUserPromptResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PaymentCredentialHideUserPromptResponseParams(int version) {
            super(8, version);
        }

        public PaymentCredentialHideUserPromptResponseParams() {
            this(0);
        }

        public static PaymentCredentialHideUserPromptResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PaymentCredentialHideUserPromptResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PaymentCredentialHideUserPromptResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PaymentCredentialHideUserPromptResponseParams result = new PaymentCredentialHideUserPromptResponseParams(elementsOrVersion);
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
    static class PaymentCredentialHideUserPromptResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final PaymentCredential.HideUserPromptResponse mCallback;

        PaymentCredentialHideUserPromptResponseParamsForwardToCallback(PaymentCredential.HideUserPromptResponse callback) {
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
    static class PaymentCredentialHideUserPromptResponseParamsProxyToResponder implements PaymentCredential.HideUserPromptResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        PaymentCredentialHideUserPromptResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            PaymentCredentialHideUserPromptResponseParams _response = new PaymentCredentialHideUserPromptResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(2, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
