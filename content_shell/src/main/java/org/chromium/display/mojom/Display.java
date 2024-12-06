package org.chromium.display.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.gfx.mojom.DisplayColorSpaces;
import org.chromium.gfx.mojom.Rect;
import org.chromium.gfx.mojom.Size;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class Display extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 88;
    private static final DataHeader[] VERSION_ARRAY;
    public int accelerometerSupport;
    public Rect bounds;
    public int colorDepth;
    public DisplayColorSpaces colorSpaces;
    public int depthPerComponent;
    public float deviceScaleFactor;
    public int displayFrequency;
    public long id;
    public boolean isMonochrome;
    public Size maximumCursorSize;
    public int rotation;
    public Size sizeInPixels;
    public int touchSupport;
    public Rect workArea;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(88, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private Display(int version) {
        super(88, version);
    }

    public Display() {
        this(0);
    }

    public static Display deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static Display deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static Display decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            Display result = new Display(elementsOrVersion);
            result.id = decoder0.readLong(8);
            Decoder decoder1 = decoder0.readPointer(16, false);
            result.bounds = Rect.decode(decoder1);
            Decoder decoder12 = decoder0.readPointer(24, false);
            result.sizeInPixels = Size.decode(decoder12);
            Decoder decoder13 = decoder0.readPointer(32, false);
            result.workArea = Rect.decode(decoder13);
            result.deviceScaleFactor = decoder0.readFloat(40);
            int readInt = decoder0.readInt(44);
            result.rotation = readInt;
            Rotation.validate(readInt);
            result.rotation = Rotation.toKnownValue(result.rotation);
            int readInt2 = decoder0.readInt(48);
            result.touchSupport = readInt2;
            TouchSupport.validate(readInt2);
            result.touchSupport = TouchSupport.toKnownValue(result.touchSupport);
            int readInt3 = decoder0.readInt(52);
            result.accelerometerSupport = readInt3;
            AccelerometerSupport.validate(readInt3);
            result.accelerometerSupport = AccelerometerSupport.toKnownValue(result.accelerometerSupport);
            Decoder decoder14 = decoder0.readPointer(56, false);
            result.maximumCursorSize = Size.decode(decoder14);
            Decoder decoder15 = decoder0.readPointer(64, false);
            result.colorSpaces = DisplayColorSpaces.decode(decoder15);
            result.colorDepth = decoder0.readInt(72);
            result.depthPerComponent = decoder0.readInt(76);
            result.isMonochrome = decoder0.readBoolean(80, 0);
            result.displayFrequency = decoder0.readInt(84);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.id, 8);
        encoder0.encode((Struct) this.bounds, 16, false);
        encoder0.encode((Struct) this.sizeInPixels, 24, false);
        encoder0.encode((Struct) this.workArea, 32, false);
        encoder0.encode(this.deviceScaleFactor, 40);
        encoder0.encode(this.rotation, 44);
        encoder0.encode(this.touchSupport, 48);
        encoder0.encode(this.accelerometerSupport, 52);
        encoder0.encode((Struct) this.maximumCursorSize, 56, false);
        encoder0.encode((Struct) this.colorSpaces, 64, false);
        encoder0.encode(this.colorDepth, 72);
        encoder0.encode(this.depthPerComponent, 76);
        encoder0.encode(this.isMonochrome, 80, 0);
        encoder0.encode(this.displayFrequency, 84);
    }
}
