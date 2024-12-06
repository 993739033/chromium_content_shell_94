package org.chromium.media.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.gfx.mojom.Rect;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo_base.mojom.TimeDelta;
import org.chromium.mojo_base.mojom.TimeTicks;
import org.chromium.mojo_base.mojom.UnguessableToken;
/* loaded from: classes2.dex */
public final class VideoFrameMetadata extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 176;
    private static final DataHeader[] VERSION_ARRAY;
    public boolean allowOverlay;
    public TimeTicks captureBeginTime;
    public int captureCounter;
    public TimeTicks captureEndTime;
    public Rect captureUpdateRect;
    public int copyMode;
    public TimeTicks decodeBeginTime;
    public TimeTicks decodeEndTime;
    public double deviceScaleFactor;
    public boolean endOfStream;
    public TimeDelta frameDuration;
    public double frameRate;
    public boolean hasCaptureCounter;
    public boolean hasCopyMode;
    public boolean hasDeviceScaleFactor;
    public boolean hasFrameRate;
    public boolean hasPageScaleFactor;
    public boolean hasRootScrollOffsetX;
    public boolean hasRootScrollOffsetY;
    public boolean hasRtpTimestamp;
    public boolean hasTopControlsVisibleHeight;
    public boolean hwProtected;
    public int hwProtectedValidationId;
    public boolean interactiveContent;
    public UnguessableToken overlayPlaneId;
    public double pageScaleFactor;
    public boolean powerEfficient;
    public TimeDelta processingTime;
    public boolean protectedVideo;
    public boolean readLockFencesEnabled;
    public TimeTicks receiveTime;
    public TimeTicks referenceTime;
    public double rootScrollOffsetX;
    public double rootScrollOffsetY;
    public double rtpTimestamp;
    public boolean textureOriginIsTopLeft;
    public boolean textureOwner;
    public double topControlsVisibleHeight;
    public VideoTransformation transformation;
    public TimeDelta wallclockFrameDuration;
    public boolean wantsPromotionHint;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(176, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private VideoFrameMetadata(int version) {
        super(176, version);
    }

    public VideoFrameMetadata() {
        this(0);
    }

    public static VideoFrameMetadata deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static VideoFrameMetadata deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static VideoFrameMetadata decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            VideoFrameMetadata result = new VideoFrameMetadata(elementsOrVersion);
            result.allowOverlay = decoder0.readBoolean(8, 0);
            result.hasCaptureCounter = decoder0.readBoolean(8, 1);
            result.hasCopyMode = decoder0.readBoolean(8, 2);
            result.endOfStream = decoder0.readBoolean(8, 3);
            result.hasFrameRate = decoder0.readBoolean(8, 4);
            result.interactiveContent = decoder0.readBoolean(8, 5);
            result.readLockFencesEnabled = decoder0.readBoolean(8, 6);
            result.textureOwner = decoder0.readBoolean(8, 7);
            result.wantsPromotionHint = decoder0.readBoolean(9, 0);
            result.protectedVideo = decoder0.readBoolean(9, 1);
            result.hwProtected = decoder0.readBoolean(9, 2);
            result.powerEfficient = decoder0.readBoolean(9, 3);
            result.textureOriginIsTopLeft = decoder0.readBoolean(9, 4);
            result.hasDeviceScaleFactor = decoder0.readBoolean(9, 5);
            result.hasPageScaleFactor = decoder0.readBoolean(9, 6);
            result.hasRootScrollOffsetX = decoder0.readBoolean(9, 7);
            result.hasRootScrollOffsetY = decoder0.readBoolean(10, 0);
            result.hasTopControlsVisibleHeight = decoder0.readBoolean(10, 1);
            result.hasRtpTimestamp = decoder0.readBoolean(10, 2);
            result.captureCounter = decoder0.readInt(12);
            Decoder decoder1 = decoder0.readPointer(16, true);
            result.captureBeginTime = TimeTicks.decode(decoder1);
            Decoder decoder12 = decoder0.readPointer(24, true);
            result.captureEndTime = TimeTicks.decode(decoder12);
            Decoder decoder13 = decoder0.readPointer(32, true);
            result.captureUpdateRect = Rect.decode(decoder13);
            int readInt = decoder0.readInt(40);
            result.copyMode = readInt;
            CopyMode.validate(readInt);
            result.copyMode = CopyMode.toKnownValue(result.copyMode);
            result.hwProtectedValidationId = decoder0.readInt(44);
            Decoder decoder14 = decoder0.readPointer(48, true);
            result.frameDuration = TimeDelta.decode(decoder14);
            result.frameRate = decoder0.readDouble(56);
            Decoder decoder15 = decoder0.readPointer(64, true);
            result.referenceTime = TimeTicks.decode(decoder15);
            Decoder decoder16 = decoder0.readPointer(72, true);
            result.transformation = VideoTransformation.decode(decoder16);
            Decoder decoder17 = decoder0.readPointer(80, true);
            result.overlayPlaneId = UnguessableToken.decode(decoder17);
            result.deviceScaleFactor = decoder0.readDouble(88);
            result.pageScaleFactor = decoder0.readDouble(96);
            result.rootScrollOffsetX = decoder0.readDouble(104);
            result.rootScrollOffsetY = decoder0.readDouble(112);
            result.topControlsVisibleHeight = decoder0.readDouble(120);
            Decoder decoder18 = decoder0.readPointer(128, true);
            result.decodeBeginTime = TimeTicks.decode(decoder18);
            Decoder decoder19 = decoder0.readPointer(136, true);
            result.decodeEndTime = TimeTicks.decode(decoder19);
            Decoder decoder110 = decoder0.readPointer(144, true);
            result.processingTime = TimeDelta.decode(decoder110);
            result.rtpTimestamp = decoder0.readDouble(152);
            Decoder decoder111 = decoder0.readPointer(160, true);
            result.receiveTime = TimeTicks.decode(decoder111);
            Decoder decoder112 = decoder0.readPointer(168, true);
            result.wallclockFrameDuration = TimeDelta.decode(decoder112);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.allowOverlay, 8, 0);
        encoder0.encode(this.hasCaptureCounter, 8, 1);
        encoder0.encode(this.hasCopyMode, 8, 2);
        encoder0.encode(this.endOfStream, 8, 3);
        encoder0.encode(this.hasFrameRate, 8, 4);
        encoder0.encode(this.interactiveContent, 8, 5);
        encoder0.encode(this.readLockFencesEnabled, 8, 6);
        encoder0.encode(this.textureOwner, 8, 7);
        encoder0.encode(this.wantsPromotionHint, 9, 0);
        encoder0.encode(this.protectedVideo, 9, 1);
        encoder0.encode(this.hwProtected, 9, 2);
        encoder0.encode(this.powerEfficient, 9, 3);
        encoder0.encode(this.textureOriginIsTopLeft, 9, 4);
        encoder0.encode(this.hasDeviceScaleFactor, 9, 5);
        encoder0.encode(this.hasPageScaleFactor, 9, 6);
        encoder0.encode(this.hasRootScrollOffsetX, 9, 7);
        encoder0.encode(this.hasRootScrollOffsetY, 10, 0);
        encoder0.encode(this.hasTopControlsVisibleHeight, 10, 1);
        encoder0.encode(this.hasRtpTimestamp, 10, 2);
        encoder0.encode(this.captureCounter, 12);
        encoder0.encode((Struct) this.captureBeginTime, 16, true);
        encoder0.encode((Struct) this.captureEndTime, 24, true);
        encoder0.encode((Struct) this.captureUpdateRect, 32, true);
        encoder0.encode(this.copyMode, 40);
        encoder0.encode(this.hwProtectedValidationId, 44);
        encoder0.encode((Struct) this.frameDuration, 48, true);
        encoder0.encode(this.frameRate, 56);
        encoder0.encode((Struct) this.referenceTime, 64, true);
        encoder0.encode((Struct) this.transformation, 72, true);
        encoder0.encode((Struct) this.overlayPlaneId, 80, true);
        encoder0.encode(this.deviceScaleFactor, 88);
        encoder0.encode(this.pageScaleFactor, 96);
        encoder0.encode(this.rootScrollOffsetX, 104);
        encoder0.encode(this.rootScrollOffsetY, 112);
        encoder0.encode(this.topControlsVisibleHeight, 120);
        encoder0.encode((Struct) this.decodeBeginTime, 128, true);
        encoder0.encode((Struct) this.decodeEndTime, 136, true);
        encoder0.encode((Struct) this.processingTime, 144, true);
        encoder0.encode(this.rtpTimestamp, 152);
        encoder0.encode((Struct) this.receiveTime, 160, true);
        encoder0.encode((Struct) this.wallclockFrameDuration, 168, true);
    }
}
