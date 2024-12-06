package org.chromium.media.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class Bitrate extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 24;
    private static final DataHeader[] VERSION_ARRAY;
    public int mode;
    public int peak;
    public int target;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    /* loaded from: classes2.dex */
    public static final class Mode {
        public static final int CONSTANT = 0;
        public static final int DEFAULT_VALUE = 0;
        private static final boolean IS_EXTENSIBLE = true;
        public static final int MAX_VALUE = 1;
        public static final int MIN_VALUE = 0;
        public static final int VARIABLE = 1;

        /* loaded from: classes2.dex */
        public @interface EnumType {
        }

        public static boolean isKnownValue(int value) {
            return value >= 0 && value <= 1;
        }

        public static void validate(int value) {
        }

        public static int toKnownValue(int value) {
            if (isKnownValue(value)) {
                return value;
            }
            return 0;
        }

        private Mode() {
        }
    }

    private Bitrate(int version) {
        super(24, version);
        this.mode = 0;
        this.peak = 0;
    }

    public Bitrate() {
        this(0);
    }

    public static Bitrate deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static Bitrate deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static Bitrate decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            Bitrate result = new Bitrate(elementsOrVersion);
            int readInt = decoder0.readInt(8);
            result.mode = readInt;
            Mode.validate(readInt);
            result.mode = Mode.toKnownValue(result.mode);
            result.target = decoder0.readInt(12);
            result.peak = decoder0.readInt(16);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.mode, 8);
        encoder0.encode(this.target, 12);
        encoder0.encode(this.peak, 16);
    }
}
