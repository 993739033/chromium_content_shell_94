package org.chromium.data_decoder.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.data_decoder.mojom.ResourceSnapshotForWebBundle;
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
/* loaded from: classes2.dex */
class ResourceSnapshotForWebBundle_Internal {
    private static final int GET_RESOURCE_BODY_ORDINAL = 2;
    private static final int GET_RESOURCE_COUNT_ORDINAL = 0;
    private static final int GET_RESOURCE_INFO_ORDINAL = 1;
    public static final Interface.Manager<ResourceSnapshotForWebBundle, ResourceSnapshotForWebBundle.Proxy> MANAGER = new Interface.Manager<ResourceSnapshotForWebBundle, ResourceSnapshotForWebBundle.Proxy>() { // from class: org.chromium.data_decoder.mojom.ResourceSnapshotForWebBundle_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "data_decoder.mojom.ResourceSnapshotForWebBundle";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public ResourceSnapshotForWebBundle.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, ResourceSnapshotForWebBundle impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public ResourceSnapshotForWebBundle[] buildArray(int size) {
            return new ResourceSnapshotForWebBundle[size];
        }
    };

    ResourceSnapshotForWebBundle_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements ResourceSnapshotForWebBundle.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.data_decoder.mojom.ResourceSnapshotForWebBundle
        public void getResourceCount(GetResourceCountResponse callback) {
            ResourceSnapshotForWebBundleGetResourceCountParams _message = new ResourceSnapshotForWebBundleGetResourceCountParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new ResourceSnapshotForWebBundleGetResourceCountResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.data_decoder.mojom.ResourceSnapshotForWebBundle
        public void getResourceInfo(long index, GetResourceInfoResponse callback) {
            ResourceSnapshotForWebBundleGetResourceInfoParams _message = new ResourceSnapshotForWebBundleGetResourceInfoParams();
            _message.index = index;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1, 1, 0L)), new ResourceSnapshotForWebBundleGetResourceInfoResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.data_decoder.mojom.ResourceSnapshotForWebBundle
        public void getResourceBody(long index, GetResourceBodyResponse callback) {
            ResourceSnapshotForWebBundleGetResourceBodyParams _message = new ResourceSnapshotForWebBundleGetResourceBodyParams();
            _message.index = index;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2, 1, 0L)), new ResourceSnapshotForWebBundleGetResourceBodyResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<ResourceSnapshotForWebBundle> {
        Stub(Core core, ResourceSnapshotForWebBundle impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(ResourceSnapshotForWebBundle_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), ResourceSnapshotForWebBundle_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        ResourceSnapshotForWebBundleGetResourceCountParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getResourceCount(new ResourceSnapshotForWebBundleGetResourceCountResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 1:
                        ResourceSnapshotForWebBundleGetResourceInfoParams data = ResourceSnapshotForWebBundleGetResourceInfoParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getResourceInfo(data.index, new ResourceSnapshotForWebBundleGetResourceInfoResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 2:
                        ResourceSnapshotForWebBundleGetResourceBodyParams data2 = ResourceSnapshotForWebBundleGetResourceBodyParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getResourceBody(data2.index, new ResourceSnapshotForWebBundleGetResourceBodyResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class ResourceSnapshotForWebBundleGetResourceCountParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ResourceSnapshotForWebBundleGetResourceCountParams(int version) {
            super(8, version);
        }

        public ResourceSnapshotForWebBundleGetResourceCountParams() {
            this(0);
        }

        public static ResourceSnapshotForWebBundleGetResourceCountParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ResourceSnapshotForWebBundleGetResourceCountParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ResourceSnapshotForWebBundleGetResourceCountParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ResourceSnapshotForWebBundleGetResourceCountParams result = new ResourceSnapshotForWebBundleGetResourceCountParams(elementsOrVersion);
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
    public static final class ResourceSnapshotForWebBundleGetResourceCountResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public long count;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ResourceSnapshotForWebBundleGetResourceCountResponseParams(int version) {
            super(16, version);
        }

        public ResourceSnapshotForWebBundleGetResourceCountResponseParams() {
            this(0);
        }

        public static ResourceSnapshotForWebBundleGetResourceCountResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ResourceSnapshotForWebBundleGetResourceCountResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ResourceSnapshotForWebBundleGetResourceCountResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ResourceSnapshotForWebBundleGetResourceCountResponseParams result = new ResourceSnapshotForWebBundleGetResourceCountResponseParams(elementsOrVersion);
                result.count = decoder0.readLong(8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.count, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class ResourceSnapshotForWebBundleGetResourceCountResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final ResourceSnapshotForWebBundle.GetResourceCountResponse mCallback;

        ResourceSnapshotForWebBundleGetResourceCountResponseParamsForwardToCallback(ResourceSnapshotForWebBundle.GetResourceCountResponse callback) {
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
                ResourceSnapshotForWebBundleGetResourceCountResponseParams response = ResourceSnapshotForWebBundleGetResourceCountResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Long.valueOf(response.count));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class ResourceSnapshotForWebBundleGetResourceCountResponseParamsProxyToResponder implements ResourceSnapshotForWebBundle.GetResourceCountResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ResourceSnapshotForWebBundleGetResourceCountResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Long count) {
            ResourceSnapshotForWebBundleGetResourceCountResponseParams _response = new ResourceSnapshotForWebBundleGetResourceCountResponseParams();
            _response.count = count.longValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class ResourceSnapshotForWebBundleGetResourceInfoParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public long index;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ResourceSnapshotForWebBundleGetResourceInfoParams(int version) {
            super(16, version);
        }

        public ResourceSnapshotForWebBundleGetResourceInfoParams() {
            this(0);
        }

        public static ResourceSnapshotForWebBundleGetResourceInfoParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ResourceSnapshotForWebBundleGetResourceInfoParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ResourceSnapshotForWebBundleGetResourceInfoParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ResourceSnapshotForWebBundleGetResourceInfoParams result = new ResourceSnapshotForWebBundleGetResourceInfoParams(elementsOrVersion);
                result.index = decoder0.readLong(8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.index, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ResourceSnapshotForWebBundleGetResourceInfoResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public SerializedResourceInfo info;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ResourceSnapshotForWebBundleGetResourceInfoResponseParams(int version) {
            super(16, version);
        }

        public ResourceSnapshotForWebBundleGetResourceInfoResponseParams() {
            this(0);
        }

        public static ResourceSnapshotForWebBundleGetResourceInfoResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ResourceSnapshotForWebBundleGetResourceInfoResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ResourceSnapshotForWebBundleGetResourceInfoResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ResourceSnapshotForWebBundleGetResourceInfoResponseParams result = new ResourceSnapshotForWebBundleGetResourceInfoResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, true);
                result.info = SerializedResourceInfo.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.info, 8, true);
        }
    }

    /* loaded from: classes2.dex */
    static class ResourceSnapshotForWebBundleGetResourceInfoResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final ResourceSnapshotForWebBundle.GetResourceInfoResponse mCallback;

        ResourceSnapshotForWebBundleGetResourceInfoResponseParamsForwardToCallback(ResourceSnapshotForWebBundle.GetResourceInfoResponse callback) {
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
                ResourceSnapshotForWebBundleGetResourceInfoResponseParams response = ResourceSnapshotForWebBundleGetResourceInfoResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.info);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class ResourceSnapshotForWebBundleGetResourceInfoResponseParamsProxyToResponder implements ResourceSnapshotForWebBundle.GetResourceInfoResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ResourceSnapshotForWebBundleGetResourceInfoResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(SerializedResourceInfo info) {
            ResourceSnapshotForWebBundleGetResourceInfoResponseParams _response = new ResourceSnapshotForWebBundleGetResourceInfoResponseParams();
            _response.info = info;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(1, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class ResourceSnapshotForWebBundleGetResourceBodyParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public long index;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ResourceSnapshotForWebBundleGetResourceBodyParams(int version) {
            super(16, version);
        }

        public ResourceSnapshotForWebBundleGetResourceBodyParams() {
            this(0);
        }

        public static ResourceSnapshotForWebBundleGetResourceBodyParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ResourceSnapshotForWebBundleGetResourceBodyParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ResourceSnapshotForWebBundleGetResourceBodyParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ResourceSnapshotForWebBundleGetResourceBodyParams result = new ResourceSnapshotForWebBundleGetResourceBodyParams(elementsOrVersion);
                result.index = decoder0.readLong(8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.index, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ResourceSnapshotForWebBundleGetResourceBodyResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public BigBuffer data;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ResourceSnapshotForWebBundleGetResourceBodyResponseParams(int version) {
            super(24, version);
        }

        public ResourceSnapshotForWebBundleGetResourceBodyResponseParams() {
            this(0);
        }

        public static ResourceSnapshotForWebBundleGetResourceBodyResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ResourceSnapshotForWebBundleGetResourceBodyResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ResourceSnapshotForWebBundleGetResourceBodyResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ResourceSnapshotForWebBundleGetResourceBodyResponseParams result = new ResourceSnapshotForWebBundleGetResourceBodyResponseParams(elementsOrVersion);
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
            encoder0.encode((Union) this.data, 8, true);
        }
    }

    /* loaded from: classes2.dex */
    static class ResourceSnapshotForWebBundleGetResourceBodyResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final ResourceSnapshotForWebBundle.GetResourceBodyResponse mCallback;

        ResourceSnapshotForWebBundleGetResourceBodyResponseParamsForwardToCallback(ResourceSnapshotForWebBundle.GetResourceBodyResponse callback) {
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
                ResourceSnapshotForWebBundleGetResourceBodyResponseParams response = ResourceSnapshotForWebBundleGetResourceBodyResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.data);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class ResourceSnapshotForWebBundleGetResourceBodyResponseParamsProxyToResponder implements ResourceSnapshotForWebBundle.GetResourceBodyResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ResourceSnapshotForWebBundleGetResourceBodyResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(BigBuffer data) {
            ResourceSnapshotForWebBundleGetResourceBodyResponseParams _response = new ResourceSnapshotForWebBundleGetResourceBodyResponseParams();
            _response.data = data;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(2, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
