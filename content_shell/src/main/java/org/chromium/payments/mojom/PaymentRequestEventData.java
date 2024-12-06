package org.chromium.payments.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public final class PaymentRequestEventData extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 88;
    private static final DataHeader[] VERSION_ARRAY;
    public String instrumentKey;
    public PaymentMethodData[] methodData;
    public PaymentDetailsModifier[] modifiers;
    public PaymentHandlerHost paymentHandlerHost;
    public PaymentOptions paymentOptions;
    public String paymentRequestId;
    public Url paymentRequestOrigin;
    public PaymentShippingOption[] shippingOptions;
    public Url topOrigin;
    public PaymentCurrencyAmount total;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(88, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private PaymentRequestEventData(int version) {
        super(88, version);
    }

    public PaymentRequestEventData() {
        this(0);
    }

    public static PaymentRequestEventData deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static PaymentRequestEventData deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static PaymentRequestEventData decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            PaymentRequestEventData result = new PaymentRequestEventData(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, false);
            result.topOrigin = Url.decode(decoder1);
            Decoder decoder12 = decoder0.readPointer(16, false);
            result.paymentRequestOrigin = Url.decode(decoder12);
            result.paymentRequestId = decoder0.readString(24, false);
            Decoder decoder13 = decoder0.readPointer(32, false);
            DataHeader si1 = decoder13.readDataHeaderForPointerArray(-1);
            result.methodData = new PaymentMethodData[si1.elementsOrVersion];
            for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                Decoder decoder2 = decoder13.readPointer((i1 * 8) + 8, false);
                result.methodData[i1] = PaymentMethodData.decode(decoder2);
            }
            Decoder decoder14 = decoder0.readPointer(40, false);
            result.total = PaymentCurrencyAmount.decode(decoder14);
            Decoder decoder15 = decoder0.readPointer(48, false);
            DataHeader si12 = decoder15.readDataHeaderForPointerArray(-1);
            result.modifiers = new PaymentDetailsModifier[si12.elementsOrVersion];
            for (int i12 = 0; i12 < si12.elementsOrVersion; i12++) {
                Decoder decoder22 = decoder15.readPointer((i12 * 8) + 8, false);
                result.modifiers[i12] = PaymentDetailsModifier.decode(decoder22);
            }
            result.instrumentKey = decoder0.readString(56, false);
            Decoder decoder16 = decoder0.readPointer(64, true);
            result.paymentOptions = PaymentOptions.decode(decoder16);
            Decoder decoder17 = decoder0.readPointer(72, true);
            if (decoder17 == null) {
                result.shippingOptions = null;
            } else {
                DataHeader si13 = decoder17.readDataHeaderForPointerArray(-1);
                result.shippingOptions = new PaymentShippingOption[si13.elementsOrVersion];
                for (int i13 = 0; i13 < si13.elementsOrVersion; i13++) {
                    Decoder decoder23 = decoder17.readPointer((i13 * 8) + 8, false);
                    result.shippingOptions[i13] = PaymentShippingOption.decode(decoder23);
                }
            }
            result.paymentHandlerHost = (PaymentHandlerHost) decoder0.readServiceInterface(80, true, PaymentHandlerHost.MANAGER);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode((Struct) this.topOrigin, 8, false);
        encoder0.encode((Struct) this.paymentRequestOrigin, 16, false);
        encoder0.encode(this.paymentRequestId, 24, false);
        PaymentMethodData[] paymentMethodDataArr = this.methodData;
        if (paymentMethodDataArr == null) {
            encoder0.encodeNullPointer(32, false);
        } else {
            Encoder encoder1 = encoder0.encodePointerArray(paymentMethodDataArr.length, 32, -1);
            int i0 = 0;
            while (true) {
                PaymentMethodData[] paymentMethodDataArr2 = this.methodData;
                if (i0 >= paymentMethodDataArr2.length) {
                    break;
                }
                encoder1.encode((Struct) paymentMethodDataArr2[i0], (i0 * 8) + 8, false);
                i0++;
            }
        }
        encoder0.encode((Struct) this.total, 40, false);
        PaymentDetailsModifier[] paymentDetailsModifierArr = this.modifiers;
        if (paymentDetailsModifierArr == null) {
            encoder0.encodeNullPointer(48, false);
        } else {
            Encoder encoder12 = encoder0.encodePointerArray(paymentDetailsModifierArr.length, 48, -1);
            int i02 = 0;
            while (true) {
                PaymentDetailsModifier[] paymentDetailsModifierArr2 = this.modifiers;
                if (i02 >= paymentDetailsModifierArr2.length) {
                    break;
                }
                encoder12.encode((Struct) paymentDetailsModifierArr2[i02], (i02 * 8) + 8, false);
                i02++;
            }
        }
        encoder0.encode(this.instrumentKey, 56, false);
        encoder0.encode((Struct) this.paymentOptions, 64, true);
        PaymentShippingOption[] paymentShippingOptionArr = this.shippingOptions;
        if (paymentShippingOptionArr == null) {
            encoder0.encodeNullPointer(72, true);
        } else {
            Encoder encoder13 = encoder0.encodePointerArray(paymentShippingOptionArr.length, 72, -1);
            int i03 = 0;
            while (true) {
                PaymentShippingOption[] paymentShippingOptionArr2 = this.shippingOptions;
                if (i03 >= paymentShippingOptionArr2.length) {
                    break;
                }
                encoder13.encode((Struct) paymentShippingOptionArr2[i03], (i03 * 8) + 8, false);
                i03++;
            }
        }
        encoder0.encode(this.paymentHandlerHost, 80, true,  PaymentHandlerHost.MANAGER);
    }
}
