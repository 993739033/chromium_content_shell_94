package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo.bindings.Union;
/* loaded from: classes2.dex */
public final class FrameToken extends Union {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private LocalFrameToken mLocalFrameToken;
    private RemoteFrameToken mRemoteFrameToken;

    /* loaded from: classes2.dex */
    public static final class Tag {
        public static final int LocalFrameToken = 0;
        public static final int RemoteFrameToken = 1;
    }

    public void setLocalFrameToken(LocalFrameToken localFrameToken) {
        this.mTag = 0;
        this.mLocalFrameToken = localFrameToken;
    }

    public LocalFrameToken getLocalFrameToken() {
        if (this.mTag != 0) {
            throw new AssertionError();
        }
        return this.mLocalFrameToken;
    }

    public void setRemoteFrameToken(RemoteFrameToken remoteFrameToken) {
        this.mTag = 1;
        this.mRemoteFrameToken = remoteFrameToken;
    }

    public RemoteFrameToken getRemoteFrameToken() {
        if (this.mTag != 1) {
            throw new AssertionError();
        }
        return this.mRemoteFrameToken;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Union
    public final void encode(Encoder encoder0, int offset) {
        encoder0.encode(16, offset);
        encoder0.encode(this.mTag, offset + 4);
        switch (this.mTag) {
            case 0:
                encoder0.encode((Struct) this.mLocalFrameToken, offset + 8, false);
                return;
            case 1:
                encoder0.encode((Struct) this.mRemoteFrameToken, offset + 8, false);
                return;
            default:
                return;
        }
    }

    public static FrameToken deserialize(Message message) {
        return decode(new Decoder(message).decoderForSerializedUnion(), 0);
    }

    public static final FrameToken decode(Decoder decoder0, int offset) {
        DataHeader dataHeader = decoder0.readDataHeaderForUnion(offset);
        if (dataHeader.size == 0) {
            return null;
        }
        FrameToken result = new FrameToken();
        switch (dataHeader.elementsOrVersion) {
            case 0:
                Decoder decoder1 = decoder0.readPointer(offset + 8, false);
                result.mLocalFrameToken = LocalFrameToken.decode(decoder1);
                result.mTag = 0;
                break;
            case 1:
                Decoder decoder12 = decoder0.readPointer(offset + 8, false);
                result.mRemoteFrameToken = RemoteFrameToken.decode(decoder12);
                result.mTag = 1;
                break;
        }
        return result;
    }
}
