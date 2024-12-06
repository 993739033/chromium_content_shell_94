package org.chromium.proxy_resolver.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class ProxyScheme {
    public static final int DIRECT = 1;
    public static final int HTTP = 2;
    public static final int HTTPS = 5;
    public static final int INVALID = 0;
    private static final boolean IS_EXTENSIBLE = false;
    public static final int MAX_VALUE = 6;
    public static final int MIN_VALUE = 0;
    public static final int QUIC = 6;
    public static final int SOCKS4 = 3;
    public static final int SOCKS5 = 4;

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

    private ProxyScheme() {
    }
}
