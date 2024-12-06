package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.gfx.mojom.Point;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.ui.mojom.DragEventSource;
/* loaded from: classes2.dex */
public final class DragEventSourceInfo extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 24;
    private static final DataHeader[] VERSION_ARRAY;
    public Point location;
    public int source;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private DragEventSourceInfo(int version) {
        super(24, version);
    }

    public DragEventSourceInfo() {
        this(0);
    }

    public static DragEventSourceInfo deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static DragEventSourceInfo deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static DragEventSourceInfo decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            DragEventSourceInfo result = new DragEventSourceInfo(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, false);
            result.location = Point.decode(decoder1);
            int readInt = decoder0.readInt(16);
            result.source = readInt;
            DragEventSource.validate(readInt);
            result.source = DragEventSource.toKnownValue(result.source);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode((Struct) this.location, 8, false);
        encoder0.encode(this.source, 16);
    }
}
