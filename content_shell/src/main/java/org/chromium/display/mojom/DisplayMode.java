package org.chromium.display.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.gfx.mojom.Size;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class DisplayMode extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 24;
    private static final DataHeader[] VERSION_ARRAY;
    public boolean isInterlaced;
    public float refreshRate;
    public Size size;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private DisplayMode(int version) {
        super(24, version);
    }

    public DisplayMode() {
        this(0);
    }

    public static DisplayMode deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static DisplayMode deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static DisplayMode decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            DisplayMode result = new DisplayMode(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, false);
            result.size = Size.decode(decoder1);
            result.isInterlaced = decoder0.readBoolean(16, 0);
            result.refreshRate = decoder0.readFloat(20);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode((Struct) this.size, 8, false);
        encoder0.encode(this.isInterlaced, 16, 0);
        encoder0.encode(this.refreshRate, 20);
    }
}
