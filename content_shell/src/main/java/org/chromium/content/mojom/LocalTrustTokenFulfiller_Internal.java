package org.chromium.content.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.content.mojom.LocalTrustTokenFulfiller;
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
import org.chromium.network.mojom.FulfillTrustTokenIssuanceAnswer;
import org.chromium.network.mojom.FulfillTrustTokenIssuanceRequest;
/* loaded from: classes2.dex */
class LocalTrustTokenFulfiller_Internal {
    private static final int FULFILL_TRUST_TOKEN_ISSUANCE_ORDINAL = 0;
    public static final Interface.Manager<LocalTrustTokenFulfiller, LocalTrustTokenFulfiller.Proxy> MANAGER = new Interface.Manager<LocalTrustTokenFulfiller, LocalTrustTokenFulfiller.Proxy>() { // from class: org.chromium.content.mojom.LocalTrustTokenFulfiller_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "content.mojom.LocalTrustTokenFulfiller";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public LocalTrustTokenFulfiller.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, LocalTrustTokenFulfiller impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public LocalTrustTokenFulfiller[] buildArray(int size) {
            return new LocalTrustTokenFulfiller[size];
        }
    };

    LocalTrustTokenFulfiller_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements LocalTrustTokenFulfiller.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.content.mojom.LocalTrustTokenFulfiller
        public void fulfillTrustTokenIssuance(FulfillTrustTokenIssuanceRequest request, FulfillTrustTokenIssuanceResponse callback) {
            LocalTrustTokenFulfillerFulfillTrustTokenIssuanceParams _message = new LocalTrustTokenFulfillerFulfillTrustTokenIssuanceParams();
            _message.request = request;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new LocalTrustTokenFulfillerFulfillTrustTokenIssuanceResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<LocalTrustTokenFulfiller> {
        Stub(Core core, LocalTrustTokenFulfiller impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(LocalTrustTokenFulfiller_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), LocalTrustTokenFulfiller_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        LocalTrustTokenFulfillerFulfillTrustTokenIssuanceParams data = LocalTrustTokenFulfillerFulfillTrustTokenIssuanceParams.deserialize(messageWithHeader.getPayload());
                        getImpl().fulfillTrustTokenIssuance(data.request, new LocalTrustTokenFulfillerFulfillTrustTokenIssuanceResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class LocalTrustTokenFulfillerFulfillTrustTokenIssuanceParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public FulfillTrustTokenIssuanceRequest request;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalTrustTokenFulfillerFulfillTrustTokenIssuanceParams(int version) {
            super(16, version);
        }

        public LocalTrustTokenFulfillerFulfillTrustTokenIssuanceParams() {
            this(0);
        }

        public static LocalTrustTokenFulfillerFulfillTrustTokenIssuanceParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalTrustTokenFulfillerFulfillTrustTokenIssuanceParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalTrustTokenFulfillerFulfillTrustTokenIssuanceParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalTrustTokenFulfillerFulfillTrustTokenIssuanceParams result = new LocalTrustTokenFulfillerFulfillTrustTokenIssuanceParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.request = FulfillTrustTokenIssuanceRequest.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        @Override // org.chromium.mojo.bindings.Struct
        protected final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.request, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class LocalTrustTokenFulfillerFulfillTrustTokenIssuanceResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public FulfillTrustTokenIssuanceAnswer answer;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private LocalTrustTokenFulfillerFulfillTrustTokenIssuanceResponseParams(int version) {
            super(16, version);
        }

        public LocalTrustTokenFulfillerFulfillTrustTokenIssuanceResponseParams() {
            this(0);
        }

        public static LocalTrustTokenFulfillerFulfillTrustTokenIssuanceResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static LocalTrustTokenFulfillerFulfillTrustTokenIssuanceResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static LocalTrustTokenFulfillerFulfillTrustTokenIssuanceResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                LocalTrustTokenFulfillerFulfillTrustTokenIssuanceResponseParams result = new LocalTrustTokenFulfillerFulfillTrustTokenIssuanceResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.answer = FulfillTrustTokenIssuanceAnswer.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        @Override // org.chromium.mojo.bindings.Struct
        protected final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.answer, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static class LocalTrustTokenFulfillerFulfillTrustTokenIssuanceResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final LocalTrustTokenFulfiller.FulfillTrustTokenIssuanceResponse mCallback;

        LocalTrustTokenFulfillerFulfillTrustTokenIssuanceResponseParamsForwardToCallback(LocalTrustTokenFulfiller.FulfillTrustTokenIssuanceResponse callback) {
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
                LocalTrustTokenFulfillerFulfillTrustTokenIssuanceResponseParams response = LocalTrustTokenFulfillerFulfillTrustTokenIssuanceResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.answer);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class LocalTrustTokenFulfillerFulfillTrustTokenIssuanceResponseParamsProxyToResponder implements LocalTrustTokenFulfiller.FulfillTrustTokenIssuanceResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        LocalTrustTokenFulfillerFulfillTrustTokenIssuanceResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(FulfillTrustTokenIssuanceAnswer answer) {
            LocalTrustTokenFulfillerFulfillTrustTokenIssuanceResponseParams _response = new LocalTrustTokenFulfillerFulfillTrustTokenIssuanceResponseParams();
            _response.answer = answer;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
