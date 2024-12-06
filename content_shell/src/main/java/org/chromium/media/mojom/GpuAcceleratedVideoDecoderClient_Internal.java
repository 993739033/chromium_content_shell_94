package org.chromium.media.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.gfx.mojom.Size;
import org.chromium.media.mojom.GpuAcceleratedVideoDecoderClient;
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
class GpuAcceleratedVideoDecoderClient_Internal {
    public static final Interface.Manager<GpuAcceleratedVideoDecoderClient, GpuAcceleratedVideoDecoderClient.Proxy> MANAGER = new Interface.Manager<GpuAcceleratedVideoDecoderClient, GpuAcceleratedVideoDecoderClient.Proxy>() { // from class: org.chromium.media.mojom.GpuAcceleratedVideoDecoderClient_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "media.mojom.GpuAcceleratedVideoDecoderClient";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public GpuAcceleratedVideoDecoderClient.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, GpuAcceleratedVideoDecoderClient impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public GpuAcceleratedVideoDecoderClient[] buildArray(int size) {
            return new GpuAcceleratedVideoDecoderClient[size];
        }
    };
    private static final int ON_BITSTREAM_BUFFER_PROCESSED_ORDINAL = 1;
    private static final int ON_DISMISS_PICTURE_BUFFER_ORDINAL = 4;
    private static final int ON_ERROR_ORDINAL = 5;
    private static final int ON_INITIALIZATION_COMPLETE_ORDINAL = 0;
    private static final int ON_PICTURE_READY_ORDINAL = 3;
    private static final int ON_PROVIDE_PICTURE_BUFFERS_ORDINAL = 2;

    GpuAcceleratedVideoDecoderClient_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements GpuAcceleratedVideoDecoderClient.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.media.mojom.GpuAcceleratedVideoDecoderClient
        public void onInitializationComplete(boolean success) {
            GpuAcceleratedVideoDecoderClientOnInitializationCompleteParams _message = new GpuAcceleratedVideoDecoderClientOnInitializationCompleteParams();
            _message.success = success;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }

        @Override // org.chromium.media.mojom.GpuAcceleratedVideoDecoderClient
        public void onBitstreamBufferProcessed(int bufferId) {
            GpuAcceleratedVideoDecoderClientOnBitstreamBufferProcessedParams _message = new GpuAcceleratedVideoDecoderClientOnBitstreamBufferProcessedParams();
            _message.bufferId = bufferId;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1)));
        }

        @Override // org.chromium.media.mojom.GpuAcceleratedVideoDecoderClient
        public void onProvidePictureBuffers(int numFrames, int format, int numTexturesPerFrame, Size bufferSize, int textureTarget) {
            GpuAcceleratedVideoDecoderClientOnProvidePictureBuffersParams _message = new GpuAcceleratedVideoDecoderClientOnProvidePictureBuffersParams();
            _message.numFrames = numFrames;
            _message.format = format;
            _message.numTexturesPerFrame = numTexturesPerFrame;
            _message.bufferSize = bufferSize;
            _message.textureTarget = textureTarget;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2)));
        }

        @Override // org.chromium.media.mojom.GpuAcceleratedVideoDecoderClient
        public void onPictureReady(PictureReadyParams params) {
            GpuAcceleratedVideoDecoderClientOnPictureReadyParams _message = new GpuAcceleratedVideoDecoderClientOnPictureReadyParams();
            _message.params = params;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3)));
        }

        @Override // org.chromium.media.mojom.GpuAcceleratedVideoDecoderClient
        public void onDismissPictureBuffer(int bufferId) {
            GpuAcceleratedVideoDecoderClientOnDismissPictureBufferParams _message = new GpuAcceleratedVideoDecoderClientOnDismissPictureBufferParams();
            _message.bufferId = bufferId;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(4)));
        }

        @Override // org.chromium.media.mojom.GpuAcceleratedVideoDecoderClient
        public void onError(int errorId) {
            GpuAcceleratedVideoDecoderClientOnErrorParams _message = new GpuAcceleratedVideoDecoderClientOnErrorParams();
            _message.errorId = errorId;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(5)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<GpuAcceleratedVideoDecoderClient> {
        Stub(Core core, GpuAcceleratedVideoDecoderClient impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(GpuAcceleratedVideoDecoderClient_Internal.MANAGER, messageWithHeader);
                    case -1:
                    default:
                        return false;
                    case 0:
                        GpuAcceleratedVideoDecoderClientOnInitializationCompleteParams data = GpuAcceleratedVideoDecoderClientOnInitializationCompleteParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onInitializationComplete(data.success);
                        return true;
                    case 1:
                        GpuAcceleratedVideoDecoderClientOnBitstreamBufferProcessedParams data2 = GpuAcceleratedVideoDecoderClientOnBitstreamBufferProcessedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onBitstreamBufferProcessed(data2.bufferId);
                        return true;
                    case 2:
                        GpuAcceleratedVideoDecoderClientOnProvidePictureBuffersParams data3 = GpuAcceleratedVideoDecoderClientOnProvidePictureBuffersParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onProvidePictureBuffers(data3.numFrames, data3.format, data3.numTexturesPerFrame, data3.bufferSize, data3.textureTarget);
                        return true;
                    case 3:
                        GpuAcceleratedVideoDecoderClientOnPictureReadyParams data4 = GpuAcceleratedVideoDecoderClientOnPictureReadyParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onPictureReady(data4.params);
                        return true;
                    case 4:
                        GpuAcceleratedVideoDecoderClientOnDismissPictureBufferParams data5 = GpuAcceleratedVideoDecoderClientOnDismissPictureBufferParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onDismissPictureBuffer(data5.bufferId);
                        return true;
                    case 5:
                        GpuAcceleratedVideoDecoderClientOnErrorParams data6 = GpuAcceleratedVideoDecoderClientOnErrorParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onError(data6.errorId);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), GpuAcceleratedVideoDecoderClient_Internal.MANAGER, messageWithHeader, receiver);
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
    static final class GpuAcceleratedVideoDecoderClientOnInitializationCompleteParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private GpuAcceleratedVideoDecoderClientOnInitializationCompleteParams(int version) {
            super(16, version);
        }

        public GpuAcceleratedVideoDecoderClientOnInitializationCompleteParams() {
            this(0);
        }

        public static GpuAcceleratedVideoDecoderClientOnInitializationCompleteParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static GpuAcceleratedVideoDecoderClientOnInitializationCompleteParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static GpuAcceleratedVideoDecoderClientOnInitializationCompleteParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                GpuAcceleratedVideoDecoderClientOnInitializationCompleteParams result = new GpuAcceleratedVideoDecoderClientOnInitializationCompleteParams(elementsOrVersion);
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
    static final class GpuAcceleratedVideoDecoderClientOnBitstreamBufferProcessedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int bufferId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private GpuAcceleratedVideoDecoderClientOnBitstreamBufferProcessedParams(int version) {
            super(16, version);
        }

        public GpuAcceleratedVideoDecoderClientOnBitstreamBufferProcessedParams() {
            this(0);
        }

        public static GpuAcceleratedVideoDecoderClientOnBitstreamBufferProcessedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static GpuAcceleratedVideoDecoderClientOnBitstreamBufferProcessedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static GpuAcceleratedVideoDecoderClientOnBitstreamBufferProcessedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                GpuAcceleratedVideoDecoderClientOnBitstreamBufferProcessedParams result = new GpuAcceleratedVideoDecoderClientOnBitstreamBufferProcessedParams(elementsOrVersion);
                result.bufferId = decoder0.readInt(8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.bufferId, 8);
        }
    }

    /* loaded from: classes2.dex */
    static final class GpuAcceleratedVideoDecoderClientOnProvidePictureBuffersParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public Size bufferSize;
        public int format;
        public int numFrames;
        public int numTexturesPerFrame;
        public int textureTarget;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private GpuAcceleratedVideoDecoderClientOnProvidePictureBuffersParams(int version) {
            super(32, version);
        }

        public GpuAcceleratedVideoDecoderClientOnProvidePictureBuffersParams() {
            this(0);
        }

        public static GpuAcceleratedVideoDecoderClientOnProvidePictureBuffersParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static GpuAcceleratedVideoDecoderClientOnProvidePictureBuffersParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static GpuAcceleratedVideoDecoderClientOnProvidePictureBuffersParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                GpuAcceleratedVideoDecoderClientOnProvidePictureBuffersParams result = new GpuAcceleratedVideoDecoderClientOnProvidePictureBuffersParams(elementsOrVersion);
                result.numFrames = decoder0.readInt(8);
                int readInt = decoder0.readInt(12);
                result.format = readInt;
                VideoPixelFormat.validate(readInt);
                result.format = VideoPixelFormat.toKnownValue(result.format);
                result.numTexturesPerFrame = decoder0.readInt(16);
                result.textureTarget = decoder0.readInt(20);
                Decoder decoder1 = decoder0.readPointer(24, false);
                result.bufferSize = Size.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.numFrames, 8);
            encoder0.encode(this.format, 12);
            encoder0.encode(this.numTexturesPerFrame, 16);
            encoder0.encode(this.textureTarget, 20);
            encoder0.encode((Struct) this.bufferSize, 24, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class GpuAcceleratedVideoDecoderClientOnPictureReadyParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public PictureReadyParams params;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private GpuAcceleratedVideoDecoderClientOnPictureReadyParams(int version) {
            super(16, version);
        }

        public GpuAcceleratedVideoDecoderClientOnPictureReadyParams() {
            this(0);
        }

        public static GpuAcceleratedVideoDecoderClientOnPictureReadyParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static GpuAcceleratedVideoDecoderClientOnPictureReadyParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static GpuAcceleratedVideoDecoderClientOnPictureReadyParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                GpuAcceleratedVideoDecoderClientOnPictureReadyParams result = new GpuAcceleratedVideoDecoderClientOnPictureReadyParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.params = PictureReadyParams.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.params, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class GpuAcceleratedVideoDecoderClientOnDismissPictureBufferParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int bufferId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private GpuAcceleratedVideoDecoderClientOnDismissPictureBufferParams(int version) {
            super(16, version);
        }

        public GpuAcceleratedVideoDecoderClientOnDismissPictureBufferParams() {
            this(0);
        }

        public static GpuAcceleratedVideoDecoderClientOnDismissPictureBufferParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static GpuAcceleratedVideoDecoderClientOnDismissPictureBufferParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static GpuAcceleratedVideoDecoderClientOnDismissPictureBufferParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                GpuAcceleratedVideoDecoderClientOnDismissPictureBufferParams result = new GpuAcceleratedVideoDecoderClientOnDismissPictureBufferParams(elementsOrVersion);
                result.bufferId = decoder0.readInt(8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.bufferId, 8);
        }
    }

    /* loaded from: classes2.dex */
    static final class GpuAcceleratedVideoDecoderClientOnErrorParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int errorId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private GpuAcceleratedVideoDecoderClientOnErrorParams(int version) {
            super(16, version);
        }

        public GpuAcceleratedVideoDecoderClientOnErrorParams() {
            this(0);
        }

        public static GpuAcceleratedVideoDecoderClientOnErrorParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static GpuAcceleratedVideoDecoderClientOnErrorParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static GpuAcceleratedVideoDecoderClientOnErrorParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                GpuAcceleratedVideoDecoderClientOnErrorParams result = new GpuAcceleratedVideoDecoderClientOnErrorParams(elementsOrVersion);
                result.errorId = decoder0.readInt(8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.errorId, 8);
        }
    }
}
