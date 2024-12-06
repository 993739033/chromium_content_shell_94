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
import org.chromium.mojo.bindings.SideEffectFreeCloseable;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo.bindings.Union;
import org.chromium.mojo.system.Core;
import org.chromium.mojo.system.DataPipe;
import org.chromium.mojo.system.Handle;
import org.chromium.mojo.system.InvalidHandle;
import org.chromium.mojo_base.mojom.BigBuffer;
import org.chromium.network.mojom.UrlLoaderClient;
/* loaded from: classes2.dex */
class UrlLoaderClient_Internal {
    public static final Interface.Manager<UrlLoaderClient, UrlLoaderClient.Proxy> MANAGER = new Interface.Manager<UrlLoaderClient, UrlLoaderClient.Proxy>() { // from class: org.chromium.network.mojom.UrlLoaderClient_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "network.mojom.URLLoaderClient";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public UrlLoaderClient.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, UrlLoaderClient impl) {
            return new Stub(core, impl);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public UrlLoaderClient[] buildArray(int size) {
            return new UrlLoaderClient[size];
        }
    };
    private static final int ON_COMPLETE_ORDINAL = 7;
    private static final int ON_RECEIVE_CACHED_METADATA_ORDINAL = 4;
    private static final int ON_RECEIVE_EARLY_HINTS_ORDINAL = 0;
    private static final int ON_RECEIVE_REDIRECT_ORDINAL = 2;
    private static final int ON_RECEIVE_RESPONSE_ORDINAL = 1;
    private static final int ON_START_LOADING_RESPONSE_BODY_ORDINAL = 6;
    private static final int ON_TRANSFER_SIZE_UPDATED_ORDINAL = 5;
    private static final int ON_UPLOAD_PROGRESS_ORDINAL = 3;

    UrlLoaderClient_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements UrlLoaderClient.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.network.mojom.UrlLoaderClient
        public void onReceiveEarlyHints(EarlyHints earlyHints) {
            UrlLoaderClientOnReceiveEarlyHintsParams _message = new UrlLoaderClientOnReceiveEarlyHintsParams();
            _message.earlyHints = earlyHints;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }

