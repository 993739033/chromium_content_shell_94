package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo_base.mojom.Time;
/* loaded from: classes2.dex */
public final class BucketPolicies extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 32;
    private static final DataHeader[] VERSION_ARRAY;
    public int durability;
    public Time expires;
    public boolean persisted;
    public long quota;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private BucketPolicies(int version) {
        super(32, version);
    }

    public BucketPolicies() {
        this(0);
    }

    public static BucketPolicies deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static BucketPolicies deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static BucketPolicies decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            BucketPolicies result = new BucketPolicies(elementsOrVersion);
            result.persisted = decoder0.readBoolean(8, 0);
            int readInt = decoder0.readInt(12);
            result.durability = readInt;
            BucketDurability.validate(readInt);
            result.durability = BucketDurability.toKnownValue(result.durability);
            result.quota = decoder0.readLong(16);
            Decoder decoder1 = decoder0.readPointer(24, true);
            result.expires = Time.decode(decoder1);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.persisted, 8, 0);
        encoder0.encode(this.durability, 12);
        encoder0.encode(this.quota, 16);
        encoder0.encode((Struct) this.expires, 24, true);
    }
}
