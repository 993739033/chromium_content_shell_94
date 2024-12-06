package org.chromium.cc.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.gfx.mojom.Size;
import org.chromium.gfx.mojom.SizeF;
import org.chromium.gfx.mojom.Vector2dF;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.viz.mojom.LocalSurfaceId;
import org.chromium.viz.mojom.Selection;
import org.chromium.viz.mojom.VerticalScrollDirection;
/* loaded from: classes2.dex */
public final class RenderFrameMetadata extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 120;
    private static final DataHeader[] VERSION_ARRAY;
    public float bottomControlsHeight;
    public float bottomControlsMinHeightOffset;
    public float bottomControlsShownRatio;
    public DelegatedInkBrowserMetadata delegatedInkMetadata;
    public float deviceScaleFactor;
    public float externalPageScaleFactor;
    public boolean hasTransparentBackground;
    public boolean isMobileOptimized;
    public boolean isScrollOffsetAtTop;
    public LocalSurfaceId localSurfaceId;
    public float maxPageScaleFactor;
    public float minPageScaleFactor;
    public int newVerticalScrollDirection;
    public float pageScaleFactor;
    public int rootBackgroundColor;
    public SizeF rootLayerSize;
    public boolean rootOverflowYHidden;
    public Vector2dF rootScrollOffset;
    public SizeF scrollableViewportSize;
    public Selection selection;
    public float topControlsHeight;
    public float topControlsMinHeightOffset;
    public float topControlsShownRatio;
    public Size viewportSizeInPixels;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(120, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private RenderFrameMetadata(int version) {
        super(120, version);
    }

    public RenderFrameMetadata() {
        this(0);
    }

    public static RenderFrameMetadata deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static RenderFrameMetadata deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static RenderFrameMetadata decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            RenderFrameMetadata result = new RenderFrameMetadata(elementsOrVersion);
            result.rootBackgroundColor = decoder0.readInt(8);
            result.isScrollOffsetAtTop = decoder0.readBoolean(12, 0);
            result.isMobileOptimized = decoder0.readBoolean(12, 1);
            result.rootOverflowYHidden = decoder0.readBoolean(12, 2);
            result.hasTransparentBackground = decoder0.readBoolean(12, 3);
            Decoder decoder1 = decoder0.readPointer(16, true);
            result.rootScrollOffset = Vector2dF.decode(decoder1);
            Decoder decoder12 = decoder0.readPointer(24, false);
            result.selection = Selection.decode(decoder12);
            Decoder decoder13 = decoder0.readPointer(32, true);
            result.delegatedInkMetadata = DelegatedInkBrowserMetadata.decode(decoder13);
            result.deviceScaleFactor = decoder0.readFloat(40);
            result.pageScaleFactor = decoder0.readFloat(44);
            Decoder decoder14 = decoder0.readPointer(48, false);
            result.viewportSizeInPixels = Size.decode(decoder14);
            Decoder decoder15 = decoder0.readPointer(56, true);
            result.localSurfaceId = LocalSurfaceId.decode(decoder15);
            result.externalPageScaleFactor = decoder0.readFloat(64);
            result.topControlsHeight = decoder0.readFloat(68);
            result.topControlsShownRatio = decoder0.readFloat(72);
            int readInt = decoder0.readInt(76);
            result.newVerticalScrollDirection = readInt;
            VerticalScrollDirection.validate(readInt);
            result.newVerticalScrollDirection = VerticalScrollDirection.toKnownValue(result.newVerticalScrollDirection);
            result.bottomControlsHeight = decoder0.readFloat(80);
            result.bottomControlsShownRatio = decoder0.readFloat(84);
            result.topControlsMinHeightOffset = decoder0.readFloat(88);
            result.bottomControlsMinHeightOffset = decoder0.readFloat(92);
            result.minPageScaleFactor = decoder0.readFloat(96);
            result.maxPageScaleFactor = decoder0.readFloat(100);
            Decoder decoder16 = decoder0.readPointer(104, false);
            result.scrollableViewportSize = SizeF.decode(decoder16);
            Decoder decoder17 = decoder0.readPointer(112, false);
            result.rootLayerSize = SizeF.decode(decoder17);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.rootBackgroundColor, 8);
        encoder0.encode(this.isScrollOffsetAtTop, 12, 0);
        encoder0.encode(this.isMobileOptimized, 12, 1);
        encoder0.encode(this.rootOverflowYHidden, 12, 2);
        encoder0.encode(this.hasTransparentBackground, 12, 3);
        encoder0.encode((Struct) this.rootScrollOffset, 16, true);
        encoder0.encode((Struct) this.selection, 24, false);
        encoder0.encode((Struct) this.delegatedInkMetadata, 32, true);
        encoder0.encode(this.deviceScaleFactor, 40);
        encoder0.encode(this.pageScaleFactor, 44);
        encoder0.encode((Struct) this.viewportSizeInPixels, 48, false);
        encoder0.encode((Struct) this.localSurfaceId, 56, true);
        encoder0.encode(this.externalPageScaleFactor, 64);
        encoder0.encode(this.topControlsHeight, 68);
        encoder0.encode(this.topControlsShownRatio, 72);
        encoder0.encode(this.newVerticalScrollDirection, 76);
        encoder0.encode(this.bottomControlsHeight, 80);
        encoder0.encode(this.bottomControlsShownRatio, 84);
        encoder0.encode(this.topControlsMinHeightOffset, 88);
        encoder0.encode(this.bottomControlsMinHeightOffset, 92);
        encoder0.encode(this.minPageScaleFactor, 96);
        encoder0.encode(this.maxPageScaleFactor, 100);
        encoder0.encode((Struct) this.scrollableViewportSize, 104, false);
        encoder0.encode((Struct) this.rootLayerSize, 112, false);
    }
}
