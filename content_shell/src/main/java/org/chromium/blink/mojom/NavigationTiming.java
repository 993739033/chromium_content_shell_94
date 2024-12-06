package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo_base.mojom.TimeTicks;
/* loaded from: classes2.dex */
public final class NavigationTiming extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 32;
    private static final DataHeader[] VERSION_ARRAY;
    public TimeTicks fetchStart;
    public TimeTicks redirectEnd;
    public TimeTicks redirectStart;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private NavigationTiming(int version) {
        super(32, version);
    }

    public NavigationTiming() {
        this(0);
    }

    public static NavigationTiming deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static NavigationTiming deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static NavigationTiming decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            NavigationTiming result = new NavigationTiming(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, false);
            result.redirectStart = TimeTicks.decode(decoder1);
            Decoder decoder12 = decoder0.readPointer(16, false);
            result.redirectEnd = TimeTicks.decode(decoder12);
            Decoder decoder13 = decoder0.readPointer(24, false);
            result.fetchStart = TimeTicks.decode(decoder13);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode((Struct) this.redirectStart, 8, false);
        encoder0.encode((Struct) this.redirectEnd, 16, false);
        encoder0.encode((Struct) this.fetchStart, 24, false);
    }
}
