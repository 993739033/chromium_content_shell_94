package org.chromium.sandbox.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class Sandbox {
    public static final int CDM = 2;
    private static final boolean IS_EXTENSIBLE = false;
    public static final int MAX_VALUE = 4;
    public static final int MIN_VALUE = 0;
    public static final int PRINT_COMPOSITOR = 3;
    public static final int SERVICE = 0;
    public static final int UTILITY = 1;
    public static final int VIDEO_CAPTURE = 4;

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

    private Sandbox() {
    }
}
