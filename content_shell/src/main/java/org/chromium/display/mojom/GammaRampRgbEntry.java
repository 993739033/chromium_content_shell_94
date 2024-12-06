package org.chromium.display.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class GammaRampRgbEntry extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 16;
    private static final DataHeader[] VERSION_ARRAY;
    public short b;
    public short g;
    public short r;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private GammaRampRgbEntry(int version) {
        super(16, version);
    }

    public GammaRampRgbEntry() {
        this(0);
    }

    public static GammaRampRgbEntry deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static GammaRampRgbEntry deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static GammaRampRgbEntry decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            GammaRampRgbEntry result = new GammaRampRgbEntry(elementsOrVersion);
            result.r = decoder0.readShort(8);
            result.g = decoder0.readShort(10);
            result.b = decoder0.readShort(12);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.r, 8);
        encoder0.encode(this.g, 10);
        encoder0.encode(this.b, 12);
    }
}
