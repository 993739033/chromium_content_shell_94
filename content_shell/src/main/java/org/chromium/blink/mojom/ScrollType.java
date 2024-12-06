package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class ScrollType {
    public static final int ANCHORING = 4;
    public static final int CLAMPING = 2;
    public static final int COMPOSITOR = 3;
    private static final boolean IS_EXTENSIBLE = false;
    public static final int MAX_VALUE = 5;
    public static final int MIN_VALUE = 0;
    public static final int PROGRAMMATIC = 1;
    public static final int SEQUENCED = 5;
    public static final int USER = 0;

    /* loaded from: classes2.dex */
    public @interface EnumType {
    }

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 5;
    }

    public static void validate(int value) {
        if (!isKnownValue(value)) {
            throw new DeserializationException("Invalid enum value.");
        }
    }

    public static int toKnownValue(int value) {
        return value;
    }

    private ScrollType() {
    }
}
