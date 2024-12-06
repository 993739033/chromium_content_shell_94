package org.chromium.handwriting.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.handwriting.mojom.HandwritingRecognitionService;
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
class HandwritingRecognitionService_Internal {
    private static final int CREATE_HANDWRITING_RECOGNIZER_ORDINAL = 0;
    public static final Interface.Manager<HandwritingRecognitionService, HandwritingRecognitionService.Proxy> MANAGER = new Interface.Manager<HandwritingRecognitionService, HandwritingRecognitionService.Proxy>() { // from class: org.chromium.handwriting.mojom.HandwritingRecognitionService_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "handwriting.mojom.HandwritingRecognitionService";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public HandwritingRecognitionService.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, HandwritingRecognitionService impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public HandwritingRecognitionService[] buildArray(int size) {
            return new HandwritingRecognitionService[size];
        }
    };
    private static final int QUERY_HANDWRITING_RECOGNIZER_SUPPORT_ORDINAL = 1;

    HandwritingRecognitionService_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements HandwritingRecognitionService.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.handwriting.mojom.HandwritingRecognitionService
        public void createHandwritingRecognizer(HandwritingModelConstraint constraint, CreateHandwritingRecognizerResponse callback) {
            HandwritingRecognitionServiceCreateHandwritingRecognizerParams _message = new HandwritingRecognitionServiceCreateHandwritingRecognizerParams();
            _message.constraint = constraint;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new HandwritingRecognitionServiceCreateHandwritingRecognizerResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.handwriting.mojom.HandwritingRecognitionService
        public void queryHandwritingRecognizerSupport(HandwritingFeatureQuery query, QueryHandwritingRecognizerSupportResponse callback) {
            HandwritingRecognitionServiceQueryHandwritingRecognizerSupportParams _message = new HandwritingRecognitionServiceQueryHandwritingRecognizerSupportParams();
            _message.query = query;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1, 1, 0L)), new HandwritingRecognitionServiceQueryHandwritingRecognizerSupportResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<HandwritingRecognitionService> {
        Stub(Core core, HandwritingRecognitionService impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(HandwritingRecognitionService_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), HandwritingRecognitionService_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        HandwritingRecognitionServiceCreateHandwritingRecognizerParams data = HandwritingRecognitionServiceCreateHandwritingRecognizerParams.deserialize(messageWithHeader.getPayload());
                        getImpl().createHandwritingRecognizer(data.constraint, new HandwritingRecognitionServiceCreateHandwritingRecognizerResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 1:
                        HandwritingRecognitionServiceQueryHandwritingRecognizerSupportParams data2 = HandwritingRecognitionServiceQueryHandwritingRecognizerSupportParams.deserialize(messageWithHeader.getPayload());
                        getImpl().queryHandwritingRecognizerSupport(data2.query, new HandwritingRecognitionServiceQueryHandwritingRecognizerSupportResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class HandwritingRecognitionServiceCreateHandwritingRecognizerParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public HandwritingModelConstraint constraint;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private HandwritingRecognitionServiceCreateHandwritingRecognizerParams(int version) {
            super(16, version);
        }

        public HandwritingRecognitionServiceCreateHandwritingRecognizerParams() {
            this(0);
        }

        public static HandwritingRecognitionServiceCreateHandwritingRecognizerParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static HandwritingRecognitionServiceCreateHandwritingRecognizerParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static HandwritingRecognitionServiceCreateHandwritingRecognizerParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                HandwritingRecognitionServiceCreateHandwritingRecognizerParams result = new HandwritingRecognitionServiceCreateHandwritingRecognizerParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.constraint = HandwritingModelConstraint.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.constraint, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class HandwritingRecognitionServiceCreateHandwritingRecognizerResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public HandwritingRecognizer handwritingRecognizer;
        public int result;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private HandwritingRecognitionServiceCreateHandwritingRecognizerResponseParams(int version) {
            super(24, version);
        }

        public HandwritingRecognitionServiceCreateHandwritingRecognizerResponseParams() {
            this(0);
        }

        public static HandwritingRecognitionServiceCreateHandwritingRecognizerResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static HandwritingRecognitionServiceCreateHandwritingRecognizerResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static HandwritingRecognitionServiceCreateHandwritingRecognizerResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                HandwritingRecognitionServiceCreateHandwritingRecognizerResponseParams result = new HandwritingRecognitionServiceCreateHandwritingRecognizerResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.result = readInt;
                CreateHandwritingRecognizerResult.validate(readInt);
                result.result = CreateHandwritingRecognizerResult.toKnownValue(result.result);
                result.handwritingRecognizer = (HandwritingRecognizer) decoder0.readServiceInterface(12, true, HandwritingRecognizer.MANAGER);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.result, 8);
            encoder0.encode(this.handwritingRecognizer, 12, true,HandwritingRecognizer.MANAGER);
        }
    }

    /* loaded from: classes2.dex */
    static class HandwritingRecognitionServiceCreateHandwritingRecognizerResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final HandwritingRecognitionService.CreateHandwritingRecognizerResponse mCallback;

        HandwritingRecognitionServiceCreateHandwritingRecognizerResponseParamsForwardToCallback(HandwritingRecognitionService.CreateHandwritingRecognizerResponse callback) {
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
                HandwritingRecognitionServiceCreateHandwritingRecognizerResponseParams response = HandwritingRecognitionServiceCreateHandwritingRecognizerResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.result), response.handwritingRecognizer);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class HandwritingRecognitionServiceCreateHandwritingRecognizerResponseParamsProxyToResponder implements HandwritingRecognitionService.CreateHandwritingRecognizerResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        HandwritingRecognitionServiceCreateHandwritingRecognizerResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Integer result, HandwritingRecognizer handwritingRecognizer) {
            HandwritingRecognitionServiceCreateHandwritingRecognizerResponseParams _response = new HandwritingRecognitionServiceCreateHandwritingRecognizerResponseParams();
            _response.result = result.intValue();
            _response.handwritingRecognizer = handwritingRecognizer;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class HandwritingRecognitionServiceQueryHandwritingRecognizerSupportParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public HandwritingFeatureQuery query;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private HandwritingRecognitionServiceQueryHandwritingRecognizerSupportParams(int version) {
            super(16, version);
        }

        public HandwritingRecognitionServiceQueryHandwritingRecognizerSupportParams() {
            this(0);
        }

        public static HandwritingRecognitionServiceQueryHandwritingRecognizerSupportParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static HandwritingRecognitionServiceQueryHandwritingRecognizerSupportParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static HandwritingRecognitionServiceQueryHandwritingRecognizerSupportParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                HandwritingRecognitionServiceQueryHandwritingRecognizerSupportParams result = new HandwritingRecognitionServiceQueryHandwritingRecognizerSupportParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.query = HandwritingFeatureQuery.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.query, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class HandwritingRecognitionServiceQueryHandwritingRecognizerSupportResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public HandwritingFeatureQueryResult result;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private HandwritingRecognitionServiceQueryHandwritingRecognizerSupportResponseParams(int version) {
            super(16, version);
        }

        public HandwritingRecognitionServiceQueryHandwritingRecognizerSupportResponseParams() {
            this(0);
        }

        public static HandwritingRecognitionServiceQueryHandwritingRecognizerSupportResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static HandwritingRecognitionServiceQueryHandwritingRecognizerSupportResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static HandwritingRecognitionServiceQueryHandwritingRecognizerSupportResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                HandwritingRecognitionServiceQueryHandwritingRecognizerSupportResponseParams result = new HandwritingRecognitionServiceQueryHandwritingRecognizerSupportResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, true);
                result.result = HandwritingFeatureQueryResult.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.result, 8, true);
        }
    }

    /* loaded from: classes2.dex */
    static class HandwritingRecognitionServiceQueryHandwritingRecognizerSupportResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final HandwritingRecognitionService.QueryHandwritingRecognizerSupportResponse mCallback;

        HandwritingRecognitionServiceQueryHandwritingRecognizerSupportResponseParamsForwardToCallback(HandwritingRecognitionService.QueryHandwritingRecognizerSupportResponse callback) {
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
                HandwritingRecognitionServiceQueryHandwritingRecognizerSupportResponseParams response = HandwritingRecognitionServiceQueryHandwritingRecognizerSupportResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.result);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class HandwritingRecognitionServiceQueryHandwritingRecognizerSupportResponseParamsProxyToResponder implements HandwritingRecognitionService.QueryHandwritingRecognizerSupportResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        HandwritingRecognitionServiceQueryHandwritingRecognizerSupportResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(HandwritingFeatureQueryResult result) {
            HandwritingRecognitionServiceQueryHandwritingRecognizerSupportResponseParams _response = new HandwritingRecognitionServiceQueryHandwritingRecognizerSupportResponseParams();
            _response.result = result;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(1, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
