package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.BlobUrlStore;
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
import org.chromium.mojo_base.mojom.UnguessableToken;
import org.chromium.network.mojom.UrlLoaderFactory;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
class BlobUrlStore_Internal {
    public static final Interface.Manager<BlobUrlStore, BlobUrlStore.Proxy> MANAGER = new Interface.Manager<BlobUrlStore, BlobUrlStore.Proxy>() { // from class: org.chromium.blink.mojom.BlobUrlStore_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.BlobURLStore";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public BlobUrlStore.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, BlobUrlStore impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public BlobUrlStore[] buildArray(int size) {
            return new BlobUrlStore[size];
        }
    };
    private static final int REGISTER_ORDINAL = 0;
    private static final int RESOLVE_AS_URL_LOADER_FACTORY_ORDINAL = 3;
    private static final int RESOLVE_FOR_NAVIGATION_ORDINAL = 4;
    private static final int RESOLVE_ORDINAL = 2;
    private static final int REVOKE_ORDINAL = 1;

    BlobUrlStore_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements BlobUrlStore.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.BlobUrlStore
        public void register(Blob blob, Url url, UnguessableToken unsafeAgentClusterId, RegisterResponse callback) {
            BlobUrlStoreRegisterParams _message = new BlobUrlStoreRegisterParams();
            _message.blob = blob;
            _message.url = url;
            _message.unsafeAgentClusterId = unsafeAgentClusterId;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new BlobUrlStoreRegisterResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.BlobUrlStore
        public void revoke(Url url) {
            BlobUrlStoreRevokeParams _message = new BlobUrlStoreRevokeParams();
            _message.url = url;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1)));
        }

        @Override // org.chromium.blink.mojom.BlobUrlStore
        public void resolve(Url url, ResolveResponse callback) {
            BlobUrlStoreResolveParams _message = new BlobUrlStoreResolveParams();
            _message.url = url;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2, 1, 0L)), new BlobUrlStoreResolveResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.BlobUrlStore
        public void resolveAsUrlLoaderFactory(Url url, InterfaceRequest<UrlLoaderFactory> factory, ResolveAsUrlLoaderFactoryResponse callback) {
            BlobUrlStoreResolveAsUrlLoaderFactoryParams _message = new BlobUrlStoreResolveAsUrlLoaderFactoryParams();
            _message.url = url;
            _message.factory = factory;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3, 1, 0L)), new BlobUrlStoreResolveAsUrlLoaderFactoryResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.BlobUrlStore
        public void resolveForNavigation(Url url, InterfaceRequest<BlobUrlToken> token, ResolveForNavigationResponse callback) {
            BlobUrlStoreResolveForNavigationParams _message = new BlobUrlStoreResolveForNavigationParams();
            _message.url = url;
            _message.token = token;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(4, 1, 0L)), new BlobUrlStoreResolveForNavigationResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<BlobUrlStore> {
        Stub(Core core, BlobUrlStore impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(BlobUrlStore_Internal.MANAGER, messageWithHeader);
                    case 1:
                        BlobUrlStoreRevokeParams data = BlobUrlStoreRevokeParams.deserialize(messageWithHeader.getPayload());
                        getImpl().revoke(data.url);
                        return true;
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), BlobUrlStore_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        BlobUrlStoreRegisterParams data = BlobUrlStoreRegisterParams.deserialize(messageWithHeader.getPayload());
                        getImpl().register(data.blob, data.url, data.unsafeAgentClusterId, new BlobUrlStoreRegisterResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 1:
                    default:
                        return false;
                    case 2:
                        getImpl().resolve(BlobUrlStoreResolveParams.deserialize(messageWithHeader.getPayload()).url, new BlobUrlStoreResolveResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 3:
                        BlobUrlStoreResolveAsUrlLoaderFactoryParams data2 = BlobUrlStoreResolveAsUrlLoaderFactoryParams.deserialize(messageWithHeader.getPayload());
                        getImpl().resolveAsUrlLoaderFactory(data2.url, data2.factory, new BlobUrlStoreResolveAsUrlLoaderFactoryResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 4:
                        BlobUrlStoreResolveForNavigationParams data3 = BlobUrlStoreResolveForNavigationParams.deserialize(messageWithHeader.getPayload());
                        getImpl().resolveForNavigation(data3.url, data3.token, new BlobUrlStoreResolveForNavigationResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                }
            } catch (DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class BlobUrlStoreRegisterParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public Blob blob;
        public UnguessableToken unsafeAgentClusterId;
        public Url url;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BlobUrlStoreRegisterParams(int version) {
            super(32, version);
        }

        public BlobUrlStoreRegisterParams() {
            this(0);
        }

        public static BlobUrlStoreRegisterParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BlobUrlStoreRegisterParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BlobUrlStoreRegisterParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BlobUrlStoreRegisterParams result = new BlobUrlStoreRegisterParams(elementsOrVersion);
                result.blob = (Blob) decoder0.readServiceInterface(8, false, Blob.MANAGER);
                Decoder decoder1 = decoder0.readPointer(16, false);
                result.url = Url.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(24, false);
                result.unsafeAgentClusterId = UnguessableToken.decode(decoder12);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.blob, 8, false, Blob.MANAGER);
            encoder0.encode((Struct) this.url, 16, false);
            encoder0.encode((Struct) this.unsafeAgentClusterId, 24, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class BlobUrlStoreRegisterResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BlobUrlStoreRegisterResponseParams(int version) {
            super(8, version);
        }

        public BlobUrlStoreRegisterResponseParams() {
            this(0);
        }

        public static BlobUrlStoreRegisterResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BlobUrlStoreRegisterResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BlobUrlStoreRegisterResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BlobUrlStoreRegisterResponseParams result = new BlobUrlStoreRegisterResponseParams(elementsOrVersion);
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
    static class BlobUrlStoreRegisterResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final BlobUrlStore.RegisterResponse mCallback;

        BlobUrlStoreRegisterResponseParamsForwardToCallback(BlobUrlStore.RegisterResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(0, 6)) {
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
    static class BlobUrlStoreRegisterResponseParamsProxyToResponder implements BlobUrlStore.RegisterResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        BlobUrlStoreRegisterResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            BlobUrlStoreRegisterResponseParams _response = new BlobUrlStoreRegisterResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class BlobUrlStoreRevokeParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public Url url;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BlobUrlStoreRevokeParams(int version) {
            super(16, version);
        }

        public BlobUrlStoreRevokeParams() {
            this(0);
        }

        public static BlobUrlStoreRevokeParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BlobUrlStoreRevokeParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BlobUrlStoreRevokeParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BlobUrlStoreRevokeParams result = new BlobUrlStoreRevokeParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.url = Url.decode(decoder1);
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
        }
    }

    /* loaded from: classes2.dex */
    static final class BlobUrlStoreResolveParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public Url url;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BlobUrlStoreResolveParams(int version) {
            super(16, version);
        }

        public BlobUrlStoreResolveParams() {
            this(0);
        }

        public static BlobUrlStoreResolveParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BlobUrlStoreResolveParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BlobUrlStoreResolveParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BlobUrlStoreResolveParams result = new BlobUrlStoreResolveParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.url = Url.decode(decoder1);
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
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class BlobUrlStoreResolveResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public Blob blob;
        public UnguessableToken unsafeAgentClusterId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BlobUrlStoreResolveResponseParams(int version) {
            super(24, version);
        }

        public BlobUrlStoreResolveResponseParams() {
            this(0);
        }

        public static BlobUrlStoreResolveResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BlobUrlStoreResolveResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BlobUrlStoreResolveResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BlobUrlStoreResolveResponseParams result = new BlobUrlStoreResolveResponseParams(elementsOrVersion);
                result.blob = (Blob) decoder0.readServiceInterface(8, true, Blob.MANAGER);
                Decoder decoder1 = decoder0.readPointer(16, true);
                result.unsafeAgentClusterId = UnguessableToken.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.blob, 8, true,  Blob.MANAGER);
            encoder0.encode((Struct) this.unsafeAgentClusterId, 16, true);
        }
    }

    /* loaded from: classes2.dex */
    static class BlobUrlStoreResolveResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final BlobUrlStore.ResolveResponse mCallback;

        BlobUrlStoreResolveResponseParamsForwardToCallback(BlobUrlStore.ResolveResponse callback) {
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
                BlobUrlStoreResolveResponseParams response = BlobUrlStoreResolveResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.blob, response.unsafeAgentClusterId);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class BlobUrlStoreResolveResponseParamsProxyToResponder implements BlobUrlStore.ResolveResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        BlobUrlStoreResolveResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Blob blob, UnguessableToken unsafeAgentClusterId) {
            BlobUrlStoreResolveResponseParams _response = new BlobUrlStoreResolveResponseParams();
            _response.blob = blob;
            _response.unsafeAgentClusterId = unsafeAgentClusterId;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(2, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class BlobUrlStoreResolveAsUrlLoaderFactoryParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public InterfaceRequest<UrlLoaderFactory> factory;
        public Url url;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BlobUrlStoreResolveAsUrlLoaderFactoryParams(int version) {
            super(24, version);
        }

        public BlobUrlStoreResolveAsUrlLoaderFactoryParams() {
            this(0);
        }

        public static BlobUrlStoreResolveAsUrlLoaderFactoryParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BlobUrlStoreResolveAsUrlLoaderFactoryParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BlobUrlStoreResolveAsUrlLoaderFactoryParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BlobUrlStoreResolveAsUrlLoaderFactoryParams result = new BlobUrlStoreResolveAsUrlLoaderFactoryParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.url = Url.decode(decoder1);
                result.factory = decoder0.readInterfaceRequest(16, false);
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
            encoder0.encode((InterfaceRequest) this.factory, 16, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class BlobUrlStoreResolveAsUrlLoaderFactoryResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public UnguessableToken unsafeAgentClusterId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BlobUrlStoreResolveAsUrlLoaderFactoryResponseParams(int version) {
            super(16, version);
        }

        public BlobUrlStoreResolveAsUrlLoaderFactoryResponseParams() {
            this(0);
        }

        public static BlobUrlStoreResolveAsUrlLoaderFactoryResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BlobUrlStoreResolveAsUrlLoaderFactoryResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BlobUrlStoreResolveAsUrlLoaderFactoryResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BlobUrlStoreResolveAsUrlLoaderFactoryResponseParams result = new BlobUrlStoreResolveAsUrlLoaderFactoryResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, true);
                result.unsafeAgentClusterId = UnguessableToken.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.unsafeAgentClusterId, 8, true);
        }
    }

    /* loaded from: classes2.dex */
    static class BlobUrlStoreResolveAsUrlLoaderFactoryResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final BlobUrlStore.ResolveAsUrlLoaderFactoryResponse mCallback;

        BlobUrlStoreResolveAsUrlLoaderFactoryResponseParamsForwardToCallback(BlobUrlStore.ResolveAsUrlLoaderFactoryResponse callback) {
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
                BlobUrlStoreResolveAsUrlLoaderFactoryResponseParams response = BlobUrlStoreResolveAsUrlLoaderFactoryResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.unsafeAgentClusterId);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class BlobUrlStoreResolveAsUrlLoaderFactoryResponseParamsProxyToResponder implements BlobUrlStore.ResolveAsUrlLoaderFactoryResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        BlobUrlStoreResolveAsUrlLoaderFactoryResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(UnguessableToken unsafeAgentClusterId) {
            BlobUrlStoreResolveAsUrlLoaderFactoryResponseParams _response = new BlobUrlStoreResolveAsUrlLoaderFactoryResponseParams();
            _response.unsafeAgentClusterId = unsafeAgentClusterId;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(3, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class BlobUrlStoreResolveForNavigationParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public InterfaceRequest<BlobUrlToken> token;
        public Url url;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BlobUrlStoreResolveForNavigationParams(int version) {
            super(24, version);
        }

        public BlobUrlStoreResolveForNavigationParams() {
            this(0);
        }

        public static BlobUrlStoreResolveForNavigationParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BlobUrlStoreResolveForNavigationParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BlobUrlStoreResolveForNavigationParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BlobUrlStoreResolveForNavigationParams result = new BlobUrlStoreResolveForNavigationParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.url = Url.decode(decoder1);
                result.token = decoder0.readInterfaceRequest(16, false);
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
            encoder0.encode((InterfaceRequest) this.token, 16, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class BlobUrlStoreResolveForNavigationResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public UnguessableToken unsafeAgentClusterId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BlobUrlStoreResolveForNavigationResponseParams(int version) {
            super(16, version);
        }

        public BlobUrlStoreResolveForNavigationResponseParams() {
            this(0);
        }

        public static BlobUrlStoreResolveForNavigationResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BlobUrlStoreResolveForNavigationResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BlobUrlStoreResolveForNavigationResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BlobUrlStoreResolveForNavigationResponseParams result = new BlobUrlStoreResolveForNavigationResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, true);
                result.unsafeAgentClusterId = UnguessableToken.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.unsafeAgentClusterId, 8, true);
        }
    }

    /* loaded from: classes2.dex */
    static class BlobUrlStoreResolveForNavigationResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final BlobUrlStore.ResolveForNavigationResponse mCallback;

        BlobUrlStoreResolveForNavigationResponseParamsForwardToCallback(BlobUrlStore.ResolveForNavigationResponse callback) {
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
                BlobUrlStoreResolveForNavigationResponseParams response = BlobUrlStoreResolveForNavigationResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.unsafeAgentClusterId);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class BlobUrlStoreResolveForNavigationResponseParamsProxyToResponder implements BlobUrlStore.ResolveForNavigationResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        BlobUrlStoreResolveForNavigationResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(UnguessableToken unsafeAgentClusterId) {
            BlobUrlStoreResolveForNavigationResponseParams _response = new BlobUrlStoreResolveForNavigationResponseParams();
            _response.unsafeAgentClusterId = unsafeAgentClusterId;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(4, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
