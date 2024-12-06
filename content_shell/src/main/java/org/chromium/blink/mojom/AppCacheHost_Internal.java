package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.AppCacheHost;
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
import org.chromium.mojo.system.Core;
import org.chromium.mojo_base.mojom.UnguessableToken;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
class AppCacheHost_Internal {
    private static final int GET_RESOURCE_LIST_ORDINAL = 7;
    private static final int GET_STATUS_ORDINAL = 4;
    public static final Interface.Manager<AppCacheHost, AppCacheHost.Proxy> MANAGER = new Interface.Manager<AppCacheHost, AppCacheHost.Proxy>() { // from class: org.chromium.blink.mojom.AppCacheHost_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.AppCacheHost";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public AppCacheHost.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, AppCacheHost impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public AppCacheHost[] buildArray(int size) {
            return new AppCacheHost[size];
        }
    };
    private static final int MARK_AS_FOREIGN_ENTRY_ORDINAL = 3;
    private static final int SELECT_CACHE_FOR_WORKER_ORDINAL = 2;
    private static final int SELECT_CACHE_ORDINAL = 1;
    private static final int SET_SPAWNING_HOST_ID_ORDINAL = 0;
    private static final int START_UPDATE_ORDINAL = 5;
    private static final int SWAP_CACHE_ORDINAL = 6;

    AppCacheHost_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements AppCacheHost.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.AppCacheHost
        public void setSpawningHostId(UnguessableToken spawningHostId) {
            AppCacheHostSetSpawningHostIdParams _message = new AppCacheHostSetSpawningHostIdParams();
            _message.spawningHostId = spawningHostId;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }

        @Override // org.chromium.blink.mojom.AppCacheHost
        public void selectCache(Url documentUrl, long appcacheDocumentWasLoadedFrom, Url optManifestUrl) {
            AppCacheHostSelectCacheParams _message = new AppCacheHostSelectCacheParams();
            _message.documentUrl = documentUrl;
            _message.appcacheDocumentWasLoadedFrom = appcacheDocumentWasLoadedFrom;
            _message.optManifestUrl = optManifestUrl;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1)));
        }

        @Override // org.chromium.blink.mojom.AppCacheHost
        public void selectCacheForWorker(long appcacheId) {
            AppCacheHostSelectCacheForWorkerParams _message = new AppCacheHostSelectCacheForWorkerParams();
            _message.appcacheId = appcacheId;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2)));
        }

        @Override // org.chromium.blink.mojom.AppCacheHost
        public void markAsForeignEntry(Url documentUrl, long appcacheDocumentWasLoadedFrom) {
            AppCacheHostMarkAsForeignEntryParams _message = new AppCacheHostMarkAsForeignEntryParams();
            _message.documentUrl = documentUrl;
            _message.appcacheDocumentWasLoadedFrom = appcacheDocumentWasLoadedFrom;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3)));
        }

        @Override // org.chromium.blink.mojom.AppCacheHost
        public void getStatus(GetStatusResponse callback) {
            AppCacheHostGetStatusParams _message = new AppCacheHostGetStatusParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(4, 1, 0L)), new AppCacheHostGetStatusResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.AppCacheHost
        public void startUpdate(StartUpdateResponse callback) {
            AppCacheHostStartUpdateParams _message = new AppCacheHostStartUpdateParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(5, 1, 0L)), new AppCacheHostStartUpdateResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.AppCacheHost
        public void swapCache(SwapCacheResponse callback) {
            AppCacheHostSwapCacheParams _message = new AppCacheHostSwapCacheParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(6, 1, 0L)), new AppCacheHostSwapCacheResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.AppCacheHost
        public void getResourceList(GetResourceListResponse callback) {
            AppCacheHostGetResourceListParams _message = new AppCacheHostGetResourceListParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(7, 1, 0L)), new AppCacheHostGetResourceListResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<AppCacheHost> {
        Stub(Core core, AppCacheHost impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(AppCacheHost_Internal.MANAGER, messageWithHeader);
                    case -1:
                    default:
                        return false;
                    case 0:
                        getImpl().setSpawningHostId(AppCacheHostSetSpawningHostIdParams.deserialize(messageWithHeader.getPayload()).spawningHostId);
                        return true;
                    case 1:
                        AppCacheHostSelectCacheParams data = AppCacheHostSelectCacheParams.deserialize(messageWithHeader.getPayload());
                        getImpl().selectCache(data.documentUrl, data.appcacheDocumentWasLoadedFrom, data.optManifestUrl);
                        return true;
                    case 2:
                        AppCacheHostSelectCacheForWorkerParams data2 = AppCacheHostSelectCacheForWorkerParams.deserialize(messageWithHeader.getPayload());
                        getImpl().selectCacheForWorker(data2.appcacheId);
                        return true;
                    case 3:
                        AppCacheHostMarkAsForeignEntryParams data3 = AppCacheHostMarkAsForeignEntryParams.deserialize(messageWithHeader.getPayload());
                        getImpl().markAsForeignEntry(data3.documentUrl, data3.appcacheDocumentWasLoadedFrom);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), AppCacheHost_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    default:
                        return false;
                    case 4:
                        AppCacheHostGetStatusParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getStatus(new AppCacheHostGetStatusResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 5:
                        AppCacheHostStartUpdateParams.deserialize(messageWithHeader.getPayload());
                        getImpl().startUpdate(new AppCacheHostStartUpdateResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 6:
                        AppCacheHostSwapCacheParams.deserialize(messageWithHeader.getPayload());
                        getImpl().swapCache(new AppCacheHostSwapCacheResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 7:
                        AppCacheHostGetResourceListParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getResourceList(new AppCacheHostGetResourceListResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                }
            } catch (DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class AppCacheHostSetSpawningHostIdParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public UnguessableToken spawningHostId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private AppCacheHostSetSpawningHostIdParams(int version) {
            super(16, version);
        }

        public AppCacheHostSetSpawningHostIdParams() {
            this(0);
        }

        public static AppCacheHostSetSpawningHostIdParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static AppCacheHostSetSpawningHostIdParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static AppCacheHostSetSpawningHostIdParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                AppCacheHostSetSpawningHostIdParams result = new AppCacheHostSetSpawningHostIdParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.spawningHostId = UnguessableToken.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.spawningHostId, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class AppCacheHostSelectCacheParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public long appcacheDocumentWasLoadedFrom;
        public Url documentUrl;
        public Url optManifestUrl;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private AppCacheHostSelectCacheParams(int version) {
            super(32, version);
        }

        public AppCacheHostSelectCacheParams() {
            this(0);
        }

        public static AppCacheHostSelectCacheParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static AppCacheHostSelectCacheParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static AppCacheHostSelectCacheParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                AppCacheHostSelectCacheParams result = new AppCacheHostSelectCacheParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.documentUrl = Url.decode(decoder1);
                result.appcacheDocumentWasLoadedFrom = decoder0.readLong(16);
                Decoder decoder12 = decoder0.readPointer(24, false);
                result.optManifestUrl = Url.decode(decoder12);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.documentUrl, 8, false);
            encoder0.encode(this.appcacheDocumentWasLoadedFrom, 16);
            encoder0.encode((Struct) this.optManifestUrl, 24, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class AppCacheHostSelectCacheForWorkerParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public long appcacheId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private AppCacheHostSelectCacheForWorkerParams(int version) {
            super(16, version);
        }

        public AppCacheHostSelectCacheForWorkerParams() {
            this(0);
        }

        public static AppCacheHostSelectCacheForWorkerParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static AppCacheHostSelectCacheForWorkerParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static AppCacheHostSelectCacheForWorkerParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                AppCacheHostSelectCacheForWorkerParams result = new AppCacheHostSelectCacheForWorkerParams(elementsOrVersion);
                result.appcacheId = decoder0.readLong(8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.appcacheId, 8);
        }
    }

    /* loaded from: classes2.dex */
    static final class AppCacheHostMarkAsForeignEntryParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public long appcacheDocumentWasLoadedFrom;
        public Url documentUrl;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private AppCacheHostMarkAsForeignEntryParams(int version) {
            super(24, version);
        }

        public AppCacheHostMarkAsForeignEntryParams() {
            this(0);
        }

        public static AppCacheHostMarkAsForeignEntryParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static AppCacheHostMarkAsForeignEntryParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static AppCacheHostMarkAsForeignEntryParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                AppCacheHostMarkAsForeignEntryParams result = new AppCacheHostMarkAsForeignEntryParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.documentUrl = Url.decode(decoder1);
                result.appcacheDocumentWasLoadedFrom = decoder0.readLong(16);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.documentUrl, 8, false);
            encoder0.encode(this.appcacheDocumentWasLoadedFrom, 16);
        }
    }

    /* loaded from: classes2.dex */
    static final class AppCacheHostGetStatusParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private AppCacheHostGetStatusParams(int version) {
            super(8, version);
        }

        public AppCacheHostGetStatusParams() {
            this(0);
        }

        public static AppCacheHostGetStatusParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static AppCacheHostGetStatusParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static AppCacheHostGetStatusParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                AppCacheHostGetStatusParams result = new AppCacheHostGetStatusParams(elementsOrVersion);
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
    public static final class AppCacheHostGetStatusResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private AppCacheHostGetStatusResponseParams(int version) {
            super(16, version);
        }

        public AppCacheHostGetStatusResponseParams() {
            this(0);
        }

        public static AppCacheHostGetStatusResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static AppCacheHostGetStatusResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static AppCacheHostGetStatusResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                AppCacheHostGetStatusResponseParams result = new AppCacheHostGetStatusResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.status = readInt;
                AppCacheStatus.validate(readInt);
                result.status = AppCacheStatus.toKnownValue(result.status);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.status, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class AppCacheHostGetStatusResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final AppCacheHost.GetStatusResponse mCallback;

        AppCacheHostGetStatusResponseParamsForwardToCallback(AppCacheHost.GetStatusResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(4, 6)) {
                    return false;
                }
                AppCacheHostGetStatusResponseParams response = AppCacheHostGetStatusResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.status));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class AppCacheHostGetStatusResponseParamsProxyToResponder implements AppCacheHost.GetStatusResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        AppCacheHostGetStatusResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer status) {
            AppCacheHostGetStatusResponseParams _response = new AppCacheHostGetStatusResponseParams();
            _response.status = status.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(4, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class AppCacheHostStartUpdateParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private AppCacheHostStartUpdateParams(int version) {
            super(8, version);
        }

        public AppCacheHostStartUpdateParams() {
            this(0);
        }

        public static AppCacheHostStartUpdateParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static AppCacheHostStartUpdateParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static AppCacheHostStartUpdateParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                AppCacheHostStartUpdateParams result = new AppCacheHostStartUpdateParams(elementsOrVersion);
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
    public static final class AppCacheHostStartUpdateResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private AppCacheHostStartUpdateResponseParams(int version) {
            super(16, version);
        }

        public AppCacheHostStartUpdateResponseParams() {
            this(0);
        }

        public static AppCacheHostStartUpdateResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static AppCacheHostStartUpdateResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static AppCacheHostStartUpdateResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                AppCacheHostStartUpdateResponseParams result = new AppCacheHostStartUpdateResponseParams(elementsOrVersion);
                result.success = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.success, 8, 0);
        }
    }

    /* loaded from: classes2.dex */
    static class AppCacheHostStartUpdateResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final AppCacheHost.StartUpdateResponse mCallback;

        AppCacheHostStartUpdateResponseParamsForwardToCallback(AppCacheHost.StartUpdateResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(5, 6)) {
                    return false;
                }
                AppCacheHostStartUpdateResponseParams response = AppCacheHostStartUpdateResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.success));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class AppCacheHostStartUpdateResponseParamsProxyToResponder implements AppCacheHost.StartUpdateResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        AppCacheHostStartUpdateResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Boolean success) {
            AppCacheHostStartUpdateResponseParams _response = new AppCacheHostStartUpdateResponseParams();
            _response.success = success.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(5, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class AppCacheHostSwapCacheParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private AppCacheHostSwapCacheParams(int version) {
            super(8, version);
        }

        public AppCacheHostSwapCacheParams() {
            this(0);
        }

        public static AppCacheHostSwapCacheParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static AppCacheHostSwapCacheParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static AppCacheHostSwapCacheParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                AppCacheHostSwapCacheParams result = new AppCacheHostSwapCacheParams(elementsOrVersion);
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
    public static final class AppCacheHostSwapCacheResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private AppCacheHostSwapCacheResponseParams(int version) {
            super(16, version);
        }

        public AppCacheHostSwapCacheResponseParams() {
            this(0);
        }

        public static AppCacheHostSwapCacheResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static AppCacheHostSwapCacheResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static AppCacheHostSwapCacheResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                AppCacheHostSwapCacheResponseParams result = new AppCacheHostSwapCacheResponseParams(elementsOrVersion);
                result.success = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.success, 8, 0);
        }
    }

    /* loaded from: classes2.dex */
    static class AppCacheHostSwapCacheResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final AppCacheHost.SwapCacheResponse mCallback;

        AppCacheHostSwapCacheResponseParamsForwardToCallback(AppCacheHost.SwapCacheResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(6, 6)) {
                    return false;
                }
                AppCacheHostSwapCacheResponseParams response = AppCacheHostSwapCacheResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.success));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class AppCacheHostSwapCacheResponseParamsProxyToResponder implements AppCacheHost.SwapCacheResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        AppCacheHostSwapCacheResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Boolean success) {
            AppCacheHostSwapCacheResponseParams _response = new AppCacheHostSwapCacheResponseParams();
            _response.success = success.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(6, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class AppCacheHostGetResourceListParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private AppCacheHostGetResourceListParams(int version) {
            super(8, version);
        }

        public AppCacheHostGetResourceListParams() {
            this(0);
        }

        public static AppCacheHostGetResourceListParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static AppCacheHostGetResourceListParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static AppCacheHostGetResourceListParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                AppCacheHostGetResourceListParams result = new AppCacheHostGetResourceListParams(elementsOrVersion);
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
    public static final class AppCacheHostGetResourceListResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public AppCacheResourceInfo[] resources;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private AppCacheHostGetResourceListResponseParams(int version) {
            super(16, version);
        }

        public AppCacheHostGetResourceListResponseParams() {
            this(0);
        }

        public static AppCacheHostGetResourceListResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static AppCacheHostGetResourceListResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static AppCacheHostGetResourceListResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                AppCacheHostGetResourceListResponseParams result = new AppCacheHostGetResourceListResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.resources = new AppCacheResourceInfo[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.resources[i1] = AppCacheResourceInfo.decode(decoder2);
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
            AppCacheResourceInfo[] appCacheResourceInfoArr = this.resources;
            if (appCacheResourceInfoArr == null) {
                encoder0.encodeNullPointer(8, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(appCacheResourceInfoArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                AppCacheResourceInfo[] appCacheResourceInfoArr2 = this.resources;
                if (i0 < appCacheResourceInfoArr2.length) {
                    encoder1.encode((Struct) appCacheResourceInfoArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static class AppCacheHostGetResourceListResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final AppCacheHost.GetResourceListResponse mCallback;

        AppCacheHostGetResourceListResponseParamsForwardToCallback(AppCacheHost.GetResourceListResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(7, 6)) {
                    return false;
                }
                AppCacheHostGetResourceListResponseParams response = AppCacheHostGetResourceListResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.resources);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class AppCacheHostGetResourceListResponseParamsProxyToResponder implements AppCacheHost.GetResourceListResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        AppCacheHostGetResourceListResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(AppCacheResourceInfo[] resources) {
            AppCacheHostGetResourceListResponseParams _response = new AppCacheHostGetResourceListResponseParams();
            _response.resources = resources;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(7, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
