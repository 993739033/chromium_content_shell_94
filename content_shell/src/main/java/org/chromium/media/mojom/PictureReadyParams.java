package org.chromium.media.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.gfx.mojom.ColorSpace;
import org.chromium.gfx.mojom.Rect;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class PictureReadyParams extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 40;
    private static final DataHeader[] VERSION_ARRAY;
    public boolean allowOverlay;
    public int bitstreamBufferId;
    public ColorSpace colorSpace;
    public int pictureBufferId;
    public boolean readLockFencesEnabled;
    public boolean sizeChanged;
    public boolean surfaceTexture;
    public Rect visibleRect;
    public boolean wantsPromotionHint;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private PictureReadyParams(int version) {
        super(40, version);
    }

    public PictureReadyParams() {
        this(0);
    }

    public static PictureReadyParams deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static PictureReadyParams deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static PictureReadyParams decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            PictureReadyParams result = new PictureReadyParams(elementsOrVersion);
            result.pictureBufferId = decoder0.readInt(8);
            result.bitstreamBufferId = decoder0.readInt(12);
            Decoder decoder1 = decoder0.readPointer(16, false);
            result.visibleRect = Rect.decode(decoder1);
            Decoder decoder12 = decoder0.readPointer(24, false);
            result.colorSpace = ColorSpace.decode(decoder12);
            result.allowOverlay = decoder0.readBoolean(32, 0);
            result.readLockFencesEnabled = decoder0.readBoolean(32, 1);
            result.sizeChanged = decoder0.readBoolean(32, 2);
            result.surfaceTexture = decoder0.readBoolean(32, 3);
            result.wantsPromotionHint = decoder0.readBoolean(32, 4);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.pictureBufferId, 8);
        encoder0.encode(this.bitstreamBufferId, 12);
        encoder0.encode((Struct) this.visibleRect, 16, false);
        encoder0.encode((Struct) this.colorSpace, 24, false);
        encoder0.encode(this.allowOverlay, 32, 0);
        encoder0.encode(this.readLockFencesEnabled, 32, 1);
        encoder0.encode(this.sizeChanged, 32, 2);
        encoder0.encode(this.surfaceTexture, 32, 3);
        encoder0.encode(this.wantsPromotionHint, 32, 4);
    }
}
