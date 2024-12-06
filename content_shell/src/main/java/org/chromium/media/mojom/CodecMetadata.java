package org.chromium.media.mojom;

import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo.bindings.Union;
/* loaded from: classes2.dex */
public final class CodecMetadata extends Union {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private H264Metadata mH264;
    private Vp8Metadata mVp8;
    private Vp9Metadata mVp9;

    /* loaded from: classes2.dex */
    public static final class Tag {
        public static final int H264 = 0;
        public static final int Vp8 = 1;
        public static final int Vp9 = 2;
    }

    public void setH264(H264Metadata h264) {
        this.mTag = 0;
        this.mH264 = h264;
    }

    public H264Metadata getH264() {
        if (this.mTag != 0) {
            throw new AssertionError();
        }
        return this.mH264;
    }

    public void setVp8(Vp8Metadata vp8) {
        this.mTag = 1;
        this.mVp8 = vp8;
    }

    public Vp8Metadata getVp8() {
        if (this.mTag != 1) {
            throw new AssertionError();
        }
        return this.mVp8;
    }

    public void setVp9(Vp9Metadata vp9) {
        this.mTag = 2;
        this.mVp9 = vp9;
    }

    public Vp9Metadata getVp9() {
        if (this.mTag != 2) {
            throw new AssertionError();
        }
        return this.mVp9;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Union
    public final void encode(Encoder encoder0, int offset) {
        encoder0.encode(16, offset);
        encoder0.encode(this.mTag, offset + 4);
        switch (this.mTag) {
            case 0:
                encoder0.encode((Struct) this.mH264, offset + 8, false);
                return;
            case 1:
                encoder0.encode((Struct) this.mVp8, offset + 8, false);
                return;
            case 2:
                encoder0.encode((Struct) this.mVp9, offset + 8, false);
                return;
            default:
                return;
        }
    }

    public static CodecMetadata deserialize(Message message) {
        return decode(new Decoder(message).decoderForSerializedUnion(), 0);
    }

    public static final CodecMetadata decode(Decoder decoder0, int offset) {
        DataHeader dataHeader = decoder0.readDataHeaderForUnion(offset);
        if (dataHeader.size == 0) {
            return null;
        }
        CodecMetadata result = new CodecMetadata();
        switch (dataHeader.elementsOrVersion) {
            case 0:
                Decoder decoder1 = decoder0.readPointer(offset + 8, false);
                result.mH264 = H264Metadata.decode(decoder1);
                result.mTag = 0;
                break;
            case 1:
                Decoder decoder12 = decoder0.readPointer(offset + 8, false);
                result.mVp8 = Vp8Metadata.decode(decoder12);
                result.mTag = 1;
                break;
            case 2:
                Decoder decoder13 = decoder0.readPointer(offset + 8, false);
                result.mVp9 = Vp9Metadata.decode(decoder13);
                result.mTag = 2;
                break;
        }
        return result;
    }
}
