package org.chromium.media.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.media.mojom.AudioDecoderClient;
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
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo.system.Core;
/* loaded from: classes2.dex */
class AudioDecoderClient_Internal {
    public static final Interface.Manager<AudioDecoderClient, AudioDecoderClient.Proxy> MANAGER = new Interface.Manager<AudioDecoderClient, AudioDecoderClient.Proxy>() { // from class: org.chromium.media.mojom.AudioDecoderClient_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "media.mojom.AudioDecoderClient";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public AudioDecoderClient.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, AudioDecoderClient impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public AudioDecoderClient[] buildArray(int size) {
            return new AudioDecoderClient[size];
        }
    };
    private static final int ON_BUFFER_DECODED_ORDINAL = 0;
    private static final int ON_WAITING_ORDINAL = 1;

    AudioDecoderClient_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements AudioDecoderClient.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.media.mojom.AudioDecoderClient
        public void onBufferDecoded(AudioBuffer buffer) {
            AudioDecoderClientOnBufferDecodedParams _message = new AudioDecoderClientOnBufferDecodedParams();
            _message.buffer = buffer;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }

        @Override // org.chromium.media.mojom.AudioDecoderClient
        public void onWaiting(int reason) {
            AudioDecoderClientOnWaitingParams _message = new AudioDecoderClientOnWaitingParams();
            _message.reason = reason;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<AudioDecoderClient> {
        Stub(Core core, AudioDecoderClient impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(AudioDecoderClient_Internal.MANAGER, messageWithHeader);
                    case -1:
                    default:
                        return false;
                    case 0:
                        AudioDecoderClientOnBufferDecodedParams data = AudioDecoderClientOnBufferDecodedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onBufferDecoded(data.buffer);
                        return true;
                    case 1:
                        AudioDecoderClientOnWaitingParams data2 = AudioDecoderClientOnWaitingParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onWaiting(data2.reason);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), AudioDecoderClient_Internal.MANAGER, messageWithHeader, receiver);
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
    static final class AudioDecoderClientOnBufferDecodedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public AudioBuffer buffer;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private AudioDecoderClientOnBufferDecodedParams(int version) {
            super(16, version);
        }

        public AudioDecoderClientOnBufferDecodedParams() {
            this(0);
        }

        public static AudioDecoderClientOnBufferDecodedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static AudioDecoderClientOnBufferDecodedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static AudioDecoderClientOnBufferDecodedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                AudioDecoderClientOnBufferDecodedParams result = new AudioDecoderClientOnBufferDecodedParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.buffer = AudioBuffer.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.buffer, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class AudioDecoderClientOnWaitingParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int reason;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private AudioDecoderClientOnWaitingParams(int version) {
            super(16, version);
        }

        public AudioDecoderClientOnWaitingParams() {
            this(0);
        }

        public static AudioDecoderClientOnWaitingParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static AudioDecoderClientOnWaitingParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static AudioDecoderClientOnWaitingParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                AudioDecoderClientOnWaitingParams result = new AudioDecoderClientOnWaitingParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.reason = readInt;
                WaitingReason.validate(readInt);
                result.reason = WaitingReason.toKnownValue(result.reason);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.reason, 8);
        }
    }
}
