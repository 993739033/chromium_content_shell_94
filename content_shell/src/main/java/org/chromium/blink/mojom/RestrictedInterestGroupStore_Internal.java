package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.RestrictedInterestGroupStore;
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
import org.chromium.url.internal.mojom.Origin;
/* loaded from: classes2.dex */
class RestrictedInterestGroupStore_Internal {
    private static final int JOIN_INTEREST_GROUP_ORDINAL = 0;
    private static final int LEAVE_INTEREST_GROUP_ORDINAL = 1;
    public static final Interface.Manager<RestrictedInterestGroupStore, RestrictedInterestGroupStore.Proxy> MANAGER = new Interface.Manager<RestrictedInterestGroupStore, RestrictedInterestGroupStore.Proxy>() { // from class: org.chromium.blink.mojom.RestrictedInterestGroupStore_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.RestrictedInterestGroupStore";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public RestrictedInterestGroupStore.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, RestrictedInterestGroupStore impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public RestrictedInterestGroupStore[] buildArray(int size) {
            return new RestrictedInterestGroupStore[size];
        }
    };
    private static final int UPDATE_AD_INTEREST_GROUPS_ORDINAL = 2;

    RestrictedInterestGroupStore_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements RestrictedInterestGroupStore.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.RestrictedInterestGroupStore
        public void joinInterestGroup(InterestGroup group) {
            RestrictedInterestGroupStoreJoinInterestGroupParams _message = new RestrictedInterestGroupStoreJoinInterestGroupParams();
            _message.group = group;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0)));
        }

        @Override // org.chromium.blink.mojom.RestrictedInterestGroupStore
        public void leaveInterestGroup(Origin owner, String name) {
            RestrictedInterestGroupStoreLeaveInterestGroupParams _message = new RestrictedInterestGroupStoreLeaveInterestGroupParams();
            _message.owner = owner;
            _message.name = name;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1)));
        }

        @Override // org.chromium.blink.mojom.RestrictedInterestGroupStore
        public void updateAdInterestGroups() {
            RestrictedInterestGroupStoreUpdateAdInterestGroupsParams _message = new RestrictedInterestGroupStoreUpdateAdInterestGroupsParams();
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<RestrictedInterestGroupStore> {
        Stub(Core core, RestrictedInterestGroupStore impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(RestrictedInterestGroupStore_Internal.MANAGER, messageWithHeader);
                    case -1:
                    default:
                        return false;
                    case 0:
                        getImpl().joinInterestGroup(RestrictedInterestGroupStoreJoinInterestGroupParams.deserialize(messageWithHeader.getPayload()).group);
                        return true;
                    case 1:
                        RestrictedInterestGroupStoreLeaveInterestGroupParams data = RestrictedInterestGroupStoreLeaveInterestGroupParams.deserialize(messageWithHeader.getPayload());
                        getImpl().leaveInterestGroup(data.owner, data.name);
                        return true;
                    case 2:
                        RestrictedInterestGroupStoreUpdateAdInterestGroupsParams.deserialize(messageWithHeader.getPayload());
                        getImpl().updateAdInterestGroups();
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), RestrictedInterestGroupStore_Internal.MANAGER, messageWithHeader, receiver);
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
    static final class RestrictedInterestGroupStoreJoinInterestGroupParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public InterestGroup group;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RestrictedInterestGroupStoreJoinInterestGroupParams(int version) {
            super(16, version);
        }

        public RestrictedInterestGroupStoreJoinInterestGroupParams() {
            this(0);
        }

        public static RestrictedInterestGroupStoreJoinInterestGroupParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RestrictedInterestGroupStoreJoinInterestGroupParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RestrictedInterestGroupStoreJoinInterestGroupParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RestrictedInterestGroupStoreJoinInterestGroupParams result = new RestrictedInterestGroupStoreJoinInterestGroupParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.group = InterestGroup.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.group, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class RestrictedInterestGroupStoreLeaveInterestGroupParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public String name;
        public Origin owner;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RestrictedInterestGroupStoreLeaveInterestGroupParams(int version) {
            super(24, version);
        }

        public RestrictedInterestGroupStoreLeaveInterestGroupParams() {
            this(0);
        }

        public static RestrictedInterestGroupStoreLeaveInterestGroupParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RestrictedInterestGroupStoreLeaveInterestGroupParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RestrictedInterestGroupStoreLeaveInterestGroupParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RestrictedInterestGroupStoreLeaveInterestGroupParams result = new RestrictedInterestGroupStoreLeaveInterestGroupParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.owner = Origin.decode(decoder1);
                result.name = decoder0.readString(16, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.owner, 8, false);
            encoder0.encode(this.name, 16, false);
        }
    }

    /* loaded from: classes2.dex */
    static final class RestrictedInterestGroupStoreUpdateAdInterestGroupsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private RestrictedInterestGroupStoreUpdateAdInterestGroupsParams(int version) {
            super(8, version);
        }

        public RestrictedInterestGroupStoreUpdateAdInterestGroupsParams() {
            this(0);
        }

        public static RestrictedInterestGroupStoreUpdateAdInterestGroupsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static RestrictedInterestGroupStoreUpdateAdInterestGroupsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static RestrictedInterestGroupStoreUpdateAdInterestGroupsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                RestrictedInterestGroupStoreUpdateAdInterestGroupsParams result = new RestrictedInterestGroupStoreUpdateAdInterestGroupsParams(elementsOrVersion);
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
