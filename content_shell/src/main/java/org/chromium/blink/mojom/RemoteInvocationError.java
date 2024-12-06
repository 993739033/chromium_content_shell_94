package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class RemoteInvocationError {
    public static final int EXCEPTION_THROWN = 3;
    private static final boolean IS_EXTENSIBLE = false;
    public static final int MAX_VALUE = 4;
    public static final int METHOD_NOT_FOUND = 1;
    public static final int MIN_VALUE = 0;
    public static final int NON_ASSIGNABLE_TYPES = 4;
    public static final int OBJECT_GET_CLASS_BLOCKED = 2;
    public static final int OK = 0;

    /* loaded from: classes2.dex */
    public @interface EnumType {
    }

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 4;
    }

    public static void validate(int value) {
        if (!isKnownValue(value)) {
            throw new DeserializationException("Invalid enum value.");
        }
    }

    public static int toKnownValue(int value) {
        return value;
    }

    private RemoteInvocationError() {
    }
}
