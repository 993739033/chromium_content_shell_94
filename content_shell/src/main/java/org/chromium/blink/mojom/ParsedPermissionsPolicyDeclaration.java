package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.url.internal.mojom.Origin;
/* loaded from: classes2.dex */
public final class ParsedPermissionsPolicyDeclaration extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 24;
    private static final DataHeader[] VERSION_ARRAY;
    public Origin[] allowedOrigins;
    public int feature;
    public boolean matchesAllOrigins;
    public boolean matchesOpaqueSrc;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private ParsedPermissionsPolicyDeclaration(int version) {
        super(24, version);
    }

    public ParsedPermissionsPolicyDeclaration() {
        this(0);
    }

    public static ParsedPermissionsPolicyDeclaration deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static ParsedPermissionsPolicyDeclaration deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static ParsedPermissionsPolicyDeclaration decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            ParsedPermissionsPolicyDeclaration result = new ParsedPermissionsPolicyDeclaration(elementsOrVersion);
            int readInt = decoder0.readInt(8);
            result.feature = readInt;
            PermissionsPolicyFeature.validate(readInt);
            result.feature = PermissionsPolicyFeature.toKnownValue(result.feature);
            result.matchesAllOrigins = decoder0.readBoolean(12, 0);
            result.matchesOpaqueSrc = decoder0.readBoolean(12, 1);
            Decoder decoder1 = decoder0.readPointer(16, false);
            DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
            result.allowedOrigins = new Origin[si1.elementsOrVersion];
            for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                result.allowedOrigins[i1] = Origin.decode(decoder2);
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
        encoder0.encode(this.feature, 8);
        encoder0.encode(this.matchesAllOrigins, 12, 0);
        encoder0.encode(this.matchesOpaqueSrc, 12, 1);
        Origin[] originArr = this.allowedOrigins;
        if (originArr == null) {
            encoder0.encodeNullPointer(16, false);
            return;
        }
        Encoder encoder1 = encoder0.encodePointerArray(originArr.length, 16, -1);
        int i0 = 0;
        while (true) {
            Origin[] originArr2 = this.allowedOrigins;
            if (i0 < originArr2.length) {
                encoder1.encode((Struct) originArr2[i0], (i0 * 8) + 8, false);
                i0++;
            } else {
                return;
            }
        }
    }
}
