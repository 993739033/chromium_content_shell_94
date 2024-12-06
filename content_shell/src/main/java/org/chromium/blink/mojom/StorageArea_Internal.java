package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.StorageArea;
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
class StorageArea_Internal {
    private static final int ADD_OBSERVER_ORDINAL = 0;
    private static final int DELETE_ALL_ORDINAL = 3;
    private static final int DELETE_ORDINAL = 2;
    private static final int GET_ALL_ORDINAL = 5;
    private static final int GET_ORDINAL = 4;
    public static final Interface.Manager<StorageArea, StorageArea.Proxy> MANAGER = new Interface.Manager<StorageArea, StorageArea.Proxy>() { // from class: org.chromium.blink.mojom.StorageArea_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.StorageArea";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public StorageArea.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, StorageArea impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public StorageArea[] buildArray(int size) {
            return new StorageArea[size];
        }
    };
    private static final int PUT_ORDINAL = 1;

    StorageArea_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements StorageArea.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.StorageArea
        public void addObserver(StorageAreaObserver observer) {
            StorageAreaAddObserverParams _message = new StorageAreaAddObserverParams();
            _message.observer = observer;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }

        @Override // org.chromium.blink.mojom.StorageArea
        public void put(byte[] key, byte[] value, byte[] clientOldValue, String source, PutResponse callback) {
            StorageAreaPutParams _message = new StorageAreaPutParams();
            _message.key = key;
            _message.value = value;
            _message.clientOldValue = clientOldValue;
            _message.source = source;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1, 1, 0L)), new StorageAreaPutResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.StorageArea
        public void delete(byte[] key, byte[] clientOldValue, String source, DeleteResponse callback) {
            StorageAreaDeleteParams _message = new StorageAreaDeleteParams();
            _message.key = key;
            _message.clientOldValue = clientOldValue;
            _message.source = source;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2, 1, 0L)), new StorageAreaDeleteResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.StorageArea
        public void deleteAll(String source, StorageAreaObserver newObserver, DeleteAllResponse callback) {
            StorageAreaDeleteAllParams _message = new StorageAreaDeleteAllParams();
            _message.source = source;
            _message.newObserver = newObserver;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3, 1, 0L)), new StorageAreaDeleteAllResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.StorageArea
        public void get(byte[] key, GetResponse callback) {
            StorageAreaGetParams _message = new StorageAreaGetParams();
            _message.key = key;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(4, 1, 0L)), new StorageAreaGetResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.StorageArea
        public void getAll(StorageAreaObserver newObserver, GetAllResponse callback) {
            StorageAreaGetAllParams _message = new StorageAreaGetAllParams();
            _message.newObserver = newObserver;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(5, 1, 0L)), new StorageAreaGetAllResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<StorageArea> {
        Stub(Core core, StorageArea impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(StorageArea_Internal.MANAGER, messageWithHeader);
                    case -1:
                    default:
                        return false;
                    case 0:
                        StorageAreaAddObserverParams data = StorageAreaAddObserverParams.deserialize(messageWithHeader.getPayload());
                        getImpl().addObserver(data.observer);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), StorageArea_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                    default:
                        return false;
                    case 1:
                        StorageAreaPutParams data = StorageAreaPutParams.deserialize(messageWithHeader.getPayload());
                        getImpl().put(data.key, data.value, data.clientOldValue, data.source, new StorageAreaPutResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 2:
                        StorageAreaDeleteParams data2 = StorageAreaDeleteParams.deserialize(messageWithHeader.getPayload());
                        getImpl().delete(data2.key, data2.clientOldValue, data2.source, new StorageAreaDeleteResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 3:
                        StorageAreaDeleteAllParams data3 = StorageAreaDeleteAllParams.deserialize(messageWithHeader.getPayload());
                        getImpl().deleteAll(data3.source, data3.newObserver, new StorageAreaDeleteAllResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 4:
                        getImpl().get(StorageAreaGetParams.deserialize(messageWithHeader.getPayload()).key, new StorageAreaGetResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 5:
                        getImpl().getAll(StorageAreaGetAllParams.deserialize(messageWithHeader.getPayload()).newObserver, new StorageAreaGetAllResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                }
            } catch (DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class StorageAreaAddObserverParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public StorageAreaObserver observer;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private StorageAreaAddObserverParams(int version) {
            super(16, version);
        }

        public StorageAreaAddObserverParams() {
            this(0);
        }

        public static StorageAreaAddObserverParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static StorageAreaAddObserverParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static StorageAreaAddObserverParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                StorageAreaAddObserverParams result = new StorageAreaAddObserverParams(elementsOrVersion);
                result.observer = (StorageAreaObserver) decoder0.readServiceInterface(8, false, StorageAreaObserver.MANAGER);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.observer, 8, false,  StorageAreaObserver.MANAGER);
        }
    }

    /* loaded from: classes2.dex */
    static final class StorageAreaPutParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 40;
        private static final DataHeader[] VERSION_ARRAY;
        public byte[] clientOldValue;
        public byte[] key;
        public String source;
        public byte[] value;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private StorageAreaPutParams(int version) {
            super(40, version);
        }

        public StorageAreaPutParams() {
            this(0);
        }

        public static StorageAreaPutParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static StorageAreaPutParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static StorageAreaPutParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                StorageAreaPutParams result = new StorageAreaPutParams(elementsOrVersion);
                result.key = decoder0.readBytes(8, 0, -1);
                result.value = decoder0.readBytes(16, 0, -1);
                result.clientOldValue = decoder0.readBytes(24, 1, -1);
                result.source = decoder0.readString(32, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.key, 8, 0, -1);
            encoder0.encode(this.value, 16, 0, -1);
            encoder0.encode(this.clientOldValue, 24, 1, -1);
            encoder0.encode(this.source, 32, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class StorageAreaPutResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private StorageAreaPutResponseParams(int version) {
            super(16, version);
        }

        public StorageAreaPutResponseParams() {
            this(0);
        }

        public static StorageAreaPutResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static StorageAreaPutResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static StorageAreaPutResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                StorageAreaPutResponseParams result = new StorageAreaPutResponseParams(elementsOrVersion);
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
    static class StorageAreaPutResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final StorageArea.PutResponse mCallback;

        StorageAreaPutResponseParamsForwardToCallback(StorageArea.PutResponse callback) {
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
                StorageAreaPutResponseParams response = StorageAreaPutResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.success));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class StorageAreaPutResponseParamsProxyToResponder implements StorageArea.PutResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        StorageAreaPutResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Boolean success) {
            StorageAreaPutResponseParams _response = new StorageAreaPutResponseParams();
            _response.success = success.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(1, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class StorageAreaDeleteParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public byte[] clientOldValue;
        public byte[] key;
        public String source;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private StorageAreaDeleteParams(int version) {
            super(32, version);
        }

        public StorageAreaDeleteParams() {
            this(0);
        }

        public static StorageAreaDeleteParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static StorageAreaDeleteParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static StorageAreaDeleteParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                StorageAreaDeleteParams result = new StorageAreaDeleteParams(elementsOrVersion);
                result.key = decoder0.readBytes(8, 0, -1);
                result.clientOldValue = decoder0.readBytes(16, 1, -1);
                result.source = decoder0.readString(24, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.key, 8, 0, -1);
            encoder0.encode(this.clientOldValue, 16, 1, -1);
            encoder0.encode(this.source, 24, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class StorageAreaDeleteResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private StorageAreaDeleteResponseParams(int version) {
            super(16, version);
        }

        public StorageAreaDeleteResponseParams() {
            this(0);
        }

        public static StorageAreaDeleteResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static StorageAreaDeleteResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static StorageAreaDeleteResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                StorageAreaDeleteResponseParams result = new StorageAreaDeleteResponseParams(elementsOrVersion);
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
    static class StorageAreaDeleteResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final StorageArea.DeleteResponse mCallback;

        StorageAreaDeleteResponseParamsForwardToCallback(StorageArea.DeleteResponse callback) {
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
                StorageAreaDeleteResponseParams response = StorageAreaDeleteResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.success));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class StorageAreaDeleteResponseParamsProxyToResponder implements StorageArea.DeleteResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        StorageAreaDeleteResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Boolean success) {
            StorageAreaDeleteResponseParams _response = new StorageAreaDeleteResponseParams();
            _response.success = success.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(2, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class StorageAreaDeleteAllParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public StorageAreaObserver newObserver;
        public String source;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private StorageAreaDeleteAllParams(int version) {
            super(24, version);
        }

        public StorageAreaDeleteAllParams() {
            this(0);
        }

        public static StorageAreaDeleteAllParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static StorageAreaDeleteAllParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static StorageAreaDeleteAllParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                StorageAreaDeleteAllParams result = new StorageAreaDeleteAllParams(elementsOrVersion);
                result.source = decoder0.readString(8, false);
                result.newObserver = (StorageAreaObserver) decoder0.readServiceInterface(16, true, StorageAreaObserver.MANAGER);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.source, 8, false);
            encoder0.encode( this.newObserver, 16, true,  StorageAreaObserver.MANAGER);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class StorageAreaDeleteAllResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private StorageAreaDeleteAllResponseParams(int version) {
            super(16, version);
        }

        public StorageAreaDeleteAllResponseParams() {
            this(0);
        }

        public static StorageAreaDeleteAllResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static StorageAreaDeleteAllResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static StorageAreaDeleteAllResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                StorageAreaDeleteAllResponseParams result = new StorageAreaDeleteAllResponseParams(elementsOrVersion);
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
    static class StorageAreaDeleteAllResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final StorageArea.DeleteAllResponse mCallback;

        StorageAreaDeleteAllResponseParamsForwardToCallback(StorageArea.DeleteAllResponse callback) {
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
                StorageAreaDeleteAllResponseParams response = StorageAreaDeleteAllResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.success));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class StorageAreaDeleteAllResponseParamsProxyToResponder implements StorageArea.DeleteAllResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        StorageAreaDeleteAllResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Boolean success) {
            StorageAreaDeleteAllResponseParams _response = new StorageAreaDeleteAllResponseParams();
            _response.success = success.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(3, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class StorageAreaGetParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public byte[] key;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private StorageAreaGetParams(int version) {
            super(16, version);
        }

        public StorageAreaGetParams() {
            this(0);
        }

        public static StorageAreaGetParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static StorageAreaGetParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static StorageAreaGetParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                StorageAreaGetParams result = new StorageAreaGetParams(elementsOrVersion);
                result.key = decoder0.readBytes(8, 0, -1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.key, 8, 0, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class StorageAreaGetResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean success;
        public byte[] value;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private StorageAreaGetResponseParams(int version) {
            super(24, version);
        }

        public StorageAreaGetResponseParams() {
            this(0);
        }

        public static StorageAreaGetResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static StorageAreaGetResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static StorageAreaGetResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                StorageAreaGetResponseParams result = new StorageAreaGetResponseParams(elementsOrVersion);
                result.success = decoder0.readBoolean(8, 0);
                result.value = decoder0.readBytes(16, 0, -1);
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
            encoder0.encode(this.value, 16, 0, -1);
        }
    }

    /* loaded from: classes2.dex */
    static class StorageAreaGetResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final StorageArea.GetResponse mCallback;

        StorageAreaGetResponseParamsForwardToCallback(StorageArea.GetResponse callback) {
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
                StorageAreaGetResponseParams response = StorageAreaGetResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.success), response.value);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class StorageAreaGetResponseParamsProxyToResponder implements StorageArea.GetResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        StorageAreaGetResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Boolean success, byte[] value) {
            StorageAreaGetResponseParams _response = new StorageAreaGetResponseParams();
            _response.success = success.booleanValue();
            _response.value = value;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(4, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class StorageAreaGetAllParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public StorageAreaObserver newObserver;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private StorageAreaGetAllParams(int version) {
            super(16, version);
        }

        public StorageAreaGetAllParams() {
            this(0);
        }

        public static StorageAreaGetAllParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static StorageAreaGetAllParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static StorageAreaGetAllParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                StorageAreaGetAllParams result = new StorageAreaGetAllParams(elementsOrVersion);
                result.newObserver = (StorageAreaObserver) decoder0.readServiceInterface(8, true, StorageAreaObserver.MANAGER);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.newObserver, 8, true,  StorageAreaObserver.MANAGER);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class StorageAreaGetAllResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public KeyValue[] data;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private StorageAreaGetAllResponseParams(int version) {
            super(16, version);
        }

        public StorageAreaGetAllResponseParams() {
            this(0);
        }

        public static StorageAreaGetAllResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static StorageAreaGetAllResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static StorageAreaGetAllResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                StorageAreaGetAllResponseParams result = new StorageAreaGetAllResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.data = new KeyValue[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.data[i1] = KeyValue.decode(decoder2);
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
            KeyValue[] keyValueArr = this.data;
            if (keyValueArr == null) {
                encoder0.encodeNullPointer(8, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(keyValueArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                KeyValue[] keyValueArr2 = this.data;
                if (i0 < keyValueArr2.length) {
                    encoder1.encode((Struct) keyValueArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static class StorageAreaGetAllResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final StorageArea.GetAllResponse mCallback;

        StorageAreaGetAllResponseParamsForwardToCallback(StorageArea.GetAllResponse callback) {
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
                StorageAreaGetAllResponseParams response = StorageAreaGetAllResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.data);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class StorageAreaGetAllResponseParamsProxyToResponder implements StorageArea.GetAllResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        StorageAreaGetAllResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(KeyValue[] data) {
            StorageAreaGetAllResponseParams _response = new StorageAreaGetAllResponseParams();
            _response.data = data;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(5, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
