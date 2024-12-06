package org.chromium.device.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.device.mojom.BluetoothSystem;
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
class BluetoothSystem_Internal {
    private static final int GET_AVAILABLE_DEVICES_ORDINAL = 5;
    private static final int GET_SCAN_STATE_ORDINAL = 2;
    private static final int GET_STATE_ORDINAL = 0;
    public static final Interface.Manager<BluetoothSystem, BluetoothSystem.Proxy> MANAGER = new Interface.Manager<BluetoothSystem, BluetoothSystem.Proxy>() { // from class: org.chromium.device.mojom.BluetoothSystem_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "device.mojom.BluetoothSystem";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public BluetoothSystem.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, BluetoothSystem impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public BluetoothSystem[] buildArray(int size) {
            return new BluetoothSystem[size];
        }
    };
    private static final int SET_POWERED_ORDINAL = 1;
    private static final int START_SCAN_ORDINAL = 3;
    private static final int STOP_SCAN_ORDINAL = 4;

    BluetoothSystem_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements BluetoothSystem.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.device.mojom.BluetoothSystem
        public void getState(GetStateResponse callback) {
            BluetoothSystemGetStateParams _message = new BluetoothSystemGetStateParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new BluetoothSystemGetStateResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.device.mojom.BluetoothSystem
        public void setPowered(boolean powered, SetPoweredResponse callback) {
            BluetoothSystemSetPoweredParams _message = new BluetoothSystemSetPoweredParams();
            _message.powered = powered;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1, 1, 0L)), new BluetoothSystemSetPoweredResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.device.mojom.BluetoothSystem
        public void getScanState(GetScanStateResponse callback) {
            BluetoothSystemGetScanStateParams _message = new BluetoothSystemGetScanStateParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2, 1, 0L)), new BluetoothSystemGetScanStateResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.device.mojom.BluetoothSystem
        public void startScan(StartScanResponse callback) {
            BluetoothSystemStartScanParams _message = new BluetoothSystemStartScanParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3, 1, 0L)), new BluetoothSystemStartScanResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.device.mojom.BluetoothSystem
        public void stopScan(StopScanResponse callback) {
            BluetoothSystemStopScanParams _message = new BluetoothSystemStopScanParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(4, 1, 0L)), new BluetoothSystemStopScanResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.device.mojom.BluetoothSystem
        public void getAvailableDevices(GetAvailableDevicesResponse callback) {
            BluetoothSystemGetAvailableDevicesParams _message = new BluetoothSystemGetAvailableDevicesParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(5, 1, 0L)), new BluetoothSystemGetAvailableDevicesResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<BluetoothSystem> {
        Stub(Core core, BluetoothSystem impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(BluetoothSystem_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), BluetoothSystem_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        BluetoothSystemGetStateParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getState(new BluetoothSystemGetStateResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 1:
                        BluetoothSystemSetPoweredParams data = BluetoothSystemSetPoweredParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setPowered(data.powered, new BluetoothSystemSetPoweredResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 2:
                        BluetoothSystemGetScanStateParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getScanState(new BluetoothSystemGetScanStateResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 3:
                        BluetoothSystemStartScanParams.deserialize(messageWithHeader.getPayload());
                        getImpl().startScan(new BluetoothSystemStartScanResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 4:
                        BluetoothSystemStopScanParams.deserialize(messageWithHeader.getPayload());
                        getImpl().stopScan(new BluetoothSystemStopScanResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 5:
                        BluetoothSystemGetAvailableDevicesParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getAvailableDevices(new BluetoothSystemGetAvailableDevicesResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class BluetoothSystemGetStateParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BluetoothSystemGetStateParams(int version) {
            super(8, version);
        }

        public BluetoothSystemGetStateParams() {
            this(0);
        }

        public static BluetoothSystemGetStateParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BluetoothSystemGetStateParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BluetoothSystemGetStateParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BluetoothSystemGetStateParams result = new BluetoothSystemGetStateParams(elementsOrVersion);
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
    public static final class BluetoothSystemGetStateResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int state;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BluetoothSystemGetStateResponseParams(int version) {
            super(16, version);
        }

        public BluetoothSystemGetStateResponseParams() {
            this(0);
        }

        public static BluetoothSystemGetStateResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BluetoothSystemGetStateResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BluetoothSystemGetStateResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BluetoothSystemGetStateResponseParams result = new BluetoothSystemGetStateResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.state = readInt;
                BluetoothSystem.State.validate(readInt);
                result.state = BluetoothSystem.State.toKnownValue(result.state);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.state, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class BluetoothSystemGetStateResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final BluetoothSystem.GetStateResponse mCallback;

        BluetoothSystemGetStateResponseParamsForwardToCallback(BluetoothSystem.GetStateResponse callback) {
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
                BluetoothSystemGetStateResponseParams response = BluetoothSystemGetStateResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.state));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class BluetoothSystemGetStateResponseParamsProxyToResponder implements BluetoothSystem.GetStateResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        BluetoothSystemGetStateResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer state) {
            BluetoothSystemGetStateResponseParams _response = new BluetoothSystemGetStateResponseParams();
            _response.state = state.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class BluetoothSystemSetPoweredParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean powered;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BluetoothSystemSetPoweredParams(int version) {
            super(16, version);
        }

        public BluetoothSystemSetPoweredParams() {
            this(0);
        }

        public static BluetoothSystemSetPoweredParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BluetoothSystemSetPoweredParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BluetoothSystemSetPoweredParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BluetoothSystemSetPoweredParams result = new BluetoothSystemSetPoweredParams(elementsOrVersion);
                result.powered = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.powered, 8, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class BluetoothSystemSetPoweredResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int result;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BluetoothSystemSetPoweredResponseParams(int version) {
            super(16, version);
        }

        public BluetoothSystemSetPoweredResponseParams() {
            this(0);
        }

        public static BluetoothSystemSetPoweredResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BluetoothSystemSetPoweredResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BluetoothSystemSetPoweredResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BluetoothSystemSetPoweredResponseParams result = new BluetoothSystemSetPoweredResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.result = readInt;
                BluetoothSystem.SetPoweredResult.validate(readInt);
                result.result = BluetoothSystem.SetPoweredResult.toKnownValue(result.result);
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
    static class BluetoothSystemSetPoweredResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final BluetoothSystem.SetPoweredResponse mCallback;

        BluetoothSystemSetPoweredResponseParamsForwardToCallback(BluetoothSystem.SetPoweredResponse callback) {
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
                BluetoothSystemSetPoweredResponseParams response = BluetoothSystemSetPoweredResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.result));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class BluetoothSystemSetPoweredResponseParamsProxyToResponder implements BluetoothSystem.SetPoweredResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        BluetoothSystemSetPoweredResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer result) {
            BluetoothSystemSetPoweredResponseParams _response = new BluetoothSystemSetPoweredResponseParams();
            _response.result = result.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(1, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class BluetoothSystemGetScanStateParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BluetoothSystemGetScanStateParams(int version) {
            super(8, version);
        }

        public BluetoothSystemGetScanStateParams() {
            this(0);
        }

        public static BluetoothSystemGetScanStateParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BluetoothSystemGetScanStateParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BluetoothSystemGetScanStateParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BluetoothSystemGetScanStateParams result = new BluetoothSystemGetScanStateParams(elementsOrVersion);
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
    public static final class BluetoothSystemGetScanStateResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int scanState;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BluetoothSystemGetScanStateResponseParams(int version) {
            super(16, version);
        }

        public BluetoothSystemGetScanStateResponseParams() {
            this(0);
        }

        public static BluetoothSystemGetScanStateResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BluetoothSystemGetScanStateResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BluetoothSystemGetScanStateResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BluetoothSystemGetScanStateResponseParams result = new BluetoothSystemGetScanStateResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.scanState = readInt;
                BluetoothSystem.ScanState.validate(readInt);
                result.scanState = BluetoothSystem.ScanState.toKnownValue(result.scanState);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.scanState, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class BluetoothSystemGetScanStateResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final BluetoothSystem.GetScanStateResponse mCallback;

        BluetoothSystemGetScanStateResponseParamsForwardToCallback(BluetoothSystem.GetScanStateResponse callback) {
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
                BluetoothSystemGetScanStateResponseParams response = BluetoothSystemGetScanStateResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.scanState));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class BluetoothSystemGetScanStateResponseParamsProxyToResponder implements BluetoothSystem.GetScanStateResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        BluetoothSystemGetScanStateResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer scanState) {
            BluetoothSystemGetScanStateResponseParams _response = new BluetoothSystemGetScanStateResponseParams();
            _response.scanState = scanState.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(2, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class BluetoothSystemStartScanParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BluetoothSystemStartScanParams(int version) {
            super(8, version);
        }

        public BluetoothSystemStartScanParams() {
            this(0);
        }

        public static BluetoothSystemStartScanParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BluetoothSystemStartScanParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BluetoothSystemStartScanParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BluetoothSystemStartScanParams result = new BluetoothSystemStartScanParams(elementsOrVersion);
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
    public static final class BluetoothSystemStartScanResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int result;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BluetoothSystemStartScanResponseParams(int version) {
            super(16, version);
        }

        public BluetoothSystemStartScanResponseParams() {
            this(0);
        }

        public static BluetoothSystemStartScanResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BluetoothSystemStartScanResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BluetoothSystemStartScanResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BluetoothSystemStartScanResponseParams result = new BluetoothSystemStartScanResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.result = readInt;
                BluetoothSystem.StartScanResult.validate(readInt);
                result.result = BluetoothSystem.StartScanResult.toKnownValue(result.result);
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
    static class BluetoothSystemStartScanResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final BluetoothSystem.StartScanResponse mCallback;

        BluetoothSystemStartScanResponseParamsForwardToCallback(BluetoothSystem.StartScanResponse callback) {
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
                BluetoothSystemStartScanResponseParams response = BluetoothSystemStartScanResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.result));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class BluetoothSystemStartScanResponseParamsProxyToResponder implements BluetoothSystem.StartScanResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        BluetoothSystemStartScanResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer result) {
            BluetoothSystemStartScanResponseParams _response = new BluetoothSystemStartScanResponseParams();
            _response.result = result.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(3, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class BluetoothSystemStopScanParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BluetoothSystemStopScanParams(int version) {
            super(8, version);
        }

        public BluetoothSystemStopScanParams() {
            this(0);
        }

        public static BluetoothSystemStopScanParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BluetoothSystemStopScanParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BluetoothSystemStopScanParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BluetoothSystemStopScanParams result = new BluetoothSystemStopScanParams(elementsOrVersion);
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
    public static final class BluetoothSystemStopScanResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int result;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BluetoothSystemStopScanResponseParams(int version) {
            super(16, version);
        }

        public BluetoothSystemStopScanResponseParams() {
            this(0);
        }

        public static BluetoothSystemStopScanResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BluetoothSystemStopScanResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BluetoothSystemStopScanResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BluetoothSystemStopScanResponseParams result = new BluetoothSystemStopScanResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.result = readInt;
                BluetoothSystem.StopScanResult.validate(readInt);
                result.result = BluetoothSystem.StopScanResult.toKnownValue(result.result);
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
    static class BluetoothSystemStopScanResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final BluetoothSystem.StopScanResponse mCallback;

        BluetoothSystemStopScanResponseParamsForwardToCallback(BluetoothSystem.StopScanResponse callback) {
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
                BluetoothSystemStopScanResponseParams response = BluetoothSystemStopScanResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.result));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class BluetoothSystemStopScanResponseParamsProxyToResponder implements BluetoothSystem.StopScanResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        BluetoothSystemStopScanResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer result) {
            BluetoothSystemStopScanResponseParams _response = new BluetoothSystemStopScanResponseParams();
            _response.result = result.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(4, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class BluetoothSystemGetAvailableDevicesParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BluetoothSystemGetAvailableDevicesParams(int version) {
            super(8, version);
        }

        public BluetoothSystemGetAvailableDevicesParams() {
            this(0);
        }

        public static BluetoothSystemGetAvailableDevicesParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BluetoothSystemGetAvailableDevicesParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BluetoothSystemGetAvailableDevicesParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BluetoothSystemGetAvailableDevicesParams result = new BluetoothSystemGetAvailableDevicesParams(elementsOrVersion);
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
    public static final class BluetoothSystemGetAvailableDevicesResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public BluetoothDeviceInfo[] devices;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private BluetoothSystemGetAvailableDevicesResponseParams(int version) {
            super(16, version);
        }

        public BluetoothSystemGetAvailableDevicesResponseParams() {
            this(0);
        }

        public static BluetoothSystemGetAvailableDevicesResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static BluetoothSystemGetAvailableDevicesResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static BluetoothSystemGetAvailableDevicesResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                BluetoothSystemGetAvailableDevicesResponseParams result = new BluetoothSystemGetAvailableDevicesResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.devices = new BluetoothDeviceInfo[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.devices[i1] = BluetoothDeviceInfo.decode(decoder2);
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
            BluetoothDeviceInfo[] bluetoothDeviceInfoArr = this.devices;
            if (bluetoothDeviceInfoArr == null) {
                encoder0.encodeNullPointer(8, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(bluetoothDeviceInfoArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                BluetoothDeviceInfo[] bluetoothDeviceInfoArr2 = this.devices;
                if (i0 < bluetoothDeviceInfoArr2.length) {
                    encoder1.encode((Struct) bluetoothDeviceInfoArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static class BluetoothSystemGetAvailableDevicesResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final BluetoothSystem.GetAvailableDevicesResponse mCallback;

        BluetoothSystemGetAvailableDevicesResponseParamsForwardToCallback(BluetoothSystem.GetAvailableDevicesResponse callback) {
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
                BluetoothSystemGetAvailableDevicesResponseParams response = BluetoothSystemGetAvailableDevicesResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.devices);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class BluetoothSystemGetAvailableDevicesResponseParamsProxyToResponder implements BluetoothSystem.GetAvailableDevicesResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        BluetoothSystemGetAvailableDevicesResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(BluetoothDeviceInfo[] devices) {
            BluetoothSystemGetAvailableDevicesResponseParams _response = new BluetoothSystemGetAvailableDevicesResponseParams();
            _response.devices = devices;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(5, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
