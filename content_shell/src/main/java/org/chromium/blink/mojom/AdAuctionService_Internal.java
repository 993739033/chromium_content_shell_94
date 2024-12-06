package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;

import org.chromium.blink.mojom.AdAuctionService;
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
import org.chromium.url.mojom.Url;

/* loaded from: classes2.dex */
class AdAuctionService_Internal {
    public static final Interface.Manager<AdAuctionService, AdAuctionService.Proxy> MANAGER
            = new Interface.Manager<AdAuctionService, AdAuctionService.Proxy>() { // from class: org.chromium.blink.mojom.AdAuctionService_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "blink.mojom.AdAuctionService";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

//        @Override // org.chromium.mojo.bindings.Interface.Manager
//        /* renamed from: buildProxy */
//        public AdAuctionService.Proxy buildProxy2(Core core, MessageReceiverWithResponder messageReceiver) {
//            return new Proxy(core, messageReceiver);
//        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, AdAuctionService impl) {
            return new Stub(core, impl);
        }

        @Override
        protected AdAuctionService.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public AdAuctionService[] buildArray(int size) {
            return new AdAuctionService[size];
        }
    };
    private static final int RUN_AD_AUCTION_ORDINAL = 0;

    AdAuctionService_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements AdAuctionService.Proxy {
        @Override
        // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.blink.mojom.AdAuctionService
        public void runAdAuction(AuctionAdConfig config, RunAdAuctionResponse callback) {
            AdAuctionServiceRunAdAuctionParams _message = new AdAuctionServiceRunAdAuctionParams();
            _message.config = config;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new AdAuctionServiceRunAdAuctionResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<AdAuctionService> {
        Stub(Core core, AdAuctionService impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(AdAuctionService_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), AdAuctionService_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        AdAuctionServiceRunAdAuctionParams data = AdAuctionServiceRunAdAuctionParams.deserialize(messageWithHeader.getPayload());
                        getImpl().runAdAuction(data.config, new AdAuctionServiceRunAdAuctionResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class AdAuctionServiceRunAdAuctionParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public AuctionAdConfig config;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private AdAuctionServiceRunAdAuctionParams(int version) {
            super(16, version);
        }

        public AdAuctionServiceRunAdAuctionParams() {
            this(0);
        }

        public static AdAuctionServiceRunAdAuctionParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static AdAuctionServiceRunAdAuctionParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static AdAuctionServiceRunAdAuctionParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                AdAuctionServiceRunAdAuctionParams result = new AdAuctionServiceRunAdAuctionParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                result.config = AuctionAdConfig.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.config, 8, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class AdAuctionServiceRunAdAuctionResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public Url adDisplayUrl;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private AdAuctionServiceRunAdAuctionResponseParams(int version) {
            super(16, version);
        }

        public AdAuctionServiceRunAdAuctionResponseParams() {
            this(0);
        }

        public static AdAuctionServiceRunAdAuctionResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static AdAuctionServiceRunAdAuctionResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static AdAuctionServiceRunAdAuctionResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                AdAuctionServiceRunAdAuctionResponseParams result = new AdAuctionServiceRunAdAuctionResponseParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, true);
                result.adDisplayUrl = Url.decode(decoder1);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode((Struct) this.adDisplayUrl, 8, true);
        }
    }

    /* loaded from: classes2.dex */
    static class AdAuctionServiceRunAdAuctionResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final AdAuctionService.RunAdAuctionResponse mCallback;

        AdAuctionServiceRunAdAuctionResponseParamsForwardToCallback(AdAuctionService.RunAdAuctionResponse callback) {
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
                AdAuctionServiceRunAdAuctionResponseParams response = AdAuctionServiceRunAdAuctionResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(response.adDisplayUrl);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class AdAuctionServiceRunAdAuctionResponseParamsProxyToResponder implements AdAuctionService.RunAdAuctionResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        AdAuctionServiceRunAdAuctionResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Url adDisplayUrl) {
            AdAuctionServiceRunAdAuctionResponseParams _response = new AdAuctionServiceRunAdAuctionResponseParams();
            _response.adDisplayUrl = adDisplayUrl;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
