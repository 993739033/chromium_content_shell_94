package org.chromium.shape_detection.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
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
import org.chromium.shape_detection.mojom.BarcodeDetectionProvider;
/* loaded from: classes2.dex */
class BarcodeDetectionProvider_Internal {
    private static final int CREATE_BARCODE_DETECTION_ORDINAL = 0;
    private static final int ENUMERATE_SUPPORTED_FORMATS_ORDINAL = 1;
    public static final Interface.Manager<BarcodeDetectionProvider, BarcodeDetectionProvider.Proxy> MANAGER = new Interface.Manager<BarcodeDetectionProvider, BarcodeDetectionProvider.Proxy>() { // from class: org.chromium.shape_detection.mojom.BarcodeDetectionProvider_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "shape_detection.mojom.BarcodeDetectionProvider";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public BarcodeDetectionProvider.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, BarcodeDetectionProvider impl) {
            return new Stub(core, impl);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public BarcodeDetectionProvider[] buildArray(int size) {
            return new BarcodeDetectionProvider[size];
        }
    };

    BarcodeDetectionProvider_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements BarcodeDetectionProvider.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.shape_detection.mojom.BarcodeDetectionProvider
        public void createBarcodeDetection(InterfaceRequest<BarcodeDetection> receiver, BarcodeDetectorOptions options) {
            BarcodeDetectionProviderCreateBarcodeDetectionParams _message = new BarcodeDetectionProviderCreateBarcodeDetectionParams();
            _message.receiver = receiver;
            _message.options = options;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }

        @Override // org.chromium.shape_detection.mojom.BarcodeDetectionProvider
        public void enumerateSupportedFormats(EnumerateSupportedFormatsResponse callback) {
            BarcodeDetectionProviderEnumerateSupportedFormatsParams _message = new BarcodeDetectionProviderEnumerateSupportedFormatsParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1, 1, 0L)), new BarcodeDetectionProviderEnumerateSupportedFormatsResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<BarcodeDetectionProvider> {
        Stub(Core core, BarcodeDetectionProvider impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(BarcodeDetectionProvider_Internal.MANAGER, messageWithHeader);
                    case -1:
                    default:
                        return false;
                    case 0:
                        BarcodeDetectionProviderCreateBarcodeDetectionParams data = BarcodeDetectionProviderCreateBarcodeDetectionParams.deserialize(messageWithHeader.getPayload());
                        getImpl().createBarcodeDetection(data.receiver, data.options);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), BarcodeDetectionProvider_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                    default:
                        return false;
                    case 1:
                        BarcodeDetectionProviderEnumerateSupportedFormatsParams.deserialize(messageWithHeader.getPayload());
                        getImpl().enumerateSupportedFormats(new BarcodeDetectionProviderEnumerateSupportedFormatsResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                }
            } catch (DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class BarcodeDetectionProviderCreateBarcodeDetectionParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public BarcodeDetectorOptions options;
        public InterfaceRequest<BarcodeDetection> receiver;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BarcodeDetectionProviderCreateBarcodeDetectionParams(int version) {
            super(24, version);
        }

        public BarcodeDetectionProviderCreateBarcodeDetectionParams() {
            this(0);
        }

        public static BarcodeDetectionProviderCreateBarcodeDetectionParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BarcodeDetectionProviderCreateBarcodeDetectionParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BarcodeDetectionProviderCreateBarcodeDetectionParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BarcodeDetectionProviderCreateBarcodeDetectionParams result = new BarcodeDetectionProviderCreateBarcodeDetectionParams(elementsOrVersion);
                result.receiver = decoder0.readInterfaceRequest(8, false);
                Decoder decoder1 = decoder0.readPointer(16, false);
                result.options = BarcodeDetectorOptions.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((InterfaceRequest) this.receiver, 8, false);
            encoder0.encode((Struct) this.options, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class BarcodeDetectionProviderEnumerateSupportedFormatsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BarcodeDetectionProviderEnumerateSupportedFormatsParams(int version) {
            super(8, version);
        }

        public BarcodeDetectionProviderEnumerateSupportedFormatsParams() {
            this(0);
        }

        public static BarcodeDetectionProviderEnumerateSupportedFormatsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BarcodeDetectionProviderEnumerateSupportedFormatsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BarcodeDetectionProviderEnumerateSupportedFormatsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BarcodeDetectionProviderEnumerateSupportedFormatsParams result = new BarcodeDetectionProviderEnumerateSupportedFormatsParams(elementsOrVersion);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class BarcodeDetectionProviderEnumerateSupportedFormatsResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int[] supportedFormats;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BarcodeDetectionProviderEnumerateSupportedFormatsResponseParams(int version) {
            super(16, version);
        }

        public BarcodeDetectionProviderEnumerateSupportedFormatsResponseParams() {
            this(0);
        }

        public static BarcodeDetectionProviderEnumerateSupportedFormatsResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BarcodeDetectionProviderEnumerateSupportedFormatsResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BarcodeDetectionProviderEnumerateSupportedFormatsResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BarcodeDetectionProviderEnumerateSupportedFormatsResponseParams result = new BarcodeDetectionProviderEnumerateSupportedFormatsResponseParams(elementsOrVersion);
                result.supportedFormats = decoder0.readInts(8, 0, -1);
                int i1 = 0;
                while (true) {
                    int[] iArr = result.supportedFormats;
                    if (i1 < iArr.length) {
                        BarcodeFormat.validate(iArr[i1]);
                        i1++;
                    } else {
                        return result;
                    }
                }
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.supportedFormats, 8, 0, -1);
        }
    }

    /* loaded from: classes2.dex */
    static class BarcodeDetectionProviderEnumerateSupportedFormatsResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final BarcodeDetectionProvider.EnumerateSupportedFormatsResponse mCallback;

        BarcodeDetectionProviderEnumerateSupportedFormatsResponseParamsForwardToCallback(BarcodeDetectionProvider.EnumerateSupportedFormatsResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(1, 2)) {
                    return false;
                }
                BarcodeDetectionProviderEnumerateSupportedFormatsResponseParams response = BarcodeDetectionProviderEnumerateSupportedFormatsResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.supportedFormats);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class BarcodeDetectionProviderEnumerateSupportedFormatsResponseParamsProxyToResponder implements BarcodeDetectionProvider.EnumerateSupportedFormatsResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        BarcodeDetectionProviderEnumerateSupportedFormatsResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(int[] supportedFormats) {
            BarcodeDetectionProviderEnumerateSupportedFormatsResponseParams _response = new BarcodeDetectionProviderEnumerateSupportedFormatsResponseParams();
            _response.supportedFormats = supportedFormats;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(1, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
