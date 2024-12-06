package org.chromium.blink.mojom;

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
public final class StorageKey extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 24;
    private static final DataHeader[] VERSION_ARRAY;
    public UnguessableToken nonce;
    public Origin origin;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private StorageKey(int version) {
        super(24, version);
    }

    public StorageKey() {
        this(0);
    }

    public static StorageKey deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static StorageKey deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static StorageKey decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            StorageKey result = new StorageKey(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, false);
            result.origin = Origin.decode(decoder1);
            Decoder decoder12 = decoder0.readPointer(16, true);
            result.nonce = UnguessableToken.decode(decoder12);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode((Struct) this.origin, 8, false);
        encoder0.encode((Struct) this.nonce, 16, true);
    }
}
