package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.MediaStreamDispatcherHost;
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
import org.chromium.mojo_base.mojom.UnguessableToken;
/* loaded from: classes2.dex */
class MediaStreamDispatcherHost_Internal {
    private static final int CANCEL_REQUEST_ORDINAL = 1;
    private static final int CLOSE_DEVICE_ORDINAL = 4;
    private static final int GENERATE_STREAM_ORDINAL = 0;
    public static final Interface.Manager<MediaStreamDispatcherHost, MediaStreamDispatcherHost.Proxy> MANAGER = new Interface.Manager<MediaStreamDispatcherHost, MediaStreamDispatcherHost.Proxy>() { // from class: org.chromium.blink.mojom.MediaStreamDispatcherHost_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.MediaStreamDispatcherHost";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public MediaStreamDispatcherHost.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, MediaStreamDispatcherHost impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public MediaStreamDispatcherHost[] buildArray(int size) {
            return new MediaStreamDispatcherHost[size];
        }
    };
    private static final int ON_STREAM_STARTED_ORDINAL = 6;
    private static final int OPEN_DEVICE_ORDINAL = 3;
    private static final int SET_CAPTURING_LINK_SECURED_ORDINAL = 5;
    private static final int STOP_STREAM_DEVICE_ORDINAL = 2;

    MediaStreamDispatcherHost_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements MediaStreamDispatcherHost.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.MediaStreamDispatcherHost
        public void generateStream(int requestId, StreamControls controls, boolean userGesture, StreamSelectionInfo audioStreamSelectionInfo, GenerateStreamResponse callback) {
            MediaStreamDispatcherHostGenerateStreamParams _message = new MediaStreamDispatcherHostGenerateStreamParams();
            _message.requestId = requestId;
            _message.controls = controls;
            _message.userGesture = userGesture;
            _message.audioStreamSelectionInfo = audioStreamSelectionInfo;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new MediaStreamDispatcherHostGenerateStreamResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.MediaStreamDispatcherHost
        public void cancelRequest(int requestId) {
            MediaStreamDispatcherHostCancelRequestParams _message = new MediaStreamDispatcherHostCancelRequestParams();
            _message.requestId = requestId;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1)));
        }

        @Override // org.chromium.blink.mojom.MediaStreamDispatcherHost
        public void stopStreamDevice(String deviceId, UnguessableToken sessionId) {
            MediaStreamDispatcherHostStopStreamDeviceParams _message = new MediaStreamDispatcherHostStopStreamDeviceParams();
            _message.deviceId = deviceId;
            _message.sessionId = sessionId;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2)));
        }

        @Override // org.chromium.blink.mojom.MediaStreamDispatcherHost
        public void openDevice(int requestId, String deviceId, int type, OpenDeviceResponse callback) {
            MediaStreamDispatcherHostOpenDeviceParams _message = new MediaStreamDispatcherHostOpenDeviceParams();
            _message.requestId = requestId;
            _message.deviceId = deviceId;
            _message.type = type;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3, 1, 0L)), new MediaStreamDispatcherHostOpenDeviceResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.MediaStreamDispatcherHost
        public void closeDevice(String label) {
            MediaStreamDispatcherHostCloseDeviceParams _message = new MediaStreamDispatcherHostCloseDeviceParams();
            _message.label = label;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(4)));
        }

        @Override // org.chromium.blink.mojom.MediaStreamDispatcherHost
        public void setCapturingLinkSecured(UnguessableToken sessionId, int type, boolean isSecure) {
            MediaStreamDispatcherHostSetCapturingLinkSecuredParams _message = new MediaStreamDispatcherHostSetCapturingLinkSecuredParams();
            _message.sessionId = sessionId;
            _message.type = type;
            _message.isSecure = isSecure;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(5)));
        }

        @Override // org.chromium.blink.mojom.MediaStreamDispatcherHost
        public void onStreamStarted(String label) {
            MediaStreamDispatcherHostOnStreamStartedParams _message = new MediaStreamDispatcherHostOnStreamStartedParams();
            _message.label = label;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(6)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<MediaStreamDispatcherHost> {
        Stub(Core core, MediaStreamDispatcherHost impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(MediaStreamDispatcherHost_Internal.MANAGER, messageWithHeader);
                    case -1:
                    case 0:
                    case 3:
                    default:
                        return false;
                    case 1:
                        getImpl().cancelRequest(MediaStreamDispatcherHostCancelRequestParams.deserialize(messageWithHeader.getPayload()).requestId);
                        return true;
                    case 2:
                        MediaStreamDispatcherHostStopStreamDeviceParams data = MediaStreamDispatcherHostStopStreamDeviceParams.deserialize(messageWithHeader.getPayload());
                        getImpl().stopStreamDevice(data.deviceId, data.sessionId);
                        return true;
                    case 4:
                        MediaStreamDispatcherHostCloseDeviceParams data2 = MediaStreamDispatcherHostCloseDeviceParams.deserialize(messageWithHeader.getPayload());
                        getImpl().closeDevice(data2.label);
                        return true;
                    case 5:
                        MediaStreamDispatcherHostSetCapturingLinkSecuredParams data3 = MediaStreamDispatcherHostSetCapturingLinkSecuredParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setCapturingLinkSecured(data3.sessionId, data3.type, data3.isSecure);
                        return true;
                    case 6:
                        MediaStreamDispatcherHostOnStreamStartedParams data4 = MediaStreamDispatcherHostOnStreamStartedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onStreamStarted(data4.label);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), MediaStreamDispatcherHost_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        MediaStreamDispatcherHostGenerateStreamParams data = MediaStreamDispatcherHostGenerateStreamParams.deserialize(messageWithHeader.getPayload());
                        getImpl().generateStream(data.requestId, data.controls, data.userGesture, data.audioStreamSelectionInfo, new MediaStreamDispatcherHostGenerateStreamResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 1:
                    case 2:
                    default:
                        return false;
                    case 3:
                        MediaStreamDispatcherHostOpenDeviceParams data2 = MediaStreamDispatcherHostOpenDeviceParams.deserialize(messageWithHeader.getPayload());
                        getImpl().openDevice(data2.requestId, data2.deviceId, data2.type, new MediaStreamDispatcherHostOpenDeviceResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                }
            } catch (DeserializationException e) {
                System.err.println(e.toString());
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static final class MediaStreamDispatcherHostGenerateStreamParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public StreamSelectionInfo audioStreamSelectionInfo;
        public StreamControls controls;
        public int requestId;
        public boolean userGesture;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaStreamDispatcherHostGenerateStreamParams(int version) {
            super(32, version);
        }

        public MediaStreamDispatcherHostGenerateStreamParams() {
            this(0);
        }

        public static MediaStreamDispatcherHostGenerateStreamParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaStreamDispatcherHostGenerateStreamParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaStreamDispatcherHostGenerateStreamParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaStreamDispatcherHostGenerateStreamParams result = new MediaStreamDispatcherHostGenerateStreamParams(elementsOrVersion);
                result.requestId = decoder0.readInt(8);
                result.userGesture = decoder0.readBoolean(12, 0);
                Decoder decoder1 = decoder0.readPointer(16, false);
                result.controls = StreamControls.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(24, false);
                result.audioStreamSelectionInfo = StreamSelectionInfo.decode(decoder12);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.requestId, 8);
            encoder0.encode(this.userGesture, 12, 0);
            encoder0.encode((Struct) this.controls, 16, false);
            encoder0.encode((Struct) this.audioStreamSelectionInfo, 24, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class MediaStreamDispatcherHostGenerateStreamResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 40;
        private static final DataHeader[] VERSION_ARRAY;
        public MediaStreamDevice[] audioDevices;
        public String label;
        public boolean panTiltZoomAllowed;
        public int result;
        public MediaStreamDevice[] videoDevices;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaStreamDispatcherHostGenerateStreamResponseParams(int version) {
            super(40, version);
        }

        public MediaStreamDispatcherHostGenerateStreamResponseParams() {
            this(0);
        }

        public static MediaStreamDispatcherHostGenerateStreamResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaStreamDispatcherHostGenerateStreamResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaStreamDispatcherHostGenerateStreamResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaStreamDispatcherHostGenerateStreamResponseParams result = new MediaStreamDispatcherHostGenerateStreamResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.result = readInt;
                MediaStreamRequestResult.validate(readInt);
                result.result = MediaStreamRequestResult.toKnownValue(result.result);
                result.panTiltZoomAllowed = decoder0.readBoolean(12, 0);
                result.label = decoder0.readString(16, false);
                Decoder decoder1 = decoder0.readPointer(24, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.audioDevices = new MediaStreamDevice[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.audioDevices[i1] = MediaStreamDevice.decode(decoder2);
                }
                Decoder decoder12 = decoder0.readPointer(32, false);
                DataHeader si12 = decoder12.readDataHeaderForPointerArray(-1);
                result.videoDevices = new MediaStreamDevice[si12.elementsOrVersion];
                for (int i12 = 0; i12 < si12.elementsOrVersion; i12++) {
                    Decoder decoder22 = decoder12.readPointer((i12 * 8) + 8, false);
                    result.videoDevices[i12] = MediaStreamDevice.decode(decoder22);
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
            encoder0.encode(this.result, 8);
            encoder0.encode(this.panTiltZoomAllowed, 12, 0);
            encoder0.encode(this.label, 16, false);
            MediaStreamDevice[] mediaStreamDeviceArr = this.audioDevices;
            if (mediaStreamDeviceArr == null) {
                encoder0.encodeNullPointer(24, false);
            } else {
                Encoder encoder1 = encoder0.encodePointerArray(mediaStreamDeviceArr.length, 24, -1);
                int i0 = 0;
                while (true) {
                    MediaStreamDevice[] mediaStreamDeviceArr2 = this.audioDevices;
                    if (i0 >= mediaStreamDeviceArr2.length) {
                        break;
                    }
                    encoder1.encode((Struct) mediaStreamDeviceArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                }
            }
            MediaStreamDevice[] mediaStreamDeviceArr3 = this.videoDevices;
            if (mediaStreamDeviceArr3 == null) {
                encoder0.encodeNullPointer(32, false);
                return;
            }
            Encoder encoder12 = encoder0.encodePointerArray(mediaStreamDeviceArr3.length, 32, -1);
            int i02 = 0;
            while (true) {
                MediaStreamDevice[] mediaStreamDeviceArr4 = this.videoDevices;
                if (i02 < mediaStreamDeviceArr4.length) {
                    encoder12.encode((Struct) mediaStreamDeviceArr4[i02], (i02 * 8) + 8, false);
                    i02++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static class MediaStreamDispatcherHostGenerateStreamResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final MediaStreamDispatcherHost.GenerateStreamResponse mCallback;

        MediaStreamDispatcherHostGenerateStreamResponseParamsForwardToCallback(MediaStreamDispatcherHost.GenerateStreamResponse callback) {
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
                MediaStreamDispatcherHostGenerateStreamResponseParams response = MediaStreamDispatcherHostGenerateStreamResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.result), response.label, response.audioDevices, response.videoDevices, Boolean.valueOf(response.panTiltZoomAllowed));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class MediaStreamDispatcherHostGenerateStreamResponseParamsProxyToResponder implements MediaStreamDispatcherHost.GenerateStreamResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        MediaStreamDispatcherHostGenerateStreamResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback5
        public void call(Integer result, String label, MediaStreamDevice[] audioDevices, MediaStreamDevice[] videoDevices, Boolean panTiltZoomAllowed) {
            MediaStreamDispatcherHostGenerateStreamResponseParams _response = new MediaStreamDispatcherHostGenerateStreamResponseParams();
            _response.result = result.intValue();
            _response.label = label;
            _response.audioDevices = audioDevices;
            _response.videoDevices = videoDevices;
            _response.panTiltZoomAllowed = panTiltZoomAllowed.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class MediaStreamDispatcherHostCancelRequestParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int requestId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaStreamDispatcherHostCancelRequestParams(int version) {
            super(16, version);
        }

        public MediaStreamDispatcherHostCancelRequestParams() {
            this(0);
        }

        public static MediaStreamDispatcherHostCancelRequestParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaStreamDispatcherHostCancelRequestParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaStreamDispatcherHostCancelRequestParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaStreamDispatcherHostCancelRequestParams result = new MediaStreamDispatcherHostCancelRequestParams(elementsOrVersion);
                result.requestId = decoder0.readInt(8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.requestId, 8);
        }
    }

    /* loaded from: classes2.dex */
    static final class MediaStreamDispatcherHostStopStreamDeviceParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public String deviceId;
        public UnguessableToken sessionId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaStreamDispatcherHostStopStreamDeviceParams(int version) {
            super(24, version);
        }

        public MediaStreamDispatcherHostStopStreamDeviceParams() {
            this(0);
        }

        public static MediaStreamDispatcherHostStopStreamDeviceParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaStreamDispatcherHostStopStreamDeviceParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaStreamDispatcherHostStopStreamDeviceParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaStreamDispatcherHostStopStreamDeviceParams result = new MediaStreamDispatcherHostStopStreamDeviceParams(elementsOrVersion);
                result.deviceId = decoder0.readString(8, false);
                Decoder decoder1 = decoder0.readPointer(16, true);
                result.sessionId = UnguessableToken.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.deviceId, 8, false);
            encoder0.encode((Struct) this.sessionId, 16, true);
        }
    }

    /* loaded from: classes2.dex */
    static final class MediaStreamDispatcherHostOpenDeviceParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public String deviceId;
        public int requestId;
        public int type;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaStreamDispatcherHostOpenDeviceParams(int version) {
            super(24, version);
        }

        public MediaStreamDispatcherHostOpenDeviceParams() {
            this(0);
        }

        public static MediaStreamDispatcherHostOpenDeviceParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaStreamDispatcherHostOpenDeviceParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaStreamDispatcherHostOpenDeviceParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaStreamDispatcherHostOpenDeviceParams result = new MediaStreamDispatcherHostOpenDeviceParams(elementsOrVersion);
                result.requestId = decoder0.readInt(8);
                int readInt = decoder0.readInt(12);
                result.type = readInt;
                MediaStreamType.validate(readInt);
                result.type = MediaStreamType.toKnownValue(result.type);
                result.deviceId = decoder0.readString(16, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.requestId, 8);
            encoder0.encode(this.type, 12);
            encoder0.encode(this.deviceId, 16, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class MediaStreamDispatcherHostOpenDeviceResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public MediaStreamDevice device;
        public String label;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaStreamDispatcherHostOpenDeviceResponseParams(int version) {
            super(32, version);
        }

        public MediaStreamDispatcherHostOpenDeviceResponseParams() {
            this(0);
        }

        public static MediaStreamDispatcherHostOpenDeviceResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaStreamDispatcherHostOpenDeviceResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaStreamDispatcherHostOpenDeviceResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaStreamDispatcherHostOpenDeviceResponseParams result = new MediaStreamDispatcherHostOpenDeviceResponseParams(elementsOrVersion);
                result.success = decoder0.readBoolean(8, 0);
                result.label = decoder0.readString(16, false);
                Decoder decoder1 = decoder0.readPointer(24, false);
                result.device = MediaStreamDevice.decode(decoder1);
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
            encoder0.encode(this.label, 16, false);
            encoder0.encode((Struct) this.device, 24, false);
        }
    }

    /* loaded from: classes2.dex */
    static class MediaStreamDispatcherHostOpenDeviceResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final MediaStreamDispatcherHost.OpenDeviceResponse mCallback;

        MediaStreamDispatcherHostOpenDeviceResponseParamsForwardToCallback(MediaStreamDispatcherHost.OpenDeviceResponse callback) {
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
                MediaStreamDispatcherHostOpenDeviceResponseParams response = MediaStreamDispatcherHostOpenDeviceResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.success), response.label, response.device);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class MediaStreamDispatcherHostOpenDeviceResponseParamsProxyToResponder implements MediaStreamDispatcherHost.OpenDeviceResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        MediaStreamDispatcherHostOpenDeviceResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback3
        public void call(Boolean success, String label, MediaStreamDevice device) {
            MediaStreamDispatcherHostOpenDeviceResponseParams _response = new MediaStreamDispatcherHostOpenDeviceResponseParams();
            _response.success = success.booleanValue();
            _response.label = label;
            _response.device = device;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(3, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class MediaStreamDispatcherHostCloseDeviceParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public String label;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaStreamDispatcherHostCloseDeviceParams(int version) {
            super(16, version);
        }

        public MediaStreamDispatcherHostCloseDeviceParams() {
            this(0);
        }

        public static MediaStreamDispatcherHostCloseDeviceParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaStreamDispatcherHostCloseDeviceParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaStreamDispatcherHostCloseDeviceParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaStreamDispatcherHostCloseDeviceParams result = new MediaStreamDispatcherHostCloseDeviceParams(elementsOrVersion);
                result.label = decoder0.readString(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.label, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class MediaStreamDispatcherHostSetCapturingLinkSecuredParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean isSecure;
        public UnguessableToken sessionId;
        public int type;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaStreamDispatcherHostSetCapturingLinkSecuredParams(int version) {
            super(24, version);
        }

        public MediaStreamDispatcherHostSetCapturingLinkSecuredParams() {
            this(0);
        }

        public static MediaStreamDispatcherHostSetCapturingLinkSecuredParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaStreamDispatcherHostSetCapturingLinkSecuredParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaStreamDispatcherHostSetCapturingLinkSecuredParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaStreamDispatcherHostSetCapturingLinkSecuredParams result = new MediaStreamDispatcherHostSetCapturingLinkSecuredParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, true);
                result.sessionId = UnguessableToken.decode(decoder1);
                int readInt = decoder0.readInt(16);
                result.type = readInt;
                MediaStreamType.validate(readInt);
                result.type = MediaStreamType.toKnownValue(result.type);
                result.isSecure = decoder0.readBoolean(20, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.sessionId, 8, true);
            encoder0.encode(this.type, 16);
            encoder0.encode(this.isSecure, 20, 0);
        }
    }

    /* loaded from: classes2.dex */
    static final class MediaStreamDispatcherHostOnStreamStartedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public String label;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaStreamDispatcherHostOnStreamStartedParams(int version) {
            super(16, version);
        }

        public MediaStreamDispatcherHostOnStreamStartedParams() {
            this(0);
        }

        public static MediaStreamDispatcherHostOnStreamStartedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaStreamDispatcherHostOnStreamStartedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaStreamDispatcherHostOnStreamStartedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaStreamDispatcherHostOnStreamStartedParams result = new MediaStreamDispatcherHostOnStreamStartedParams(elementsOrVersion);
                result.label = decoder0.readString(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.label, 8, false);
        }
    }
}
