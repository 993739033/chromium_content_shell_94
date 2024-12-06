package org.chromium.device.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.device.mojom.GeolocationConfig;
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
class GeolocationConfig_Internal {
    private static final int IS_HIGH_ACCURACY_LOCATION_BEING_CAPTURED_ORDINAL = 0;
    public static final Interface.Manager<GeolocationConfig, GeolocationConfig.Proxy> MANAGER = new Interface.Manager<GeolocationConfig, GeolocationConfig.Proxy>() { // from class: org.chromium.device.mojom.GeolocationConfig_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "device.mojom.GeolocationConfig";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public GeolocationConfig.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, GeolocationConfig impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public GeolocationConfig[] buildArray(int size) {
            return new GeolocationConfig[size];
        }
    };

    GeolocationConfig_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements GeolocationConfig.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.device.mojom.GeolocationConfig
        public void isHighAccuracyLocationBeingCaptured(IsHighAccuracyLocationBeingCapturedResponse callback) {
            GeolocationConfigIsHighAccuracyLocationBeingCapturedParams _message = new GeolocationConfigIsHighAccuracyLocationBeingCapturedParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new GeolocationConfigIsHighAccuracyLocationBeingCapturedResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<GeolocationConfig> {
        Stub(Core core, GeolocationConfig impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(GeolocationConfig_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), GeolocationConfig_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        GeolocationConfigIsHighAccuracyLocationBeingCapturedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().isHighAccuracyLocationBeingCaptured(new GeolocationConfigIsHighAccuracyLocationBeingCapturedResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class GeolocationConfigIsHighAccuracyLocationBeingCapturedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private GeolocationConfigIsHighAccuracyLocationBeingCapturedParams(int version) {
            super(8, version);
        }

        public GeolocationConfigIsHighAccuracyLocationBeingCapturedParams() {
            this(0);
        }

        public static GeolocationConfigIsHighAccuracyLocationBeingCapturedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static GeolocationConfigIsHighAccuracyLocationBeingCapturedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static GeolocationConfigIsHighAccuracyLocationBeingCapturedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                GeolocationConfigIsHighAccuracyLocationBeingCapturedParams result = new GeolocationConfigIsHighAccuracyLocationBeingCapturedParams(elementsOrVersion);
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
    public static final class GeolocationConfigIsHighAccuracyLocationBeingCapturedResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean highAccuracy;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private GeolocationConfigIsHighAccuracyLocationBeingCapturedResponseParams(int version) {
            super(16, version);
        }

        public GeolocationConfigIsHighAccuracyLocationBeingCapturedResponseParams() {
            this(0);
        }

        public static GeolocationConfigIsHighAccuracyLocationBeingCapturedResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static GeolocationConfigIsHighAccuracyLocationBeingCapturedResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static GeolocationConfigIsHighAccuracyLocationBeingCapturedResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                GeolocationConfigIsHighAccuracyLocationBeingCapturedResponseParams result = new GeolocationConfigIsHighAccuracyLocationBeingCapturedResponseParams(elementsOrVersion);
                result.highAccuracy = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.highAccuracy, 8, 0);
        }
    }

    /* loaded from: classes2.dex */
    static class GeolocationConfigIsHighAccuracyLocationBeingCapturedResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final GeolocationConfig.IsHighAccuracyLocationBeingCapturedResponse mCallback;

        GeolocationConfigIsHighAccuracyLocationBeingCapturedResponseParamsForwardToCallback(GeolocationConfig.IsHighAccuracyLocationBeingCapturedResponse callback) {
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
                GeolocationConfigIsHighAccuracyLocationBeingCapturedResponseParams response = GeolocationConfigIsHighAccuracyLocationBeingCapturedResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.highAccuracy));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class GeolocationConfigIsHighAccuracyLocationBeingCapturedResponseParamsProxyToResponder implements GeolocationConfig.IsHighAccuracyLocationBeingCapturedResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        GeolocationConfigIsHighAccuracyLocationBeingCapturedResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Boolean highAccuracy) {
            GeolocationConfigIsHighAccuracyLocationBeingCapturedResponseParams _response = new GeolocationConfigIsHighAccuracyLocationBeingCapturedResponseParams();
            _response.highAccuracy = highAccuracy.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
