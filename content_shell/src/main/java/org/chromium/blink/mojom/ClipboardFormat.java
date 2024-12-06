package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class ClipboardFormat {
    public static final int BOOKMARK = 3;
    public static final int HTML = 1;
    private static final boolean IS_EXTENSIBLE = false;
    public static final int MAX_VALUE = 4;
    public static final int MIN_VALUE = 0;
    public static final int PLAINTEXT = 0;
    public static final int RTF = 4;
    public static final int SMART_PASTE = 2;

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

    private ClipboardFormat() {
    }
}
