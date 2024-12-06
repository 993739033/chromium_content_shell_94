package org.chromium.gfx.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class BufferFormat {
    public static final int BGRA_1010102 = 8;
    public static final int BGRA_8888 = 10;
    public static final int BGRX_8888 = 7;
    public static final int BGR_565 = 3;
    private static final boolean IS_EXTENSIBLE = false;
    public static final int MAX_VALUE = 14;
    public static final int MIN_VALUE = 0;
    public static final int P010 = 14;
    public static final int RGBA_1010102 = 9;
    public static final int RGBA_4444 = 4;
    public static final int RGBA_8888 = 6;
    public static final int RGBA_F16 = 11;
    public static final int RGBX_8888 = 5;
    public static final int RG_88 = 2;
    public static final int R_16 = 1;
    public static final int R_8 = 0;
    public static final int YUV_420_BIPLANAR = 13;
    public static final int YVU_420 = 12;

    /* loaded from: classes2.dex */
    public @interface EnumType {
    }

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 14;
    }

    public static void validate(int value) {
        if (!isKnownValue(value)) {
            throw new DeserializationException("Invalid enum value.");
        }
    }

    public static int toKnownValue(int value) {
        return value;
    }

    private BufferFormat() {
    }
}
