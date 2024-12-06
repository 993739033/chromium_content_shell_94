package org.chromium.media_session.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;

import org.chromium.media_session.mojom.MediaController;
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
import org.chromium.mojo_base.mojom.TimeDelta;

/* loaded from: classes2.dex */
class MediaController_Internal {
    private static final int ADD_OBSERVER_ORDINAL = 4;
    private static final int ENTER_PICTURE_IN_PICTURE_ORDINAL = 11;
    private static final int EXIT_PICTURE_IN_PICTURE_ORDINAL = 12;
    private static final int HANG_UP_ORDINAL = 16;
    public static final Interface.Manager<MediaController, MediaController.Proxy> MANAGER = new Interface.Manager<MediaController, MediaController.Proxy>() { // from class: org.chromium.media_session.mojom.MediaController_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "media_session.mojom.MediaController";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 2;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public MediaController.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, MediaController impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public MediaController[] buildArray(int size) {
            return new MediaController[size];
        }
    };
    private static final int NEXT_TRACK_ORDINAL = 6;
    private static final int OBSERVE_IMAGES_ORDINAL = 8;
    private static final int PREVIOUS_TRACK_ORDINAL = 5;
    private static final int RAISE_ORDINAL = 17;
    private static final int RESUME_ORDINAL = 1;
    private static final int SCRUB_TO_ORDINAL = 10;
    private static final int SEEK_ORDINAL = 7;
    private static final int SEEK_TO_ORDINAL = 9;
    private static final int SET_AUDIO_SINK_ID_ORDINAL = 13;
    private static final int STOP_ORDINAL = 2;
    private static final int SUSPEND_ORDINAL = 0;
    private static final int TOGGLE_CAMERA_ORDINAL = 15;
    private static final int TOGGLE_MICROPHONE_ORDINAL = 14;
    private static final int TOGGLE_SUSPEND_RESUME_ORDINAL = 3;

    MediaController_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements MediaController.Proxy {
        @Override
        // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.media_session.mojom.MediaController
        public void suspend() {
            MediaControllerSuspendParams _message = new MediaControllerSuspendParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }

        @Override // org.chromium.media_session.mojom.MediaController
        public void resume() {
            MediaControllerResumeParams _message = new MediaControllerResumeParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1)));
        }

        @Override // org.chromium.media_session.mojom.MediaController
        public void stop() {
            MediaControllerStopParams _message = new MediaControllerStopParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2)));
        }

        @Override // org.chromium.media_session.mojom.MediaController
        public void toggleSuspendResume() {
            MediaControllerToggleSuspendResumeParams _message = new MediaControllerToggleSuspendResumeParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3)));
        }

        @Override // org.chromium.media_session.mojom.MediaController
        public void addObserver(MediaControllerObserver observer) {
            MediaControllerAddObserverParams _message = new MediaControllerAddObserverParams();
            _message.observer = observer;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(4)));
        }

        @Override // org.chromium.media_session.mojom.MediaController
        public void previousTrack() {
            MediaControllerPreviousTrackParams _message = new MediaControllerPreviousTrackParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(5)));
        }

        @Override // org.chromium.media_session.mojom.MediaController
        public void nextTrack() {
            MediaControllerNextTrackParams _message = new MediaControllerNextTrackParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(6)));
        }

        @Override // org.chromium.media_session.mojom.MediaController
        public void seek(TimeDelta seekTime) {
            MediaControllerSeekParams _message = new MediaControllerSeekParams();
            _message.seekTime = seekTime;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(7)));
        }

        @Override // org.chromium.media_session.mojom.MediaController
        public void observeImages(int type, int minimumSizePx, int desiredSizePx, MediaControllerImageObserver observer) {
            MediaControllerObserveImagesParams _message = new MediaControllerObserveImagesParams();
            _message.type = type;
            _message.minimumSizePx = minimumSizePx;
            _message.desiredSizePx = desiredSizePx;
            _message.observer = observer;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(8)));
        }

        @Override // org.chromium.media_session.mojom.MediaController
        public void seekTo(TimeDelta seekTime) {
            MediaControllerSeekToParams _message = new MediaControllerSeekToParams();
            _message.seekTime = seekTime;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(9)));
        }

        @Override // org.chromium.media_session.mojom.MediaController
        public void scrubTo(TimeDelta seekTime) {
            MediaControllerScrubToParams _message = new MediaControllerScrubToParams();
            _message.seekTime = seekTime;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(10)));
        }

        @Override // org.chromium.media_session.mojom.MediaController
        public void enterPictureInPicture() {
            MediaControllerEnterPictureInPictureParams _message = new MediaControllerEnterPictureInPictureParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(11)));
        }

        @Override // org.chromium.media_session.mojom.MediaController
        public void exitPictureInPicture() {
            MediaControllerExitPictureInPictureParams _message = new MediaControllerExitPictureInPictureParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(12)));
        }

        @Override // org.chromium.media_session.mojom.MediaController
        public void setAudioSinkId(String id) {
            MediaControllerSetAudioSinkIdParams _message = new MediaControllerSetAudioSinkIdParams();
            _message.id = id;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(13)));
        }

        @Override // org.chromium.media_session.mojom.MediaController
        public void toggleMicrophone() {
            MediaControllerToggleMicrophoneParams _message = new MediaControllerToggleMicrophoneParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(14)));
        }

        @Override // org.chromium.media_session.mojom.MediaController
        public void toggleCamera() {
            MediaControllerToggleCameraParams _message = new MediaControllerToggleCameraParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(15)));
        }

        @Override // org.chromium.media_session.mojom.MediaController
        public void hangUp() {
            MediaControllerHangUpParams _message = new MediaControllerHangUpParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(16)));
        }

        @Override // org.chromium.media_session.mojom.MediaController
        public void raise() {
            MediaControllerRaiseParams _message = new MediaControllerRaiseParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(17)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<MediaController> {
        Stub(Core core, MediaController impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(MediaController_Internal.MANAGER, messageWithHeader);
                    case -1:
                    default:
                        return false;
                    case 0:
                        MediaControllerSuspendParams.deserialize(messageWithHeader.getPayload());
                        getImpl().suspend();
                        return true;
                    case 1:
                        MediaControllerResumeParams.deserialize(messageWithHeader.getPayload());
                        getImpl().resume();
                        return true;
                    case 2:
                        MediaControllerStopParams.deserialize(messageWithHeader.getPayload());
                        getImpl().stop();
                        return true;
                    case 3:
                        MediaControllerToggleSuspendResumeParams.deserialize(messageWithHeader.getPayload());
                        getImpl().toggleSuspendResume();
                        return true;
                    case 4:
                        MediaControllerAddObserverParams data = MediaControllerAddObserverParams.deserialize(messageWithHeader.getPayload());
                        getImpl().addObserver(data.observer);
                        return true;
                    case 5:
                        MediaControllerPreviousTrackParams.deserialize(messageWithHeader.getPayload());
                        getImpl().previousTrack();
                        return true;
                    case 6:
                        MediaControllerNextTrackParams.deserialize(messageWithHeader.getPayload());
                        getImpl().nextTrack();
                        return true;
                    case 7:
                        MediaControllerSeekParams data2 = MediaControllerSeekParams.deserialize(messageWithHeader.getPayload());
                        getImpl().seek(data2.seekTime);
                        return true;
                    case 8:
                        MediaControllerObserveImagesParams data3 = MediaControllerObserveImagesParams.deserialize(messageWithHeader.getPayload());
                        getImpl().observeImages(data3.type, data3.minimumSizePx, data3.desiredSizePx, data3.observer);
                        return true;
                    case 9:
                        MediaControllerSeekToParams data4 = MediaControllerSeekToParams.deserialize(messageWithHeader.getPayload());
                        getImpl().seekTo(data4.seekTime);
                        return true;
                    case 10:
                        MediaControllerScrubToParams data5 = MediaControllerScrubToParams.deserialize(messageWithHeader.getPayload());
                        getImpl().scrubTo(data5.seekTime);
                        return true;
                    case 11:
                        MediaControllerEnterPictureInPictureParams.deserialize(messageWithHeader.getPayload());
                        getImpl().enterPictureInPicture();
                        return true;
                    case 12:
                        MediaControllerExitPictureInPictureParams.deserialize(messageWithHeader.getPayload());
                        getImpl().exitPictureInPicture();
                        return true;
                    case 13:
                        MediaControllerSetAudioSinkIdParams data6 = MediaControllerSetAudioSinkIdParams.deserialize(messageWithHeader.getPayload());
                        getImpl().setAudioSinkId(data6.id);
                        return true;
                    case 14:
                        MediaControllerToggleMicrophoneParams.deserialize(messageWithHeader.getPayload());
                        getImpl().toggleMicrophone();
                        return true;
                    case 15:
                        MediaControllerToggleCameraParams.deserialize(messageWithHeader.getPayload());
                        getImpl().toggleCamera();
                        return true;
                    case 16:
                        MediaControllerHangUpParams.deserialize(messageWithHeader.getPayload());
                        getImpl().hangUp();
                        return true;
                    case 17:
                        MediaControllerRaiseParams.deserialize(messageWithHeader.getPayload());
                        getImpl().raise();
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), MediaController_Internal.MANAGER, messageWithHeader, receiver);
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
    static final class MediaControllerSuspendParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaControllerSuspendParams(int version) {
            super(8, version);
        }

        public MediaControllerSuspendParams() {
            this(0);
        }

        public static MediaControllerSuspendParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaControllerSuspendParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaControllerSuspendParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaControllerSuspendParams result = new MediaControllerSuspendParams(elementsOrVersion);
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
    static final class MediaControllerResumeParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaControllerResumeParams(int version) {
            super(8, version);
        }

        public MediaControllerResumeParams() {
            this(0);
        }

        public static MediaControllerResumeParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaControllerResumeParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaControllerResumeParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaControllerResumeParams result = new MediaControllerResumeParams(elementsOrVersion);
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
    static final class MediaControllerStopParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaControllerStopParams(int version) {
            super(8, version);
        }

        public MediaControllerStopParams() {
            this(0);
        }

        public static MediaControllerStopParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaControllerStopParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaControllerStopParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaControllerStopParams result = new MediaControllerStopParams(elementsOrVersion);
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
    static final class MediaControllerToggleSuspendResumeParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaControllerToggleSuspendResumeParams(int version) {
            super(8, version);
        }

        public MediaControllerToggleSuspendResumeParams() {
            this(0);
        }

        public static MediaControllerToggleSuspendResumeParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaControllerToggleSuspendResumeParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaControllerToggleSuspendResumeParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaControllerToggleSuspendResumeParams result = new MediaControllerToggleSuspendResumeParams(elementsOrVersion);
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
    static final class MediaControllerAddObserverParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public MediaControllerObserver observer;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaControllerAddObserverParams(int version) {
            super(16, version);
        }

        public MediaControllerAddObserverParams() {
            this(0);
        }

        public static MediaControllerAddObserverParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaControllerAddObserverParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaControllerAddObserverParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaControllerAddObserverParams result = new MediaControllerAddObserverParams(elementsOrVersion);
                result.observer = (MediaControllerObserver) decoder0.readServiceInterface(8, false, MediaControllerObserver.MANAGER);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.observer, 8, false, MediaControllerObserver.MANAGER);
        }
    }

    /* loaded from: classes2.dex */
    static final class MediaControllerPreviousTrackParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaControllerPreviousTrackParams(int version) {
            super(8, version);
        }

        public MediaControllerPreviousTrackParams() {
            this(0);
        }

        public static MediaControllerPreviousTrackParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaControllerPreviousTrackParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaControllerPreviousTrackParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaControllerPreviousTrackParams result = new MediaControllerPreviousTrackParams(elementsOrVersion);
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
    static final class MediaControllerNextTrackParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaControllerNextTrackParams(int version) {
            super(8, version);
        }

        public MediaControllerNextTrackParams() {
            this(0);
        }

        public static MediaControllerNextTrackParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaControllerNextTrackParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaControllerNextTrackParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaControllerNextTrackParams result = new MediaControllerNextTrackParams(elementsOrVersion);
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
    static final class MediaControllerSeekParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public TimeDelta seekTime;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaControllerSeekParams(int version) {
            super(16, version);
        }

        public MediaControllerSeekParams() {
            this(0);
        }

        public static MediaControllerSeekParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaControllerSeekParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaControllerSeekParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaControllerSeekParams result = new MediaControllerSeekParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.seekTime = TimeDelta.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.seekTime, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class MediaControllerObserveImagesParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public int desiredSizePx;
        public int minimumSizePx;
        public MediaControllerImageObserver observer;
        public int type;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaControllerObserveImagesParams(int version) {
            super(32, version);
        }

        public MediaControllerObserveImagesParams() {
            this(0);
        }

        public static MediaControllerObserveImagesParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaControllerObserveImagesParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaControllerObserveImagesParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaControllerObserveImagesParams result = new MediaControllerObserveImagesParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.type = readInt;
                MediaSessionImageType.validate(readInt);
                result.type = MediaSessionImageType.toKnownValue(result.type);
                result.minimumSizePx = decoder0.readInt(12);
                result.desiredSizePx = decoder0.readInt(16);
                result.observer = (MediaControllerImageObserver) decoder0.readServiceInterface(20, false, MediaControllerImageObserver.MANAGER);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.type, 8);
            encoder0.encode(this.minimumSizePx, 12);
            encoder0.encode(this.desiredSizePx, 16);
            encoder0.encode(this.observer, 20, false, MediaControllerImageObserver.MANAGER);
        }
    }

    /* loaded from: classes2.dex */
    static final class MediaControllerSeekToParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public TimeDelta seekTime;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaControllerSeekToParams(int version) {
            super(16, version);
        }

        public MediaControllerSeekToParams() {
            this(0);
        }

        public static MediaControllerSeekToParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaControllerSeekToParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaControllerSeekToParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaControllerSeekToParams result = new MediaControllerSeekToParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.seekTime = TimeDelta.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.seekTime, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class MediaControllerScrubToParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public TimeDelta seekTime;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaControllerScrubToParams(int version) {
            super(16, version);
        }

        public MediaControllerScrubToParams() {
            this(0);
        }

        public static MediaControllerScrubToParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaControllerScrubToParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaControllerScrubToParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaControllerScrubToParams result = new MediaControllerScrubToParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.seekTime = TimeDelta.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.seekTime, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class MediaControllerEnterPictureInPictureParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaControllerEnterPictureInPictureParams(int version) {
            super(8, version);
        }

        public MediaControllerEnterPictureInPictureParams() {
            this(0);
        }

        public static MediaControllerEnterPictureInPictureParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaControllerEnterPictureInPictureParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaControllerEnterPictureInPictureParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaControllerEnterPictureInPictureParams result = new MediaControllerEnterPictureInPictureParams(elementsOrVersion);
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
    static final class MediaControllerExitPictureInPictureParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaControllerExitPictureInPictureParams(int version) {
            super(8, version);
        }

        public MediaControllerExitPictureInPictureParams() {
            this(0);
        }

        public static MediaControllerExitPictureInPictureParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaControllerExitPictureInPictureParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaControllerExitPictureInPictureParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaControllerExitPictureInPictureParams result = new MediaControllerExitPictureInPictureParams(elementsOrVersion);
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
    static final class MediaControllerSetAudioSinkIdParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public String id;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaControllerSetAudioSinkIdParams(int version) {
            super(16, version);
        }

        public MediaControllerSetAudioSinkIdParams() {
            this(0);
        }

        public static MediaControllerSetAudioSinkIdParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaControllerSetAudioSinkIdParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaControllerSetAudioSinkIdParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaControllerSetAudioSinkIdParams result = new MediaControllerSetAudioSinkIdParams(elementsOrVersion);
                result.id = decoder0.readString(8, true);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.id, 8, true);
        }
    }

    /* loaded from: classes2.dex */
    static final class MediaControllerToggleMicrophoneParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaControllerToggleMicrophoneParams(int version) {
            super(8, version);
        }

        public MediaControllerToggleMicrophoneParams() {
            this(0);
        }

        public static MediaControllerToggleMicrophoneParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaControllerToggleMicrophoneParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaControllerToggleMicrophoneParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaControllerToggleMicrophoneParams result = new MediaControllerToggleMicrophoneParams(elementsOrVersion);
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
    static final class MediaControllerToggleCameraParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaControllerToggleCameraParams(int version) {
            super(8, version);
        }

        public MediaControllerToggleCameraParams() {
            this(0);
        }

        public static MediaControllerToggleCameraParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaControllerToggleCameraParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaControllerToggleCameraParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaControllerToggleCameraParams result = new MediaControllerToggleCameraParams(elementsOrVersion);
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
    static final class MediaControllerHangUpParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaControllerHangUpParams(int version) {
            super(8, version);
        }

        public MediaControllerHangUpParams() {
            this(0);
        }

        public static MediaControllerHangUpParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaControllerHangUpParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaControllerHangUpParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaControllerHangUpParams result = new MediaControllerHangUpParams(elementsOrVersion);
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
    static final class MediaControllerRaiseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MediaControllerRaiseParams(int version) {
            super(8, version);
        }

        public MediaControllerRaiseParams() {
            this(0);
        }

        public static MediaControllerRaiseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MediaControllerRaiseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MediaControllerRaiseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MediaControllerRaiseParams result = new MediaControllerRaiseParams(elementsOrVersion);
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
