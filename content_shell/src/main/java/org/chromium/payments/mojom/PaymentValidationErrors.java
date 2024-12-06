package org.chromium.payments.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class PaymentValidationErrors extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 32;
    private static final DataHeader[] VERSION_ARRAY;
    public String error;
    public PayerErrors payer;
    public AddressErrors shippingAddress;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private PaymentValidationErrors(int version) {
        super(32, version);
    }

    public PaymentValidationErrors() {
        this(0);
    }

    public static PaymentValidationErrors deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static PaymentValidationErrors deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static PaymentValidationErrors decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            PaymentValidationErrors result = new PaymentValidationErrors(elementsOrVersion);
            result.error = decoder0.readString(8, false);
            Decoder decoder1 = decoder0.readPointer(16, false);
            result.payer = PayerErrors.decode(decoder1);
            Decoder decoder12 = decoder0.readPointer(24, false);
            result.shippingAddress = AddressErrors.decode(decoder12);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.error, 8, false);
        encoder0.encode((Struct) this.payer, 16, false);
        encoder0.encode((Struct) this.shippingAddress, 24, false);
    }
}
