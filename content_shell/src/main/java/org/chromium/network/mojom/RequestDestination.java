package org.chromium.network.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class RequestDestination {
    public static final int AUDIO = 1;
    public static final int AUDIO_WORKLET = 2;
    public static final int DOCUMENT = 3;
    public static final int EMBED = 4;
    public static final int EMPTY = 0;
    public static final int FONT = 5;
    public static final int FRAME = 6;
    public static final int IFRAME = 7;
    public static final int IMAGE = 8;
    private static final boolean IS_EXTENSIBLE = false;
    public static final int MANIFEST = 9;
    public static final int MAX_VALUE = 21;
    public static final int MIN_VALUE = 0;
    public static final int OBJECT = 10;
    public static final int PAINT_WORKLET = 11;
    public static final int REPORT = 12;
    public static final int SCRIPT = 13;
    public static final int SERVICE_WORKER = 14;
    public static final int SHARED_WORKER = 15;
    public static final int STYLE = 16;
    public static final int TRACK = 17;
    public static final int VIDEO = 18;
    public static final int WEB_BUNDLE = 19;
    public static final int WORKER = 20;
    public static final int XSLT = 21;

    /* loaded from: classes2.dex */
    public @interface EnumType {
    }

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 21;
    }

    public static void validate(int value) {
        if (!isKnownValue(value)) {
            throw new DeserializationException("Invalid enum value.");
        }
    }

    public static int toKnownValue(int value) {
        return value;
    }

    private RequestDestination() {
    }
}
