package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class AppCacheErrorReason {
    public static final int APPCACHE_ABORT_ERROR = 4;
    public static final int APPCACHE_CHANGED_ERROR = 3;
    public static final int APPCACHE_MANIFEST_ERROR = 0;
    public static final int APPCACHE_POLICY_ERROR = 6;
    public static final int APPCACHE_QUOTA_ERROR = 5;
    public static final int APPCACHE_RESOURCE_ERROR = 2;
    public static final int APPCACHE_SIGNATURE_ERROR = 1;
    public static final int APPCACHE_UNKNOWN_ERROR = 7;
    private static final boolean IS_EXTENSIBLE = false;
    public static final int MAX_VALUE = 7;
    public static final int MIN_VALUE = 0;

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

    private AppCacheErrorReason() {
    }
}
