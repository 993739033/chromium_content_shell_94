package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class PeerConnectionInfo extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 40;
    private static final DataHeader[] VERSION_ARRAY;
    public String constraints;
    public int lid;
    public String rtcConfiguration;
    public String url;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private PeerConnectionInfo(int version) {
        super(40, version);
    }

    public PeerConnectionInfo() {
        this(0);
    }

    public static PeerConnectionInfo deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static PeerConnectionInfo deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static PeerConnectionInfo decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            PeerConnectionInfo result = new PeerConnectionInfo(elementsOrVersion);
            result.lid = decoder0.readInt(8);
            result.rtcConfiguration = decoder0.readString(16, false);
            result.constraints = decoder0.readString(24, false);
            result.url = decoder0.readString(32, false);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.lid, 8);
        encoder0.encode(this.rtcConfiguration, 16, false);
        encoder0.encode(this.constraints, 24, false);
        encoder0.encode(this.url, 32, false);
    }
}
