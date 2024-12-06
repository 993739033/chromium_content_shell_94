package org.chromium.media.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo.bindings.Union;
import org.chromium.mojo_base.mojom.TimeDelta;
/* loaded from: classes2.dex */
public final class BitstreamBufferMetadata extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 40;
    private static final DataHeader[] VERSION_ARRAY;
    public CodecMetadata codecMetadata;
    public boolean keyFrame;
    public int payloadSizeBytes;
    public TimeDelta timestamp;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private BitstreamBufferMetadata(int version) {
        super(40, version);
    }

    public BitstreamBufferMetadata() {
        this(0);
    }

    public static BitstreamBufferMetadata deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static BitstreamBufferMetadata deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static BitstreamBufferMetadata decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            BitstreamBufferMetadata result = new BitstreamBufferMetadata(elementsOrVersion);
            result.payloadSizeBytes = decoder0.readInt(8);
            result.keyFrame = decoder0.readBoolean(12, 0);
            Decoder decoder1 = decoder0.readPointer(16, false);
            result.timestamp = TimeDelta.decode(decoder1);
            result.codecMetadata = CodecMetadata.decode(decoder0, 24);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.payloadSizeBytes, 8);
        encoder0.encode(this.keyFrame, 12, 0);
        encoder0.encode((Struct) this.timestamp, 16, false);
        encoder0.encode((Union) this.codecMetadata, 24, true);
    }
}
