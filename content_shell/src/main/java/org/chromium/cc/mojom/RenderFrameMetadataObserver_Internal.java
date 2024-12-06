package org.chromium.cc.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.cc.mojom.RenderFrameMetadataObserver;
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
class RenderFrameMetadataObserver_Internal {
    public static final Interface.Manager<RenderFrameMetadataObserver, RenderFrameMetadataObserver.Proxy> MANAGER = new Interface.Manager<RenderFrameMetadataObserver, RenderFrameMetadataObserver.Proxy>() { // from class: org.chromium.cc.mojom.RenderFrameMetadataObserver_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "cc.mojom.RenderFrameMetadataObserver";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public RenderFrameMetadataObserver.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, RenderFrameMetadataObserver impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public RenderFrameMetadataObserver[] buildArray(int size) {
            return new RenderFrameMetadataObserver[size];
        }
    };
    private static final int REPORT_ALL_FRAME_SUBMISSIONS_FOR_TESTING_ORDINAL = 1;
    private static final int REPORT_ALL_ROOT_SCROLLS_ORDINAL = 0;

    RenderFrameMetadataObserver_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements RenderFrameMetadataObserver.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.cc.mojom.RenderFrameMetadataObserver
        public void reportAllRootScrolls(boolean enabled) {
            RenderFrameMetadataObserverReportAllRootScrollsParams _message = new RenderFrameMetadataObserverReportAllRootScrollsParams();
            _message.enabled = enabled;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }

        @Override // org.chromium.cc.mojom.RenderFrameMetadataObserver
        public void reportAllFrameSubmissionsForTesting(boolean enabled) {
            RenderFrameMetadataObserverReportAllFrameSubmissionsForTestingParams _message = new RenderFrameMetadataObserverReportAllFrameSubmissionsForTestingParams();
            _message.enabled = enabled;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<RenderFrameMetadataObserver> {
        Stub(Core core, RenderFrameMetadataObserver impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(RenderFrameMetadataObserver_Internal.MANAGER, messageWithHeader);
                    case -1:
                    default:
                        return false;
                    case 0:
                        RenderFrameMetadataObserverReportAllRootScrollsParams data = RenderFrameMetadataObserverReportAllRootScrollsParams.deserialize(messageWithHeader.getPayload());
                        getImpl().reportAllRootScrolls(data.enabled);
                        return true;
                    case 1:
                        RenderFrameMetadataObserverReportAllFrameSubmissionsForTestingParams data2 = RenderFrameMetadataObserverReportAllFrameSubmissionsForTestingParams.deserialize(messageWithHeader.getPayload());
                        getImpl().reportAllFrameSubmissionsForTesting(data2.enabled);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), RenderFrameMetadataObserver_Internal.MANAGER, messageWithHeader, receiver);
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
    static final class RenderFrameMetadataObserverReportAllRootScrollsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean enabled;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RenderFrameMetadataObserverReportAllRootScrollsParams(int version) {
            super(16, version);
        }

        public RenderFrameMetadataObserverReportAllRootScrollsParams() {
            this(0);
        }

        public static RenderFrameMetadataObserverReportAllRootScrollsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RenderFrameMetadataObserverReportAllRootScrollsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RenderFrameMetadataObserverReportAllRootScrollsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RenderFrameMetadataObserverReportAllRootScrollsParams result = new RenderFrameMetadataObserverReportAllRootScrollsParams(elementsOrVersion);
                result.enabled = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.enabled, 8, 0);
        }
    }

    /* loaded from: classes2.dex */
    static final class RenderFrameMetadataObserverReportAllFrameSubmissionsForTestingParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean enabled;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RenderFrameMetadataObserverReportAllFrameSubmissionsForTestingParams(int version) {
            super(16, version);
        }

        public RenderFrameMetadataObserverReportAllFrameSubmissionsForTestingParams() {
            this(0);
        }

        public static RenderFrameMetadataObserverReportAllFrameSubmissionsForTestingParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RenderFrameMetadataObserverReportAllFrameSubmissionsForTestingParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RenderFrameMetadataObserverReportAllFrameSubmissionsForTestingParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RenderFrameMetadataObserverReportAllFrameSubmissionsForTestingParams result = new RenderFrameMetadataObserverReportAllFrameSubmissionsForTestingParams(elementsOrVersion);
                result.enabled = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.enabled, 8, 0);
        }
    }
}
