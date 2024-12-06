package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class LogoutStatus {
    public static final int ERROR = 2;
    public static final int ERROR_TOO_MANY_REQUESTS = 1;
    private static final boolean IS_EXTENSIBLE = false;
    public static final int MAX_VALUE = 2;
    public static final int MIN_VALUE = 0;
    public static final int SUCCESS = 0;

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

    private LogoutStatus() {
    }
}
