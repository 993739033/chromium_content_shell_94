package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo_base.mojom.String16;
/* loaded from: classes2.dex */
public final class AppHistoryEntry extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 32;
    private static final DataHeader[] VERSION_ARRAY;
    public String16 id;
    public String16 key;
    public String16 url;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private AppHistoryEntry(int version) {
        super(32, version);
    }

    public AppHistoryEntry() {
        this(0);
    }

    public static AppHistoryEntry deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static AppHistoryEntry deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static AppHistoryEntry decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            AppHistoryEntry result = new AppHistoryEntry(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, false);
            result.key = String16.decode(decoder1);
            Decoder decoder12 = decoder0.readPointer(16, false);
            result.id = String16.decode(decoder12);
            Decoder decoder13 = decoder0.readPointer(24, false);
            result.url = String16.decode(decoder13);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode((Struct) this.key, 8, false);
        encoder0.encode((Struct) this.id, 16, false);
        encoder0.encode((Struct) this.url, 24, false);
    }
}
