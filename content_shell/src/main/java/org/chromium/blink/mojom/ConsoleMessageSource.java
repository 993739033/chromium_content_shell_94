package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class ConsoleMessageSource {
    public static final int APP_CACHE = 5;
    public static final int CONSOLE_API = 3;
    public static final int DEPRECATION = 9;
    public static final int INTERVENTION = 12;
    private static final boolean IS_EXTENSIBLE = false;
    public static final int JAVA_SCRIPT = 1;
    public static final int MAX_VALUE = 13;
    public static final int MIN_VALUE = 0;
    public static final int NETWORK = 2;
    public static final int OTHER = 8;
    public static final int RECOMMENDATION = 13;
    public static final int RENDERING = 6;
    public static final int SECURITY = 7;
    public static final int STORAGE = 4;
    public static final int VIOLATION = 11;
    public static final int WORKER = 10;
    public static final int XML = 0;

    /* loaded from: classes2.dex */
    public @interface EnumType {
    }

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 13;
    }

    public static void validate(int value) {
        if (!isKnownValue(value)) {
            throw new DeserializationException("Invalid enum value.");
        }
    }

    public static int toKnownValue(int value) {
        return value;
    }

    private ConsoleMessageSource() {
    }
}
