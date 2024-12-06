package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo_base.mojom.TimeDelta;
import org.chromium.url.internal.mojom.Origin;
/* loaded from: classes2.dex */
public final class Impression extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 48;
    private static final DataHeader[] VERSION_ARRAY;
    public Origin conversionDestination;
    public TimeDelta expiry;
    public long impressionData;
    public long priority;
    public Origin reportingOrigin;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(48, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private Impression(int version) {
        super(48, version);
        this.priority = 0L;
    }

    public Impression() {
        this(0);
    }

    public static Impression deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static Impression deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static Impression decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            Impression result = new Impression(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, false);
            result.conversionDestination = Origin.decode(decoder1);
            Decoder decoder12 = decoder0.readPointer(16, true);
            result.reportingOrigin = Origin.decode(decoder12);
            result.impressionData = decoder0.readLong(24);
            Decoder decoder13 = decoder0.readPointer(32, true);
            result.expiry = TimeDelta.decode(decoder13);
            result.priority = decoder0.readLong(40);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode((Struct) this.conversionDestination, 8, false);
        encoder0.encode((Struct) this.reportingOrigin, 16, true);
        encoder0.encode(this.impressionData, 24);
        encoder0.encode((Struct) this.expiry, 32, true);
        encoder0.encode(this.priority, 40);
    }
}
