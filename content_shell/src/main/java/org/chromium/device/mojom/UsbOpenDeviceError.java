package org.chromium.device.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class UsbOpenDeviceError {
    public static final int ACCESS_DENIED = 1;
    public static final int ALREADY_OPEN = 2;
    private static final boolean IS_EXTENSIBLE = false;
    public static final int MAX_VALUE = 2;
    public static final int MIN_VALUE = 0;
    public static final int OK = 0;

    /* loaded from: classes2.dex */
    public @interface EnumType {
    }

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 2;
    }

    public static void validate(int value) {
        if (!isKnownValue(value)) {
            throw new DeserializationException("Invalid enum value.");
        }
    }

    public static int toKnownValue(int value) {
        return value;
    }

    private UsbOpenDeviceError() {
    }
}
