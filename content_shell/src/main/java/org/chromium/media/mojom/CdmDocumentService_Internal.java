package org.chromium.media.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.media.mojom.CdmDocumentService;
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
class CdmDocumentService_Internal {
    private static final int CHALLENGE_PLATFORM_ORDINAL = 0;
    private static final int GET_STORAGE_ID_ORDINAL = 1;
    public static final Interface.Manager<CdmDocumentService, CdmDocumentService.Proxy> MANAGER = new Interface.Manager<CdmDocumentService, CdmDocumentService.Proxy>() { // from class: org.chromium.media.mojom.CdmDocumentService_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "media.mojom.CdmDocumentService";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public CdmDocumentService.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, CdmDocumentService impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public CdmDocumentService[] buildArray(int size) {
            return new CdmDocumentService[size];
        }
    };

    CdmDocumentService_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements CdmDocumentService.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.media.mojom.CdmDocumentService
        public void challengePlatform(String serviceId, String challenge, ChallengePlatformResponse callback) {
            CdmDocumentServiceChallengePlatformParams _message = new CdmDocumentServiceChallengePlatformParams();
            _message.serviceId = serviceId;
            _message.challenge = challenge;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new CdmDocumentServiceChallengePlatformResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.media.mojom.CdmDocumentService
        public void getStorageId(int version, GetStorageIdResponse callback) {
            CdmDocumentServiceGetStorageIdParams _message = new CdmDocumentServiceGetStorageIdParams();
            _message.version = version;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1, 1, 0L)), new CdmDocumentServiceGetStorageIdResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<CdmDocumentService> {
        Stub(Core core, CdmDocumentService impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(CdmDocumentService_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), CdmDocumentService_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        CdmDocumentServiceChallengePlatformParams data = CdmDocumentServiceChallengePlatformParams.deserialize(messageWithHeader.getPayload());
                        getImpl().challengePlatform(data.serviceId, data.challenge, new CdmDocumentServiceChallengePlatformResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 1:
                        getImpl().getStorageId(CdmDocumentServiceGetStorageIdParams.deserialize(messageWithHeader.getPayload()).version, new CdmDocumentServiceGetStorageIdResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class CdmDocumentServiceChallengePlatformParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public String challenge;
        public String serviceId;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private CdmDocumentServiceChallengePlatformParams(int version) {
            super(24, version);
        }

        public CdmDocumentServiceChallengePlatformParams() {
            this(0);
        }

        public static CdmDocumentServiceChallengePlatformParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static CdmDocumentServiceChallengePlatformParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static CdmDocumentServiceChallengePlatformParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                CdmDocumentServiceChallengePlatformParams result = new CdmDocumentServiceChallengePlatformParams(elementsOrVersion);
                result.serviceId = decoder0.readString(8, false);
                result.challenge = decoder0.readString(16, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.serviceId, 8, false);
            encoder0.encode(this.challenge, 16, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class CdmDocumentServiceChallengePlatformResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 40;
        private static final DataHeader[] VERSION_ARRAY;
        public String platformKeyCertificate;
        public String signedData;
        public String signedDataSignature;
        public boolean success;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private CdmDocumentServiceChallengePlatformResponseParams(int version) {
            super(40, version);
        }

        public CdmDocumentServiceChallengePlatformResponseParams() {
            this(0);
        }

        public static CdmDocumentServiceChallengePlatformResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static CdmDocumentServiceChallengePlatformResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static CdmDocumentServiceChallengePlatformResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                CdmDocumentServiceChallengePlatformResponseParams result = new CdmDocumentServiceChallengePlatformResponseParams(elementsOrVersion);
                result.success = decoder0.readBoolean(8, 0);
                result.signedData = decoder0.readString(16, false);
                result.signedDataSignature = decoder0.readString(24, false);
                result.platformKeyCertificate = decoder0.readString(32, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.success, 8, 0);
            encoder0.encode(this.signedData, 16, false);
            encoder0.encode(this.signedDataSignature, 24, false);
            encoder0.encode(this.platformKeyCertificate, 32, false);
        }
    }

    /* loaded from: classes2.dex */
    static class CdmDocumentServiceChallengePlatformResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final CdmDocumentService.ChallengePlatformResponse mCallback;

        CdmDocumentServiceChallengePlatformResponseParamsForwardToCallback(CdmDocumentService.ChallengePlatformResponse callback) {
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
                CdmDocumentServiceChallengePlatformResponseParams response = CdmDocumentServiceChallengePlatformResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Boolean.valueOf(response.success), response.signedData, response.signedDataSignature, response.platformKeyCertificate);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class CdmDocumentServiceChallengePlatformResponseParamsProxyToResponder implements CdmDocumentService.ChallengePlatformResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        CdmDocumentServiceChallengePlatformResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback4
        public void call(Boolean success, String signedData, String signedDataSignature, String platformKeyCertificate) {
            CdmDocumentServiceChallengePlatformResponseParams _response = new CdmDocumentServiceChallengePlatformResponseParams();
            _response.success = success.booleanValue();
            _response.signedData = signedData;
            _response.signedDataSignature = signedDataSignature;
            _response.platformKeyCertificate = platformKeyCertificate;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class CdmDocumentServiceGetStorageIdParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int version;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private CdmDocumentServiceGetStorageIdParams(int version) {
            super(16, version);
        }

        public CdmDocumentServiceGetStorageIdParams() {
            this(0);
        }

        public static CdmDocumentServiceGetStorageIdParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static CdmDocumentServiceGetStorageIdParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static CdmDocumentServiceGetStorageIdParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                CdmDocumentServiceGetStorageIdParams result = new CdmDocumentServiceGetStorageIdParams(elementsOrVersion);
                result.version = decoder0.readInt(8);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.version, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class CdmDocumentServiceGetStorageIdResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public byte[] storageId;
        public int version;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private CdmDocumentServiceGetStorageIdResponseParams(int version) {
            super(24, version);
        }

        public CdmDocumentServiceGetStorageIdResponseParams() {
            this(0);
        }

        public static CdmDocumentServiceGetStorageIdResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static CdmDocumentServiceGetStorageIdResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static CdmDocumentServiceGetStorageIdResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                CdmDocumentServiceGetStorageIdResponseParams result = new CdmDocumentServiceGetStorageIdResponseParams(elementsOrVersion);
                result.version = decoder0.readInt(8);
                result.storageId = decoder0.readBytes(16, 0, -1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.version, 8);
            encoder0.encode(this.storageId, 16, 0, -1);
        }
    }

    /* loaded from: classes2.dex */
    static class CdmDocumentServiceGetStorageIdResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final CdmDocumentService.GetStorageIdResponse mCallback;

        CdmDocumentServiceGetStorageIdResponseParamsForwardToCallback(CdmDocumentService.GetStorageIdResponse callback) {
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
                CdmDocumentServiceGetStorageIdResponseParams response = CdmDocumentServiceGetStorageIdResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.version), response.storageId);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class CdmDocumentServiceGetStorageIdResponseParamsProxyToResponder implements CdmDocumentService.GetStorageIdResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        CdmDocumentServiceGetStorageIdResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Integer version, byte[] storageId) {
            CdmDocumentServiceGetStorageIdResponseParams _response = new CdmDocumentServiceGetStorageIdResponseParams();
            _response.version = version.intValue();
            _response.storageId = storageId;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(1, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
