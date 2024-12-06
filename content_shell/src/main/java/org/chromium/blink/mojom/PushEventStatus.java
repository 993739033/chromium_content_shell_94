package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class PushEventStatus {
    public static final int EVENT_WAITUNTIL_REJECTED = 6;
    private static final boolean IS_EXTENSIBLE = false;
    public static final int MAX_VALUE = 8;
    public static final int MIN_VALUE = 0;
    public static final int NO_SERVICE_WORKER = 4;
    public static final int PERMISSION_DENIED = 3;
    public static final int PERMISSION_REVOKED_ABUSIVE = 8;
    public static final int SERVICE_WORKER_ERROR = 5;
    public static final int SUCCESS = 0;
    public static final int TIMEOUT = 7;
    public static final int UNKNOWN_APP_ID = 2;

    /* loaded from: classes2.dex */
    public @interface EnumType {
    }

    public static boolean isKnownValue(int value) {
        switch (value) {
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            case 1:
            default:
                return false;
        }
    }

    public static void validate(int value) {
        if (!isKnownValue(value)) {
            throw new DeserializationException("Invalid enum value.");
        }
    }

    public static int toKnownValue(int value) {
        return value;
    }

    private PushEventStatus() {
    }
}
