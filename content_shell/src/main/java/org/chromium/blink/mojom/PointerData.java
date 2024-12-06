package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.gfx.mojom.PointF;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.ui.mojom.EventPointerType;
/* loaded from: classes2.dex */
public final class PointerData extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 80;
    private static final DataHeader[] VERSION_ARRAY;
    public int button;
    public float force;
    public boolean isRawMovementEvent;
    public MouseData mouseData;
    public int movementX;
    public int movementY;
    public int pointerId;
    public int pointerType;
    public PointF screenPosition;
    public float tangentialPressure;
    public int tiltX;
    public int tiltY;
    public int twist;
    public PointF widgetPosition;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(80, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private PointerData(int version) {
        super(80, version);
    }

    public PointerData() {
        this(0);
    }

    public static PointerData deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static PointerData deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static PointerData decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            PointerData result = new PointerData(elementsOrVersion);
            result.pointerId = decoder0.readInt(8);
            result.force = decoder0.readFloat(12);
            result.tiltX = decoder0.readInt(16);
            result.tiltY = decoder0.readInt(20);
            result.tangentialPressure = decoder0.readFloat(24);
            result.twist = decoder0.readInt(28);
            int readInt = decoder0.readInt(32);
            result.button = readInt;
            Button.validate(readInt);
            result.button = Button.toKnownValue(result.button);
            int readInt2 = decoder0.readInt(36);
            result.pointerType = readInt2;
            EventPointerType.validate(readInt2);
            result.pointerType = EventPointerType.toKnownValue(result.pointerType);
            result.movementX = decoder0.readInt(40);
            result.movementY = decoder0.readInt(44);
            result.isRawMovementEvent = decoder0.readBoolean(48, 0);
            Decoder decoder1 = decoder0.readPointer(56, false);
            result.widgetPosition = PointF.decode(decoder1);
            Decoder decoder12 = decoder0.readPointer(64, false);
            result.screenPosition = PointF.decode(decoder12);
            Decoder decoder13 = decoder0.readPointer(72, true);
            result.mouseData = MouseData.decode(decoder13);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.pointerId, 8);
        encoder0.encode(this.force, 12);
        encoder0.encode(this.tiltX, 16);
        encoder0.encode(this.tiltY, 20);
        encoder0.encode(this.tangentialPressure, 24);
        encoder0.encode(this.twist, 28);
        encoder0.encode(this.button, 32);
        encoder0.encode(this.pointerType, 36);
        encoder0.encode(this.movementX, 40);
        encoder0.encode(this.movementY, 44);
        encoder0.encode(this.isRawMovementEvent, 48, 0);
        encoder0.encode((Struct) this.widgetPosition, 56, false);
        encoder0.encode((Struct) this.screenPosition, 64, false);
        encoder0.encode((Struct) this.mouseData, 72, true);
    }
}
