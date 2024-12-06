package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.DevToolsAgent;
import org.chromium.gfx.mojom.Point;
import org.chromium.mojo.bindings.AssociatedInterfaceNotSupported;
import org.chromium.mojo.bindings.AssociatedInterfaceRequestNotSupported;
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
import org.chromium.mojo.bindings.SideEffectFreeCloseable;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo.system.Core;
/* loaded from: classes2.dex */
class DevToolsAgent_Internal {
    private static final int ATTACH_DEV_TOOLS_SESSION_ORDINAL = 0;
    private static final int INSPECT_ELEMENT_ORDINAL = 1;
    public static final Interface.Manager<DevToolsAgent, DevToolsAgent.Proxy> MANAGER = new Interface.Manager<DevToolsAgent, DevToolsAgent.Proxy>() { // from class: org.chromium.blink.mojom.DevToolsAgent_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.DevToolsAgent";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public DevToolsAgent.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, DevToolsAgent impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public DevToolsAgent[] buildArray(int size) {
            return new DevToolsAgent[size];
        }
    };
    private static final int REPORT_CHILD_WORKERS_ORDINAL = 2;

    DevToolsAgent_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements DevToolsAgent.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.DevToolsAgent
        public void attachDevToolsSession(AssociatedInterfaceNotSupported host, AssociatedInterfaceRequestNotSupported session, InterfaceRequest<DevToolsSession> ioSession, DevToolsSessionState reattachSessionState, boolean clientExpectsBinaryResponses, String sessionId) {
            DevToolsAgentAttachDevToolsSessionParams _message = new DevToolsAgentAttachDevToolsSessionParams();
            _message.host = host;
            _message.session = session;
            _message.ioSession = ioSession;
            _message.reattachSessionState = reattachSessionState;
            _message.clientExpectsBinaryResponses = clientExpectsBinaryResponses;
            _message.sessionId = sessionId;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }

        @Override // org.chromium.blink.mojom.DevToolsAgent
        public void inspectElement(Point point) {
            DevToolsAgentInspectElementParams _message = new DevToolsAgentInspectElementParams();
            _message.point = point;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1)));
        }

        @Override // org.chromium.blink.mojom.DevToolsAgent
        public void reportChildWorkers(boolean report, boolean waitForDebugger, ReportChildWorkersResponse callback) {
            DevToolsAgentReportChildWorkersParams _message = new DevToolsAgentReportChildWorkersParams();
            _message.report = report;
            _message.waitForDebugger = waitForDebugger;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2, 1, 0L)), new DevToolsAgentReportChildWorkersResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<DevToolsAgent> {
        Stub(Core core, DevToolsAgent impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(DevToolsAgent_Internal.MANAGER, messageWithHeader);
                    case -1:
                    default:
                        return false;
                    case 0:
                        DevToolsAgentAttachDevToolsSessionParams data = DevToolsAgentAttachDevToolsSessionParams.deserialize(messageWithHeader.getPayload());
                        getImpl().attachDevToolsSession(data.host, data.session, data.ioSession, data.reattachSessionState, data.clientExpectsBinaryResponses, data.sessionId);
                        return true;
                    case 1:
                        getImpl().inspectElement(DevToolsAgentInspectElementParams.deserialize(messageWithHeader.getPayload()).point);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), DevToolsAgent_Internal.MANAGER, messageWithHeader, receiver);
                    case 2:
                        DevToolsAgentReportChildWorkersParams data = DevToolsAgentReportChildWorkersParams.deserialize(messageWithHeader.getPayload());
                        getImpl().reportChildWorkers(data.report, data.waitForDebugger, new DevToolsAgentReportChildWorkersResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class DevToolsAgentAttachDevToolsSessionParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 48;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean clientExpectsBinaryResponses;
        public AssociatedInterfaceNotSupported host;
        public InterfaceRequest<DevToolsSession> ioSession;
        public DevToolsSessionState reattachSessionState;
        public AssociatedInterfaceRequestNotSupported session;
        public String sessionId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(48, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private DevToolsAgentAttachDevToolsSessionParams(int version) {
            super(48, version);
        }

        public DevToolsAgentAttachDevToolsSessionParams() {
            this(0);
        }

        public static DevToolsAgentAttachDevToolsSessionParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static DevToolsAgentAttachDevToolsSessionParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static DevToolsAgentAttachDevToolsSessionParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                DevToolsAgentAttachDevToolsSessionParams result = new DevToolsAgentAttachDevToolsSessionParams(elementsOrVersion);
                result.host = decoder0.readAssociatedServiceInterfaceNotSupported(8, false);
                result.session = decoder0.readAssociatedInterfaceRequestNotSupported(16, false);
                result.ioSession = decoder0.readInterfaceRequest(20, false);
                Decoder decoder1 = decoder0.readPointer(24, true);
                result.reattachSessionState = DevToolsSessionState.decode(decoder1);
                result.clientExpectsBinaryResponses = decoder0.readBoolean(32, 0);
                result.sessionId = decoder0.readString(40, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.host, 8, false);
            encoder0.encode(this.session, 16, false);
            encoder0.encode((InterfaceRequest) this.ioSession, 20, false);
            encoder0.encode((Struct) this.reattachSessionState, 24, true);
            encoder0.encode(this.clientExpectsBinaryResponses, 32, 0);
            encoder0.encode(this.sessionId, 40, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class DevToolsAgentInspectElementParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public Point point;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private DevToolsAgentInspectElementParams(int version) {
            super(16, version);
        }

        public DevToolsAgentInspectElementParams() {
            this(0);
        }

        public static DevToolsAgentInspectElementParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static DevToolsAgentInspectElementParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static DevToolsAgentInspectElementParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                DevToolsAgentInspectElementParams result = new DevToolsAgentInspectElementParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.point = Point.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.point, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class DevToolsAgentReportChildWorkersParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean report;
        public boolean waitForDebugger;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private DevToolsAgentReportChildWorkersParams(int version) {
            super(16, version);
        }

        public DevToolsAgentReportChildWorkersParams() {
            this(0);
        }

        public static DevToolsAgentReportChildWorkersParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static DevToolsAgentReportChildWorkersParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static DevToolsAgentReportChildWorkersParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                DevToolsAgentReportChildWorkersParams result = new DevToolsAgentReportChildWorkersParams(elementsOrVersion);
                result.report = decoder0.readBoolean(8, 0);
                result.waitForDebugger = decoder0.readBoolean(8, 1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.report, 8, 0);
            encoder0.encode(this.waitForDebugger, 8, 1);
        }
    }

    /* loaded from: classes2.dex */
    static final class DevToolsAgentReportChildWorkersResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private DevToolsAgentReportChildWorkersResponseParams(int version) {
            super(8, version);
        }

        public DevToolsAgentReportChildWorkersResponseParams() {
            this(0);
        }

        public static DevToolsAgentReportChildWorkersResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static DevToolsAgentReportChildWorkersResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static DevToolsAgentReportChildWorkersResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                DevToolsAgentReportChildWorkersResponseParams result = new DevToolsAgentReportChildWorkersResponseParams(elementsOrVersion);
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
    static class DevToolsAgentReportChildWorkersResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final DevToolsAgent.ReportChildWorkersResponse mCallback;

        DevToolsAgentReportChildWorkersResponseParamsForwardToCallback(DevToolsAgent.ReportChildWorkersResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(2, 2)) {
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
    static class DevToolsAgentReportChildWorkersResponseParamsProxyToResponder implements DevToolsAgent.ReportChildWorkersResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        DevToolsAgentReportChildWorkersResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            DevToolsAgentReportChildWorkersResponseParams _response = new DevToolsAgentReportChildWorkersResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(2, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
