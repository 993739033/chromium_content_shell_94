package org.chromium.payments.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class ItemDetails extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 72;
    private static final DataHeader[] VERSION_ARRAY;
    public String description;
    public String freeTrialPeriod;
    public PaymentCurrencyAmount introductoryPrice;
    public String introductoryPricePeriod;
    public String itemId;
    public PaymentCurrencyAmount price;
    public String subscriptionPeriod;
    public String title;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(72, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private ItemDetails(int version) {
        super(72, version);
    }

    public ItemDetails() {
        this(0);
    }

    public static ItemDetails deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static ItemDetails deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static ItemDetails decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            ItemDetails result = new ItemDetails(elementsOrVersion);
            result.itemId = decoder0.readString(8, false);
            result.title = decoder0.readString(16, false);
            result.description = decoder0.readString(24, false);
            Decoder decoder1 = decoder0.readPointer(32, false);
            result.price = PaymentCurrencyAmount.decode(decoder1);
            result.subscriptionPeriod = decoder0.readString(40, true);
            result.freeTrialPeriod = decoder0.readString(48, true);
            Decoder decoder12 = decoder0.readPointer(56, true);
            result.introductoryPrice = PaymentCurrencyAmount.decode(decoder12);
            result.introductoryPricePeriod = decoder0.readString(64, true);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.itemId, 8, false);
        encoder0.encode(this.title, 16, false);
        encoder0.encode(this.description, 24, false);
        encoder0.encode((Struct) this.price, 32, false);
        encoder0.encode(this.subscriptionPeriod, 40, true);
        encoder0.encode(this.freeTrialPeriod, 48, true);
        encoder0.encode((Struct) this.introductoryPrice, 56, true);
        encoder0.encode(this.introductoryPricePeriod, 64, true);
    }
}
