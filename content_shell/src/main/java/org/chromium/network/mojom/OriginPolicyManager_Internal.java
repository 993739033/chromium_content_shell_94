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
import org.chromium.network.mojom.OriginPolicyManager;
import org.chromium.url.internal.mojom.Origin;
/* loaded from: classes2.dex */
class OriginPolicyManager_Internal {
    private static final int ADD_EXCEPTION_FOR_ORDINAL = 1;
    public static final Interface.Manager<OriginPolicyManager, OriginPolicyManager.Proxy> MANAGER = new Interface.Manager<OriginPolicyManager, OriginPolicyManager.Proxy>() { // from class: org.chromium.network.mojom.OriginPolicyManager_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "network.mojom.OriginPolicyManager";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public OriginPolicyManager.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, OriginPolicyManager impl) {
            return new Stub(core, impl);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public OriginPolicyManager[] buildArray(int size) {
            return new OriginPolicyManager[size];
        }
    };
    private static final int RETRIEVE_ORIGIN_POLICY_ORDINAL = 0;

    OriginPolicyManager_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements OriginPolicyManager.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.network.mojom.OriginPolicyManager
        public void retrieveOriginPolicy(Origin origin, IsolationInfo isolationInfo, String headerValue, RetrieveOriginPolicyResponse callback) {
            OriginPolicyManagerRetrieveOriginPolicyParams _message = new OriginPolicyManagerRetrieveOriginPolicyParams();
            _message.origin = origin;
            _message.isolationInfo = isolationInfo;
            _message.headerValue = headerValue;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new OriginPolicyManagerRetrieveOriginPolicyResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.network.mojom.OriginPolicyManager
        public void addExceptionFor(Origin origin) {
            OriginPolicyManagerAddExceptionForParams _message = new OriginPolicyManagerAddExceptionForParams();
            _message.origin = origin;
            getProxyHandler().getMessageReceiver().accept(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<OriginPolicyManager> {
        Stub(Core core, OriginPolicyManager impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(OriginPolicyManager_Internal.MANAGER, messageWithHeader);
                    case 1:
                        OriginPolicyManagerAddExceptionForParams data = OriginPolicyManagerAddExceptionForParams.deserialize(messageWithHeader.getPayload());
                        getImpl().addExceptionFor(data.origin);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), OriginPolicyManager_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        OriginPolicyManagerRetrieveOriginPolicyParams data = OriginPolicyManagerRetrieveOriginPolicyParams.deserialize(messageWithHeader.getPayload());
                        getImpl().retrieveOriginPolicy(data.origin, data.isolationInfo, data.headerValue, new OriginPolicyManagerRetrieveOriginPolicyResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class OriginPolicyManagerRetrieveOriginPolicyParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public String headerValue;
        public IsolationInfo isolationInfo;
        public Origin origin;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private OriginPolicyManagerRetrieveOriginPolicyParams(int version) {
            super(32, version);
        }

        public OriginPolicyManagerRetrieveOriginPolicyParams() {
            this(0);
        }

        public static OriginPolicyManagerRetrieveOriginPolicyParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static OriginPolicyManagerRetrieveOriginPolicyParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static OriginPolicyManagerRetrieveOriginPolicyParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                OriginPolicyManagerRetrieveOriginPolicyParams result = new OriginPolicyManagerRetrieveOriginPolicyParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.origin = Origin.decode(decoder1);
                Decoder decoder12 = decoder0.readPointer(16, false);
                result.isolationInfo = IsolationInfo.decode(decoder12);
                result.headerValue = decoder0.readString(24, true);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.origin, 8, false);
            encoder0.encode((Struct) this.isolationInfo, 16, false);
            encoder0.encode(this.headerValue, 24, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class OriginPolicyManagerRetrieveOriginPolicyResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public OriginPolicy originPolicy;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private OriginPolicyManagerRetrieveOriginPolicyResponseParams(int version) {
            super(16, version);
        }

        public OriginPolicyManagerRetrieveOriginPolicyResponseParams() {
            this(0);
        }

        public static OriginPolicyManagerRetrieveOriginPolicyResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static OriginPolicyManagerRetrieveOriginPolicyResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static OriginPolicyManagerRetrieveOriginPolicyResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                OriginPolicyManagerRetrieveOriginPolicyResponseParams result = new OriginPolicyManagerRetrieveOriginPolicyResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.originPolicy = OriginPolicy.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.originPolicy, 8, false);
        }
    }

    /* loaded from: classes2.dex */
    static class OriginPolicyManagerRetrieveOriginPolicyResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final OriginPolicyManager.RetrieveOriginPolicyResponse mCallback;

        OriginPolicyManagerRetrieveOriginPolicyResponseParamsForwardToCallback(OriginPolicyManager.RetrieveOriginPolicyResponse callback) {
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
                OriginPolicyManagerRetrieveOriginPolicyResponseParams response = OriginPolicyManagerRetrieveOriginPolicyResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.originPolicy);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class OriginPolicyManagerRetrieveOriginPolicyResponseParamsProxyToResponder implements OriginPolicyManager.RetrieveOriginPolicyResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        OriginPolicyManagerRetrieveOriginPolicyResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(OriginPolicy originPolicy) {
            OriginPolicyManagerRetrieveOriginPolicyResponseParams _response = new OriginPolicyManagerRetrieveOriginPolicyResponseParams();
            _response.originPolicy = originPolicy;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class OriginPolicyManagerAddExceptionForParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public Origin origin;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private OriginPolicyManagerAddExceptionForParams(int version) {
            super(16, version);
        }

        public OriginPolicyManagerAddExceptionForParams() {
            this(0);
        }

        public static OriginPolicyManagerAddExceptionForParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static OriginPolicyManagerAddExceptionForParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static OriginPolicyManagerAddExceptionForParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                OriginPolicyManagerAddExceptionForParams result = new OriginPolicyManagerAddExceptionForParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.origin = Origin.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.origin, 8, false);
        }
    }
}
