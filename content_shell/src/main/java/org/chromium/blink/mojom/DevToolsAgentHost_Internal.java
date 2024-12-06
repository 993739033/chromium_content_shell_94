package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.DevToolsAgentHost;
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
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
class DevToolsAgentHost_Internal {
    private static final int CHILD_WORKER_CREATED_ORDINAL = 0;
    public static final Interface.Manager<DevToolsAgentHost, DevToolsAgentHost.Proxy> MANAGER = new Interface.Manager<DevToolsAgentHost, DevToolsAgentHost.Proxy>() { // from class: org.chromium.blink.mojom.DevToolsAgentHost_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.DevToolsAgentHost";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public DevToolsAgentHost.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, DevToolsAgentHost impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public DevToolsAgentHost[] buildArray(int size) {
            return new DevToolsAgentHost[size];
        }
    };

    DevToolsAgentHost_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements DevToolsAgentHost.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.DevToolsAgentHost
        public void childWorkerCreated(DevToolsAgent workerDevtoolsAgent, InterfaceRequest<DevToolsAgentHost> workerDevtoolsAgentHost, Url url, String name, UnguessableToken devtoolsWorkerToken, boolean waitingForDebugger) {
            DevToolsAgentHostChildWorkerCreatedParams _message = new DevToolsAgentHostChildWorkerCreatedParams();
            _message.workerDevtoolsAgent = workerDevtoolsAgent;
            _message.workerDevtoolsAgentHost = workerDevtoolsAgentHost;
            _message.url = url;
            _message.name = name;
            _message.devtoolsWorkerToken = devtoolsWorkerToken;
            _message.waitingForDebugger = waitingForDebugger;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<DevToolsAgentHost> {
        Stub(Core core, DevToolsAgentHost impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(DevToolsAgentHost_Internal.MANAGER, messageWithHeader);
                    case -1:
                    default:
                        return false;
                    case 0:
                        DevToolsAgentHostChildWorkerCreatedParams data = DevToolsAgentHostChildWorkerCreatedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().childWorkerCreated(data.workerDevtoolsAgent, data.workerDevtoolsAgentHost, data.url, data.name, data.devtoolsWorkerToken, data.waitingForDebugger);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), DevToolsAgentHost_Internal.MANAGER, messageWithHeader, receiver);
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
    static final class DevToolsAgentHostChildWorkerCreatedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 48;
        private static final DataHeader[] VERSION_ARRAY;
        public UnguessableToken devtoolsWorkerToken;
        public String name;
        public Url url;
        public boolean waitingForDebugger;
        public DevToolsAgent workerDevtoolsAgent;
        public InterfaceRequest<DevToolsAgentHost> workerDevtoolsAgentHost;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(48, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private DevToolsAgentHostChildWorkerCreatedParams(int version) {
            super(48, version);
        }

        public DevToolsAgentHostChildWorkerCreatedParams() {
            this(0);
        }

        public static DevToolsAgentHostChildWorkerCreatedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static DevToolsAgentHostChildWorkerCreatedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static DevToolsAgentHostChildWorkerCreatedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                DevToolsAgentHostChildWorkerCreatedParams result = new DevToolsAgentHostChildWorkerCreatedParams(elementsOrVersion);
                result.workerDevtoolsAgent = (DevToolsAgent) decoder0.readServiceInterface(8, false, DevToolsAgent.MANAGER);
                result.workerDevtoolsAgentHost = decoder0.readInterfaceRequest(16, false);
                result.waitingForDebugger = decoder0.readBoolean(20, 0);
                Decoder decoder1 = decoder0.readPointer(24, false);
                result.url = Url.decode(decoder1);
                result.name = decoder0.readString(32, false);
                Decoder decoder12 = decoder0.readPointer(40, false);
                result.devtoolsWorkerToken = UnguessableToken.decode(decoder12);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.workerDevtoolsAgent, 8, false,  DevToolsAgent.MANAGER);
            encoder0.encode((InterfaceRequest) this.workerDevtoolsAgentHost, 16, false);
            encoder0.encode(this.waitingForDebugger, 20, 0);
            encoder0.encode((Struct) this.url, 24, false);
            encoder0.encode(this.name, 32, false);
            encoder0.encode((Struct) this.devtoolsWorkerToken, 40, false);
        }
    }
}
