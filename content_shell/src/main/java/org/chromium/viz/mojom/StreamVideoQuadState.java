package org.chromium.viz.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.gfx.mojom.PointF;
import org.chromium.gfx.mojom.Size;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class StreamVideoQuadState extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 40;
    private static final DataHeader[] VERSION_ARRAY;
    public ResourceId resourceId;
    public Size resourceSizeInPixels;
    public PointF uvBottomRight;
    public PointF uvTopLeft;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private StreamVideoQuadState(int version) {
        super(40, version);
    }

    public StreamVideoQuadState() {
        this(0);
    }

    public static StreamVideoQuadState deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static StreamVideoQuadState deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static StreamVideoQuadState decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            StreamVideoQuadState result = new StreamVideoQuadState(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, false);
            result.resourceId = ResourceId.decode(decoder1);
            Decoder decoder12 = decoder0.readPointer(16, false);
            result.resourceSizeInPixels = Size.decode(decoder12);
            Decoder decoder13 = decoder0.readPointer(24, false);
            result.uvTopLeft = PointF.decode(decoder13);
            Decoder decoder14 = decoder0.readPointer(32, false);
            result.uvBottomRight = PointF.decode(decoder14);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode((Struct) this.resourceId, 8, false);
        encoder0.encode((Struct) this.resourceSizeInPixels, 16, false);
        encoder0.encode((Struct) this.uvTopLeft, 24, false);
        encoder0.encode((Struct) this.uvBottomRight, 32, false);
    }
}
