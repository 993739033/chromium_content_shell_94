package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.PluginRegistry;
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
import org.chromium.url.internal.mojom.Origin;
/* loaded from: classes2.dex */
class PluginRegistry_Internal {
    private static final int GET_PLUGINS_ORDINAL = 0;
    public static final Interface.Manager<PluginRegistry, PluginRegistry.Proxy> MANAGER = new Interface.Manager<PluginRegistry, PluginRegistry.Proxy>() { // from class: org.chromium.blink.mojom.PluginRegistry_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.PluginRegistry";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public PluginRegistry.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, PluginRegistry impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public PluginRegistry[] buildArray(int size) {
            return new PluginRegistry[size];
        }
    };

    PluginRegistry_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements PluginRegistry.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.PluginRegistry
        public void getPlugins(boolean refresh, Origin mainFrameOrigin, GetPluginsResponse callback) {
            PluginRegistryGetPluginsParams _message = new PluginRegistryGetPluginsParams();
            _message.refresh = refresh;
            _message.mainFrameOrigin = mainFrameOrigin;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new PluginRegistryGetPluginsResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<PluginRegistry> {
        Stub(Core core, PluginRegistry impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(PluginRegistry_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), PluginRegistry_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        PluginRegistryGetPluginsParams data = PluginRegistryGetPluginsParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getPlugins(data.refresh, data.mainFrameOrigin, new PluginRegistryGetPluginsResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class PluginRegistryGetPluginsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public Origin mainFrameOrigin;
        public boolean refresh;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PluginRegistryGetPluginsParams(int version) {
            super(24, version);
        }

        public PluginRegistryGetPluginsParams() {
            this(0);
        }

        public static PluginRegistryGetPluginsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PluginRegistryGetPluginsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PluginRegistryGetPluginsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PluginRegistryGetPluginsParams result = new PluginRegistryGetPluginsParams(elementsOrVersion);
                result.refresh = decoder0.readBoolean(8, 0);
                Decoder decoder1 = decoder0.readPointer(16, false);
                result.mainFrameOrigin = Origin.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.refresh, 8, 0);
            encoder0.encode((Struct) this.mainFrameOrigin, 16, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class PluginRegistryGetPluginsResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public PluginInfo[] plugins;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PluginRegistryGetPluginsResponseParams(int version) {
            super(16, version);
        }

        public PluginRegistryGetPluginsResponseParams() {
            this(0);
        }

        public static PluginRegistryGetPluginsResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PluginRegistryGetPluginsResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PluginRegistryGetPluginsResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PluginRegistryGetPluginsResponseParams result = new PluginRegistryGetPluginsResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.plugins = new PluginInfo[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.plugins[i1] = PluginInfo.decode(decoder2);
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
            PluginInfo[] pluginInfoArr = this.plugins;
            if (pluginInfoArr == null) {
                encoder0.encodeNullPointer(8, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(pluginInfoArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                PluginInfo[] pluginInfoArr2 = this.plugins;
                if (i0 < pluginInfoArr2.length) {
                    encoder1.encode((Struct) pluginInfoArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static class PluginRegistryGetPluginsResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final PluginRegistry.GetPluginsResponse mCallback;

        PluginRegistryGetPluginsResponseParamsForwardToCallback(PluginRegistry.GetPluginsResponse callback) {
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
                PluginRegistryGetPluginsResponseParams response = PluginRegistryGetPluginsResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.plugins);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class PluginRegistryGetPluginsResponseParamsProxyToResponder implements PluginRegistry.GetPluginsResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        PluginRegistryGetPluginsResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(PluginInfo[] plugins) {
            PluginRegistryGetPluginsResponseParams _response = new PluginRegistryGetPluginsResponseParams();
            _response.plugins = plugins;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
