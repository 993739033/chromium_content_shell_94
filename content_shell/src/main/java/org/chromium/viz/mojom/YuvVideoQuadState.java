package org.chromium.viz.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.gfx.mojom.ColorSpace;
import org.chromium.gfx.mojom.HdrMetadata;
import org.chromium.gfx.mojom.Rect;
import org.chromium.gfx.mojom.RectF;
import org.chromium.gfx.mojom.Size;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class YuvVideoQuadState extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 112;
    private static final DataHeader[] VERSION_ARRAY;
    public ResourceId aPlaneResourceId;
    public int bitsPerChannel;
    public Rect damageRect;
    public HdrMetadata hdrMetadata;
    public int protectedVideoType;
    public float resourceMultiplier;
    public float resourceOffset;
    public ResourceId uPlaneResourceId;
    public RectF uvTexCoordRect;
    public Size uvTexSize;
    public ResourceId vPlaneResourceId;
    public ColorSpace videoColorSpace;
    public ResourceId yPlaneResourceId;
    public RectF yaTexCoordRect;
    public Size yaTexSize;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(112, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private YuvVideoQuadState(int version) {
        super(112, version);
    }

    public YuvVideoQuadState() {
        this(0);
    }

    public static YuvVideoQuadState deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static YuvVideoQuadState deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static YuvVideoQuadState decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            YuvVideoQuadState result = new YuvVideoQuadState(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, false);
            result.yaTexCoordRect = RectF.decode(decoder1);
            Decoder decoder12 = decoder0.readPointer(16, false);
            result.uvTexCoordRect = RectF.decode(decoder12);
            Decoder decoder13 = decoder0.readPointer(24, false);
            result.yaTexSize = Size.decode(decoder13);
            Decoder decoder14 = decoder0.readPointer(32, false);
            result.uvTexSize = Size.decode(decoder14);
            Decoder decoder15 = decoder0.readPointer(40, false);
            result.yPlaneResourceId = ResourceId.decode(decoder15);
            Decoder decoder16 = decoder0.readPointer(48, false);
            result.uPlaneResourceId = ResourceId.decode(decoder16);
            Decoder decoder17 = decoder0.readPointer(56, false);
            result.vPlaneResourceId = ResourceId.decode(decoder17);
            Decoder decoder18 = decoder0.readPointer(64, false);
            result.aPlaneResourceId = ResourceId.decode(decoder18);
            result.resourceOffset = decoder0.readFloat(72);
            result.resourceMultiplier = decoder0.readFloat(76);
            result.bitsPerChannel = decoder0.readInt(80);
            int readInt = decoder0.readInt(84);
            result.protectedVideoType = readInt;
            ProtectedVideoState.validate(readInt);
            result.protectedVideoType = ProtectedVideoState.toKnownValue(result.protectedVideoType);
            Decoder decoder19 = decoder0.readPointer(88, false);
            result.videoColorSpace = ColorSpace.decode(decoder19);
            Decoder decoder110 = decoder0.readPointer(96, false);
            result.hdrMetadata = HdrMetadata.decode(decoder110);
            Decoder decoder111 = decoder0.readPointer(104, true);
            result.damageRect = Rect.decode(decoder111);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode((Struct) this.yaTexCoordRect, 8, false);
        encoder0.encode((Struct) this.uvTexCoordRect, 16, false);
        encoder0.encode((Struct) this.yaTexSize, 24, false);
        encoder0.encode((Struct) this.uvTexSize, 32, false);
        encoder0.encode((Struct) this.yPlaneResourceId, 40, false);
        encoder0.encode((Struct) this.uPlaneResourceId, 48, false);
        encoder0.encode((Struct) this.vPlaneResourceId, 56, false);
        encoder0.encode((Struct) this.aPlaneResourceId, 64, false);
        encoder0.encode(this.resourceOffset, 72);
        encoder0.encode(this.resourceMultiplier, 76);
        encoder0.encode(this.bitsPerChannel, 80);
        encoder0.encode(this.protectedVideoType, 84);
        encoder0.encode((Struct) this.videoColorSpace, 88, false);
        encoder0.encode((Struct) this.hdrMetadata, 96, false);
        encoder0.encode((Struct) this.damageRect, 104, true);
    }
}
