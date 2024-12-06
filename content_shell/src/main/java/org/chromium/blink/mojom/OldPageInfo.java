package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class OldPageInfo extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 24;
    private static final DataHeader[] VERSION_ARRAY;
    public PageLifecycleState newLifecycleStateForOldPage;
    public int routingIdForOldMainFrame;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private OldPageInfo(int version) {
        super(24, version);
        this.routingIdForOldMainFrame = -1;
    }

    public OldPageInfo() {
        this(0);
    }

    public static OldPageInfo deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static OldPageInfo deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static OldPageInfo decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            OldPageInfo result = new OldPageInfo(elementsOrVersion);
            result.routingIdForOldMainFrame = decoder0.readInt(8);
            Decoder decoder1 = decoder0.readPointer(16, false);
            result.newLifecycleStateForOldPage = PageLifecycleState.decode(decoder1);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.routingIdForOldMainFrame, 8);
        encoder0.encode((Struct) this.newLifecycleStateForOldPage, 16, false);
    }
}
