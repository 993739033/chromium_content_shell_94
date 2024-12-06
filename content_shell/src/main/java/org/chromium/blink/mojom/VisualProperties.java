package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.cc.mojom.BrowserControlsParams;
import org.chromium.display.mojom.ScreenInfos;
import org.chromium.gfx.mojom.Rect;
import org.chromium.gfx.mojom.Size;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.viz.mojom.LocalSurfaceId;
/* loaded from: classes2.dex */
public final class VisualProperties extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 120;
    private static final DataHeader[] VERSION_ARRAY;
    public boolean autoResizeEnabled;
    public BrowserControlsParams browserControlsParams;
    public int captureSequenceNumber;
    public float compositingScaleFactor;
    public Rect compositorViewportPixelRect;
    public int displayMode;
    public boolean isFullscreenGranted;
    public boolean isPinchGestureActive;
    public LocalSurfaceId localSurfaceId;
    public Size maxSizeForAutoResize;
    public Size minSizeForAutoResize;
    public Size newSize;
    public float pageScaleFactor;
    public Rect[] rootWidgetWindowSegments;
    public ScreenInfos screenInfos;
    public boolean scrollFocusedNodeIntoView;
    public Size visibleViewportSize;
    public Rect windowControlsOverlayRect;
    public double zoomLevel;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(120, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private VisualProperties(int version) {
        super(120, version);
        this.autoResizeEnabled = false;
        this.displayMode = 0;
        this.pageScaleFactor = 1.0f;
        this.compositingScaleFactor = 1.0f;
    }

    public VisualProperties() {
        this(0);
    }

    public static VisualProperties deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static VisualProperties deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static VisualProperties decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            VisualProperties result = new VisualProperties(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, false);
            result.screenInfos = ScreenInfos.decode(decoder1);
            result.autoResizeEnabled = decoder0.readBoolean(16, 0);
            result.scrollFocusedNodeIntoView = decoder0.readBoolean(16, 1);
            result.isFullscreenGranted = decoder0.readBoolean(16, 2);
            result.isPinchGestureActive = decoder0.readBoolean(16, 3);
            int readInt = decoder0.readInt(20);
            result.displayMode = readInt;
            DisplayMode.validate(readInt);
            result.displayMode = DisplayMode.toKnownValue(result.displayMode);
            Decoder decoder12 = decoder0.readPointer(24, false);
            result.minSizeForAutoResize = Size.decode(decoder12);
            Decoder decoder13 = decoder0.readPointer(32, false);
            result.maxSizeForAutoResize = Size.decode(decoder13);
            Decoder decoder14 = decoder0.readPointer(40, false);
            result.newSize = Size.decode(decoder14);
            Decoder decoder15 = decoder0.readPointer(48, false);
            result.visibleViewportSize = Size.decode(decoder15);
            Decoder decoder16 = decoder0.readPointer(56, false);
            result.compositorViewportPixelRect = Rect.decode(decoder16);
            Decoder decoder17 = decoder0.readPointer(64, true);
            result.browserControlsParams = BrowserControlsParams.decode(decoder17);
            Decoder decoder18 = decoder0.readPointer(72, true);
            result.localSurfaceId = LocalSurfaceId.decode(decoder18);
            result.captureSequenceNumber = decoder0.readInt(80);
            result.pageScaleFactor = decoder0.readFloat(84);
            result.zoomLevel = decoder0.readDouble(88);
            result.compositingScaleFactor = decoder0.readFloat(96);
            Decoder decoder19 = decoder0.readPointer(104, false);
            DataHeader si1 = decoder19.readDataHeaderForPointerArray(-1);
            result.rootWidgetWindowSegments = new Rect[si1.elementsOrVersion];
            for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                Decoder decoder2 = decoder19.readPointer((i1 * 8) + 8, false);
                result.rootWidgetWindowSegments[i1] = Rect.decode(decoder2);
            }
            Decoder decoder110 = decoder0.readPointer(112, false);
            result.windowControlsOverlayRect = Rect.decode(decoder110);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode((Struct) this.screenInfos, 8, false);
        encoder0.encode(this.autoResizeEnabled, 16, 0);
        encoder0.encode(this.scrollFocusedNodeIntoView, 16, 1);
        encoder0.encode(this.isFullscreenGranted, 16, 2);
        encoder0.encode(this.isPinchGestureActive, 16, 3);
        encoder0.encode(this.displayMode, 20);
        encoder0.encode((Struct) this.minSizeForAutoResize, 24, false);
        encoder0.encode((Struct) this.maxSizeForAutoResize, 32, false);
        encoder0.encode((Struct) this.newSize, 40, false);
        encoder0.encode((Struct) this.visibleViewportSize, 48, false);
        encoder0.encode((Struct) this.compositorViewportPixelRect, 56, false);
        encoder0.encode((Struct) this.browserControlsParams, 64, true);
        encoder0.encode((Struct) this.localSurfaceId, 72, true);
        encoder0.encode(this.captureSequenceNumber, 80);
        encoder0.encode(this.pageScaleFactor, 84);
        encoder0.encode(this.zoomLevel, 88);
        encoder0.encode(this.compositingScaleFactor, 96);
        Rect[] rectArr = this.rootWidgetWindowSegments;
        if (rectArr == null) {
            encoder0.encodeNullPointer(104, false);
        } else {
            Encoder encoder1 = encoder0.encodePointerArray(rectArr.length, 104, -1);
            int i0 = 0;
            while (true) {
                Rect[] rectArr2 = this.rootWidgetWindowSegments;
                if (i0 >= rectArr2.length) {
                    break;
                }
                encoder1.encode((Struct) rectArr2[i0], (i0 * 8) + 8, false);
                i0++;
            }
        }
        encoder0.encode((Struct) this.windowControlsOverlayRect, 112, false);
    }
}
