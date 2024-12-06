package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.UnhandledTapNotifier;
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
class UnhandledTapNotifier_Internal {
    public static final Interface.Manager<UnhandledTapNotifier, UnhandledTapNotifier.Proxy> MANAGER = new Interface.Manager<UnhandledTapNotifier, UnhandledTapNotifier.Proxy>() { // from class: org.chromium.blink.mojom.UnhandledTapNotifier_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.UnhandledTapNotifier";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public UnhandledTapNotifier.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, UnhandledTapNotifier impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public UnhandledTapNotifier[] buildArray(int size) {
            return new UnhandledTapNotifier[size];
        }
    };
    private static final int SHOW_UNHANDLED_TAP_UI_IF_NEEDED_ORDINAL = 0;

    UnhandledTapNotifier_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements UnhandledTapNotifier.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.UnhandledTapNotifier
        public void showUnhandledTapUiIfNeeded(UnhandledTapInfo unhandledTapInfo) {
            UnhandledTapNotifierShowUnhandledTapUiIfNeededParams _message = new UnhandledTapNotifierShowUnhandledTapUiIfNeededParams();
            _message.unhandledTapInfo = unhandledTapInfo;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<UnhandledTapNotifier> {
        Stub(Core core, UnhandledTapNotifier impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(UnhandledTapNotifier_Internal.MANAGER, messageWithHeader);
                    case -1:
                    default:
                        return false;
                    case 0:
                        UnhandledTapNotifierShowUnhandledTapUiIfNeededParams data = UnhandledTapNotifierShowUnhandledTapUiIfNeededParams.deserialize(messageWithHeader.getPayload());
                        getImpl().showUnhandledTapUiIfNeeded(data.unhandledTapInfo);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), UnhandledTapNotifier_Internal.MANAGER, messageWithHeader, receiver);
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
    static final class UnhandledTapNotifierShowUnhandledTapUiIfNeededParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public UnhandledTapInfo unhandledTapInfo;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UnhandledTapNotifierShowUnhandledTapUiIfNeededParams(int version) {
            super(16, version);
        }

        public UnhandledTapNotifierShowUnhandledTapUiIfNeededParams() {
            this(0);
        }

        public static UnhandledTapNotifierShowUnhandledTapUiIfNeededParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UnhandledTapNotifierShowUnhandledTapUiIfNeededParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UnhandledTapNotifierShowUnhandledTapUiIfNeededParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UnhandledTapNotifierShowUnhandledTapUiIfNeededParams result = new UnhandledTapNotifierShowUnhandledTapUiIfNeededParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.unhandledTapInfo = UnhandledTapInfo.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.unhandledTapInfo, 8, false);
        }
    }
}
