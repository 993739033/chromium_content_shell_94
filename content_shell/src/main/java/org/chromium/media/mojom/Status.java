package org.chromium.media.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo.bindings.Union;
import org.chromium.mojo_base.mojom.Value;
/* loaded from: classes2.dex */
public final class Status extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 56;
    private static final DataHeader[] VERSION_ARRAY;
    public Status[] causes;
    public int code;
    public Value data;
    public Value[] frames;
    public String message;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(56, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private Status(int version) {
        super(56, version);
    }

    public Status() {
        this(0);
    }

    public static Status deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static Status deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static Status decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            Status result = new Status(elementsOrVersion);
            int readInt = decoder0.readInt(8);
            result.code = readInt;
            StatusCode.validate(readInt);
            result.code = StatusCode.toKnownValue(result.code);
            result.message = decoder0.readString(16, true);
            Decoder decoder1 = decoder0.readPointer(24, false);
            DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
            result.frames = new Value[si1.elementsOrVersion];
            for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                result.frames[i1] = Value.decode(decoder1, (i1 * 16) + 8);
            }
            Decoder decoder12 = decoder0.readPointer(32, false);
            DataHeader si12 = decoder12.readDataHeaderForPointerArray(-1);
            result.causes = new Status[si12.elementsOrVersion];
            for (int i12 = 0; i12 < si12.elementsOrVersion; i12++) {
                Decoder decoder2 = decoder12.readPointer((i12 * 8) + 8, false);
                result.causes[i12] = decode(decoder2);
            }
            result.data = Value.decode(decoder0, 40);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.code, 8);
        encoder0.encode(this.message, 16, true);
        Value[] valueArr = this.frames;
        if (valueArr == null) {
            encoder0.encodeNullPointer(24, false);
        } else {
            Encoder encoder1 = encoder0.encodeUnionArray(valueArr.length, 24, -1);
            int i0 = 0;
            while (true) {
                Value[] valueArr2 = this.frames;
                if (i0 >= valueArr2.length) {
                    break;
                }
                encoder1.encode((Union) valueArr2[i0], (i0 * 16) + 8, false);
                i0++;
            }
        }
        Status[] statusArr = this.causes;
        if (statusArr == null) {
            encoder0.encodeNullPointer(32, false);
        } else {
            Encoder encoder12 = encoder0.encodePointerArray(statusArr.length, 32, -1);
            int i02 = 0;
            while (true) {
                Status[] statusArr2 = this.causes;
                if (i02 >= statusArr2.length) {
                    break;
                }
                encoder12.encode((Struct) statusArr2[i02], (i02 * 8) + 8, false);
                i02++;
            }
        }
        encoder0.encode((Union) this.data, 40, true);
    }
}
