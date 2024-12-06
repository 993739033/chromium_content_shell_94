package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class PortalActivateResult {
    public static final int ABORTED_DUE_TO_BUG = 6;
    public static final int DISCONNECTED = 5;
    private static final boolean IS_EXTENSIBLE = false;
    public static final int MAX_VALUE = 6;
    public static final int MIN_VALUE = 0;
    public static final int PREDECESSOR_WAS_ADOPTED = 1;
    public static final int PREDECESSOR_WILL_UNLOAD = 0;
    public static final int REJECTED_DUE_TO_ERROR_IN_PORTAL = 3;
    public static final int REJECTED_DUE_TO_PORTAL_NOT_READY = 2;
    public static final int REJECTED_DUE_TO_PREDECESSOR_NAVIGATION = 4;

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

    private PortalActivateResult() {
    }
}
