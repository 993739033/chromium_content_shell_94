package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class InputEventResultState {
    public static final int CONSUMED = 1;
    public static final int IGNORED = 4;
    private static final boolean IS_EXTENSIBLE = false;
    public static final int MAX_VALUE = 6;
    public static final int MIN_VALUE = 0;
    public static final int NOT_CONSUMED = 2;
    public static final int NO_CONSUMER_EXISTS = 3;
    public static final int SET_NON_BLOCKING = 5;
    public static final int SET_NON_BLOCKING_DUE_TO_FLING = 6;
    public static final int UNKNOWN = 0;

    /* loaded from: classes2.dex */
    public @interface EnumType {
    }

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 6;
    }

    public static void validate(int value) {
        if (!isKnownValue(value)) {
            throw new DeserializationException("Invalid enum value.");
        }
    }

    public static int toKnownValue(int value) {
        return value;
    }

    private InputEventResultState() {
    }
}
