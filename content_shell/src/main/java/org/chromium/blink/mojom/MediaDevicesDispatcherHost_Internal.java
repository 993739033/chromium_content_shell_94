package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;

import org.chromium.blink.mojom.MediaDevicesDispatcherHost;
import org.chromium.media.mojom.VideoCaptureFormat;
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
class MediaDevicesDispatcherHost_Internal {
    private static final int ADD_MEDIA_DEVICES_LISTENER_ORDINAL = 5;
    private static final int ENUMERATE_DEVICES_ORDINAL = 0;
    private static final int GET_ALL_VIDEO_INPUT_DEVICE_FORMATS_ORDINAL = 2;
    private static final int GET_AUDIO_INPUT_CAPABILITIES_ORDINAL = 4;
    private static final int GET_AVAILABLE_VIDEO_INPUT_DEVICE_FORMATS_ORDINAL = 3;
    private static final int GET_VIDEO_INPUT_CAPABILITIES_ORDINAL = 1;
    public static final Interface.Manager<MediaDevicesDispatcherHost, MediaDevicesDispatcherHost.Proxy> MANAGER = new Interface.Manager<MediaDevicesDispatcherHost, MediaDevicesDispatcherHost.Proxy>() { // from class: org.chromium.blink.mojom.MediaDevicesDispatcherHost_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.MediaDevicesDispatcherHost";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public MediaDevicesDispatcherHost.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, MediaDevicesDispatcherHost impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public MediaDevicesDispatcherHost[] buildArray(int size) {
            return new MediaDevicesDispatcherHost[size];
        }
    };
    private static final int SET_CAPTURE_HANDLE_CONFIG_ORDINAL = 6;

    MediaDevicesDispatcherHost_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements MediaDevicesDispatcherHost.Proxy {
        @Override
        // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.MediaDevicesDispatcherHost
        public void enumerateDevices(boolean requestAudioInput, boolean requestVideoInput, boolean requestAudioOutput, boolean requestVideoInputCapabilities, boolean requestAudioInputCapabilities, EnumerateDevicesResponse callback) {
            MediaDevicesDispatcherHostEnumerateDevicesParams _message = new MediaDevicesDispatcherHostEnumerateDevicesParams();
            _message.requestAudioInput = requestAudioInput;
            _message.requestVideoInput = requestVideoInput;
            _message.requestAudioOutput = requestAudioOutput;
            _message.requestVideoInputCapabilities = requestVideoInputCapabilities;
            _message.requestAudioInputCapabilities = requestAudioInputCapabilities;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new MediaDevicesDispatcherHostEnumerateDevicesResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.MediaDevicesDispatcherHost
        public void getVideoInputCapabilities(GetVideoInputCapabilitiesResponse callback) {
            MediaDevicesDispatcherHostGetVideoInputCapabilitiesParams _message = new MediaDevicesDispatcherHostGetVideoInputCapabilitiesParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1, 1, 0L)), new MediaDevicesDispatcherHostGetVideoInputCapabilitiesResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.MediaDevicesDispatcherHost
        public void getAllVideoInputDeviceFormats(String deviceId, GetAllVideoInputDeviceFormatsResponse callback) {
            MediaDevicesDispatcherHostGetAllVideoInputDeviceFormatsParams _message = new MediaDevicesDispatcherHostGetAllVideoInputDeviceFormatsParams();
            _message.deviceId = deviceId;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2, 1, 0L)), new MediaDevicesDispatcherHostGetAllVideoInputDeviceFormatsResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.MediaDevicesDispatcherHost
        public void getAvailableVideoInputDeviceFormats(String deviceId, GetAvailableVideoInputDeviceFormatsResponse callback) {
            MediaDevicesDispatcherHostGetAvailableVideoInputDeviceFormatsParams _message = new MediaDevicesDispatcherHostGetAvailableVideoInputDeviceFormatsParams();
            _message.deviceId = deviceId;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3, 1, 0L)), new MediaDevicesDispatcherHostGetAvailableVideoInputDeviceFormatsResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.MediaDevicesDispatcherHost
        public void getAudioInputCapabilities(GetAudioInputCapabilitiesResponse callback) {
            MediaDevicesDispatcherHostGetAudioInputCapabilitiesParams _message = new MediaDevicesDispatcherHostGetAudioInputCapabilitiesParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(4, 1, 0L)), new MediaDevicesDispatcherHostGetAudioInputCapabilitiesResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.MediaDevicesDispatcherHost
        public void addMediaDevicesListener(boolean subscribeAudioInput, boolean subscribeVideoInput, boolean subscribeAudioOutput, MediaDevicesListener listener) {
            MediaDevicesDispatcherHostAddMediaDevicesListenerParams _message = new MediaDevicesDispatcherHostAddMediaDevicesListenerParams();
            _message.subscribeAudioInput = subscribeAudioInput;
            _message.subscribeVideoInput = subscribeVideoInput;
            _message.subscribeAudioOutput = subscribeAudioOutput;
            _message.listener = listener;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(5)));
        }

        @Override // org.chromium.blink.mojom.MediaDevicesDispatcherHost
        public void setCaptureHandleConfig(CaptureHandleConfig config) {
            MediaDevicesDispatcherHostSetCaptureHandleConfigParams _message = new MediaDevicesDispatcherHostSetCaptureHandleConfigParams();
            _message.config = config;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(6)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<MediaDevicesDispatcherHost> {
        Stub(Core core, MediaDevicesDispatcherHost impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(MediaDevicesDispatcherHost_Internal.MANAGER, messageWithHeader);
                    case 5:
                        MediaDevicesDispatcherHostAddMediaDevicesListenerParams data = MediaDevicesDispatcherHostAddMediaDevicesListenerParams.deserialize(messageWithHeader.getPayload());
                        getImpl().addMediaDevicesListener(data.subscribeAudioInput, data.subscribeVideoInput, data.subscribeAudioOutput, data.listener);
                        return true;
                    case 6:
                        getImpl().setCaptureHandleConfig(MediaDevicesDispatcherHostSetCaptureHandleConfigParams.deserialize(messageWithHeader.getPayload()).config);
                        return true;
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), MediaDevicesDispatcherHost_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        MediaDevicesDispatcherHostEnumerateDevicesParams data = MediaDevicesDispatcherHostEnumerateDevicesParams.deserialize(messageWithHeader.getPayload());
                        getImpl().enumerateDevices(data.requestAudioInput, data.requestVideoInput, data.requestAudioOutput, data.requestVideoInputCapabilities, data.requestAudioInputCapabilities, new MediaDevicesDispatcherHostEnumerateDevicesResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 1:
                        MediaDevicesDispatcherHostGetVideoInputCapabilitiesParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getVideoInputCapabilities(new MediaDevicesDispatcherHostGetVideoInputCapabilitiesResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 2:
                        getImpl().getAllVideoInputDeviceFormats(MediaDevicesDispatcherHostGetAllVideoInputDeviceFormatsParams.deserialize(messageWithHeader.getPayload()).deviceId, new MediaDevicesDispatcherHostGetAllVideoInputDeviceFormatsResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 3:
                        getImpl().getAvailableVideoInputDeviceFormats(MediaDevicesDispatcherHostGetAvailableVideoInputDeviceFormatsParams.deserialize(messageWithHeader.getPayload()).deviceId, new MediaDevicesDispatcherHostGetAvailableVideoInputDeviceFormatsResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 4:
                        MediaDevicesDispatcherHostGetAudioInputCapabilitiesParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getAudioInputCapabilities(new MediaDevicesDispatcherHostGetAudioInputCapabilitiesResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class MediaDevicesDispatcherHostEnumerateDevicesParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean requestAudioInput;
        public boolean requestAudioInputCapabilities;
        public boolean requestAudioOutput;
        public boolean requestVideoInput;
        public boolean requestVideoInputCapabilities;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaDevicesDispatcherHostEnumerateDevicesParams(int version) {
            super(16, version);
        }

        public MediaDevicesDispatcherHostEnumerateDevicesParams() {
            this(0);
        }

        public static MediaDevicesDispatcherHostEnumerateDevicesParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaDevicesDispatcherHostEnumerateDevicesParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaDevicesDispatcherHostEnumerateDevicesParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaDevicesDispatcherHostEnumerateDevicesParams result = new MediaDevicesDispatcherHostEnumerateDevicesParams(elementsOrVersion);
                result.requestAudioInput = decoder0.readBoolean(8, 0);
                result.requestVideoInput = decoder0.readBoolean(8, 1);
                result.requestAudioOutput = decoder0.readBoolean(8, 2);
                result.requestVideoInputCapabilities = decoder0.readBoolean(8, 3);
                result.requestAudioInputCapabilities = decoder0.readBoolean(8, 4);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.requestAudioInput, 8, 0);
            encoder0.encode(this.requestVideoInput, 8, 1);
            encoder0.encode(this.requestAudioOutput, 8, 2);
            encoder0.encode(this.requestVideoInputCapabilities, 8, 3);
            encoder0.encode(this.requestAudioInputCapabilities, 8, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class MediaDevicesDispatcherHostEnumerateDevicesResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public AudioInputDeviceCapabilities[] audioInputDeviceCapabilities;
        public MediaDeviceInfo[][] enumeration;
        public VideoInputDeviceCapabilities[] videoInputDeviceCapabilities;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaDevicesDispatcherHostEnumerateDevicesResponseParams(int version) {
            super(32, version);
        }

        public MediaDevicesDispatcherHostEnumerateDevicesResponseParams() {
            this(0);
        }

        public static MediaDevicesDispatcherHostEnumerateDevicesResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaDevicesDispatcherHostEnumerateDevicesResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaDevicesDispatcherHostEnumerateDevicesResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaDevicesDispatcherHostEnumerateDevicesResponseParams result = new MediaDevicesDispatcherHostEnumerateDevicesResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.enumeration = new MediaDeviceInfo[si1.elementsOrVersion][];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    DataHeader si2 = decoder2.readDataHeaderForPointerArray(-1);
                    result.enumeration[i1] = new MediaDeviceInfo[si2.elementsOrVersion];
                    for (int i2 = 0; i2 < si2.elementsOrVersion; i2++) {
                        Decoder decoder3 = decoder2.readPointer((i2 * 8) + 8, false);
                        result.enumeration[i1][i2] = MediaDeviceInfo.decode(decoder3);
                    }
                }
                Decoder decoder12 = decoder0.readPointer(16, false);
                DataHeader si12 = decoder12.readDataHeaderForPointerArray(-1);
                result.videoInputDeviceCapabilities = new VideoInputDeviceCapabilities[si12.elementsOrVersion];
                for (int i12 = 0; i12 < si12.elementsOrVersion; i12++) {
                    Decoder decoder22 = decoder12.readPointer((i12 * 8) + 8, false);
                    result.videoInputDeviceCapabilities[i12] = VideoInputDeviceCapabilities.decode(decoder22);
                }
                Decoder decoder13 = decoder0.readPointer(24, false);
                DataHeader si13 = decoder13.readDataHeaderForPointerArray(-1);
                result.audioInputDeviceCapabilities = new AudioInputDeviceCapabilities[si13.elementsOrVersion];
                for (int i13 = 0; i13 < si13.elementsOrVersion; i13++) {
                    Decoder decoder23 = decoder13.readPointer((i13 * 8) + 8, false);
                    result.audioInputDeviceCapabilities[i13] = AudioInputDeviceCapabilities.decode(decoder23);
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
            MediaDeviceInfo[][] mediaDeviceInfoArr = this.enumeration;
            if (mediaDeviceInfoArr == null) {
                encoder0.encodeNullPointer(8, false);
            } else {
                Encoder encoder1 = encoder0.encodePointerArray(mediaDeviceInfoArr.length, 8, -1);
                int i0 = 0;
                while (true) {
                    MediaDeviceInfo[][] mediaDeviceInfoArr2 = this.enumeration;
                    if (i0 >= mediaDeviceInfoArr2.length) {
                        break;
                    }
                    if (mediaDeviceInfoArr2[i0] == null) {
                        encoder1.encodeNullPointer((i0 * 8) + 8, false);
                    } else {
                        Encoder encoder2 = encoder1.encodePointerArray(mediaDeviceInfoArr2[i0].length, (i0 * 8) + 8, -1);
                        int i1 = 0;
                        while (true) {
                            MediaDeviceInfo[][] mediaDeviceInfoArr3 = this.enumeration;
                            if (i1 < mediaDeviceInfoArr3[i0].length) {
                                encoder2.encode((Struct) mediaDeviceInfoArr3[i0][i1], (i1 * 8) + 8, false);
                                i1++;
                            }
                        }
                    }
                    i0++;
                }
            }
            VideoInputDeviceCapabilities[] videoInputDeviceCapabilitiesArr = this.videoInputDeviceCapabilities;
            if (videoInputDeviceCapabilitiesArr == null) {
                encoder0.encodeNullPointer(16, false);
            } else {
                Encoder encoder12 = encoder0.encodePointerArray(videoInputDeviceCapabilitiesArr.length, 16, -1);
                int i02 = 0;
                while (true) {
                    VideoInputDeviceCapabilities[] videoInputDeviceCapabilitiesArr2 = this.videoInputDeviceCapabilities;
                    if (i02 >= videoInputDeviceCapabilitiesArr2.length) {
                        break;
                    }
                    encoder12.encode((Struct) videoInputDeviceCapabilitiesArr2[i02], (i02 * 8) + 8, false);
                    i02++;
                }
            }
            AudioInputDeviceCapabilities[] audioInputDeviceCapabilitiesArr = this.audioInputDeviceCapabilities;
            if (audioInputDeviceCapabilitiesArr == null) {
                encoder0.encodeNullPointer(24, false);
                return;
            }
            Encoder encoder13 = encoder0.encodePointerArray(audioInputDeviceCapabilitiesArr.length, 24, -1);
            int i03 = 0;
            while (true) {
                AudioInputDeviceCapabilities[] audioInputDeviceCapabilitiesArr2 = this.audioInputDeviceCapabilities;
                if (i03 < audioInputDeviceCapabilitiesArr2.length) {
                    encoder13.encode((Struct) audioInputDeviceCapabilitiesArr2[i03], (i03 * 8) + 8, false);
                    i03++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static class MediaDevicesDispatcherHostEnumerateDevicesResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final MediaDevicesDispatcherHost.EnumerateDevicesResponse mCallback;

        MediaDevicesDispatcherHostEnumerateDevicesResponseParamsForwardToCallback(MediaDevicesDispatcherHost.EnumerateDevicesResponse callback) {
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
                MediaDevicesDispatcherHostEnumerateDevicesResponseParams response = MediaDevicesDispatcherHostEnumerateDevicesResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.enumeration, response.videoInputDeviceCapabilities, response.audioInputDeviceCapabilities);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class MediaDevicesDispatcherHostEnumerateDevicesResponseParamsProxyToResponder implements MediaDevicesDispatcherHost.EnumerateDevicesResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        MediaDevicesDispatcherHostEnumerateDevicesResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback3
        public void call(MediaDeviceInfo[][] enumeration, VideoInputDeviceCapabilities[] videoInputDeviceCapabilities, AudioInputDeviceCapabilities[] audioInputDeviceCapabilities) {
            MediaDevicesDispatcherHostEnumerateDevicesResponseParams _response = new MediaDevicesDispatcherHostEnumerateDevicesResponseParams();
            _response.enumeration = enumeration;
            _response.videoInputDeviceCapabilities = videoInputDeviceCapabilities;
            _response.audioInputDeviceCapabilities = audioInputDeviceCapabilities;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class MediaDevicesDispatcherHostGetVideoInputCapabilitiesParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaDevicesDispatcherHostGetVideoInputCapabilitiesParams(int version) {
            super(8, version);
        }

        public MediaDevicesDispatcherHostGetVideoInputCapabilitiesParams() {
            this(0);
        }

        public static MediaDevicesDispatcherHostGetVideoInputCapabilitiesParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaDevicesDispatcherHostGetVideoInputCapabilitiesParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaDevicesDispatcherHostGetVideoInputCapabilitiesParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaDevicesDispatcherHostGetVideoInputCapabilitiesParams result = new MediaDevicesDispatcherHostGetVideoInputCapabilitiesParams(elementsOrVersion);
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
    public static final class MediaDevicesDispatcherHostGetVideoInputCapabilitiesResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public VideoInputDeviceCapabilities[] videoInputDeviceCapabilities;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaDevicesDispatcherHostGetVideoInputCapabilitiesResponseParams(int version) {
            super(16, version);
        }

        public MediaDevicesDispatcherHostGetVideoInputCapabilitiesResponseParams() {
            this(0);
        }

        public static MediaDevicesDispatcherHostGetVideoInputCapabilitiesResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaDevicesDispatcherHostGetVideoInputCapabilitiesResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaDevicesDispatcherHostGetVideoInputCapabilitiesResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaDevicesDispatcherHostGetVideoInputCapabilitiesResponseParams result = new MediaDevicesDispatcherHostGetVideoInputCapabilitiesResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.videoInputDeviceCapabilities = new VideoInputDeviceCapabilities[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.videoInputDeviceCapabilities[i1] = VideoInputDeviceCapabilities.decode(decoder2);
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
            VideoInputDeviceCapabilities[] videoInputDeviceCapabilitiesArr = this.videoInputDeviceCapabilities;
            if (videoInputDeviceCapabilitiesArr == null) {
                encoder0.encodeNullPointer(8, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(videoInputDeviceCapabilitiesArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                VideoInputDeviceCapabilities[] videoInputDeviceCapabilitiesArr2 = this.videoInputDeviceCapabilities;
                if (i0 < videoInputDeviceCapabilitiesArr2.length) {
                    encoder1.encode((Struct) videoInputDeviceCapabilitiesArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static class MediaDevicesDispatcherHostGetVideoInputCapabilitiesResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final MediaDevicesDispatcherHost.GetVideoInputCapabilitiesResponse mCallback;

        MediaDevicesDispatcherHostGetVideoInputCapabilitiesResponseParamsForwardToCallback(MediaDevicesDispatcherHost.GetVideoInputCapabilitiesResponse callback) {
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
                MediaDevicesDispatcherHostGetVideoInputCapabilitiesResponseParams response = MediaDevicesDispatcherHostGetVideoInputCapabilitiesResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.videoInputDeviceCapabilities);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class MediaDevicesDispatcherHostGetVideoInputCapabilitiesResponseParamsProxyToResponder implements MediaDevicesDispatcherHost.GetVideoInputCapabilitiesResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        MediaDevicesDispatcherHostGetVideoInputCapabilitiesResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(VideoInputDeviceCapabilities[] videoInputDeviceCapabilities) {
            MediaDevicesDispatcherHostGetVideoInputCapabilitiesResponseParams _response = new MediaDevicesDispatcherHostGetVideoInputCapabilitiesResponseParams();
            _response.videoInputDeviceCapabilities = videoInputDeviceCapabilities;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(1, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class MediaDevicesDispatcherHostGetAllVideoInputDeviceFormatsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public String deviceId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaDevicesDispatcherHostGetAllVideoInputDeviceFormatsParams(int version) {
            super(16, version);
        }

        public MediaDevicesDispatcherHostGetAllVideoInputDeviceFormatsParams() {
            this(0);
        }

        public static MediaDevicesDispatcherHostGetAllVideoInputDeviceFormatsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaDevicesDispatcherHostGetAllVideoInputDeviceFormatsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaDevicesDispatcherHostGetAllVideoInputDeviceFormatsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaDevicesDispatcherHostGetAllVideoInputDeviceFormatsParams result = new MediaDevicesDispatcherHostGetAllVideoInputDeviceFormatsParams(elementsOrVersion);
                result.deviceId = decoder0.readString(8, false);
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
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class MediaDevicesDispatcherHostGetAllVideoInputDeviceFormatsResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public VideoCaptureFormat[] formats;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaDevicesDispatcherHostGetAllVideoInputDeviceFormatsResponseParams(int version) {
            super(16, version);
        }

        public MediaDevicesDispatcherHostGetAllVideoInputDeviceFormatsResponseParams() {
            this(0);
        }

        public static MediaDevicesDispatcherHostGetAllVideoInputDeviceFormatsResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaDevicesDispatcherHostGetAllVideoInputDeviceFormatsResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaDevicesDispatcherHostGetAllVideoInputDeviceFormatsResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaDevicesDispatcherHostGetAllVideoInputDeviceFormatsResponseParams result = new MediaDevicesDispatcherHostGetAllVideoInputDeviceFormatsResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.formats = new VideoCaptureFormat[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.formats[i1] = VideoCaptureFormat.decode(decoder2);
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
            VideoCaptureFormat[] videoCaptureFormatArr = this.formats;
            if (videoCaptureFormatArr == null) {
                encoder0.encodeNullPointer(8, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(videoCaptureFormatArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                VideoCaptureFormat[] videoCaptureFormatArr2 = this.formats;
                if (i0 < videoCaptureFormatArr2.length) {
                    encoder1.encode((Struct) videoCaptureFormatArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static class MediaDevicesDispatcherHostGetAllVideoInputDeviceFormatsResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final MediaDevicesDispatcherHost.GetAllVideoInputDeviceFormatsResponse mCallback;

        MediaDevicesDispatcherHostGetAllVideoInputDeviceFormatsResponseParamsForwardToCallback(MediaDevicesDispatcherHost.GetAllVideoInputDeviceFormatsResponse callback) {
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
                MediaDevicesDispatcherHostGetAllVideoInputDeviceFormatsResponseParams response = MediaDevicesDispatcherHostGetAllVideoInputDeviceFormatsResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.formats);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class MediaDevicesDispatcherHostGetAllVideoInputDeviceFormatsResponseParamsProxyToResponder implements MediaDevicesDispatcherHost.GetAllVideoInputDeviceFormatsResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        MediaDevicesDispatcherHostGetAllVideoInputDeviceFormatsResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(VideoCaptureFormat[] formats) {
            MediaDevicesDispatcherHostGetAllVideoInputDeviceFormatsResponseParams _response = new MediaDevicesDispatcherHostGetAllVideoInputDeviceFormatsResponseParams();
            _response.formats = formats;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(2, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class MediaDevicesDispatcherHostGetAvailableVideoInputDeviceFormatsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public String deviceId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaDevicesDispatcherHostGetAvailableVideoInputDeviceFormatsParams(int version) {
            super(16, version);
        }

        public MediaDevicesDispatcherHostGetAvailableVideoInputDeviceFormatsParams() {
            this(0);
        }

        public static MediaDevicesDispatcherHostGetAvailableVideoInputDeviceFormatsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaDevicesDispatcherHostGetAvailableVideoInputDeviceFormatsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaDevicesDispatcherHostGetAvailableVideoInputDeviceFormatsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaDevicesDispatcherHostGetAvailableVideoInputDeviceFormatsParams result = new MediaDevicesDispatcherHostGetAvailableVideoInputDeviceFormatsParams(elementsOrVersion);
                result.deviceId = decoder0.readString(8, false);
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
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class MediaDevicesDispatcherHostGetAvailableVideoInputDeviceFormatsResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public VideoCaptureFormat[] formats;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaDevicesDispatcherHostGetAvailableVideoInputDeviceFormatsResponseParams(int version) {
            super(16, version);
        }

        public MediaDevicesDispatcherHostGetAvailableVideoInputDeviceFormatsResponseParams() {
            this(0);
        }

        public static MediaDevicesDispatcherHostGetAvailableVideoInputDeviceFormatsResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaDevicesDispatcherHostGetAvailableVideoInputDeviceFormatsResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaDevicesDispatcherHostGetAvailableVideoInputDeviceFormatsResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaDevicesDispatcherHostGetAvailableVideoInputDeviceFormatsResponseParams result = new MediaDevicesDispatcherHostGetAvailableVideoInputDeviceFormatsResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.formats = new VideoCaptureFormat[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.formats[i1] = VideoCaptureFormat.decode(decoder2);
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
            VideoCaptureFormat[] videoCaptureFormatArr = this.formats;
            if (videoCaptureFormatArr == null) {
                encoder0.encodeNullPointer(8, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(videoCaptureFormatArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                VideoCaptureFormat[] videoCaptureFormatArr2 = this.formats;
                if (i0 < videoCaptureFormatArr2.length) {
                    encoder1.encode((Struct) videoCaptureFormatArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static class MediaDevicesDispatcherHostGetAvailableVideoInputDeviceFormatsResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final MediaDevicesDispatcherHost.GetAvailableVideoInputDeviceFormatsResponse mCallback;

        MediaDevicesDispatcherHostGetAvailableVideoInputDeviceFormatsResponseParamsForwardToCallback(MediaDevicesDispatcherHost.GetAvailableVideoInputDeviceFormatsResponse callback) {
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
                MediaDevicesDispatcherHostGetAvailableVideoInputDeviceFormatsResponseParams response = MediaDevicesDispatcherHostGetAvailableVideoInputDeviceFormatsResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.formats);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class MediaDevicesDispatcherHostGetAvailableVideoInputDeviceFormatsResponseParamsProxyToResponder implements MediaDevicesDispatcherHost.GetAvailableVideoInputDeviceFormatsResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        MediaDevicesDispatcherHostGetAvailableVideoInputDeviceFormatsResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(VideoCaptureFormat[] formats) {
            MediaDevicesDispatcherHostGetAvailableVideoInputDeviceFormatsResponseParams _response = new MediaDevicesDispatcherHostGetAvailableVideoInputDeviceFormatsResponseParams();
            _response.formats = formats;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(3, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class MediaDevicesDispatcherHostGetAudioInputCapabilitiesParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaDevicesDispatcherHostGetAudioInputCapabilitiesParams(int version) {
            super(8, version);
        }

        public MediaDevicesDispatcherHostGetAudioInputCapabilitiesParams() {
            this(0);
        }

        public static MediaDevicesDispatcherHostGetAudioInputCapabilitiesParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaDevicesDispatcherHostGetAudioInputCapabilitiesParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaDevicesDispatcherHostGetAudioInputCapabilitiesParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaDevicesDispatcherHostGetAudioInputCapabilitiesParams result = new MediaDevicesDispatcherHostGetAudioInputCapabilitiesParams(elementsOrVersion);
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
    public static final class MediaDevicesDispatcherHostGetAudioInputCapabilitiesResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public AudioInputDeviceCapabilities[] audioInputDeviceCapabilities;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaDevicesDispatcherHostGetAudioInputCapabilitiesResponseParams(int version) {
            super(16, version);
        }

        public MediaDevicesDispatcherHostGetAudioInputCapabilitiesResponseParams() {
            this(0);
        }

        public static MediaDevicesDispatcherHostGetAudioInputCapabilitiesResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaDevicesDispatcherHostGetAudioInputCapabilitiesResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaDevicesDispatcherHostGetAudioInputCapabilitiesResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaDevicesDispatcherHostGetAudioInputCapabilitiesResponseParams result = new MediaDevicesDispatcherHostGetAudioInputCapabilitiesResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.audioInputDeviceCapabilities = new AudioInputDeviceCapabilities[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.audioInputDeviceCapabilities[i1] = AudioInputDeviceCapabilities.decode(decoder2);
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
            AudioInputDeviceCapabilities[] audioInputDeviceCapabilitiesArr = this.audioInputDeviceCapabilities;
            if (audioInputDeviceCapabilitiesArr == null) {
                encoder0.encodeNullPointer(8, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(audioInputDeviceCapabilitiesArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                AudioInputDeviceCapabilities[] audioInputDeviceCapabilitiesArr2 = this.audioInputDeviceCapabilities;
                if (i0 < audioInputDeviceCapabilitiesArr2.length) {
                    encoder1.encode((Struct) audioInputDeviceCapabilitiesArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static class MediaDevicesDispatcherHostGetAudioInputCapabilitiesResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final MediaDevicesDispatcherHost.GetAudioInputCapabilitiesResponse mCallback;

        MediaDevicesDispatcherHostGetAudioInputCapabilitiesResponseParamsForwardToCallback(MediaDevicesDispatcherHost.GetAudioInputCapabilitiesResponse callback) {
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
                MediaDevicesDispatcherHostGetAudioInputCapabilitiesResponseParams response = MediaDevicesDispatcherHostGetAudioInputCapabilitiesResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.audioInputDeviceCapabilities);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class MediaDevicesDispatcherHostGetAudioInputCapabilitiesResponseParamsProxyToResponder implements MediaDevicesDispatcherHost.GetAudioInputCapabilitiesResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        MediaDevicesDispatcherHostGetAudioInputCapabilitiesResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(AudioInputDeviceCapabilities[] audioInputDeviceCapabilities) {
            MediaDevicesDispatcherHostGetAudioInputCapabilitiesResponseParams _response = new MediaDevicesDispatcherHostGetAudioInputCapabilitiesResponseParams();
            _response.audioInputDeviceCapabilities = audioInputDeviceCapabilities;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(4, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class MediaDevicesDispatcherHostAddMediaDevicesListenerParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public MediaDevicesListener listener;
        public boolean subscribeAudioInput;
        public boolean subscribeAudioOutput;
        public boolean subscribeVideoInput;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaDevicesDispatcherHostAddMediaDevicesListenerParams(int version) {
            super(24, version);
        }

        public MediaDevicesDispatcherHostAddMediaDevicesListenerParams() {
            this(0);
        }

        public static MediaDevicesDispatcherHostAddMediaDevicesListenerParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaDevicesDispatcherHostAddMediaDevicesListenerParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaDevicesDispatcherHostAddMediaDevicesListenerParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaDevicesDispatcherHostAddMediaDevicesListenerParams result = new MediaDevicesDispatcherHostAddMediaDevicesListenerParams(elementsOrVersion);
                result.subscribeAudioInput = decoder0.readBoolean(8, 0);
                result.subscribeVideoInput = decoder0.readBoolean(8, 1);
                result.subscribeAudioOutput = decoder0.readBoolean(8, 2);
                result.listener = (MediaDevicesListener) decoder0.readServiceInterface(12, false, MediaDevicesListener.MANAGER);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.subscribeAudioInput, 8, 0);
            encoder0.encode(this.subscribeVideoInput, 8, 1);
            encoder0.encode(this.subscribeAudioOutput, 8, 2);
            encoder0.encode(this.listener, 12, false, MediaDevicesListener.MANAGER);
        }
    }

    /* loaded from: classes2.dex */
    static final class MediaDevicesDispatcherHostSetCaptureHandleConfigParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public CaptureHandleConfig config;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaDevicesDispatcherHostSetCaptureHandleConfigParams(int version) {
            super(16, version);
        }

        public MediaDevicesDispatcherHostSetCaptureHandleConfigParams() {
            this(0);
        }

        public static MediaDevicesDispatcherHostSetCaptureHandleConfigParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaDevicesDispatcherHostSetCaptureHandleConfigParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaDevicesDispatcherHostSetCaptureHandleConfigParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaDevicesDispatcherHostSetCaptureHandleConfigParams result = new MediaDevicesDispatcherHostSetCaptureHandleConfigParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.config = CaptureHandleConfig.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.config, 8, false);
        }
    }
}
