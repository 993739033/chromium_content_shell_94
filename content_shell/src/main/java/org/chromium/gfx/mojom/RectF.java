package org.chromium.gfx.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class RectF extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 24;
    private static final DataHeader[] VERSION_ARRAY;
    public float height;
    public float width;
    public float x;
    public float y;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private RectF(int version) {
        super(24, version);
    }

    public RectF() {
        this(0);
    }

    public static RectF deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static RectF deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static RectF decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            RectF result = new RectF(elementsOrVersion);
            result.x = decoder0.readFloat(8);
            result.y = decoder0.readFloat(12);
            result.width = decoder0.readFloat(16);
            result.height = decoder0.readFloat(20);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.x, 8);
        encoder0.encode(this.y, 12);
        encoder0.encode(this.width, 16);
        encoder0.encode(this.height, 20);
    }
}
