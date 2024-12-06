package org.chromium.network.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
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
import org.chromium.network.mojom.MdnsResponder;
/* loaded from: classes2.dex */
class MdnsResponder_Internal {
    private static final int CREATE_NAME_FOR_ADDRESS_ORDINAL = 0;
    public static final Interface.Manager<MdnsResponder, MdnsResponder.Proxy> MANAGER = new Interface.Manager<MdnsResponder, MdnsResponder.Proxy>() { // from class: org.chromium.network.mojom.MdnsResponder_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "network.mojom.MdnsResponder";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public MdnsResponder.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, MdnsResponder impl) {
            return new Stub(core, impl);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public MdnsResponder[] buildArray(int size) {
            return new MdnsResponder[size];
        }
    };
    private static final int REMOVE_NAME_FOR_ADDRESS_ORDINAL = 1;

    MdnsResponder_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements MdnsResponder.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.network.mojom.MdnsResponder
        public void createNameForAddress(IpAddress address, CreateNameForAddressResponse callback) {
            MdnsResponderCreateNameForAddressParams _message = new MdnsResponderCreateNameForAddressParams();
            _message.address = address;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new MdnsResponderCreateNameForAddressResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.MdnsResponder
        public void removeNameForAddress(IpAddress address, RemoveNameForAddressResponse callback) {
            MdnsResponderRemoveNameForAddressParams _message = new MdnsResponderRemoveNameForAddressParams();
            _message.address = address;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1, 1, 0L)), new MdnsResponderRemoveNameForAddressResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<MdnsResponder> {
        Stub(Core core, MdnsResponder impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(MdnsResponder_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), MdnsResponder_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        MdnsResponderCreateNameForAddressParams data = MdnsResponderCreateNameForAddressParams.deserialize(messageWithHeader.getPayload());
                        getImpl().createNameForAddress(data.address, new MdnsResponderCreateNameForAddressResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 1:
                        MdnsResponderRemoveNameForAddressParams data2 = MdnsResponderRemoveNameForAddressParams.deserialize(messageWithHeader.getPayload());
                        getImpl().removeNameForAddress(data2.address, new MdnsResponderRemoveNameForAddressResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class MdnsResponderCreateNameForAddressParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public IpAddress address;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MdnsResponderCreateNameForAddressParams(int version) {
            super(16, version);
        }

        public MdnsResponderCreateNameForAddressParams() {
            this(0);
        }

        public static MdnsResponderCreateNameForAddressParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MdnsResponderCreateNameForAddressParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MdnsResponderCreateNameForAddressParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MdnsResponderCreateNameForAddressParams result = new MdnsResponderCreateNameForAddressParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.address = IpAddress.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.address, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class MdnsResponderCreateNameForAddressResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean announcementScheduled;
        public String name;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MdnsResponderCreateNameForAddressResponseParams(int version) {
            super(24, version);
        }

        public MdnsResponderCreateNameForAddressResponseParams() {
            this(0);
        }

        public static MdnsResponderCreateNameForAddressResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MdnsResponderCreateNameForAddressResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MdnsResponderCreateNameForAddressResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MdnsResponderCreateNameForAddressResponseParams result = new MdnsResponderCreateNameForAddressResponseParams(elementsOrVersion);
                result.name = decoder0.readString(8, false);
                result.announcementScheduled = decoder0.readBoolean(16, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.name, 8, false);
            encoder0.encode(this.announcementScheduled, 16, 0);
        }
    }

    /* loaded from: classes2.dex */
    static class MdnsResponderCreateNameForAddressResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final MdnsResponder.CreateNameForAddressResponse mCallback;

        MdnsResponderCreateNameForAddressResponseParamsForwardToCallback(MdnsResponder.CreateNameForAddressResponse callback) {
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
                MdnsResponderCreateNameForAddressResponseParams response = MdnsResponderCreateNameForAddressResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.name, Boolean.valueOf(response.announcementScheduled));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class MdnsResponderCreateNameForAddressResponseParamsProxyToResponder implements MdnsResponder.CreateNameForAddressResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        MdnsResponderCreateNameForAddressResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(String name, Boolean announcementScheduled) {
            MdnsResponderCreateNameForAddressResponseParams _response = new MdnsResponderCreateNameForAddressResponseParams();
            _response.name = name;
            _response.announcementScheduled = announcementScheduled.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class MdnsResponderRemoveNameForAddressParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public IpAddress address;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MdnsResponderRemoveNameForAddressParams(int version) {
            super(16, version);
        }

        public MdnsResponderRemoveNameForAddressParams() {
            this(0);
        }

        public static MdnsResponderRemoveNameForAddressParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MdnsResponderRemoveNameForAddressParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MdnsResponderRemoveNameForAddressParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MdnsResponderRemoveNameForAddressParams result = new MdnsResponderRemoveNameForAddressParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.address = IpAddress.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.address, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class MdnsResponderRemoveNameForAddressResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean goodbyeScheduled;
        public boolean removed;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private MdnsResponderRemoveNameForAddressResponseParams(int version) {
            super(16, version);
        }

        public MdnsResponderRemoveNameForAddressResponseParams() {
            this(0);
        }

        public static MdnsResponderRemoveNameForAddressResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static MdnsResponderRemoveNameForAddressResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static MdnsResponderRemoveNameForAddressResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                MdnsResponderRemoveNameForAddressResponseParams result = new MdnsResponderRemoveNameForAddressResponseParams(elementsOrVersion);
                result.removed = decoder0.readBoolean(8, 0);
                result.goodbyeScheduled = decoder0.readBoolean(8, 1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.removed, 8, 0);
            encoder0.encode(this.goodbyeScheduled, 8, 1);
        }
    }

    /* loaded from: classes2.dex */
    static class MdnsResponderRemoveNameForAddressResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final MdnsResponder.RemoveNameForAddressResponse mCallback;

        MdnsResponderRemoveNameForAddressResponseParamsForwardToCallback(MdnsResponder.RemoveNameForAddressResponse callback) {
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
                MdnsResponderRemoveNameForAddressResponseParams response = MdnsResponderRemoveNameForAddressResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.removed), Boolean.valueOf(response.goodbyeScheduled));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class MdnsResponderRemoveNameForAddressResponseParamsProxyToResponder implements MdnsResponder.RemoveNameForAddressResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        MdnsResponderRemoveNameForAddressResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Boolean removed, Boolean goodbyeScheduled) {
            MdnsResponderRemoveNameForAddressResponseParams _response = new MdnsResponderRemoveNameForAddressResponseParams();
            _response.removed = removed.booleanValue();
            _response.goodbyeScheduled = goodbyeScheduled.booleanValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(1, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
