package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.PeerConnectionTrackerHost;
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
import org.chromium.mojo_base.mojom.ListValue;
/* loaded from: classes2.dex */
class PeerConnectionTrackerHost_Internal {
    private static final int ADD_LEGACY_STATS_ORDINAL = 7;
    private static final int ADD_PEER_CONNECTION_ORDINAL = 0;
    private static final int ADD_STANDARD_STATS_ORDINAL = 6;
    private static final int GET_USER_MEDIA_ORDINAL = 4;
    public static final Interface.Manager<PeerConnectionTrackerHost, PeerConnectionTrackerHost.Proxy> MANAGER = new Interface.Manager<PeerConnectionTrackerHost, PeerConnectionTrackerHost.Proxy>() { // from class: org.chromium.blink.mojom.PeerConnectionTrackerHost_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.PeerConnectionTrackerHost";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public PeerConnectionTrackerHost.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, PeerConnectionTrackerHost impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public PeerConnectionTrackerHost[] buildArray(int size) {
            return new PeerConnectionTrackerHost[size];
        }
    };
    private static final int ON_PEER_CONNECTION_SESSION_ID_SET_ORDINAL = 3;
    private static final int REMOVE_PEER_CONNECTION_ORDINAL = 1;
    private static final int UPDATE_PEER_CONNECTION_ORDINAL = 2;
    private static final int WEB_RTC_EVENT_LOG_WRITE_ORDINAL = 5;

    PeerConnectionTrackerHost_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements PeerConnectionTrackerHost.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.PeerConnectionTrackerHost
        public void addPeerConnection(PeerConnectionInfo info) {
            PeerConnectionTrackerHostAddPeerConnectionParams _message = new PeerConnectionTrackerHostAddPeerConnectionParams();
            _message.info = info;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }

        @Override // org.chromium.blink.mojom.PeerConnectionTrackerHost
        public void removePeerConnection(int lid) {
            PeerConnectionTrackerHostRemovePeerConnectionParams _message = new PeerConnectionTrackerHostRemovePeerConnectionParams();
            _message.lid = lid;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1)));
        }

        @Override // org.chromium.blink.mojom.PeerConnectionTrackerHost
        public void updatePeerConnection(int lid, String type, String value) {
            PeerConnectionTrackerHostUpdatePeerConnectionParams _message = new PeerConnectionTrackerHostUpdatePeerConnectionParams();
            _message.lid = lid;
            _message.type = type;
            _message.value = value;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2)));
        }

        @Override // org.chromium.blink.mojom.PeerConnectionTrackerHost
        public void onPeerConnectionSessionIdSet(int lid, String sessionId) {
            PeerConnectionTrackerHostOnPeerConnectionSessionIdSetParams _message = new PeerConnectionTrackerHostOnPeerConnectionSessionIdSetParams();
            _message.lid = lid;
            _message.sessionId = sessionId;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3)));
        }

        @Override // org.chromium.blink.mojom.PeerConnectionTrackerHost
        public void getUserMedia(String origin, boolean audio, boolean video, String audioConstraints, String videoConstraints) {
            PeerConnectionTrackerHostGetUserMediaParams _message = new PeerConnectionTrackerHostGetUserMediaParams();
            _message.origin = origin;
            _message.audio = audio;
            _message.video = video;
            _message.audioConstraints = audioConstraints;
            _message.videoConstraints = videoConstraints;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(4)));
        }

        @Override // org.chromium.blink.mojom.PeerConnectionTrackerHost
        public void webRtcEventLogWrite(int lid, byte[] output) {
            PeerConnectionTrackerHostWebRtcEventLogWriteParams _message = new PeerConnectionTrackerHostWebRtcEventLogWriteParams();
            _message.lid = lid;
            _message.output = output;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(5)));
        }

        @Override // org.chromium.blink.mojom.PeerConnectionTrackerHost
        public void addStandardStats(int lid, ListValue value) {
            PeerConnectionTrackerHostAddStandardStatsParams _message = new PeerConnectionTrackerHostAddStandardStatsParams();
            _message.lid = lid;
            _message.value = value;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(6)));
        }

        @Override // org.chromium.blink.mojom.PeerConnectionTrackerHost
        public void addLegacyStats(int lid, ListValue value) {
            PeerConnectionTrackerHostAddLegacyStatsParams _message = new PeerConnectionTrackerHostAddLegacyStatsParams();
            _message.lid = lid;
            _message.value = value;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(7)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<PeerConnectionTrackerHost> {
        Stub(Core core, PeerConnectionTrackerHost impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(PeerConnectionTrackerHost_Internal.MANAGER, messageWithHeader);
                    case -1:
                    default:
                        return false;
                    case 0:
                        PeerConnectionTrackerHostAddPeerConnectionParams data = PeerConnectionTrackerHostAddPeerConnectionParams.deserialize(messageWithHeader.getPayload());
                        getImpl().addPeerConnection(data.info);
                        return true;
                    case 1:
                        PeerConnectionTrackerHostRemovePeerConnectionParams data2 = PeerConnectionTrackerHostRemovePeerConnectionParams.deserialize(messageWithHeader.getPayload());
                        getImpl().removePeerConnection(data2.lid);
                        return true;
                    case 2:
                        PeerConnectionTrackerHostUpdatePeerConnectionParams data3 = PeerConnectionTrackerHostUpdatePeerConnectionParams.deserialize(messageWithHeader.getPayload());
                        getImpl().updatePeerConnection(data3.lid, data3.type, data3.value);
                        return true;
                    case 3:
                        PeerConnectionTrackerHostOnPeerConnectionSessionIdSetParams data4 = PeerConnectionTrackerHostOnPeerConnectionSessionIdSetParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onPeerConnectionSessionIdSet(data4.lid, data4.sessionId);
                        return true;
                    case 4:
                        PeerConnectionTrackerHostGetUserMediaParams data5 = PeerConnectionTrackerHostGetUserMediaParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getUserMedia(data5.origin, data5.audio, data5.video, data5.audioConstraints, data5.videoConstraints);
                        return true;
                    case 5:
                        PeerConnectionTrackerHostWebRtcEventLogWriteParams data6 = PeerConnectionTrackerHostWebRtcEventLogWriteParams.deserialize(messageWithHeader.getPayload());
                        getImpl().webRtcEventLogWrite(data6.lid, data6.output);
                        return true;
                    case 6:
                        PeerConnectionTrackerHostAddStandardStatsParams data7 = PeerConnectionTrackerHostAddStandardStatsParams.deserialize(messageWithHeader.getPayload());
                        getImpl().addStandardStats(data7.lid, data7.value);
                        return true;
                    case 7:
                        PeerConnectionTrackerHostAddLegacyStatsParams data8 = PeerConnectionTrackerHostAddLegacyStatsParams.deserialize(messageWithHeader.getPayload());
                        getImpl().addLegacyStats(data8.lid, data8.value);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), PeerConnectionTrackerHost_Internal.MANAGER, messageWithHeader, receiver);
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
    static final class PeerConnectionTrackerHostAddPeerConnectionParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public PeerConnectionInfo info;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PeerConnectionTrackerHostAddPeerConnectionParams(int version) {
            super(16, version);
        }

        public PeerConnectionTrackerHostAddPeerConnectionParams() {
            this(0);
        }

        public static PeerConnectionTrackerHostAddPeerConnectionParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PeerConnectionTrackerHostAddPeerConnectionParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PeerConnectionTrackerHostAddPeerConnectionParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PeerConnectionTrackerHostAddPeerConnectionParams result = new PeerConnectionTrackerHostAddPeerConnectionParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.info = PeerConnectionInfo.decode(decoder1);
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
    static final class PeerConnectionTrackerHostRemovePeerConnectionParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int lid;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PeerConnectionTrackerHostRemovePeerConnectionParams(int version) {
            super(16, version);
        }

        public PeerConnectionTrackerHostRemovePeerConnectionParams() {
            this(0);
        }

        public static PeerConnectionTrackerHostRemovePeerConnectionParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PeerConnectionTrackerHostRemovePeerConnectionParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PeerConnectionTrackerHostRemovePeerConnectionParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PeerConnectionTrackerHostRemovePeerConnectionParams result = new PeerConnectionTrackerHostRemovePeerConnectionParams(elementsOrVersion);
                result.lid = decoder0.readInt(8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.lid, 8);
        }
    }

    /* loaded from: classes2.dex */
    static final class PeerConnectionTrackerHostUpdatePeerConnectionParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public int lid;
        public String type;
        public String value;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PeerConnectionTrackerHostUpdatePeerConnectionParams(int version) {
            super(32, version);
        }

        public PeerConnectionTrackerHostUpdatePeerConnectionParams() {
            this(0);
        }

        public static PeerConnectionTrackerHostUpdatePeerConnectionParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PeerConnectionTrackerHostUpdatePeerConnectionParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PeerConnectionTrackerHostUpdatePeerConnectionParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PeerConnectionTrackerHostUpdatePeerConnectionParams result = new PeerConnectionTrackerHostUpdatePeerConnectionParams(elementsOrVersion);
                result.lid = decoder0.readInt(8);
                result.type = decoder0.readString(16, false);
                result.value = decoder0.readString(24, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.lid, 8);
            encoder0.encode(this.type, 16, false);
            encoder0.encode(this.value, 24, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class PeerConnectionTrackerHostOnPeerConnectionSessionIdSetParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public int lid;
        public String sessionId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PeerConnectionTrackerHostOnPeerConnectionSessionIdSetParams(int version) {
            super(24, version);
        }

        public PeerConnectionTrackerHostOnPeerConnectionSessionIdSetParams() {
            this(0);
        }

        public static PeerConnectionTrackerHostOnPeerConnectionSessionIdSetParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PeerConnectionTrackerHostOnPeerConnectionSessionIdSetParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PeerConnectionTrackerHostOnPeerConnectionSessionIdSetParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PeerConnectionTrackerHostOnPeerConnectionSessionIdSetParams result = new PeerConnectionTrackerHostOnPeerConnectionSessionIdSetParams(elementsOrVersion);
                result.lid = decoder0.readInt(8);
                result.sessionId = decoder0.readString(16, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.lid, 8);
            encoder0.encode(this.sessionId, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class PeerConnectionTrackerHostGetUserMediaParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 40;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean audio;
        public String audioConstraints;
        public String origin;
        public boolean video;
        public String videoConstraints;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PeerConnectionTrackerHostGetUserMediaParams(int version) {
            super(40, version);
        }

        public PeerConnectionTrackerHostGetUserMediaParams() {
            this(0);
        }

        public static PeerConnectionTrackerHostGetUserMediaParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PeerConnectionTrackerHostGetUserMediaParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PeerConnectionTrackerHostGetUserMediaParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PeerConnectionTrackerHostGetUserMediaParams result = new PeerConnectionTrackerHostGetUserMediaParams(elementsOrVersion);
                result.origin = decoder0.readString(8, false);
                result.audio = decoder0.readBoolean(16, 0);
                result.video = decoder0.readBoolean(16, 1);
                result.audioConstraints = decoder0.readString(24, false);
                result.videoConstraints = decoder0.readString(32, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.origin, 8, false);
            encoder0.encode(this.audio, 16, 0);
            encoder0.encode(this.video, 16, 1);
            encoder0.encode(this.audioConstraints, 24, false);
            encoder0.encode(this.videoConstraints, 32, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class PeerConnectionTrackerHostWebRtcEventLogWriteParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public int lid;
        public byte[] output;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PeerConnectionTrackerHostWebRtcEventLogWriteParams(int version) {
            super(24, version);
        }

        public PeerConnectionTrackerHostWebRtcEventLogWriteParams() {
            this(0);
        }

        public static PeerConnectionTrackerHostWebRtcEventLogWriteParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PeerConnectionTrackerHostWebRtcEventLogWriteParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PeerConnectionTrackerHostWebRtcEventLogWriteParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PeerConnectionTrackerHostWebRtcEventLogWriteParams result = new PeerConnectionTrackerHostWebRtcEventLogWriteParams(elementsOrVersion);
                result.lid = decoder0.readInt(8);
                result.output = decoder0.readBytes(16, 0, -1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.lid, 8);
            encoder0.encode(this.output, 16, 0, -1);
        }
    }

    /* loaded from: classes2.dex */
    static final class PeerConnectionTrackerHostAddStandardStatsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public int lid;
        public ListValue value;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PeerConnectionTrackerHostAddStandardStatsParams(int version) {
            super(24, version);
        }

        public PeerConnectionTrackerHostAddStandardStatsParams() {
            this(0);
        }

        public static PeerConnectionTrackerHostAddStandardStatsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PeerConnectionTrackerHostAddStandardStatsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PeerConnectionTrackerHostAddStandardStatsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PeerConnectionTrackerHostAddStandardStatsParams result = new PeerConnectionTrackerHostAddStandardStatsParams(elementsOrVersion);
                result.lid = decoder0.readInt(8);
                Decoder decoder1 = decoder0.readPointer(16, false);
                result.value = ListValue.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.lid, 8);
            encoder0.encode((Struct) this.value, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class PeerConnectionTrackerHostAddLegacyStatsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public int lid;
        public ListValue value;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PeerConnectionTrackerHostAddLegacyStatsParams(int version) {
            super(24, version);
        }

        public PeerConnectionTrackerHostAddLegacyStatsParams() {
            this(0);
        }

        public static PeerConnectionTrackerHostAddLegacyStatsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PeerConnectionTrackerHostAddLegacyStatsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PeerConnectionTrackerHostAddLegacyStatsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PeerConnectionTrackerHostAddLegacyStatsParams result = new PeerConnectionTrackerHostAddLegacyStatsParams(elementsOrVersion);
                result.lid = decoder0.readInt(8);
                Decoder decoder1 = decoder0.readPointer(16, false);
                result.value = ListValue.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.lid, 8);
            encoder0.encode((Struct) this.value, 16, false);
        }
    }
}
