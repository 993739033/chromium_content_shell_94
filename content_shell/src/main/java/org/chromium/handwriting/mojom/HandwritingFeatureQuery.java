package org.chromium.handwriting.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class HandwritingFeatureQuery extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 24;
    private static final DataHeader[] VERSION_ARRAY;
    public boolean alternatives;
    public String[] languages;
    public boolean segmentationResult;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private HandwritingFeatureQuery(int version) {
        super(24, version);
    }

    public HandwritingFeatureQuery() {
        this(0);
    }

    public static HandwritingFeatureQuery deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static HandwritingFeatureQuery deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static HandwritingFeatureQuery decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            HandwritingFeatureQuery result = new HandwritingFeatureQuery(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, false);
            DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
            result.languages = new String[si1.elementsOrVersion];
            for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                result.languages[i1] = decoder1.readString((i1 * 8) + 8, false);
            }
            result.alternatives = decoder0.readBoolean(16, 0);
            result.segmentationResult = decoder0.readBoolean(16, 1);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        String[] strArr = this.languages;
        if (strArr == null) {
            encoder0.encodeNullPointer(8, false);
        } else {
            Encoder encoder1 = encoder0.encodePointerArray(strArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                String[] strArr2 = this.languages;
                if (i0 >= strArr2.length) {
                    break;
                }
                encoder1.encode(strArr2[i0], (i0 * 8) + 8, false);
                i0++;
            }
        }
        encoder0.encode(this.alternatives, 16, 0);
        encoder0.encode(this.segmentationResult, 16, 1);
    }
}
