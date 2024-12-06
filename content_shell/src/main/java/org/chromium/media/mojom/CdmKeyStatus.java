package org.chromium.media.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class CdmKeyStatus {
    public static final int EXPIRED = 2;
    public static final int INTERNAL_ERROR = 1;
    private static final boolean IS_EXTENSIBLE = false;
    public static final int KEY_STATUS_PENDING = 5;
    public static final int MAX_VALUE = 6;
    public static final int MIN_VALUE = 0;
    public static final int OUTPUT_DOWNSCALED = 4;
    public static final int OUTPUT_RESTRICTED = 3;
    public static final int RELEASED = 6;
    public static final int USABLE = 0;

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

    private CdmKeyStatus() {
    }
}
