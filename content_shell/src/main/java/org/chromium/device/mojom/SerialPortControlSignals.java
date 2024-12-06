package org.chromium.device.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class SerialPortControlSignals extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 16;
    private static final DataHeader[] VERSION_ARRAY;
    public boolean cts;
    public boolean dcd;
    public boolean dsr;
    public boolean ri;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private SerialPortControlSignals(int version) {
        super(16, version);
    }

    public SerialPortControlSignals() {
        this(0);
    }

    public static SerialPortControlSignals deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static SerialPortControlSignals deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static SerialPortControlSignals decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            SerialPortControlSignals result = new SerialPortControlSignals(elementsOrVersion);
            result.dcd = decoder0.readBoolean(8, 0);
            result.cts = decoder0.readBoolean(8, 1);
            result.ri = decoder0.readBoolean(8, 2);
            result.dsr = decoder0.readBoolean(8, 3);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.dcd, 8, 0);
        encoder0.encode(this.cts, 8, 1);
        encoder0.encode(this.ri, 8, 2);
        encoder0.encode(this.dsr, 8, 3);
    }
}
