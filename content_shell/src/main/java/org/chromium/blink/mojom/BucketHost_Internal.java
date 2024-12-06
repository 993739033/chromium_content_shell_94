package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.BucketHost;
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
import org.chromium.mojo_base.mojom.Time;
/* loaded from: classes2.dex */
class BucketHost_Internal {
    private static final int DURABILITY_ORDINAL = 3;
    private static final int ESTIMATE_ORDINAL = 2;
    private static final int EXPIRES_ORDINAL = 5;
    public static final Interface.Manager<BucketHost, BucketHost.Proxy> MANAGER = new Interface.Manager<BucketHost, BucketHost.Proxy>() { // from class: org.chromium.blink.mojom.BucketHost_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.BucketHost";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public BucketHost.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, BucketHost impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public BucketHost[] buildArray(int size) {
            return new BucketHost[size];
        }
    };
    private static final int PERSISTED_ORDINAL = 1;
    private static final int PERSIST_ORDINAL = 0;
    private static final int SET_EXPIRES_ORDINAL = 4;

    BucketHost_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements BucketHost.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.BucketHost
        public void persist(PersistResponse callback) {
            BucketHostPersistParams _message = new BucketHostPersistParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new BucketHostPersistResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.BucketHost
        public void persisted(PersistedResponse callback) {
            BucketHostPersistedParams _message = new BucketHostPersistedParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1, 1, 0L)), new BucketHostPersistedResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.BucketHost
        public void estimate(EstimateResponse callback) {
            BucketHostEstimateParams _message = new BucketHostEstimateParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2, 1, 0L)), new BucketHostEstimateResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.BucketHost
        public void durability(DurabilityResponse callback) {
            BucketHostDurabilityParams _message = new BucketHostDurabilityParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3, 1, 0L)), new BucketHostDurabilityResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.BucketHost
        public void setExpires(Time expires, SetExpiresResponse callback) {
            BucketHostSetExpiresParams _message = new BucketHostSetExpiresParams();
            _message.expires = expires;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(4, 1, 0L)), new BucketHostSetExpiresResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.BucketHost
        public void expires(ExpiresResponse callback) {
            BucketHostExpiresParams _message = new BucketHostExpiresParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(5, 1, 0L)), new BucketHostExpiresResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<BucketHost> {
        Stub(Core core, BucketHost impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(BucketHost_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), BucketHost_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        BucketHostPersistParams.deserialize(messageWithHeader.getPayload());
                        getImpl().persist(new BucketHostPersistResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 1:
                        BucketHostPersistedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().persisted(new BucketHostPersistedResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 2:
                        BucketHostEstimateParams.deserialize(messageWithHeader.getPayload());
                        getImpl().estimate(new BucketHostEstimateResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 3:
                        BucketHostDurabilityParams.deserialize(messageWithHeader.getPayload());
                        getImpl().durability(new BucketHostDurabilityResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 4:
                        BucketHostSetExpiresParams data = BucketHostSetExpiresParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setExpires(data.expires, new BucketHostSetExpiresResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 5:
                        BucketHostExpiresParams.deserialize(messageWithHeader.getPayload());
                        getImpl().expires(new BucketHostExpiresResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class BucketHostPersistParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BucketHostPersistParams(int version) {
            super(8, version);
        }

        public BucketHostPersistParams() {
            this(0);
        }

        public static BucketHostPersistParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BucketHostPersistParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BucketHostPersistParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BucketHostPersistParams result = new BucketHostPersistParams(elementsOrVersion);
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
    public static final class BucketHostPersistResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean persisted;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BucketHostPersistResponseParams(int version) {
            super(16, version);
        }

        public BucketHostPersistResponseParams() {
            this(0);
        }

        public static BucketHostPersistResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BucketHostPersistResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BucketHostPersistResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BucketHostPersistResponseParams result = new BucketHostPersistResponseParams(elementsOrVersion);
                result.persisted = decoder0.readBoolean(8, 0);
                result.success = decoder0.readBoolean(8, 1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.persisted, 8, 0);
            encoder0.encode(this.success, 8, 1);
        }
    }

    /* loaded from: classes2.dex */
    static class BucketHostPersistResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final BucketHost.PersistResponse mCallback;

        BucketHostPersistResponseParamsForwardToCallback(BucketHost.PersistResponse callback) {
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
                BucketHostPersistResponseParams response = BucketHostPersistResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.persisted), Boolean.valueOf(response.success));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class BucketHostPersistResponseParamsProxyToResponder implements BucketHost.PersistResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        BucketHostPersistResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Boolean persisted, Boolean success) {
            BucketHostPersistResponseParams _response = new BucketHostPersistResponseParams();
            _response.persisted = persisted.booleanValue();
            _response.success = success.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class BucketHostPersistedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BucketHostPersistedParams(int version) {
            super(8, version);
        }

        public BucketHostPersistedParams() {
            this(0);
        }

        public static BucketHostPersistedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BucketHostPersistedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BucketHostPersistedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BucketHostPersistedParams result = new BucketHostPersistedParams(elementsOrVersion);
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
    public static final class BucketHostPersistedResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean persisted;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BucketHostPersistedResponseParams(int version) {
            super(16, version);
        }

        public BucketHostPersistedResponseParams() {
            this(0);
        }

        public static BucketHostPersistedResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BucketHostPersistedResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BucketHostPersistedResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BucketHostPersistedResponseParams result = new BucketHostPersistedResponseParams(elementsOrVersion);
                result.persisted = decoder0.readBoolean(8, 0);
                result.success = decoder0.readBoolean(8, 1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.persisted, 8, 0);
            encoder0.encode(this.success, 8, 1);
        }
    }

    /* loaded from: classes2.dex */
    static class BucketHostPersistedResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final BucketHost.PersistedResponse mCallback;

        BucketHostPersistedResponseParamsForwardToCallback(BucketHost.PersistedResponse callback) {
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
                BucketHostPersistedResponseParams response = BucketHostPersistedResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.persisted), Boolean.valueOf(response.success));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class BucketHostPersistedResponseParamsProxyToResponder implements BucketHost.PersistedResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        BucketHostPersistedResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Boolean persisted, Boolean success) {
            BucketHostPersistedResponseParams _response = new BucketHostPersistedResponseParams();
            _response.persisted = persisted.booleanValue();
            _response.success = success.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(1, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class BucketHostEstimateParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BucketHostEstimateParams(int version) {
            super(8, version);
        }

        public BucketHostEstimateParams() {
            this(0);
        }

        public static BucketHostEstimateParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BucketHostEstimateParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BucketHostEstimateParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BucketHostEstimateParams result = new BucketHostEstimateParams(elementsOrVersion);
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
    public static final class BucketHostEstimateResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public long currentQuota;
        public long currentUsage;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BucketHostEstimateResponseParams(int version) {
            super(32, version);
        }

        public BucketHostEstimateResponseParams() {
            this(0);
        }

        public static BucketHostEstimateResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BucketHostEstimateResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BucketHostEstimateResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BucketHostEstimateResponseParams result = new BucketHostEstimateResponseParams(elementsOrVersion);
                result.currentUsage = decoder0.readLong(8);
                result.currentQuota = decoder0.readLong(16);
                result.success = decoder0.readBoolean(24, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.currentUsage, 8);
            encoder0.encode(this.currentQuota, 16);
            encoder0.encode(this.success, 24, 0);
        }
    }

    /* loaded from: classes2.dex */
    static class BucketHostEstimateResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final BucketHost.EstimateResponse mCallback;

        BucketHostEstimateResponseParamsForwardToCallback(BucketHost.EstimateResponse callback) {
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
                BucketHostEstimateResponseParams response = BucketHostEstimateResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Long.valueOf(response.currentUsage), Long.valueOf(response.currentQuota), Boolean.valueOf(response.success));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class BucketHostEstimateResponseParamsProxyToResponder implements BucketHost.EstimateResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        BucketHostEstimateResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback3
        public void call(Long currentUsage, Long currentQuota, Boolean success) {
            BucketHostEstimateResponseParams _response = new BucketHostEstimateResponseParams();
            _response.currentUsage = currentUsage.longValue();
            _response.currentQuota = currentQuota.longValue();
            _response.success = success.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(2, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class BucketHostDurabilityParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BucketHostDurabilityParams(int version) {
            super(8, version);
        }

        public BucketHostDurabilityParams() {
            this(0);
        }

        public static BucketHostDurabilityParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BucketHostDurabilityParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BucketHostDurabilityParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BucketHostDurabilityParams result = new BucketHostDurabilityParams(elementsOrVersion);
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
    public static final class BucketHostDurabilityResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int durability;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BucketHostDurabilityResponseParams(int version) {
            super(16, version);
        }

        public BucketHostDurabilityResponseParams() {
            this(0);
        }

        public static BucketHostDurabilityResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BucketHostDurabilityResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BucketHostDurabilityResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BucketHostDurabilityResponseParams result = new BucketHostDurabilityResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.durability = readInt;
                BucketDurability.validate(readInt);
                result.durability = BucketDurability.toKnownValue(result.durability);
                result.success = decoder0.readBoolean(12, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.durability, 8);
            encoder0.encode(this.success, 12, 0);
        }
    }

    /* loaded from: classes2.dex */
    static class BucketHostDurabilityResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final BucketHost.DurabilityResponse mCallback;

        BucketHostDurabilityResponseParamsForwardToCallback(BucketHost.DurabilityResponse callback) {
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
                BucketHostDurabilityResponseParams response = BucketHostDurabilityResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.durability), Boolean.valueOf(response.success));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class BucketHostDurabilityResponseParamsProxyToResponder implements BucketHost.DurabilityResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        BucketHostDurabilityResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Integer durability, Boolean success) {
            BucketHostDurabilityResponseParams _response = new BucketHostDurabilityResponseParams();
            _response.durability = durability.intValue();
            _response.success = success.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(3, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class BucketHostSetExpiresParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public Time expires;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BucketHostSetExpiresParams(int version) {
            super(16, version);
        }

        public BucketHostSetExpiresParams() {
            this(0);
        }

        public static BucketHostSetExpiresParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BucketHostSetExpiresParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BucketHostSetExpiresParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BucketHostSetExpiresParams result = new BucketHostSetExpiresParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.expires = Time.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.expires, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class BucketHostSetExpiresResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BucketHostSetExpiresResponseParams(int version) {
            super(16, version);
        }

        public BucketHostSetExpiresResponseParams() {
            this(0);
        }

        public static BucketHostSetExpiresResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BucketHostSetExpiresResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BucketHostSetExpiresResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BucketHostSetExpiresResponseParams result = new BucketHostSetExpiresResponseParams(elementsOrVersion);
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
    static class BucketHostSetExpiresResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final BucketHost.SetExpiresResponse mCallback;

        BucketHostSetExpiresResponseParamsForwardToCallback(BucketHost.SetExpiresResponse callback) {
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
                BucketHostSetExpiresResponseParams response = BucketHostSetExpiresResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.success));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class BucketHostSetExpiresResponseParamsProxyToResponder implements BucketHost.SetExpiresResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        BucketHostSetExpiresResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Boolean success) {
            BucketHostSetExpiresResponseParams _response = new BucketHostSetExpiresResponseParams();
            _response.success = success.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(4, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class BucketHostExpiresParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BucketHostExpiresParams(int version) {
            super(8, version);
        }

        public BucketHostExpiresParams() {
            this(0);
        }

        public static BucketHostExpiresParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BucketHostExpiresParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BucketHostExpiresParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BucketHostExpiresParams result = new BucketHostExpiresParams(elementsOrVersion);
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
    public static final class BucketHostExpiresResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public Time expires;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BucketHostExpiresResponseParams(int version) {
            super(24, version);
        }

        public BucketHostExpiresResponseParams() {
            this(0);
        }

        public static BucketHostExpiresResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BucketHostExpiresResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BucketHostExpiresResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BucketHostExpiresResponseParams result = new BucketHostExpiresResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, true);
                result.expires = Time.decode(decoder1);
                result.success = decoder0.readBoolean(16, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.expires, 8, true);
            encoder0.encode(this.success, 16, 0);
        }
    }

    /* loaded from: classes2.dex */
    static class BucketHostExpiresResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final BucketHost.ExpiresResponse mCallback;

        BucketHostExpiresResponseParamsForwardToCallback(BucketHost.ExpiresResponse callback) {
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
                BucketHostExpiresResponseParams response = BucketHostExpiresResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.expires, Boolean.valueOf(response.success));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class BucketHostExpiresResponseParamsProxyToResponder implements BucketHost.ExpiresResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        BucketHostExpiresResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Time expires, Boolean success) {
            BucketHostExpiresResponseParams _response = new BucketHostExpiresResponseParams();
            _response.expires = expires;
            _response.success = success.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(5, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
