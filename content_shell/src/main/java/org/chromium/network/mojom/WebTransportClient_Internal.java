package org.chromium.network.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
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
import org.chromium.mojo_base.mojom.ReadOnlyBuffer;
import org.chromium.network.mojom.WebTransportClient;
/* loaded from: classes2.dex */
class WebTransportClient_Internal {
    public static final Interface.Manager<WebTransportClient, WebTransportClient.Proxy> MANAGER = new Interface.Manager<WebTransportClient, WebTransportClient.Proxy>() { // from class: org.chromium.network.mojom.WebTransportClient_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "network.mojom.WebTransportClient";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public WebTransportClient.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, WebTransportClient impl) {
            return new Stub(core, impl);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public WebTransportClient[] buildArray(int size) {
            return new WebTransportClient[size];
        }
    };
    private static final int ON_DATAGRAM_RECEIVED_ORDINAL = 0;
    private static final int ON_INCOMING_STREAM_CLOSED_ORDINAL = 1;

    WebTransportClient_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements WebTransportClient.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.network.mojom.WebTransportClient
        public void onDatagramReceived(ReadOnlyBuffer data) {
            WebTransportClientOnDatagramReceivedParams _message = new WebTransportClientOnDatagramReceivedParams();
            _message.data = data;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }

        @Override // org.chromium.network.mojom.WebTransportClient
        public void onIncomingStreamClosed(int streamId, boolean finReceived) {
            WebTransportClientOnIncomingStreamClosedParams _message = new WebTransportClientOnIncomingStreamClosedParams();
            _message.streamId = streamId;
            _message.finReceived = finReceived;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<WebTransportClient> {
        Stub(Core core, WebTransportClient impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(WebTransportClient_Internal.MANAGER, messageWithHeader);
                    case -1:
                    default:
                        return false;
                    case 0:
                        getImpl().onDatagramReceived(WebTransportClientOnDatagramReceivedParams.deserialize(messageWithHeader.getPayload()).data);
                        return true;
                    case 1:
                        WebTransportClientOnIncomingStreamClosedParams data = WebTransportClientOnIncomingStreamClosedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onIncomingStreamClosed(data.streamId, data.finReceived);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), WebTransportClient_Internal.MANAGER, messageWithHeader, receiver);
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
    static final class WebTransportClientOnDatagramReceivedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public ReadOnlyBuffer data;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private WebTransportClientOnDatagramReceivedParams(int version) {
            super(16, version);
        }

        public WebTransportClientOnDatagramReceivedParams() {
            this(0);
        }

        public static WebTransportClientOnDatagramReceivedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static WebTransportClientOnDatagramReceivedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static WebTransportClientOnDatagramReceivedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                WebTransportClientOnDatagramReceivedParams result = new WebTransportClientOnDatagramReceivedParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.data = ReadOnlyBuffer.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.data, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class WebTransportClientOnIncomingStreamClosedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean finReceived;
        public int streamId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private WebTransportClientOnIncomingStreamClosedParams(int version) {
            super(16, version);
        }

        public WebTransportClientOnIncomingStreamClosedParams() {
            this(0);
        }

        public static WebTransportClientOnIncomingStreamClosedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static WebTransportClientOnIncomingStreamClosedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static WebTransportClientOnIncomingStreamClosedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                WebTransportClientOnIncomingStreamClosedParams result = new WebTransportClientOnIncomingStreamClosedParams(elementsOrVersion);
                result.streamId = decoder0.readInt(8);
                result.finReceived = decoder0.readBoolean(12, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.streamId, 8);
            encoder0.encode(this.finReceived, 12, 0);
        }
    }
}
