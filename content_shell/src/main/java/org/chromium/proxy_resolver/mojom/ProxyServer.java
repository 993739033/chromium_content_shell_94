package org.chromium.proxy_resolver.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class ProxyServer extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 24;
    private static final DataHeader[] VERSION_ARRAY;
    public String host;
    public short port;
    public int scheme;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private ProxyServer(int version) {
        super(24, version);
    }

    public ProxyServer() {
        this(0);
    }

    public static ProxyServer deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static ProxyServer deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static ProxyServer decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            ProxyServer result = new ProxyServer(elementsOrVersion);
            int readInt = decoder0.readInt(8);
            result.scheme = readInt;
            ProxyScheme.validate(readInt);
            result.scheme = ProxyScheme.toKnownValue(result.scheme);
            result.port = decoder0.readShort(12);
            result.host = decoder0.readString(16, false);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.scheme, 8);
        encoder0.encode(this.port, 12);
        encoder0.encode(this.host, 16, false);
    }
}
