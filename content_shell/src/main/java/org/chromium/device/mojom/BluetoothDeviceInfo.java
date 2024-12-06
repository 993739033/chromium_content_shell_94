package org.chromium.device.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.DeserializationException;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class BluetoothDeviceInfo extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 48;
    private static final DataHeader[] VERSION_ARRAY;
    public BluetoothAddress address;
    public BluetoothDeviceBatteryInfo batteryInfo;
    public int connectionState;
    public int deviceType;
    public boolean isBlockedByPolicy;
    public boolean isPaired;
    public String name;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(48, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    /* loaded from: classes2.dex */
    public static final class ConnectionState {
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        private static final boolean IS_EXTENSIBLE = false;
        public static final int MAX_VALUE = 2;
        public static final int MIN_VALUE = 0;
        public static final int NOT_CONNECTED = 0;

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

        private ConnectionState() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class DeviceType {
        public static final int AUDIO = 4;
        public static final int CAR_AUDIO = 5;
        public static final int COMPUTER = 1;
        public static final int GAMEPAD = 9;
        private static final boolean IS_EXTENSIBLE = false;
        public static final int JOYSTICK = 8;
        public static final int KEYBOARD = 10;
        public static final int KEYBOARD_MOUSE_COMBO = 13;
        public static final int MAX_VALUE = 13;
        public static final int MIN_VALUE = 0;
        public static final int MODEM = 3;
        public static final int MOUSE = 11;
        public static final int PERIPHERAL = 7;
        public static final int PHONE = 2;
        public static final int TABLET = 12;
        public static final int UNKNOWN = 0;
        public static final int VIDEO = 6;

        /* loaded from: classes2.dex */
        public @interface EnumType {
        }

        public static boolean isKnownValue(int value) {
            return value >= 0 && value <= 13;
        }

        public static void validate(int value) {
            if (!isKnownValue(value)) {
                throw new DeserializationException("Invalid enum value.");
            }
        }

        public static int toKnownValue(int value) {
            return value;
        }

        private DeviceType() {
        }
    }

    private BluetoothDeviceInfo(int version) {
        super(48, version);
        this.isBlockedByPolicy = false;
    }

    public BluetoothDeviceInfo() {
        this(0);
    }

    public static BluetoothDeviceInfo deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static BluetoothDeviceInfo deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static BluetoothDeviceInfo decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            BluetoothDeviceInfo result = new BluetoothDeviceInfo(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, false);
            result.address = BluetoothAddress.decode(decoder1);
            result.name = decoder0.readString(16, true);
            int readInt = decoder0.readInt(24);
            result.connectionState = readInt;
            ConnectionState.validate(readInt);
            result.connectionState = ConnectionState.toKnownValue(result.connectionState);
            result.isPaired = decoder0.readBoolean(28, 0);
            result.isBlockedByPolicy = decoder0.readBoolean(28, 1);
            int readInt2 = decoder0.readInt(32);
            result.deviceType = readInt2;
            DeviceType.validate(readInt2);
            result.deviceType = DeviceType.toKnownValue(result.deviceType);
            Decoder decoder12 = decoder0.readPointer(40, true);
            result.batteryInfo = BluetoothDeviceBatteryInfo.decode(decoder12);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode((Struct) this.address, 8, false);
        encoder0.encode(this.name, 16, true);
        encoder0.encode(this.connectionState, 24);
        encoder0.encode(this.isPaired, 28, 0);
        encoder0.encode(this.isBlockedByPolicy, 28, 1);
        encoder0.encode(this.deviceType, 32);
        encoder0.encode((Struct) this.batteryInfo, 40, true);
    }
}
