package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public final class AppCacheErrorDetails extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 40;
    private static final DataHeader[] VERSION_ARRAY;
    public boolean isCrossOrigin;
    public String message;
    public int reason;
    public int status;
    public Url url;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private AppCacheErrorDetails(int version) {
        super(40, version);
        this.reason = 7;
    }

    public AppCacheErrorDetails() {
        this(0);
    }

    public static AppCacheErrorDetails deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static AppCacheErrorDetails deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static AppCacheErrorDetails decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            AppCacheErrorDetails result = new AppCacheErrorDetails(elementsOrVersion);
            result.message = decoder0.readString(8, false);
            int readInt = decoder0.readInt(16);
            result.reason = readInt;
            AppCacheErrorReason.validate(readInt);
            result.reason = AppCacheErrorReason.toKnownValue(result.reason);
            result.status = decoder0.readInt(20);
            Decoder decoder1 = decoder0.readPointer(24, false);
            result.url = Url.decode(decoder1);
            result.isCrossOrigin = decoder0.readBoolean(32, 0);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.message, 8, false);
        encoder0.encode(this.reason, 16);
        encoder0.encode(this.status, 20);
        encoder0.encode((Struct) this.url, 24, false);
        encoder0.encode(this.isCrossOrigin, 32, 0);
    }
}
