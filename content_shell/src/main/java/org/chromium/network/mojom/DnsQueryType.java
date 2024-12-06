package org.chromium.network.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class DnsQueryType {
    public static final int A = 1;
    public static final int AAAA = 2;
    public static final int HTTPS = 6;
    private static final boolean IS_EXTENSIBLE = false;
    public static final int MAX_VALUE = 6;
    public static final int MIN_VALUE = 0;
    public static final int PTR = 4;
    public static final int SRV = 5;
    public static final int TXT = 3;
    public static final int UNSPECIFIED = 0;

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

    private DnsQueryType() {
    }
}
