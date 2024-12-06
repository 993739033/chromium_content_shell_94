package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class AuthenticatorStatus {
    public static final int ABORT_ERROR = 15;
    public static final int ALGORITHM_UNSUPPORTED = 11;
    public static final int ANDROID_NOT_SUPPORTED_ERROR = 13;
    public static final int BAD_RELYING_PARTY_ID = 18;
    public static final int CANNOT_READ_AND_WRITE_LARGE_BLOB = 19;
    public static final int CREDENTIAL_EXCLUDED = 5;
    public static final int CREDENTIAL_NOT_RECOGNIZED = 6;
    public static final int EMPTY_ALLOW_CREDENTIALS = 12;
    public static final int FAILED_TO_SAVE_CREDENTIAL_ID_FOR_PAYMENT_EXTENSION = 21;
    public static final int INVALID_ALLOW_CREDENTIALS_FOR_LARGE_BLOB = 20;
    public static final int INVALID_DOMAIN = 3;
    public static final int INVALID_ICON_URL = 4;
    public static final int INVALID_PROTOCOL = 17;
    private static final boolean IS_EXTENSIBLE = false;
    public static final int MAX_VALUE = 22;
    public static final int MIN_VALUE = 0;
    public static final int NOT_ALLOWED_ERROR = 2;
    public static final int NOT_FOCUSED = 8;
    public static final int NOT_IMPLEMENTED = 7;
    public static final int OPAQUE_DOMAIN = 16;
    public static final int PENDING_REQUEST = 1;
    public static final int PROTECTION_POLICY_INCONSISTENT = 14;
    public static final int RESIDENT_CREDENTIALS_UNSUPPORTED = 9;
    public static final int SUCCESS = 0;
    public static final int UNKNOWN_ERROR = 22;
    public static final int USER_VERIFICATION_UNSUPPORTED = 10;

    /* loaded from: classes2.dex */
    public @interface EnumType {
    }

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 22;
    }

    public static void validate(int value) {
        if (!isKnownValue(value)) {
            throw new DeserializationException("Invalid enum value.");
        }
    }

    public static int toKnownValue(int value) {
        return value;
    }

    private AuthenticatorStatus() {
    }
}
