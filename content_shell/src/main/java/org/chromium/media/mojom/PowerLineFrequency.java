package org.chromium.media.mojom;
/* loaded from: classes2.dex */
public final class PowerLineFrequency {
    public static final int DEFAULT = 0;
    public static final int HZ_50 = 1;
    public static final int HZ_60 = 2;
    private static final boolean IS_EXTENSIBLE = true;
    public static final int MAX_VALUE = 2;
    public static final int MIN_VALUE = 0;

    /* loaded from: classes2.dex */
    public @interface EnumType {
    }

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 2;
    }

    public static void validate(int value) {
    }

    public static int toKnownValue(int value) {
        return value;
    }

    private PowerLineFrequency() {
    }
}
