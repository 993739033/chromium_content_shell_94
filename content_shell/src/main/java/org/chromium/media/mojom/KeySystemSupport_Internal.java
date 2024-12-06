package org.chromium.media.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.media.mojom.KeySystemSupport;
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
class KeySystemSupport_Internal {
    private static final int IS_KEY_SYSTEM_SUPPORTED_ORDINAL = 0;
    public static final Interface.Manager<KeySystemSupport, KeySystemSupport.Proxy> MANAGER = new Interface.Manager<KeySystemSupport, KeySystemSupport.Proxy>() { // from class: org.chromium.media.mojom.KeySystemSupport_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "media.mojom.KeySystemSupport";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public KeySystemSupport.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, KeySystemSupport impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public KeySystemSupport[] buildArray(int size) {
            return new KeySystemSupport[size];
        }
    };

    KeySystemSupport_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements KeySystemSupport.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.media.mojom.KeySystemSupport
        public void isKeySystemSupported(String keySystem, IsKeySystemSupportedResponse callback) {
            KeySystemSupportIsKeySystemSupportedParams _message = new KeySystemSupportIsKeySystemSupportedParams();
            _message.keySystem = keySystem;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new KeySystemSupportIsKeySystemSupportedResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<KeySystemSupport> {
        Stub(Core core, KeySystemSupport impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(KeySystemSupport_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), KeySystemSupport_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        KeySystemSupportIsKeySystemSupportedParams data = KeySystemSupportIsKeySystemSupportedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().isKeySystemSupported(data.keySystem, new KeySystemSupportIsKeySystemSupportedResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class KeySystemSupportIsKeySystemSupportedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public String keySystem;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private KeySystemSupportIsKeySystemSupportedParams(int version) {
            super(16, version);
        }

        public KeySystemSupportIsKeySystemSupportedParams() {
            this(0);
        }

        public static KeySystemSupportIsKeySystemSupportedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static KeySystemSupportIsKeySystemSupportedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static KeySystemSupportIsKeySystemSupportedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                KeySystemSupportIsKeySystemSupportedParams result = new KeySystemSupportIsKeySystemSupportedParams(elementsOrVersion);
                result.keySystem = decoder0.readString(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.keySystem, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class KeySystemSupportIsKeySystemSupportedResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean isSupported;
        public KeySystemCapability keySystemCapability;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private KeySystemSupportIsKeySystemSupportedResponseParams(int version) {
            super(24, version);
        }

        public KeySystemSupportIsKeySystemSupportedResponseParams() {
            this(0);
        }

        public static KeySystemSupportIsKeySystemSupportedResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static KeySystemSupportIsKeySystemSupportedResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static KeySystemSupportIsKeySystemSupportedResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                KeySystemSupportIsKeySystemSupportedResponseParams result = new KeySystemSupportIsKeySystemSupportedResponseParams(elementsOrVersion);
                result.isSupported = decoder0.readBoolean(8, 0);
                Decoder decoder1 = decoder0.readPointer(16, true);
                result.keySystemCapability = KeySystemCapability.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.isSupported, 8, 0);
            encoder0.encode((Struct) this.keySystemCapability, 16, true);
        }
    }

    /* loaded from: classes2.dex */
    static class KeySystemSupportIsKeySystemSupportedResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final KeySystemSupport.IsKeySystemSupportedResponse mCallback;

        KeySystemSupportIsKeySystemSupportedResponseParamsForwardToCallback(KeySystemSupport.IsKeySystemSupportedResponse callback) {
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
                KeySystemSupportIsKeySystemSupportedResponseParams response = KeySystemSupportIsKeySystemSupportedResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.isSupported), response.keySystemCapability);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class KeySystemSupportIsKeySystemSupportedResponseParamsProxyToResponder implements KeySystemSupport.IsKeySystemSupportedResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        KeySystemSupportIsKeySystemSupportedResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Boolean isSupported, KeySystemCapability keySystemCapability) {
            KeySystemSupportIsKeySystemSupportedResponseParams _response = new KeySystemSupportIsKeySystemSupportedResponseParams();
            _response.isSupported = isSupported.booleanValue();
            _response.keySystemCapability = keySystemCapability;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 6, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
