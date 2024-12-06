package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.gfx.mojom.Size;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public final class AnchorElementMetrics extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 72;
    private static final DataHeader[] VERSION_ARRAY;
    public int anchorId;
    public boolean containsImage;
    public int fontSizePx;
    public int fontWeight;
    public boolean hasTextSibling;
    public boolean isInIframe;
    public boolean isSameHost;
    public boolean isUrlIncrementedByOne;
    public float ratioArea;
    public float ratioDistanceCenterToVisibleTop;
    public float ratioDistanceRootBottom;
    public float ratioDistanceRootTop;
    public float ratioDistanceTopToVisibleTop;
    public float ratioVisibleArea;
    public Url sourceUrl;
    public Url targetUrl;
    public Size viewportSize;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(72, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private AnchorElementMetrics(int version) {
        super(72, version);
    }

    public AnchorElementMetrics() {
        this(0);
    }

    public static AnchorElementMetrics deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static AnchorElementMetrics deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static AnchorElementMetrics decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            AnchorElementMetrics result = new AnchorElementMetrics(elementsOrVersion);
            result.anchorId = decoder0.readInt(8);
            result.ratioArea = decoder0.readFloat(12);
            result.ratioVisibleArea = decoder0.readFloat(16);
            result.ratioDistanceTopToVisibleTop = decoder0.readFloat(20);
            result.ratioDistanceCenterToVisibleTop = decoder0.readFloat(24);
            result.ratioDistanceRootTop = decoder0.readFloat(28);
            result.ratioDistanceRootBottom = decoder0.readFloat(32);
            result.isInIframe = decoder0.readBoolean(36, 0);
            result.containsImage = decoder0.readBoolean(36, 1);
            result.isSameHost = decoder0.readBoolean(36, 2);
            result.isUrlIncrementedByOne = decoder0.readBoolean(36, 3);
            result.hasTextSibling = decoder0.readBoolean(36, 4);
            result.fontSizePx = decoder0.readInt(40);
            result.fontWeight = decoder0.readInt(44);
            Decoder decoder1 = decoder0.readPointer(48, false);
            result.sourceUrl = Url.decode(decoder1);
            Decoder decoder12 = decoder0.readPointer(56, false);
            result.targetUrl = Url.decode(decoder12);
            Decoder decoder13 = decoder0.readPointer(64, false);
            result.viewportSize = Size.decode(decoder13);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.anchorId, 8);
        encoder0.encode(this.ratioArea, 12);
        encoder0.encode(this.ratioVisibleArea, 16);
        encoder0.encode(this.ratioDistanceTopToVisibleTop, 20);
        encoder0.encode(this.ratioDistanceCenterToVisibleTop, 24);
        encoder0.encode(this.ratioDistanceRootTop, 28);
        encoder0.encode(this.ratioDistanceRootBottom, 32);
        encoder0.encode(this.isInIframe, 36, 0);
        encoder0.encode(this.containsImage, 36, 1);
        encoder0.encode(this.isSameHost, 36, 2);
        encoder0.encode(this.isUrlIncrementedByOne, 36, 3);
        encoder0.encode(this.hasTextSibling, 36, 4);
        encoder0.encode(this.fontSizePx, 40);
        encoder0.encode(this.fontWeight, 44);
        encoder0.encode((Struct) this.sourceUrl, 48, false);
        encoder0.encode((Struct) this.targetUrl, 56, false);
        encoder0.encode((Struct) this.viewportSize, 64, false);
    }
}
