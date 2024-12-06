package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.PresentationReceiver;
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
/* loaded from: classes2.dex */
class PresentationReceiver_Internal {
    public static final Interface.Manager<PresentationReceiver, PresentationReceiver.Proxy> MANAGER = new Interface.Manager<PresentationReceiver, PresentationReceiver.Proxy>() { // from class: org.chromium.blink.mojom.PresentationReceiver_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.PresentationReceiver";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public PresentationReceiver.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, PresentationReceiver impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public PresentationReceiver[] buildArray(int size) {
            return new PresentationReceiver[size];
        }
    };
    private static final int ON_RECEIVER_CONNECTION_AVAILABLE_ORDINAL = 0;

    PresentationReceiver_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements PresentationReceiver.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.PresentationReceiver
        public void onReceiverConnectionAvailable(PresentationInfo info, PresentationConnection controllerConnection, InterfaceRequest<PresentationConnection> receiverConnectionReceiver) {
            PresentationReceiverOnReceiverConnectionAvailableParams _message = new PresentationReceiverOnReceiverConnectionAvailableParams();
            _message.info = info;
            _message.controllerConnection = controllerConnection;
            _message.receiverConnectionReceiver = receiverConnectionReceiver;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<PresentationReceiver> {
        Stub(Core core, PresentationReceiver impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(PresentationReceiver_Internal.MANAGER, messageWithHeader);
                    case -1:
                    default:
                        return false;
                    case 0:
                        PresentationReceiverOnReceiverConnectionAvailableParams data = PresentationReceiverOnReceiverConnectionAvailableParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onReceiverConnectionAvailable(data.info, data.controllerConnection, data.receiverConnectionReceiver);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), PresentationReceiver_Internal.MANAGER, messageWithHeader, receiver);
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
    static final class PresentationReceiverOnReceiverConnectionAvailableParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public PresentationConnection controllerConnection;
        public PresentationInfo info;
        public InterfaceRequest<PresentationConnection> receiverConnectionReceiver;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PresentationReceiverOnReceiverConnectionAvailableParams(int version) {
            super(32, version);
        }

        public PresentationReceiverOnReceiverConnectionAvailableParams() {
            this(0);
        }

        public static PresentationReceiverOnReceiverConnectionAvailableParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PresentationReceiverOnReceiverConnectionAvailableParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PresentationReceiverOnReceiverConnectionAvailableParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PresentationReceiverOnReceiverConnectionAvailableParams result = new PresentationReceiverOnReceiverConnectionAvailableParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.info = PresentationInfo.decode(decoder1);
                result.controllerConnection = (PresentationConnection) decoder0.readServiceInterface(16, false, PresentationConnection.MANAGER);
                result.receiverConnectionReceiver = decoder0.readInterfaceRequest(24, false);
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
            encoder0.encode(this.controllerConnection, 16, false,  PresentationConnection.MANAGER);
            encoder0.encode((InterfaceRequest) this.receiverConnectionReceiver, 24, false);
        }
    }
}
