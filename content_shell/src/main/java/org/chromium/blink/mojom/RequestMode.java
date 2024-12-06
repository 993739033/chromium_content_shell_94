package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class RequestMode {
    private static final boolean IS_EXTENSIBLE = false;
    public static final int MAX_VALUE = 1;
    public static final int MEDIATED = 0;
    public static final int MIN_VALUE = 0;
    public static final int PERMISSION = 1;

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

    private RequestMode() {
    }
}
