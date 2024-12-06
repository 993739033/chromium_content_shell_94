package org.chromium.payments.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class GooglePaymentMethodData extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 24;
    private static final DataHeader[] VERSION_ARRAY;
    public boolean emailRequested;
    public boolean nameRequested;
    public boolean phoneRequested;
    public boolean shippingRequested;
    public String stringifiedData;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private GooglePaymentMethodData(int version) {
        super(24, version);
    }

    public GooglePaymentMethodData() {
        this(0);
    }

    public static GooglePaymentMethodData deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static GooglePaymentMethodData deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static GooglePaymentMethodData decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            GooglePaymentMethodData result = new GooglePaymentMethodData(elementsOrVersion);
            result.stringifiedData = decoder0.readString(8, false);
            result.phoneRequested = decoder0.readBoolean(16, 0);
            result.nameRequested = decoder0.readBoolean(16, 1);
            result.emailRequested = decoder0.readBoolean(16, 2);
            result.shippingRequested = decoder0.readBoolean(16, 3);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.stringifiedData, 8, false);
        encoder0.encode(this.phoneRequested, 16, 0);
        encoder0.encode(this.nameRequested, 16, 1);
        encoder0.encode(this.emailRequested, 16, 2);
        encoder0.encode(this.shippingRequested, 16, 3);
    }
}
