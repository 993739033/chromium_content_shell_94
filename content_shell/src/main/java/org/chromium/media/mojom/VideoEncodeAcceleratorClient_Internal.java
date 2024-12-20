package org.chromium.media.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.gfx.mojom.Size;
import org.chromium.media.mojom.VideoEncodeAccelerator;
import org.chromium.media.mojom.VideoEncodeAcceleratorClient;
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
class VideoEncodeAcceleratorClient_Internal {
    private static final int BITSTREAM_BUFFER_READY_ORDINAL = 1;
    public static final Interface.Manager<VideoEncodeAcceleratorClient, VideoEncodeAcceleratorClient.Proxy> MANAGER = new Interface.Manager<VideoEncodeAcceleratorClient, VideoEncodeAcceleratorClient.Proxy>() { // from class: org.chromium.media.mojom.VideoEncodeAcceleratorClient_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "media.mojom.VideoEncodeAcceleratorClient";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public VideoEncodeAcceleratorClient.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, VideoEncodeAcceleratorClient impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public VideoEncodeAcceleratorClient[] buildArray(int size) {
            return new VideoEncodeAcceleratorClient[size];
        }
    };
    private static final int NOTIFY_ENCODER_INFO_CHANGE_ORDINAL = 3;
    private static final int NOTIFY_ERROR_ORDINAL = 2;
    private static final int REQUIRE_BITSTREAM_BUFFERS_ORDINAL = 0;

    VideoEncodeAcceleratorClient_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements VideoEncodeAcceleratorClient.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.media.mojom.VideoEncodeAcceleratorClient
        public void requireBitstreamBuffers(int inputCount, Size inputCodedSize, int outputBufferSize) {
            VideoEncodeAcceleratorClientRequireBitstreamBuffersParams _message = new VideoEncodeAcceleratorClientRequireBitstreamBuffersParams();
            _message.inputCount = inputCount;
            _message.inputCodedSize = inputCodedSize;
            _message.outputBufferSize = outputBufferSize;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }

        @Override // org.chromium.media.mojom.VideoEncodeAcceleratorClient
        public void bitstreamBufferReady(int bitstreamBufferId, BitstreamBufferMetadata metadata) {
            VideoEncodeAcceleratorClientBitstreamBufferReadyParams _message = new VideoEncodeAcceleratorClientBitstreamBufferReadyParams();
            _message.bitstreamBufferId = bitstreamBufferId;
            _message.metadata = metadata;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1)));
        }

        @Override // org.chromium.media.mojom.VideoEncodeAcceleratorClient
        public void notifyError(int error) {
            VideoEncodeAcceleratorClientNotifyErrorParams _message = new VideoEncodeAcceleratorClientNotifyErrorParams();
            _message.error = error;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2)));
        }

        @Override // org.chromium.media.mojom.VideoEncodeAcceleratorClient
        public void notifyEncoderInfoChange(VideoEncoderInfo info) {
            VideoEncodeAcceleratorClientNotifyEncoderInfoChangeParams _message = new VideoEncodeAcceleratorClientNotifyEncoderInfoChangeParams();
            _message.info = info;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<VideoEncodeAcceleratorClient> {
        Stub(Core core, VideoEncodeAcceleratorClient impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(VideoEncodeAcceleratorClient_Internal.MANAGER, messageWithHeader);
                    case -1:
                    default:
                        return false;
                    case 0:
                        VideoEncodeAcceleratorClientRequireBitstreamBuffersParams data = VideoEncodeAcceleratorClientRequireBitstreamBuffersParams.deserialize(messageWithHeader.getPayload());
                        getImpl().requireBitstreamBuffers(data.inputCount, data.inputCodedSize, data.outputBufferSize);
                        return true;
                    case 1:
                        VideoEncodeAcceleratorClientBitstreamBufferReadyParams data2 = VideoEncodeAcceleratorClientBitstreamBufferReadyParams.deserialize(messageWithHeader.getPayload());
                        getImpl().bitstreamBufferReady(data2.bitstreamBufferId, data2.metadata);
                        return true;
                    case 2:
                        getImpl().notifyError(VideoEncodeAcceleratorClientNotifyErrorParams.deserialize(messageWithHeader.getPayload()).error);
                        return true;
                    case 3:
                        getImpl().notifyEncoderInfoChange(VideoEncodeAcceleratorClientNotifyEncoderInfoChangeParams.deserialize(messageWithHeader.getPayload()).info);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), VideoEncodeAcceleratorClient_Internal.MANAGER, messageWithHeader, receiver);
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
    static final class VideoEncodeAcceleratorClientRequireBitstreamBuffersParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public Size inputCodedSize;
        public int inputCount;
        public int outputBufferSize;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private VideoEncodeAcceleratorClientRequireBitstreamBuffersParams(int version) {
            super(24, version);
        }

        public VideoEncodeAcceleratorClientRequireBitstreamBuffersParams() {
            this(0);
        }

        public static VideoEncodeAcceleratorClientRequireBitstreamBuffersParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static VideoEncodeAcceleratorClientRequireBitstreamBuffersParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static VideoEncodeAcceleratorClientRequireBitstreamBuffersParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                VideoEncodeAcceleratorClientRequireBitstreamBuffersParams result = new VideoEncodeAcceleratorClientRequireBitstreamBuffersParams(elementsOrVersion);
                result.inputCount = decoder0.readInt(8);
                result.outputBufferSize = decoder0.readInt(12);
                Decoder decoder1 = decoder0.readPointer(16, false);
                result.inputCodedSize = Size.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.inputCount, 8);
            encoder0.encode(this.outputBufferSize, 12);
            encoder0.encode((Struct) this.inputCodedSize, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class VideoEncodeAcceleratorClientBitstreamBufferReadyParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public int bitstreamBufferId;
        public BitstreamBufferMetadata metadata;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private VideoEncodeAcceleratorClientBitstreamBufferReadyParams(int version) {
            super(24, version);
        }

        public VideoEncodeAcceleratorClientBitstreamBufferReadyParams() {
            this(0);
        }

        public static VideoEncodeAcceleratorClientBitstreamBufferReadyParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static VideoEncodeAcceleratorClientBitstreamBufferReadyParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static VideoEncodeAcceleratorClientBitstreamBufferReadyParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                VideoEncodeAcceleratorClientBitstreamBufferReadyParams result = new VideoEncodeAcceleratorClientBitstreamBufferReadyParams(elementsOrVersion);
                result.bitstreamBufferId = decoder0.readInt(8);
                Decoder decoder1 = decoder0.readPointer(16, false);
                result.metadata = BitstreamBufferMetadata.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.bitstreamBufferId, 8);
            encoder0.encode((Struct) this.metadata, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class VideoEncodeAcceleratorClientNotifyErrorParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int error;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private VideoEncodeAcceleratorClientNotifyErrorParams(int version) {
            super(16, version);
        }

        public VideoEncodeAcceleratorClientNotifyErrorParams() {
            this(0);
        }

        public static VideoEncodeAcceleratorClientNotifyErrorParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static VideoEncodeAcceleratorClientNotifyErrorParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static VideoEncodeAcceleratorClientNotifyErrorParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                VideoEncodeAcceleratorClientNotifyErrorParams result = new VideoEncodeAcceleratorClientNotifyErrorParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.error = readInt;
                VideoEncodeAccelerator.Error.validate(readInt);
                result.error = VideoEncodeAccelerator.Error.toKnownValue(result.error);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.error, 8);
        }
    }

    /* loaded from: classes2.dex */
    static final class VideoEncodeAcceleratorClientNotifyEncoderInfoChangeParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public VideoEncoderInfo info;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private VideoEncodeAcceleratorClientNotifyEncoderInfoChangeParams(int version) {
            super(16, version);
        }

        public VideoEncodeAcceleratorClientNotifyEncoderInfoChangeParams() {
            this(0);
        }

        public static VideoEncodeAcceleratorClientNotifyEncoderInfoChangeParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static VideoEncodeAcceleratorClientNotifyEncoderInfoChangeParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static VideoEncodeAcceleratorClientNotifyEncoderInfoChangeParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                VideoEncodeAcceleratorClientNotifyEncoderInfoChangeParams result = new VideoEncodeAcceleratorClientNotifyEncoderInfoChangeParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.info = VideoEncoderInfo.decode(decoder1);
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
}