        @Override // org.chromium.network.mojom.UrlLoaderClient
        public void onReceiveResponse(UrlResponseHead head) {
            UrlLoaderClientOnReceiveResponseParams _message = new UrlLoaderClientOnReceiveResponseParams();
            _message.head = head;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1)));
        }

        @Override // org.chromium.network.mojom.UrlLoaderClient
        public void onReceiveRedirect(UrlRequestRedirectInfo redirectInfo, UrlResponseHead head) {
            UrlLoaderClientOnReceiveRedirectParams _message = new UrlLoaderClientOnReceiveRedirectParams();
            _message.redirectInfo = redirectInfo;
            _message.head = head;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2)));
        }

        @Override // org.chromium.network.mojom.UrlLoaderClient
        public void onUploadProgress(long currentPosition, long totalSize, OnUploadProgressResponse callback) {
            UrlLoaderClientOnUploadProgressParams _message = new UrlLoaderClientOnUploadProgressParams();
            _message.currentPosition = currentPosition;
            _message.totalSize = totalSize;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3, 1, 0L)), new UrlLoaderClientOnUploadProgressResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.UrlLoaderClient
        public void onReceiveCachedMetadata(BigBuffer data) {
            UrlLoaderClientOnReceiveCachedMetadataParams _message = new UrlLoaderClientOnReceiveCachedMetadataParams();
            _message.data = data;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(4)));
        }

        @Override // org.chromium.network.mojom.UrlLoaderClient
        public void onTransferSizeUpdated(int transferSizeDiff) {
            UrlLoaderClientOnTransferSizeUpdatedParams _message = new UrlLoaderClientOnTransferSizeUpdatedParams();
            _message.transferSizeDiff = transferSizeDiff;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(5)));
        }

        @Override // org.chromium.network.mojom.UrlLoaderClient
        public void onStartLoadingResponseBody(DataPipe.ConsumerHandle body) {
            UrlLoaderClientOnStartLoadingResponseBodyParams _message = new UrlLoaderClientOnStartLoadingResponseBodyParams();
            _message.body = body;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(6)));
        }

        @Override // org.chromium.network.mojom.UrlLoaderClient
        public void onComplete(UrlLoaderCompletionStatus status) {
            UrlLoaderClientOnCompleteParams _message = new UrlLoaderClientOnCompleteParams();
            _message.status = status;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(7)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<UrlLoaderClient> {
        Stub(Core core, UrlLoaderClient impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(UrlLoaderClient_Internal.MANAGER, messageWithHeader);
                    case -1:
                    case 3:
                    default:
                        return false;
                    case 0:
                        UrlLoaderClientOnReceiveEarlyHintsParams data = UrlLoaderClientOnReceiveEarlyHintsParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onReceiveEarlyHints(data.earlyHints);
                        return true;
                    case 1:
                        UrlLoaderClientOnReceiveResponseParams data2 = UrlLoaderClientOnReceiveResponseParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onReceiveResponse(data2.head);
                        return true;
                    case 2:
                        UrlLoaderClientOnReceiveRedirectParams data3 = UrlLoaderClientOnReceiveRedirectParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onReceiveRedirect(data3.redirectInfo, data3.head);
                        return true;
                    case 4:
                        UrlLoaderClientOnReceiveCachedMetadataParams data4 = UrlLoaderClientOnReceiveCachedMetadataParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onReceiveCachedMetadata(data4.data);
                        return true;
                    case 5:
                        UrlLoaderClientOnTransferSizeUpdatedParams data5 = UrlLoaderClientOnTransferSizeUpdatedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onTransferSizeUpdated(data5.transferSizeDiff);
                        return true;
                    case 6:
                        UrlLoaderClientOnStartLoadingResponseBodyParams data6 = UrlLoaderClientOnStartLoadingResponseBodyParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onStartLoadingResponseBody(data6.body);
                        return true;
                    case 7:
                        UrlLoaderClientOnCompleteParams data7 = UrlLoaderClientOnCompleteParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onComplete(data7.status);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), UrlLoaderClient_Internal.MANAGER, messageWithHeader, receiver);
                    case 3:
                        UrlLoaderClientOnUploadProgressParams data = UrlLoaderClientOnUploadProgressParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onUploadProgress(data.currentPosition, data.totalSize, new UrlLoaderClientOnUploadProgressResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class UrlLoaderClientOnReceiveEarlyHintsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public EarlyHints earlyHints;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UrlLoaderClientOnReceiveEarlyHintsParams(int version) {
            super(16, version);
        }

        public UrlLoaderClientOnReceiveEarlyHintsParams() {
            this(0);
        }

        public static UrlLoaderClientOnReceiveEarlyHintsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UrlLoaderClientOnReceiveEarlyHintsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UrlLoaderClientOnReceiveEarlyHintsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UrlLoaderClientOnReceiveEarlyHintsParams result = new UrlLoaderClientOnReceiveEarlyHintsParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.earlyHints = EarlyHints.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.earlyHints, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class UrlLoaderClientOnReceiveResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public UrlResponseHead head;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UrlLoaderClientOnReceiveResponseParams(int version) {
            super(16, version);
        }

        public UrlLoaderClientOnReceiveResponseParams() {
            this(0);
        }

        public static UrlLoaderClientOnReceiveResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UrlLoaderClientOnReceiveResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UrlLoaderClientOnReceiveResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UrlLoaderClientOnReceiveResponseParams result = new UrlLoaderClientOnReceiveResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.head = UrlResponseHead.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.head, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class UrlLoaderClientOnReceiveRedirectParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public UrlResponseHead head;
        public UrlRequestRedirectInfo redirectInfo;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UrlLoaderClientOnReceiveRedirectParams(int version) {
            super(24, version);
        }

        public UrlLoaderClientOnReceiveRedirectParams() {
            this(0);
        }

        public static UrlLoaderClientOnReceiveRedirectParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UrlLoaderClientOnReceiveRedirectParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UrlLoaderClientOnReceiveRedirectParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UrlLoaderClientOnReceiveRedirectParams result = new UrlLoaderClientOnReceiveRedirectParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.redirectInfo = UrlRequestRedirectInfo.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.head = UrlResponseHead.decode(decoder12);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.redirectInfo, 8, false);
            encoder0.encode((Struct) this.head, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class UrlLoaderClientOnUploadProgressParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public long currentPosition;
        public long totalSize;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UrlLoaderClientOnUploadProgressParams(int version) {
            super(24, version);
        }

        public UrlLoaderClientOnUploadProgressParams() {
            this(0);
        }

        public static UrlLoaderClientOnUploadProgressParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UrlLoaderClientOnUploadProgressParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UrlLoaderClientOnUploadProgressParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UrlLoaderClientOnUploadProgressParams result = new UrlLoaderClientOnUploadProgressParams(elementsOrVersion);
                result.currentPosition = decoder0.readLong(8);
                result.totalSize = decoder0.readLong(16);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.currentPosition, 8);
            encoder0.encode(this.totalSize, 16);
        }
    }

    /* loaded from: classes2.dex */
    static final class UrlLoaderClientOnUploadProgressResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UrlLoaderClientOnUploadProgressResponseParams(int version) {
            super(8, version);
        }

        public UrlLoaderClientOnUploadProgressResponseParams() {
            this(0);
        }

        public static UrlLoaderClientOnUploadProgressResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UrlLoaderClientOnUploadProgressResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UrlLoaderClientOnUploadProgressResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UrlLoaderClientOnUploadProgressResponseParams result = new UrlLoaderClientOnUploadProgressResponseParams(elementsOrVersion);
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
    static class UrlLoaderClientOnUploadProgressResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final UrlLoaderClient.OnUploadProgressResponse mCallback;

        UrlLoaderClientOnUploadProgressResponseParamsForwardToCallback(UrlLoaderClient.OnUploadProgressResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(3, 2)) {
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
    static class UrlLoaderClientOnUploadProgressResponseParamsProxyToResponder implements UrlLoaderClient.OnUploadProgressResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        UrlLoaderClientOnUploadProgressResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            UrlLoaderClientOnUploadProgressResponseParams _response = new UrlLoaderClientOnUploadProgressResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(3, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class UrlLoaderClientOnReceiveCachedMetadataParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public BigBuffer data;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UrlLoaderClientOnReceiveCachedMetadataParams(int version) {
            super(24, version);
        }

        public UrlLoaderClientOnReceiveCachedMetadataParams() {
            this(0);
        }

        public static UrlLoaderClientOnReceiveCachedMetadataParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UrlLoaderClientOnReceiveCachedMetadataParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UrlLoaderClientOnReceiveCachedMetadataParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UrlLoaderClientOnReceiveCachedMetadataParams result = new UrlLoaderClientOnReceiveCachedMetadataParams(elementsOrVersion);
                result.data = BigBuffer.decode(decoder0, 8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Union) this.data, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class UrlLoaderClientOnTransferSizeUpdatedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int transferSizeDiff;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UrlLoaderClientOnTransferSizeUpdatedParams(int version) {
            super(16, version);
        }

        public UrlLoaderClientOnTransferSizeUpdatedParams() {
            this(0);
        }

        public static UrlLoaderClientOnTransferSizeUpdatedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UrlLoaderClientOnTransferSizeUpdatedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UrlLoaderClientOnTransferSizeUpdatedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UrlLoaderClientOnTransferSizeUpdatedParams result = new UrlLoaderClientOnTransferSizeUpdatedParams(elementsOrVersion);
                result.transferSizeDiff = decoder0.readInt(8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.transferSizeDiff, 8);
        }
    }

    /* loaded from: classes2.dex */
    static final class UrlLoaderClientOnStartLoadingResponseBodyParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public DataPipe.ConsumerHandle body;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UrlLoaderClientOnStartLoadingResponseBodyParams(int version) {
            super(16, version);
            this.body = InvalidHandle.INSTANCE;
        }

        public UrlLoaderClientOnStartLoadingResponseBodyParams() {
            this(0);
        }

        public static UrlLoaderClientOnStartLoadingResponseBodyParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UrlLoaderClientOnStartLoadingResponseBodyParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UrlLoaderClientOnStartLoadingResponseBodyParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UrlLoaderClientOnStartLoadingResponseBodyParams result = new UrlLoaderClientOnStartLoadingResponseBodyParams(elementsOrVersion);
                result.body = decoder0.readConsumerHandle(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Handle) this.body, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class UrlLoaderClientOnCompleteParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public UrlLoaderCompletionStatus status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UrlLoaderClientOnCompleteParams(int version) {
            super(16, version);
        }

        public UrlLoaderClientOnCompleteParams() {
            this(0);
        }

        public static UrlLoaderClientOnCompleteParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UrlLoaderClientOnCompleteParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UrlLoaderClientOnCompleteParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UrlLoaderClientOnCompleteParams result = new UrlLoaderClientOnCompleteParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.status = UrlLoaderCompletionStatus.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.status, 8, false);
        }
    }
}
