package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class StreamControls extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 32;
    private static final DataHeader[] VERSION_ARRAY;
    public TrackControls audio;
    public boolean disableLocalEcho;
    public boolean hotwordEnabled;
    public boolean requestPanTiltZoomPermission;
    public TrackControls video;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private StreamControls(int version) {
        super(32, version);
    }

    public StreamControls() {
        this(0);
    }

    public static StreamControls deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static StreamControls deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static StreamControls decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            StreamControls result = new StreamControls(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, false);
            result.audio = TrackControls.decode(decoder1);
            Decoder decoder12 = decoder0.readPointer(16, false);
            result.video = TrackControls.decode(decoder12);
            result.hotwordEnabled = decoder0.readBoolean(24, 0);
            result.disableLocalEcho = decoder0.readBoolean(24, 1);
            result.requestPanTiltZoomPermission = decoder0.readBoolean(24, 2);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode((Struct) this.audio, 8, false);
        encoder0.encode((Struct) this.video, 16, false);
        encoder0.encode(this.hotwordEnabled, 24, 0);
        encoder0.encode(this.disableLocalEcho, 24, 1);
        encoder0.encode(this.requestPanTiltZoomPermission, 24, 2);
    }
}
