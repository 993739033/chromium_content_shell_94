package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.MimeRegistry;
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
class MimeRegistry_Internal {
    private static final int GET_MIME_TYPE_FROM_EXTENSION_ORDINAL = 0;
    public static final Interface.Manager<MimeRegistry, MimeRegistry.Proxy> MANAGER = new Interface.Manager<MimeRegistry, MimeRegistry.Proxy>() { // from class: org.chromium.blink.mojom.MimeRegistry_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.MimeRegistry";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public MimeRegistry.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, MimeRegistry impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public MimeRegistry[] buildArray(int size) {
            return new MimeRegistry[size];
        }
    };

    MimeRegistry_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements MimeRegistry.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.MimeRegistry
        public void getMimeTypeFromExtension(String extension, GetMimeTypeFromExtensionResponse callback) {
            MimeRegistryGetMimeTypeFromExtensionParams _message = new MimeRegistryGetMimeTypeFromExtensionParams();
            _message.extension = extension;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new MimeRegistryGetMimeTypeFromExtensionResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<MimeRegistry> {
        Stub(Core core, MimeRegistry impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(MimeRegistry_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), MimeRegistry_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        MimeRegistryGetMimeTypeFromExtensionParams data = MimeRegistryGetMimeTypeFromExtensionParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getMimeTypeFromExtension(data.extension, new MimeRegistryGetMimeTypeFromExtensionResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class MimeRegistryGetMimeTypeFromExtensionParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public String extension;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MimeRegistryGetMimeTypeFromExtensionParams(int version) {
            super(16, version);
        }

        public MimeRegistryGetMimeTypeFromExtensionParams() {
            this(0);
        }

        public static MimeRegistryGetMimeTypeFromExtensionParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MimeRegistryGetMimeTypeFromExtensionParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MimeRegistryGetMimeTypeFromExtensionParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MimeRegistryGetMimeTypeFromExtensionParams result = new MimeRegistryGetMimeTypeFromExtensionParams(elementsOrVersion);
                result.extension = decoder0.readString(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.extension, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class MimeRegistryGetMimeTypeFromExtensionResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public String mimeType;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MimeRegistryGetMimeTypeFromExtensionResponseParams(int version) {
            super(16, version);
        }

        public MimeRegistryGetMimeTypeFromExtensionResponseParams() {
            this(0);
        }

        public static MimeRegistryGetMimeTypeFromExtensionResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MimeRegistryGetMimeTypeFromExtensionResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MimeRegistryGetMimeTypeFromExtensionResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MimeRegistryGetMimeTypeFromExtensionResponseParams result = new MimeRegistryGetMimeTypeFromExtensionResponseParams(elementsOrVersion);
                result.mimeType = decoder0.readString(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.mimeType, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static class MimeRegistryGetMimeTypeFromExtensionResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final MimeRegistry.GetMimeTypeFromExtensionResponse mCallback;

        MimeRegistryGetMimeTypeFromExtensionResponseParamsForwardToCallback(MimeRegistry.GetMimeTypeFromExtensionResponse callback) {
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
                MimeRegistryGetMimeTypeFromExtensionResponseParams response = MimeRegistryGetMimeTypeFromExtensionResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.mimeType);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class MimeRegistryGetMimeTypeFromExtensionResponseParamsProxyToResponder implements MimeRegistry.GetMimeTypeFromExtensionResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        MimeRegistryGetMimeTypeFromExtensionResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(String mimeType) {
            MimeRegistryGetMimeTypeFromExtensionResponseParams _response = new MimeRegistryGetMimeTypeFromExtensionResponseParams();
            _response.mimeType = mimeType;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
