package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo_base.mojom.UnguessableToken;
/* loaded from: classes2.dex */
public final class ServiceWorkerToken extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 16;
    private static final DataHeader[] VERSION_ARRAY;
    public UnguessableToken value;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private ServiceWorkerToken(int version) {
        super(16, version);
    }

    public ServiceWorkerToken() {
        this(0);
    }

    public static ServiceWorkerToken deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static ServiceWorkerToken deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static ServiceWorkerToken decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            ServiceWorkerToken result = new ServiceWorkerToken(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, false);
            result.value = UnguessableToken.decode(decoder1);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode((Struct) this.value, 8, false);
    }
}
