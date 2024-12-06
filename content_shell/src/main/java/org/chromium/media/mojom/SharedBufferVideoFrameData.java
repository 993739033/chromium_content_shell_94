package org.chromium.media.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo.system.Handle;
import org.chromium.mojo.system.InvalidHandle;
import org.chromium.mojo.system.SharedBufferHandle;
/* loaded from: classes2.dex */
public final class SharedBufferVideoFrameData extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 40;
    private static final DataHeader[] VERSION_ARRAY;
    public SharedBufferHandle frameData;
    public long frameDataSize;
    public int[] offsets;
    public int[] strides;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private SharedBufferVideoFrameData(int version) {
        super(40, version);
        this.frameData = InvalidHandle.INSTANCE;
    }

    public SharedBufferVideoFrameData() {
        this(0);
    }

    public static SharedBufferVideoFrameData deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static SharedBufferVideoFrameData deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static SharedBufferVideoFrameData decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            SharedBufferVideoFrameData result = new SharedBufferVideoFrameData(elementsOrVersion);
            result.frameData = decoder0.readSharedBufferHandle(8, false);
            result.frameDataSize = decoder0.readLong(16);
            result.strides = decoder0.readInts(24, 0, -1);
            result.offsets = decoder0.readInts(32, 0, -1);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode((Handle) this.frameData, 8, false);
        encoder0.encode(this.frameDataSize, 16);
        encoder0.encode(this.strides, 24, 0, -1);
        encoder0.encode(this.offsets, 32, 0, -1);
    }
}
