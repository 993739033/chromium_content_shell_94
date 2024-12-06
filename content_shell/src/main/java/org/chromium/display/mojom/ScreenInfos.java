package org.chromium.display.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class ScreenInfos extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 24;
    private static final DataHeader[] VERSION_ARRAY;
    public long currentDisplayId;
    public ScreenInfo[] screenInfos;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private ScreenInfos(int version) {
        super(24, version);
    }

    public ScreenInfos() {
        this(0);
    }

    public static ScreenInfos deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static ScreenInfos deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static ScreenInfos decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            ScreenInfos result = new ScreenInfos(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, false);
            DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
            result.screenInfos = new ScreenInfo[si1.elementsOrVersion];
            for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                result.screenInfos[i1] = ScreenInfo.decode(decoder2);
            }
            result.currentDisplayId = decoder0.readLong(16);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        ScreenInfo[] screenInfoArr = this.screenInfos;
        if (screenInfoArr == null) {
            encoder0.encodeNullPointer(8, false);
        } else {
            Encoder encoder1 = encoder0.encodePointerArray(screenInfoArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                ScreenInfo[] screenInfoArr2 = this.screenInfos;
                if (i0 >= screenInfoArr2.length) {
                    break;
                }
                encoder1.encode((Struct) screenInfoArr2[i0], (i0 * 8) + 8, false);
                i0++;
            }
        }
        encoder0.encode(this.currentDisplayId, 16);
    }
}
