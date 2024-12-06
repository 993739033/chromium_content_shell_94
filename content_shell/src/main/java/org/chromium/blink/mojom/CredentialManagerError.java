package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class CredentialManagerError {
    public static final int ABORT = 16;
    public static final int ANDROID_ALGORITHM_UNSUPPORTED = 12;
    public static final int ANDROID_EMPTY_ALLOW_CREDENTIALS = 13;
    public static final int ANDROID_NOT_SUPPORTED_ERROR = 14;
    public static final int ANDROID_USER_VERIFICATION_UNSUPPORTED = 15;
    public static final int BAD_RELYING_PARTY_ID = 19;
    public static final int CANNOT_READ_AND_WRITE_LARGE_BLOB = 20;
    public static final int CREDENTIAL_EXCLUDED = 6;
    public static final int CREDENTIAL_NOT_RECOGNIZED = 7;
    public static final int FAILED_TO_SAVE_CREDENTIAL_ID_FOR_PAYMENT_EXTENSION = 22;
    public static final int INVALID_ALLOW_CREDENTIALS_FOR_LARGE_BLOB = 21;
    public static final int INVALID_DOMAIN = 4;
    public static final int INVALID_ICON_URL = 5;
    public static final int INVALID_PROTOCOL = 18;
    private static final boolean IS_EXTENSIBLE = false;
    public static final int MAX_VALUE = 23;
    public static final int MIN_VALUE = 0;
    public static final int NOT_ALLOWED = 3;
    public static final int NOT_FOCUSED = 9;
    public static final int NOT_IMPLEMENTED = 8;
    public static final int OPAQUE_DOMAIN = 17;
    public static final int PASSWORD_STORE_UNAVAILABLE = 2;
    public static final int PENDING_REQUEST = 1;
    public static final int PROTECTION_POLICY_INCONSISTENT = 11;
    public static final int RESIDENT_CREDENTIALS_UNSUPPORTED = 10;
    public static final int SUCCESS = 0;
    public static final int UNKNOWN = 23;

    /* loaded from: classes2.dex */
    public @interface EnumType {
    }

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 23;
    }

    public static void validate(int value) {
        if (!isKnownValue(value)) {
            throw new DeserializationException("Invalid enum value.");
        }
    }

    public static int toKnownValue(int value) {
        return value;
    }

    private CredentialManagerError() {
    }
}
