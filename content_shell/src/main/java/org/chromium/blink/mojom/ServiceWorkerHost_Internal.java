package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.ServiceWorkerHost;
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
import org.chromium.mojo_base.mojom.ReadOnlyBuffer;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
class ServiceWorkerHost_Internal {
    private static final int CLAIM_CLIENTS_ORDINAL = 10;
    private static final int CLEAR_CACHED_METADATA_ORDINAL = 1;
    private static final int FOCUS_CLIENT_ORDINAL = 7;
    private static final int GET_CLIENTS_ORDINAL = 2;
    private static final int GET_CLIENT_ORDINAL = 3;
    public static final Interface.Manager<ServiceWorkerHost, ServiceWorkerHost.Proxy> MANAGER = new Interface.Manager<ServiceWorkerHost, ServiceWorkerHost.Proxy>() { // from class: org.chromium.blink.mojom.ServiceWorkerHost_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.ServiceWorkerHost";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public ServiceWorkerHost.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, ServiceWorkerHost impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public ServiceWorkerHost[] buildArray(int size) {
            return new ServiceWorkerHost[size];
        }
    };
    private static final int NAVIGATE_CLIENT_ORDINAL = 8;
    private static final int OPEN_NEW_TAB_ORDINAL = 4;
    private static final int OPEN_PAYMENT_HANDLER_WINDOW_ORDINAL = 5;
    private static final int POST_MESSAGE_TO_CLIENT_ORDINAL = 6;
    private static final int SET_CACHED_METADATA_ORDINAL = 0;
    private static final int SKIP_WAITING_ORDINAL = 9;

    ServiceWorkerHost_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements ServiceWorkerHost.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.ServiceWorkerHost
        public void setCachedMetadata(Url url, ReadOnlyBuffer data) {
            ServiceWorkerHostSetCachedMetadataParams _message = new ServiceWorkerHostSetCachedMetadataParams();
            _message.url = url;
            _message.data = data;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }

        @Override // org.chromium.blink.mojom.ServiceWorkerHost
        public void clearCachedMetadata(Url url) {
            ServiceWorkerHostClearCachedMetadataParams _message = new ServiceWorkerHostClearCachedMetadataParams();
            _message.url = url;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1)));
        }

        @Override // org.chromium.blink.mojom.ServiceWorkerHost
        public void getClients(ServiceWorkerClientQueryOptions options, GetClientsResponse callback) {
            ServiceWorkerHostGetClientsParams _message = new ServiceWorkerHostGetClientsParams();
            _message.options = options;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2, 1, 0L)), new ServiceWorkerHostGetClientsResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.ServiceWorkerHost
        public void getClient(String clientUuid, GetClientResponse callback) {
            ServiceWorkerHostGetClientParams _message = new ServiceWorkerHostGetClientParams();
            _message.clientUuid = clientUuid;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3, 1, 0L)), new ServiceWorkerHostGetClientResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.ServiceWorkerHost
        public void openNewTab(Url url, OpenNewTabResponse callback) {
            ServiceWorkerHostOpenNewTabParams _message = new ServiceWorkerHostOpenNewTabParams();
            _message.url = url;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(4, 1, 0L)), new ServiceWorkerHostOpenNewTabResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.ServiceWorkerHost
        public void openPaymentHandlerWindow(Url url, OpenPaymentHandlerWindowResponse callback) {
            ServiceWorkerHostOpenPaymentHandlerWindowParams _message = new ServiceWorkerHostOpenPaymentHandlerWindowParams();
            _message.url = url;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(5, 1, 0L)), new ServiceWorkerHostOpenPaymentHandlerWindowResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.ServiceWorkerHost
        public void postMessageToClient(String clientUuid, TransferableMessage message) {
            ServiceWorkerHostPostMessageToClientParams _message = new ServiceWorkerHostPostMessageToClientParams();
            _message.clientUuid = clientUuid;
            _message.message = message;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(6)));
        }

        @Override // org.chromium.blink.mojom.ServiceWorkerHost
        public void focusClient(String clientUuid, FocusClientResponse callback) {
            ServiceWorkerHostFocusClientParams _message = new ServiceWorkerHostFocusClientParams();
            _message.clientUuid = clientUuid;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(7, 1, 0L)), new ServiceWorkerHostFocusClientResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.ServiceWorkerHost
        public void navigateClient(String clientUuid, Url url, NavigateClientResponse callback) {
            ServiceWorkerHostNavigateClientParams _message = new ServiceWorkerHostNavigateClientParams();
            _message.clientUuid = clientUuid;
            _message.url = url;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(8, 1, 0L)), new ServiceWorkerHostNavigateClientResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.ServiceWorkerHost
        public void skipWaiting(SkipWaitingResponse callback) {
            ServiceWorkerHostSkipWaitingParams _message = new ServiceWorkerHostSkipWaitingParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(9, 1, 0L)), new ServiceWorkerHostSkipWaitingResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.ServiceWorkerHost
        public void claimClients(ClaimClientsResponse callback) {
            ServiceWorkerHostClaimClientsParams _message = new ServiceWorkerHostClaimClientsParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(10, 1, 0L)), new ServiceWorkerHostClaimClientsResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<ServiceWorkerHost> {
        Stub(Core core, ServiceWorkerHost impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(ServiceWorkerHost_Internal.MANAGER, messageWithHeader);
                    case 0:
                        ServiceWorkerHostSetCachedMetadataParams data = ServiceWorkerHostSetCachedMetadataParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setCachedMetadata(data.url, data.data);
                        return true;
                    case 1:
                        getImpl().clearCachedMetadata(ServiceWorkerHostClearCachedMetadataParams.deserialize(messageWithHeader.getPayload()).url);
                        return true;
                    case 6:
                        ServiceWorkerHostPostMessageToClientParams data2 = ServiceWorkerHostPostMessageToClientParams.deserialize(messageWithHeader.getPayload());
                        getImpl().postMessageToClient(data2.clientUuid, data2.message);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), ServiceWorkerHost_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                    case 1:
                    case 6:
                    default:
                        return false;
                    case 2:
                        ServiceWorkerHostGetClientsParams data = ServiceWorkerHostGetClientsParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getClients(data.options, new ServiceWorkerHostGetClientsResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 3:
                        ServiceWorkerHostGetClientParams data2 = ServiceWorkerHostGetClientParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getClient(data2.clientUuid, new ServiceWorkerHostGetClientResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 4:
                        ServiceWorkerHostOpenNewTabParams data3 = ServiceWorkerHostOpenNewTabParams.deserialize(messageWithHeader.getPayload());
                        getImpl().openNewTab(data3.url, new ServiceWorkerHostOpenNewTabResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 5:
                        ServiceWorkerHostOpenPaymentHandlerWindowParams data4 = ServiceWorkerHostOpenPaymentHandlerWindowParams.deserialize(messageWithHeader.getPayload());
                        getImpl().openPaymentHandlerWindow(data4.url, new ServiceWorkerHostOpenPaymentHandlerWindowResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 7:
                        ServiceWorkerHostFocusClientParams data5 = ServiceWorkerHostFocusClientParams.deserialize(messageWithHeader.getPayload());
                        getImpl().focusClient(data5.clientUuid, new ServiceWorkerHostFocusClientResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 8:
                        ServiceWorkerHostNavigateClientParams data6 = ServiceWorkerHostNavigateClientParams.deserialize(messageWithHeader.getPayload());
                        getImpl().navigateClient(data6.clientUuid, data6.url, new ServiceWorkerHostNavigateClientResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 9:
                        ServiceWorkerHostSkipWaitingParams.deserialize(messageWithHeader.getPayload());
                        getImpl().skipWaiting(new ServiceWorkerHostSkipWaitingResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 10:
                        ServiceWorkerHostClaimClientsParams.deserialize(messageWithHeader.getPayload());
                        getImpl().claimClients(new ServiceWorkerHostClaimClientsResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                }
            } catch (DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class ServiceWorkerHostSetCachedMetadataParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public ReadOnlyBuffer data;
        public Url url;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerHostSetCachedMetadataParams(int version) {
            super(24, version);
        }

        public ServiceWorkerHostSetCachedMetadataParams() {
            this(0);
        }

        public static ServiceWorkerHostSetCachedMetadataParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerHostSetCachedMetadataParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerHostSetCachedMetadataParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerHostSetCachedMetadataParams result = new ServiceWorkerHostSetCachedMetadataParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.url = Url.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.data = ReadOnlyBuffer.decode(decoder12);
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
            encoder0.encode((Struct) this.data, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class ServiceWorkerHostClearCachedMetadataParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public Url url;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerHostClearCachedMetadataParams(int version) {
            super(16, version);
        }

        public ServiceWorkerHostClearCachedMetadataParams() {
            this(0);
        }

        public static ServiceWorkerHostClearCachedMetadataParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerHostClearCachedMetadataParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerHostClearCachedMetadataParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerHostClearCachedMetadataParams result = new ServiceWorkerHostClearCachedMetadataParams(elementsOrVersion);
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
    static final class ServiceWorkerHostGetClientsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public ServiceWorkerClientQueryOptions options;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerHostGetClientsParams(int version) {
            super(16, version);
        }

        public ServiceWorkerHostGetClientsParams() {
            this(0);
        }

        public static ServiceWorkerHostGetClientsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerHostGetClientsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerHostGetClientsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerHostGetClientsParams result = new ServiceWorkerHostGetClientsParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.options = ServiceWorkerClientQueryOptions.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.options, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ServiceWorkerHostGetClientsResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public ServiceWorkerClientInfo[] clients;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerHostGetClientsResponseParams(int version) {
            super(16, version);
        }

        public ServiceWorkerHostGetClientsResponseParams() {
            this(0);
        }

        public static ServiceWorkerHostGetClientsResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerHostGetClientsResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerHostGetClientsResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerHostGetClientsResponseParams result = new ServiceWorkerHostGetClientsResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.clients = new ServiceWorkerClientInfo[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.clients[i1] = ServiceWorkerClientInfo.decode(decoder2);
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
            ServiceWorkerClientInfo[] serviceWorkerClientInfoArr = this.clients;
            if (serviceWorkerClientInfoArr == null) {
                encoder0.encodeNullPointer(8, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(serviceWorkerClientInfoArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                ServiceWorkerClientInfo[] serviceWorkerClientInfoArr2 = this.clients;
                if (i0 < serviceWorkerClientInfoArr2.length) {
                    encoder1.encode((Struct) serviceWorkerClientInfoArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerHostGetClientsResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final ServiceWorkerHost.GetClientsResponse mCallback;

        ServiceWorkerHostGetClientsResponseParamsForwardToCallback(ServiceWorkerHost.GetClientsResponse callback) {
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
                ServiceWorkerHostGetClientsResponseParams response = ServiceWorkerHostGetClientsResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.clients);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerHostGetClientsResponseParamsProxyToResponder implements ServiceWorkerHost.GetClientsResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ServiceWorkerHostGetClientsResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(ServiceWorkerClientInfo[] clients) {
            ServiceWorkerHostGetClientsResponseParams _response = new ServiceWorkerHostGetClientsResponseParams();
            _response.clients = clients;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(2, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class ServiceWorkerHostGetClientParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public String clientUuid;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerHostGetClientParams(int version) {
            super(16, version);
        }

        public ServiceWorkerHostGetClientParams() {
            this(0);
        }

        public static ServiceWorkerHostGetClientParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerHostGetClientParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerHostGetClientParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerHostGetClientParams result = new ServiceWorkerHostGetClientParams(elementsOrVersion);
                result.clientUuid = decoder0.readString(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.clientUuid, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ServiceWorkerHostGetClientResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public ServiceWorkerClientInfo client;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerHostGetClientResponseParams(int version) {
            super(16, version);
        }

        public ServiceWorkerHostGetClientResponseParams() {
            this(0);
        }

        public static ServiceWorkerHostGetClientResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerHostGetClientResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerHostGetClientResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerHostGetClientResponseParams result = new ServiceWorkerHostGetClientResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, true);
                result.client = ServiceWorkerClientInfo.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.client, 8, true);
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerHostGetClientResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final ServiceWorkerHost.GetClientResponse mCallback;

        ServiceWorkerHostGetClientResponseParamsForwardToCallback(ServiceWorkerHost.GetClientResponse callback) {
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
                ServiceWorkerHostGetClientResponseParams response = ServiceWorkerHostGetClientResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.client);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerHostGetClientResponseParamsProxyToResponder implements ServiceWorkerHost.GetClientResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ServiceWorkerHostGetClientResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(ServiceWorkerClientInfo client) {
            ServiceWorkerHostGetClientResponseParams _response = new ServiceWorkerHostGetClientResponseParams();
            _response.client = client;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(3, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class ServiceWorkerHostOpenNewTabParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public Url url;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerHostOpenNewTabParams(int version) {
            super(16, version);
        }

        public ServiceWorkerHostOpenNewTabParams() {
            this(0);
        }

        public static ServiceWorkerHostOpenNewTabParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerHostOpenNewTabParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerHostOpenNewTabParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerHostOpenNewTabParams result = new ServiceWorkerHostOpenNewTabParams(elementsOrVersion);
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
    public static final class ServiceWorkerHostOpenNewTabResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public ServiceWorkerClientInfo client;
        public String errorMsg;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerHostOpenNewTabResponseParams(int version) {
            super(32, version);
        }

        public ServiceWorkerHostOpenNewTabResponseParams() {
            this(0);
        }

        public static ServiceWorkerHostOpenNewTabResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerHostOpenNewTabResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerHostOpenNewTabResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerHostOpenNewTabResponseParams result = new ServiceWorkerHostOpenNewTabResponseParams(elementsOrVersion);
                result.success = decoder0.readBoolean(8, 0);
                Decoder decoder1 = decoder0.readPointer(16, true);
                result.client = ServiceWorkerClientInfo.decode(decoder1);
                result.errorMsg = decoder0.readString(24, true);
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
            encoder0.encode((Struct) this.client, 16, true);
            encoder0.encode(this.errorMsg, 24, true);
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerHostOpenNewTabResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final ServiceWorkerHost.OpenNewTabResponse mCallback;

        ServiceWorkerHostOpenNewTabResponseParamsForwardToCallback(ServiceWorkerHost.OpenNewTabResponse callback) {
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
                ServiceWorkerHostOpenNewTabResponseParams response = ServiceWorkerHostOpenNewTabResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.success), response.client, response.errorMsg);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerHostOpenNewTabResponseParamsProxyToResponder implements ServiceWorkerHost.OpenNewTabResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ServiceWorkerHostOpenNewTabResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback3
        public void call(Boolean success, ServiceWorkerClientInfo client, String errorMsg) {
            ServiceWorkerHostOpenNewTabResponseParams _response = new ServiceWorkerHostOpenNewTabResponseParams();
            _response.success = success.booleanValue();
            _response.client = client;
            _response.errorMsg = errorMsg;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(4, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class ServiceWorkerHostOpenPaymentHandlerWindowParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public Url url;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerHostOpenPaymentHandlerWindowParams(int version) {
            super(16, version);
        }

        public ServiceWorkerHostOpenPaymentHandlerWindowParams() {
            this(0);
        }

        public static ServiceWorkerHostOpenPaymentHandlerWindowParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerHostOpenPaymentHandlerWindowParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerHostOpenPaymentHandlerWindowParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerHostOpenPaymentHandlerWindowParams result = new ServiceWorkerHostOpenPaymentHandlerWindowParams(elementsOrVersion);
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
    public static final class ServiceWorkerHostOpenPaymentHandlerWindowResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public ServiceWorkerClientInfo client;
        public String errorMsg;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerHostOpenPaymentHandlerWindowResponseParams(int version) {
            super(32, version);
        }

        public ServiceWorkerHostOpenPaymentHandlerWindowResponseParams() {
            this(0);
        }

        public static ServiceWorkerHostOpenPaymentHandlerWindowResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerHostOpenPaymentHandlerWindowResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerHostOpenPaymentHandlerWindowResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerHostOpenPaymentHandlerWindowResponseParams result = new ServiceWorkerHostOpenPaymentHandlerWindowResponseParams(elementsOrVersion);
                result.success = decoder0.readBoolean(8, 0);
                Decoder decoder1 = decoder0.readPointer(16, true);
                result.client = ServiceWorkerClientInfo.decode(decoder1);
                result.errorMsg = decoder0.readString(24, true);
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
            encoder0.encode((Struct) this.client, 16, true);
            encoder0.encode(this.errorMsg, 24, true);
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerHostOpenPaymentHandlerWindowResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final ServiceWorkerHost.OpenPaymentHandlerWindowResponse mCallback;

        ServiceWorkerHostOpenPaymentHandlerWindowResponseParamsForwardToCallback(ServiceWorkerHost.OpenPaymentHandlerWindowResponse callback) {
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
                ServiceWorkerHostOpenPaymentHandlerWindowResponseParams response = ServiceWorkerHostOpenPaymentHandlerWindowResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.success), response.client, response.errorMsg);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerHostOpenPaymentHandlerWindowResponseParamsProxyToResponder implements ServiceWorkerHost.OpenPaymentHandlerWindowResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ServiceWorkerHostOpenPaymentHandlerWindowResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback3
        public void call(Boolean success, ServiceWorkerClientInfo client, String errorMsg) {
            ServiceWorkerHostOpenPaymentHandlerWindowResponseParams _response = new ServiceWorkerHostOpenPaymentHandlerWindowResponseParams();
            _response.success = success.booleanValue();
            _response.client = client;
            _response.errorMsg = errorMsg;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(5, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class ServiceWorkerHostPostMessageToClientParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public String clientUuid;
        public TransferableMessage message;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerHostPostMessageToClientParams(int version) {
            super(24, version);
        }

        public ServiceWorkerHostPostMessageToClientParams() {
            this(0);
        }

        public static ServiceWorkerHostPostMessageToClientParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerHostPostMessageToClientParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerHostPostMessageToClientParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerHostPostMessageToClientParams result = new ServiceWorkerHostPostMessageToClientParams(elementsOrVersion);
                result.clientUuid = decoder0.readString(8, false);
                Decoder decoder1 = decoder0.readPointer(16, false);
                result.message = TransferableMessage.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.clientUuid, 8, false);
            encoder0.encode((Struct) this.message, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class ServiceWorkerHostFocusClientParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public String clientUuid;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerHostFocusClientParams(int version) {
            super(16, version);
        }

        public ServiceWorkerHostFocusClientParams() {
            this(0);
        }

        public static ServiceWorkerHostFocusClientParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerHostFocusClientParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerHostFocusClientParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerHostFocusClientParams result = new ServiceWorkerHostFocusClientParams(elementsOrVersion);
                result.clientUuid = decoder0.readString(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.clientUuid, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ServiceWorkerHostFocusClientResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public ServiceWorkerClientInfo client;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerHostFocusClientResponseParams(int version) {
            super(16, version);
        }

        public ServiceWorkerHostFocusClientResponseParams() {
            this(0);
        }

        public static ServiceWorkerHostFocusClientResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerHostFocusClientResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerHostFocusClientResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerHostFocusClientResponseParams result = new ServiceWorkerHostFocusClientResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, true);
                result.client = ServiceWorkerClientInfo.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.client, 8, true);
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerHostFocusClientResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final ServiceWorkerHost.FocusClientResponse mCallback;

        ServiceWorkerHostFocusClientResponseParamsForwardToCallback(ServiceWorkerHost.FocusClientResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(7, 2)) {
                    return false;
                }
                ServiceWorkerHostFocusClientResponseParams response = ServiceWorkerHostFocusClientResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.client);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerHostFocusClientResponseParamsProxyToResponder implements ServiceWorkerHost.FocusClientResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ServiceWorkerHostFocusClientResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(ServiceWorkerClientInfo client) {
            ServiceWorkerHostFocusClientResponseParams _response = new ServiceWorkerHostFocusClientResponseParams();
            _response.client = client;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(7, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class ServiceWorkerHostNavigateClientParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public String clientUuid;
        public Url url;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerHostNavigateClientParams(int version) {
            super(24, version);
        }

        public ServiceWorkerHostNavigateClientParams() {
            this(0);
        }

        public static ServiceWorkerHostNavigateClientParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerHostNavigateClientParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerHostNavigateClientParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerHostNavigateClientParams result = new ServiceWorkerHostNavigateClientParams(elementsOrVersion);
                result.clientUuid = decoder0.readString(8, false);
                Decoder decoder1 = decoder0.readPointer(16, false);
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
            encoder0.encode(this.clientUuid, 8, false);
            encoder0.encode((Struct) this.url, 16, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class ServiceWorkerHostNavigateClientResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public ServiceWorkerClientInfo client;
        public String errorMsg;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerHostNavigateClientResponseParams(int version) {
            super(32, version);
        }

        public ServiceWorkerHostNavigateClientResponseParams() {
            this(0);
        }

        public static ServiceWorkerHostNavigateClientResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerHostNavigateClientResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerHostNavigateClientResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerHostNavigateClientResponseParams result = new ServiceWorkerHostNavigateClientResponseParams(elementsOrVersion);
                result.success = decoder0.readBoolean(8, 0);
                Decoder decoder1 = decoder0.readPointer(16, true);
                result.client = ServiceWorkerClientInfo.decode(decoder1);
                result.errorMsg = decoder0.readString(24, true);
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
            encoder0.encode((Struct) this.client, 16, true);
            encoder0.encode(this.errorMsg, 24, true);
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerHostNavigateClientResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final ServiceWorkerHost.NavigateClientResponse mCallback;

        ServiceWorkerHostNavigateClientResponseParamsForwardToCallback(ServiceWorkerHost.NavigateClientResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(8, 2)) {
                    return false;
                }
                ServiceWorkerHostNavigateClientResponseParams response = ServiceWorkerHostNavigateClientResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.success), response.client, response.errorMsg);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerHostNavigateClientResponseParamsProxyToResponder implements ServiceWorkerHost.NavigateClientResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ServiceWorkerHostNavigateClientResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback3
        public void call(Boolean success, ServiceWorkerClientInfo client, String errorMsg) {
            ServiceWorkerHostNavigateClientResponseParams _response = new ServiceWorkerHostNavigateClientResponseParams();
            _response.success = success.booleanValue();
            _response.client = client;
            _response.errorMsg = errorMsg;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(8, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class ServiceWorkerHostSkipWaitingParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerHostSkipWaitingParams(int version) {
            super(8, version);
        }

        public ServiceWorkerHostSkipWaitingParams() {
            this(0);
        }

        public static ServiceWorkerHostSkipWaitingParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerHostSkipWaitingParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerHostSkipWaitingParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerHostSkipWaitingParams result = new ServiceWorkerHostSkipWaitingParams(elementsOrVersion);
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
    public static final class ServiceWorkerHostSkipWaitingResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerHostSkipWaitingResponseParams(int version) {
            super(16, version);
        }

        public ServiceWorkerHostSkipWaitingResponseParams() {
            this(0);
        }

        public static ServiceWorkerHostSkipWaitingResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerHostSkipWaitingResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerHostSkipWaitingResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerHostSkipWaitingResponseParams result = new ServiceWorkerHostSkipWaitingResponseParams(elementsOrVersion);
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
    static class ServiceWorkerHostSkipWaitingResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final ServiceWorkerHost.SkipWaitingResponse mCallback;

        ServiceWorkerHostSkipWaitingResponseParamsForwardToCallback(ServiceWorkerHost.SkipWaitingResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(9, 2)) {
                    return false;
                }
                ServiceWorkerHostSkipWaitingResponseParams response = ServiceWorkerHostSkipWaitingResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.success));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerHostSkipWaitingResponseParamsProxyToResponder implements ServiceWorkerHost.SkipWaitingResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ServiceWorkerHostSkipWaitingResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Boolean success) {
            ServiceWorkerHostSkipWaitingResponseParams _response = new ServiceWorkerHostSkipWaitingResponseParams();
            _response.success = success.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(9, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class ServiceWorkerHostClaimClientsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private ServiceWorkerHostClaimClientsParams(int version) {
            super(8, version);
        }

        public ServiceWorkerHostClaimClientsParams() {
            this(0);
        }

        public static ServiceWorkerHostClaimClientsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerHostClaimClientsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerHostClaimClientsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerHostClaimClientsParams result = new ServiceWorkerHostClaimClientsParams(elementsOrVersion);
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
    public static final class ServiceWorkerHostClaimClientsResponseParams extends Struct {
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

        private ServiceWorkerHostClaimClientsResponseParams(int version) {
            super(24, version);
        }

        public ServiceWorkerHostClaimClientsResponseParams() {
            this(0);
        }

        public static ServiceWorkerHostClaimClientsResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static ServiceWorkerHostClaimClientsResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static ServiceWorkerHostClaimClientsResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                ServiceWorkerHostClaimClientsResponseParams result = new ServiceWorkerHostClaimClientsResponseParams(elementsOrVersion);
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
    static class ServiceWorkerHostClaimClientsResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final ServiceWorkerHost.ClaimClientsResponse mCallback;

        ServiceWorkerHostClaimClientsResponseParamsForwardToCallback(ServiceWorkerHost.ClaimClientsResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(10, 2)) {
                    return false;
                }
                ServiceWorkerHostClaimClientsResponseParams response = ServiceWorkerHostClaimClientsResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.error), response.errorMsg);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class ServiceWorkerHostClaimClientsResponseParamsProxyToResponder implements ServiceWorkerHost.ClaimClientsResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        ServiceWorkerHostClaimClientsResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Integer error, String errorMsg) {
            ServiceWorkerHostClaimClientsResponseParams _response = new ServiceWorkerHostClaimClientsResponseParams();
            _response.error = error.intValue();
            _response.errorMsg = errorMsg;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(10, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
