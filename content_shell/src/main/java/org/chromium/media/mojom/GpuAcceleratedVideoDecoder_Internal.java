package org.chromium.media.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.media.mojom.GpuAcceleratedVideoDecoder;
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
class GpuAcceleratedVideoDecoder_Internal {
    private static final int ASSIGN_PICTURE_BUFFERS_ORDINAL = 1;
    private static final int DECODE_ORDINAL = 0;
    private static final int FLUSH_ORDINAL = 3;
    public static final Interface.Manager<GpuAcceleratedVideoDecoder, GpuAcceleratedVideoDecoder.Proxy> MANAGER = new Interface.Manager<GpuAcceleratedVideoDecoder, GpuAcceleratedVideoDecoder.Proxy>() { // from class: org.chromium.media.mojom.GpuAcceleratedVideoDecoder_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "media.mojom.GpuAcceleratedVideoDecoder";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public GpuAcceleratedVideoDecoder.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, GpuAcceleratedVideoDecoder impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public GpuAcceleratedVideoDecoder[] buildArray(int size) {
            return new GpuAcceleratedVideoDecoder[size];
        }
    };
    private static final int RESET_ORDINAL = 4;
    private static final int REUSE_PICTURE_BUFFER_ORDINAL = 2;
    private static final int SET_OVERLAY_INFO_ORDINAL = 5;

    GpuAcceleratedVideoDecoder_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements GpuAcceleratedVideoDecoder.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.media.mojom.GpuAcceleratedVideoDecoder
        public void decode(BitstreamBuffer buffer) {
            GpuAcceleratedVideoDecoderDecodeParams _message = new GpuAcceleratedVideoDecoderDecodeParams();
            _message.buffer = buffer;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }

        @Override // org.chromium.media.mojom.GpuAcceleratedVideoDecoder
        public void assignPictureBuffers(PictureBufferAssignment[] assignments) {
            GpuAcceleratedVideoDecoderAssignPictureBuffersParams _message = new GpuAcceleratedVideoDecoderAssignPictureBuffersParams();
            _message.assignments = assignments;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1)));
        }

        @Override // org.chromium.media.mojom.GpuAcceleratedVideoDecoder
        public void reusePictureBuffer(int pictureBufferId) {
            GpuAcceleratedVideoDecoderReusePictureBufferParams _message = new GpuAcceleratedVideoDecoderReusePictureBufferParams();
            _message.pictureBufferId = pictureBufferId;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2)));
        }

        @Override // org.chromium.media.mojom.GpuAcceleratedVideoDecoder
        public void flush(FlushResponse callback) {
            GpuAcceleratedVideoDecoderFlushParams _message = new GpuAcceleratedVideoDecoderFlushParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3, 1, 0L)), new GpuAcceleratedVideoDecoderFlushResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.media.mojom.GpuAcceleratedVideoDecoder
        public void reset(ResetResponse callback) {
            GpuAcceleratedVideoDecoderResetParams _message = new GpuAcceleratedVideoDecoderResetParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(4, 1, 0L)), new GpuAcceleratedVideoDecoderResetResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.media.mojom.GpuAcceleratedVideoDecoder
        public void setOverlayInfo(OverlayInfo overlayInfo) {
            GpuAcceleratedVideoDecoderSetOverlayInfoParams _message = new GpuAcceleratedVideoDecoderSetOverlayInfoParams();
            _message.overlayInfo = overlayInfo;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(5)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<GpuAcceleratedVideoDecoder> {
        Stub(Core core, GpuAcceleratedVideoDecoder impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(GpuAcceleratedVideoDecoder_Internal.MANAGER, messageWithHeader);
                    case -1:
                    case 3:
                    case 4:
                    default:
                        return false;
                    case 0:
                        GpuAcceleratedVideoDecoderDecodeParams data = GpuAcceleratedVideoDecoderDecodeParams.deserialize(messageWithHeader.getPayload());
                        getImpl().decode(data.buffer);
                        return true;
                    case 1:
                        GpuAcceleratedVideoDecoderAssignPictureBuffersParams data2 = GpuAcceleratedVideoDecoderAssignPictureBuffersParams.deserialize(messageWithHeader.getPayload());
                        getImpl().assignPictureBuffers(data2.assignments);
                        return true;
                    case 2:
                        GpuAcceleratedVideoDecoderReusePictureBufferParams data3 = GpuAcceleratedVideoDecoderReusePictureBufferParams.deserialize(messageWithHeader.getPayload());
                        getImpl().reusePictureBuffer(data3.pictureBufferId);
                        return true;
                    case 5:
                        GpuAcceleratedVideoDecoderSetOverlayInfoParams data4 = GpuAcceleratedVideoDecoderSetOverlayInfoParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setOverlayInfo(data4.overlayInfo);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), GpuAcceleratedVideoDecoder_Internal.MANAGER, messageWithHeader, receiver);
                    case 3:
                        GpuAcceleratedVideoDecoderFlushParams.deserialize(messageWithHeader.getPayload());
                        getImpl().flush(new GpuAcceleratedVideoDecoderFlushResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 4:
                        GpuAcceleratedVideoDecoderResetParams.deserialize(messageWithHeader.getPayload());
                        getImpl().reset(new GpuAcceleratedVideoDecoderResetResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class GpuAcceleratedVideoDecoderDecodeParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public BitstreamBuffer buffer;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private GpuAcceleratedVideoDecoderDecodeParams(int version) {
            super(16, version);
        }

        public GpuAcceleratedVideoDecoderDecodeParams() {
            this(0);
        }

        public static GpuAcceleratedVideoDecoderDecodeParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static GpuAcceleratedVideoDecoderDecodeParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static GpuAcceleratedVideoDecoderDecodeParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                GpuAcceleratedVideoDecoderDecodeParams result = new GpuAcceleratedVideoDecoderDecodeParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.buffer = BitstreamBuffer.decode(decoder1);
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
    static final class GpuAcceleratedVideoDecoderAssignPictureBuffersParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public PictureBufferAssignment[] assignments;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private GpuAcceleratedVideoDecoderAssignPictureBuffersParams(int version) {
            super(16, version);
        }

        public GpuAcceleratedVideoDecoderAssignPictureBuffersParams() {
            this(0);
        }

        public static GpuAcceleratedVideoDecoderAssignPictureBuffersParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static GpuAcceleratedVideoDecoderAssignPictureBuffersParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static GpuAcceleratedVideoDecoderAssignPictureBuffersParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                GpuAcceleratedVideoDecoderAssignPictureBuffersParams result = new GpuAcceleratedVideoDecoderAssignPictureBuffersParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.assignments = new PictureBufferAssignment[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.assignments[i1] = PictureBufferAssignment.decode(decoder2);
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
            PictureBufferAssignment[] pictureBufferAssignmentArr = this.assignments;
            if (pictureBufferAssignmentArr == null) {
                encoder0.encodeNullPointer(8, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(pictureBufferAssignmentArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                PictureBufferAssignment[] pictureBufferAssignmentArr2 = this.assignments;
                if (i0 < pictureBufferAssignmentArr2.length) {
                    encoder1.encode((Struct) pictureBufferAssignmentArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class GpuAcceleratedVideoDecoderReusePictureBufferParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int pictureBufferId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private GpuAcceleratedVideoDecoderReusePictureBufferParams(int version) {
            super(16, version);
        }

        public GpuAcceleratedVideoDecoderReusePictureBufferParams() {
            this(0);
        }

        public static GpuAcceleratedVideoDecoderReusePictureBufferParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static GpuAcceleratedVideoDecoderReusePictureBufferParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static GpuAcceleratedVideoDecoderReusePictureBufferParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                GpuAcceleratedVideoDecoderReusePictureBufferParams result = new GpuAcceleratedVideoDecoderReusePictureBufferParams(elementsOrVersion);
                result.pictureBufferId = decoder0.readInt(8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.pictureBufferId, 8);
        }
    }

    /* loaded from: classes2.dex */
    static final class GpuAcceleratedVideoDecoderFlushParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private GpuAcceleratedVideoDecoderFlushParams(int version) {
            super(8, version);
        }

        public GpuAcceleratedVideoDecoderFlushParams() {
            this(0);
        }

        public static GpuAcceleratedVideoDecoderFlushParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static GpuAcceleratedVideoDecoderFlushParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static GpuAcceleratedVideoDecoderFlushParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                GpuAcceleratedVideoDecoderFlushParams result = new GpuAcceleratedVideoDecoderFlushParams(elementsOrVersion);
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
    static final class GpuAcceleratedVideoDecoderFlushResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private GpuAcceleratedVideoDecoderFlushResponseParams(int version) {
            super(8, version);
        }

        public GpuAcceleratedVideoDecoderFlushResponseParams() {
            this(0);
        }

        public static GpuAcceleratedVideoDecoderFlushResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static GpuAcceleratedVideoDecoderFlushResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static GpuAcceleratedVideoDecoderFlushResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                GpuAcceleratedVideoDecoderFlushResponseParams result = new GpuAcceleratedVideoDecoderFlushResponseParams(elementsOrVersion);
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
    static class GpuAcceleratedVideoDecoderFlushResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final GpuAcceleratedVideoDecoder.FlushResponse mCallback;

        GpuAcceleratedVideoDecoderFlushResponseParamsForwardToCallback(GpuAcceleratedVideoDecoder.FlushResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(3, 2)) {
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
    static class GpuAcceleratedVideoDecoderFlushResponseParamsProxyToResponder implements GpuAcceleratedVideoDecoder.FlushResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        GpuAcceleratedVideoDecoderFlushResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            GpuAcceleratedVideoDecoderFlushResponseParams _response = new GpuAcceleratedVideoDecoderFlushResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(3, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class GpuAcceleratedVideoDecoderResetParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private GpuAcceleratedVideoDecoderResetParams(int version) {
            super(8, version);
        }

        public GpuAcceleratedVideoDecoderResetParams() {
            this(0);
        }

        public static GpuAcceleratedVideoDecoderResetParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static GpuAcceleratedVideoDecoderResetParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static GpuAcceleratedVideoDecoderResetParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                GpuAcceleratedVideoDecoderResetParams result = new GpuAcceleratedVideoDecoderResetParams(elementsOrVersion);
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
    static final class GpuAcceleratedVideoDecoderResetResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private GpuAcceleratedVideoDecoderResetResponseParams(int version) {
            super(8, version);
        }

        public GpuAcceleratedVideoDecoderResetResponseParams() {
            this(0);
        }

        public static GpuAcceleratedVideoDecoderResetResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static GpuAcceleratedVideoDecoderResetResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static GpuAcceleratedVideoDecoderResetResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                GpuAcceleratedVideoDecoderResetResponseParams result = new GpuAcceleratedVideoDecoderResetResponseParams(elementsOrVersion);
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
    static class GpuAcceleratedVideoDecoderResetResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final GpuAcceleratedVideoDecoder.ResetResponse mCallback;

        GpuAcceleratedVideoDecoderResetResponseParamsForwardToCallback(GpuAcceleratedVideoDecoder.ResetResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(4, 2)) {
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
    static class GpuAcceleratedVideoDecoderResetResponseParamsProxyToResponder implements GpuAcceleratedVideoDecoder.ResetResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        GpuAcceleratedVideoDecoderResetResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            GpuAcceleratedVideoDecoderResetResponseParams _response = new GpuAcceleratedVideoDecoderResetResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(4, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class GpuAcceleratedVideoDecoderSetOverlayInfoParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public OverlayInfo overlayInfo;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private GpuAcceleratedVideoDecoderSetOverlayInfoParams(int version) {
            super(16, version);
        }

        public GpuAcceleratedVideoDecoderSetOverlayInfoParams() {
            this(0);
        }

        public static GpuAcceleratedVideoDecoderSetOverlayInfoParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static GpuAcceleratedVideoDecoderSetOverlayInfoParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static GpuAcceleratedVideoDecoderSetOverlayInfoParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                GpuAcceleratedVideoDecoderSetOverlayInfoParams result = new GpuAcceleratedVideoDecoderSetOverlayInfoParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.overlayInfo = OverlayInfo.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.overlayInfo, 8, false);
        }
    }
}
