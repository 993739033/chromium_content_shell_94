package org.chromium.handwriting.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class HandwritingFeatureQueryResult extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 24;
    private static final DataHeader[] VERSION_ARRAY;
    public int alternatives;
    public int languages;
    public int segmentationResult;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private HandwritingFeatureQueryResult(int version) {
        super(24, version);
        this.languages = 0;
        this.alternatives = 0;
        this.segmentationResult = 0;
    }

    public HandwritingFeatureQueryResult() {
        this(0);
    }

    public static HandwritingFeatureQueryResult deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static HandwritingFeatureQueryResult deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static HandwritingFeatureQueryResult decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            HandwritingFeatureQueryResult result = new HandwritingFeatureQueryResult(elementsOrVersion);
            int readInt = decoder0.readInt(8);
            result.languages = readInt;
            HandwritingFeatureStatus.validate(readInt);
            result.languages = HandwritingFeatureStatus.toKnownValue(result.languages);
            int readInt2 = decoder0.readInt(12);
            result.alternatives = readInt2;
            HandwritingFeatureStatus.validate(readInt2);
            result.alternatives = HandwritingFeatureStatus.toKnownValue(result.alternatives);
            int readInt3 = decoder0.readInt(16);
            result.segmentationResult = readInt3;
            HandwritingFeatureStatus.validate(readInt3);
            result.segmentationResult = HandwritingFeatureStatus.toKnownValue(result.segmentationResult);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.languages, 8);
        encoder0.encode(this.alternatives, 12);
        encoder0.encode(this.segmentationResult, 16);
    }
}
