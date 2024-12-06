package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.ServiceWorkerRegistrationObjectHost;
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
class ServiceWorkerRegistrationObjectHost_Internal {
    private static final int ENABLE_NAVIGATION_PRELOAD_ORDINAL = 2;
    private static final int GET_NAVIGATION_PRELOAD_STATE_ORDINAL = 3;
    public static final Interface.Manager<ServiceWorkerRegistrationObjectHost, ServiceWorkerRegistrationObjectHost.Proxy> MANAGER = new Interface.Manager<ServiceWorkerRegistrationObjectHost, ServiceWorkerRegistrationObjectHost.Proxy>() { // from class: org.chromium.blink.mojom.ServiceWorkerRegistrationObjectHost_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.ServiceWorkerRegistrationObjectHost";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public ServiceWorkerRegistrationObjectHost.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, ServiceWorkerRegistrationObjectHost impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public ServiceWorkerRegistrationObjectHost[] buildArray(int size) {
            return new ServiceWorkerRegistrationObjectHost[size];
        }
    };
    private static final int SET_NAVIGATION_PRELOAD_HEADER_ORDINAL = 4;
    private static final int UNREGISTER_ORDINAL = 1;
    private static final int UPDATE_ORDINAL = 0;

    ServiceWorkerRegistrationObjectHost_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements ServiceWorkerRegistrationObjectHost.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.ServiceWorkerRegistrationObjectHost
        public void update(FetchClientSettingsObject outsideFetchClientSettingsObject, UpdateResponse callback) {
            ServiceWorkerRegistrationObjectHostUpdateParams _message = new ServiceWorkerRegistrationObjectHostUpdateParams();
            _message.outsideFetchClientSettingsObject = outsideFetchClientSettingsObject;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new ServiceWorkerRegistrationObjectHostUpdateResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.ServiceWorkerRegistrationObjectHost
        public void unregister(UnregisterResponse callback) {
            ServiceWorkerRegistrationObjectHostUnregisterParams _message = new ServiceWorkerRegistrationObjectHostUnregisterParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1, 1, 0L)), new ServiceWorkerRegistrationObjectHostUnregisterResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.ServiceWorkerRegistrationObjectHost
        public void enableNavigationPreload(boolean enable, EnableNavigationPreloadResponse callback) {
            ServiceWorkerRegistrationObjectHostEnableNavigationPreloadParams _message = new ServiceWorkerRegistrationObjectHostEnableNavigationPreloadParams();
            _message.enable = enable;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2, 1, 0L)), new ServiceWorkerRegistrationObjectHostEnableNavigationPreloadResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.ServiceWorkerRegistrationObjectHost
        public void getNavigationPreloadState(GetNavigationPreloadStateResponse callback) {
            ServiceWorkerRegistrationObjectHostGetNavigationPreloadStateParams _message = new ServiceWorkerRegistrationObjectHostGetNavigationPreloadStateParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3, 1, 0L)), new ServiceWorkerRegistrationObjectHostGetNavigationPreloadStateResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.ServiceWorkerRegistrationObjectHost
        public void setNavigationPreloadHeader(String value, SetNavigationPreloadHeaderResponse callback) {
            ServiceWorkerRegistrationObjectHostSetNavigationPreloadHeaderParams _message = new ServiceWorkerRegistrationObjectHostSetNavigationPreloadHeaderParams();
            _message.value = value;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(4, 1, 0L)), new ServiceWorkerRegistrationObjectHostSetNavigationPreloadHeaderResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<ServiceWorkerRegistrationObjectHost> {
        Stub(Core core, ServiceWorkerRegistrationObjectHost impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(ServiceWorkerRegistrationObjectHost_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), ServiceWorkerRegistrationObjectHost_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        ServiceWorkerRegistrationObjectHostUpdateParams data = ServiceWorkerRegistrationObjectHostUpdateParams.deserialize(messageWithHeader.getPayload());
                        getImpl().update(data.outsideFetchClientSettingsObject, new ServiceWorkerRegistrationObjectHostUpdateResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 1:
                        ServiceWorkerRegistrationObjectHostUnregisterParams.deserialize(messageWithHeader.getPayload());
                        getImpl().unregister(new ServiceWorkerRegistrationObjectHostUnregisterResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 2:
                        ServiceWorkerRegistrationObjectHostEnableNavigationPreloadParams data2 = ServiceWorkerRegistrationObjectHostEnableNavigationPreloadParams.deserialize(messageWithHeader.getPayload());
                        getImpl().enableNavigationPreload(data2.enable, new ServiceWorkerRegistrationObjectHostEnableNavigationPreloadResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 3:
                        ServiceWorkerRegistrationObjectHostGetNavigationPreloadStateParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getNavigationPreloadState(new ServiceWorkerRegistrationObjectHostGetNavigationPreloadStateResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 4:
                        ServiceWorkerRegistrationObjectHostSetNavigationPreloadHeaderParams data3 = ServiceWorkerRegistrationObjectHostSetNavigationPreloadHeaderParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setNavigationPreloadHeader(data3.value, new ServiceWorkerRegistrationObjectHostSetNavigationPreloadHeaderResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class ServiceWorkerRegistrationObjectHostUpdateParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public FetchClientSettingsObject outsideFetchClientSettingsObject;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerRegistrationObjectHostUpdateParams(int version) {
            super(16, version);
        }

        public ServiceWorkerRegistrationObjectHostUpdateParams() {
            this(0);
        }

        public static ServiceWorkerRegistrationObjectHostUpdateParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerRegistrationObjectHostUpdateParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerRegistrationObjectHostUpdateParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerRegistrationObjectHostUpdateParams result = new ServiceWorkerRegistrationObjectHostUpdateParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.outsideFetchClientSettingsObject = FetchClientSettingsObject.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.outsideFetchClientSettingsObject, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ServiceWorkerRegistrationObjectHostUpdateResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public int error;
        public String errorMsg;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerRegistrationObjectHostUpdateResponseParams(int version) {
            super(24, version);
        }

        public ServiceWorkerRegistrationObjectHostUpdateResponseParams() {
            this(0);
        }

        public static ServiceWorkerRegistrationObjectHostUpdateResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerRegistrationObjectHostUpdateResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerRegistrationObjectHostUpdateResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerRegistrationObjectHostUpdateResponseParams result = new ServiceWorkerRegistrationObjectHostUpdateResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.error = readInt;
                ServiceWorkerErrorType.validate(readInt);
                result.error = ServiceWorkerErrorType.toKnownValue(result.error);
                result.errorMsg = decoder0.readString(16, true);
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
            encoder0.encode(this.errorMsg, 16, true);
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerRegistrationObjectHostUpdateResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final ServiceWorkerRegistrationObjectHost.UpdateResponse mCallback;

        ServiceWorkerRegistrationObjectHostUpdateResponseParamsForwardToCallback(ServiceWorkerRegistrationObjectHost.UpdateResponse callback) {
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
                ServiceWorkerRegistrationObjectHostUpdateResponseParams response = ServiceWorkerRegistrationObjectHostUpdateResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.error), response.errorMsg);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerRegistrationObjectHostUpdateResponseParamsProxyToResponder implements ServiceWorkerRegistrationObjectHost.UpdateResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ServiceWorkerRegistrationObjectHostUpdateResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Integer error, String errorMsg) {
            ServiceWorkerRegistrationObjectHostUpdateResponseParams _response = new ServiceWorkerRegistrationObjectHostUpdateResponseParams();
            _response.error = error.intValue();
            _response.errorMsg = errorMsg;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class ServiceWorkerRegistrationObjectHostUnregisterParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerRegistrationObjectHostUnregisterParams(int version) {
            super(8, version);
        }

        public ServiceWorkerRegistrationObjectHostUnregisterParams() {
            this(0);
        }

        public static ServiceWorkerRegistrationObjectHostUnregisterParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerRegistrationObjectHostUnregisterParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerRegistrationObjectHostUnregisterParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerRegistrationObjectHostUnregisterParams result = new ServiceWorkerRegistrationObjectHostUnregisterParams(elementsOrVersion);
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
    public static final class ServiceWorkerRegistrationObjectHostUnregisterResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public int error;
        public String errorMsg;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerRegistrationObjectHostUnregisterResponseParams(int version) {
            super(24, version);
        }

        public ServiceWorkerRegistrationObjectHostUnregisterResponseParams() {
            this(0);
        }

        public static ServiceWorkerRegistrationObjectHostUnregisterResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerRegistrationObjectHostUnregisterResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerRegistrationObjectHostUnregisterResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerRegistrationObjectHostUnregisterResponseParams result = new ServiceWorkerRegistrationObjectHostUnregisterResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.error = readInt;
                ServiceWorkerErrorType.validate(readInt);
                result.error = ServiceWorkerErrorType.toKnownValue(result.error);
                result.errorMsg = decoder0.readString(16, true);
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
            encoder0.encode(this.errorMsg, 16, true);
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerRegistrationObjectHostUnregisterResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final ServiceWorkerRegistrationObjectHost.UnregisterResponse mCallback;

        ServiceWorkerRegistrationObjectHostUnregisterResponseParamsForwardToCallback(ServiceWorkerRegistrationObjectHost.UnregisterResponse callback) {
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
                ServiceWorkerRegistrationObjectHostUnregisterResponseParams response = ServiceWorkerRegistrationObjectHostUnregisterResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.error), response.errorMsg);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerRegistrationObjectHostUnregisterResponseParamsProxyToResponder implements ServiceWorkerRegistrationObjectHost.UnregisterResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ServiceWorkerRegistrationObjectHostUnregisterResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Integer error, String errorMsg) {
            ServiceWorkerRegistrationObjectHostUnregisterResponseParams _response = new ServiceWorkerRegistrationObjectHostUnregisterResponseParams();
            _response.error = error.intValue();
            _response.errorMsg = errorMsg;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(1, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class ServiceWorkerRegistrationObjectHostEnableNavigationPreloadParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean enable;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerRegistrationObjectHostEnableNavigationPreloadParams(int version) {
            super(16, version);
        }

        public ServiceWorkerRegistrationObjectHostEnableNavigationPreloadParams() {
            this(0);
        }

        public static ServiceWorkerRegistrationObjectHostEnableNavigationPreloadParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerRegistrationObjectHostEnableNavigationPreloadParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerRegistrationObjectHostEnableNavigationPreloadParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerRegistrationObjectHostEnableNavigationPreloadParams result = new ServiceWorkerRegistrationObjectHostEnableNavigationPreloadParams(elementsOrVersion);
                result.enable = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.enable, 8, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ServiceWorkerRegistrationObjectHostEnableNavigationPreloadResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public int error;
        public String errorMsg;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerRegistrationObjectHostEnableNavigationPreloadResponseParams(int version) {
            super(24, version);
        }

        public ServiceWorkerRegistrationObjectHostEnableNavigationPreloadResponseParams() {
            this(0);
        }

        public static ServiceWorkerRegistrationObjectHostEnableNavigationPreloadResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerRegistrationObjectHostEnableNavigationPreloadResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerRegistrationObjectHostEnableNavigationPreloadResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerRegistrationObjectHostEnableNavigationPreloadResponseParams result = new ServiceWorkerRegistrationObjectHostEnableNavigationPreloadResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.error = readInt;
                ServiceWorkerErrorType.validate(readInt);
                result.error = ServiceWorkerErrorType.toKnownValue(result.error);
                result.errorMsg = decoder0.readString(16, true);
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
            encoder0.encode(this.errorMsg, 16, true);
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerRegistrationObjectHostEnableNavigationPreloadResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final ServiceWorkerRegistrationObjectHost.EnableNavigationPreloadResponse mCallback;

        ServiceWorkerRegistrationObjectHostEnableNavigationPreloadResponseParamsForwardToCallback(ServiceWorkerRegistrationObjectHost.EnableNavigationPreloadResponse callback) {
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
                ServiceWorkerRegistrationObjectHostEnableNavigationPreloadResponseParams response = ServiceWorkerRegistrationObjectHostEnableNavigationPreloadResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.error), response.errorMsg);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerRegistrationObjectHostEnableNavigationPreloadResponseParamsProxyToResponder implements ServiceWorkerRegistrationObjectHost.EnableNavigationPreloadResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ServiceWorkerRegistrationObjectHostEnableNavigationPreloadResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Integer error, String errorMsg) {
            ServiceWorkerRegistrationObjectHostEnableNavigationPreloadResponseParams _response = new ServiceWorkerRegistrationObjectHostEnableNavigationPreloadResponseParams();
            _response.error = error.intValue();
            _response.errorMsg = errorMsg;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(2, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class ServiceWorkerRegistrationObjectHostGetNavigationPreloadStateParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerRegistrationObjectHostGetNavigationPreloadStateParams(int version) {
            super(8, version);
        }

        public ServiceWorkerRegistrationObjectHostGetNavigationPreloadStateParams() {
            this(0);
        }

        public static ServiceWorkerRegistrationObjectHostGetNavigationPreloadStateParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerRegistrationObjectHostGetNavigationPreloadStateParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerRegistrationObjectHostGetNavigationPreloadStateParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerRegistrationObjectHostGetNavigationPreloadStateParams result = new ServiceWorkerRegistrationObjectHostGetNavigationPreloadStateParams(elementsOrVersion);
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
    public static final class ServiceWorkerRegistrationObjectHostGetNavigationPreloadStateResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public int error;
        public String errorMsg;
        public NavigationPreloadState state;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerRegistrationObjectHostGetNavigationPreloadStateResponseParams(int version) {
            super(32, version);
        }

        public ServiceWorkerRegistrationObjectHostGetNavigationPreloadStateResponseParams() {
            this(0);
        }

        public static ServiceWorkerRegistrationObjectHostGetNavigationPreloadStateResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerRegistrationObjectHostGetNavigationPreloadStateResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerRegistrationObjectHostGetNavigationPreloadStateResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerRegistrationObjectHostGetNavigationPreloadStateResponseParams result = new ServiceWorkerRegistrationObjectHostGetNavigationPreloadStateResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.error = readInt;
                ServiceWorkerErrorType.validate(readInt);
                result.error = ServiceWorkerErrorType.toKnownValue(result.error);
                result.errorMsg = decoder0.readString(16, true);
                Decoder decoder1 = decoder0.readPointer(24, true);
                result.state = NavigationPreloadState.decode(decoder1);
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
            encoder0.encode(this.errorMsg, 16, true);
            encoder0.encode((Struct) this.state, 24, true);
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerRegistrationObjectHostGetNavigationPreloadStateResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final ServiceWorkerRegistrationObjectHost.GetNavigationPreloadStateResponse mCallback;

        ServiceWorkerRegistrationObjectHostGetNavigationPreloadStateResponseParamsForwardToCallback(ServiceWorkerRegistrationObjectHost.GetNavigationPreloadStateResponse callback) {
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
                ServiceWorkerRegistrationObjectHostGetNavigationPreloadStateResponseParams response = ServiceWorkerRegistrationObjectHostGetNavigationPreloadStateResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.error), response.errorMsg, response.state);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerRegistrationObjectHostGetNavigationPreloadStateResponseParamsProxyToResponder implements ServiceWorkerRegistrationObjectHost.GetNavigationPreloadStateResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ServiceWorkerRegistrationObjectHostGetNavigationPreloadStateResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback3
        public void call(Integer error, String errorMsg, NavigationPreloadState state) {
            ServiceWorkerRegistrationObjectHostGetNavigationPreloadStateResponseParams _response = new ServiceWorkerRegistrationObjectHostGetNavigationPreloadStateResponseParams();
            _response.error = error.intValue();
            _response.errorMsg = errorMsg;
            _response.state = state;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(3, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class ServiceWorkerRegistrationObjectHostSetNavigationPreloadHeaderParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public String value;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerRegistrationObjectHostSetNavigationPreloadHeaderParams(int version) {
            super(16, version);
        }

        public ServiceWorkerRegistrationObjectHostSetNavigationPreloadHeaderParams() {
            this(0);
        }

        public static ServiceWorkerRegistrationObjectHostSetNavigationPreloadHeaderParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerRegistrationObjectHostSetNavigationPreloadHeaderParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerRegistrationObjectHostSetNavigationPreloadHeaderParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerRegistrationObjectHostSetNavigationPreloadHeaderParams result = new ServiceWorkerRegistrationObjectHostSetNavigationPreloadHeaderParams(elementsOrVersion);
                result.value = decoder0.readString(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.value, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ServiceWorkerRegistrationObjectHostSetNavigationPreloadHeaderResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public int error;
        public String errorMsg;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerRegistrationObjectHostSetNavigationPreloadHeaderResponseParams(int version) {
            super(24, version);
        }

        public ServiceWorkerRegistrationObjectHostSetNavigationPreloadHeaderResponseParams() {
            this(0);
        }

        public static ServiceWorkerRegistrationObjectHostSetNavigationPreloadHeaderResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerRegistrationObjectHostSetNavigationPreloadHeaderResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerRegistrationObjectHostSetNavigationPreloadHeaderResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerRegistrationObjectHostSetNavigationPreloadHeaderResponseParams result = new ServiceWorkerRegistrationObjectHostSetNavigationPreloadHeaderResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.error = readInt;
                ServiceWorkerErrorType.validate(readInt);
                result.error = ServiceWorkerErrorType.toKnownValue(result.error);
                result.errorMsg = decoder0.readString(16, true);
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
            encoder0.encode(this.errorMsg, 16, true);
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerRegistrationObjectHostSetNavigationPreloadHeaderResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final ServiceWorkerRegistrationObjectHost.SetNavigationPreloadHeaderResponse mCallback;

        ServiceWorkerRegistrationObjectHostSetNavigationPreloadHeaderResponseParamsForwardToCallback(ServiceWorkerRegistrationObjectHost.SetNavigationPreloadHeaderResponse callback) {
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
                ServiceWorkerRegistrationObjectHostSetNavigationPreloadHeaderResponseParams response = ServiceWorkerRegistrationObjectHostSetNavigationPreloadHeaderResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.error), response.errorMsg);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerRegistrationObjectHostSetNavigationPreloadHeaderResponseParamsProxyToResponder implements ServiceWorkerRegistrationObjectHost.SetNavigationPreloadHeaderResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ServiceWorkerRegistrationObjectHostSetNavigationPreloadHeaderResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Integer error, String errorMsg) {
            ServiceWorkerRegistrationObjectHostSetNavigationPreloadHeaderResponseParams _response = new ServiceWorkerRegistrationObjectHostSetNavigationPreloadHeaderResponseParams();
            _response.error = error.intValue();
            _response.errorMsg = errorMsg;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(4, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
