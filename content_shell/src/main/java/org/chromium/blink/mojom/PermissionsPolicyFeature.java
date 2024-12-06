package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class PermissionsPolicyFeature {
    public static final int ACCELEROMETER = 17;
    public static final int AMBIENT_LIGHT_SENSOR = 18;
    public static final int ATTRIBUTION_REPORTING = 73;
    public static final int AUTOPLAY = 1;
    public static final int CAMERA = 2;
    public static final int CLIENT_HINT_DEVICE_MEMORY = 54;
    public static final int CLIENT_HINT_DOWNLINK = 55;
    public static final int CLIENT_HINT_DPR = 53;
    public static final int CLIENT_HINT_ECT = 56;
    public static final int CLIENT_HINT_LANG = 57;
    public static final int CLIENT_HINT_PREFERS_COLOR_SCHEME = 85;
    public static final int CLIENT_HINT_RTT = 58;
    public static final int CLIENT_HINT_UA = 59;
    public static final int CLIENT_HINT_UA_ARCH = 60;
    public static final int CLIENT_HINT_UA_BITNESS = 87;
    public static final int CLIENT_HINT_UA_FULL_VERSION = 71;
    public static final int CLIENT_HINT_UA_MOBILE = 69;
    public static final int CLIENT_HINT_UA_MODEL = 61;
    public static final int CLIENT_HINT_UA_PLATFORM = 62;
    public static final int CLIENT_HINT_UA_PLATFORM_VERSION = 74;
    public static final int CLIENT_HINT_UA_REDUCED = 88;
    public static final int CLIENT_HINT_VIEWPORT_WIDTH = 63;
    public static final int CLIENT_HINT_WIDTH = 64;
    public static final int CLIPBOARD_READ = 76;
    public static final int CLIPBOARD_WRITE = 77;
    public static final int CROSS_ORIGIN_ISOLATED = 75;
    public static final int DIRECT_SOCKETS = 84;
    public static final int DISPLAY_CAPTURE = 81;
    public static final int DOCUMENT_DOMAIN = 11;
    public static final int ENCRYPTED_MEDIA = 3;
    public static final int EXECUTION_WHILE_NOT_RENDERED = 51;
    public static final int EXECUTION_WHILE_OUT_OF_VIEWPORT = 50;
    public static final int FOCUS_WITHOUT_USER_ACTIVATION = 52;
    public static final int FROBULATE = 41;
    public static final int FULLSCREEN = 4;
    public static final int GAMEPAD = 79;
    public static final int GEOLOCATION = 5;
    public static final int GYROSCOPE = 19;
    public static final int HID = 43;
    public static final int IDLE_DETECTION = 44;
    public static final int INTEREST_COHORT = 82;
    private static final boolean IS_EXTENSIBLE = false;
    public static final int MAGNETOMETER = 20;
    public static final int MAX_VALUE = 88;
    public static final int MICROPHONE = 6;
    public static final int MIDI_FEATURE = 7;
    public static final int MIN_VALUE = 0;
    public static final int NOT_FOUND = 0;
    public static final int OTP_CREDENTIALS = 80;
    public static final int PAYMENT = 8;
    public static final int PICTURE_IN_PICTURE = 26;
    public static final int PUBLIC_KEY_CREDENTIALS_GET = 67;
    public static final int SCREEN_WAKE_LOCK = 31;
    public static final int SERIAL = 42;
    public static final int SHARED_AUTOFILL = 83;
    public static final int STORAGE_ACCESS_API = 70;
    public static final int SYNC_XHR = 13;
    public static final int TRUST_TOKEN_REDEMPTION = 72;
    public static final int USB = 14;
    public static final int VERTICAL_SCROLL = 27;
    public static final int WEB_SHARE = 78;
    public static final int WEB_XR = 66;
    public static final int WINDOW_PLACEMENT = 86;

    /* loaded from: classes2.dex */
    public @interface EnumType {
    }

    public static boolean isKnownValue(int value) {
        switch (value) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 26:
            case 27:
            case 31:
            case 41:
            case 42:
            case 43:
            case 44:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 66:
            case 67:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
                return true;
            case 9:
            case 10:
            case 12:
            case 15:
            case 16:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 28:
            case 29:
            case 30:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 65:
            case 68:
            default:
                return false;
        }
    }

    public static void validate(int value) {
        if (!isKnownValue(value)) {
            throw new DeserializationException("Invalid enum value.");
        }
    }

    public static int toKnownValue(int value) {
        return value;
    }

    private PermissionsPolicyFeature() {
    }
}
