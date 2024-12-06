package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class FocusType {
    public static final int ACCESS_KEY = 5;
    public static final int BACKWARD = 2;
    public static final int FORWARD = 1;
    private static final boolean IS_EXTENSIBLE = false;
    public static final int MAX_VALUE = 6;
    public static final int MIN_VALUE = 0;
    public static final int MOUSE = 4;
    public static final int NONE = 0;
    public static final int PAGE = 6;
    public static final int SPATIAL_NAVIGATION = 3;

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

    private FocusType() {
    }
}
