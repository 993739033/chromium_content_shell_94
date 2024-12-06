package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo.bindings.Union;
import org.chromium.url.internal.mojom.Origin;
/* loaded from: classes2.dex */
public final class InterestGroupBuyers extends Union {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private AllBuyers mAllBuyers;
    private Origin[] mBuyers;

    /* loaded from: classes2.dex */
    public static final class Tag {
        public static final int AllBuyers = 1;
        public static final int Buyers = 0;
    }

    public void setBuyers(Origin[] buyers) {
        this.mTag = 0;
        this.mBuyers = buyers;
    }

    public Origin[] getBuyers() {
        if (this.mTag != 0) {
            throw new AssertionError();
        }
        return this.mBuyers;
    }

    public void setAllBuyers(AllBuyers allBuyers) {
        this.mTag = 1;
        this.mAllBuyers = allBuyers;
    }

    public AllBuyers getAllBuyers() {
        if (this.mTag != 1) {
            throw new AssertionError();
        }
        return this.mAllBuyers;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Union
    public final void encode(Encoder encoder0, int offset) {
        encoder0.encode(16, offset);
        encoder0.encode(this.mTag, offset + 4);
        switch (this.mTag) {
            case 0:
                Origin[] originArr = this.mBuyers;
                if (originArr == null) {
                    encoder0.encodeNullPointer(offset + 8, false);
                    return;
                }
                Encoder encoder1 = encoder0.encodePointerArray(originArr.length, offset + 8, -1);
                int i0 = 0;
                while (true) {
                    Origin[] originArr2 = this.mBuyers;
                    if (i0 < originArr2.length) {
                        encoder1.encode((Struct) originArr2[i0], (i0 * 8) + 8, false);
                        i0++;
                    } else {
                        return;
                    }
                }
            case 1:
                encoder0.encode((Struct) this.mAllBuyers, offset + 8, false);
                return;
            default:
                return;
        }
    }

    public static InterestGroupBuyers deserialize(Message message) {
        return decode(new Decoder(message).decoderForSerializedUnion(), 0);
    }

    public static final InterestGroupBuyers decode(Decoder decoder0, int offset) {
        DataHeader dataHeader = decoder0.readDataHeaderForUnion(offset);
        if (dataHeader.size == 0) {
            return null;
        }
        InterestGroupBuyers result = new InterestGroupBuyers();
        switch (dataHeader.elementsOrVersion) {
            case 0:
                Decoder decoder1 = decoder0.readPointer(offset + 8, false);
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.mBuyers = new Origin[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.mBuyers[i1] = Origin.decode(decoder2);
                }
                result.mTag = 0;
                break;
            case 1:
                result.mAllBuyers = AllBuyers.decode(decoder0.readPointer(offset + 8, false));
                result.mTag = 1;
                break;
        }
        return result;
    }
}
