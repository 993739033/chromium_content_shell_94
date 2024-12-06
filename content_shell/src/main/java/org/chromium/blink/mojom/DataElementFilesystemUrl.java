package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo_base.mojom.Time;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public final class DataElementFilesystemUrl extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 40;
    private static final DataHeader[] VERSION_ARRAY;
    public Time expectedModificationTime;
    public long length;
    public long offset;
    public Url url;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private DataElementFilesystemUrl(int version) {
        super(40, version);
    }

    public DataElementFilesystemUrl() {
        this(0);
    }

    public static DataElementFilesystemUrl deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static DataElementFilesystemUrl deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static DataElementFilesystemUrl decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            DataElementFilesystemUrl result = new DataElementFilesystemUrl(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, false);
            result.url = Url.decode(decoder1);
            result.offset = decoder0.readLong(16);
            result.length = decoder0.readLong(24);
            Decoder decoder12 = decoder0.readPointer(32, true);
            result.expectedModificationTime = Time.decode(decoder12);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode((Struct) this.url, 8, false);
        encoder0.encode(this.offset, 16);
        encoder0.encode(this.length, 24);
        encoder0.encode((Struct) this.expectedModificationTime, 32, true);
    }
}
