package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class AppCacheStatus {
    public static final int APPCACHE_STATUS_CHECKING = 2;
    public static final int APPCACHE_STATUS_DOWNLOADING = 3;
    public static final int APPCACHE_STATUS_IDLE = 1;
    public static final int APPCACHE_STATUS_OBSOLETE = 5;
    public static final int APPCACHE_STATUS_UNCACHED = 0;
    public static final int APPCACHE_STATUS_UPDATE_READY = 4;
    private static final boolean IS_EXTENSIBLE = false;
    public static final int MAX_VALUE = 5;
    public static final int MIN_VALUE = 0;

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

    private AppCacheStatus() {
    }
}
