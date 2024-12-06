package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.DeserializationException;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class ManifestLaunchHandler extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 16;
    private static final DataHeader[] VERSION_ARRAY;
    public int navigateExistingClient;
    public int routeTo;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    /* loaded from: classes2.dex */
    public static final class RouteTo {
        public static final int AUTO = 0;
        public static final int EXISTING_CLIENT = 2;
        private static final boolean IS_EXTENSIBLE = false;
        public static final int MAX_VALUE = 2;
        public static final int MIN_VALUE = 0;
        public static final int NEW_CLIENT = 1;

        /* loaded from: classes2.dex */
        public @interface EnumType {
        }

        public static boolean isKnownValue(int value) {
            return value >= 0 && value <= 2;
        }

        public static void validate(int value) {
            if (!isKnownValue(value)) {
                throw new DeserializationException("Invalid enum value.");
            }
        }

        public static int toKnownValue(int value) {
            return value;
        }

        private RouteTo() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class NavigateExistingClient {
        public static final int ALWAYS = 0;
        private static final boolean IS_EXTENSIBLE = false;
        public static final int MAX_VALUE = 1;
        public static final int MIN_VALUE = 0;
        public static final int NEVER = 1;

        /* loaded from: classes2.dex */
        public @interface EnumType {
        }

        public static boolean isKnownValue(int value) {
            return value >= 0 && value <= 1;
        }

        public static void validate(int value) {
            if (!isKnownValue(value)) {
                throw new DeserializationException("Invalid enum value.");
            }
        }

        public static int toKnownValue(int value) {
            return value;
        }

        private NavigateExistingClient() {
        }
    }

    private ManifestLaunchHandler(int version) {
        super(16, version);
    }

    public ManifestLaunchHandler() {
        this(0);
    }

    public static ManifestLaunchHandler deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static ManifestLaunchHandler deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static ManifestLaunchHandler decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            ManifestLaunchHandler result = new ManifestLaunchHandler(elementsOrVersion);
            int readInt = decoder0.readInt(8);
            result.routeTo = readInt;
            RouteTo.validate(readInt);
            result.routeTo = RouteTo.toKnownValue(result.routeTo);
            int readInt2 = decoder0.readInt(12);
            result.navigateExistingClient = readInt2;
            NavigateExistingClient.validate(readInt2);
            result.navigateExistingClient = NavigateExistingClient.toKnownValue(result.navigateExistingClient);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.routeTo, 8);
        encoder0.encode(this.navigateExistingClient, 12);
    }
}
