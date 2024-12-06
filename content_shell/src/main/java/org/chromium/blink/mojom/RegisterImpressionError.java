package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class RegisterImpressionError {
    public static final int INSECURE_ATTRIBUTION_DESTINATION = 2;
    public static final int INSECURE_ATTRIBUTION_REPORT_TO = 3;
    public static final int INSECURE_CONTEXT = 1;
    public static final int INVALID_ATTRIBUTION_SOURCE_EVENT_ID = 4;
    private static final boolean IS_EXTENSIBLE = false;
    public static final int MAX_VALUE = 4;
    public static final int MIN_VALUE = 0;
    public static final int NOT_ALLOWED = 0;

    /* loaded from: classes2.dex */
    public @interface EnumType {
    }

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 4;
    }

    public static void validate(int value) {
        if (!isKnownValue(value)) {
            throw new DeserializationException("Invalid enum value.");
        }
    }

    public static int toKnownValue(int value) {
        return value;
    }

    private RegisterImpressionError() {
    }
}
