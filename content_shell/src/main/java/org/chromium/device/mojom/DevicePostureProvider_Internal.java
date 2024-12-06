package org.chromium.device.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.device.mojom.DevicePostureProvider;
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
class DevicePostureProvider_Internal {
    private static final int ADD_LISTENER_AND_GET_CURRENT_POSTURE_ORDINAL = 0;
    public static final Interface.Manager<DevicePostureProvider, DevicePostureProvider.Proxy> MANAGER = new Interface.Manager<DevicePostureProvider, DevicePostureProvider.Proxy>() { // from class: org.chromium.device.mojom.DevicePostureProvider_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "device.mojom.DevicePostureProvider";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public DevicePostureProvider.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, DevicePostureProvider impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public DevicePostureProvider[] buildArray(int size) {
            return new DevicePostureProvider[size];
        }
    };

    DevicePostureProvider_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements DevicePostureProvider.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.device.mojom.DevicePostureProvider
        public void addListenerAndGetCurrentPosture(DevicePostureProviderClient client, AddListenerAndGetCurrentPostureResponse callback) {
            DevicePostureProviderAddListenerAndGetCurrentPostureParams _message = new DevicePostureProviderAddListenerAndGetCurrentPostureParams();
            _message.client = client;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new DevicePostureProviderAddListenerAndGetCurrentPostureResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<DevicePostureProvider> {
        Stub(Core core, DevicePostureProvider impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(DevicePostureProvider_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), DevicePostureProvider_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        DevicePostureProviderAddListenerAndGetCurrentPostureParams data = DevicePostureProviderAddListenerAndGetCurrentPostureParams.deserialize(messageWithHeader.getPayload());
                        getImpl().addListenerAndGetCurrentPosture(data.client, new DevicePostureProviderAddListenerAndGetCurrentPostureResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class DevicePostureProviderAddListenerAndGetCurrentPostureParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public DevicePostureProviderClient client;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private DevicePostureProviderAddListenerAndGetCurrentPostureParams(int version) {
            super(16, version);
        }

        public DevicePostureProviderAddListenerAndGetCurrentPostureParams() {
            this(0);
        }

        public static DevicePostureProviderAddListenerAndGetCurrentPostureParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static DevicePostureProviderAddListenerAndGetCurrentPostureParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static DevicePostureProviderAddListenerAndGetCurrentPostureParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                DevicePostureProviderAddListenerAndGetCurrentPostureParams result = new DevicePostureProviderAddListenerAndGetCurrentPostureParams(elementsOrVersion);
                result.client = (DevicePostureProviderClient) decoder0.readServiceInterface(8, false, DevicePostureProviderClient.MANAGER);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode( this.client, 8, false,  DevicePostureProviderClient.MANAGER);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class DevicePostureProviderAddListenerAndGetCurrentPostureResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int posture;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private DevicePostureProviderAddListenerAndGetCurrentPostureResponseParams(int version) {
            super(16, version);
        }

        public DevicePostureProviderAddListenerAndGetCurrentPostureResponseParams() {
            this(0);
        }

        public static DevicePostureProviderAddListenerAndGetCurrentPostureResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static DevicePostureProviderAddListenerAndGetCurrentPostureResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static DevicePostureProviderAddListenerAndGetCurrentPostureResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                DevicePostureProviderAddListenerAndGetCurrentPostureResponseParams result = new DevicePostureProviderAddListenerAndGetCurrentPostureResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.posture = readInt;
                DevicePostureType.validate(readInt);
                result.posture = DevicePostureType.toKnownValue(result.posture);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.posture, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class DevicePostureProviderAddListenerAndGetCurrentPostureResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final DevicePostureProvider.AddListenerAndGetCurrentPostureResponse mCallback;

        DevicePostureProviderAddListenerAndGetCurrentPostureResponseParamsForwardToCallback(DevicePostureProvider.AddListenerAndGetCurrentPostureResponse callback) {
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
                DevicePostureProviderAddListenerAndGetCurrentPostureResponseParams response = DevicePostureProviderAddListenerAndGetCurrentPostureResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.posture));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class DevicePostureProviderAddListenerAndGetCurrentPostureResponseParamsProxyToResponder implements DevicePostureProvider.AddListenerAndGetCurrentPostureResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        DevicePostureProviderAddListenerAndGetCurrentPostureResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer posture) {
            DevicePostureProviderAddListenerAndGetCurrentPostureResponseParams _response = new DevicePostureProviderAddListenerAndGetCurrentPostureResponseParams();
            _response.posture = posture.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
