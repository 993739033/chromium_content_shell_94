package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.PushMessaging;
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
class PushMessaging_Internal {
    private static final int GET_SUBSCRIPTION_ORDINAL = 2;
    public static final Interface.Manager<PushMessaging, PushMessaging.Proxy> MANAGER = new Interface.Manager<PushMessaging, PushMessaging.Proxy>() { // from class: org.chromium.blink.mojom.PushMessaging_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.PushMessaging";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public PushMessaging.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, PushMessaging impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public PushMessaging[] buildArray(int size) {
            return new PushMessaging[size];
        }
    };
    private static final int SUBSCRIBE_ORDINAL = 0;
    private static final int UNSUBSCRIBE_ORDINAL = 1;

    PushMessaging_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements PushMessaging.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.PushMessaging
        public void subscribe(long serviceWorkerRegistrationId, PushSubscriptionOptions options, boolean userGesture, SubscribeResponse callback) {
            PushMessagingSubscribeParams _message = new PushMessagingSubscribeParams();
            _message.serviceWorkerRegistrationId = serviceWorkerRegistrationId;
            _message.options = options;
            _message.userGesture = userGesture;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new PushMessagingSubscribeResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.PushMessaging
        public void unsubscribe(long serviceWorkerRegistrationId, UnsubscribeResponse callback) {
            PushMessagingUnsubscribeParams _message = new PushMessagingUnsubscribeParams();
            _message.serviceWorkerRegistrationId = serviceWorkerRegistrationId;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1, 1, 0L)), new PushMessagingUnsubscribeResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.blink.mojom.PushMessaging
        public void getSubscription(long serviceWorkerRegistrationId, GetSubscriptionResponse callback) {
            PushMessagingGetSubscriptionParams _message = new PushMessagingGetSubscriptionParams();
            _message.serviceWorkerRegistrationId = serviceWorkerRegistrationId;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2, 1, 0L)), new PushMessagingGetSubscriptionResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<PushMessaging> {
        Stub(Core core, PushMessaging impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(PushMessaging_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), PushMessaging_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        PushMessagingSubscribeParams data = PushMessagingSubscribeParams.deserialize(messageWithHeader.getPayload());
                        getImpl().subscribe(data.serviceWorkerRegistrationId, data.options, data.userGesture, new PushMessagingSubscribeResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 1:
                        getImpl().unsubscribe(PushMessagingUnsubscribeParams.deserialize(messageWithHeader.getPayload()).serviceWorkerRegistrationId, new PushMessagingUnsubscribeResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 2:
                        getImpl().getSubscription(PushMessagingGetSubscriptionParams.deserialize(messageWithHeader.getPayload()).serviceWorkerRegistrationId, new PushMessagingGetSubscriptionResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class PushMessagingSubscribeParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public PushSubscriptionOptions options;
        public long serviceWorkerRegistrationId;
        public boolean userGesture;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PushMessagingSubscribeParams(int version) {
            super(32, version);
        }

        public PushMessagingSubscribeParams() {
            this(0);
        }

        public static PushMessagingSubscribeParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PushMessagingSubscribeParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PushMessagingSubscribeParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PushMessagingSubscribeParams result = new PushMessagingSubscribeParams(elementsOrVersion);
                result.serviceWorkerRegistrationId = decoder0.readLong(8);
                Decoder decoder1 = decoder0.readPointer(16, false);
                result.options = PushSubscriptionOptions.decode(decoder1);
                result.userGesture = decoder0.readBoolean(24, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.serviceWorkerRegistrationId, 8);
            encoder0.encode((Struct) this.options, 16, false);
            encoder0.encode(this.userGesture, 24, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class PushMessagingSubscribeResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public int status;
        public PushSubscription subscription;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PushMessagingSubscribeResponseParams(int version) {
            super(24, version);
        }

        public PushMessagingSubscribeResponseParams() {
            this(0);
        }

        public static PushMessagingSubscribeResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PushMessagingSubscribeResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PushMessagingSubscribeResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PushMessagingSubscribeResponseParams result = new PushMessagingSubscribeResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.status = readInt;
                PushRegistrationStatus.validate(readInt);
                result.status = PushRegistrationStatus.toKnownValue(result.status);
                Decoder decoder1 = decoder0.readPointer(16, true);
                result.subscription = PushSubscription.decode(decoder1);
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
            encoder0.encode((Struct) this.subscription, 16, true);
        }
    }

    /* loaded from: classes2.dex */
    static class PushMessagingSubscribeResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final PushMessaging.SubscribeResponse mCallback;

        PushMessagingSubscribeResponseParamsForwardToCallback(PushMessaging.SubscribeResponse callback) {
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
                PushMessagingSubscribeResponseParams response = PushMessagingSubscribeResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.status), response.subscription);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class PushMessagingSubscribeResponseParamsProxyToResponder implements PushMessaging.SubscribeResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        PushMessagingSubscribeResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Integer status, PushSubscription subscription) {
            PushMessagingSubscribeResponseParams _response = new PushMessagingSubscribeResponseParams();
            _response.status = status.intValue();
            _response.subscription = subscription;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class PushMessagingUnsubscribeParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public long serviceWorkerRegistrationId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PushMessagingUnsubscribeParams(int version) {
            super(16, version);
        }

        public PushMessagingUnsubscribeParams() {
            this(0);
        }

        public static PushMessagingUnsubscribeParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PushMessagingUnsubscribeParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PushMessagingUnsubscribeParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PushMessagingUnsubscribeParams result = new PushMessagingUnsubscribeParams(elementsOrVersion);
                result.serviceWorkerRegistrationId = decoder0.readLong(8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.serviceWorkerRegistrationId, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class PushMessagingUnsubscribeResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean didUnsubscribe;
        public String errorMessage;
        public int errorType;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PushMessagingUnsubscribeResponseParams(int version) {
            super(24, version);
        }

        public PushMessagingUnsubscribeResponseParams() {
            this(0);
        }

        public static PushMessagingUnsubscribeResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PushMessagingUnsubscribeResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PushMessagingUnsubscribeResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PushMessagingUnsubscribeResponseParams result = new PushMessagingUnsubscribeResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.errorType = readInt;
                PushErrorType.validate(readInt);
                result.errorType = PushErrorType.toKnownValue(result.errorType);
                result.didUnsubscribe = decoder0.readBoolean(12, 0);
                result.errorMessage = decoder0.readString(16, true);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.errorType, 8);
            encoder0.encode(this.didUnsubscribe, 12, 0);
            encoder0.encode(this.errorMessage, 16, true);
        }
    }

    /* loaded from: classes2.dex */
    static class PushMessagingUnsubscribeResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final PushMessaging.UnsubscribeResponse mCallback;

        PushMessagingUnsubscribeResponseParamsForwardToCallback(PushMessaging.UnsubscribeResponse callback) {
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
                PushMessagingUnsubscribeResponseParams response = PushMessagingUnsubscribeResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.errorType), Boolean.valueOf(response.didUnsubscribe), response.errorMessage);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class PushMessagingUnsubscribeResponseParamsProxyToResponder implements PushMessaging.UnsubscribeResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        PushMessagingUnsubscribeResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback3
        public void call(Integer errorType, Boolean didUnsubscribe, String errorMessage) {
            PushMessagingUnsubscribeResponseParams _response = new PushMessagingUnsubscribeResponseParams();
            _response.errorType = errorType.intValue();
            _response.didUnsubscribe = didUnsubscribe.booleanValue();
            _response.errorMessage = errorMessage;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(1, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class PushMessagingGetSubscriptionParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public long serviceWorkerRegistrationId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PushMessagingGetSubscriptionParams(int version) {
            super(16, version);
        }

        public PushMessagingGetSubscriptionParams() {
            this(0);
        }

        public static PushMessagingGetSubscriptionParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PushMessagingGetSubscriptionParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PushMessagingGetSubscriptionParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PushMessagingGetSubscriptionParams result = new PushMessagingGetSubscriptionParams(elementsOrVersion);
                result.serviceWorkerRegistrationId = decoder0.readLong(8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.serviceWorkerRegistrationId, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class PushMessagingGetSubscriptionResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public int status;
        public PushSubscription subscription;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private PushMessagingGetSubscriptionResponseParams(int version) {
            super(24, version);
        }

        public PushMessagingGetSubscriptionResponseParams() {
            this(0);
        }

        public static PushMessagingGetSubscriptionResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static PushMessagingGetSubscriptionResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static PushMessagingGetSubscriptionResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                PushMessagingGetSubscriptionResponseParams result = new PushMessagingGetSubscriptionResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.status = readInt;
                PushGetRegistrationStatus.validate(readInt);
                result.status = PushGetRegistrationStatus.toKnownValue(result.status);
                Decoder decoder1 = decoder0.readPointer(16, true);
                result.subscription = PushSubscription.decode(decoder1);
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
            encoder0.encode((Struct) this.subscription, 16, true);
        }
    }

    /* loaded from: classes2.dex */
    static class PushMessagingGetSubscriptionResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final PushMessaging.GetSubscriptionResponse mCallback;

        PushMessagingGetSubscriptionResponseParamsForwardToCallback(PushMessaging.GetSubscriptionResponse callback) {
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
                PushMessagingGetSubscriptionResponseParams response = PushMessagingGetSubscriptionResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.status), response.subscription);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class PushMessagingGetSubscriptionResponseParamsProxyToResponder implements PushMessaging.GetSubscriptionResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        PushMessagingGetSubscriptionResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Integer status, PushSubscription subscription) {
            PushMessagingGetSubscriptionResponseParams _response = new PushMessagingGetSubscriptionResponseParams();
            _response.status = status.intValue();
            _response.subscription = subscription;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(2, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
