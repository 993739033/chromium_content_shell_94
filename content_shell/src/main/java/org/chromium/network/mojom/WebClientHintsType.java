package org.chromium.network.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class WebClientHintsType {
    public static final int DEVICE_MEMORY = 0;
    public static final int DOWNLINK = 5;
    public static final int DPR = 1;
    public static final int ECT = 6;
    private static final boolean IS_EXTENSIBLE = false;
    public static final int LANG = 7;
    public static final int MAX_VALUE = 17;
    public static final int MIN_VALUE = 0;
    public static final int PREFERS_COLOR_SCHEME = 15;
    public static final int RESOURCE_WIDTH = 2;
    public static final int RTT = 4;
    public static final int UA = 8;
    public static final int UA_ARCH = 9;
    public static final int UA_BITNESS = 16;
    public static final int UA_FULL_VERSION = 13;
    public static final int UA_MOBILE = 12;
    public static final int UA_MODEL = 11;
    public static final int UA_PLATFORM = 10;
    public static final int UA_PLATFORM_VERSION = 14;
    public static final int UA_REDUCED = 17;
    public static final int VIEWPORT_WIDTH = 3;

    /* loaded from: classes2.dex */
    public @interface EnumType {
    }

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 17;
    }

    public static void validate(int value) {
        if (!isKnownValue(value)) {
            throw new DeserializationException("Invalid enum value.");
        }
    }

    public static int toKnownValue(int value) {
        return value;
    }

    private WebClientHintsType() {
    }
}
