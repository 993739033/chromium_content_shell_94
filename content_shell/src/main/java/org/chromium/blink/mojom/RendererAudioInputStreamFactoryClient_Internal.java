package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.RendererAudioInputStreamFactoryClient;
import org.chromium.media.mojom.AudioInputStream;
import org.chromium.media.mojom.AudioInputStreamClient;
import org.chromium.media.mojom.ReadOnlyAudioDataPipe;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.DeserializationException;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceControlMessagesHelper;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.MessageHeader;
import org.chromium.mojo.bindings.MessageReceiver;
import org.chromium.mojo.bindings.MessageReceiverWithResponder;
import org.chromium.mojo.bindings.ServiceMessage;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo.system.Core;
import org.chromium.mojo_base.mojom.UnguessableToken;
/* loaded from: classes2.dex */
class RendererAudioInputStreamFactoryClient_Internal {
    public static final Interface.Manager<RendererAudioInputStreamFactoryClient, RendererAudioInputStreamFactoryClient.Proxy> MANAGER = new Interface.Manager<RendererAudioInputStreamFactoryClient, RendererAudioInputStreamFactoryClient.Proxy>() { // from class: org.chromium.blink.mojom.RendererAudioInputStreamFactoryClient_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.RendererAudioInputStreamFactoryClient";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public RendererAudioInputStreamFactoryClient.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, RendererAudioInputStreamFactoryClient impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public RendererAudioInputStreamFactoryClient[] buildArray(int size) {
            return new RendererAudioInputStreamFactoryClient[size];
        }
    };
    private static final int STREAM_CREATED_ORDINAL = 0;

    RendererAudioInputStreamFactoryClient_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements RendererAudioInputStreamFactoryClient.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.RendererAudioInputStreamFactoryClient
        public void streamCreated(AudioInputStream stream, InterfaceRequest<AudioInputStreamClient> clientRequest, ReadOnlyAudioDataPipe dataPipe, boolean initiallyMuted, UnguessableToken streamId) {
            RendererAudioInputStreamFactoryClientStreamCreatedParams _message = new RendererAudioInputStreamFactoryClientStreamCreatedParams();
            _message.stream = stream;
            _message.clientRequest = clientRequest;
            _message.dataPipe = dataPipe;
            _message.initiallyMuted = initiallyMuted;
            _message.streamId = streamId;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<RendererAudioInputStreamFactoryClient> {
        Stub(Core core, RendererAudioInputStreamFactoryClient impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(RendererAudioInputStreamFactoryClient_Internal.MANAGER, messageWithHeader);
                    case -1:
                    default:
                        return false;
                    case 0:
                        RendererAudioInputStreamFactoryClientStreamCreatedParams data = RendererAudioInputStreamFactoryClientStreamCreatedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().streamCreated(data.stream, data.clientRequest, data.dataPipe, data.initiallyMuted, data.streamId);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), RendererAudioInputStreamFactoryClient_Internal.MANAGER, messageWithHeader, receiver);
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
    static final class RendererAudioInputStreamFactoryClientStreamCreatedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 40;
        private static final DataHeader[] VERSION_ARRAY;
        public InterfaceRequest<AudioInputStreamClient> clientRequest;
        public ReadOnlyAudioDataPipe dataPipe;
        public boolean initiallyMuted;
        public AudioInputStream stream;
        public UnguessableToken streamId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RendererAudioInputStreamFactoryClientStreamCreatedParams(int version) {
            super(40, version);
        }

        public RendererAudioInputStreamFactoryClientStreamCreatedParams() {
            this(0);
        }

        public static RendererAudioInputStreamFactoryClientStreamCreatedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RendererAudioInputStreamFactoryClientStreamCreatedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RendererAudioInputStreamFactoryClientStreamCreatedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RendererAudioInputStreamFactoryClientStreamCreatedParams result = new RendererAudioInputStreamFactoryClientStreamCreatedParams(elementsOrVersion);
                result.stream = (AudioInputStream) decoder0.readServiceInterface(8, false, AudioInputStream.MANAGER);
                result.clientRequest = decoder0.readInterfaceRequest(16, false);
                result.initiallyMuted = decoder0.readBoolean(20, 0);
                Decoder decoder1 = decoder0.readPointer(24, false);
                result.dataPipe = ReadOnlyAudioDataPipe.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(32, true);
                result.streamId = UnguessableToken.decode(decoder12);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode( this.stream, 8, false, AudioInputStream.MANAGER);
            encoder0.encode((InterfaceRequest) this.clientRequest, 16, false);
            encoder0.encode(this.initiallyMuted, 20, 0);
            encoder0.encode((Struct) this.dataPipe, 24, false);
            encoder0.encode((Struct) this.streamId, 32, true);
        }
    }
}
