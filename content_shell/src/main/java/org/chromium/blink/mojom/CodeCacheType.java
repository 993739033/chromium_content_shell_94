package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class CodeCacheType {
    private static final boolean IS_EXTENSIBLE = false;
    public static final int JAVASCRIPT = 0;
    public static final int MAX_VALUE = 1;
    public static final int MIN_VALUE = 0;
    public static final int WEB_ASSEMBLY = 1;

    /* loaded from: classes2.dex */
    public @interface EnumType {
    }

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 1;
    }

    public static void validate(int value) {
        if (!isKnownValue(value)) {
            throw new DeserializationException("Invalid enum value.");
        }
    }

    public static int toKnownValue(int value) {
        return value;
    }

    private CodeCacheType() {
    }
}
