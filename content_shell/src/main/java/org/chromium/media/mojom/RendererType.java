package org.chromium.media.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class RendererType {
    public static final int CAST = 5;
    public static final int CAST_STREAMING = 9;
    public static final int COURIER = 3;
    public static final int DEFAULT = 0;
    public static final int FLINGING = 4;
    public static final int FUCHSIA = 7;
    private static final boolean IS_EXTENSIBLE = false;
    public static final int MAX_VALUE = 9;
    public static final int MEDIA_FOUNDATION = 6;
    public static final int MEDIA_PLAYER = 2;
    public static final int MIN_VALUE = 0;
    public static final int MOJO = 1;
    public static final int REMOTING = 8;

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

    private RendererType() {
    }
}
