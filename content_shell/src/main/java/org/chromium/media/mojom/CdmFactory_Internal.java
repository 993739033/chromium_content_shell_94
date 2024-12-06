package org.chromium.media.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.media.mojom.CdmFactory;
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
class CdmFactory_Internal {
    private static final int CREATE_CDM_ORDINAL = 0;
    public static final Interface.Manager<CdmFactory, CdmFactory.Proxy> MANAGER = new Interface.Manager<CdmFactory, CdmFactory.Proxy>() { // from class: org.chromium.media.mojom.CdmFactory_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "media.mojom.CdmFactory";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        /* renamed from: buildProxy */
        public CdmFactory.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, CdmFactory impl) {
            return new Stub(core, impl);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public CdmFactory[] buildArray(int size) {
            return new CdmFactory[size];
        }
    };

    CdmFactory_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements CdmFactory.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.media.mojom.CdmFactory
        public void createCdm(String keySystem, CdmConfig cdmConfig, CreateCdmResponse callback) {
            CdmFactoryCreateCdmParams _message = new CdmFactoryCreateCdmParams();
            _message.keySystem = keySystem;
            _message.cdmConfig = cdmConfig;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new CdmFactoryCreateCdmResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<CdmFactory> {
        Stub(Core core, CdmFactory impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(CdmFactory_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), CdmFactory_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        CdmFactoryCreateCdmParams data = CdmFactoryCreateCdmParams.deserialize(messageWithHeader.getPayload());
                        getImpl().createCdm(data.keySystem, data.cdmConfig, new CdmFactoryCreateCdmResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class CdmFactoryCreateCdmParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public CdmConfig cdmConfig;
        public String keySystem;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private CdmFactoryCreateCdmParams(int version) {
            super(24, version);
        }

        public CdmFactoryCreateCdmParams() {
            this(0);
        }

        public static CdmFactoryCreateCdmParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static CdmFactoryCreateCdmParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static CdmFactoryCreateCdmParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                CdmFactoryCreateCdmParams result = new CdmFactoryCreateCdmParams(elementsOrVersion);
                result.keySystem = decoder0.readString(8, false);
                Decoder decoder1 = decoder0.readPointer(16, false);
                result.cdmConfig = CdmConfig.decode(decoder1);
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
            encoder0.encode((Struct) this.cdmConfig, 16, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class CdmFactoryCreateCdmResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 32;
        private static final DataHeader[] VERSION_ARRAY;
        public ContentDecryptionModule cdm;
        public CdmContext cdmContext;
        public String errorMessage;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private CdmFactoryCreateCdmResponseParams(int version) {
            super(32, version);
        }

        public CdmFactoryCreateCdmResponseParams() {
            this(0);
        }

        public static CdmFactoryCreateCdmResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static CdmFactoryCreateCdmResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static CdmFactoryCreateCdmResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                CdmFactoryCreateCdmResponseParams result = new CdmFactoryCreateCdmResponseParams(elementsOrVersion);
                result.cdm = (ContentDecryptionModule) decoder0.readServiceInterface(8, true, ContentDecryptionModule.MANAGER);
                Decoder decoder1 = decoder0.readPointer(16, true);
                result.cdmContext = CdmContext.decode(decoder1);
                result.errorMessage = decoder0.readString(24, false);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode( this.cdm, 8, true,  ContentDecryptionModule.MANAGER);
            encoder0.encode((Struct) this.cdmContext, 16, true);
            encoder0.encode(this.errorMessage, 24, false);
        }
    }

    /* loaded from: classes2.dex */
    static class CdmFactoryCreateCdmResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final CdmFactory.CreateCdmResponse mCallback;

        CdmFactoryCreateCdmResponseParamsForwardToCallback(CdmFactory.CreateCdmResponse callback) {
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
                CdmFactoryCreateCdmResponseParams response = CdmFactoryCreateCdmResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.cdm, response.cdmContext, response.errorMessage);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class CdmFactoryCreateCdmResponseParamsProxyToResponder implements CdmFactory.CreateCdmResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        CdmFactoryCreateCdmResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback3
        public void call(ContentDecryptionModule cdm, CdmContext cdmContext, String errorMessage) {
            CdmFactoryCreateCdmResponseParams _response = new CdmFactoryCreateCdmResponseParams();
            _response.cdm = cdm;
            _response.cdmContext = cdmContext;
            _response.errorMessage = errorMessage;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
