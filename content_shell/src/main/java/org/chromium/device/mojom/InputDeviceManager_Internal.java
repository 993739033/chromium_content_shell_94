package org.chromium.device.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.device.mojom.InputDeviceManager;
import org.chromium.mojo.bindings.AssociatedInterfaceNotSupported;
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
class InputDeviceManager_Internal {
    private static final int GET_DEVICES_AND_SET_CLIENT_ORDINAL = 0;
    private static final int GET_DEVICES_ORDINAL = 1;
    public static final Interface.Manager<InputDeviceManager, InputDeviceManager.Proxy> MANAGER = new Interface.Manager<InputDeviceManager, InputDeviceManager.Proxy>() { // from class: org.chromium.device.mojom.InputDeviceManager_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "device.mojom.InputDeviceManager";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public InputDeviceManager.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, InputDeviceManager impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public InputDeviceManager[] buildArray(int size) {
            return new InputDeviceManager[size];
        }
    };

    InputDeviceManager_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements InputDeviceManager.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.device.mojom.InputDeviceManager
        public void getDevicesAndSetClient(AssociatedInterfaceNotSupported client, GetDevicesAndSetClientResponse callback) {
            InputDeviceManagerGetDevicesAndSetClientParams _message = new InputDeviceManagerGetDevicesAndSetClientParams();
            _message.client = client;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new InputDeviceManagerGetDevicesAndSetClientResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.device.mojom.InputDeviceManager
        public void getDevices(GetDevicesResponse callback) {
            InputDeviceManagerGetDevicesParams _message = new InputDeviceManagerGetDevicesParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1, 1, 0L)), new InputDeviceManagerGetDevicesResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<InputDeviceManager> {
        Stub(Core core, InputDeviceManager impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(InputDeviceManager_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), InputDeviceManager_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        InputDeviceManagerGetDevicesAndSetClientParams data = InputDeviceManagerGetDevicesAndSetClientParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getDevicesAndSetClient(data.client, new InputDeviceManagerGetDevicesAndSetClientResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 1:
                        InputDeviceManagerGetDevicesParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getDevices(new InputDeviceManagerGetDevicesResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class InputDeviceManagerGetDevicesAndSetClientParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public AssociatedInterfaceNotSupported client;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private InputDeviceManagerGetDevicesAndSetClientParams(int version) {
            super(16, version);
        }

        public InputDeviceManagerGetDevicesAndSetClientParams() {
            this(0);
        }

        public static InputDeviceManagerGetDevicesAndSetClientParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static InputDeviceManagerGetDevicesAndSetClientParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static InputDeviceManagerGetDevicesAndSetClientParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                InputDeviceManagerGetDevicesAndSetClientParams result = new InputDeviceManagerGetDevicesAndSetClientParams(elementsOrVersion);
                result.client = decoder0.readAssociatedServiceInterfaceNotSupported(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.client, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class InputDeviceManagerGetDevicesAndSetClientResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public InputDeviceInfo[] devices;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private InputDeviceManagerGetDevicesAndSetClientResponseParams(int version) {
            super(16, version);
        }

        public InputDeviceManagerGetDevicesAndSetClientResponseParams() {
            this(0);
        }

        public static InputDeviceManagerGetDevicesAndSetClientResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static InputDeviceManagerGetDevicesAndSetClientResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static InputDeviceManagerGetDevicesAndSetClientResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                InputDeviceManagerGetDevicesAndSetClientResponseParams result = new InputDeviceManagerGetDevicesAndSetClientResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.devices = new InputDeviceInfo[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.devices[i1] = InputDeviceInfo.decode(decoder2);
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
            InputDeviceInfo[] inputDeviceInfoArr = this.devices;
            if (inputDeviceInfoArr == null) {
                encoder0.encodeNullPointer(8, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(inputDeviceInfoArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                InputDeviceInfo[] inputDeviceInfoArr2 = this.devices;
                if (i0 < inputDeviceInfoArr2.length) {
                    encoder1.encode((Struct) inputDeviceInfoArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static class InputDeviceManagerGetDevicesAndSetClientResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final InputDeviceManager.GetDevicesAndSetClientResponse mCallback;

        InputDeviceManagerGetDevicesAndSetClientResponseParamsForwardToCallback(InputDeviceManager.GetDevicesAndSetClientResponse callback) {
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
                InputDeviceManagerGetDevicesAndSetClientResponseParams response = InputDeviceManagerGetDevicesAndSetClientResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.devices);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class InputDeviceManagerGetDevicesAndSetClientResponseParamsProxyToResponder implements InputDeviceManager.GetDevicesAndSetClientResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        InputDeviceManagerGetDevicesAndSetClientResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(InputDeviceInfo[] devices) {
            InputDeviceManagerGetDevicesAndSetClientResponseParams _response = new InputDeviceManagerGetDevicesAndSetClientResponseParams();
            _response.devices = devices;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class InputDeviceManagerGetDevicesParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private InputDeviceManagerGetDevicesParams(int version) {
            super(8, version);
        }

        public InputDeviceManagerGetDevicesParams() {
            this(0);
        }

        public static InputDeviceManagerGetDevicesParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static InputDeviceManagerGetDevicesParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static InputDeviceManagerGetDevicesParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                InputDeviceManagerGetDevicesParams result = new InputDeviceManagerGetDevicesParams(elementsOrVersion);
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
    public static final class InputDeviceManagerGetDevicesResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public InputDeviceInfo[] devices;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private InputDeviceManagerGetDevicesResponseParams(int version) {
            super(16, version);
        }

        public InputDeviceManagerGetDevicesResponseParams() {
            this(0);
        }

        public static InputDeviceManagerGetDevicesResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static InputDeviceManagerGetDevicesResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static InputDeviceManagerGetDevicesResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                InputDeviceManagerGetDevicesResponseParams result = new InputDeviceManagerGetDevicesResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.devices = new InputDeviceInfo[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.devices[i1] = InputDeviceInfo.decode(decoder2);
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
            InputDeviceInfo[] inputDeviceInfoArr = this.devices;
            if (inputDeviceInfoArr == null) {
                encoder0.encodeNullPointer(8, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(inputDeviceInfoArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                InputDeviceInfo[] inputDeviceInfoArr2 = this.devices;
                if (i0 < inputDeviceInfoArr2.length) {
                    encoder1.encode((Struct) inputDeviceInfoArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static class InputDeviceManagerGetDevicesResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final InputDeviceManager.GetDevicesResponse mCallback;

        InputDeviceManagerGetDevicesResponseParamsForwardToCallback(InputDeviceManager.GetDevicesResponse callback) {
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
                InputDeviceManagerGetDevicesResponseParams response = InputDeviceManagerGetDevicesResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.devices);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class InputDeviceManagerGetDevicesResponseParamsProxyToResponder implements InputDeviceManager.GetDevicesResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        InputDeviceManagerGetDevicesResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(InputDeviceInfo[] devices) {
            InputDeviceManagerGetDevicesResponseParams _response = new InputDeviceManagerGetDevicesResponseParams();
            _response.devices = devices;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(1, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
