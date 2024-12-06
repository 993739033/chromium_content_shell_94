package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class NavigationType {
    public static final int DIFFERENT_DOCUMENT = 8;
    public static final int HISTORY_DIFFERENT_DOCUMENT = 6;
    public static final int HISTORY_SAME_DOCUMENT = 5;
    private static final boolean IS_EXTENSIBLE = false;
    public static final int MAX_VALUE = 8;
    public static final int MIN_VALUE = 0;
    public static final int RELOAD = 0;
    public static final int RELOAD_BYPASSING_CACHE = 1;
    public static final int RELOAD_ORIGINAL_REQUEST_URL = 2;
    public static final int RESTORE = 3;
    public static final int RESTORE_WITH_POST = 4;
    public static final int SAME_DOCUMENT = 7;

    /* loaded from: classes2.dex */
    public @interface EnumType {
    }

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 8;
    }

    public static void validate(int value) {
        if (!isKnownValue(value)) {
            throw new DeserializationException("Invalid enum value.");
        }
    }

    public static int toKnownValue(int value) {
        return value;
    }

    private NavigationType() {
    }
}
