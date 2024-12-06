package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class IdleState extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 16;
    private static final DataHeader[] VERSION_ARRAY;
    public int screen;
    public int user;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private IdleState(int version) {
        super(16, version);
    }

    public IdleState() {
        this(0);
    }

    public static IdleState deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static IdleState deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static IdleState decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            IdleState result = new IdleState(elementsOrVersion);
            int readInt = decoder0.readInt(8);
            result.user = readInt;
            UserIdleState.validate(readInt);
            result.user = UserIdleState.toKnownValue(result.user);
            int readInt2 = decoder0.readInt(12);
            result.screen = readInt2;
            ScreenIdleState.validate(readInt2);
            result.screen = ScreenIdleState.toKnownValue(result.screen);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.user, 8);
        encoder0.encode(this.screen, 12);
    }
}
