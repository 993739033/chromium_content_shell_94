package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.AnchorElementMetricsHost;
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
class AnchorElementMetricsHost_Internal {
    public static final Interface.Manager<AnchorElementMetricsHost, AnchorElementMetricsHost.Proxy> MANAGER = new Interface.Manager<AnchorElementMetricsHost, AnchorElementMetricsHost.Proxy>() { // from class: org.chromium.blink.mojom.AnchorElementMetricsHost_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.AnchorElementMetricsHost";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public AnchorElementMetricsHost.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, AnchorElementMetricsHost impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public AnchorElementMetricsHost[] buildArray(int size) {
            return new AnchorElementMetricsHost[size];
        }
    };
    private static final int REPORT_ANCHOR_ELEMENTS_ENTERED_VIEWPORT_ORDINAL = 2;
    private static final int REPORT_ANCHOR_ELEMENT_CLICK_ORDINAL = 0;
    private static final int REPORT_NEW_ANCHOR_ELEMENTS_ORDINAL = 1;

    AnchorElementMetricsHost_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements AnchorElementMetricsHost.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.AnchorElementMetricsHost
        public void reportAnchorElementClick(AnchorElementClick clicked) {
            AnchorElementMetricsHostReportAnchorElementClickParams _message = new AnchorElementMetricsHostReportAnchorElementClickParams();
            _message.clicked = clicked;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }

        @Override // org.chromium.blink.mojom.AnchorElementMetricsHost
        public void reportNewAnchorElements(AnchorElementMetrics[] metrics) {
            AnchorElementMetricsHostReportNewAnchorElementsParams _message = new AnchorElementMetricsHostReportNewAnchorElementsParams();
            _message.metrics = metrics;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1)));
        }

        @Override // org.chromium.blink.mojom.AnchorElementMetricsHost
        public void reportAnchorElementsEnteredViewport(AnchorElementEnteredViewport[] elements) {
            AnchorElementMetricsHostReportAnchorElementsEnteredViewportParams _message = new AnchorElementMetricsHostReportAnchorElementsEnteredViewportParams();
            _message.elements = elements;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<AnchorElementMetricsHost> {
        Stub(Core core, AnchorElementMetricsHost impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(AnchorElementMetricsHost_Internal.MANAGER, messageWithHeader);
                    case -1:
                    default:
                        return false;
                    case 0:
                        AnchorElementMetricsHostReportAnchorElementClickParams data = AnchorElementMetricsHostReportAnchorElementClickParams.deserialize(messageWithHeader.getPayload());
                        getImpl().reportAnchorElementClick(data.clicked);
                        return true;
                    case 1:
                        AnchorElementMetricsHostReportNewAnchorElementsParams data2 = AnchorElementMetricsHostReportNewAnchorElementsParams.deserialize(messageWithHeader.getPayload());
                        getImpl().reportNewAnchorElements(data2.metrics);
                        return true;
                    case 2:
                        AnchorElementMetricsHostReportAnchorElementsEnteredViewportParams data3 = AnchorElementMetricsHostReportAnchorElementsEnteredViewportParams.deserialize(messageWithHeader.getPayload());
                        getImpl().reportAnchorElementsEnteredViewport(data3.elements);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), AnchorElementMetricsHost_Internal.MANAGER, messageWithHeader, receiver);
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
    static final class AnchorElementMetricsHostReportAnchorElementClickParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public AnchorElementClick clicked;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private AnchorElementMetricsHostReportAnchorElementClickParams(int version) {
            super(16, version);
        }

        public AnchorElementMetricsHostReportAnchorElementClickParams() {
            this(0);
        }

        public static AnchorElementMetricsHostReportAnchorElementClickParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static AnchorElementMetricsHostReportAnchorElementClickParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static AnchorElementMetricsHostReportAnchorElementClickParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                AnchorElementMetricsHostReportAnchorElementClickParams result = new AnchorElementMetricsHostReportAnchorElementClickParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.clicked = AnchorElementClick.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.clicked, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class AnchorElementMetricsHostReportNewAnchorElementsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public AnchorElementMetrics[] metrics;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private AnchorElementMetricsHostReportNewAnchorElementsParams(int version) {
            super(16, version);
        }

        public AnchorElementMetricsHostReportNewAnchorElementsParams() {
            this(0);
        }

        public static AnchorElementMetricsHostReportNewAnchorElementsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static AnchorElementMetricsHostReportNewAnchorElementsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static AnchorElementMetricsHostReportNewAnchorElementsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                AnchorElementMetricsHostReportNewAnchorElementsParams result = new AnchorElementMetricsHostReportNewAnchorElementsParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.metrics = new AnchorElementMetrics[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.metrics[i1] = AnchorElementMetrics.decode(decoder2);
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
            AnchorElementMetrics[] anchorElementMetricsArr = this.metrics;
            if (anchorElementMetricsArr == null) {
                encoder0.encodeNullPointer(8, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(anchorElementMetricsArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                AnchorElementMetrics[] anchorElementMetricsArr2 = this.metrics;
                if (i0 < anchorElementMetricsArr2.length) {
                    encoder1.encode((Struct) anchorElementMetricsArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class AnchorElementMetricsHostReportAnchorElementsEnteredViewportParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public AnchorElementEnteredViewport[] elements;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private AnchorElementMetricsHostReportAnchorElementsEnteredViewportParams(int version) {
            super(16, version);
        }

        public AnchorElementMetricsHostReportAnchorElementsEnteredViewportParams() {
            this(0);
        }

        public static AnchorElementMetricsHostReportAnchorElementsEnteredViewportParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static AnchorElementMetricsHostReportAnchorElementsEnteredViewportParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static AnchorElementMetricsHostReportAnchorElementsEnteredViewportParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                AnchorElementMetricsHostReportAnchorElementsEnteredViewportParams result = new AnchorElementMetricsHostReportAnchorElementsEnteredViewportParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.elements = new AnchorElementEnteredViewport[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.elements[i1] = AnchorElementEnteredViewport.decode(decoder2);
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
            AnchorElementEnteredViewport[] anchorElementEnteredViewportArr = this.elements;
            if (anchorElementEnteredViewportArr == null) {
                encoder0.encodeNullPointer(8, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(anchorElementEnteredViewportArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                AnchorElementEnteredViewport[] anchorElementEnteredViewportArr2 = this.elements;
                if (i0 < anchorElementEnteredViewportArr2.length) {
                    encoder1.encode((Struct) anchorElementEnteredViewportArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }
}
