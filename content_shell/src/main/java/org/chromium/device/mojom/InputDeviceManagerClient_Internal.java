package org.chromium.device.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.device.mojom.InputDeviceManagerClient;
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
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo.system.Core;
/* loaded from: classes2.dex */
class InputDeviceManagerClient_Internal {
    private static final int INPUT_DEVICE_ADDED_ORDINAL = 0;
    private static final int INPUT_DEVICE_REMOVED_ORDINAL = 1;
    public static final Interface.Manager<InputDeviceManagerClient, InputDeviceManagerClient.Proxy> MANAGER = new Interface.Manager<InputDeviceManagerClient, InputDeviceManagerClient.Proxy>() { // from class: org.chromium.device.mojom.InputDeviceManagerClient_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "device.mojom.InputDeviceManagerClient";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public InputDeviceManagerClient.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, InputDeviceManagerClient impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public InputDeviceManagerClient[] buildArray(int size) {
            return new InputDeviceManagerClient[size];
        }
    };

    InputDeviceManagerClient_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements InputDeviceManagerClient.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.device.mojom.InputDeviceManagerClient
        public void inputDeviceAdded(InputDeviceInfo deviceInfo) {
            InputDeviceManagerClientInputDeviceAddedParams _message = new InputDeviceManagerClientInputDeviceAddedParams();
            _message.deviceInfo = deviceInfo;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }

        @Override // org.chromium.device.mojom.InputDeviceManagerClient
        public void inputDeviceRemoved(String id) {
            InputDeviceManagerClientInputDeviceRemovedParams _message = new InputDeviceManagerClientInputDeviceRemovedParams();
            _message.id = id;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<InputDeviceManagerClient> {
        Stub(Core core, InputDeviceManagerClient impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(InputDeviceManagerClient_Internal.MANAGER, messageWithHeader);
                    case -1:
                    default:
                        return false;
                    case 0:
                        InputDeviceManagerClientInputDeviceAddedParams data = InputDeviceManagerClientInputDeviceAddedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().inputDeviceAdded(data.deviceInfo);
                        return true;
                    case 1:
                        InputDeviceManagerClientInputDeviceRemovedParams data2 = InputDeviceManagerClientInputDeviceRemovedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().inputDeviceRemoved(data2.id);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), InputDeviceManagerClient_Internal.MANAGER, messageWithHeader, receiver);
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
    static final class InputDeviceManagerClientInputDeviceAddedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public InputDeviceInfo deviceInfo;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private InputDeviceManagerClientInputDeviceAddedParams(int version) {
            super(16, version);
        }

        public InputDeviceManagerClientInputDeviceAddedParams() {
            this(0);
        }

        public static InputDeviceManagerClientInputDeviceAddedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static InputDeviceManagerClientInputDeviceAddedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static InputDeviceManagerClientInputDeviceAddedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                InputDeviceManagerClientInputDeviceAddedParams result = new InputDeviceManagerClientInputDeviceAddedParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.deviceInfo = InputDeviceInfo.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.deviceInfo, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class InputDeviceManagerClientInputDeviceRemovedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public String id;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private InputDeviceManagerClientInputDeviceRemovedParams(int version) {
            super(16, version);
        }

        public InputDeviceManagerClientInputDeviceRemovedParams() {
            this(0);
        }

        public static InputDeviceManagerClientInputDeviceRemovedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static InputDeviceManagerClientInputDeviceRemovedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static InputDeviceManagerClientInputDeviceRemovedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                InputDeviceManagerClientInputDeviceRemovedParams result = new InputDeviceManagerClientInputDeviceRemovedParams(elementsOrVersion);
                result.id = decoder0.readString(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.id, 8, false);
        }
    }
}
