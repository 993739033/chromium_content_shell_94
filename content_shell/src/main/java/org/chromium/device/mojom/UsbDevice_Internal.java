package org.chromium.device.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.device.mojom.UsbDevice;
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
/* loaded from: classes2.dex */
class UsbDevice_Internal {
    private static final int CLAIM_INTERFACE_ORDINAL = 3;
    private static final int CLEAR_HALT_ORDINAL = 7;
    private static final int CLOSE_ORDINAL = 1;
    private static final int CONTROL_TRANSFER_IN_ORDINAL = 8;
    private static final int CONTROL_TRANSFER_OUT_ORDINAL = 9;
    private static final int GENERIC_TRANSFER_IN_ORDINAL = 10;
    private static final int GENERIC_TRANSFER_OUT_ORDINAL = 11;
    private static final int ISOCHRONOUS_TRANSFER_IN_ORDINAL = 12;
    private static final int ISOCHRONOUS_TRANSFER_OUT_ORDINAL = 13;
    public static final Interface.Manager<UsbDevice, UsbDevice.Proxy> MANAGER = new Interface.Manager<UsbDevice, UsbDevice.Proxy>() { // from class: org.chromium.device.mojom.UsbDevice_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "device.mojom.UsbDevice";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public UsbDevice.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, UsbDevice impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public UsbDevice[] buildArray(int size) {
            return new UsbDevice[size];
        }
    };
    private static final int OPEN_ORDINAL = 0;
    private static final int RELEASE_INTERFACE_ORDINAL = 4;
    private static final int RESET_ORDINAL = 6;
    private static final int SET_CONFIGURATION_ORDINAL = 2;
    private static final int SET_INTERFACE_ALTERNATE_SETTING_ORDINAL = 5;

    UsbDevice_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements UsbDevice.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.device.mojom.UsbDevice
        public void open(OpenResponse callback) {
            UsbDeviceOpenParams _message = new UsbDeviceOpenParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new UsbDeviceOpenResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.device.mojom.UsbDevice
        public void close(CloseResponse callback) {
            UsbDeviceCloseParams _message = new UsbDeviceCloseParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1, 1, 0L)), new UsbDeviceCloseResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.device.mojom.UsbDevice
        public void setConfiguration(byte value, SetConfigurationResponse callback) {
            UsbDeviceSetConfigurationParams _message = new UsbDeviceSetConfigurationParams();
            _message.value = value;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2, 1, 0L)), new UsbDeviceSetConfigurationResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.device.mojom.UsbDevice
        public void claimInterface(byte interfaceNumber, ClaimInterfaceResponse callback) {
            UsbDeviceClaimInterfaceParams _message = new UsbDeviceClaimInterfaceParams();
            _message.interfaceNumber = interfaceNumber;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3, 1, 0L)), new UsbDeviceClaimInterfaceResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.device.mojom.UsbDevice
        public void releaseInterface(byte interfaceNumber, ReleaseInterfaceResponse callback) {
            UsbDeviceReleaseInterfaceParams _message = new UsbDeviceReleaseInterfaceParams();
            _message.interfaceNumber = interfaceNumber;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(4, 1, 0L)), new UsbDeviceReleaseInterfaceResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.device.mojom.UsbDevice
        public void setInterfaceAlternateSetting(byte interfaceNumber, byte alternateSetting, SetInterfaceAlternateSettingResponse callback) {
            UsbDeviceSetInterfaceAlternateSettingParams _message = new UsbDeviceSetInterfaceAlternateSettingParams();
            _message.interfaceNumber = interfaceNumber;
            _message.alternateSetting = alternateSetting;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(5, 1, 0L)), new UsbDeviceSetInterfaceAlternateSettingResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.device.mojom.UsbDevice
        public void reset(ResetResponse callback) {
            UsbDeviceResetParams _message = new UsbDeviceResetParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(6, 1, 0L)), new UsbDeviceResetResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.device.mojom.UsbDevice
        public void clearHalt(int direction, byte endpointNumber, ClearHaltResponse callback) {
            UsbDeviceClearHaltParams _message = new UsbDeviceClearHaltParams();
            _message.direction = direction;
            _message.endpointNumber = endpointNumber;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(7, 1, 0L)), new UsbDeviceClearHaltResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.device.mojom.UsbDevice
        public void controlTransferIn(UsbControlTransferParams params, int length, int timeout, ControlTransferInResponse callback) {
            UsbDeviceControlTransferInParams _message = new UsbDeviceControlTransferInParams();
            _message.params = params;
            _message.length = length;
            _message.timeout = timeout;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(8, 1, 0L)), new UsbDeviceControlTransferInResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.device.mojom.UsbDevice
        public void controlTransferOut(UsbControlTransferParams params, ReadOnlyBuffer data, int timeout, ControlTransferOutResponse callback) {
            UsbDeviceControlTransferOutParams _message = new UsbDeviceControlTransferOutParams();
            _message.params = params;
            _message.data = data;
            _message.timeout = timeout;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(9, 1, 0L)), new UsbDeviceControlTransferOutResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.device.mojom.UsbDevice
        public void genericTransferIn(byte endpointNumber, int length, int timeout, GenericTransferInResponse callback) {
            UsbDeviceGenericTransferInParams _message = new UsbDeviceGenericTransferInParams();
            _message.endpointNumber = endpointNumber;
            _message.length = length;
            _message.timeout = timeout;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(10, 1, 0L)), new UsbDeviceGenericTransferInResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.device.mojom.UsbDevice
        public void genericTransferOut(byte endpointNumber, ReadOnlyBuffer data, int timeout, GenericTransferOutResponse callback) {
            UsbDeviceGenericTransferOutParams _message = new UsbDeviceGenericTransferOutParams();
            _message.endpointNumber = endpointNumber;
            _message.data = data;
            _message.timeout = timeout;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(11, 1, 0L)), new UsbDeviceGenericTransferOutResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.device.mojom.UsbDevice
        public void isochronousTransferIn(byte endpointNumber, int[] packetLengths, int timeout, IsochronousTransferInResponse callback) {
            UsbDeviceIsochronousTransferInParams _message = new UsbDeviceIsochronousTransferInParams();
            _message.endpointNumber = endpointNumber;
            _message.packetLengths = packetLengths;
            _message.timeout = timeout;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(12, 1, 0L)), new UsbDeviceIsochronousTransferInResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.device.mojom.UsbDevice
        public void isochronousTransferOut(byte endpointNumber, ReadOnlyBuffer data, int[] packetLengths, int timeout, IsochronousTransferOutResponse callback) {
            UsbDeviceIsochronousTransferOutParams _message = new UsbDeviceIsochronousTransferOutParams();
            _message.endpointNumber = endpointNumber;
            _message.data = data;
            _message.packetLengths = packetLengths;
            _message.timeout = timeout;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(13, 1, 0L)), new UsbDeviceIsochronousTransferOutResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<UsbDevice> {
        Stub(Core core, UsbDevice impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(UsbDevice_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), UsbDevice_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        UsbDeviceOpenParams.deserialize(messageWithHeader.getPayload());
                        getImpl().open(new UsbDeviceOpenResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 1:
                        UsbDeviceCloseParams.deserialize(messageWithHeader.getPayload());
                        getImpl().close(new UsbDeviceCloseResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 2:
                        UsbDeviceSetConfigurationParams data = UsbDeviceSetConfigurationParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setConfiguration(data.value, new UsbDeviceSetConfigurationResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 3:
                        UsbDeviceClaimInterfaceParams data2 = UsbDeviceClaimInterfaceParams.deserialize(messageWithHeader.getPayload());
                        getImpl().claimInterface(data2.interfaceNumber, new UsbDeviceClaimInterfaceResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 4:
                        UsbDeviceReleaseInterfaceParams data3 = UsbDeviceReleaseInterfaceParams.deserialize(messageWithHeader.getPayload());
                        getImpl().releaseInterface(data3.interfaceNumber, new UsbDeviceReleaseInterfaceResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 5:
                        UsbDeviceSetInterfaceAlternateSettingParams data4 = UsbDeviceSetInterfaceAlternateSettingParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setInterfaceAlternateSetting(data4.interfaceNumber, data4.alternateSetting, new UsbDeviceSetInterfaceAlternateSettingResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 6:
                        UsbDeviceResetParams.deserialize(messageWithHeader.getPayload());
                        getImpl().reset(new UsbDeviceResetResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 7:
                        UsbDeviceClearHaltParams data5 = UsbDeviceClearHaltParams.deserialize(messageWithHeader.getPayload());
                        getImpl().clearHalt(data5.direction, data5.endpointNumber, new UsbDeviceClearHaltResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 8:
                        UsbDeviceControlTransferInParams data6 = UsbDeviceControlTransferInParams.deserialize(messageWithHeader.getPayload());
                        getImpl().controlTransferIn(data6.params, data6.length, data6.timeout, new UsbDeviceControlTransferInResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 9:
                        UsbDeviceControlTransferOutParams data7 = UsbDeviceControlTransferOutParams.deserialize(messageWithHeader.getPayload());
                        getImpl().controlTransferOut(data7.params, data7.data, data7.timeout, new UsbDeviceControlTransferOutResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 10:
                        UsbDeviceGenericTransferInParams data8 = UsbDeviceGenericTransferInParams.deserialize(messageWithHeader.getPayload());
                        getImpl().genericTransferIn(data8.endpointNumber, data8.length, data8.timeout, new UsbDeviceGenericTransferInResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 11:
                        UsbDeviceGenericTransferOutParams data9 = UsbDeviceGenericTransferOutParams.deserialize(messageWithHeader.getPayload());
                        getImpl().genericTransferOut(data9.endpointNumber, data9.data, data9.timeout, new UsbDeviceGenericTransferOutResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 12:
                        UsbDeviceIsochronousTransferInParams data10 = UsbDeviceIsochronousTransferInParams.deserialize(messageWithHeader.getPayload());
                        getImpl().isochronousTransferIn(data10.endpointNumber, data10.packetLengths, data10.timeout, new UsbDeviceIsochronousTransferInResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 13:
                        UsbDeviceIsochronousTransferOutParams data11 = UsbDeviceIsochronousTransferOutParams.deserialize(messageWithHeader.getPayload());
                        getImpl().isochronousTransferOut(data11.endpointNumber, data11.data, data11.packetLengths, data11.timeout, new UsbDeviceIsochronousTransferOutResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class UsbDeviceOpenParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UsbDeviceOpenParams(int version) {
            super(8, version);
        }

        public UsbDeviceOpenParams() {
            this(0);
        }

        public static UsbDeviceOpenParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UsbDeviceOpenParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UsbDeviceOpenParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UsbDeviceOpenParams result = new UsbDeviceOpenParams(elementsOrVersion);
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
    public static final class UsbDeviceOpenResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int error;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UsbDeviceOpenResponseParams(int version) {
            super(16, version);
        }

        public UsbDeviceOpenResponseParams() {
            this(0);
        }

        public static UsbDeviceOpenResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UsbDeviceOpenResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UsbDeviceOpenResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UsbDeviceOpenResponseParams result = new UsbDeviceOpenResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.error = readInt;
                UsbOpenDeviceError.validate(readInt);
                result.error = UsbOpenDeviceError.toKnownValue(result.error);
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
        }
    }

    /* loaded from: classes2.dex */
    static class UsbDeviceOpenResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final UsbDevice.OpenResponse mCallback;

        UsbDeviceOpenResponseParamsForwardToCallback(UsbDevice.OpenResponse callback) {
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
                UsbDeviceOpenResponseParams response = UsbDeviceOpenResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.error));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class UsbDeviceOpenResponseParamsProxyToResponder implements UsbDevice.OpenResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        UsbDeviceOpenResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer error) {
            UsbDeviceOpenResponseParams _response = new UsbDeviceOpenResponseParams();
            _response.error = error.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class UsbDeviceCloseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UsbDeviceCloseParams(int version) {
            super(8, version);
        }

        public UsbDeviceCloseParams() {
            this(0);
        }

        public static UsbDeviceCloseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UsbDeviceCloseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UsbDeviceCloseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UsbDeviceCloseParams result = new UsbDeviceCloseParams(elementsOrVersion);
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
    static final class UsbDeviceCloseResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UsbDeviceCloseResponseParams(int version) {
            super(8, version);
        }

        public UsbDeviceCloseResponseParams() {
            this(0);
        }

        public static UsbDeviceCloseResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UsbDeviceCloseResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UsbDeviceCloseResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UsbDeviceCloseResponseParams result = new UsbDeviceCloseResponseParams(elementsOrVersion);
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
    static class UsbDeviceCloseResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final UsbDevice.CloseResponse mCallback;

        UsbDeviceCloseResponseParamsForwardToCallback(UsbDevice.CloseResponse callback) {
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
    static class UsbDeviceCloseResponseParamsProxyToResponder implements UsbDevice.CloseResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        UsbDeviceCloseResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback0
        public void call() {
            UsbDeviceCloseResponseParams _response = new UsbDeviceCloseResponseParams();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(1, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class UsbDeviceSetConfigurationParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public byte value;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UsbDeviceSetConfigurationParams(int version) {
            super(16, version);
        }

        public UsbDeviceSetConfigurationParams() {
            this(0);
        }

        public static UsbDeviceSetConfigurationParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UsbDeviceSetConfigurationParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UsbDeviceSetConfigurationParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UsbDeviceSetConfigurationParams result = new UsbDeviceSetConfigurationParams(elementsOrVersion);
                result.value = decoder0.readByte(8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.value, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class UsbDeviceSetConfigurationResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UsbDeviceSetConfigurationResponseParams(int version) {
            super(16, version);
        }

        public UsbDeviceSetConfigurationResponseParams() {
            this(0);
        }

        public static UsbDeviceSetConfigurationResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UsbDeviceSetConfigurationResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UsbDeviceSetConfigurationResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UsbDeviceSetConfigurationResponseParams result = new UsbDeviceSetConfigurationResponseParams(elementsOrVersion);
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
    static class UsbDeviceSetConfigurationResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final UsbDevice.SetConfigurationResponse mCallback;

        UsbDeviceSetConfigurationResponseParamsForwardToCallback(UsbDevice.SetConfigurationResponse callback) {
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
                UsbDeviceSetConfigurationResponseParams response = UsbDeviceSetConfigurationResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.success));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class UsbDeviceSetConfigurationResponseParamsProxyToResponder implements UsbDevice.SetConfigurationResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        UsbDeviceSetConfigurationResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Boolean success) {
            UsbDeviceSetConfigurationResponseParams _response = new UsbDeviceSetConfigurationResponseParams();
            _response.success = success.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(2, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class UsbDeviceClaimInterfaceParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public byte interfaceNumber;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UsbDeviceClaimInterfaceParams(int version) {
            super(16, version);
        }

        public UsbDeviceClaimInterfaceParams() {
            this(0);
        }

        public static UsbDeviceClaimInterfaceParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UsbDeviceClaimInterfaceParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UsbDeviceClaimInterfaceParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UsbDeviceClaimInterfaceParams result = new UsbDeviceClaimInterfaceParams(elementsOrVersion);
                result.interfaceNumber = decoder0.readByte(8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.interfaceNumber, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class UsbDeviceClaimInterfaceResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int result;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UsbDeviceClaimInterfaceResponseParams(int version) {
            super(16, version);
        }

        public UsbDeviceClaimInterfaceResponseParams() {
            this(0);
        }

        public static UsbDeviceClaimInterfaceResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UsbDeviceClaimInterfaceResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UsbDeviceClaimInterfaceResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UsbDeviceClaimInterfaceResponseParams result = new UsbDeviceClaimInterfaceResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.result = readInt;
                UsbClaimInterfaceResult.validate(readInt);
                result.result = UsbClaimInterfaceResult.toKnownValue(result.result);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.result, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class UsbDeviceClaimInterfaceResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final UsbDevice.ClaimInterfaceResponse mCallback;

        UsbDeviceClaimInterfaceResponseParamsForwardToCallback(UsbDevice.ClaimInterfaceResponse callback) {
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
                UsbDeviceClaimInterfaceResponseParams response = UsbDeviceClaimInterfaceResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.result));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class UsbDeviceClaimInterfaceResponseParamsProxyToResponder implements UsbDevice.ClaimInterfaceResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        UsbDeviceClaimInterfaceResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer result) {
            UsbDeviceClaimInterfaceResponseParams _response = new UsbDeviceClaimInterfaceResponseParams();
            _response.result = result.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(3, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class UsbDeviceReleaseInterfaceParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public byte interfaceNumber;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UsbDeviceReleaseInterfaceParams(int version) {
            super(16, version);
        }

        public UsbDeviceReleaseInterfaceParams() {
            this(0);
        }

        public static UsbDeviceReleaseInterfaceParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UsbDeviceReleaseInterfaceParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UsbDeviceReleaseInterfaceParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UsbDeviceReleaseInterfaceParams result = new UsbDeviceReleaseInterfaceParams(elementsOrVersion);
                result.interfaceNumber = decoder0.readByte(8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.interfaceNumber, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class UsbDeviceReleaseInterfaceResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UsbDeviceReleaseInterfaceResponseParams(int version) {
            super(16, version);
        }

        public UsbDeviceReleaseInterfaceResponseParams() {
            this(0);
        }

        public static UsbDeviceReleaseInterfaceResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UsbDeviceReleaseInterfaceResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UsbDeviceReleaseInterfaceResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UsbDeviceReleaseInterfaceResponseParams result = new UsbDeviceReleaseInterfaceResponseParams(elementsOrVersion);
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
    static class UsbDeviceReleaseInterfaceResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final UsbDevice.ReleaseInterfaceResponse mCallback;

        UsbDeviceReleaseInterfaceResponseParamsForwardToCallback(UsbDevice.ReleaseInterfaceResponse callback) {
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
                UsbDeviceReleaseInterfaceResponseParams response = UsbDeviceReleaseInterfaceResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.success));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class UsbDeviceReleaseInterfaceResponseParamsProxyToResponder implements UsbDevice.ReleaseInterfaceResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        UsbDeviceReleaseInterfaceResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Boolean success) {
            UsbDeviceReleaseInterfaceResponseParams _response = new UsbDeviceReleaseInterfaceResponseParams();
            _response.success = success.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(4, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class UsbDeviceSetInterfaceAlternateSettingParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public byte alternateSetting;
        public byte interfaceNumber;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UsbDeviceSetInterfaceAlternateSettingParams(int version) {
            super(16, version);
        }

        public UsbDeviceSetInterfaceAlternateSettingParams() {
            this(0);
        }

        public static UsbDeviceSetInterfaceAlternateSettingParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UsbDeviceSetInterfaceAlternateSettingParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UsbDeviceSetInterfaceAlternateSettingParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UsbDeviceSetInterfaceAlternateSettingParams result = new UsbDeviceSetInterfaceAlternateSettingParams(elementsOrVersion);
                result.interfaceNumber = decoder0.readByte(8);
                result.alternateSetting = decoder0.readByte(9);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.interfaceNumber, 8);
            encoder0.encode(this.alternateSetting, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class UsbDeviceSetInterfaceAlternateSettingResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UsbDeviceSetInterfaceAlternateSettingResponseParams(int version) {
            super(16, version);
        }

        public UsbDeviceSetInterfaceAlternateSettingResponseParams() {
            this(0);
        }

        public static UsbDeviceSetInterfaceAlternateSettingResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UsbDeviceSetInterfaceAlternateSettingResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UsbDeviceSetInterfaceAlternateSettingResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UsbDeviceSetInterfaceAlternateSettingResponseParams result = new UsbDeviceSetInterfaceAlternateSettingResponseParams(elementsOrVersion);
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
    static class UsbDeviceSetInterfaceAlternateSettingResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final UsbDevice.SetInterfaceAlternateSettingResponse mCallback;

        UsbDeviceSetInterfaceAlternateSettingResponseParamsForwardToCallback(UsbDevice.SetInterfaceAlternateSettingResponse callback) {
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
                UsbDeviceSetInterfaceAlternateSettingResponseParams response = UsbDeviceSetInterfaceAlternateSettingResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.success));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class UsbDeviceSetInterfaceAlternateSettingResponseParamsProxyToResponder implements UsbDevice.SetInterfaceAlternateSettingResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        UsbDeviceSetInterfaceAlternateSettingResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Boolean success) {
            UsbDeviceSetInterfaceAlternateSettingResponseParams _response = new UsbDeviceSetInterfaceAlternateSettingResponseParams();
            _response.success = success.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(5, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class UsbDeviceResetParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UsbDeviceResetParams(int version) {
            super(8, version);
        }

        public UsbDeviceResetParams() {
            this(0);
        }

        public static UsbDeviceResetParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UsbDeviceResetParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UsbDeviceResetParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UsbDeviceResetParams result = new UsbDeviceResetParams(elementsOrVersion);
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
    public static final class UsbDeviceResetResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UsbDeviceResetResponseParams(int version) {
            super(16, version);
        }

        public UsbDeviceResetResponseParams() {
            this(0);
        }

        public static UsbDeviceResetResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UsbDeviceResetResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UsbDeviceResetResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UsbDeviceResetResponseParams result = new UsbDeviceResetResponseParams(elementsOrVersion);
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
    static class UsbDeviceResetResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final UsbDevice.ResetResponse mCallback;

        UsbDeviceResetResponseParamsForwardToCallback(UsbDevice.ResetResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(6, 2)) {
                    return false;
                }
                UsbDeviceResetResponseParams response = UsbDeviceResetResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.success));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class UsbDeviceResetResponseParamsProxyToResponder implements UsbDevice.ResetResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        UsbDeviceResetResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Boolean success) {
            UsbDeviceResetResponseParams _response = new UsbDeviceResetResponseParams();
            _response.success = success.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(6, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class UsbDeviceClearHaltParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int direction;
        public byte endpointNumber;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UsbDeviceClearHaltParams(int version) {
            super(16, version);
        }

        public UsbDeviceClearHaltParams() {
            this(0);
        }

        public static UsbDeviceClearHaltParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UsbDeviceClearHaltParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UsbDeviceClearHaltParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UsbDeviceClearHaltParams result = new UsbDeviceClearHaltParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.direction = readInt;
                UsbTransferDirection.validate(readInt);
                result.direction = UsbTransferDirection.toKnownValue(result.direction);
                result.endpointNumber = decoder0.readByte(12);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.direction, 8);
            encoder0.encode(this.endpointNumber, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class UsbDeviceClearHaltResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UsbDeviceClearHaltResponseParams(int version) {
            super(16, version);
        }

        public UsbDeviceClearHaltResponseParams() {
            this(0);
        }

        public static UsbDeviceClearHaltResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UsbDeviceClearHaltResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UsbDeviceClearHaltResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UsbDeviceClearHaltResponseParams result = new UsbDeviceClearHaltResponseParams(elementsOrVersion);
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
    static class UsbDeviceClearHaltResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final UsbDevice.ClearHaltResponse mCallback;

        UsbDeviceClearHaltResponseParamsForwardToCallback(UsbDevice.ClearHaltResponse callback) {
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
                UsbDeviceClearHaltResponseParams response = UsbDeviceClearHaltResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.success));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class UsbDeviceClearHaltResponseParamsProxyToResponder implements UsbDevice.ClearHaltResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        UsbDeviceClearHaltResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Boolean success) {
            UsbDeviceClearHaltResponseParams _response = new UsbDeviceClearHaltResponseParams();
            _response.success = success.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(7, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class UsbDeviceControlTransferInParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public int length;
        public UsbControlTransferParams params;
        public int timeout;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UsbDeviceControlTransferInParams(int version) {
            super(24, version);
        }

        public UsbDeviceControlTransferInParams() {
            this(0);
        }

        public static UsbDeviceControlTransferInParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UsbDeviceControlTransferInParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UsbDeviceControlTransferInParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UsbDeviceControlTransferInParams result = new UsbDeviceControlTransferInParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.params = UsbControlTransferParams.decode(decoder1);
                result.length = decoder0.readInt(16);
                result.timeout = decoder0.readInt(20);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.params, 8, false);
            encoder0.encode(this.length, 16);
            encoder0.encode(this.timeout, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class UsbDeviceControlTransferInResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public ReadOnlyBuffer data;
        public int status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UsbDeviceControlTransferInResponseParams(int version) {
            super(24, version);
        }

        public UsbDeviceControlTransferInResponseParams() {
            this(0);
        }

        public static UsbDeviceControlTransferInResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UsbDeviceControlTransferInResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UsbDeviceControlTransferInResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UsbDeviceControlTransferInResponseParams result = new UsbDeviceControlTransferInResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.status = readInt;
                UsbTransferStatus.validate(readInt);
                result.status = UsbTransferStatus.toKnownValue(result.status);
                Decoder decoder1 = decoder0.readPointer(16, false);
                result.data = ReadOnlyBuffer.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.status, 8);
            encoder0.encode((Struct) this.data, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static class UsbDeviceControlTransferInResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final UsbDevice.ControlTransferInResponse mCallback;

        UsbDeviceControlTransferInResponseParamsForwardToCallback(UsbDevice.ControlTransferInResponse callback) {
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
                UsbDeviceControlTransferInResponseParams response = UsbDeviceControlTransferInResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.status), response.data);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class UsbDeviceControlTransferInResponseParamsProxyToResponder implements UsbDevice.ControlTransferInResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        UsbDeviceControlTransferInResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Integer status, ReadOnlyBuffer data) {
            UsbDeviceControlTransferInResponseParams _response = new UsbDeviceControlTransferInResponseParams();
            _response.status = status.intValue();
            _response.data = data;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(8, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class UsbDeviceControlTransferOutParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public ReadOnlyBuffer data;
        public UsbControlTransferParams params;
        public int timeout;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UsbDeviceControlTransferOutParams(int version) {
            super(32, version);
        }

        public UsbDeviceControlTransferOutParams() {
            this(0);
        }

        public static UsbDeviceControlTransferOutParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UsbDeviceControlTransferOutParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UsbDeviceControlTransferOutParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UsbDeviceControlTransferOutParams result = new UsbDeviceControlTransferOutParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.params = UsbControlTransferParams.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.data = ReadOnlyBuffer.decode(decoder12);
                result.timeout = decoder0.readInt(24);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.params, 8, false);
            encoder0.encode((Struct) this.data, 16, false);
            encoder0.encode(this.timeout, 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class UsbDeviceControlTransferOutResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UsbDeviceControlTransferOutResponseParams(int version) {
            super(16, version);
        }

        public UsbDeviceControlTransferOutResponseParams() {
            this(0);
        }

        public static UsbDeviceControlTransferOutResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UsbDeviceControlTransferOutResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UsbDeviceControlTransferOutResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UsbDeviceControlTransferOutResponseParams result = new UsbDeviceControlTransferOutResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.status = readInt;
                UsbTransferStatus.validate(readInt);
                result.status = UsbTransferStatus.toKnownValue(result.status);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.status, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class UsbDeviceControlTransferOutResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final UsbDevice.ControlTransferOutResponse mCallback;

        UsbDeviceControlTransferOutResponseParamsForwardToCallback(UsbDevice.ControlTransferOutResponse callback) {
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
                UsbDeviceControlTransferOutResponseParams response = UsbDeviceControlTransferOutResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.status));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class UsbDeviceControlTransferOutResponseParamsProxyToResponder implements UsbDevice.ControlTransferOutResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        UsbDeviceControlTransferOutResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer status) {
            UsbDeviceControlTransferOutResponseParams _response = new UsbDeviceControlTransferOutResponseParams();
            _response.status = status.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(9, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class UsbDeviceGenericTransferInParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public byte endpointNumber;
        public int length;
        public int timeout;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UsbDeviceGenericTransferInParams(int version) {
            super(24, version);
        }

        public UsbDeviceGenericTransferInParams() {
            this(0);
        }

        public static UsbDeviceGenericTransferInParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UsbDeviceGenericTransferInParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UsbDeviceGenericTransferInParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UsbDeviceGenericTransferInParams result = new UsbDeviceGenericTransferInParams(elementsOrVersion);
                result.endpointNumber = decoder0.readByte(8);
                result.length = decoder0.readInt(12);
                result.timeout = decoder0.readInt(16);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.endpointNumber, 8);
            encoder0.encode(this.length, 12);
            encoder0.encode(this.timeout, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class UsbDeviceGenericTransferInResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public ReadOnlyBuffer data;
        public int status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UsbDeviceGenericTransferInResponseParams(int version) {
            super(24, version);
        }

        public UsbDeviceGenericTransferInResponseParams() {
            this(0);
        }

        public static UsbDeviceGenericTransferInResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UsbDeviceGenericTransferInResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UsbDeviceGenericTransferInResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UsbDeviceGenericTransferInResponseParams result = new UsbDeviceGenericTransferInResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.status = readInt;
                UsbTransferStatus.validate(readInt);
                result.status = UsbTransferStatus.toKnownValue(result.status);
                Decoder decoder1 = decoder0.readPointer(16, false);
                result.data = ReadOnlyBuffer.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.status, 8);
            encoder0.encode((Struct) this.data, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static class UsbDeviceGenericTransferInResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final UsbDevice.GenericTransferInResponse mCallback;

        UsbDeviceGenericTransferInResponseParamsForwardToCallback(UsbDevice.GenericTransferInResponse callback) {
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
                UsbDeviceGenericTransferInResponseParams response = UsbDeviceGenericTransferInResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.status), response.data);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class UsbDeviceGenericTransferInResponseParamsProxyToResponder implements UsbDevice.GenericTransferInResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        UsbDeviceGenericTransferInResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Integer status, ReadOnlyBuffer data) {
            UsbDeviceGenericTransferInResponseParams _response = new UsbDeviceGenericTransferInResponseParams();
            _response.status = status.intValue();
            _response.data = data;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(10, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class UsbDeviceGenericTransferOutParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public ReadOnlyBuffer data;
        public byte endpointNumber;
        public int timeout;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UsbDeviceGenericTransferOutParams(int version) {
            super(24, version);
        }

        public UsbDeviceGenericTransferOutParams() {
            this(0);
        }

        public static UsbDeviceGenericTransferOutParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UsbDeviceGenericTransferOutParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UsbDeviceGenericTransferOutParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UsbDeviceGenericTransferOutParams result = new UsbDeviceGenericTransferOutParams(elementsOrVersion);
                result.endpointNumber = decoder0.readByte(8);
                result.timeout = decoder0.readInt(12);
                Decoder decoder1 = decoder0.readPointer(16, false);
                result.data = ReadOnlyBuffer.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.endpointNumber, 8);
            encoder0.encode(this.timeout, 12);
            encoder0.encode((Struct) this.data, 16, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class UsbDeviceGenericTransferOutResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UsbDeviceGenericTransferOutResponseParams(int version) {
            super(16, version);
        }

        public UsbDeviceGenericTransferOutResponseParams() {
            this(0);
        }

        public static UsbDeviceGenericTransferOutResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UsbDeviceGenericTransferOutResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UsbDeviceGenericTransferOutResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UsbDeviceGenericTransferOutResponseParams result = new UsbDeviceGenericTransferOutResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.status = readInt;
                UsbTransferStatus.validate(readInt);
                result.status = UsbTransferStatus.toKnownValue(result.status);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.status, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class UsbDeviceGenericTransferOutResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final UsbDevice.GenericTransferOutResponse mCallback;

        UsbDeviceGenericTransferOutResponseParamsForwardToCallback(UsbDevice.GenericTransferOutResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(11, 2)) {
                    return false;
                }
                UsbDeviceGenericTransferOutResponseParams response = UsbDeviceGenericTransferOutResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.status));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class UsbDeviceGenericTransferOutResponseParamsProxyToResponder implements UsbDevice.GenericTransferOutResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        UsbDeviceGenericTransferOutResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer status) {
            UsbDeviceGenericTransferOutResponseParams _response = new UsbDeviceGenericTransferOutResponseParams();
            _response.status = status.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(11, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class UsbDeviceIsochronousTransferInParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public byte endpointNumber;
        public int[] packetLengths;
        public int timeout;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UsbDeviceIsochronousTransferInParams(int version) {
            super(24, version);
        }

        public UsbDeviceIsochronousTransferInParams() {
            this(0);
        }

        public static UsbDeviceIsochronousTransferInParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UsbDeviceIsochronousTransferInParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UsbDeviceIsochronousTransferInParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UsbDeviceIsochronousTransferInParams result = new UsbDeviceIsochronousTransferInParams(elementsOrVersion);
                result.endpointNumber = decoder0.readByte(8);
                result.timeout = decoder0.readInt(12);
                result.packetLengths = decoder0.readInts(16, 0, -1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.endpointNumber, 8);
            encoder0.encode(this.timeout, 12);
            encoder0.encode(this.packetLengths, 16, 0, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class UsbDeviceIsochronousTransferInResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public ReadOnlyBuffer data;
        public UsbIsochronousPacket[] packets;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UsbDeviceIsochronousTransferInResponseParams(int version) {
            super(24, version);
        }

        public UsbDeviceIsochronousTransferInResponseParams() {
            this(0);
        }

        public static UsbDeviceIsochronousTransferInResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UsbDeviceIsochronousTransferInResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UsbDeviceIsochronousTransferInResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UsbDeviceIsochronousTransferInResponseParams result = new UsbDeviceIsochronousTransferInResponseParams(elementsOrVersion);
                result.data = ReadOnlyBuffer.decode(decoder0.readPointer(8, false));
                Decoder decoder1 = decoder0.readPointer(16, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.packets = new UsbIsochronousPacket[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.packets[i1] = UsbIsochronousPacket.decode(decoder2);
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
            encoder0.encode((Struct) this.data, 8, false);
            UsbIsochronousPacket[] usbIsochronousPacketArr = this.packets;
            if (usbIsochronousPacketArr == null) {
                encoder0.encodeNullPointer(16, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(usbIsochronousPacketArr.length, 16, -1);
            int i0 = 0;
            while (true) {
                UsbIsochronousPacket[] usbIsochronousPacketArr2 = this.packets;
                if (i0 < usbIsochronousPacketArr2.length) {
                    encoder1.encode((Struct) usbIsochronousPacketArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static class UsbDeviceIsochronousTransferInResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final UsbDevice.IsochronousTransferInResponse mCallback;

        UsbDeviceIsochronousTransferInResponseParamsForwardToCallback(UsbDevice.IsochronousTransferInResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(12, 2)) {
                    return false;
                }
                UsbDeviceIsochronousTransferInResponseParams response = UsbDeviceIsochronousTransferInResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.data, response.packets);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class UsbDeviceIsochronousTransferInResponseParamsProxyToResponder implements UsbDevice.IsochronousTransferInResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        UsbDeviceIsochronousTransferInResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(ReadOnlyBuffer data, UsbIsochronousPacket[] packets) {
            UsbDeviceIsochronousTransferInResponseParams _response = new UsbDeviceIsochronousTransferInResponseParams();
            _response.data = data;
            _response.packets = packets;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(12, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class UsbDeviceIsochronousTransferOutParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public ReadOnlyBuffer data;
        public byte endpointNumber;
        public int[] packetLengths;
        public int timeout;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UsbDeviceIsochronousTransferOutParams(int version) {
            super(32, version);
        }

        public UsbDeviceIsochronousTransferOutParams() {
            this(0);
        }

        public static UsbDeviceIsochronousTransferOutParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UsbDeviceIsochronousTransferOutParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UsbDeviceIsochronousTransferOutParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UsbDeviceIsochronousTransferOutParams result = new UsbDeviceIsochronousTransferOutParams(elementsOrVersion);
                result.endpointNumber = decoder0.readByte(8);
                result.timeout = decoder0.readInt(12);
                Decoder decoder1 = decoder0.readPointer(16, false);
                result.data = ReadOnlyBuffer.decode(decoder1);
                result.packetLengths = decoder0.readInts(24, 0, -1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.endpointNumber, 8);
            encoder0.encode(this.timeout, 12);
            encoder0.encode((Struct) this.data, 16, false);
            encoder0.encode(this.packetLengths, 24, 0, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class UsbDeviceIsochronousTransferOutResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public UsbIsochronousPacket[] packets;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private UsbDeviceIsochronousTransferOutResponseParams(int version) {
            super(16, version);
        }

        public UsbDeviceIsochronousTransferOutResponseParams() {
            this(0);
        }

        public static UsbDeviceIsochronousTransferOutResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static UsbDeviceIsochronousTransferOutResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static UsbDeviceIsochronousTransferOutResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                UsbDeviceIsochronousTransferOutResponseParams result = new UsbDeviceIsochronousTransferOutResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.packets = new UsbIsochronousPacket[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.packets[i1] = UsbIsochronousPacket.decode(decoder2);
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
            UsbIsochronousPacket[] usbIsochronousPacketArr = this.packets;
            if (usbIsochronousPacketArr == null) {
                encoder0.encodeNullPointer(8, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(usbIsochronousPacketArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                UsbIsochronousPacket[] usbIsochronousPacketArr2 = this.packets;
                if (i0 < usbIsochronousPacketArr2.length) {
                    encoder1.encode((Struct) usbIsochronousPacketArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static class UsbDeviceIsochronousTransferOutResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final UsbDevice.IsochronousTransferOutResponse mCallback;

        UsbDeviceIsochronousTransferOutResponseParamsForwardToCallback(UsbDevice.IsochronousTransferOutResponse callback) {
            this.mCallback = callback;
        }

        @Override // org.chromium.mojo.bindings.MessageReceiver
        public boolean accept(Message message) {
            try {
                ServiceMessage messageWithHeader = message.asServiceMessage();
                MessageHeader header = messageWithHeader.getHeader();
                if (!header.validateHeader(13, 2)) {
                    return false;
                }
                UsbDeviceIsochronousTransferOutResponseParams response = UsbDeviceIsochronousTransferOutResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.packets);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class UsbDeviceIsochronousTransferOutResponseParamsProxyToResponder implements UsbDevice.IsochronousTransferOutResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        UsbDeviceIsochronousTransferOutResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(UsbIsochronousPacket[] packets) {
            UsbDeviceIsochronousTransferOutResponseParams _response = new UsbDeviceIsochronousTransferOutResponseParams();
            _response.packets = packets;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(13, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
