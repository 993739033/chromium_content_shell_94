package org.chromium.media.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.media.mojom.VideoCaptureObserver;
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
import org.chromium.mojo.bindings.Union;
import org.chromium.mojo.system.Core;
/* loaded from: classes2.dex */
class VideoCaptureObserver_Internal {
    public static final Interface.Manager<VideoCaptureObserver, VideoCaptureObserver.Proxy> MANAGER = new Interface.Manager<VideoCaptureObserver, VideoCaptureObserver.Proxy>() { // from class: org.chromium.media.mojom.VideoCaptureObserver_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "media.mojom.VideoCaptureObserver";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public VideoCaptureObserver.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, VideoCaptureObserver impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public VideoCaptureObserver[] buildArray(int size) {
            return new VideoCaptureObserver[size];
        }
    };
    private static final int ON_BUFFER_DESTROYED_ORDINAL = 3;
    private static final int ON_BUFFER_READY_ORDINAL = 2;
    private static final int ON_NEW_BUFFER_ORDINAL = 1;
    private static final int ON_STATE_CHANGED_ORDINAL = 0;

    VideoCaptureObserver_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements VideoCaptureObserver.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.media.mojom.VideoCaptureObserver
        public void onStateChanged(int state) {
            VideoCaptureObserverOnStateChangedParams _message = new VideoCaptureObserverOnStateChangedParams();
            _message.state = state;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }

        @Override // org.chromium.media.mojom.VideoCaptureObserver
        public void onNewBuffer(int bufferId, VideoBufferHandle bufferHandle) {
            VideoCaptureObserverOnNewBufferParams _message = new VideoCaptureObserverOnNewBufferParams();
            _message.bufferId = bufferId;
            _message.bufferHandle = bufferHandle;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1)));
        }

        @Override // org.chromium.media.mojom.VideoCaptureObserver
        public void onBufferReady(ReadyBuffer buffer, ReadyBuffer[] scaledBuffers) {
            VideoCaptureObserverOnBufferReadyParams _message = new VideoCaptureObserverOnBufferReadyParams();
            _message.buffer = buffer;
            _message.scaledBuffers = scaledBuffers;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2)));
        }

        @Override // org.chromium.media.mojom.VideoCaptureObserver
        public void onBufferDestroyed(int bufferId) {
            VideoCaptureObserverOnBufferDestroyedParams _message = new VideoCaptureObserverOnBufferDestroyedParams();
            _message.bufferId = bufferId;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<VideoCaptureObserver> {
        Stub(Core core, VideoCaptureObserver impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(VideoCaptureObserver_Internal.MANAGER, messageWithHeader);
                    case -1:
                    default:
                        return false;
                    case 0:
                        getImpl().onStateChanged(VideoCaptureObserverOnStateChangedParams.deserialize(messageWithHeader.getPayload()).state);
                        return true;
                    case 1:
                        VideoCaptureObserverOnNewBufferParams data = VideoCaptureObserverOnNewBufferParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onNewBuffer(data.bufferId, data.bufferHandle);
                        return true;
                    case 2:
                        VideoCaptureObserverOnBufferReadyParams data2 = VideoCaptureObserverOnBufferReadyParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onBufferReady(data2.buffer, data2.scaledBuffers);
                        return true;
                    case 3:
                        VideoCaptureObserverOnBufferDestroyedParams data3 = VideoCaptureObserverOnBufferDestroyedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onBufferDestroyed(data3.bufferId);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), VideoCaptureObserver_Internal.MANAGER, messageWithHeader, receiver);
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
    static final class VideoCaptureObserverOnStateChangedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int state;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private VideoCaptureObserverOnStateChangedParams(int version) {
            super(16, version);
        }

        public VideoCaptureObserverOnStateChangedParams() {
            this(0);
        }

        public static VideoCaptureObserverOnStateChangedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static VideoCaptureObserverOnStateChangedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static VideoCaptureObserverOnStateChangedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                VideoCaptureObserverOnStateChangedParams result = new VideoCaptureObserverOnStateChangedParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.state = readInt;
                VideoCaptureState.validate(readInt);
                result.state = VideoCaptureState.toKnownValue(result.state);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.state, 8);
        }
    }

    /* loaded from: classes2.dex */
    static final class VideoCaptureObserverOnNewBufferParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public VideoBufferHandle bufferHandle;
        public int bufferId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private VideoCaptureObserverOnNewBufferParams(int version) {
            super(32, version);
        }

        public VideoCaptureObserverOnNewBufferParams() {
            this(0);
        }

        public static VideoCaptureObserverOnNewBufferParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static VideoCaptureObserverOnNewBufferParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static VideoCaptureObserverOnNewBufferParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                VideoCaptureObserverOnNewBufferParams result = new VideoCaptureObserverOnNewBufferParams(elementsOrVersion);
                result.bufferId = decoder0.readInt(8);
                result.bufferHandle = VideoBufferHandle.decode(decoder0, 16);
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
            encoder0.encode((Union) this.bufferHandle, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class VideoCaptureObserverOnBufferReadyParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public ReadyBuffer buffer;
        public ReadyBuffer[] scaledBuffers;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private VideoCaptureObserverOnBufferReadyParams(int version) {
            super(24, version);
        }

        public VideoCaptureObserverOnBufferReadyParams() {
            this(0);
        }

        public static VideoCaptureObserverOnBufferReadyParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static VideoCaptureObserverOnBufferReadyParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static VideoCaptureObserverOnBufferReadyParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                VideoCaptureObserverOnBufferReadyParams result = new VideoCaptureObserverOnBufferReadyParams(elementsOrVersion);
                result.buffer = ReadyBuffer.decode(decoder0.readPointer(8, false));
                Decoder decoder1 = decoder0.readPointer(16, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.scaledBuffers = new ReadyBuffer[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.scaledBuffers[i1] = ReadyBuffer.decode(decoder2);
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
            encoder0.encode((Struct) this.buffer, 8, false);
            ReadyBuffer[] readyBufferArr = this.scaledBuffers;
            if (readyBufferArr == null) {
                encoder0.encodeNullPointer(16, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(readyBufferArr.length, 16, -1);
            int i0 = 0;
            while (true) {
                ReadyBuffer[] readyBufferArr2 = this.scaledBuffers;
                if (i0 < readyBufferArr2.length) {
                    encoder1.encode((Struct) readyBufferArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class VideoCaptureObserverOnBufferDestroyedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int bufferId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private VideoCaptureObserverOnBufferDestroyedParams(int version) {
            super(16, version);
        }

        public VideoCaptureObserverOnBufferDestroyedParams() {
            this(0);
        }

        public static VideoCaptureObserverOnBufferDestroyedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static VideoCaptureObserverOnBufferDestroyedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static VideoCaptureObserverOnBufferDestroyedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                VideoCaptureObserverOnBufferDestroyedParams result = new VideoCaptureObserverOnBufferDestroyedParams(elementsOrVersion);
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
}
