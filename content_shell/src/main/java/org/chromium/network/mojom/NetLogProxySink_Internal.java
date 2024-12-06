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
import org.chromium.mojo.bindings.Union;
import org.chromium.mojo.system.Core;
import org.chromium.mojo_base.mojom.TimeTicks;
import org.chromium.mojo_base.mojom.Value;
import org.chromium.network.mojom.NetLogProxySink;
/* loaded from: classes2.dex */
class NetLogProxySink_Internal {
    private static final int ADD_ENTRY_ORDINAL = 0;
    public static final Interface.Manager<NetLogProxySink, NetLogProxySink.Proxy> MANAGER = new Interface.Manager<NetLogProxySink, NetLogProxySink.Proxy>() { // from class: org.chromium.network.mojom.NetLogProxySink_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "network.mojom.NetLogProxySink";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public NetLogProxySink.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, NetLogProxySink impl) {
            return new Stub(core, impl);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public NetLogProxySink[] buildArray(int size) {
            return new NetLogProxySink[size];
        }
    };

    NetLogProxySink_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements NetLogProxySink.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.network.mojom.NetLogProxySink
        public void addEntry(int type, int sourceType, int sourceId, TimeTicks sourceStartTime, int phase, TimeTicks time, Value params) {
            NetLogProxySinkAddEntryParams _message = new NetLogProxySinkAddEntryParams();
            _message.type = type;
            _message.sourceType = sourceType;
            _message.sourceId = sourceId;
            _message.sourceStartTime = sourceStartTime;
            _message.phase = phase;
            _message.time = time;
            _message.params = params;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<NetLogProxySink> {
        Stub(Core core, NetLogProxySink impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(NetLogProxySink_Internal.MANAGER, messageWithHeader);
                    case -1:
                    default:
                        return false;
                    case 0:
                        NetLogProxySinkAddEntryParams data = NetLogProxySinkAddEntryParams.deserialize(messageWithHeader.getPayload());
                        getImpl().addEntry(data.type, data.sourceType, data.sourceId, data.sourceStartTime, data.phase, data.time, data.params);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), NetLogProxySink_Internal.MANAGER, messageWithHeader, receiver);
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
    static final class NetLogProxySinkAddEntryParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 56;
        private static final DataHeader[] VERSION_ARRAY;
        public Value params;
        public int phase;
        public int sourceId;
        public TimeTicks sourceStartTime;
        public int sourceType;
        public TimeTicks time;
        public int type;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(56, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private NetLogProxySinkAddEntryParams(int version) {
            super(56, version);
        }

        public NetLogProxySinkAddEntryParams() {
            this(0);
        }

        public static NetLogProxySinkAddEntryParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static NetLogProxySinkAddEntryParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static NetLogProxySinkAddEntryParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                NetLogProxySinkAddEntryParams result = new NetLogProxySinkAddEntryParams(elementsOrVersion);
                result.type = decoder0.readInt(8);
                result.sourceType = decoder0.readInt(12);
                result.sourceId = decoder0.readInt(16);
                int readInt = decoder0.readInt(20);
                result.phase = readInt;
                NetLogEventPhase.validate(readInt);
                result.phase = NetLogEventPhase.toKnownValue(result.phase);
                Decoder decoder1 = decoder0.readPointer(24, false);
                result.sourceStartTime = TimeTicks.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(32, false);
                result.time = TimeTicks.decode(decoder12);
                result.params = Value.decode(decoder0, 40);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.type, 8);
            encoder0.encode(this.sourceType, 12);
            encoder0.encode(this.sourceId, 16);
            encoder0.encode(this.phase, 20);
            encoder0.encode((Struct) this.sourceStartTime, 24, false);
            encoder0.encode((Struct) this.time, 32, false);
            encoder0.encode((Union) this.params, 40, false);
        }
    }
}
