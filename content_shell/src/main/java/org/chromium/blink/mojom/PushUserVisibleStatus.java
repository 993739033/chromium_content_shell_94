package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class PushUserVisibleStatus {
    private static final boolean IS_EXTENSIBLE = false;
    public static final int MAX_VALUE = 4;
    public static final int MIN_VALUE = 0;
    public static final int NOT_REQUIRED_AND_NOT_SHOWN = 2;
    public static final int NOT_REQUIRED_BUT_SHOWN = 1;
    public static final int REQUIRED_AND_SHOWN = 0;
    public static final int REQUIRED_BUT_NOT_SHOWN_GRACE_EXCEEDED = 4;
    public static final int REQUIRED_BUT_NOT_SHOWN_USED_GRACE = 3;

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

    private PushUserVisibleStatus() {
    }
}
