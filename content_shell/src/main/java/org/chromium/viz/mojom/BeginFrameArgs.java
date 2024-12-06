package org.chromium.viz.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo_base.mojom.TimeDelta;
import org.chromium.mojo_base.mojom.TimeTicks;
/* loaded from: classes2.dex */
public final class BeginFrameArgs extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 72;
    private static final DataHeader[] VERSION_ARRAY;
    public boolean animateOnly;
    public TimeTicks deadline;
    public TimeTicks frameTime;
    public long framesThrottledSinceLast;
    public TimeDelta interval;
    public boolean onCriticalPath;
    public long sequenceNumber;
    public long sourceId;
    public long traceId;
    public int type;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(72, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private BeginFrameArgs(int version) {
        super(72, version);
    }

    public BeginFrameArgs() {
        this(0);
    }

    public static BeginFrameArgs deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static BeginFrameArgs deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static BeginFrameArgs decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            BeginFrameArgs result = new BeginFrameArgs(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, false);
            result.frameTime = TimeTicks.decode(decoder1);
            Decoder decoder12 = decoder0.readPointer(16, false);
            result.deadline = TimeTicks.decode(decoder12);
            Decoder decoder13 = decoder0.readPointer(24, false);
            result.interval = TimeDelta.decode(decoder13);
            result.sourceId = decoder0.readLong(32);
            result.sequenceNumber = decoder0.readLong(40);
            result.framesThrottledSinceLast = decoder0.readLong(48);
            result.traceId = decoder0.readLong(56);
            int readInt = decoder0.readInt(64);
            result.type = readInt;
            BeginFrameArgsType.validate(readInt);
            result.type = BeginFrameArgsType.toKnownValue(result.type);
            result.onCriticalPath = decoder0.readBoolean(68, 0);
            result.animateOnly = decoder0.readBoolean(68, 1);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode((Struct) this.frameTime, 8, false);
        encoder0.encode((Struct) this.deadline, 16, false);
        encoder0.encode((Struct) this.interval, 24, false);
        encoder0.encode(this.sourceId, 32);
        encoder0.encode(this.sequenceNumber, 40);
        encoder0.encode(this.framesThrottledSinceLast, 48);
        encoder0.encode(this.traceId, 56);
        encoder0.encode(this.type, 64);
        encoder0.encode(this.onCriticalPath, 68, 0);
        encoder0.encode(this.animateOnly, 68, 1);
    }
}
