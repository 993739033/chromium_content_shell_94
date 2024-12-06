package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.CacheStorageCache;
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
import org.chromium.mojo_base.mojom.BigBuffer;
import org.chromium.mojo_base.mojom.Time;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
class CacheStorageCache_Internal {
    private static final int BATCH_ORDINAL = 4;
    private static final int GET_ALL_MATCHED_ENTRIES_ORDINAL = 2;
    private static final int KEYS_ORDINAL = 3;
    public static final Interface.Manager<CacheStorageCache, CacheStorageCache.Proxy> MANAGER = new Interface.Manager<CacheStorageCache, CacheStorageCache.Proxy>() { // from class: org.chromium.blink.mojom.CacheStorageCache_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.CacheStorageCache";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public CacheStorageCache.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, CacheStorageCache impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public CacheStorageCache[] buildArray(int size) {
            return new CacheStorageCache[size];
        }
    };
    private static final int MATCH_ALL_ORDINAL = 1;
    private static final int MATCH_ORDINAL = 0;
    private static final int WRITE_SIDE_DATA_ORDINAL = 5;

    CacheStorageCache_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements CacheStorageCache.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.CacheStorageCache
        public void match(FetchApiRequest request, CacheQueryOptions queryOptions, boolean inRelatedFetchEvent, long traceId, MatchResponse callback) {
            CacheStorageCacheMatchParams _message = new CacheStorageCacheMatchParams();
            _message.request = request;
            _message.queryOptions = queryOptions;
            _message.inRelatedFetchEvent = inRelatedFetchEvent;
            _message.traceId = traceId;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new CacheStorageCacheMatchResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.CacheStorageCache
        public void matchAll(FetchApiRequest request, CacheQueryOptions queryOptions, long traceId, MatchAllResponse callback) {
            CacheStorageCacheMatchAllParams _message = new CacheStorageCacheMatchAllParams();
            _message.request = request;
            _message.queryOptions = queryOptions;
            _message.traceId = traceId;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1, 1, 0L)), new CacheStorageCacheMatchAllResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.CacheStorageCache
        public void getAllMatchedEntries(FetchApiRequest request, CacheQueryOptions queryOptions, long traceId, GetAllMatchedEntriesResponse callback) {
            CacheStorageCacheGetAllMatchedEntriesParams _message = new CacheStorageCacheGetAllMatchedEntriesParams();
            _message.request = request;
            _message.queryOptions = queryOptions;
            _message.traceId = traceId;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2, 1, 0L)), new CacheStorageCacheGetAllMatchedEntriesResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.CacheStorageCache
        public void keys(FetchApiRequest request, CacheQueryOptions queryOptions, long traceId, KeysResponse callback) {
            CacheStorageCacheKeysParams _message = new CacheStorageCacheKeysParams();
            _message.request = request;
            _message.queryOptions = queryOptions;
            _message.traceId = traceId;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3, 1, 0L)), new CacheStorageCacheKeysResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.CacheStorageCache
        public void batch(BatchOperation[] batchOperations, long traceId, BatchResponse callback) {
            CacheStorageCacheBatchParams _message = new CacheStorageCacheBatchParams();
            _message.batchOperations = batchOperations;
            _message.traceId = traceId;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(4, 1, 0L)), new CacheStorageCacheBatchResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.CacheStorageCache
        public void writeSideData(Url url, Time expectedResponseTime, BigBuffer data, long traceId, WriteSideDataResponse callback) {
            CacheStorageCacheWriteSideDataParams _message = new CacheStorageCacheWriteSideDataParams();
            _message.url = url;
            _message.expectedResponseTime = expectedResponseTime;
            _message.data = data;
            _message.traceId = traceId;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(5, 1, 0L)), new CacheStorageCacheWriteSideDataResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<CacheStorageCache> {
        Stub(Core core, CacheStorageCache impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(CacheStorageCache_Internal.MANAGER, messageWithHeader);
                    default:
                        return false;
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), CacheStorageCache_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        CacheStorageCacheMatchParams data = CacheStorageCacheMatchParams.deserialize(messageWithHeader.getPayload());
                        getImpl().match(data.request, data.queryOptions, data.inRelatedFetchEvent, data.traceId, new CacheStorageCacheMatchResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 1:
                        CacheStorageCacheMatchAllParams data2 = CacheStorageCacheMatchAllParams.deserialize(messageWithHeader.getPayload());
                        getImpl().matchAll(data2.request, data2.queryOptions, data2.traceId, new CacheStorageCacheMatchAllResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 2:
                        CacheStorageCacheGetAllMatchedEntriesParams data3 = CacheStorageCacheGetAllMatchedEntriesParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getAllMatchedEntries(data3.request, data3.queryOptions, data3.traceId, new CacheStorageCacheGetAllMatchedEntriesResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 3:
                        CacheStorageCacheKeysParams data4 = CacheStorageCacheKeysParams.deserialize(messageWithHeader.getPayload());
                        getImpl().keys(data4.request, data4.queryOptions, data4.traceId, new CacheStorageCacheKeysResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 4:
                        CacheStorageCacheBatchParams data5 = CacheStorageCacheBatchParams.deserialize(messageWithHeader.getPayload());
                        getImpl().batch(data5.batchOperations, data5.traceId, new CacheStorageCacheBatchResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 5:
                        CacheStorageCacheWriteSideDataParams data6 = CacheStorageCacheWriteSideDataParams.deserialize(messageWithHeader.getPayload());
                        getImpl().writeSideData(data6.url, data6.expectedResponseTime, data6.data, data6.traceId, new CacheStorageCacheWriteSideDataResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class CacheStorageCacheMatchParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 40;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean inRelatedFetchEvent;
        public CacheQueryOptions queryOptions;
        public FetchApiRequest request;
        public long traceId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private CacheStorageCacheMatchParams(int version) {
            super(40, version);
        }

        public CacheStorageCacheMatchParams() {
            this(0);
        }

        public static CacheStorageCacheMatchParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static CacheStorageCacheMatchParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static CacheStorageCacheMatchParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                CacheStorageCacheMatchParams result = new CacheStorageCacheMatchParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.request = FetchApiRequest.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.queryOptions = CacheQueryOptions.decode(decoder12);
                result.inRelatedFetchEvent = decoder0.readBoolean(24, 0);
                result.traceId = decoder0.readLong(32);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.request, 8, false);
            encoder0.encode((Struct) this.queryOptions, 16, false);
            encoder0.encode(this.inRelatedFetchEvent, 24, 0);
            encoder0.encode(this.traceId, 32);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class CacheStorageCacheMatchResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public MatchResult result;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private CacheStorageCacheMatchResponseParams(int version) {
            super(24, version);
        }

        public CacheStorageCacheMatchResponseParams() {
            this(0);
        }

        public static CacheStorageCacheMatchResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static CacheStorageCacheMatchResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static CacheStorageCacheMatchResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                CacheStorageCacheMatchResponseParams result = new CacheStorageCacheMatchResponseParams(elementsOrVersion);
                result.result = MatchResult.decode(decoder0, 8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Union) this.result, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static class CacheStorageCacheMatchResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final CacheStorageCache.MatchResponse mCallback;

        CacheStorageCacheMatchResponseParamsForwardToCallback(CacheStorageCache.MatchResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(0, 2)) {
                    return false;
                }
                CacheStorageCacheMatchResponseParams response = CacheStorageCacheMatchResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.result);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class CacheStorageCacheMatchResponseParamsProxyToResponder implements CacheStorageCache.MatchResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        CacheStorageCacheMatchResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(MatchResult result) {
            CacheStorageCacheMatchResponseParams _response = new CacheStorageCacheMatchResponseParams();
            _response.result = result;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class CacheStorageCacheMatchAllParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public CacheQueryOptions queryOptions;
        public FetchApiRequest request;
        public long traceId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private CacheStorageCacheMatchAllParams(int version) {
            super(32, version);
        }

        public CacheStorageCacheMatchAllParams() {
            this(0);
        }

        public static CacheStorageCacheMatchAllParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static CacheStorageCacheMatchAllParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static CacheStorageCacheMatchAllParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                CacheStorageCacheMatchAllParams result = new CacheStorageCacheMatchAllParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, true);
                result.request = FetchApiRequest.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.queryOptions = CacheQueryOptions.decode(decoder12);
                result.traceId = decoder0.readLong(24);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.request, 8, true);
            encoder0.encode((Struct) this.queryOptions, 16, false);
            encoder0.encode(this.traceId, 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class CacheStorageCacheMatchAllResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public MatchAllResult result;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private CacheStorageCacheMatchAllResponseParams(int version) {
            super(24, version);
        }

        public CacheStorageCacheMatchAllResponseParams() {
            this(0);
        }

        public static CacheStorageCacheMatchAllResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static CacheStorageCacheMatchAllResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static CacheStorageCacheMatchAllResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                CacheStorageCacheMatchAllResponseParams result = new CacheStorageCacheMatchAllResponseParams(elementsOrVersion);
                result.result = MatchAllResult.decode(decoder0, 8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Union) this.result, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static class CacheStorageCacheMatchAllResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final CacheStorageCache.MatchAllResponse mCallback;

        CacheStorageCacheMatchAllResponseParamsForwardToCallback(CacheStorageCache.MatchAllResponse callback) {
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
                CacheStorageCacheMatchAllResponseParams response = CacheStorageCacheMatchAllResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.result);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class CacheStorageCacheMatchAllResponseParamsProxyToResponder implements CacheStorageCache.MatchAllResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        CacheStorageCacheMatchAllResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(MatchAllResult result) {
            CacheStorageCacheMatchAllResponseParams _response = new CacheStorageCacheMatchAllResponseParams();
            _response.result = result;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(1, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class CacheStorageCacheGetAllMatchedEntriesParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public CacheQueryOptions queryOptions;
        public FetchApiRequest request;
        public long traceId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private CacheStorageCacheGetAllMatchedEntriesParams(int version) {
            super(32, version);
        }

        public CacheStorageCacheGetAllMatchedEntriesParams() {
            this(0);
        }

        public static CacheStorageCacheGetAllMatchedEntriesParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static CacheStorageCacheGetAllMatchedEntriesParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static CacheStorageCacheGetAllMatchedEntriesParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                CacheStorageCacheGetAllMatchedEntriesParams result = new CacheStorageCacheGetAllMatchedEntriesParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, true);
                result.request = FetchApiRequest.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.queryOptions = CacheQueryOptions.decode(decoder12);
                result.traceId = decoder0.readLong(24);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.request, 8, true);
            encoder0.encode((Struct) this.queryOptions, 16, false);
            encoder0.encode(this.traceId, 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class CacheStorageCacheGetAllMatchedEntriesResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public GetAllMatchedEntriesResult result;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private CacheStorageCacheGetAllMatchedEntriesResponseParams(int version) {
            super(24, version);
        }

        public CacheStorageCacheGetAllMatchedEntriesResponseParams() {
            this(0);
        }

        public static CacheStorageCacheGetAllMatchedEntriesResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static CacheStorageCacheGetAllMatchedEntriesResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static CacheStorageCacheGetAllMatchedEntriesResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                CacheStorageCacheGetAllMatchedEntriesResponseParams result = new CacheStorageCacheGetAllMatchedEntriesResponseParams(elementsOrVersion);
                result.result = GetAllMatchedEntriesResult.decode(decoder0, 8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Union) this.result, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static class CacheStorageCacheGetAllMatchedEntriesResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final CacheStorageCache.GetAllMatchedEntriesResponse mCallback;

        CacheStorageCacheGetAllMatchedEntriesResponseParamsForwardToCallback(CacheStorageCache.GetAllMatchedEntriesResponse callback) {
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
                CacheStorageCacheGetAllMatchedEntriesResponseParams response = CacheStorageCacheGetAllMatchedEntriesResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.result);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class CacheStorageCacheGetAllMatchedEntriesResponseParamsProxyToResponder implements CacheStorageCache.GetAllMatchedEntriesResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        CacheStorageCacheGetAllMatchedEntriesResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(GetAllMatchedEntriesResult result) {
            CacheStorageCacheGetAllMatchedEntriesResponseParams _response = new CacheStorageCacheGetAllMatchedEntriesResponseParams();
            _response.result = result;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(2, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class CacheStorageCacheKeysParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public CacheQueryOptions queryOptions;
        public FetchApiRequest request;
        public long traceId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private CacheStorageCacheKeysParams(int version) {
            super(32, version);
        }

        public CacheStorageCacheKeysParams() {
            this(0);
        }

        public static CacheStorageCacheKeysParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static CacheStorageCacheKeysParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static CacheStorageCacheKeysParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                CacheStorageCacheKeysParams result = new CacheStorageCacheKeysParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, true);
                result.request = FetchApiRequest.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.queryOptions = CacheQueryOptions.decode(decoder12);
                result.traceId = decoder0.readLong(24);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.request, 8, true);
            encoder0.encode((Struct) this.queryOptions, 16, false);
            encoder0.encode(this.traceId, 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class CacheStorageCacheKeysResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public CacheKeysResult result;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private CacheStorageCacheKeysResponseParams(int version) {
            super(24, version);
        }

        public CacheStorageCacheKeysResponseParams() {
            this(0);
        }

        public static CacheStorageCacheKeysResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static CacheStorageCacheKeysResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static CacheStorageCacheKeysResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                CacheStorageCacheKeysResponseParams result = new CacheStorageCacheKeysResponseParams(elementsOrVersion);
                result.result = CacheKeysResult.decode(decoder0, 8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Union) this.result, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static class CacheStorageCacheKeysResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final CacheStorageCache.KeysResponse mCallback;

        CacheStorageCacheKeysResponseParamsForwardToCallback(CacheStorageCache.KeysResponse callback) {
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
                CacheStorageCacheKeysResponseParams response = CacheStorageCacheKeysResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.result);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class CacheStorageCacheKeysResponseParamsProxyToResponder implements CacheStorageCache.KeysResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        CacheStorageCacheKeysResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(CacheKeysResult result) {
            CacheStorageCacheKeysResponseParams _response = new CacheStorageCacheKeysResponseParams();
            _response.result = result;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(3, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class CacheStorageCacheBatchParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public BatchOperation[] batchOperations;
        public long traceId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private CacheStorageCacheBatchParams(int version) {
            super(24, version);
        }

        public CacheStorageCacheBatchParams() {
            this(0);
        }

        public static CacheStorageCacheBatchParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static CacheStorageCacheBatchParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static CacheStorageCacheBatchParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                CacheStorageCacheBatchParams result = new CacheStorageCacheBatchParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.batchOperations = new BatchOperation[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.batchOperations[i1] = BatchOperation.decode(decoder2);
                }
                result.traceId = decoder0.readLong(16);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            BatchOperation[] batchOperationArr = this.batchOperations;
            if (batchOperationArr == null) {
                encoder0.encodeNullPointer(8, false);
            } else {
                Encoder encoder1 = encoder0.encodePointerArray(batchOperationArr.length, 8, -1);
                int i0 = 0;
                while (true) {
                    BatchOperation[] batchOperationArr2 = this.batchOperations;
                    if (i0 >= batchOperationArr2.length) {
                        break;
                    }
                    encoder1.encode((Struct) batchOperationArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                }
            }
            encoder0.encode(this.traceId, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class CacheStorageCacheBatchResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public CacheStorageVerboseError result;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private CacheStorageCacheBatchResponseParams(int version) {
            super(16, version);
        }

        public CacheStorageCacheBatchResponseParams() {
            this(0);
        }

        public static CacheStorageCacheBatchResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static CacheStorageCacheBatchResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static CacheStorageCacheBatchResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                CacheStorageCacheBatchResponseParams result = new CacheStorageCacheBatchResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.result = CacheStorageVerboseError.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.result, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static class CacheStorageCacheBatchResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final CacheStorageCache.BatchResponse mCallback;

        CacheStorageCacheBatchResponseParamsForwardToCallback(CacheStorageCache.BatchResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(4, 2)) {
                    return false;
                }
                CacheStorageCacheBatchResponseParams response = CacheStorageCacheBatchResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.result);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class CacheStorageCacheBatchResponseParamsProxyToResponder implements CacheStorageCache.BatchResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        CacheStorageCacheBatchResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(CacheStorageVerboseError result) {
            CacheStorageCacheBatchResponseParams _response = new CacheStorageCacheBatchResponseParams();
            _response.result = result;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(4, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class CacheStorageCacheWriteSideDataParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 48;
        private static final DataHeader[] VERSION_ARRAY;
        public BigBuffer data;
        public Time expectedResponseTime;
        public long traceId;
        public Url url;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(48, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private CacheStorageCacheWriteSideDataParams(int version) {
            super(48, version);
        }

        public CacheStorageCacheWriteSideDataParams() {
            this(0);
        }

        public static CacheStorageCacheWriteSideDataParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static CacheStorageCacheWriteSideDataParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static CacheStorageCacheWriteSideDataParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                CacheStorageCacheWriteSideDataParams result = new CacheStorageCacheWriteSideDataParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.url = Url.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.expectedResponseTime = Time.decode(decoder12);
                result.data = BigBuffer.decode(decoder0, 24);
                result.traceId = decoder0.readLong(40);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.url, 8, false);
            encoder0.encode((Struct) this.expectedResponseTime, 16, false);
            encoder0.encode((Union) this.data, 24, false);
            encoder0.encode(this.traceId, 40);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class CacheStorageCacheWriteSideDataResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int result;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private CacheStorageCacheWriteSideDataResponseParams(int version) {
            super(16, version);
        }

        public CacheStorageCacheWriteSideDataResponseParams() {
            this(0);
        }

        public static CacheStorageCacheWriteSideDataResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static CacheStorageCacheWriteSideDataResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static CacheStorageCacheWriteSideDataResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                CacheStorageCacheWriteSideDataResponseParams result = new CacheStorageCacheWriteSideDataResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.result = readInt;
                CacheStorageError.validate(readInt);
                result.result = CacheStorageError.toKnownValue(result.result);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.result, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class CacheStorageCacheWriteSideDataResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final CacheStorageCache.WriteSideDataResponse mCallback;

        CacheStorageCacheWriteSideDataResponseParamsForwardToCallback(CacheStorageCache.WriteSideDataResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(5, 2)) {
                    return false;
                }
                CacheStorageCacheWriteSideDataResponseParams response = CacheStorageCacheWriteSideDataResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.result));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class CacheStorageCacheWriteSideDataResponseParamsProxyToResponder implements CacheStorageCache.WriteSideDataResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        CacheStorageCacheWriteSideDataResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer result) {
            CacheStorageCacheWriteSideDataResponseParams _response = new CacheStorageCacheWriteSideDataResponseParams();
            _response.result = result.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(5, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
