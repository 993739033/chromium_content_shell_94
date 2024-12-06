package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;

import org.chromium.blink.mojom.QuotaManagerHost;
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

/* loaded from: classes2.dex */
class QuotaManagerHost_Internal {
    private static final int ADD_CHANGE_LISTENER_ORDINAL = 0;
    public static final Interface.Manager<QuotaManagerHost, QuotaManagerHost.Proxy> MANAGER = new Interface.Manager<QuotaManagerHost, QuotaManagerHost.Proxy>() { // from class: org.chromium.blink.mojom.QuotaManagerHost_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.QuotaManagerHost";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public QuotaManagerHost.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, QuotaManagerHost impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public QuotaManagerHost[] buildArray(int size) {
            return new QuotaManagerHost[size];
        }
    };
    private static final int QUERY_STORAGE_USAGE_AND_QUOTA_ORDINAL = 1;
    private static final int REQUEST_STORAGE_QUOTA_ORDINAL = 2;

    QuotaManagerHost_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements QuotaManagerHost.Proxy {
        @Override
        // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.QuotaManagerHost
        public void addChangeListener(QuotaChangeListener listener, AddChangeListenerResponse callback) {
            QuotaManagerHostAddChangeListenerParams _message = new QuotaManagerHostAddChangeListenerParams();
            _message.listener = listener;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new QuotaManagerHostAddChangeListenerResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.QuotaManagerHost
        public void queryStorageUsageAndQuota(int storageType, QueryStorageUsageAndQuotaResponse callback) {
            QuotaManagerHostQueryStorageUsageAndQuotaParams _message = new QuotaManagerHostQueryStorageUsageAndQuotaParams();
            _message.storageType = storageType;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1, 1, 0L)), new QuotaManagerHostQueryStorageUsageAndQuotaResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.QuotaManagerHost
        public void requestStorageQuota(int storageType, long requestedSize, RequestStorageQuotaResponse callback) {
            QuotaManagerHostRequestStorageQuotaParams _message = new QuotaManagerHostRequestStorageQuotaParams();
            _message.storageType = storageType;
            _message.requestedSize = requestedSize;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2, 1, 0L)), new QuotaManagerHostRequestStorageQuotaResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<QuotaManagerHost> {
        Stub(Core core, QuotaManagerHost impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(QuotaManagerHost_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), QuotaManagerHost_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        QuotaManagerHostAddChangeListenerParams data = QuotaManagerHostAddChangeListenerParams.deserialize(messageWithHeader.getPayload());
                        getImpl().addChangeListener(data.listener, new QuotaManagerHostAddChangeListenerResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 1:
                        QuotaManagerHostQueryStorageUsageAndQuotaParams data2 = QuotaManagerHostQueryStorageUsageAndQuotaParams.deserialize(messageWithHeader.getPayload());
                        getImpl().queryStorageUsageAndQuota(data2.storageType, new QuotaManagerHostQueryStorageUsageAndQuotaResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 2:
                        QuotaManagerHostRequestStorageQuotaParams data3 = QuotaManagerHostRequestStorageQuotaParams.deserialize(messageWithHeader.getPayload());
                        getImpl().requestStorageQuota(data3.storageType, data3.requestedSize, new QuotaManagerHostRequestStorageQuotaResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class QuotaManagerHostAddChangeListenerParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public QuotaChangeListener listener;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private QuotaManagerHostAddChangeListenerParams(int version) {
            super(16, version);
        }

        public QuotaManagerHostAddChangeListenerParams() {
            this(0);
        }

        public static QuotaManagerHostAddChangeListenerParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static QuotaManagerHostAddChangeListenerParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static QuotaManagerHostAddChangeListenerParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                QuotaManagerHostAddChangeListenerParams result = new QuotaManagerHostAddChangeListenerParams(elementsOrVersion);
                result.listener = (QuotaChangeListener) decoder0.readServiceInterface(8, false, QuotaChangeListener.MANAGER);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.listener, 8, false, QuotaChangeListener.MANAGER);
        }
    }

    /* loaded from: classes2.dex */
    static final class QuotaManagerHostAddChangeListenerResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private QuotaManagerHostAddChangeListenerResponseParams(int version) {
            super(8, version);
        }

        public QuotaManagerHostAddChangeListenerResponseParams() {
            this(0);
        }

        public static QuotaManagerHostAddChangeListenerResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static QuotaManagerHostAddChangeListenerResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static QuotaManagerHostAddChangeListenerResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                QuotaManagerHostAddChangeListenerResponseParams result = new QuotaManagerHostAddChangeListenerResponseParams(elementsOrVersion);
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
    static class QuotaManagerHostAddChangeListenerResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final QuotaManagerHost.AddChangeListenerResponse mCallback;

        QuotaManagerHostAddChangeListenerResponseParamsForwardToCallback(QuotaManagerHost.AddChangeListenerResponse callback) {
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
                this.mCallback.call();
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class QuotaManagerHostAddChangeListenerResponseParamsProxyToResponder implements QuotaManagerHost.AddChangeListenerResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        QuotaManagerHostAddChangeListenerResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            QuotaManagerHostAddChangeListenerResponseParams _response = new QuotaManagerHostAddChangeListenerResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class QuotaManagerHostQueryStorageUsageAndQuotaParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int storageType;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private QuotaManagerHostQueryStorageUsageAndQuotaParams(int version) {
            super(16, version);
        }

        public QuotaManagerHostQueryStorageUsageAndQuotaParams() {
            this(0);
        }

        public static QuotaManagerHostQueryStorageUsageAndQuotaParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static QuotaManagerHostQueryStorageUsageAndQuotaParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static QuotaManagerHostQueryStorageUsageAndQuotaParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                QuotaManagerHostQueryStorageUsageAndQuotaParams result = new QuotaManagerHostQueryStorageUsageAndQuotaParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.storageType = readInt;
                StorageType.validate(readInt);
                result.storageType = StorageType.toKnownValue(result.storageType);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.storageType, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class QuotaManagerHostQueryStorageUsageAndQuotaResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 40;
        private static final DataHeader[] VERSION_ARRAY;
        public long currentQuota;
        public long currentUsage;
        public int error;
        public UsageBreakdown usageBreakdown;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private QuotaManagerHostQueryStorageUsageAndQuotaResponseParams(int version) {
            super(40, version);
        }

        public QuotaManagerHostQueryStorageUsageAndQuotaResponseParams() {
            this(0);
        }

        public static QuotaManagerHostQueryStorageUsageAndQuotaResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static QuotaManagerHostQueryStorageUsageAndQuotaResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static QuotaManagerHostQueryStorageUsageAndQuotaResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                QuotaManagerHostQueryStorageUsageAndQuotaResponseParams result = new QuotaManagerHostQueryStorageUsageAndQuotaResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.error = readInt;
                QuotaStatusCode.validate(readInt);
                result.error = QuotaStatusCode.toKnownValue(result.error);
                result.currentUsage = decoder0.readLong(16);
                result.currentQuota = decoder0.readLong(24);
                Decoder decoder1 = decoder0.readPointer(32, false);
                result.usageBreakdown = UsageBreakdown.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.error, 8);
            encoder0.encode(this.currentUsage, 16);
            encoder0.encode(this.currentQuota, 24);
            encoder0.encode((Struct) this.usageBreakdown, 32, false);
        }
    }

    /* loaded from: classes2.dex */
    static class QuotaManagerHostQueryStorageUsageAndQuotaResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final QuotaManagerHost.QueryStorageUsageAndQuotaResponse mCallback;

        QuotaManagerHostQueryStorageUsageAndQuotaResponseParamsForwardToCallback(QuotaManagerHost.QueryStorageUsageAndQuotaResponse callback) {
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
                QuotaManagerHostQueryStorageUsageAndQuotaResponseParams response = QuotaManagerHostQueryStorageUsageAndQuotaResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.error), Long.valueOf(response.currentUsage), Long.valueOf(response.currentQuota), response.usageBreakdown);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class QuotaManagerHostQueryStorageUsageAndQuotaResponseParamsProxyToResponder implements QuotaManagerHost.QueryStorageUsageAndQuotaResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        QuotaManagerHostQueryStorageUsageAndQuotaResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback4
        public void call(Integer error, Long currentUsage, Long currentQuota, UsageBreakdown usageBreakdown) {
            QuotaManagerHostQueryStorageUsageAndQuotaResponseParams _response = new QuotaManagerHostQueryStorageUsageAndQuotaResponseParams();
            _response.error = error.intValue();
            _response.currentUsage = currentUsage.longValue();
            _response.currentQuota = currentQuota.longValue();
            _response.usageBreakdown = usageBreakdown;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(1, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class QuotaManagerHostRequestStorageQuotaParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public long requestedSize;
        public int storageType;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private QuotaManagerHostRequestStorageQuotaParams(int version) {
            super(24, version);
        }

        public QuotaManagerHostRequestStorageQuotaParams() {
            this(0);
        }

        public static QuotaManagerHostRequestStorageQuotaParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static QuotaManagerHostRequestStorageQuotaParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static QuotaManagerHostRequestStorageQuotaParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                QuotaManagerHostRequestStorageQuotaParams result = new QuotaManagerHostRequestStorageQuotaParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.storageType = readInt;
                StorageType.validate(readInt);
                result.storageType = StorageType.toKnownValue(result.storageType);
                result.requestedSize = decoder0.readLong(16);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.storageType, 8);
            encoder0.encode(this.requestedSize, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class QuotaManagerHostRequestStorageQuotaResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public long currentUsage;
        public int error;
        public long grantedQuota;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private QuotaManagerHostRequestStorageQuotaResponseParams(int version) {
            super(32, version);
        }

        public QuotaManagerHostRequestStorageQuotaResponseParams() {
            this(0);
        }

        public static QuotaManagerHostRequestStorageQuotaResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static QuotaManagerHostRequestStorageQuotaResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static QuotaManagerHostRequestStorageQuotaResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                QuotaManagerHostRequestStorageQuotaResponseParams result = new QuotaManagerHostRequestStorageQuotaResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.error = readInt;
                QuotaStatusCode.validate(readInt);
                result.error = QuotaStatusCode.toKnownValue(result.error);
                result.currentUsage = decoder0.readLong(16);
                result.grantedQuota = decoder0.readLong(24);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.error, 8);
            encoder0.encode(this.currentUsage, 16);
            encoder0.encode(this.grantedQuota, 24);
        }
    }

    /* loaded from: classes2.dex */
    static class QuotaManagerHostRequestStorageQuotaResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final QuotaManagerHost.RequestStorageQuotaResponse mCallback;

        QuotaManagerHostRequestStorageQuotaResponseParamsForwardToCallback(QuotaManagerHost.RequestStorageQuotaResponse callback) {
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
                QuotaManagerHostRequestStorageQuotaResponseParams response = QuotaManagerHostRequestStorageQuotaResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.error), Long.valueOf(response.currentUsage), Long.valueOf(response.grantedQuota));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class QuotaManagerHostRequestStorageQuotaResponseParamsProxyToResponder implements QuotaManagerHost.RequestStorageQuotaResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        QuotaManagerHostRequestStorageQuotaResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback3
        public void call(Integer error, Long currentUsage, Long grantedQuota) {
            QuotaManagerHostRequestStorageQuotaResponseParams _response = new QuotaManagerHostRequestStorageQuotaResponseParams();
            _response.error = error.intValue();
            _response.currentUsage = currentUsage.longValue();
            _response.grantedQuota = grantedQuota.longValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(2, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
