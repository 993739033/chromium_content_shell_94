package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class FontMetadata extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 56;
    private static final DataHeader[] VERSION_ARRAY;
    public String family;
    public String fullName;
    public boolean italic;
    public String postscriptName;
    public float stretch;
    public String style;
    public float weight;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(56, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private FontMetadata(int version) {
        super(56, version);
    }

    public FontMetadata() {
        this(0);
    }

    public static FontMetadata deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static FontMetadata deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static FontMetadata decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            FontMetadata result = new FontMetadata(elementsOrVersion);
            result.postscriptName = decoder0.readString(8, false);
            result.fullName = decoder0.readString(16, false);
            result.family = decoder0.readString(24, false);
            result.style = decoder0.readString(32, false);
            result.italic = decoder0.readBoolean(40, 0);
            result.stretch = decoder0.readFloat(44);
            result.weight = decoder0.readFloat(48);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.postscriptName, 8, false);
        encoder0.encode(this.fullName, 16, false);
        encoder0.encode(this.family, 24, false);
        encoder0.encode(this.style, 32, false);
        encoder0.encode(this.italic, 40, 0);
        encoder0.encode(this.stretch, 44);
        encoder0.encode(this.weight, 48);
    }
}
