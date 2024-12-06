package org.chromium.mojo.bindings.pipecontrol;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo.system.Handle;
import org.chromium.mojo.system.InvalidHandle;
import org.chromium.mojo.system.MessagePipeHandle;
/* loaded from: classes2.dex */
public final class FlushAsync extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 16;
    private static final DataHeader[] VERSION_ARRAY;
    public MessagePipeHandle flusherPipe;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private FlushAsync(int version) {
        super(16, version);
        this.flusherPipe = InvalidHandle.INSTANCE;
    }

    public FlushAsync() {
        this(0);
    }

    public static FlushAsync deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static FlushAsync deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static FlushAsync decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            FlushAsync result = new FlushAsync(elementsOrVersion);
            result.flusherPipe = decoder0.readMessagePipeHandle(8, false);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode((Handle) this.flusherPipe, 8, false);
    }
}
