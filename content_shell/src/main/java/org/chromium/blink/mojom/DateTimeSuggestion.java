package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo_base.mojom.String16;
/* loaded from: classes2.dex */
public final class DateTimeSuggestion extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 32;
    private static final DataHeader[] VERSION_ARRAY;
    public String16 label;
    public String16 localizedValue;
    public double value;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private DateTimeSuggestion(int version) {
        super(32, version);
    }

    public DateTimeSuggestion() {
        this(0);
    }

    public static DateTimeSuggestion deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static DateTimeSuggestion deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static DateTimeSuggestion decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            DateTimeSuggestion result = new DateTimeSuggestion(elementsOrVersion);
            result.value = decoder0.readDouble(8);
            Decoder decoder1 = decoder0.readPointer(16, false);
            result.localizedValue = String16.decode(decoder1);
            Decoder decoder12 = decoder0.readPointer(24, false);
            result.label = String16.decode(decoder12);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.value, 8);
        encoder0.encode((Struct) this.localizedValue, 16, false);
        encoder0.encode((Struct) this.label, 24, false);
    }
}
