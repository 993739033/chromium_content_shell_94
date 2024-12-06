package org.chromium.network.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class CtPolicy extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 40;
    private static final DataHeader[] VERSION_ARRAY;
    public String[] excludedHosts;
    public String[] excludedLegacySpkis;
    public String[] excludedSpkis;
    public String[] requiredHosts;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private CtPolicy(int version) {
        super(40, version);
    }

    public CtPolicy() {
        this(0);
    }

    public static CtPolicy deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static CtPolicy deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static CtPolicy decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            CtPolicy result = new CtPolicy(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, false);
            DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
            result.requiredHosts = new String[si1.elementsOrVersion];
            for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                result.requiredHosts[i1] = decoder1.readString((i1 * 8) + 8, false);
            }
            Decoder decoder12 = decoder0.readPointer(16, false);
            DataHeader si12 = decoder12.readDataHeaderForPointerArray(-1);
            result.excludedHosts = new String[si12.elementsOrVersion];
            for (int i12 = 0; i12 < si12.elementsOrVersion; i12++) {
                result.excludedHosts[i12] = decoder12.readString((i12 * 8) + 8, false);
            }
            Decoder decoder13 = decoder0.readPointer(24, false);
            DataHeader si13 = decoder13.readDataHeaderForPointerArray(-1);
            result.excludedSpkis = new String[si13.elementsOrVersion];
            for (int i13 = 0; i13 < si13.elementsOrVersion; i13++) {
                result.excludedSpkis[i13] = decoder13.readString((i13 * 8) + 8, false);
            }
            Decoder decoder14 = decoder0.readPointer(32, false);
            DataHeader si14 = decoder14.readDataHeaderForPointerArray(-1);
            result.excludedLegacySpkis = new String[si14.elementsOrVersion];
            for (int i14 = 0; i14 < si14.elementsOrVersion; i14++) {
                result.excludedLegacySpkis[i14] = decoder14.readString((i14 * 8) + 8, false);
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
        String[] strArr = this.requiredHosts;
        if (strArr == null) {
            encoder0.encodeNullPointer(8, false);
        } else {
            Encoder encoder1 = encoder0.encodePointerArray(strArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                String[] strArr2 = this.requiredHosts;
                if (i0 >= strArr2.length) {
                    break;
                }
                encoder1.encode(strArr2[i0], (i0 * 8) + 8, false);
                i0++;
            }
        }
        String[] strArr3 = this.excludedHosts;
        if (strArr3 == null) {
            encoder0.encodeNullPointer(16, false);
        } else {
            Encoder encoder12 = encoder0.encodePointerArray(strArr3.length, 16, -1);
            int i02 = 0;
            while (true) {
                String[] strArr4 = this.excludedHosts;
                if (i02 >= strArr4.length) {
                    break;
                }
                encoder12.encode(strArr4[i02], (i02 * 8) + 8, false);
                i02++;
            }
        }
        String[] strArr5 = this.excludedSpkis;
        if (strArr5 == null) {
            encoder0.encodeNullPointer(24, false);
        } else {
            Encoder encoder13 = encoder0.encodePointerArray(strArr5.length, 24, -1);
            int i03 = 0;
            while (true) {
                String[] strArr6 = this.excludedSpkis;
                if (i03 >= strArr6.length) {
                    break;
                }
                encoder13.encode(strArr6[i03], (i03 * 8) + 8, false);
                i03++;
            }
        }
        String[] strArr7 = this.excludedLegacySpkis;
        if (strArr7 == null) {
            encoder0.encodeNullPointer(32, false);
            return;
        }
        Encoder encoder14 = encoder0.encodePointerArray(strArr7.length, 32, -1);
        int i04 = 0;
        while (true) {
            String[] strArr8 = this.excludedLegacySpkis;
            if (i04 < strArr8.length) {
                encoder14.encode(strArr8[i04], (i04 * 8) + 8, false);
                i04++;
            } else {
                return;
            }
        }
    }
}
