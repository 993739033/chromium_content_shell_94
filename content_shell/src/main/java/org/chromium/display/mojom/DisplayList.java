package org.chromium.display.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class DisplayList extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 32;
    private static final DataHeader[] VERSION_ARRAY;
    public long currentId;
    public Display[] displays;
    public long primaryId;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private DisplayList(int version) {
        super(32, version);
    }

    public DisplayList() {
        this(0);
    }

    public static DisplayList deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static DisplayList deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static DisplayList decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            DisplayList result = new DisplayList(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, false);
            DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
            result.displays = new Display[si1.elementsOrVersion];
            for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                result.displays[i1] = Display.decode(decoder2);
            }
            result.primaryId = decoder0.readLong(16);
            result.currentId = decoder0.readLong(24);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        Display[] displayArr = this.displays;
        if (displayArr == null) {
            encoder0.encodeNullPointer(8, false);
        } else {
            Encoder encoder1 = encoder0.encodePointerArray(displayArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                Display[] displayArr2 = this.displays;
                if (i0 >= displayArr2.length) {
                    break;
                }
                encoder1.encode((Struct) displayArr2[i0], (i0 * 8) + 8, false);
                i0++;
            }
        }
        encoder0.encode(this.primaryId, 16);
        encoder0.encode(this.currentId, 24);
    }
}
