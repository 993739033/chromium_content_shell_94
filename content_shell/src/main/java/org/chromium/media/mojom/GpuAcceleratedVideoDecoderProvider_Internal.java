package org.chromium.media.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.media.mojom.GpuAcceleratedVideoDecoderProvider;
import org.chromium.mojo.bindings.AssociatedInterfaceNotSupported;
import org.chromium.mojo.bindings.AssociatedInterfaceRequestNotSupported;
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
class GpuAcceleratedVideoDecoderProvider_Internal {
    private static final int CREATE_ACCELERATED_VIDEO_DECODER_ORDINAL = 0;
    public static final Interface.Manager<GpuAcceleratedVideoDecoderProvider, GpuAcceleratedVideoDecoderProvider.Proxy> MANAGER = new Interface.Manager<GpuAcceleratedVideoDecoderProvider, GpuAcceleratedVideoDecoderProvider.Proxy>() { // from class: org.chromium.media.mojom.GpuAcceleratedVideoDecoderProvider_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "media.mojom.GpuAcceleratedVideoDecoderProvider";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public GpuAcceleratedVideoDecoderProvider.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, GpuAcceleratedVideoDecoderProvider impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public GpuAcceleratedVideoDecoderProvider[] buildArray(int size) {
            return new GpuAcceleratedVideoDecoderProvider[size];
        }
    };

    GpuAcceleratedVideoDecoderProvider_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements GpuAcceleratedVideoDecoderProvider.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.media.mojom.GpuAcceleratedVideoDecoderProvider
        public void createAcceleratedVideoDecoder(VideoDecodeAcceleratorConfig config, AssociatedInterfaceRequestNotSupported receiver, AssociatedInterfaceNotSupported client, CreateAcceleratedVideoDecoderResponse callback) {
            GpuAcceleratedVideoDecoderProviderCreateAcceleratedVideoDecoderParams _message = new GpuAcceleratedVideoDecoderProviderCreateAcceleratedVideoDecoderParams();
            _message.config = config;
            _message.receiver = receiver;
            _message.client = client;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new GpuAcceleratedVideoDecoderProviderCreateAcceleratedVideoDecoderResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<GpuAcceleratedVideoDecoderProvider> {
        Stub(Core core, GpuAcceleratedVideoDecoderProvider impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(GpuAcceleratedVideoDecoderProvider_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), GpuAcceleratedVideoDecoderProvider_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        GpuAcceleratedVideoDecoderProviderCreateAcceleratedVideoDecoderParams data = GpuAcceleratedVideoDecoderProviderCreateAcceleratedVideoDecoderParams.deserialize(messageWithHeader.getPayload());
                        getImpl().createAcceleratedVideoDecoder(data.config, data.receiver, data.client, new GpuAcceleratedVideoDecoderProviderCreateAcceleratedVideoDecoderResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class GpuAcceleratedVideoDecoderProviderCreateAcceleratedVideoDecoderParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public AssociatedInterfaceNotSupported client;
        public VideoDecodeAcceleratorConfig config;
        public AssociatedInterfaceRequestNotSupported receiver;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private GpuAcceleratedVideoDecoderProviderCreateAcceleratedVideoDecoderParams(int version) {
            super(32, version);
        }

        public GpuAcceleratedVideoDecoderProviderCreateAcceleratedVideoDecoderParams() {
            this(0);
        }

        public static GpuAcceleratedVideoDecoderProviderCreateAcceleratedVideoDecoderParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static GpuAcceleratedVideoDecoderProviderCreateAcceleratedVideoDecoderParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static GpuAcceleratedVideoDecoderProviderCreateAcceleratedVideoDecoderParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                GpuAcceleratedVideoDecoderProviderCreateAcceleratedVideoDecoderParams result = new GpuAcceleratedVideoDecoderProviderCreateAcceleratedVideoDecoderParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.config = VideoDecodeAcceleratorConfig.decode(decoder1);
                result.receiver = decoder0.readAssociatedInterfaceRequestNotSupported(16, false);
                result.client = decoder0.readAssociatedServiceInterfaceNotSupported(20, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.config, 8, false);
            encoder0.encode(this.receiver, 16, false);
            encoder0.encode(this.client, 20, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class GpuAcceleratedVideoDecoderProviderCreateAcceleratedVideoDecoderResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private GpuAcceleratedVideoDecoderProviderCreateAcceleratedVideoDecoderResponseParams(int version) {
            super(16, version);
        }

        public GpuAcceleratedVideoDecoderProviderCreateAcceleratedVideoDecoderResponseParams() {
            this(0);
        }

        public static GpuAcceleratedVideoDecoderProviderCreateAcceleratedVideoDecoderResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static GpuAcceleratedVideoDecoderProviderCreateAcceleratedVideoDecoderResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static GpuAcceleratedVideoDecoderProviderCreateAcceleratedVideoDecoderResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                GpuAcceleratedVideoDecoderProviderCreateAcceleratedVideoDecoderResponseParams result = new GpuAcceleratedVideoDecoderProviderCreateAcceleratedVideoDecoderResponseParams(elementsOrVersion);
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
    static class GpuAcceleratedVideoDecoderProviderCreateAcceleratedVideoDecoderResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final GpuAcceleratedVideoDecoderProvider.CreateAcceleratedVideoDecoderResponse mCallback;

        GpuAcceleratedVideoDecoderProviderCreateAcceleratedVideoDecoderResponseParamsForwardToCallback(GpuAcceleratedVideoDecoderProvider.CreateAcceleratedVideoDecoderResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(0, 6)) {
                    return false;
                }
                GpuAcceleratedVideoDecoderProviderCreateAcceleratedVideoDecoderResponseParams response = GpuAcceleratedVideoDecoderProviderCreateAcceleratedVideoDecoderResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.success));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class GpuAcceleratedVideoDecoderProviderCreateAcceleratedVideoDecoderResponseParamsProxyToResponder implements GpuAcceleratedVideoDecoderProvider.CreateAcceleratedVideoDecoderResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        GpuAcceleratedVideoDecoderProviderCreateAcceleratedVideoDecoderResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Boolean success) {
            GpuAcceleratedVideoDecoderProviderCreateAcceleratedVideoDecoderResponseParams _response = new GpuAcceleratedVideoDecoderProviderCreateAcceleratedVideoDecoderResponseParams();
            _response.success = success.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
