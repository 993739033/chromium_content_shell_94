package org.chromium.network.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo_base.mojom.UnguessableToken;
import org.chromium.url.internal.mojom.Origin;
/* loaded from: classes2.dex */
public final class IsolationInfo extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 56;
    private static final DataHeader[] VERSION_ARRAY;
    public Origin frameOrigin;
    public UnguessableToken nonce;
    public boolean opaqueAndNonTransient;
    public SchemefulSite[] partyContext;
    public int requestType;
    public SiteForCookies siteForCookies;
    public Origin topFrameOrigin;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(56, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private IsolationInfo(int version) {
        super(56, version);
    }

    public IsolationInfo() {
        this(0);
    }

    public static IsolationInfo deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static IsolationInfo deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static IsolationInfo decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            IsolationInfo result = new IsolationInfo(elementsOrVersion);
            int readInt = decoder0.readInt(8);
            result.requestType = readInt;
            IsolationInfoRequestType.validate(readInt);
            result.requestType = IsolationInfoRequestType.toKnownValue(result.requestType);
            result.opaqueAndNonTransient = decoder0.readBoolean(12, 0);
            Decoder decoder1 = decoder0.readPointer(16, true);
            result.topFrameOrigin = Origin.decode(decoder1);
            Decoder decoder12 = decoder0.readPointer(24, true);
            result.frameOrigin = Origin.decode(decoder12);
            Decoder decoder13 = decoder0.readPointer(32, true);
            result.nonce = UnguessableToken.decode(decoder13);
            Decoder decoder14 = decoder0.readPointer(40, false);
            result.siteForCookies = SiteForCookies.decode(decoder14);
            Decoder decoder15 = decoder0.readPointer(48, true);
            if (decoder15 == null) {
                result.partyContext = null;
            } else {
                DataHeader si1 = decoder15.readDataHeaderForPointerArray(-1);
                result.partyContext = new SchemefulSite[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder15.readPointer((i1 * 8) + 8, false);
                    result.partyContext[i1] = SchemefulSite.decode(decoder2);
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
        encoder0.encode(this.requestType, 8);
        encoder0.encode(this.opaqueAndNonTransient, 12, 0);
        encoder0.encode((Struct) this.topFrameOrigin, 16, true);
        encoder0.encode((Struct) this.frameOrigin, 24, true);
        encoder0.encode((Struct) this.nonce, 32, true);
        encoder0.encode((Struct) this.siteForCookies, 40, false);
        SchemefulSite[] schemefulSiteArr = this.partyContext;
        if (schemefulSiteArr == null) {
            encoder0.encodeNullPointer(48, true);
            return;
        }
        Encoder encoder1 = encoder0.encodePointerArray(schemefulSiteArr.length, 48, -1);
        int i0 = 0;
        while (true) {
            SchemefulSite[] schemefulSiteArr2 = this.partyContext;
            if (i0 < schemefulSiteArr2.length) {
                encoder1.encode((Struct) schemefulSiteArr2[i0], (i0 * 8) + 8, false);
                i0++;
            } else {
                return;
            }
        }
    }
}
