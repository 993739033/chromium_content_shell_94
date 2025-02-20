package org.chromium.viz.mojom;

import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo.bindings.Union;
/* loaded from: classes2.dex */
public final class DrawQuadState extends Union {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private DebugBorderQuadState mDebugBorderQuadState;
    private CompositorRenderPassQuadState mRenderPassQuadState;
    private SolidColorQuadState mSolidColorQuadState;
    private StreamVideoQuadState mStreamVideoQuadState;
    private SurfaceQuadState mSurfaceQuadState;
    private TextureQuadState mTextureQuadState;
    private TileQuadState mTileQuadState;
    private VideoHoleQuadState mVideoHoleQuadState;
    private YuvVideoQuadState mYuvVideoQuadState;

    /* loaded from: classes2.dex */
    public static final class Tag {
        public static final int DebugBorderQuadState = 0;
        public static final int RenderPassQuadState = 1;
        public static final int SolidColorQuadState = 2;
        public static final int StreamVideoQuadState = 3;
        public static final int SurfaceQuadState = 4;
        public static final int TextureQuadState = 5;
        public static final int TileQuadState = 6;
        public static final int VideoHoleQuadState = 8;
        public static final int YuvVideoQuadState = 7;
    }

    public void setDebugBorderQuadState(DebugBorderQuadState debugBorderQuadState) {
        this.mTag = 0;
        this.mDebugBorderQuadState = debugBorderQuadState;
    }

    public DebugBorderQuadState getDebugBorderQuadState() {
        if (this.mTag != 0) {
            throw new AssertionError();
        }
        return this.mDebugBorderQuadState;
    }

    public void setRenderPassQuadState(CompositorRenderPassQuadState renderPassQuadState) {
        this.mTag = 1;
        this.mRenderPassQuadState = renderPassQuadState;
    }

    public CompositorRenderPassQuadState getRenderPassQuadState() {
        if (this.mTag != 1) {
            throw new AssertionError();
        }
        return this.mRenderPassQuadState;
    }

    public void setSolidColorQuadState(SolidColorQuadState solidColorQuadState) {
        this.mTag = 2;
        this.mSolidColorQuadState = solidColorQuadState;
    }

    public SolidColorQuadState getSolidColorQuadState() {
        if (this.mTag != 2) {
            throw new AssertionError();
        }
        return this.mSolidColorQuadState;
    }

    public void setStreamVideoQuadState(StreamVideoQuadState streamVideoQuadState) {
        this.mTag = 3;
        this.mStreamVideoQuadState = streamVideoQuadState;
    }

    public StreamVideoQuadState getStreamVideoQuadState() {
        if (this.mTag != 3) {
            throw new AssertionError();
        }
        return this.mStreamVideoQuadState;
    }

    public void setSurfaceQuadState(SurfaceQuadState surfaceQuadState) {
        this.mTag = 4;
        this.mSurfaceQuadState = surfaceQuadState;
    }

    public SurfaceQuadState getSurfaceQuadState() {
        if (this.mTag != 4) {
            throw new AssertionError();
        }
        return this.mSurfaceQuadState;
    }

    public void setTextureQuadState(TextureQuadState textureQuadState) {
        this.mTag = 5;
        this.mTextureQuadState = textureQuadState;
    }

    public TextureQuadState getTextureQuadState() {
        if (this.mTag != 5) {
            throw new AssertionError();
        }
        return this.mTextureQuadState;
    }

    public void setTileQuadState(TileQuadState tileQuadState) {
        this.mTag = 6;
        this.mTileQuadState = tileQuadState;
    }

    public TileQuadState getTileQuadState() {
        if (this.mTag != 6) {
            throw new AssertionError();
        }
        return this.mTileQuadState;
    }

    public void setYuvVideoQuadState(YuvVideoQuadState yuvVideoQuadState) {
        this.mTag = 7;
        this.mYuvVideoQuadState = yuvVideoQuadState;
    }

    public YuvVideoQuadState getYuvVideoQuadState() {
        if (this.mTag != 7) {
            throw new AssertionError();
        }
        return this.mYuvVideoQuadState;
    }

