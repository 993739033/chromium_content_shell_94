package org.chromium.handwriting.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class HandwritingSegment extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 32;
    private static final DataHeader[] VERSION_ARRAY;
    public int beginIndex;
    public HandwritingDrawingSegment[] drawingSegments;
    public int endIndex;
    public String grapheme;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private HandwritingSegment(int version) {
        super(32, version);
    }

    public HandwritingSegment() {
        this(0);
    }

    public static HandwritingSegment deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static HandwritingSegment deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static HandwritingSegment decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            HandwritingSegment result = new HandwritingSegment(elementsOrVersion);
            result.grapheme = decoder0.readString(8, false);
            result.beginIndex = decoder0.readInt(16);
            result.endIndex = decoder0.readInt(20);
            Decoder decoder1 = decoder0.readPointer(24, false);
            DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
            result.drawingSegments = new HandwritingDrawingSegment[si1.elementsOrVersion];
            for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                result.drawingSegments[i1] = HandwritingDrawingSegment.decode(decoder2);
            }
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.grapheme, 8, false);
        encoder0.encode(this.beginIndex, 16);
        encoder0.encode(this.endIndex, 20);
        HandwritingDrawingSegment[] handwritingDrawingSegmentArr = this.drawingSegments;
        if (handwritingDrawingSegmentArr == null) {
            encoder0.encodeNullPointer(24, false);
            return;
        }
        Encoder encoder1 = encoder0.encodePointerArray(handwritingDrawingSegmentArr.length, 24, -1);
        int i0 = 0;
        while (true) {
            HandwritingDrawingSegment[] handwritingDrawingSegmentArr2 = this.drawingSegments;
            if (i0 < handwritingDrawingSegmentArr2.length) {
                encoder1.encode((Struct) handwritingDrawingSegmentArr2[i0], (i0 * 8) + 8, false);
                i0++;
            } else {
                return;
            }
        }
    }
}
