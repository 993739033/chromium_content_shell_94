package org.chromium.media.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class DisplayCaptureSurfaceType {
    public static final int APPLICATION = 2;
    public static final int BROWSER = 3;
    private static final boolean IS_EXTENSIBLE = false;
    public static final int MAX_VALUE = 3;
    public static final int MIN_VALUE = 0;
    public static final int MONITOR = 0;
    public static final int WINDOW = 1;

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

    private DisplayCaptureSurfaceType() {
    }
}
