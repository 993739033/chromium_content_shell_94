package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class ComputePressureQuantization extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 24;
    private static final DataHeader[] VERSION_ARRAY;
    public double[] cpuSpeedThresholds;
    public double[] cpuUtilizationThresholds;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private ComputePressureQuantization(int version) {
        super(24, version);
    }

    public ComputePressureQuantization() {
        this(0);
    }

    public static ComputePressureQuantization deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static ComputePressureQuantization deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static ComputePressureQuantization decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            ComputePressureQuantization result = new ComputePressureQuantization(elementsOrVersion);
            result.cpuUtilizationThresholds = decoder0.readDoubles(8, 0, -1);
            result.cpuSpeedThresholds = decoder0.readDoubles(16, 0, -1);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.cpuUtilizationThresholds, 8, 0, -1);
        encoder0.encode(this.cpuSpeedThresholds, 16, 0, -1);
    }
}
