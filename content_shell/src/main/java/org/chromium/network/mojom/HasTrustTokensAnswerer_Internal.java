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
import org.chromium.network.mojom.HasTrustTokensAnswerer;
import org.chromium.url.internal.mojom.Origin;
/* loaded from: classes2.dex */
class HasTrustTokensAnswerer_Internal {
    private static final int HAS_TRUST_TOKENS_ORDINAL = 0;
    public static final Interface.Manager<HasTrustTokensAnswerer, HasTrustTokensAnswerer.Proxy> MANAGER = new Interface.Manager<HasTrustTokensAnswerer, HasTrustTokensAnswerer.Proxy>() { // from class: org.chromium.network.mojom.HasTrustTokensAnswerer_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "network.mojom.HasTrustTokensAnswerer";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public HasTrustTokensAnswerer.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, HasTrustTokensAnswerer impl) {
            return new Stub(core, impl);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public HasTrustTokensAnswerer[] buildArray(int size) {
            return new HasTrustTokensAnswerer[size];
        }
    };

    HasTrustTokensAnswerer_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements HasTrustTokensAnswerer.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.network.mojom.HasTrustTokensAnswerer
        public void hasTrustTokens(Origin issuer, HasTrustTokensResponse callback) {
            HasTrustTokensAnswererHasTrustTokensParams _message = new HasTrustTokensAnswererHasTrustTokensParams();
            _message.issuer = issuer;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new HasTrustTokensAnswererHasTrustTokensResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<HasTrustTokensAnswerer> {
        Stub(Core core, HasTrustTokensAnswerer impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(HasTrustTokensAnswerer_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), HasTrustTokensAnswerer_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        HasTrustTokensAnswererHasTrustTokensParams data = HasTrustTokensAnswererHasTrustTokensParams.deserialize(messageWithHeader.getPayload());
                        getImpl().hasTrustTokens(data.issuer, new HasTrustTokensAnswererHasTrustTokensResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class HasTrustTokensAnswererHasTrustTokensParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public Origin issuer;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private HasTrustTokensAnswererHasTrustTokensParams(int version) {
            super(16, version);
        }

        public HasTrustTokensAnswererHasTrustTokensParams() {
            this(0);
        }

        public static HasTrustTokensAnswererHasTrustTokensParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static HasTrustTokensAnswererHasTrustTokensParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static HasTrustTokensAnswererHasTrustTokensParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                HasTrustTokensAnswererHasTrustTokensParams result = new HasTrustTokensAnswererHasTrustTokensParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.issuer = Origin.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.issuer, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class HasTrustTokensAnswererHasTrustTokensResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public HasTrustTokensResult result;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private HasTrustTokensAnswererHasTrustTokensResponseParams(int version) {
            super(16, version);
        }

        public HasTrustTokensAnswererHasTrustTokensResponseParams() {
            this(0);
        }

        public static HasTrustTokensAnswererHasTrustTokensResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static HasTrustTokensAnswererHasTrustTokensResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static HasTrustTokensAnswererHasTrustTokensResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                HasTrustTokensAnswererHasTrustTokensResponseParams result = new HasTrustTokensAnswererHasTrustTokensResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.result = HasTrustTokensResult.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.result, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static class HasTrustTokensAnswererHasTrustTokensResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final HasTrustTokensAnswerer.HasTrustTokensResponse mCallback;

        HasTrustTokensAnswererHasTrustTokensResponseParamsForwardToCallback(HasTrustTokensAnswerer.HasTrustTokensResponse callback) {
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
                HasTrustTokensAnswererHasTrustTokensResponseParams response = HasTrustTokensAnswererHasTrustTokensResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.result);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class HasTrustTokensAnswererHasTrustTokensResponseParamsProxyToResponder implements HasTrustTokensAnswerer.HasTrustTokensResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        HasTrustTokensAnswererHasTrustTokensResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(HasTrustTokensResult result) {
            HasTrustTokensAnswererHasTrustTokensResponseParams _response = new HasTrustTokensAnswererHasTrustTokensResponseParams();
            _response.result = result;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
