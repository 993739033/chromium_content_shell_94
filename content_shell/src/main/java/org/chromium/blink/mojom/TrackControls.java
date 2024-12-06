package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class TrackControls extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 24;
    private static final DataHeader[] VERSION_ARRAY;
    public String deviceId;
    public boolean requested;
    public int streamType;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private TrackControls(int version) {
        super(24, version);
    }

    public TrackControls() {
        this(0);
    }

    public static TrackControls deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static TrackControls deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static TrackControls decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            TrackControls result = new TrackControls(elementsOrVersion);
            result.requested = decoder0.readBoolean(8, 0);
            int readInt = decoder0.readInt(12);
            result.streamType = readInt;
            MediaStreamType.validate(readInt);
            result.streamType = MediaStreamType.toKnownValue(result.streamType);
            result.deviceId = decoder0.readString(16, false);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.requested, 8, 0);
        encoder0.encode(this.streamType, 12);
        encoder0.encode(this.deviceId, 16, false);
    }
}
