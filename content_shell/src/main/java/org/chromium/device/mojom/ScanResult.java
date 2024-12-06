package org.chromium.device.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class ScanResult {
    public static final int IMMOBILE = 6;
    public static final int INSUFFICIENT = 2;
    private static final boolean IS_EXTENSIBLE = false;
    public static final int MAX_VALUE = 6;
    public static final int MIN_VALUE = 0;
    public static final int PARTIAL = 1;
    public static final int SENSOR_DIRTY = 3;
    public static final int SUCCESS = 0;
    public static final int TOO_FAST = 5;
    public static final int TOO_SLOW = 4;

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

    private ScanResult() {
    }
}
