package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class DisplayMode {
    public static final int BROWSER = 1;
    public static final int FULLSCREEN = 4;
    private static final boolean IS_EXTENSIBLE = false;
    public static final int MAX_VALUE = 6;
    public static final int MINIMAL_UI = 2;
    public static final int MIN_VALUE = 0;
    public static final int STANDALONE = 3;
    public static final int TABBED = 6;
    public static final int UNDEFINED = 0;
    public static final int WINDOW_CONTROLS_OVERLAY = 5;

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

    private DisplayMode() {
    }
}
