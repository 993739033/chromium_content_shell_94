package org.chromium.viz.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class BeginFrameArgsType {
    public static final int INVALID = 0;
    private static final boolean IS_EXTENSIBLE = false;
    public static final int MAX_VALUE = 2;
    public static final int MIN_VALUE = 0;
    public static final int MISSED = 2;
    public static final int NORMAL = 1;

    /* loaded from: classes2.dex */
    public @interface EnumType {
    }

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 2;
    }

    public static void validate(int value) {
        if (!isKnownValue(value)) {
            throw new DeserializationException("Invalid enum value.");
        }
    }

    public static int toKnownValue(int value) {
        return value;
    }

    private BeginFrameArgsType() {
    }
}
