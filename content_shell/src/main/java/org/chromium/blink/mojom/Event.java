package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo_base.mojom.TimeTicks;
import org.chromium.ui.mojom.LatencyInfo;
/* loaded from: classes2.dex */
public final class Event extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 64;
    private static final DataHeader[] VERSION_ARRAY;
    public GestureData gestureData;
    public KeyData keyData;
    public LatencyInfo latency;
    public int modifiers;
    public PointerData pointerData;
    public TimeTicks timestamp;
    public TouchData touchData;
    public int type;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(64, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private Event(int version) {
        super(64, version);
    }

    public Event() {
        this(0);
    }

    public static Event deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static Event deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static Event decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            Event result = new Event(elementsOrVersion);
            int readInt = decoder0.readInt(8);
            result.type = readInt;
            EventType.validate(readInt);
            result.type = EventType.toKnownValue(result.type);
            result.modifiers = decoder0.readInt(12);
            Decoder decoder1 = decoder0.readPointer(16, false);
            result.timestamp = TimeTicks.decode(decoder1);
            Decoder decoder12 = decoder0.readPointer(24, false);
            result.latency = LatencyInfo.decode(decoder12);
            Decoder decoder13 = decoder0.readPointer(32, true);
            result.keyData = KeyData.decode(decoder13);
            Decoder decoder14 = decoder0.readPointer(40, true);
            result.pointerData = PointerData.decode(decoder14);
            Decoder decoder15 = decoder0.readPointer(48, true);
            result.gestureData = GestureData.decode(decoder15);
            Decoder decoder16 = decoder0.readPointer(56, true);
            result.touchData = TouchData.decode(decoder16);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.type, 8);
        encoder0.encode(this.modifiers, 12);
        encoder0.encode((Struct) this.timestamp, 16, false);
        encoder0.encode((Struct) this.latency, 24, false);
        encoder0.encode((Struct) this.keyData, 32, true);
        encoder0.encode((Struct) this.pointerData, 40, true);
        encoder0.encode((Struct) this.gestureData, 48, true);
        encoder0.encode((Struct) this.touchData, 56, true);
    }
}
