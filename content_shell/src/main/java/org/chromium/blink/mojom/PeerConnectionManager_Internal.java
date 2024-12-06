package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.PeerConnectionManager;
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
class PeerConnectionManager_Internal {
    private static final int GET_LEGACY_STATS_ORDINAL = 5;
    private static final int GET_STANDARD_STATS_ORDINAL = 4;
    public static final Interface.Manager<PeerConnectionManager, PeerConnectionManager.Proxy> MANAGER = new Interface.Manager<PeerConnectionManager, PeerConnectionManager.Proxy>() { // from class: org.chromium.blink.mojom.PeerConnectionManager_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.PeerConnectionManager";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public PeerConnectionManager.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, PeerConnectionManager impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public PeerConnectionManager[] buildArray(int size) {
            return new PeerConnectionManager[size];
        }
    };
    private static final int ON_SUSPEND_ORDINAL = 0;
    private static final int ON_THERMAL_STATE_CHANGE_ORDINAL = 1;
    private static final int START_EVENT_LOG_ORDINAL = 2;
    private static final int STOP_EVENT_LOG_ORDINAL = 3;

    PeerConnectionManager_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements PeerConnectionManager.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.PeerConnectionManager
        public void onSuspend() {
            PeerConnectionManagerOnSuspendParams _message = new PeerConnectionManagerOnSuspendParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }

        @Override // org.chromium.blink.mojom.PeerConnectionManager
        public void onThermalStateChange(int thermalState) {
            PeerConnectionManagerOnThermalStateChangeParams _message = new PeerConnectionManagerOnThermalStateChangeParams();
            _message.thermalState = thermalState;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1)));
        }

        @Override // org.chromium.blink.mojom.PeerConnectionManager
        public void startEventLog(int peerConnectionLocalId, int outputPeriodMs) {
            PeerConnectionManagerStartEventLogParams _message = new PeerConnectionManagerStartEventLogParams();
            _message.peerConnectionLocalId = peerConnectionLocalId;
            _message.outputPeriodMs = outputPeriodMs;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2)));
        }

        @Override // org.chromium.blink.mojom.PeerConnectionManager
        public void stopEventLog(int peerConnectionLocalId) {
            PeerConnectionManagerStopEventLogParams _message = new PeerConnectionManagerStopEventLogParams();
            _message.peerConnectionLocalId = peerConnectionLocalId;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(3)));
        }

        @Override // org.chromium.blink.mojom.PeerConnectionManager
        public void getStandardStats() {
            PeerConnectionManagerGetStandardStatsParams _message = new PeerConnectionManagerGetStandardStatsParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(4)));
        }

        @Override // org.chromium.blink.mojom.PeerConnectionManager
        public void getLegacyStats() {
            PeerConnectionManagerGetLegacyStatsParams _message = new PeerConnectionManagerGetLegacyStatsParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(5)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<PeerConnectionManager> {
        Stub(Core core, PeerConnectionManager impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(PeerConnectionManager_Internal.MANAGER, messageWithHeader);
                    case -1:
                    default:
                        return false;
                    case 0:
                        PeerConnectionManagerOnSuspendParams.deserialize(messageWithHeader.getPayload());
                        getImpl().onSuspend();
                        return true;
                    case 1:
                        getImpl().onThermalStateChange(PeerConnectionManagerOnThermalStateChangeParams.deserialize(messageWithHeader.getPayload()).thermalState);
                        return true;
                    case 2:
                        PeerConnectionManagerStartEventLogParams data = PeerConnectionManagerStartEventLogParams.deserialize(messageWithHeader.getPayload());
                        getImpl().startEventLog(data.peerConnectionLocalId, data.outputPeriodMs);
                        return true;
                    case 3:
                        PeerConnectionManagerStopEventLogParams data2 = PeerConnectionManagerStopEventLogParams.deserialize(messageWithHeader.getPayload());
                        getImpl().stopEventLog(data2.peerConnectionLocalId);
                        return true;
                    case 4:
                        PeerConnectionManagerGetStandardStatsParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getStandardStats();
                        return true;
                    case 5:
                        PeerConnectionManagerGetLegacyStatsParams.deserialize(messageWithHeader.getPayload());
                        getImpl().getLegacyStats();
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), PeerConnectionManager_Internal.MANAGER, messageWithHeader, receiver);
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
    static final class PeerConnectionManagerOnSuspendParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PeerConnectionManagerOnSuspendParams(int version) {
            super(8, version);
        }

        public PeerConnectionManagerOnSuspendParams() {
            this(0);
        }

        public static PeerConnectionManagerOnSuspendParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PeerConnectionManagerOnSuspendParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PeerConnectionManagerOnSuspendParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PeerConnectionManagerOnSuspendParams result = new PeerConnectionManagerOnSuspendParams(elementsOrVersion);
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
    static final class PeerConnectionManagerOnThermalStateChangeParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int thermalState;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PeerConnectionManagerOnThermalStateChangeParams(int version) {
            super(16, version);
        }

        public PeerConnectionManagerOnThermalStateChangeParams() {
            this(0);
        }

        public static PeerConnectionManagerOnThermalStateChangeParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PeerConnectionManagerOnThermalStateChangeParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PeerConnectionManagerOnThermalStateChangeParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PeerConnectionManagerOnThermalStateChangeParams result = new PeerConnectionManagerOnThermalStateChangeParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.thermalState = readInt;
                DeviceThermalState.validate(readInt);
                result.thermalState = DeviceThermalState.toKnownValue(result.thermalState);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.thermalState, 8);
        }
    }

    /* loaded from: classes2.dex */
    static final class PeerConnectionManagerStartEventLogParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int outputPeriodMs;
        public int peerConnectionLocalId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PeerConnectionManagerStartEventLogParams(int version) {
            super(16, version);
        }

        public PeerConnectionManagerStartEventLogParams() {
            this(0);
        }

        public static PeerConnectionManagerStartEventLogParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PeerConnectionManagerStartEventLogParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PeerConnectionManagerStartEventLogParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PeerConnectionManagerStartEventLogParams result = new PeerConnectionManagerStartEventLogParams(elementsOrVersion);
                result.peerConnectionLocalId = decoder0.readInt(8);
                result.outputPeriodMs = decoder0.readInt(12);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.peerConnectionLocalId, 8);
            encoder0.encode(this.outputPeriodMs, 12);
        }
    }

    /* loaded from: classes2.dex */
    static final class PeerConnectionManagerStopEventLogParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int peerConnectionLocalId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PeerConnectionManagerStopEventLogParams(int version) {
            super(16, version);
        }

        public PeerConnectionManagerStopEventLogParams() {
            this(0);
        }

        public static PeerConnectionManagerStopEventLogParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PeerConnectionManagerStopEventLogParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PeerConnectionManagerStopEventLogParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PeerConnectionManagerStopEventLogParams result = new PeerConnectionManagerStopEventLogParams(elementsOrVersion);
                result.peerConnectionLocalId = decoder0.readInt(8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.peerConnectionLocalId, 8);
        }
    }

    /* loaded from: classes2.dex */
    static final class PeerConnectionManagerGetStandardStatsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PeerConnectionManagerGetStandardStatsParams(int version) {
            super(8, version);
        }

        public PeerConnectionManagerGetStandardStatsParams() {
            this(0);
        }

        public static PeerConnectionManagerGetStandardStatsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PeerConnectionManagerGetStandardStatsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PeerConnectionManagerGetStandardStatsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PeerConnectionManagerGetStandardStatsParams result = new PeerConnectionManagerGetStandardStatsParams(elementsOrVersion);
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
    static final class PeerConnectionManagerGetLegacyStatsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PeerConnectionManagerGetLegacyStatsParams(int version) {
            super(8, version);
        }

        public PeerConnectionManagerGetLegacyStatsParams() {
            this(0);
        }

        public static PeerConnectionManagerGetLegacyStatsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PeerConnectionManagerGetLegacyStatsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PeerConnectionManagerGetLegacyStatsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PeerConnectionManagerGetLegacyStatsParams result = new PeerConnectionManagerGetLegacyStatsParams(elementsOrVersion);
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
