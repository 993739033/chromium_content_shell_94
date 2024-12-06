package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class ContextMenuDataInputFieldType {
    private static final boolean IS_EXTENSIBLE = false;
    public static final int MAX_VALUE = 5;
    public static final int MIN_VALUE = 0;
    public static final int NONE = 0;
    public static final int NUMBER = 3;
    public static final int OTHER = 5;
    public static final int PASSWORD = 2;
    public static final int PLAIN_TEXT = 1;
    public static final int TELEPHONE = 4;

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

    private ContextMenuDataInputFieldType() {
    }
}
