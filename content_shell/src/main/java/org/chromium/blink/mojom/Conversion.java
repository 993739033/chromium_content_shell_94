package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.url.internal.mojom.Origin;
/* loaded from: classes2.dex */
public final class Conversion extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 48;
    private static final DataHeader[] VERSION_ARRAY;
    public long conversionData;
    public DedupKey dedupKey;
    public long eventSourceTriggerData;
    public long priority;
    public Origin reportingOrigin;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(48, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private Conversion(int version) {
        super(48, version);
        this.conversionData = 0L;
        this.eventSourceTriggerData = 0L;
        this.priority = 0L;
    }

    public Conversion() {
        this(0);
    }

    public static Conversion deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static Conversion deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static Conversion decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            Conversion result = new Conversion(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, false);
            result.reportingOrigin = Origin.decode(decoder1);
            result.conversionData = decoder0.readLong(16);
            result.eventSourceTriggerData = decoder0.readLong(24);
            result.priority = decoder0.readLong(32);
            Decoder decoder12 = decoder0.readPointer(40, true);
            result.dedupKey = DedupKey.decode(decoder12);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode((Struct) this.reportingOrigin, 8, false);
        encoder0.encode(this.conversionData, 16);
        encoder0.encode(this.eventSourceTriggerData, 24);
        encoder0.encode(this.priority, 32);
        encoder0.encode((Struct) this.dedupKey, 40, true);
    }
}
