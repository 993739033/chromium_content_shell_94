package org.chromium.network.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class EarlyHints extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 32;
    private static final DataHeader[] VERSION_ARRAY;
    public ParsedHeaders headers;
    public int ipAddressSpace;
    public String[] originTrialTokens;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private EarlyHints(int version) {
        super(32, version);
    }

    public EarlyHints() {
        this(0);
    }

    public static EarlyHints deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static EarlyHints deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static EarlyHints decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            EarlyHints result = new EarlyHints(elementsOrVersion);
            result.headers = ParsedHeaders.decode(decoder0.readPointer(8, false));
            int readInt = decoder0.readInt(16);
            result.ipAddressSpace = readInt;
            IpAddressSpace.validate(readInt);
            result.ipAddressSpace = IpAddressSpace.toKnownValue(result.ipAddressSpace);
            Decoder decoder1 = decoder0.readPointer(24, false);
            DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
            result.originTrialTokens = new String[si1.elementsOrVersion];
            for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                result.originTrialTokens[i1] = decoder1.readString((i1 * 8) + 8, false);
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
        encoder0.encode((Struct) this.headers, 8, false);
        encoder0.encode(this.ipAddressSpace, 16);
        String[] strArr = this.originTrialTokens;
        if (strArr == null) {
            encoder0.encodeNullPointer(24, false);
            return;
        }
        Encoder encoder1 = encoder0.encodePointerArray(strArr.length, 24, -1);
        int i0 = 0;
        while (true) {
            String[] strArr2 = this.originTrialTokens;
            if (i0 < strArr2.length) {
                encoder1.encode(strArr2[i0], (i0 * 8) + 8, false);
                i0++;
            } else {
                return;
            }
        }
    }
}
