package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.BucketManagerHost;
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
class BucketManagerHost_Internal {
    private static final int DELETE_BUCKET_ORDINAL = 2;
    private static final int KEYS_ORDINAL = 1;
    public static final Interface.Manager<BucketManagerHost, BucketManagerHost.Proxy> MANAGER = new Interface.Manager<BucketManagerHost, BucketManagerHost.Proxy>() { // from class: org.chromium.blink.mojom.BucketManagerHost_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.BucketManagerHost";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public BucketManagerHost.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, BucketManagerHost impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public BucketManagerHost[] buildArray(int size) {
            return new BucketManagerHost[size];
        }
    };
    private static final int OPEN_BUCKET_ORDINAL = 0;

    BucketManagerHost_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements BucketManagerHost.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.BucketManagerHost
        public void openBucket(String name, BucketPolicies policy, OpenBucketResponse callback) {
            BucketManagerHostOpenBucketParams _message = new BucketManagerHostOpenBucketParams();
            _message.name = name;
            _message.policy = policy;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new BucketManagerHostOpenBucketResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.BucketManagerHost
        public void keys(KeysResponse callback) {
            BucketManagerHostKeysParams _message = new BucketManagerHostKeysParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1, 1, 0L)), new BucketManagerHostKeysResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.BucketManagerHost
        public void deleteBucket(String name, DeleteBucketResponse callback) {
            BucketManagerHostDeleteBucketParams _message = new BucketManagerHostDeleteBucketParams();
            _message.name = name;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2, 1, 0L)), new BucketManagerHostDeleteBucketResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<BucketManagerHost> {
        Stub(Core core, BucketManagerHost impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(BucketManagerHost_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), BucketManagerHost_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        BucketManagerHostOpenBucketParams data = BucketManagerHostOpenBucketParams.deserialize(messageWithHeader.getPayload());
                        getImpl().openBucket(data.name, data.policy, new BucketManagerHostOpenBucketResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 1:
                        BucketManagerHostKeysParams.deserialize(messageWithHeader.getPayload());
                        getImpl().keys(new BucketManagerHostKeysResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 2:
                        getImpl().deleteBucket(BucketManagerHostDeleteBucketParams.deserialize(messageWithHeader.getPayload()).name, new BucketManagerHostDeleteBucketResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class BucketManagerHostOpenBucketParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public String name;
        public BucketPolicies policy;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BucketManagerHostOpenBucketParams(int version) {
            super(24, version);
        }

        public BucketManagerHostOpenBucketParams() {
            this(0);
        }

        public static BucketManagerHostOpenBucketParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BucketManagerHostOpenBucketParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BucketManagerHostOpenBucketParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BucketManagerHostOpenBucketParams result = new BucketManagerHostOpenBucketParams(elementsOrVersion);
                result.name = decoder0.readString(8, false);
                Decoder decoder1 = decoder0.readPointer(16, false);
                result.policy = BucketPolicies.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.name, 8, false);
            encoder0.encode((Struct) this.policy, 16, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class BucketManagerHostOpenBucketResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public BucketHost remote;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BucketManagerHostOpenBucketResponseParams(int version) {
            super(16, version);
        }

        public BucketManagerHostOpenBucketResponseParams() {
            this(0);
        }

        public static BucketManagerHostOpenBucketResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BucketManagerHostOpenBucketResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BucketManagerHostOpenBucketResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BucketManagerHostOpenBucketResponseParams result = new BucketManagerHostOpenBucketResponseParams(elementsOrVersion);
                result.remote = (BucketHost) decoder0.readServiceInterface(8, false, BucketHost.MANAGER);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode( this.remote, 8, false,  BucketHost.MANAGER);
        }
    }

    /* loaded from: classes2.dex */
    static class BucketManagerHostOpenBucketResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final BucketManagerHost.OpenBucketResponse mCallback;

        BucketManagerHostOpenBucketResponseParamsForwardToCallback(BucketManagerHost.OpenBucketResponse callback) {
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
                BucketManagerHostOpenBucketResponseParams response = BucketManagerHostOpenBucketResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.remote);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class BucketManagerHostOpenBucketResponseParamsProxyToResponder implements BucketManagerHost.OpenBucketResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        BucketManagerHostOpenBucketResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(BucketHost remote) {
            BucketManagerHostOpenBucketResponseParams _response = new BucketManagerHostOpenBucketResponseParams();
            _response.remote = remote;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class BucketManagerHostKeysParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BucketManagerHostKeysParams(int version) {
            super(8, version);
        }

        public BucketManagerHostKeysParams() {
            this(0);
        }

        public static BucketManagerHostKeysParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BucketManagerHostKeysParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BucketManagerHostKeysParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BucketManagerHostKeysParams result = new BucketManagerHostKeysParams(elementsOrVersion);
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
    public static final class BucketManagerHostKeysResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public String[] buckets;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BucketManagerHostKeysResponseParams(int version) {
            super(24, version);
        }

        public BucketManagerHostKeysResponseParams() {
            this(0);
        }

        public static BucketManagerHostKeysResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BucketManagerHostKeysResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BucketManagerHostKeysResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BucketManagerHostKeysResponseParams result = new BucketManagerHostKeysResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.buckets = new String[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    result.buckets[i1] = decoder1.readString((i1 * 8) + 8, false);
                }
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
            String[] strArr = this.buckets;
            if (strArr == null) {
                encoder0.encodeNullPointer(8, false);
            } else {
                Encoder encoder1 = encoder0.encodePointerArray(strArr.length, 8, -1);
                int i0 = 0;
                while (true) {
                    String[] strArr2 = this.buckets;
                    if (i0 >= strArr2.length) {
                        break;
                    }
                    encoder1.encode(strArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                }
            }
            encoder0.encode(this.success, 16, 0);
        }
    }

    /* loaded from: classes2.dex */
    static class BucketManagerHostKeysResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final BucketManagerHost.KeysResponse mCallback;

        BucketManagerHostKeysResponseParamsForwardToCallback(BucketManagerHost.KeysResponse callback) {
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
                BucketManagerHostKeysResponseParams response = BucketManagerHostKeysResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.buckets, Boolean.valueOf(response.success));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class BucketManagerHostKeysResponseParamsProxyToResponder implements BucketManagerHost.KeysResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        BucketManagerHostKeysResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(String[] buckets, Boolean success) {
            BucketManagerHostKeysResponseParams _response = new BucketManagerHostKeysResponseParams();
            _response.buckets = buckets;
            _response.success = success.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(1, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class BucketManagerHostDeleteBucketParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public String name;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BucketManagerHostDeleteBucketParams(int version) {
            super(16, version);
        }

        public BucketManagerHostDeleteBucketParams() {
            this(0);
        }

        public static BucketManagerHostDeleteBucketParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BucketManagerHostDeleteBucketParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BucketManagerHostDeleteBucketParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BucketManagerHostDeleteBucketParams result = new BucketManagerHostDeleteBucketParams(elementsOrVersion);
                result.name = decoder0.readString(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.name, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class BucketManagerHostDeleteBucketResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BucketManagerHostDeleteBucketResponseParams(int version) {
            super(16, version);
        }

        public BucketManagerHostDeleteBucketResponseParams() {
            this(0);
        }

        public static BucketManagerHostDeleteBucketResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BucketManagerHostDeleteBucketResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BucketManagerHostDeleteBucketResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BucketManagerHostDeleteBucketResponseParams result = new BucketManagerHostDeleteBucketResponseParams(elementsOrVersion);
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
    static class BucketManagerHostDeleteBucketResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final BucketManagerHost.DeleteBucketResponse mCallback;

        BucketManagerHostDeleteBucketResponseParamsForwardToCallback(BucketManagerHost.DeleteBucketResponse callback) {
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
                BucketManagerHostDeleteBucketResponseParams response = BucketManagerHostDeleteBucketResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.success));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class BucketManagerHostDeleteBucketResponseParamsProxyToResponder implements BucketManagerHost.DeleteBucketResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        BucketManagerHostDeleteBucketResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Boolean success) {
            BucketManagerHostDeleteBucketResponseParams _response = new BucketManagerHostDeleteBucketResponseParams();
            _response.success = success.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(2, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
