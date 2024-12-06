package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class FileSystemAccessStatus {
    public static final int FILE_ERROR = 7;
    public static final int INVALID_ARGUMENT = 4;
    public static final int INVALID_STATE = 3;
    private static final boolean IS_EXTENSIBLE = false;
    public static final int MAX_VALUE = 7;
    public static final int MIN_VALUE = 0;
    public static final int OK = 0;
    public static final int OPERATION_ABORTED = 6;
    public static final int OPERATION_FAILED = 5;
    public static final int PERMISSION_DENIED = 1;
    public static final int SECURITY_ERROR = 2;

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

    private FileSystemAccessStatus() {
    }
}
