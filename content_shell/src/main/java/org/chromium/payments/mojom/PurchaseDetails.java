package org.chromium.payments.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo_base.mojom.TimeDelta;
/* loaded from: classes2.dex */
public final class PurchaseDetails extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 40;
    private static final DataHeader[] VERSION_ARRAY;
    public boolean acknowledged;
    public String itemId;
    public int purchaseState;
    public TimeDelta purchaseTime;
    public String purchaseToken;
    public boolean willAutoRenew;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private PurchaseDetails(int version) {
        super(40, version);
    }

    public PurchaseDetails() {
        this(0);
    }

    public static PurchaseDetails deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static PurchaseDetails deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static PurchaseDetails decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            PurchaseDetails result = new PurchaseDetails(elementsOrVersion);
            result.itemId = decoder0.readString(8, false);
            result.purchaseToken = decoder0.readString(16, false);
            result.acknowledged = decoder0.readBoolean(24, 0);
            result.willAutoRenew = decoder0.readBoolean(24, 1);
            int readInt = decoder0.readInt(28);
            result.purchaseState = readInt;
            PurchaseState.validate(readInt);
            result.purchaseState = PurchaseState.toKnownValue(result.purchaseState);
            Decoder decoder1 = decoder0.readPointer(32, false);
            result.purchaseTime = TimeDelta.decode(decoder1);
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
        encoder0.encode(this.purchaseToken, 16, false);
        encoder0.encode(this.acknowledged, 24, 0);
        encoder0.encode(this.willAutoRenew, 24, 1);
        encoder0.encode(this.purchaseState, 28);
        encoder0.encode((Struct) this.purchaseTime, 32, false);
    }
}
