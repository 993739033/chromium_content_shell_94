package org.chromium.media.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.media.learning.mojom.LearningTaskController;
import org.chromium.media.mojom.MediaMetricsProvider;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.DeserializationException;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceControlMessagesHelper;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.MessageHeader;
import org.chromium.mojo.bindings.MessageReceiver;
import org.chromium.mojo.bindings.MessageReceiverWithResponder;
import org.chromium.mojo.bindings.ServiceMessage;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo.system.Core;
import org.chromium.mojo_base.mojom.TimeDelta;
/* loaded from: classes2.dex */
class MediaMetricsProvider_Internal {
    private static final int ACQUIRE_LEARNING_TASK_CONTROLLER_ORDINAL = 14;
    private static final int ACQUIRE_PLAYBACK_EVENTS_RECORDER_ORDINAL = 15;
    private static final int ACQUIRE_VIDEO_DECODE_STATS_RECORDER_ORDINAL = 13;
    private static final int ACQUIRE_WATCH_TIME_RECORDER_ORDINAL = 12;
    private static final int INITIALIZE_ORDINAL = 0;
    public static final Interface.Manager<MediaMetricsProvider, MediaMetricsProvider.Proxy> MANAGER = new Interface.Manager<MediaMetricsProvider, MediaMetricsProvider.Proxy>() { // from class: org.chromium.media.mojom.MediaMetricsProvider_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "media.mojom.MediaMetricsProvider";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public MediaMetricsProvider.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, MediaMetricsProvider impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public MediaMetricsProvider[] buildArray(int size) {
            return new MediaMetricsProvider[size];
        }
    };
    private static final int ON_ERROR_ORDINAL = 1;
    private static final int SET_AUDIO_PIPELINE_INFO_ORDINAL = 19;
    private static final int SET_CONTAINER_NAME_ORDINAL = 11;
    private static final int SET_HAS_AUDIO_ORDINAL = 16;
    private static final int SET_HAS_PLAYED_ORDINAL = 2;
    private static final int SET_HAS_VIDEO_ORDINAL = 17;
    private static final int SET_HAVE_ENOUGH_ORDINAL = 3;
    private static final int SET_IS_EME_ORDINAL = 4;
    private static final int SET_IS_HARDWARE_SECURE_ORDINAL = 10;
    private static final int SET_KEY_SYSTEM_ORDINAL = 9;
    private static final int SET_RENDERER_TYPE_ORDINAL = 8;
    private static final int SET_TIME_TO_FIRST_FRAME_ORDINAL = 6;
    private static final int SET_TIME_TO_METADATA_ORDINAL = 5;
    private static final int SET_TIME_TO_PLAY_READY_ORDINAL = 7;
    private static final int SET_VIDEO_PIPELINE_INFO_ORDINAL = 18;

    MediaMetricsProvider_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements MediaMetricsProvider.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.media.mojom.MediaMetricsProvider
        public void initialize(boolean isMse, int urlScheme, int streamType) {
            MediaMetricsProviderInitializeParams _message = new MediaMetricsProviderInitializeParams();
            _message.isMse = isMse;
            _message.urlScheme = urlScheme;
            _message.streamType = streamType;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }

        @Override // org.chromium.media.mojom.MediaMetricsProvider
        public void onError(int status) {
            MediaMetricsProviderOnErrorParams _message = new MediaMetricsProviderOnErrorParams();
            _message.status = status;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1)));
        }

        @Override // org.chromium.media.mojom.MediaMetricsProvider
        public void setHasPlayed() {
            MediaMetricsProviderSetHasPlayedParams _message = new MediaMetricsProviderSetHasPlayedParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2)));
        }

        @Override // org.chromium.media.mojom.MediaMetricsProvider
        public void setHaveEnough() {
            MediaMetricsProviderSetHaveEnoughParams _message = new MediaMetricsProviderSetHaveEnoughParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3)));
        }

        @Override // org.chromium.media.mojom.MediaMetricsProvider
        public void setIsEme() {
            MediaMetricsProviderSetIsEmeParams _message = new MediaMetricsProviderSetIsEmeParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(4)));
        }

        @Override // org.chromium.media.mojom.MediaMetricsProvider
        public void setTimeToMetadata(TimeDelta elapsed) {
            MediaMetricsProviderSetTimeToMetadataParams _message = new MediaMetricsProviderSetTimeToMetadataParams();
            _message.elapsed = elapsed;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(5)));
        }

        @Override // org.chromium.media.mojom.MediaMetricsProvider
        public void setTimeToFirstFrame(TimeDelta elapsed) {
            MediaMetricsProviderSetTimeToFirstFrameParams _message = new MediaMetricsProviderSetTimeToFirstFrameParams();
            _message.elapsed = elapsed;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(6)));
        }

        @Override // org.chromium.media.mojom.MediaMetricsProvider
        public void setTimeToPlayReady(TimeDelta elapsed) {
            MediaMetricsProviderSetTimeToPlayReadyParams _message = new MediaMetricsProviderSetTimeToPlayReadyParams();
            _message.elapsed = elapsed;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(7)));
        }

        @Override // org.chromium.media.mojom.MediaMetricsProvider
        public void setRendererType(int rendererType) {
            MediaMetricsProviderSetRendererTypeParams _message = new MediaMetricsProviderSetRendererTypeParams();
            _message.rendererType = rendererType;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(8)));
        }

        @Override // org.chromium.media.mojom.MediaMetricsProvider
        public void setKeySystem(String keySystem) {
            MediaMetricsProviderSetKeySystemParams _message = new MediaMetricsProviderSetKeySystemParams();
            _message.keySystem = keySystem;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(9)));
        }

        @Override // org.chromium.media.mojom.MediaMetricsProvider
        public void setIsHardwareSecure() {
            MediaMetricsProviderSetIsHardwareSecureParams _message = new MediaMetricsProviderSetIsHardwareSecureParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(10)));
        }

        @Override // org.chromium.media.mojom.MediaMetricsProvider
        public void setContainerName(int containerName) {
            MediaMetricsProviderSetContainerNameParams _message = new MediaMetricsProviderSetContainerNameParams();
            _message.containerName = containerName;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(11)));
        }

        @Override // org.chromium.media.mojom.MediaMetricsProvider
        public void acquireWatchTimeRecorder(PlaybackProperties properties, InterfaceRequest<WatchTimeRecorder> recorder) {
            MediaMetricsProviderAcquireWatchTimeRecorderParams _message = new MediaMetricsProviderAcquireWatchTimeRecorderParams();
            _message.properties = properties;
            _message.recorder = recorder;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(12)));
        }

        @Override // org.chromium.media.mojom.MediaMetricsProvider
        public void acquireVideoDecodeStatsRecorder(InterfaceRequest<VideoDecodeStatsRecorder> recorder) {
            MediaMetricsProviderAcquireVideoDecodeStatsRecorderParams _message = new MediaMetricsProviderAcquireVideoDecodeStatsRecorderParams();
            _message.recorder = recorder;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(13)));
        }

        @Override // org.chromium.media.mojom.MediaMetricsProvider
        public void acquireLearningTaskController(String taskName, InterfaceRequest<LearningTaskController> controller) {
            MediaMetricsProviderAcquireLearningTaskControllerParams _message = new MediaMetricsProviderAcquireLearningTaskControllerParams();
            _message.taskName = taskName;
            _message.controller = controller;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(14)));
        }

        @Override // org.chromium.media.mojom.MediaMetricsProvider
        public void acquirePlaybackEventsRecorder(InterfaceRequest<PlaybackEventsRecorder> receiver) {
            MediaMetricsProviderAcquirePlaybackEventsRecorderParams _message = new MediaMetricsProviderAcquirePlaybackEventsRecorderParams();
            _message.receiver = receiver;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(15)));
        }

        @Override // org.chromium.media.mojom.MediaMetricsProvider
        public void setHasAudio(int codec) {
            MediaMetricsProviderSetHasAudioParams _message = new MediaMetricsProviderSetHasAudioParams();
            _message.codec = codec;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(16)));
        }

        @Override // org.chromium.media.mojom.MediaMetricsProvider
        public void setHasVideo(int codec) {
            MediaMetricsProviderSetHasVideoParams _message = new MediaMetricsProviderSetHasVideoParams();
            _message.codec = codec;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(17)));
        }

        @Override // org.chromium.media.mojom.MediaMetricsProvider
        public void setVideoPipelineInfo(VideoPipelineInfo info) {
            MediaMetricsProviderSetVideoPipelineInfoParams _message = new MediaMetricsProviderSetVideoPipelineInfoParams();
            _message.info = info;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(18)));
        }

        @Override // org.chromium.media.mojom.MediaMetricsProvider
        public void setAudioPipelineInfo(AudioPipelineInfo info) {
            MediaMetricsProviderSetAudioPipelineInfoParams _message = new MediaMetricsProviderSetAudioPipelineInfoParams();
            _message.info = info;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(19)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<MediaMetricsProvider> {
        Stub(Core core, MediaMetricsProvider impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(MediaMetricsProvider_Internal.MANAGER, messageWithHeader);
                    case -1:
                    default:
                        return false;
                    case 0:
                        MediaMetricsProviderInitializeParams data = MediaMetricsProviderInitializeParams.deserialize(messageWithHeader.getPayload());
                        getImpl().initialize(data.isMse, data.urlScheme, data.streamType);
                        return true;
                    case 1:
                        getImpl().onError(MediaMetricsProviderOnErrorParams.deserialize(messageWithHeader.getPayload()).status);
                        return true;
                    case 2:
                        MediaMetricsProviderSetHasPlayedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setHasPlayed();
                        return true;
                    case 3:
                        MediaMetricsProviderSetHaveEnoughParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setHaveEnough();
                        return true;
                    case 4:
                        MediaMetricsProviderSetIsEmeParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setIsEme();
                        return true;
                    case 5:
                        getImpl().setTimeToMetadata(MediaMetricsProviderSetTimeToMetadataParams.deserialize(messageWithHeader.getPayload()).elapsed);
                        return true;
                    case 6:
                        getImpl().setTimeToFirstFrame(MediaMetricsProviderSetTimeToFirstFrameParams.deserialize(messageWithHeader.getPayload()).elapsed);
                        return true;
                    case 7:
                        getImpl().setTimeToPlayReady(MediaMetricsProviderSetTimeToPlayReadyParams.deserialize(messageWithHeader.getPayload()).elapsed);
                        return true;
                    case 8:
                        getImpl().setRendererType(MediaMetricsProviderSetRendererTypeParams.deserialize(messageWithHeader.getPayload()).rendererType);
                        return true;
                    case 9:
                        getImpl().setKeySystem(MediaMetricsProviderSetKeySystemParams.deserialize(messageWithHeader.getPayload()).keySystem);
                        return true;
                    case 10:
                        MediaMetricsProviderSetIsHardwareSecureParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setIsHardwareSecure();
                        return true;
                    case 11:
                        getImpl().setContainerName(MediaMetricsProviderSetContainerNameParams.deserialize(messageWithHeader.getPayload()).containerName);
                        return true;
                    case 12:
                        MediaMetricsProviderAcquireWatchTimeRecorderParams data2 = MediaMetricsProviderAcquireWatchTimeRecorderParams.deserialize(messageWithHeader.getPayload());
                        getImpl().acquireWatchTimeRecorder(data2.properties, data2.recorder);
                        return true;
                    case 13:
                        getImpl().acquireVideoDecodeStatsRecorder(MediaMetricsProviderAcquireVideoDecodeStatsRecorderParams.deserialize(messageWithHeader.getPayload()).recorder);
                        return true;
                    case 14:
                        MediaMetricsProviderAcquireLearningTaskControllerParams data3 = MediaMetricsProviderAcquireLearningTaskControllerParams.deserialize(messageWithHeader.getPayload());
                        getImpl().acquireLearningTaskController(data3.taskName, data3.controller);
                        return true;
                    case 15:
                        getImpl().acquirePlaybackEventsRecorder(MediaMetricsProviderAcquirePlaybackEventsRecorderParams.deserialize(messageWithHeader.getPayload()).receiver);
                        return true;
                    case 16:
                        getImpl().setHasAudio(MediaMetricsProviderSetHasAudioParams.deserialize(messageWithHeader.getPayload()).codec);
                        return true;
                    case 17:
                        getImpl().setHasVideo(MediaMetricsProviderSetHasVideoParams.deserialize(messageWithHeader.getPayload()).codec);
                        return true;
                    case 18:
                        getImpl().setVideoPipelineInfo(MediaMetricsProviderSetVideoPipelineInfoParams.deserialize(messageWithHeader.getPayload()).info);
                        return true;
                    case 19:
                        getImpl().setAudioPipelineInfo(MediaMetricsProviderSetAudioPipelineInfoParams.deserialize(messageWithHeader.getPayload()).info);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), MediaMetricsProvider_Internal.MANAGER, messageWithHeader, receiver);
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
    static final class MediaMetricsProviderInitializeParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean isMse;
        public int streamType;
        public int urlScheme;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaMetricsProviderInitializeParams(int version) {
            super(24, version);
        }

        public MediaMetricsProviderInitializeParams() {
            this(0);
        }

        public static MediaMetricsProviderInitializeParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaMetricsProviderInitializeParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaMetricsProviderInitializeParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaMetricsProviderInitializeParams result = new MediaMetricsProviderInitializeParams(elementsOrVersion);
                result.isMse = decoder0.readBoolean(8, 0);
                int readInt = decoder0.readInt(12);
                result.urlScheme = readInt;
                MediaUrlScheme.validate(readInt);
                result.urlScheme = MediaUrlScheme.toKnownValue(result.urlScheme);
                int readInt2 = decoder0.readInt(16);
                result.streamType = readInt2;
                MediaStreamType.validate(readInt2);
                result.streamType = MediaStreamType.toKnownValue(result.streamType);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.isMse, 8, 0);
            encoder0.encode(this.urlScheme, 12);
            encoder0.encode(this.streamType, 16);
        }
    }

    /* loaded from: classes2.dex */
    static final class MediaMetricsProviderOnErrorParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaMetricsProviderOnErrorParams(int version) {
            super(16, version);
        }

        public MediaMetricsProviderOnErrorParams() {
            this(0);
        }

        public static MediaMetricsProviderOnErrorParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaMetricsProviderOnErrorParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaMetricsProviderOnErrorParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaMetricsProviderOnErrorParams result = new MediaMetricsProviderOnErrorParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.status = readInt;
                PipelineStatus.validate(readInt);
                result.status = PipelineStatus.toKnownValue(result.status);
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
    static final class MediaMetricsProviderSetHasPlayedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaMetricsProviderSetHasPlayedParams(int version) {
            super(8, version);
        }

        public MediaMetricsProviderSetHasPlayedParams() {
            this(0);
        }

        public static MediaMetricsProviderSetHasPlayedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaMetricsProviderSetHasPlayedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaMetricsProviderSetHasPlayedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaMetricsProviderSetHasPlayedParams result = new MediaMetricsProviderSetHasPlayedParams(elementsOrVersion);
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
    static final class MediaMetricsProviderSetHaveEnoughParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaMetricsProviderSetHaveEnoughParams(int version) {
            super(8, version);
        }

        public MediaMetricsProviderSetHaveEnoughParams() {
            this(0);
        }

        public static MediaMetricsProviderSetHaveEnoughParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaMetricsProviderSetHaveEnoughParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaMetricsProviderSetHaveEnoughParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaMetricsProviderSetHaveEnoughParams result = new MediaMetricsProviderSetHaveEnoughParams(elementsOrVersion);
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
    static final class MediaMetricsProviderSetIsEmeParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaMetricsProviderSetIsEmeParams(int version) {
            super(8, version);
        }

        public MediaMetricsProviderSetIsEmeParams() {
            this(0);
        }

        public static MediaMetricsProviderSetIsEmeParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaMetricsProviderSetIsEmeParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaMetricsProviderSetIsEmeParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaMetricsProviderSetIsEmeParams result = new MediaMetricsProviderSetIsEmeParams(elementsOrVersion);
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
    static final class MediaMetricsProviderSetTimeToMetadataParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public TimeDelta elapsed;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaMetricsProviderSetTimeToMetadataParams(int version) {
            super(16, version);
        }

        public MediaMetricsProviderSetTimeToMetadataParams() {
            this(0);
        }

        public static MediaMetricsProviderSetTimeToMetadataParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaMetricsProviderSetTimeToMetadataParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaMetricsProviderSetTimeToMetadataParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaMetricsProviderSetTimeToMetadataParams result = new MediaMetricsProviderSetTimeToMetadataParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.elapsed = TimeDelta.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.elapsed, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class MediaMetricsProviderSetTimeToFirstFrameParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public TimeDelta elapsed;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaMetricsProviderSetTimeToFirstFrameParams(int version) {
            super(16, version);
        }

        public MediaMetricsProviderSetTimeToFirstFrameParams() {
            this(0);
        }

        public static MediaMetricsProviderSetTimeToFirstFrameParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaMetricsProviderSetTimeToFirstFrameParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaMetricsProviderSetTimeToFirstFrameParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaMetricsProviderSetTimeToFirstFrameParams result = new MediaMetricsProviderSetTimeToFirstFrameParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.elapsed = TimeDelta.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.elapsed, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class MediaMetricsProviderSetTimeToPlayReadyParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public TimeDelta elapsed;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaMetricsProviderSetTimeToPlayReadyParams(int version) {
            super(16, version);
        }

        public MediaMetricsProviderSetTimeToPlayReadyParams() {
            this(0);
        }

        public static MediaMetricsProviderSetTimeToPlayReadyParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaMetricsProviderSetTimeToPlayReadyParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaMetricsProviderSetTimeToPlayReadyParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaMetricsProviderSetTimeToPlayReadyParams result = new MediaMetricsProviderSetTimeToPlayReadyParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.elapsed = TimeDelta.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.elapsed, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class MediaMetricsProviderSetRendererTypeParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int rendererType;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaMetricsProviderSetRendererTypeParams(int version) {
            super(16, version);
        }

        public MediaMetricsProviderSetRendererTypeParams() {
            this(0);
        }

        public static MediaMetricsProviderSetRendererTypeParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaMetricsProviderSetRendererTypeParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaMetricsProviderSetRendererTypeParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaMetricsProviderSetRendererTypeParams result = new MediaMetricsProviderSetRendererTypeParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.rendererType = readInt;
                RendererType.validate(readInt);
                result.rendererType = RendererType.toKnownValue(result.rendererType);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.rendererType, 8);
        }
    }

    /* loaded from: classes2.dex */
    static final class MediaMetricsProviderSetKeySystemParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public String keySystem;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaMetricsProviderSetKeySystemParams(int version) {
            super(16, version);
        }

        public MediaMetricsProviderSetKeySystemParams() {
            this(0);
        }

        public static MediaMetricsProviderSetKeySystemParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaMetricsProviderSetKeySystemParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaMetricsProviderSetKeySystemParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaMetricsProviderSetKeySystemParams result = new MediaMetricsProviderSetKeySystemParams(elementsOrVersion);
                result.keySystem = decoder0.readString(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.keySystem, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class MediaMetricsProviderSetIsHardwareSecureParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaMetricsProviderSetIsHardwareSecureParams(int version) {
            super(8, version);
        }

        public MediaMetricsProviderSetIsHardwareSecureParams() {
            this(0);
        }

        public static MediaMetricsProviderSetIsHardwareSecureParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaMetricsProviderSetIsHardwareSecureParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaMetricsProviderSetIsHardwareSecureParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaMetricsProviderSetIsHardwareSecureParams result = new MediaMetricsProviderSetIsHardwareSecureParams(elementsOrVersion);
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
    static final class MediaMetricsProviderSetContainerNameParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int containerName;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaMetricsProviderSetContainerNameParams(int version) {
            super(16, version);
        }

        public MediaMetricsProviderSetContainerNameParams() {
            this(0);
        }

        public static MediaMetricsProviderSetContainerNameParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaMetricsProviderSetContainerNameParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaMetricsProviderSetContainerNameParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaMetricsProviderSetContainerNameParams result = new MediaMetricsProviderSetContainerNameParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.containerName = readInt;
                MediaContainerName.validate(readInt);
                result.containerName = MediaContainerName.toKnownValue(result.containerName);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.containerName, 8);
        }
    }

    /* loaded from: classes2.dex */
    static final class MediaMetricsProviderAcquireWatchTimeRecorderParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public PlaybackProperties properties;
        public InterfaceRequest<WatchTimeRecorder> recorder;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaMetricsProviderAcquireWatchTimeRecorderParams(int version) {
            super(24, version);
        }

        public MediaMetricsProviderAcquireWatchTimeRecorderParams() {
            this(0);
        }

        public static MediaMetricsProviderAcquireWatchTimeRecorderParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaMetricsProviderAcquireWatchTimeRecorderParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaMetricsProviderAcquireWatchTimeRecorderParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaMetricsProviderAcquireWatchTimeRecorderParams result = new MediaMetricsProviderAcquireWatchTimeRecorderParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.properties = PlaybackProperties.decode(decoder1);
                result.recorder = decoder0.readInterfaceRequest(16, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.properties, 8, false);
            encoder0.encode((InterfaceRequest) this.recorder, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class MediaMetricsProviderAcquireVideoDecodeStatsRecorderParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public InterfaceRequest<VideoDecodeStatsRecorder> recorder;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaMetricsProviderAcquireVideoDecodeStatsRecorderParams(int version) {
            super(16, version);
        }

        public MediaMetricsProviderAcquireVideoDecodeStatsRecorderParams() {
            this(0);
        }

        public static MediaMetricsProviderAcquireVideoDecodeStatsRecorderParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaMetricsProviderAcquireVideoDecodeStatsRecorderParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaMetricsProviderAcquireVideoDecodeStatsRecorderParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaMetricsProviderAcquireVideoDecodeStatsRecorderParams result = new MediaMetricsProviderAcquireVideoDecodeStatsRecorderParams(elementsOrVersion);
                result.recorder = decoder0.readInterfaceRequest(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((InterfaceRequest) this.recorder, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class MediaMetricsProviderAcquireLearningTaskControllerParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public InterfaceRequest<LearningTaskController> controller;
        public String taskName;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaMetricsProviderAcquireLearningTaskControllerParams(int version) {
            super(24, version);
        }

        public MediaMetricsProviderAcquireLearningTaskControllerParams() {
            this(0);
        }

        public static MediaMetricsProviderAcquireLearningTaskControllerParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaMetricsProviderAcquireLearningTaskControllerParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaMetricsProviderAcquireLearningTaskControllerParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaMetricsProviderAcquireLearningTaskControllerParams result = new MediaMetricsProviderAcquireLearningTaskControllerParams(elementsOrVersion);
                result.taskName = decoder0.readString(8, false);
                result.controller = decoder0.readInterfaceRequest(16, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.taskName, 8, false);
            encoder0.encode((InterfaceRequest) this.controller, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class MediaMetricsProviderAcquirePlaybackEventsRecorderParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public InterfaceRequest<PlaybackEventsRecorder> receiver;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaMetricsProviderAcquirePlaybackEventsRecorderParams(int version) {
            super(16, version);
        }

        public MediaMetricsProviderAcquirePlaybackEventsRecorderParams() {
            this(0);
        }

        public static MediaMetricsProviderAcquirePlaybackEventsRecorderParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaMetricsProviderAcquirePlaybackEventsRecorderParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaMetricsProviderAcquirePlaybackEventsRecorderParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaMetricsProviderAcquirePlaybackEventsRecorderParams result = new MediaMetricsProviderAcquirePlaybackEventsRecorderParams(elementsOrVersion);
                result.receiver = decoder0.readInterfaceRequest(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((InterfaceRequest) this.receiver, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class MediaMetricsProviderSetHasAudioParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int codec;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaMetricsProviderSetHasAudioParams(int version) {
            super(16, version);
        }

        public MediaMetricsProviderSetHasAudioParams() {
            this(0);
        }

        public static MediaMetricsProviderSetHasAudioParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaMetricsProviderSetHasAudioParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaMetricsProviderSetHasAudioParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaMetricsProviderSetHasAudioParams result = new MediaMetricsProviderSetHasAudioParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.codec = readInt;
                AudioCodec.validate(readInt);
                result.codec = AudioCodec.toKnownValue(result.codec);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.codec, 8);
        }
    }

    /* loaded from: classes2.dex */
    static final class MediaMetricsProviderSetHasVideoParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int codec;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaMetricsProviderSetHasVideoParams(int version) {
            super(16, version);
        }

        public MediaMetricsProviderSetHasVideoParams() {
            this(0);
        }

        public static MediaMetricsProviderSetHasVideoParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaMetricsProviderSetHasVideoParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaMetricsProviderSetHasVideoParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaMetricsProviderSetHasVideoParams result = new MediaMetricsProviderSetHasVideoParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.codec = readInt;
                VideoCodec.validate(readInt);
                result.codec = VideoCodec.toKnownValue(result.codec);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.codec, 8);
        }
    }

    /* loaded from: classes2.dex */
    static final class MediaMetricsProviderSetVideoPipelineInfoParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public VideoPipelineInfo info;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaMetricsProviderSetVideoPipelineInfoParams(int version) {
            super(16, version);
        }

        public MediaMetricsProviderSetVideoPipelineInfoParams() {
            this(0);
        }

        public static MediaMetricsProviderSetVideoPipelineInfoParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaMetricsProviderSetVideoPipelineInfoParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaMetricsProviderSetVideoPipelineInfoParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaMetricsProviderSetVideoPipelineInfoParams result = new MediaMetricsProviderSetVideoPipelineInfoParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.info = VideoPipelineInfo.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.info, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class MediaMetricsProviderSetAudioPipelineInfoParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public AudioPipelineInfo info;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaMetricsProviderSetAudioPipelineInfoParams(int version) {
            super(16, version);
        }

        public MediaMetricsProviderSetAudioPipelineInfoParams() {
            this(0);
        }

        public static MediaMetricsProviderSetAudioPipelineInfoParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaMetricsProviderSetAudioPipelineInfoParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaMetricsProviderSetAudioPipelineInfoParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaMetricsProviderSetAudioPipelineInfoParams result = new MediaMetricsProviderSetAudioPipelineInfoParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.info = AudioPipelineInfo.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.info, 8, false);
        }
    }
}
