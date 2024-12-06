package org.chromium.device.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.device.mojom.HidManagerClient;
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
class HidManagerClient_Internal {
    private static final int DEVICE_ADDED_ORDINAL = 0;
    private static final int DEVICE_CHANGED_ORDINAL = 2;
    private static final int DEVICE_REMOVED_ORDINAL = 1;
    public static final Interface.Manager<HidManagerClient, HidManagerClient.Proxy> MANAGER = new Interface.Manager<HidManagerClient, HidManagerClient.Proxy>() { // from class: org.chromium.device.mojom.HidManagerClient_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "device.mojom.HidManagerClient";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 2;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public HidManagerClient.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, HidManagerClient impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public HidManagerClient[] buildArray(int size) {
            return new HidManagerClient[size];
        }
    };

    HidManagerClient_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements HidManagerClient.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.device.mojom.HidManagerClient
        public void deviceAdded(HidDeviceInfo deviceInfo) {
            HidManagerClientDeviceAddedParams _message = new HidManagerClientDeviceAddedParams();
            _message.deviceInfo = deviceInfo;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }

        @Override // org.chromium.device.mojom.HidManagerClient
        public void deviceRemoved(HidDeviceInfo deviceInfo) {
            HidManagerClientDeviceRemovedParams _message = new HidManagerClientDeviceRemovedParams();
            _message.deviceInfo = deviceInfo;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1)));
        }

        @Override // org.chromium.device.mojom.HidManagerClient
        public void deviceChanged(HidDeviceInfo deviceInfo) {
            HidManagerClientDeviceChangedParams _message = new HidManagerClientDeviceChangedParams();
            _message.deviceInfo = deviceInfo;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<HidManagerClient> {
        Stub(Core core, HidManagerClient impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(HidManagerClient_Internal.MANAGER, messageWithHeader);
                    case -1:
                    default:
                        return false;
                    case 0:
                        HidManagerClientDeviceAddedParams data = HidManagerClientDeviceAddedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().deviceAdded(data.deviceInfo);
                        return true;
                    case 1:
                        HidManagerClientDeviceRemovedParams data2 = HidManagerClientDeviceRemovedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().deviceRemoved(data2.deviceInfo);
                        return true;
                    case 2:
                        HidManagerClientDeviceChangedParams data3 = HidManagerClientDeviceChangedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().deviceChanged(data3.deviceInfo);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), HidManagerClient_Internal.MANAGER, messageWithHeader, receiver);
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
    static final class HidManagerClientDeviceAddedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public HidDeviceInfo deviceInfo;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private HidManagerClientDeviceAddedParams(int version) {
            super(16, version);
        }

        public HidManagerClientDeviceAddedParams() {
            this(0);
        }

        public static HidManagerClientDeviceAddedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static HidManagerClientDeviceAddedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static HidManagerClientDeviceAddedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                HidManagerClientDeviceAddedParams result = new HidManagerClientDeviceAddedParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.deviceInfo = HidDeviceInfo.decode(decoder1);
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
    static final class HidManagerClientDeviceRemovedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public HidDeviceInfo deviceInfo;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private HidManagerClientDeviceRemovedParams(int version) {
            super(16, version);
        }

        public HidManagerClientDeviceRemovedParams() {
            this(0);
        }

        public static HidManagerClientDeviceRemovedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static HidManagerClientDeviceRemovedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static HidManagerClientDeviceRemovedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                HidManagerClientDeviceRemovedParams result = new HidManagerClientDeviceRemovedParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.deviceInfo = HidDeviceInfo.decode(decoder1);
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
    static final class HidManagerClientDeviceChangedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public HidDeviceInfo deviceInfo;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private HidManagerClientDeviceChangedParams(int version) {
            super(16, version);
        }

        public HidManagerClientDeviceChangedParams() {
            this(0);
        }

        public static HidManagerClientDeviceChangedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static HidManagerClientDeviceChangedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static HidManagerClientDeviceChangedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                HidManagerClientDeviceChangedParams result = new HidManagerClientDeviceChangedParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.deviceInfo = HidDeviceInfo.decode(decoder1);
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
}
