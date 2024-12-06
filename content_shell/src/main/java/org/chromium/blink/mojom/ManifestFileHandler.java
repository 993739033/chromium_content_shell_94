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
import org.chromium.mojo_base.mojom.String16;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public final class ManifestFileHandler extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 40;
    private static final DataHeader[] VERSION_ARRAY;
    public Map<String16, String16[]> accept;
    public Url action;
    public ManifestImageResource[] icons;
    public String16 name;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private ManifestFileHandler(int version) {
        super(40, version);
    }

    public ManifestFileHandler() {
        this(0);
    }

    public static ManifestFileHandler deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static ManifestFileHandler deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static ManifestFileHandler decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            ManifestFileHandler result = new ManifestFileHandler(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, false);
            result.action = Url.decode(decoder1);
            Decoder decoder12 = decoder0.readPointer(16, false);
            result.name = String16.decode(decoder12);
            Decoder decoder13 = decoder0.readPointer(24, false);
            int i = -1;
            DataHeader si1 = decoder13.readDataHeaderForPointerArray(-1);
            result.icons = new ManifestImageResource[si1.elementsOrVersion];
            for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                result.icons[i1] = ManifestImageResource.decode(decoder13.readPointer((i1 * 8) + 8, false));
            }
            Decoder decoder14 = decoder0.readPointer(32, false);
            decoder14.readDataHeaderForMap();
            Decoder decoder2 = decoder14.readPointer(8, false);
            DataHeader si2 = decoder2.readDataHeaderForPointerArray(-1);
            String16[] keys0 = new String16[si2.elementsOrVersion];
            for (int i2 = 0; i2 < si2.elementsOrVersion; i2++) {
                keys0[i2] = String16.decode(decoder2.readPointer((i2 * 8) + 8, false));
            }
            Decoder decoder22 = decoder14.readPointer(16, false);
            DataHeader si22 = decoder22.readDataHeaderForPointerArray(keys0.length);
            String16[][] values0 = new String16[si22.elementsOrVersion][];
            int i22 = 0;
            while (i22 < si22.elementsOrVersion) {
                Decoder decoder3 = decoder22.readPointer((i22 * 8) + 8, false);
                DataHeader si3 = decoder3.readDataHeaderForPointerArray(i);
                values0[i22] = new String16[si3.elementsOrVersion];
                for (int i3 = 0; i3 < si3.elementsOrVersion; i3++) {
                    Decoder decoder4 = decoder3.readPointer((i3 * 8) + 8, false);
                    values0[i22][i3] = String16.decode(decoder4);
                }
                i22++;
                i = -1;
            }
            result.accept = new HashMap();
            for (int index0 = 0; index0 < keys0.length; index0++) {
                result.accept.put(keys0[index0], values0[index0]);
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
        encoder0.encode((Struct) this.action, 8, false);
        encoder0.encode((Struct) this.name, 16, false);
        ManifestImageResource[] manifestImageResourceArr = this.icons;
        int i = -1;
        if (manifestImageResourceArr == null) {
            encoder0.encodeNullPointer(24, false);
        } else {
            Encoder encoder1 = encoder0.encodePointerArray(manifestImageResourceArr.length, 24, -1);
            int i0 = 0;
            while (true) {
                ManifestImageResource[] manifestImageResourceArr2 = this.icons;
                if (i0 >= manifestImageResourceArr2.length) {
                    break;
                }
                encoder1.encode((Struct) manifestImageResourceArr2[i0], (i0 * 8) + 8, false);
                i0++;
            }
        }
        if (this.accept == null) {
            encoder0.encodeNullPointer(32, false);
            return;
        }
        Encoder encoder12 = encoder0.encoderForMap(32);
        int size0 = this.accept.size();
        String16[] keys0 = new String16[size0];
        String16[][] values0 = new String16[size0][];
        int index0 = 0;
        for (Map.Entry<String16, String16[]> entry0 : this.accept.entrySet()) {
            keys0[index0] = entry0.getKey();
            values0[index0] = entry0.getValue();
            index0++;
        }
        Encoder encoder2 = encoder12.encodePointerArray(keys0.length, 8, -1);
        for (int i1 = 0; i1 < keys0.length; i1++) {
            encoder2.encode((Struct) keys0[i1], (i1 * 8) + 8, false);
        }
        Encoder encoder22 = encoder12.encodePointerArray(values0.length, 16, -1);
        int i12 = 0;
        while (i12 < values0.length) {
            if (values0[i12] == null) {
                encoder22.encodeNullPointer((i12 * 8) + 8, false);
            } else {
                Encoder encoder3 = encoder22.encodePointerArray(values0[i12].length, (i12 * 8) + 8, i);
                for (int i2 = 0; i2 < values0[i12].length; i2++) {
                    encoder3.encode((Struct) values0[i12][i2], (i2 * 8) + 8, false);
                }
            }
            i12++;
            i = -1;
        }
    }
}
