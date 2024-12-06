package org.chromium.handwriting.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.handwriting.mojom.HandwritingRecognizer;
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
class HandwritingRecognizer_Internal {
    private static final int GET_PREDICTION_ORDINAL = 0;
    public static final Interface.Manager<HandwritingRecognizer, HandwritingRecognizer.Proxy> MANAGER = new Interface.Manager<HandwritingRecognizer, HandwritingRecognizer.Proxy>() { // from class: org.chromium.handwriting.mojom.HandwritingRecognizer_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "handwriting.mojom.HandwritingRecognizer";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public HandwritingRecognizer.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, HandwritingRecognizer impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public HandwritingRecognizer[] buildArray(int size) {
            return new HandwritingRecognizer[size];
        }
    };

    HandwritingRecognizer_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements HandwritingRecognizer.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.handwriting.mojom.HandwritingRecognizer
        public void getPrediction(HandwritingStroke[] strokes, HandwritingHints hints, GetPredictionResponse callback) {
            HandwritingRecognizerGetPredictionParams _message = new HandwritingRecognizerGetPredictionParams();
            _message.strokes = strokes;
            _message.hints = hints;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new HandwritingRecognizerGetPredictionResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<HandwritingRecognizer> {
        Stub(Core core, HandwritingRecognizer impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(HandwritingRecognizer_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), HandwritingRecognizer_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        HandwritingRecognizerGetPredictionParams data = HandwritingRecognizerGetPredictionParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getPrediction(data.strokes, data.hints, new HandwritingRecognizerGetPredictionResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class HandwritingRecognizerGetPredictionParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public HandwritingHints hints;
        public HandwritingStroke[] strokes;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private HandwritingRecognizerGetPredictionParams(int version) {
            super(24, version);
        }

        public HandwritingRecognizerGetPredictionParams() {
            this(0);
        }

        public static HandwritingRecognizerGetPredictionParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static HandwritingRecognizerGetPredictionParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static HandwritingRecognizerGetPredictionParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                HandwritingRecognizerGetPredictionParams result = new HandwritingRecognizerGetPredictionParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.strokes = new HandwritingStroke[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.strokes[i1] = HandwritingStroke.decode(decoder2);
                }
                result.hints = HandwritingHints.decode(decoder0.readPointer(16, false));
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            HandwritingStroke[] handwritingStrokeArr = this.strokes;
            if (handwritingStrokeArr == null) {
                encoder0.encodeNullPointer(8, false);
            } else {
                Encoder encoder1 = encoder0.encodePointerArray(handwritingStrokeArr.length, 8, -1);
                int i0 = 0;
                while (true) {
                    HandwritingStroke[] handwritingStrokeArr2 = this.strokes;
                    if (i0 >= handwritingStrokeArr2.length) {
                        break;
                    }
                    encoder1.encode((Struct) handwritingStrokeArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                }
            }
            encoder0.encode((Struct) this.hints, 16, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class HandwritingRecognizerGetPredictionResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public HandwritingPrediction[] prediction;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private HandwritingRecognizerGetPredictionResponseParams(int version) {
            super(16, version);
        }

        public HandwritingRecognizerGetPredictionResponseParams() {
            this(0);
        }

        public static HandwritingRecognizerGetPredictionResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static HandwritingRecognizerGetPredictionResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static HandwritingRecognizerGetPredictionResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                HandwritingRecognizerGetPredictionResponseParams result = new HandwritingRecognizerGetPredictionResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, true);
                if (decoder1 == null) {
                    result.prediction = null;
                } else {
                    DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                    result.prediction = new HandwritingPrediction[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                        Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                        result.prediction[i1] = HandwritingPrediction.decode(decoder2);
                    }
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
            HandwritingPrediction[] handwritingPredictionArr = this.prediction;
            if (handwritingPredictionArr == null) {
                encoder0.encodeNullPointer(8, true);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(handwritingPredictionArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                HandwritingPrediction[] handwritingPredictionArr2 = this.prediction;
                if (i0 < handwritingPredictionArr2.length) {
                    encoder1.encode((Struct) handwritingPredictionArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static class HandwritingRecognizerGetPredictionResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final HandwritingRecognizer.GetPredictionResponse mCallback;

        HandwritingRecognizerGetPredictionResponseParamsForwardToCallback(HandwritingRecognizer.GetPredictionResponse callback) {
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
                HandwritingRecognizerGetPredictionResponseParams response = HandwritingRecognizerGetPredictionResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.prediction);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class HandwritingRecognizerGetPredictionResponseParamsProxyToResponder implements HandwritingRecognizer.GetPredictionResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        HandwritingRecognizerGetPredictionResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(HandwritingPrediction[] prediction) {
            HandwritingRecognizerGetPredictionResponseParams _response = new HandwritingRecognizerGetPredictionResponseParams();
            _response.prediction = prediction;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
