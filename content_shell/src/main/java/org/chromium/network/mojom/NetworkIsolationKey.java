package org.chromium.network.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo_base.mojom.UnguessableToken;
/* loaded from: classes2.dex */
public final class NetworkIsolationKey extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 40;
    private static final DataHeader[] VERSION_ARRAY;
    public SchemefulSite frameSite;
    public UnguessableToken nonce;
    public boolean opaqueAndNonTransient;
    public SchemefulSite topFrameSite;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private NetworkIsolationKey(int version) {
        super(40, version);
    }

    public NetworkIsolationKey() {
        this(0);
    }

    public static NetworkIsolationKey deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static NetworkIsolationKey deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static NetworkIsolationKey decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            NetworkIsolationKey result = new NetworkIsolationKey(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, true);
            result.topFrameSite = SchemefulSite.decode(decoder1);
            Decoder decoder12 = decoder0.readPointer(16, true);
            result.frameSite = SchemefulSite.decode(decoder12);
            result.opaqueAndNonTransient = decoder0.readBoolean(24, 0);
            Decoder decoder13 = decoder0.readPointer(32, true);
            result.nonce = UnguessableToken.decode(decoder13);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode((Struct) this.topFrameSite, 8, true);
        encoder0.encode((Struct) this.frameSite, 16, true);
        encoder0.encode(this.opaqueAndNonTransient, 24, 0);
        encoder0.encode((Struct) this.nonce, 32, true);
    }
}
