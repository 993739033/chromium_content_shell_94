package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class RequestIdTokenStatus {
    public static final int APPROVAL_DECLINED = 1;
    public static final int ERROR = 10;
    public static final int ERROR_FETCHING_SIGNIN = 6;
    public static final int ERROR_FETCHING_WELL_KNOWN = 4;
    public static final int ERROR_INVALID_ACCOUNTS_RESPONSE = 8;
    public static final int ERROR_INVALID_SIGNIN_RESPONSE = 7;
    public static final int ERROR_INVALID_TOKEN_RESPONSE = 9;
    public static final int ERROR_INVALID_WELL_KNOWN = 5;
    public static final int ERROR_TOO_MANY_REQUESTS = 2;
    public static final int ERROR_WEB_ID_NOT_SUPPORTED_BY_PROVIDER = 3;
    private static final boolean IS_EXTENSIBLE = false;
    public static final int MAX_VALUE = 10;
    public static final int MIN_VALUE = 0;
    public static final int SUCCESS = 0;

    /* loaded from: classes2.dex */
    public @interface EnumType {
    }

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 10;
    }

    public static void validate(int value) {
        if (!isKnownValue(value)) {
            throw new DeserializationException("Invalid enum value.");
        }
    }

    public static int toKnownValue(int value) {
        return value;
    }

    private RequestIdTokenStatus() {
    }
}
