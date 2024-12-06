package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo.bindings.Union;
import org.chromium.url.internal.mojom.Origin;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public final class AuctionAdConfig extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 64;
    private static final DataHeader[] VERSION_ARRAY;
    public String auctionSignals;
    public Url decisionLogicUrl;
    public InterestGroupBuyers interestGroupBuyers;
    public Map<Origin, String> perBuyerSignals;
    public Origin seller;
    public String sellerSignals;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(64, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private AuctionAdConfig(int version) {
        super(64, version);
    }

    public AuctionAdConfig() {
        this(0);
    }

    public static AuctionAdConfig deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static AuctionAdConfig deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static AuctionAdConfig decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            AuctionAdConfig result = new AuctionAdConfig(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, false);
            result.seller = Origin.decode(decoder1);
            Decoder decoder12 = decoder0.readPointer(16, false);
            result.decisionLogicUrl = Url.decode(decoder12);
            result.interestGroupBuyers = InterestGroupBuyers.decode(decoder0, 24);
            result.auctionSignals = decoder0.readString(40, true);
            result.sellerSignals = decoder0.readString(48, true);
            Decoder decoder13 = decoder0.readPointer(56, true);
            if (decoder13 == null) {
                result.perBuyerSignals = null;
            } else {
                decoder13.readDataHeaderForMap();
                Decoder decoder2 = decoder13.readPointer(8, false);
                DataHeader si2 = decoder2.readDataHeaderForPointerArray(-1);
                Origin[] keys0 = new Origin[si2.elementsOrVersion];
                for (int i2 = 0; i2 < si2.elementsOrVersion; i2++) {
                    Decoder decoder3 = decoder2.readPointer((i2 * 8) + 8, false);
                    keys0[i2] = Origin.decode(decoder3);
                }
                Decoder decoder22 = decoder13.readPointer(16, false);
                DataHeader si22 = decoder22.readDataHeaderForPointerArray(keys0.length);
                String[] values0 = new String[si22.elementsOrVersion];
                for (int i22 = 0; i22 < si22.elementsOrVersion; i22++) {
                    values0[i22] = decoder22.readString((i22 * 8) + 8, false);
                }
                result.perBuyerSignals = new HashMap();
                for (int index0 = 0; index0 < keys0.length; index0++) {
                    result.perBuyerSignals.put(keys0[index0], values0[index0]);
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
        encoder0.encode((Struct) this.seller, 8, false);
        encoder0.encode((Struct) this.decisionLogicUrl, 16, false);
        encoder0.encode((Union) this.interestGroupBuyers, 24, true);
        encoder0.encode(this.auctionSignals, 40, true);
        encoder0.encode(this.sellerSignals, 48, true);
        if (this.perBuyerSignals == null) {
            encoder0.encodeNullPointer(56, true);
            return;
        }
        Encoder encoder1 = encoder0.encoderForMap(56);
        int size0 = this.perBuyerSignals.size();
        Origin[] keys0 = new Origin[size0];
        String[] values0 = new String[size0];
        int index0 = 0;
        for (Map.Entry<Origin, String> entry0 : this.perBuyerSignals.entrySet()) {
            keys0[index0] = entry0.getKey();
            values0[index0] = entry0.getValue();
            index0++;
        }
        Encoder encoder2 = encoder1.encodePointerArray(keys0.length, 8, -1);
        for (int i1 = 0; i1 < keys0.length; i1++) {
            encoder2.encode((Struct) keys0[i1], (i1 * 8) + 8, false);
        }
        Encoder encoder22 = encoder1.encodePointerArray(values0.length, 16, -1);
        for (int i12 = 0; i12 < values0.length; i12++) {
            encoder22.encode(values0[i12], (i12 * 8) + 8, false);
        }
    }
}