    public void setVideoHoleQuadState(VideoHoleQuadState videoHoleQuadState) {
        this.mTag = 8;
        this.mVideoHoleQuadState = videoHoleQuadState;
    }

    public VideoHoleQuadState getVideoHoleQuadState() {
        if (this.mTag != 8) {
            throw new AssertionError();
        }
        return this.mVideoHoleQuadState;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Union
    public final void encode(Encoder encoder0, int offset) {
        encoder0.encode(16, offset);
        encoder0.encode(this.mTag, offset + 4);
        switch (this.mTag) {
            case 0:
                encoder0.encode((Struct) this.mDebugBorderQuadState, offset + 8, false);
                return;
            case 1:
                encoder0.encode((Struct) this.mRenderPassQuadState, offset + 8, false);
                return;
            case 2:
                encoder0.encode((Struct) this.mSolidColorQuadState, offset + 8, false);
                return;
            case 3:
                encoder0.encode((Struct) this.mStreamVideoQuadState, offset + 8, false);
                return;
            case 4:
                encoder0.encode((Struct) this.mSurfaceQuadState, offset + 8, false);
                return;
            case 5:
                encoder0.encode((Struct) this.mTextureQuadState, offset + 8, false);
                return;
            case 6:
                encoder0.encode((Struct) this.mTileQuadState, offset + 8, false);
                return;
            case 7:
                encoder0.encode((Struct) this.mYuvVideoQuadState, offset + 8, false);
                return;
            case 8:
                encoder0.encode((Struct) this.mVideoHoleQuadState, offset + 8, false);
                return;
            default:
                return;
        }
    }

    public static DrawQuadState deserialize(Message message) {
        return decode(new Decoder(message).decoderForSerializedUnion(), 0);
    }

    public static final DrawQuadState decode(Decoder decoder0, int offset) {
        DataHeader dataHeader = decoder0.readDataHeaderForUnion(offset);
        if (dataHeader.size == 0) {
            return null;
        }
        DrawQuadState result = new DrawQuadState();
        switch (dataHeader.elementsOrVersion) {
            case 0:
                Decoder decoder1 = decoder0.readPointer(offset + 8, false);
                result.mDebugBorderQuadState = DebugBorderQuadState.decode(decoder1);
                result.mTag = 0;
                break;
            case 1:
                Decoder decoder12 = decoder0.readPointer(offset + 8, false);
                result.mRenderPassQuadState = CompositorRenderPassQuadState.decode(decoder12);
                result.mTag = 1;
                break;
            case 2:
                Decoder decoder13 = decoder0.readPointer(offset + 8, false);
                result.mSolidColorQuadState = SolidColorQuadState.decode(decoder13);
                result.mTag = 2;
                break;
            case 3:
                Decoder decoder14 = decoder0.readPointer(offset + 8, false);
                result.mStreamVideoQuadState = StreamVideoQuadState.decode(decoder14);
                result.mTag = 3;
                break;
            case 4:
                Decoder decoder15 = decoder0.readPointer(offset + 8, false);
                result.mSurfaceQuadState = SurfaceQuadState.decode(decoder15);
                result.mTag = 4;
                break;
            case 5:
                Decoder decoder16 = decoder0.readPointer(offset + 8, false);
                result.mTextureQuadState = TextureQuadState.decode(decoder16);
                result.mTag = 5;
                break;
            case 6:
                Decoder decoder17 = decoder0.readPointer(offset + 8, false);
                result.mTileQuadState = TileQuadState.decode(decoder17);
                result.mTag = 6;
                break;
            case 7:
                Decoder decoder18 = decoder0.readPointer(offset + 8, false);
                result.mYuvVideoQuadState = YuvVideoQuadState.decode(decoder18);
                result.mTag = 7;
                break;
            case 8:
                Decoder decoder19 = decoder0.readPointer(offset + 8, false);
                result.mVideoHoleQuadState = VideoHoleQuadState.decode(decoder19);
                result.mTag = 8;
                break;
        }
        return result;
    }
}
