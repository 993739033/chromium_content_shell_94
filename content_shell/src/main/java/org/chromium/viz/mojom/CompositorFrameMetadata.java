package org.chromium.viz.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.gfx.mojom.ContentColorUsage;
import org.chromium.gfx.mojom.DelegatedInkMetadata;
import org.chromium.gfx.mojom.OverlayTransform;
import org.chromium.gfx.mojom.SizeF;
import org.chromium.gfx.mojom.Vector2dF;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo_base.mojom.TimeDelta;
import org.chromium.ui.mojom.LatencyInfo;
/* loaded from: classes2.dex */
public final class CompositorFrameMetadata extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 128;
    private static final DataHeader[] VERSION_ARRAY;
    public SurfaceId[] activationDependencies;
    public BeginFrameAck beginFrameAck;
    public int contentColorUsage;
    public FrameDeadline deadline;
    public DelegatedInkMetadata delegatedInkMetadata;
    public float deviceScaleFactor;
    public int displayTransformHint;
    public int frameToken;
    public boolean isResourcelessSoftwareDrawWithScrollOrAnimation;
    public LatencyInfo[] latencyInfo;
    public boolean mayContainVideo;
    public float minPageScaleFactor;
    public float pageScaleFactor;
    public TimeDelta preferredFrameInterval;
    public SurfaceRange[] referencedSurfaces;
    public int rootBackgroundColor;
    public Vector2dF rootScrollOffset;
    public SizeF scrollableViewportSize;
    public boolean sendFrameTokenToEmbedder;
    public float topControlsVisibleHeight;
    public boolean topControlsVisibleHeightSet;
    public CompositorFrameTransitionDirective[] transitionDirectives;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(128, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private CompositorFrameMetadata(int version) {
        super(128, version);
    }

    public CompositorFrameMetadata() {
        this(0);
    }

    public static CompositorFrameMetadata deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static CompositorFrameMetadata deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static CompositorFrameMetadata decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            CompositorFrameMetadata result = new CompositorFrameMetadata(elementsOrVersion);
            result.deviceScaleFactor = decoder0.readFloat(8);
            result.pageScaleFactor = decoder0.readFloat(12);
            Decoder decoder1 = decoder0.readPointer(16, false);
            result.rootScrollOffset = Vector2dF.decode(decoder1);
            Decoder decoder12 = decoder0.readPointer(24, false);
            result.scrollableViewportSize = SizeF.decode(decoder12);
            int readInt = decoder0.readInt(32);
            result.contentColorUsage = readInt;
            ContentColorUsage.validate(readInt);
            result.contentColorUsage = ContentColorUsage.toKnownValue(result.contentColorUsage);
            result.mayContainVideo = decoder0.readBoolean(36, 0);
            result.isResourcelessSoftwareDrawWithScrollOrAnimation = decoder0.readBoolean(36, 1);
            result.sendFrameTokenToEmbedder = decoder0.readBoolean(36, 2);
            result.topControlsVisibleHeightSet = decoder0.readBoolean(36, 3);
            result.rootBackgroundColor = decoder0.readInt(40);
            result.frameToken = decoder0.readInt(44);
            Decoder decoder13 = decoder0.readPointer(48, false);
            DataHeader si1 = decoder13.readDataHeaderForPointerArray(-1);
            result.latencyInfo = new LatencyInfo[si1.elementsOrVersion];
            for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                Decoder decoder2 = decoder13.readPointer((i1 * 8) + 8, false);
                result.latencyInfo[i1] = LatencyInfo.decode(decoder2);
            }
            Decoder decoder14 = decoder0.readPointer(56, false);
            DataHeader si12 = decoder14.readDataHeaderForPointerArray(-1);
            result.referencedSurfaces = new SurfaceRange[si12.elementsOrVersion];
            for (int i12 = 0; i12 < si12.elementsOrVersion; i12++) {
                Decoder decoder22 = decoder14.readPointer((i12 * 8) + 8, false);
                result.referencedSurfaces[i12] = SurfaceRange.decode(decoder22);
            }
            Decoder decoder15 = decoder0.readPointer(64, false);
            result.deadline = FrameDeadline.decode(decoder15);
            Decoder decoder16 = decoder0.readPointer(72, false);
            DataHeader si13 = decoder16.readDataHeaderForPointerArray(-1);
            result.activationDependencies = new SurfaceId[si13.elementsOrVersion];
            for (int i13 = 0; i13 < si13.elementsOrVersion; i13++) {
                Decoder decoder23 = decoder16.readPointer((i13 * 8) + 8, false);
                result.activationDependencies[i13] = SurfaceId.decode(decoder23);
            }
            Decoder decoder17 = decoder0.readPointer(80, false);
            result.beginFrameAck = BeginFrameAck.decode(decoder17);
            result.topControlsVisibleHeight = decoder0.readFloat(88);
            result.minPageScaleFactor = decoder0.readFloat(92);
            Decoder decoder18 = decoder0.readPointer(96, true);
            result.preferredFrameInterval = TimeDelta.decode(decoder18);
            int readInt2 = decoder0.readInt(104);
            result.displayTransformHint = readInt2;
            OverlayTransform.validate(readInt2);
            result.displayTransformHint = OverlayTransform.toKnownValue(result.displayTransformHint);
            Decoder decoder19 = decoder0.readPointer(112, true);
            result.delegatedInkMetadata = DelegatedInkMetadata.decode(decoder19);
            Decoder decoder110 = decoder0.readPointer(120, false);
            DataHeader si14 = decoder110.readDataHeaderForPointerArray(-1);
            result.transitionDirectives = new CompositorFrameTransitionDirective[si14.elementsOrVersion];
            for (int i14 = 0; i14 < si14.elementsOrVersion; i14++) {
                Decoder decoder24 = decoder110.readPointer((i14 * 8) + 8, false);
                result.transitionDirectives[i14] = CompositorFrameTransitionDirective.decode(decoder24);
            }
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.deviceScaleFactor, 8);
        encoder0.encode(this.pageScaleFactor, 12);
        encoder0.encode((Struct) this.rootScrollOffset, 16, false);
        encoder0.encode((Struct) this.scrollableViewportSize, 24, false);
        encoder0.encode(this.contentColorUsage, 32);
        encoder0.encode(this.mayContainVideo, 36, 0);
        encoder0.encode(this.isResourcelessSoftwareDrawWithScrollOrAnimation, 36, 1);
        encoder0.encode(this.sendFrameTokenToEmbedder, 36, 2);
        encoder0.encode(this.topControlsVisibleHeightSet, 36, 3);
        encoder0.encode(this.rootBackgroundColor, 40);
        encoder0.encode(this.frameToken, 44);
        LatencyInfo[] latencyInfoArr = this.latencyInfo;
        if (latencyInfoArr == null) {
            encoder0.encodeNullPointer(48, false);
        } else {
            Encoder encoder1 = encoder0.encodePointerArray(latencyInfoArr.length, 48, -1);
            int i0 = 0;
            while (true) {
                LatencyInfo[] latencyInfoArr2 = this.latencyInfo;
                if (i0 >= latencyInfoArr2.length) {
                    break;
                }
                encoder1.encode((Struct) latencyInfoArr2[i0], (i0 * 8) + 8, false);
                i0++;
            }
        }
        SurfaceRange[] surfaceRangeArr = this.referencedSurfaces;
        if (surfaceRangeArr == null) {
            encoder0.encodeNullPointer(56, false);
        } else {
            Encoder encoder12 = encoder0.encodePointerArray(surfaceRangeArr.length, 56, -1);
            int i02 = 0;
            while (true) {
                SurfaceRange[] surfaceRangeArr2 = this.referencedSurfaces;
                if (i02 >= surfaceRangeArr2.length) {
                    break;
                }
                encoder12.encode((Struct) surfaceRangeArr2[i02], (i02 * 8) + 8, false);
                i02++;
            }
        }
        encoder0.encode((Struct) this.deadline, 64, false);
        SurfaceId[] surfaceIdArr = this.activationDependencies;
        if (surfaceIdArr == null) {
            encoder0.encodeNullPointer(72, false);
        } else {
            Encoder encoder13 = encoder0.encodePointerArray(surfaceIdArr.length, 72, -1);
            int i03 = 0;
            while (true) {
                SurfaceId[] surfaceIdArr2 = this.activationDependencies;
                if (i03 >= surfaceIdArr2.length) {
                    break;
                }
                encoder13.encode((Struct) surfaceIdArr2[i03], (i03 * 8) + 8, false);
                i03++;
            }
        }
        encoder0.encode((Struct) this.beginFrameAck, 80, false);
        encoder0.encode(this.topControlsVisibleHeight, 88);
        encoder0.encode(this.minPageScaleFactor, 92);
        encoder0.encode((Struct) this.preferredFrameInterval, 96, true);
        encoder0.encode(this.displayTransformHint, 104);
        encoder0.encode((Struct) this.delegatedInkMetadata, 112, true);
        CompositorFrameTransitionDirective[] compositorFrameTransitionDirectiveArr = this.transitionDirectives;
        if (compositorFrameTransitionDirectiveArr == null) {
            encoder0.encodeNullPointer(120, false);
            return;
        }
        Encoder encoder14 = encoder0.encodePointerArray(compositorFrameTransitionDirectiveArr.length, 120, -1);
        int i04 = 0;
        while (true) {
            CompositorFrameTransitionDirective[] compositorFrameTransitionDirectiveArr2 = this.transitionDirectives;
            if (i04 < compositorFrameTransitionDirectiveArr2.length) {
                encoder14.encode((Struct) compositorFrameTransitionDirectiveArr2[i04], (i04 * 8) + 8, false);
                i04++;
            } else {
                return;
            }
        }
    }
}
