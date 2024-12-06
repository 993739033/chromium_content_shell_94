package org.chromium.viz.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.gfx.mojom.PointF;
import org.chromium.gfx.mojom.Rect;
import org.chromium.gfx.mojom.Size;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class TextureQuadState extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 72;
    private static final DataHeader[] VERSION_ARRAY;
    public int backgroundColor;
    public Rect damageRect;
    public int hwProtectedValidationId;
    public boolean isVideoFrame;
    public boolean nearestNeighbor;
    public boolean premultipliedAlpha;
    public int protectedVideoType;
    public ResourceId resourceId;
    public Size resourceSizeInPixels;
    public boolean secureOutputOnly;
    public PointF uvBottomRight;
    public PointF uvTopLeft;
    public float[] vertexOpacity;
    public boolean yFlipped;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(72, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private TextureQuadState(int version) {
        super(72, version);
    }

    public TextureQuadState() {
        this(0);
    }

    public static TextureQuadState deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static TextureQuadState deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static TextureQuadState decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            TextureQuadState result = new TextureQuadState(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, false);
            result.resourceId = ResourceId.decode(decoder1);
            Decoder decoder12 = decoder0.readPointer(16, false);
            result.resourceSizeInPixels = Size.decode(decoder12);
            result.premultipliedAlpha = decoder0.readBoolean(24, 0);
            result.yFlipped = decoder0.readBoolean(24, 1);
            result.nearestNeighbor = decoder0.readBoolean(24, 2);
            result.secureOutputOnly = decoder0.readBoolean(24, 3);
            result.isVideoFrame = decoder0.readBoolean(24, 4);
            result.backgroundColor = decoder0.readInt(28);
            Decoder decoder13 = decoder0.readPointer(32, false);
            result.uvTopLeft = PointF.decode(decoder13);
            Decoder decoder14 = decoder0.readPointer(40, false);
            result.uvBottomRight = PointF.decode(decoder14);
            result.vertexOpacity = decoder0.readFloats(48, 0, 4);
            int readInt = decoder0.readInt(56);
            result.protectedVideoType = readInt;
            ProtectedVideoState.validate(readInt);
            result.protectedVideoType = ProtectedVideoState.toKnownValue(result.protectedVideoType);
            result.hwProtectedValidationId = decoder0.readInt(60);
            Decoder decoder15 = decoder0.readPointer(64, true);
            result.damageRect = Rect.decode(decoder15);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode((Struct) this.resourceId, 8, false);
        encoder0.encode((Struct) this.resourceSizeInPixels, 16, false);
        encoder0.encode(this.premultipliedAlpha, 24, 0);
        encoder0.encode(this.yFlipped, 24, 1);
        encoder0.encode(this.nearestNeighbor, 24, 2);
        encoder0.encode(this.secureOutputOnly, 24, 3);
        encoder0.encode(this.isVideoFrame, 24, 4);
        encoder0.encode(this.backgroundColor, 28);
        encoder0.encode((Struct) this.uvTopLeft, 32, false);
        encoder0.encode((Struct) this.uvBottomRight, 40, false);
        encoder0.encode(this.vertexOpacity, 48, 0, 4);
        encoder0.encode(this.protectedVideoType, 56);
        encoder0.encode(this.hwProtectedValidationId, 60);
        encoder0.encode((Struct) this.damageRect, 64, true);
    }
}
