package org.chromium.media.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class KeySystemCapability extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 24;
    private static final DataHeader[] VERSION_ARRAY;
    public CdmCapability hwSecureCapability;
    public CdmCapability swSecureCapability;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private KeySystemCapability(int version) {
        super(24, version);
    }

    public KeySystemCapability() {
        this(0);
    }

    public static KeySystemCapability deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static KeySystemCapability deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static KeySystemCapability decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            KeySystemCapability result = new KeySystemCapability(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, true);
            result.swSecureCapability = CdmCapability.decode(decoder1);
            Decoder decoder12 = decoder0.readPointer(16, true);
            result.hwSecureCapability = CdmCapability.decode(decoder12);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode((Struct) this.swSecureCapability, 8, true);
        encoder0.encode((Struct) this.hwSecureCapability, 16, true);
    }
}
