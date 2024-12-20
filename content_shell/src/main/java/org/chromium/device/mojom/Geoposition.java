package org.chromium.device.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.DeserializationException;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo_base.mojom.Time;
/* loaded from: classes2.dex */
public final class Geoposition extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 88;
    private static final DataHeader[] VERSION_ARRAY;
    public double accuracy;
    public double altitude;
    public double altitudeAccuracy;
    public int errorCode;
    public String errorMessage;
    public double heading;
    public double latitude;
    public double longitude;
    public double speed;
    public Time timestamp;
    public boolean valid;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(88, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    /* loaded from: classes2.dex */
    public static final class ErrorCode {
        private static final boolean IS_EXTENSIBLE = false;
        public static final int LAST = 3;
        public static final int MAX_VALUE = 3;
        public static final int MIN_VALUE = 0;
        public static final int NONE = 0;
        public static final int PERMISSION_DENIED = 1;
        public static final int POSITION_UNAVAILABLE = 2;
        public static final int TIMEOUT = 3;

        /* loaded from: classes2.dex */
        public @interface EnumType {
        }

        public static boolean isKnownValue(int value) {
            return value >= 0 && value <= 3;
        }

        public static void validate(int value) {
            if (!isKnownValue(value)) {
                throw new DeserializationException("Invalid enum value.");
            }
        }

        public static int toKnownValue(int value) {
            return value;
        }

        private ErrorCode() {
        }
    }

    private Geoposition(int version) {
        super(88, version);
        this.latitude = 200.0d;
        this.longitude = 200.0d;
        this.altitude = -10000.0d;
        this.accuracy = -1.0d;
        this.altitudeAccuracy = -1.0d;
        this.heading = -1.0d;
        this.speed = -1.0d;
        this.errorCode = 0;
    }

    public Geoposition() {
        this(0);
    }

    public static Geoposition deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static Geoposition deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static Geoposition decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            Geoposition result = new Geoposition(elementsOrVersion);
            result.valid = decoder0.readBoolean(8, 0);
            int readInt = decoder0.readInt(12);
            result.errorCode = readInt;
            ErrorCode.validate(readInt);
            result.errorCode = ErrorCode.toKnownValue(result.errorCode);
            result.latitude = decoder0.readDouble(16);
            result.longitude = decoder0.readDouble(24);
            result.altitude = decoder0.readDouble(32);
            result.accuracy = decoder0.readDouble(40);
            result.altitudeAccuracy = decoder0.readDouble(48);
            result.heading = decoder0.readDouble(56);
            result.speed = decoder0.readDouble(64);
            Decoder decoder1 = decoder0.readPointer(72, false);
            result.timestamp = Time.decode(decoder1);
            result.errorMessage = decoder0.readString(80, false);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.valid, 8, 0);
        encoder0.encode(this.errorCode, 12);
        encoder0.encode(this.latitude, 16);
        encoder0.encode(this.longitude, 24);
        encoder0.encode(this.altitude, 32);
        encoder0.encode(this.accuracy, 40);
        encoder0.encode(this.altitudeAccuracy, 48);
        encoder0.encode(this.heading, 56);
        encoder0.encode(this.speed, 64);
        encoder0.encode((Struct) this.timestamp, 72, false);
        encoder0.encode(this.errorMessage, 80, false);
    }
}
