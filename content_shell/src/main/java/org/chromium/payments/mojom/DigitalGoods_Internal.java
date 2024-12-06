package org.chromium.payments.mojom;

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
import org.chromium.payments.mojom.DigitalGoods;
/* loaded from: classes2.dex */
class DigitalGoods_Internal {
    private static final int ACKNOWLEDGE_ORDINAL = 1;
    private static final int GET_DETAILS_ORDINAL = 0;
    private static final int LIST_PURCHASES_ORDINAL = 2;
    public static final Interface.Manager<DigitalGoods, DigitalGoods.Proxy> MANAGER = new Interface.Manager<DigitalGoods, DigitalGoods.Proxy>() { // from class: org.chromium.payments.mojom.DigitalGoods_Internal.1
        @Override // org.chromium.mojo.bindings.Interface.Manager
        public String getName() {
            return "payments.mojom.DigitalGoods";
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public int getVersion() {
            return 0;
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public DigitalGoods.Proxy buildProxy(Core core, MessageReceiverWithResponder messageReceiver) {
            return new Proxy(core, messageReceiver);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public Stub buildStub(Core core, DigitalGoods impl) {
            return new Stub(core, impl);
        }

        @Override // org.chromium.mojo.bindings.Interface.Manager
        public DigitalGoods[] buildArray(int size) {
            return new DigitalGoods[size];
        }
    };

    DigitalGoods_Internal() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Proxy extends Interface.AbstractProxy implements DigitalGoods.Proxy {
        @Override // org.chromium.mojo.bindings.Interface.AbstractProxy, org.chromium.mojo.bindings.Interface.Proxy
        public /* bridge */ /* synthetic */ HandlerImpl getProxyHandler() {
            return super.getProxyHandler();
        }

        Proxy(Core core, MessageReceiverWithResponder messageReceiver) {
            super(core, messageReceiver);
        }

        @Override // org.chromium.payments.mojom.DigitalGoods
        public void getDetails(String[] itemIds, GetDetailsResponse callback) {
            DigitalGoodsGetDetailsParams _message = new DigitalGoodsGetDetailsParams();
            _message.itemIds = itemIds;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(0, 1, 0L)), new DigitalGoodsGetDetailsResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.payments.mojom.DigitalGoods
        public void acknowledge(String purchaseToken, boolean makeAvailableAgain, AcknowledgeResponse callback) {
            DigitalGoodsAcknowledgeParams _message = new DigitalGoodsAcknowledgeParams();
            _message.purchaseToken = purchaseToken;
            _message.makeAvailableAgain = makeAvailableAgain;
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(1, 1, 0L)), new DigitalGoodsAcknowledgeResponseParamsForwardToCallback(callback));
        }

        @Override // org.chromium.payments.mojom.DigitalGoods
        public void listPurchases(ListPurchasesResponse callback) {
            DigitalGoodsListPurchasesParams _message = new DigitalGoodsListPurchasesParams();
            getProxyHandler().getMessageReceiver().acceptWithResponder(_message.serializeWithHeader(getProxyHandler().getCore(), new MessageHeader(2, 1, 0L)), new DigitalGoodsListPurchasesResponseParamsForwardToCallback(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class Stub extends Interface.Stub<DigitalGoods> {
        Stub(Core core, DigitalGoods impl) {
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
                        return InterfaceControlMessagesHelper.handleRunOrClosePipe(DigitalGoods_Internal.MANAGER, messageWithHeader);
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
                        return InterfaceControlMessagesHelper.handleRun(getCore(), DigitalGoods_Internal.MANAGER, messageWithHeader, receiver);
                    case 0:
                        getImpl().getDetails(DigitalGoodsGetDetailsParams.deserialize(messageWithHeader.getPayload()).itemIds, new DigitalGoodsGetDetailsResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 1:
                        DigitalGoodsAcknowledgeParams data = DigitalGoodsAcknowledgeParams.deserialize(messageWithHeader.getPayload());
                        getImpl().acknowledge(data.purchaseToken, data.makeAvailableAgain, new DigitalGoodsAcknowledgeResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
                        return true;
                    case 2:
                        DigitalGoodsListPurchasesParams.deserialize(messageWithHeader.getPayload());
                        getImpl().listPurchases(new DigitalGoodsListPurchasesResponseParamsProxyToResponder(getCore(), receiver, header.getRequestId()));
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
    static final class DigitalGoodsGetDetailsParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public String[] itemIds;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private DigitalGoodsGetDetailsParams(int version) {
            super(16, version);
        }

        public DigitalGoodsGetDetailsParams() {
            this(0);
        }

        public static DigitalGoodsGetDetailsParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static DigitalGoodsGetDetailsParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static DigitalGoodsGetDetailsParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                DigitalGoodsGetDetailsParams result = new DigitalGoodsGetDetailsParams(elementsOrVersion);
                Decoder decoder1 = decoder0.readPointer(8, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.itemIds = new String[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    result.itemIds[i1] = decoder1.readString((i1 * 8) + 8, false);
                }
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            String[] strArr = this.itemIds;
            if (strArr == null) {
                encoder0.encodeNullPointer(8, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(strArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                String[] strArr2 = this.itemIds;
                if (i0 < strArr2.length) {
                    encoder1.encode(strArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class DigitalGoodsGetDetailsResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public int code;
        public ItemDetails[] itemDetailsList;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private DigitalGoodsGetDetailsResponseParams(int version) {
            super(24, version);
        }

        public DigitalGoodsGetDetailsResponseParams() {
            this(0);
        }

        public static DigitalGoodsGetDetailsResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static DigitalGoodsGetDetailsResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static DigitalGoodsGetDetailsResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                DigitalGoodsGetDetailsResponseParams result = new DigitalGoodsGetDetailsResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.code = readInt;
                BillingResponseCode.validate(readInt);
                result.code = BillingResponseCode.toKnownValue(result.code);
                Decoder decoder1 = decoder0.readPointer(16, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.itemDetailsList = new ItemDetails[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.itemDetailsList[i1] = ItemDetails.decode(decoder2);
                }
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.code, 8);
            ItemDetails[] itemDetailsArr = this.itemDetailsList;
            if (itemDetailsArr == null) {
                encoder0.encodeNullPointer(16, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(itemDetailsArr.length, 16, -1);
            int i0 = 0;
            while (true) {
                ItemDetails[] itemDetailsArr2 = this.itemDetailsList;
                if (i0 < itemDetailsArr2.length) {
                    encoder1.encode((Struct) itemDetailsArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static class DigitalGoodsGetDetailsResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final DigitalGoods.GetDetailsResponse mCallback;

        DigitalGoodsGetDetailsResponseParamsForwardToCallback(DigitalGoods.GetDetailsResponse callback) {
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
                DigitalGoodsGetDetailsResponseParams response = DigitalGoodsGetDetailsResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.code), response.itemDetailsList);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class DigitalGoodsGetDetailsResponseParamsProxyToResponder implements DigitalGoods.GetDetailsResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        DigitalGoodsGetDetailsResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Integer code, ItemDetails[] itemDetailsList) {
            DigitalGoodsGetDetailsResponseParams _response = new DigitalGoodsGetDetailsResponseParams();
            _response.code = code.intValue();
            _response.itemDetailsList = itemDetailsList;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(0, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class DigitalGoodsAcknowledgeParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public boolean makeAvailableAgain;
        public String purchaseToken;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private DigitalGoodsAcknowledgeParams(int version) {
            super(24, version);
        }

        public DigitalGoodsAcknowledgeParams() {
            this(0);
        }

        public static DigitalGoodsAcknowledgeParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static DigitalGoodsAcknowledgeParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static DigitalGoodsAcknowledgeParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                DigitalGoodsAcknowledgeParams result = new DigitalGoodsAcknowledgeParams(elementsOrVersion);
                result.purchaseToken = decoder0.readString(8, false);
                result.makeAvailableAgain = decoder0.readBoolean(16, 0);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.purchaseToken, 8, false);
            encoder0.encode(this.makeAvailableAgain, 16, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class DigitalGoodsAcknowledgeResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 16;
        private static final DataHeader[] VERSION_ARRAY;
        public int code;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private DigitalGoodsAcknowledgeResponseParams(int version) {
            super(16, version);
        }

        public DigitalGoodsAcknowledgeResponseParams() {
            this(0);
        }

        public static DigitalGoodsAcknowledgeResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static DigitalGoodsAcknowledgeResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static DigitalGoodsAcknowledgeResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                DigitalGoodsAcknowledgeResponseParams result = new DigitalGoodsAcknowledgeResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.code = readInt;
                BillingResponseCode.validate(readInt);
                result.code = BillingResponseCode.toKnownValue(result.code);
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.code, 8);
        }
    }

    /* loaded from: classes2.dex */
    static class DigitalGoodsAcknowledgeResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final DigitalGoods.AcknowledgeResponse mCallback;

        DigitalGoodsAcknowledgeResponseParamsForwardToCallback(DigitalGoods.AcknowledgeResponse callback) {
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
                DigitalGoodsAcknowledgeResponseParams response = DigitalGoodsAcknowledgeResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.code));
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class DigitalGoodsAcknowledgeResponseParamsProxyToResponder implements DigitalGoods.AcknowledgeResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        DigitalGoodsAcknowledgeResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback1
        public void call(Integer code) {
            DigitalGoodsAcknowledgeResponseParams _response = new DigitalGoodsAcknowledgeResponseParams();
            _response.code = code.intValue();
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(1, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }

    /* loaded from: classes2.dex */
    static final class DigitalGoodsListPurchasesParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 8;
        private static final DataHeader[] VERSION_ARRAY;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(8, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private DigitalGoodsListPurchasesParams(int version) {
            super(8, version);
        }

        public DigitalGoodsListPurchasesParams() {
            this(0);
        }

        public static DigitalGoodsListPurchasesParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static DigitalGoodsListPurchasesParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static DigitalGoodsListPurchasesParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                DigitalGoodsListPurchasesParams result = new DigitalGoodsListPurchasesParams(elementsOrVersion);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class DigitalGoodsListPurchasesResponseParams extends Struct {
        private static final DataHeader DEFAULT_STRUCT_INFO;
        private static final int STRUCT_SIZE = 24;
        private static final DataHeader[] VERSION_ARRAY;
        public int code;
        public PurchaseDetails[] purchaseDetailsList;

        static {
            DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
            VERSION_ARRAY = dataHeaderArr;
            DEFAULT_STRUCT_INFO = dataHeaderArr[0];
        }

        private DigitalGoodsListPurchasesResponseParams(int version) {
            super(24, version);
        }

        public DigitalGoodsListPurchasesResponseParams() {
            this(0);
        }

        public static DigitalGoodsListPurchasesResponseParams deserialize(Message message) {
            return decode(new Decoder(message));
        }

        public static DigitalGoodsListPurchasesResponseParams deserialize(ByteBuffer data) {
            return deserialize(new Message(data, new ArrayList()));
        }

        public static DigitalGoodsListPurchasesResponseParams decode(Decoder decoder0) {
            if (decoder0 == null) {
                return null;
            }
            decoder0.increaseStackDepth();
            try {
                DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
                int elementsOrVersion = mainDataHeader.elementsOrVersion;
                DigitalGoodsListPurchasesResponseParams result = new DigitalGoodsListPurchasesResponseParams(elementsOrVersion);
                int readInt = decoder0.readInt(8);
                result.code = readInt;
                BillingResponseCode.validate(readInt);
                result.code = BillingResponseCode.toKnownValue(result.code);
                Decoder decoder1 = decoder0.readPointer(16, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.purchaseDetailsList = new PurchaseDetails[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.purchaseDetailsList[i1] = PurchaseDetails.decode(decoder2);
                }
                return result;
            } finally {
                decoder0.decreaseStackDepth();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.chromium.mojo.bindings.Struct
        public final void encode(Encoder encoder) {
            Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
            encoder0.encode(this.code, 8);
            PurchaseDetails[] purchaseDetailsArr = this.purchaseDetailsList;
            if (purchaseDetailsArr == null) {
                encoder0.encodeNullPointer(16, false);
                return;
            }
            Encoder encoder1 = encoder0.encodePointerArray(purchaseDetailsArr.length, 16, -1);
            int i0 = 0;
            while (true) {
                PurchaseDetails[] purchaseDetailsArr2 = this.purchaseDetailsList;
                if (i0 < purchaseDetailsArr2.length) {
                    encoder1.encode((Struct) purchaseDetailsArr2[i0], (i0 * 8) + 8, false);
                    i0++;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static class DigitalGoodsListPurchasesResponseParamsForwardToCallback extends SideEffectFreeCloseable implements MessageReceiver {
        private final DigitalGoods.ListPurchasesResponse mCallback;

        DigitalGoodsListPurchasesResponseParamsForwardToCallback(DigitalGoods.ListPurchasesResponse callback) {
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
                DigitalGoodsListPurchasesResponseParams response = DigitalGoodsListPurchasesResponseParams.deserialize(messageWithHeader.getPayload());
                this.mCallback.call(Integer.valueOf(response.code), response.purchaseDetailsList);
                return true;
            } catch (DeserializationException e) {
                return false;
            }
        }
    }

    /* loaded from: classes2.dex */
    static class DigitalGoodsListPurchasesResponseParamsProxyToResponder implements DigitalGoods.ListPurchasesResponse {
        private final Core mCore;
        private final MessageReceiver mMessageReceiver;
        private final long mRequestId;

        DigitalGoodsListPurchasesResponseParamsProxyToResponder(Core core, MessageReceiver messageReceiver, long requestId) {
            this.mCore = core;
            this.mMessageReceiver = messageReceiver;
            this.mRequestId = requestId;
        }

        @Override // org.chromium.mojo.bindings.Callbacks.Callback2
        public void call(Integer code, PurchaseDetails[] purchaseDetailsList) {
            DigitalGoodsListPurchasesResponseParams _response = new DigitalGoodsListPurchasesResponseParams();
            _response.code = code.intValue();
            _response.purchaseDetailsList = purchaseDetailsList;
            ServiceMessage _message = _response.serializeWithHeader(this.mCore, new MessageHeader(2, 2, this.mRequestId));
            this.mMessageReceiver.accept(_message);
        }
    }
}
