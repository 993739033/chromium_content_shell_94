package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo_base.mojom.Time;
import org.chromium.url.internal.mojom.Origin;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public final class InterestGroup extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 80;
    private static final DataHeader[] VERSION_ARRAY;
    public InterestGroupAd[] ads;
    public Url biddingUrl;
    public Time expiry;
    public String name;
    public Origin owner;
    public String[] trustedBiddingSignalsKeys;
    public Url trustedBiddingSignalsUrl;
    public Url updateUrl;
    public String userBiddingSignals;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(80, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private InterestGroup(int version) {
        super(80, version);
    }

    public InterestGroup() {
        this(0);
    }

    public static InterestGroup deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static InterestGroup deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static InterestGroup decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            InterestGroup result = new InterestGroup(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, false);
            result.expiry = Time.decode(decoder1);
            Decoder decoder12 = decoder0.readPointer(16, false);
            result.owner = Origin.decode(decoder12);
            result.name = decoder0.readString(24, false);
            Decoder decoder13 = decoder0.readPointer(32, true);
            result.biddingUrl = Url.decode(decoder13);
            Decoder decoder14 = decoder0.readPointer(40, true);
            result.updateUrl = Url.decode(decoder14);
            Decoder decoder15 = decoder0.readPointer(48, true);
            result.trustedBiddingSignalsUrl = Url.decode(decoder15);
            Decoder decoder16 = decoder0.readPointer(56, true);
            if (decoder16 == null) {
                result.trustedBiddingSignalsKeys = null;
            } else {
                DataHeader si1 = decoder16.readDataHeaderForPointerArray(-1);
                result.trustedBiddingSignalsKeys = new String[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    result.trustedBiddingSignalsKeys[i1] = decoder16.readString((i1 * 8) + 8, false);
                }
            }
            result.userBiddingSignals = decoder0.readString(64, true);
            Decoder decoder17 = decoder0.readPointer(72, true);
            if (decoder17 == null) {
                result.ads = null;
            } else {
                DataHeader si12 = decoder17.readDataHeaderForPointerArray(-1);
                result.ads = new InterestGroupAd[si12.elementsOrVersion];
                for (int i12 = 0; i12 < si12.elementsOrVersion; i12++) {
                    Decoder decoder2 = decoder17.readPointer((i12 * 8) + 8, false);
                    result.ads[i12] = InterestGroupAd.decode(decoder2);
                }
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
        encoder0.encode((Struct) this.expiry, 8, false);
        encoder0.encode((Struct) this.owner, 16, false);
        encoder0.encode(this.name, 24, false);
        encoder0.encode((Struct) this.biddingUrl, 32, true);
        encoder0.encode((Struct) this.updateUrl, 40, true);
        encoder0.encode((Struct) this.trustedBiddingSignalsUrl, 48, true);
        String[] strArr = this.trustedBiddingSignalsKeys;
        if (strArr == null) {
            encoder0.encodeNullPointer(56, true);
        } else {
            Encoder encoder1 = encoder0.encodePointerArray(strArr.length, 56, -1);
            int i0 = 0;
            while (true) {
                String[] strArr2 = this.trustedBiddingSignalsKeys;
                if (i0 >= strArr2.length) {
                    break;
                }
                encoder1.encode(strArr2[i0], (i0 * 8) + 8, false);
                i0++;
            }
        }
        encoder0.encode(this.userBiddingSignals, 64, true);
        InterestGroupAd[] interestGroupAdArr = this.ads;
        if (interestGroupAdArr == null) {
            encoder0.encodeNullPointer(72, true);
            return;
        }
        Encoder encoder12 = encoder0.encodePointerArray(interestGroupAdArr.length, 72, -1);
        int i02 = 0;
        while (true) {
            InterestGroupAd[] interestGroupAdArr2 = this.ads;
            if (i02 < interestGroupAdArr2.length) {
                encoder12.encode((Struct) interestGroupAdArr2[i02], (i02 * 8) + 8, false);
                i02++;
            } else {
                return;
            }
        }
    }
}
