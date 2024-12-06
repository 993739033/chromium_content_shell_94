package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class FaviconIconType {
    public static final int FAVICON = 1;
    public static final int INVALID = 0;
    private static final boolean IS_EXTENSIBLE = false;
    public static final int MAX_VALUE = 3;
    public static final int MIN_VALUE = 0;
    public static final int TOUCH_ICON = 2;
    public static final int TOUCH_PRECOMPOSED_ICON = 3;

    /* loaded from: classes2.dex */
    public @interface EnumType {
    }

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 3;
    }

    public static void validate(int value) {
        if (!isKnownValue(value)) {
            throw new DeserializationException("Invalid enum value.");
        }
    }

    public static int toKnownValue(int value) {
        return value;
    }

    private FaviconIconType() {
    }
}
