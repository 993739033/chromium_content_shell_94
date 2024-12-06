package org.chromium.network.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.url.internal.mojom.Origin;
/* loaded from: classes2.dex */
public final class TrustTokenParams extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 48;
    private static final DataHeader[] VERSION_ARRAY;
    public String[] additionalSignedHeaders;
    public boolean includeTimestampHeader;
    public Origin[] issuers;
    public String possiblyUnsafeAdditionalSigningData;
    public int refreshPolicy;
    public int signRequestData;
    public int type;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(48, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private TrustTokenParams(int version) {
        super(48, version);
        this.refreshPolicy = 0;
        this.signRequestData = 0;
        this.includeTimestampHeader = false;
    }

    public TrustTokenParams() {
        this(0);
    }

    public static TrustTokenParams deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static TrustTokenParams deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static TrustTokenParams decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            TrustTokenParams result = new TrustTokenParams(elementsOrVersion);
            int readInt = decoder0.readInt(8);
            result.type = readInt;
            TrustTokenOperationType.validate(readInt);
            result.type = TrustTokenOperationType.toKnownValue(result.type);
            int readInt2 = decoder0.readInt(12);
            result.refreshPolicy = readInt2;
            TrustTokenRefreshPolicy.validate(readInt2);
            result.refreshPolicy = TrustTokenRefreshPolicy.toKnownValue(result.refreshPolicy);
            int readInt3 = decoder0.readInt(16);
            result.signRequestData = readInt3;
            TrustTokenSignRequestData.validate(readInt3);
            result.signRequestData = TrustTokenSignRequestData.toKnownValue(result.signRequestData);
            result.includeTimestampHeader = decoder0.readBoolean(20, 0);
            Decoder decoder1 = decoder0.readPointer(24, false);
            DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
            result.issuers = new Origin[si1.elementsOrVersion];
            for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                result.issuers[i1] = Origin.decode(decoder2);
            }
            Decoder decoder12 = decoder0.readPointer(32, false);
            DataHeader si12 = decoder12.readDataHeaderForPointerArray(-1);
            result.additionalSignedHeaders = new String[si12.elementsOrVersion];
            for (int i12 = 0; i12 < si12.elementsOrVersion; i12++) {
                result.additionalSignedHeaders[i12] = decoder12.readString((i12 * 8) + 8, false);
            }
            result.possiblyUnsafeAdditionalSigningData = decoder0.readString(40, true);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.type, 8);
        encoder0.encode(this.refreshPolicy, 12);
        encoder0.encode(this.signRequestData, 16);
        encoder0.encode(this.includeTimestampHeader, 20, 0);
        Origin[] originArr = this.issuers;
        if (originArr == null) {
            encoder0.encodeNullPointer(24, false);
        } else {
            Encoder encoder1 = encoder0.encodePointerArray(originArr.length, 24, -1);
            int i0 = 0;
            while (true) {
                Origin[] originArr2 = this.issuers;
                if (i0 >= originArr2.length) {
                    break;
                }
                encoder1.encode((Struct) originArr2[i0], (i0 * 8) + 8, false);
                i0++;
            }
        }
        String[] strArr = this.additionalSignedHeaders;
        if (strArr == null) {
            encoder0.encodeNullPointer(32, false);
        } else {
            Encoder encoder12 = encoder0.encodePointerArray(strArr.length, 32, -1);
            int i02 = 0;
            while (true) {
                String[] strArr2 = this.additionalSignedHeaders;
                if (i02 >= strArr2.length) {
                    break;
                }
                encoder12.encode(strArr2[i02], (i02 * 8) + 8, false);
                i02++;
            }
        }
        encoder0.encode(this.possiblyUnsafeAdditionalSigningData, 40, true);
    }
}
