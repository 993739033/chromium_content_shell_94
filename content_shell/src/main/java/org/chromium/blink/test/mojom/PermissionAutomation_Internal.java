package org.chromium.blink.test.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.PermissionDescriptor;
import org.chromium.blink.mojom.PermissionStatus;
import org.chromium.blink.test.mojom.PermissionAutomation;
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
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
class PermissionAutomation_Internal {
    public static final Interface.Manager<PermissionAutomation, PermissionAutomation.Proxy> MANAGER = new Interface.Manager<PermissionAutomation, PermissionAutomation.Proxy>() { // from class: org.chromium.blink.test.mojom.PermissionAutomation_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.test.mojom.PermissionAutomation";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public PermissionAutomation.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, PermissionAutomation impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public PermissionAutomation[] buildArray(int size) {
            return new PermissionAutomation[size];
        }
    };
    private static final int SET_PERMISSION_ORDINAL = 0;

    PermissionAutomation_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements PermissionAutomation.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.test.mojom.PermissionAutomation
        public void setPermission(PermissionDescriptor descriptor, int status, Url origin, Url embeddingOrigin, SetPermissionResponse callback) {
            PermissionAutomationSetPermissionParams _message = new PermissionAutomationSetPermissionParams();
            _message.descriptor = descriptor;
            _message.status = status;
            _message.origin = origin;
            _message.embeddingOrigin = embeddingOrigin;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new PermissionAutomationSetPermissionResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<PermissionAutomation> {
        Stub(Core core, PermissionAutomation impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(PermissionAutomation_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), PermissionAutomation_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        PermissionAutomationSetPermissionParams data = PermissionAutomationSetPermissionParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setPermission(data.descriptor, data.status, data.origin, data.embeddingOrigin, new PermissionAutomationSetPermissionResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class PermissionAutomationSetPermissionParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 40;
        private static final DataHeader[] VERSION_ARRAY;
        public PermissionDescriptor descriptor;
        public Url embeddingOrigin;
        public Url origin;
        public int status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PermissionAutomationSetPermissionParams(int version) {
            super(40, version);
        }

        public PermissionAutomationSetPermissionParams() {
            this(0);
        }

        public static PermissionAutomationSetPermissionParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PermissionAutomationSetPermissionParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PermissionAutomationSetPermissionParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PermissionAutomationSetPermissionParams result = new PermissionAutomationSetPermissionParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.descriptor = PermissionDescriptor.decode(decoder1);
                int readInt = decoder0.readInt(16);
                result.status = readInt;
                PermissionStatus.validate(readInt);
                result.status = PermissionStatus.toKnownValue(result.status);
                Decoder decoder12 = decoder0.readPointer(24, false);
                result.origin = Url.decode(decoder12);
                Decoder decoder13 = decoder0.readPointer(32, false);
                result.embeddingOrigin = Url.decode(decoder13);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.descriptor, 8, false);
            encoder0.encode(this.status, 16);
            encoder0.encode((Struct) this.origin, 24, false);
            encoder0.encode((Struct) this.embeddingOrigin, 32, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class PermissionAutomationSetPermissionResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PermissionAutomationSetPermissionResponseParams(int version) {
            super(16, version);
        }

        public PermissionAutomationSetPermissionResponseParams() {
            this(0);
        }

        public static PermissionAutomationSetPermissionResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PermissionAutomationSetPermissionResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PermissionAutomationSetPermissionResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PermissionAutomationSetPermissionResponseParams result = new PermissionAutomationSetPermissionResponseParams(elementsOrVersion);
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
    static class PermissionAutomationSetPermissionResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final PermissionAutomation.SetPermissionResponse mCallback;

        PermissionAutomationSetPermissionResponseParamsForwardToCallback(PermissionAutomation.SetPermissionResponse callback) {
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
                PermissionAutomationSetPermissionResponseParams response = PermissionAutomationSetPermissionResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.success));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class PermissionAutomationSetPermissionResponseParamsProxyToResponder implements PermissionAutomation.SetPermissionResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        PermissionAutomationSetPermissionResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Boolean success) {
            PermissionAutomationSetPermissionResponseParams _response = new PermissionAutomationSetPermissionResponseParams();
            _response.success = success.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
