package org.chromium.network.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class ReferrerPolicy {
    public static final int ALWAYS = 0;
    public static final int DEFAULT = 1;
    private static final boolean IS_EXTENSIBLE = false;
    public static final int MAX_VALUE = 8;
    public static final int MIN_VALUE = 0;
    public static final int NEVER = 3;
    public static final int NO_REFERRER_WHEN_DOWNGRADE = 2;
    public static final int ORIGIN = 4;
    public static final int ORIGIN_WHEN_CROSS_ORIGIN = 5;
    public static final int SAME_ORIGIN = 7;
    public static final int STRICT_ORIGIN = 8;
    public static final int STRICT_ORIGIN_WHEN_CROSS_ORIGIN = 6;

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

    private ReferrerPolicy() {
    }
}
