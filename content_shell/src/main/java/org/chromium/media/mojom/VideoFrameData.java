package org.chromium.media.mojom;

import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo.bindings.Union;
/* loaded from: classes2.dex */
public final class VideoFrameData extends Union {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private EosVideoFrameData mEosData;
    private GpuMemoryBufferVideoFrameData mGpuMemoryBufferData;
    private MailboxVideoFrameData mMailboxData;
    private SharedBufferVideoFrameData mSharedBufferData;

    /* loaded from: classes2.dex */
    public static final class Tag {
        public static final int EosData = 0;
        public static final int GpuMemoryBufferData = 2;
        public static final int MailboxData = 3;
        public static final int SharedBufferData = 1;
    }

    public void setEosData(EosVideoFrameData eosData) {
        this.mTag = 0;
        this.mEosData = eosData;
    }

    public EosVideoFrameData getEosData() {
        if (this.mTag != 0) {
            throw new AssertionError();
        }
        return this.mEosData;
    }

    public void setSharedBufferData(SharedBufferVideoFrameData sharedBufferData) {
        this.mTag = 1;
        this.mSharedBufferData = sharedBufferData;
    }

    public SharedBufferVideoFrameData getSharedBufferData() {
        if (this.mTag != 1) {
            throw new AssertionError();
        }
        return this.mSharedBufferData;
    }

    public void setGpuMemoryBufferData(GpuMemoryBufferVideoFrameData gpuMemoryBufferData) {
        this.mTag = 2;
        this.mGpuMemoryBufferData = gpuMemoryBufferData;
    }

    public GpuMemoryBufferVideoFrameData getGpuMemoryBufferData() {
        if (this.mTag != 2) {
            throw new AssertionError();
        }
        return this.mGpuMemoryBufferData;
    }

    public void setMailboxData(MailboxVideoFrameData mailboxData) {
        this.mTag = 3;
        this.mMailboxData = mailboxData;
    }

    public MailboxVideoFrameData getMailboxData() {
        if (this.mTag != 3) {
            throw new AssertionError();
        }
        return this.mMailboxData;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Union
    public final void encode(Encoder encoder0, int offset) {
        encoder0.encode(16, offset);
        encoder0.encode(this.mTag, offset + 4);
        switch (this.mTag) {
            case 0:
                encoder0.encode((Struct) this.mEosData, offset + 8, false);
                return;
            case 1:
                encoder0.encode((Struct) this.mSharedBufferData, offset + 8, false);
                return;
            case 2:
                encoder0.encode((Struct) this.mGpuMemoryBufferData, offset + 8, false);
                return;
            case 3:
                encoder0.encode((Struct) this.mMailboxData, offset + 8, false);
                return;
            default:
                return;
        }
    }

    public static VideoFrameData deserialize(Message message) {
        return decode(new Decoder(message).decoderForSerializedUnion(), 0);
    }

    public static final VideoFrameData decode(Decoder decoder0, int offset) {
        DataHeader dataHeader = decoder0.readDataHeaderForUnion(offset);
        if (dataHeader.size == 0) {
            return null;
        }
        VideoFrameData result = new VideoFrameData();
        switch (dataHeader.elementsOrVersion) {
            case 0:
                Decoder decoder1 = decoder0.readPointer(offset + 8, false);
                result.mEosData = EosVideoFrameData.decode(decoder1);
                result.mTag = 0;
                break;
            case 1:
                Decoder decoder12 = decoder0.readPointer(offset + 8, false);
                result.mSharedBufferData = SharedBufferVideoFrameData.decode(decoder12);
                result.mTag = 1;
                break;
            case 2:
                Decoder decoder13 = decoder0.readPointer(offset + 8, false);
                result.mGpuMemoryBufferData = GpuMemoryBufferVideoFrameData.decode(decoder13);
                result.mTag = 2;
                break;
            case 3:
                Decoder decoder14 = decoder0.readPointer(offset + 8, false);
                result.mMailboxData = MailboxVideoFrameData.decode(decoder14);
                result.mTag = 3;
                break;
        }
        return result;
    }
}
