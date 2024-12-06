package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class AnchorElementEnteredViewport extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 24;
    private static final DataHeader[] VERSION_ARRAY;
    public int anchorId;
    public long navigationStartToEnteredViewportMs;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private AnchorElementEnteredViewport(int version) {
        super(24, version);
    }

    public AnchorElementEnteredViewport() {
        this(0);
    }

    public static AnchorElementEnteredViewport deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static AnchorElementEnteredViewport deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static AnchorElementEnteredViewport decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            AnchorElementEnteredViewport result = new AnchorElementEnteredViewport(elementsOrVersion);
            result.anchorId = decoder0.readInt(8);
            result.navigationStartToEnteredViewportMs = decoder0.readLong(16);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.anchorId, 8);
        encoder0.encode(this.navigationStartToEnteredViewportMs, 16);
    }
}
