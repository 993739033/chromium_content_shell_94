package org.chromium.network.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class DataElementDataPipe extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 16;
    private static final DataHeader[] VERSION_ARRAY;
    public DataPipeGetter dataPipeGetter;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private DataElementDataPipe(int version) {
        super(16, version);
    }

    public DataElementDataPipe() {
        this(0);
    }

    public static DataElementDataPipe deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static DataElementDataPipe deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static DataElementDataPipe decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            DataElementDataPipe result = new DataElementDataPipe(elementsOrVersion);
            result.dataPipeGetter = (DataPipeGetter) decoder0.readServiceInterface(8, false, DataPipeGetter.MANAGER);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode( this.dataPipeGetter, 8, false,  DataPipeGetter.MANAGER);
    }
}
