package org.chromium.media.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.gfx.mojom.Size;
import org.chromium.media.mojom.MediaPlayerObserver;
import org.chromium.media_session.mojom.MediaPosition;
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
class MediaPlayerObserver_Internal {
    public static final Interface.Manager<MediaPlayerObserver, MediaPlayerObserver.Proxy> MANAGER = new Interface.Manager<MediaPlayerObserver, MediaPlayerObserver.Proxy>() { // from class: org.chromium.media.mojom.MediaPlayerObserver_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "media.mojom.MediaPlayerObserver";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public MediaPlayerObserver.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, MediaPlayerObserver impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public MediaPlayerObserver[] buildArray(int size) {
            return new MediaPlayerObserver[size];
        }
    };
    private static final int ON_AUDIO_OUTPUT_SINK_CHANGED_ORDINAL = 8;
    private static final int ON_AUDIO_OUTPUT_SINK_CHANGING_DISABLED_ORDINAL = 10;
    private static final int ON_BUFFER_UNDERFLOW_ORDINAL = 11;
    private static final int ON_MEDIA_EFFECTIVELY_FULLSCREEN_CHANGED_ORDINAL = 5;
    private static final int ON_MEDIA_METADATA_CHANGED_ORDINAL = 3;
    private static final int ON_MEDIA_PAUSED_ORDINAL = 1;
    private static final int ON_MEDIA_PLAYING_ORDINAL = 0;
    private static final int ON_MEDIA_POSITION_STATE_CHANGED_ORDINAL = 4;
    private static final int ON_MEDIA_SIZE_CHANGED_ORDINAL = 6;
    private static final int ON_MUTED_STATUS_CHANGED_ORDINAL = 2;
    private static final int ON_PICTURE_IN_PICTURE_AVAILABILITY_CHANGED_ORDINAL = 7;
    private static final int ON_SEEK_ORDINAL = 12;
    private static final int ON_USE_AUDIO_SERVICE_CHANGED_ORDINAL = 9;

    MediaPlayerObserver_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements MediaPlayerObserver.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.media.mojom.MediaPlayerObserver
        public void onMediaPlaying() {
            MediaPlayerObserverOnMediaPlayingParams _message = new MediaPlayerObserverOnMediaPlayingParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }

        @Override // org.chromium.media.mojom.MediaPlayerObserver
        public void onMediaPaused(boolean streamEnded) {
            MediaPlayerObserverOnMediaPausedParams _message = new MediaPlayerObserverOnMediaPausedParams();
            _message.streamEnded = streamEnded;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1)));
        }

        @Override // org.chromium.media.mojom.MediaPlayerObserver
        public void onMutedStatusChanged(boolean muted) {
            MediaPlayerObserverOnMutedStatusChangedParams _message = new MediaPlayerObserverOnMutedStatusChangedParams();
            _message.muted = muted;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2)));
        }

        @Override // org.chromium.media.mojom.MediaPlayerObserver
        public void onMediaMetadataChanged(boolean hasAudio, boolean hasVideo, int contentType) {
            MediaPlayerObserverOnMediaMetadataChangedParams _message = new MediaPlayerObserverOnMediaMetadataChangedParams();
            _message.hasAudio = hasAudio;
            _message.hasVideo = hasVideo;
            _message.contentType = contentType;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3)));
        }

        @Override // org.chromium.media.mojom.MediaPlayerObserver
        public void onMediaPositionStateChanged(MediaPosition mediaPosition) {
            MediaPlayerObserverOnMediaPositionStateChangedParams _message = new MediaPlayerObserverOnMediaPositionStateChangedParams();
            _message.mediaPosition = mediaPosition;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(4)));
        }

        @Override // org.chromium.media.mojom.MediaPlayerObserver
        public void onMediaEffectivelyFullscreenChanged(int status) {
            MediaPlayerObserverOnMediaEffectivelyFullscreenChangedParams _message = new MediaPlayerObserverOnMediaEffectivelyFullscreenChangedParams();
            _message.status = status;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(5)));
        }

        @Override // org.chromium.media.mojom.MediaPlayerObserver
        public void onMediaSizeChanged(Size size) {
            MediaPlayerObserverOnMediaSizeChangedParams _message = new MediaPlayerObserverOnMediaSizeChangedParams();
            _message.size = size;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(6)));
        }

        @Override // org.chromium.media.mojom.MediaPlayerObserver
        public void onPictureInPictureAvailabilityChanged(boolean available) {
            MediaPlayerObserverOnPictureInPictureAvailabilityChangedParams _message = new MediaPlayerObserverOnPictureInPictureAvailabilityChangedParams();
            _message.available = available;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(7)));
        }

        @Override // org.chromium.media.mojom.MediaPlayerObserver
        public void onAudioOutputSinkChanged(String hashedDeviceId) {
            MediaPlayerObserverOnAudioOutputSinkChangedParams _message = new MediaPlayerObserverOnAudioOutputSinkChangedParams();
            _message.hashedDeviceId = hashedDeviceId;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(8)));
        }

        @Override // org.chromium.media.mojom.MediaPlayerObserver
        public void onUseAudioServiceChanged(boolean usesAudioService) {
            MediaPlayerObserverOnUseAudioServiceChangedParams _message = new MediaPlayerObserverOnUseAudioServiceChangedParams();
            _message.usesAudioService = usesAudioService;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(9)));
        }

        @Override // org.chromium.media.mojom.MediaPlayerObserver
        public void onAudioOutputSinkChangingDisabled() {
            MediaPlayerObserverOnAudioOutputSinkChangingDisabledParams _message = new MediaPlayerObserverOnAudioOutputSinkChangingDisabledParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(10)));
        }

        @Override // org.chromium.media.mojom.MediaPlayerObserver
        public void onBufferUnderflow() {
            MediaPlayerObserverOnBufferUnderflowParams _message = new MediaPlayerObserverOnBufferUnderflowParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(11)));
        }

        @Override // org.chromium.media.mojom.MediaPlayerObserver
        public void onSeek() {
            MediaPlayerObserverOnSeekParams _message = new MediaPlayerObserverOnSeekParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(12)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<MediaPlayerObserver> {
        Stub(Core core, MediaPlayerObserver impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(MediaPlayerObserver_Internal.MANAGER, messageWithHeader);
                    case -1:
                    default:
                        return false;
                    case 0:
                        MediaPlayerObserverOnMediaPlayingParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onMediaPlaying();
                        return true;
                    case 1:
                        MediaPlayerObserverOnMediaPausedParams data = MediaPlayerObserverOnMediaPausedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onMediaPaused(data.streamEnded);
                        return true;
                    case 2:
                        MediaPlayerObserverOnMutedStatusChangedParams data2 = MediaPlayerObserverOnMutedStatusChangedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onMutedStatusChanged(data2.muted);
                        return true;
                    case 3:
                        MediaPlayerObserverOnMediaMetadataChangedParams data3 = MediaPlayerObserverOnMediaMetadataChangedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onMediaMetadataChanged(data3.hasAudio, data3.hasVideo, data3.contentType);
                        return true;
                    case 4:
                        MediaPlayerObserverOnMediaPositionStateChangedParams data4 = MediaPlayerObserverOnMediaPositionStateChangedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onMediaPositionStateChanged(data4.mediaPosition);
                        return true;
                    case 5:
                        MediaPlayerObserverOnMediaEffectivelyFullscreenChangedParams data5 = MediaPlayerObserverOnMediaEffectivelyFullscreenChangedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onMediaEffectivelyFullscreenChanged(data5.status);
                        return true;
                    case 6:
                        MediaPlayerObserverOnMediaSizeChangedParams data6 = MediaPlayerObserverOnMediaSizeChangedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onMediaSizeChanged(data6.size);
                        return true;
                    case 7:
                        MediaPlayerObserverOnPictureInPictureAvailabilityChangedParams data7 = MediaPlayerObserverOnPictureInPictureAvailabilityChangedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onPictureInPictureAvailabilityChanged(data7.available);
                        return true;
                    case 8:
                        MediaPlayerObserverOnAudioOutputSinkChangedParams data8 = MediaPlayerObserverOnAudioOutputSinkChangedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onAudioOutputSinkChanged(data8.hashedDeviceId);
                        return true;
                    case 9:
                        MediaPlayerObserverOnUseAudioServiceChangedParams data9 = MediaPlayerObserverOnUseAudioServiceChangedParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onUseAudioServiceChanged(data9.usesAudioService);
                        return true;
                    case 10:
                        MediaPlayerObserverOnAudioOutputSinkChangingDisabledParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onAudioOutputSinkChangingDisabled();
                        return true;
                    case 11:
                        MediaPlayerObserverOnBufferUnderflowParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onBufferUnderflow();
                        return true;
                    case 12:
                        MediaPlayerObserverOnSeekParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onSeek();
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), MediaPlayerObserver_Internal.MANAGER, messageWithHeader, receiver);
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
    static final class MediaPlayerObserverOnMediaPlayingParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaPlayerObserverOnMediaPlayingParams(int version) {
            super(8, version);
        }

        public MediaPlayerObserverOnMediaPlayingParams() {
            this(0);
        }

        public static MediaPlayerObserverOnMediaPlayingParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaPlayerObserverOnMediaPlayingParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaPlayerObserverOnMediaPlayingParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaPlayerObserverOnMediaPlayingParams result = new MediaPlayerObserverOnMediaPlayingParams(elementsOrVersion);
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
    static final class MediaPlayerObserverOnMediaPausedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean streamEnded;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaPlayerObserverOnMediaPausedParams(int version) {
            super(16, version);
        }

        public MediaPlayerObserverOnMediaPausedParams() {
            this(0);
        }

        public static MediaPlayerObserverOnMediaPausedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaPlayerObserverOnMediaPausedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaPlayerObserverOnMediaPausedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaPlayerObserverOnMediaPausedParams result = new MediaPlayerObserverOnMediaPausedParams(elementsOrVersion);
                result.streamEnded = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.streamEnded, 8, 0);
        }
    }

    /* loaded from: classes2.dex */
    static final class MediaPlayerObserverOnMutedStatusChangedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean muted;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaPlayerObserverOnMutedStatusChangedParams(int version) {
            super(16, version);
        }

        public MediaPlayerObserverOnMutedStatusChangedParams() {
            this(0);
        }

        public static MediaPlayerObserverOnMutedStatusChangedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaPlayerObserverOnMutedStatusChangedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaPlayerObserverOnMutedStatusChangedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaPlayerObserverOnMutedStatusChangedParams result = new MediaPlayerObserverOnMutedStatusChangedParams(elementsOrVersion);
                result.muted = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.muted, 8, 0);
        }
    }

    /* loaded from: classes2.dex */
    static final class MediaPlayerObserverOnMediaMetadataChangedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int contentType;
        public boolean hasAudio;
        public boolean hasVideo;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaPlayerObserverOnMediaMetadataChangedParams(int version) {
            super(16, version);
        }

        public MediaPlayerObserverOnMediaMetadataChangedParams() {
            this(0);
        }

        public static MediaPlayerObserverOnMediaMetadataChangedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaPlayerObserverOnMediaMetadataChangedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaPlayerObserverOnMediaMetadataChangedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaPlayerObserverOnMediaMetadataChangedParams result = new MediaPlayerObserverOnMediaMetadataChangedParams(elementsOrVersion);
                result.hasAudio = decoder0.readBoolean(8, 0);
                result.hasVideo = decoder0.readBoolean(8, 1);
                int readInt = decoder0.readInt(12);
                result.contentType = readInt;
                MediaContentType.validate(readInt);
                result.contentType = MediaContentType.toKnownValue(result.contentType);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.hasAudio, 8, 0);
            encoder0.encode(this.hasVideo, 8, 1);
            encoder0.encode(this.contentType, 12);
        }
    }

    /* loaded from: classes2.dex */
    static final class MediaPlayerObserverOnMediaPositionStateChangedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public MediaPosition mediaPosition;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaPlayerObserverOnMediaPositionStateChangedParams(int version) {
            super(16, version);
        }

        public MediaPlayerObserverOnMediaPositionStateChangedParams() {
            this(0);
        }

        public static MediaPlayerObserverOnMediaPositionStateChangedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaPlayerObserverOnMediaPositionStateChangedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaPlayerObserverOnMediaPositionStateChangedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaPlayerObserverOnMediaPositionStateChangedParams result = new MediaPlayerObserverOnMediaPositionStateChangedParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.mediaPosition = MediaPosition.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.mediaPosition, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class MediaPlayerObserverOnMediaEffectivelyFullscreenChangedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int status;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaPlayerObserverOnMediaEffectivelyFullscreenChangedParams(int version) {
            super(16, version);
        }

        public MediaPlayerObserverOnMediaEffectivelyFullscreenChangedParams() {
            this(0);
        }

        public static MediaPlayerObserverOnMediaEffectivelyFullscreenChangedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaPlayerObserverOnMediaEffectivelyFullscreenChangedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaPlayerObserverOnMediaEffectivelyFullscreenChangedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaPlayerObserverOnMediaEffectivelyFullscreenChangedParams result = new MediaPlayerObserverOnMediaEffectivelyFullscreenChangedParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.status = readInt;
                FullscreenVideoStatus.validate(readInt);
                result.status = FullscreenVideoStatus.toKnownValue(result.status);
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
    static final class MediaPlayerObserverOnMediaSizeChangedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public Size size;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaPlayerObserverOnMediaSizeChangedParams(int version) {
            super(16, version);
        }

        public MediaPlayerObserverOnMediaSizeChangedParams() {
            this(0);
        }

        public static MediaPlayerObserverOnMediaSizeChangedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaPlayerObserverOnMediaSizeChangedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaPlayerObserverOnMediaSizeChangedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaPlayerObserverOnMediaSizeChangedParams result = new MediaPlayerObserverOnMediaSizeChangedParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.size = Size.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.size, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class MediaPlayerObserverOnPictureInPictureAvailabilityChangedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean available;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaPlayerObserverOnPictureInPictureAvailabilityChangedParams(int version) {
            super(16, version);
        }

        public MediaPlayerObserverOnPictureInPictureAvailabilityChangedParams() {
            this(0);
        }

        public static MediaPlayerObserverOnPictureInPictureAvailabilityChangedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaPlayerObserverOnPictureInPictureAvailabilityChangedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaPlayerObserverOnPictureInPictureAvailabilityChangedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaPlayerObserverOnPictureInPictureAvailabilityChangedParams result = new MediaPlayerObserverOnPictureInPictureAvailabilityChangedParams(elementsOrVersion);
                result.available = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.available, 8, 0);
        }
    }

    /* loaded from: classes2.dex */
    static final class MediaPlayerObserverOnAudioOutputSinkChangedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public String hashedDeviceId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaPlayerObserverOnAudioOutputSinkChangedParams(int version) {
            super(16, version);
        }

        public MediaPlayerObserverOnAudioOutputSinkChangedParams() {
            this(0);
        }

        public static MediaPlayerObserverOnAudioOutputSinkChangedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaPlayerObserverOnAudioOutputSinkChangedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaPlayerObserverOnAudioOutputSinkChangedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaPlayerObserverOnAudioOutputSinkChangedParams result = new MediaPlayerObserverOnAudioOutputSinkChangedParams(elementsOrVersion);
                result.hashedDeviceId = decoder0.readString(8, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.hashedDeviceId, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class MediaPlayerObserverOnUseAudioServiceChangedParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean usesAudioService;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaPlayerObserverOnUseAudioServiceChangedParams(int version) {
            super(16, version);
        }

        public MediaPlayerObserverOnUseAudioServiceChangedParams() {
            this(0);
        }

        public static MediaPlayerObserverOnUseAudioServiceChangedParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaPlayerObserverOnUseAudioServiceChangedParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaPlayerObserverOnUseAudioServiceChangedParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaPlayerObserverOnUseAudioServiceChangedParams result = new MediaPlayerObserverOnUseAudioServiceChangedParams(elementsOrVersion);
                result.usesAudioService = decoder0.readBoolean(8, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.usesAudioService, 8, 0);
        }
    }

    /* loaded from: classes2.dex */
    static final class MediaPlayerObserverOnAudioOutputSinkChangingDisabledParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaPlayerObserverOnAudioOutputSinkChangingDisabledParams(int version) {
            super(8, version);
        }

        public MediaPlayerObserverOnAudioOutputSinkChangingDisabledParams() {
            this(0);
        }

        public static MediaPlayerObserverOnAudioOutputSinkChangingDisabledParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaPlayerObserverOnAudioOutputSinkChangingDisabledParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaPlayerObserverOnAudioOutputSinkChangingDisabledParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaPlayerObserverOnAudioOutputSinkChangingDisabledParams result = new MediaPlayerObserverOnAudioOutputSinkChangingDisabledParams(elementsOrVersion);
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
    static final class MediaPlayerObserverOnBufferUnderflowParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaPlayerObserverOnBufferUnderflowParams(int version) {
            super(8, version);
        }

        public MediaPlayerObserverOnBufferUnderflowParams() {
            this(0);
        }

        public static MediaPlayerObserverOnBufferUnderflowParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaPlayerObserverOnBufferUnderflowParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaPlayerObserverOnBufferUnderflowParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaPlayerObserverOnBufferUnderflowParams result = new MediaPlayerObserverOnBufferUnderflowParams(elementsOrVersion);
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
    static final class MediaPlayerObserverOnSeekParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaPlayerObserverOnSeekParams(int version) {
            super(8, version);
        }

        public MediaPlayerObserverOnSeekParams() {
            this(0);
        }

        public static MediaPlayerObserverOnSeekParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaPlayerObserverOnSeekParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaPlayerObserverOnSeekParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaPlayerObserverOnSeekParams result = new MediaPlayerObserverOnSeekParams(elementsOrVersion);
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
}
