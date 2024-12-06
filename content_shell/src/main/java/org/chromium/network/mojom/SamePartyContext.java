package org.chromium.network.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class SamePartyContext extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 24;
    private static final DataHeader[] VERSION_ARRAY;
    public int ancestorsForMetricsOnly;
    public int contextType;
    public int topResourceForMetricsOnly;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private SamePartyContext(int version) {
        super(24, version);
        this.contextType = 0;
        this.ancestorsForMetricsOnly = 0;
        this.topResourceForMetricsOnly = 0;
    }

    public SamePartyContext() {
        this(0);
    }

    public static SamePartyContext deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static SamePartyContext deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static SamePartyContext decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            SamePartyContext result = new SamePartyContext(elementsOrVersion);
            int readInt = decoder0.readInt(8);
            result.contextType = readInt;
            SamePartyCookieContextType.validate(readInt);
            result.contextType = SamePartyCookieContextType.toKnownValue(result.contextType);
            int readInt2 = decoder0.readInt(12);
            result.ancestorsForMetricsOnly = readInt2;
            SamePartyCookieContextType.validate(readInt2);
            result.ancestorsForMetricsOnly = SamePartyCookieContextType.toKnownValue(result.ancestorsForMetricsOnly);
            int readInt3 = decoder0.readInt(16);
            result.topResourceForMetricsOnly = readInt3;
            SamePartyCookieContextType.validate(readInt3);
            result.topResourceForMetricsOnly = SamePartyCookieContextType.toKnownValue(result.topResourceForMetricsOnly);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.contextType, 8);
        encoder0.encode(this.ancestorsForMetricsOnly, 12);
        encoder0.encode(this.topResourceForMetricsOnly, 16);
    }
}
