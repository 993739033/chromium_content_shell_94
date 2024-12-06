package org.chromium.network.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class TrustTokenOperationStatus {
    public static final int ALREADY_EXISTS = 4;
    public static final int BAD_RESPONSE = 6;
    public static final int FAILED_PRECONDITION = 2;
    public static final int INTERNAL_ERROR = 7;
    public static final int INVALID_ARGUMENT = 1;
    private static final boolean IS_EXTENSIBLE = false;
    public static final int MAX_VALUE = 9;
    public static final int MIN_VALUE = 0;
    public static final int OK = 0;
    public static final int OPERATION_SUCCESSFULLY_FULFILLED_LOCALLY = 9;
    public static final int RESOURCE_EXHAUSTED = 3;
    public static final int UNAVAILABLE = 5;
    public static final int UNKNOWN_ERROR = 8;

    /* loaded from: classes2.dex */
    public @interface EnumType {
    }

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 9;
    }

    public static void validate(int value) {
        if (!isKnownValue(value)) {
            throw new DeserializationException("Invalid enum value.");
        }
    }

    public static int toKnownValue(int value) {
        return value;
    }

    private TrustTokenOperationStatus() {
    }
}
