package org.chromium.skia.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo.bindings.Union;
import org.chromium.mojo_base.mojom.BigBuffer;
/* loaded from: classes2.dex */
public final class BitmapMappedFromTrustedProcess extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 40;
    private static final DataHeader[] VERSION_ARRAY;
    public ImageInfo imageInfo;
    public BigBuffer pixelData;
    public long unusedRowBytes;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private BitmapMappedFromTrustedProcess(int version) {
        super(40, version);
    }

    public BitmapMappedFromTrustedProcess() {
        this(0);
    }

    public static BitmapMappedFromTrustedProcess deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static BitmapMappedFromTrustedProcess deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static BitmapMappedFromTrustedProcess decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            BitmapMappedFromTrustedProcess result = new BitmapMappedFromTrustedProcess(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, false);
            result.imageInfo = ImageInfo.decode(decoder1);
            result.unusedRowBytes = decoder0.readLong(16);
            result.pixelData = BigBuffer.decode(decoder0, 24);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode((Struct) this.imageInfo, 8, false);
        encoder0.encode(this.unusedRowBytes, 16);
        encoder0.encode((Union) this.pixelData, 24, false);
    }
}
