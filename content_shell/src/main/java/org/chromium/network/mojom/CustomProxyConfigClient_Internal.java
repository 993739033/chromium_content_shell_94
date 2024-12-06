package org.chromium.network.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
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
import org.chromium.mojo_base.mojom.TimeDelta;
import org.chromium.network.mojom.CustomProxyConfigClient;
/* loaded from: classes2.dex */
class CustomProxyConfigClient_Internal {
    private static final int CLEAR_BAD_PROXIES_CACHE_ORDINAL = 2;
    public static final Interface.Manager<CustomProxyConfigClient, CustomProxyConfigClient.Proxy> MANAGER = new Interface.Manager<CustomProxyConfigClient, CustomProxyConfigClient.Proxy>() { // from class: org.chromium.network.mojom.CustomProxyConfigClient_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "network.mojom.CustomProxyConfigClient";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public CustomProxyConfigClient.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, CustomProxyConfigClient impl) {
            return new Stub(core, impl);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public CustomProxyConfigClient[] buildArray(int size) {
            return new CustomProxyConfigClient[size];
        }
    };
    private static final int MARK_PROXIES_AS_BAD_ORDINAL = 1;
    private static final int ON_CUSTOM_PROXY_CONFIG_UPDATED_ORDINAL = 0;

    CustomProxyConfigClient_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements CustomProxyConfigClient.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.network.mojom.CustomProxyConfigClient
        public void onCustomProxyConfigUpdated(CustomProxyConfig proxyConfig) {
            CustomProxyConfigClientOnCustomProxyConfigUpdatedParams _message = new CustomProxyConfigClientOnCustomProxyConfigUpdatedParams();
            _message.proxyConfig = proxyConfig;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }

        @Override // org.chromium.network.mojom.CustomProxyConfigClient
        public void markProxiesAsBad(TimeDelta bypassDuration, ProxyList badProxies, MarkProxiesAsBadResponse callback) {
            CustomProxyConfigClientMarkProxiesAsBadParams _message = new CustomProxyConfigClientMarkProxiesAsBadParams();
            _message.bypassDuration = bypassDuration;
            _message.badProxies = badProxies;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1, 1, 0L)), new CustomProxyConfigClientMarkProxiesAsBadResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.CustomProxyConfigClient
        public void clearBadProxiesCache() {
            CustomProxyConfigClientClearBadProxiesCacheParams _message = new CustomProxyConfigClientClearBadProxiesCacheParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<CustomProxyConfigClient> {
        Stub(Core core, CustomProxyConfigClient impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(CustomProxyConfigClient_Internal.MANAGER, messageWithHeader);
                    case -1:
                    case 1:
                    default:
                        return false;
                    case 0:
                        CustomProxyConfigClientOnCustomProxyConfigUpdatedParams data = CustomProxyConfigClientOnCustomProxyConfigUpdatedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onCustomProxyConfigUpdated(data.proxyConfig);
                        return true;
                    case 2:
                        CustomProxyConfigClientClearBadProxiesCacheParams.deserialize(messageWithHeader.getPayload());
                        getImpl().clearBadProxiesCache();
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), CustomProxyConfigClient_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                    default:
                        return false;
                    case 1:
                        CustomProxyConfigClientMarkProxiesAsBadParams data = CustomProxyConfigClientMarkProxiesAsBadParams.deserialize(messageWithHeader.getPayload());
                        getImpl().markProxiesAsBad(data.bypassDuration, data.badProxies, new CustomProxyConfigClientMarkProxiesAsBadResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                }
            } catch (DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class CustomProxyConfigClientOnCustomProxyConfigUpdatedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public CustomProxyConfig proxyConfig;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private CustomProxyConfigClientOnCustomProxyConfigUpdatedParams(int version) {
            super(16, version);
        }

        public CustomProxyConfigClientOnCustomProxyConfigUpdatedParams() {
            this(0);
        }

        public static CustomProxyConfigClientOnCustomProxyConfigUpdatedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static CustomProxyConfigClientOnCustomProxyConfigUpdatedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static CustomProxyConfigClientOnCustomProxyConfigUpdatedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                CustomProxyConfigClientOnCustomProxyConfigUpdatedParams result = new CustomProxyConfigClientOnCustomProxyConfigUpdatedParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.proxyConfig = CustomProxyConfig.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.proxyConfig, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class CustomProxyConfigClientMarkProxiesAsBadParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public ProxyList badProxies;
        public TimeDelta bypassDuration;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private CustomProxyConfigClientMarkProxiesAsBadParams(int version) {
            super(24, version);
        }

        public CustomProxyConfigClientMarkProxiesAsBadParams() {
            this(0);
        }

        public static CustomProxyConfigClientMarkProxiesAsBadParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static CustomProxyConfigClientMarkProxiesAsBadParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static CustomProxyConfigClientMarkProxiesAsBadParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                CustomProxyConfigClientMarkProxiesAsBadParams result = new CustomProxyConfigClientMarkProxiesAsBadParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.bypassDuration = TimeDelta.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.badProxies = ProxyList.decode(decoder12);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.bypassDuration, 8, false);
            encoder0.encode((Struct) this.badProxies, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class CustomProxyConfigClientMarkProxiesAsBadResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private CustomProxyConfigClientMarkProxiesAsBadResponseParams(int version) {
            super(8, version);
        }

        public CustomProxyConfigClientMarkProxiesAsBadResponseParams() {
            this(0);
        }

        public static CustomProxyConfigClientMarkProxiesAsBadResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static CustomProxyConfigClientMarkProxiesAsBadResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static CustomProxyConfigClientMarkProxiesAsBadResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                CustomProxyConfigClientMarkProxiesAsBadResponseParams result = new CustomProxyConfigClientMarkProxiesAsBadResponseParams(elementsOrVersion);
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
    static class CustomProxyConfigClientMarkProxiesAsBadResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final CustomProxyConfigClient.MarkProxiesAsBadResponse mCallback;

        CustomProxyConfigClientMarkProxiesAsBadResponseParamsForwardToCallback(CustomProxyConfigClient.MarkProxiesAsBadResponse callback) {
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
                this.mCallback.call();
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class CustomProxyConfigClientMarkProxiesAsBadResponseParamsProxyToResponder implements CustomProxyConfigClient.MarkProxiesAsBadResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        CustomProxyConfigClientMarkProxiesAsBadResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            CustomProxyConfigClientMarkProxiesAsBadResponseParams _response = new CustomProxyConfigClientMarkProxiesAsBadResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(1, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class CustomProxyConfigClientClearBadProxiesCacheParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private CustomProxyConfigClientClearBadProxiesCacheParams(int version) {
            super(8, version);
        }

        public CustomProxyConfigClientClearBadProxiesCacheParams() {
            this(0);
        }

        public static CustomProxyConfigClientClearBadProxiesCacheParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static CustomProxyConfigClientClearBadProxiesCacheParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static CustomProxyConfigClientClearBadProxiesCacheParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                CustomProxyConfigClientClearBadProxiesCacheParams result = new CustomProxyConfigClientClearBadProxiesCacheParams(elementsOrVersion);
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
}
