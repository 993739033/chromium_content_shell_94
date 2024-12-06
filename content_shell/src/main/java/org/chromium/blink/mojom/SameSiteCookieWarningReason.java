package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class SameSiteCookieWarningReason {
    private static final boolean IS_EXTENSIBLE = false;
    public static final int MAX_VALUE = 7;
    public static final int MIN_VALUE = 0;
    public static final int WARN_SAME_SITE_LAX_CROSS_DOWNGRADE_LAX = 7;
    public static final int WARN_SAME_SITE_LAX_CROSS_DOWNGRADE_STRICT = 6;
    public static final int WARN_SAME_SITE_NONE_INSECURE = 1;
    public static final int WARN_SAME_SITE_STRICT_CROSS_DOWNGRADE_LAX = 5;
    public static final int WARN_SAME_SITE_STRICT_CROSS_DOWNGRADE_STRICT = 4;
    public static final int WARN_SAME_SITE_STRICT_LAX_DOWNGRADE_STRICT = 3;
    public static final int WARN_SAME_SITE_UNSPECIFIED_CROSS_SITE_CONTEXT = 0;
    public static final int WARN_SAME_SITE_UNSPECIFIED_LAX_ALLOW_UNSAFE = 2;

    /* loaded from: classes2.dex */
    public @interface EnumType {
    }

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 7;
    }

    public static void validate(int value) {
        if (!isKnownValue(value)) {
            throw new DeserializationException("Invalid enum value.");
        }
    }

    public static int toKnownValue(int value) {
        return value;
    }

    private SameSiteCookieWarningReason() {
    }
}
