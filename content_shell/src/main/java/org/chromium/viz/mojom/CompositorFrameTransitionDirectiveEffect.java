package org.chromium.viz.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class CompositorFrameTransitionDirectiveEffect {
    public static final int COVER_DOWN = 1;
    public static final int COVER_LEFT = 2;
    public static final int COVER_RIGHT = 3;
    public static final int COVER_UP = 4;
    public static final int EXPLODE = 5;
    public static final int FADE = 6;
    public static final int IMPLODE = 7;
    private static final boolean IS_EXTENSIBLE = false;
    public static final int MAX_VALUE = 11;
    public static final int MIN_VALUE = 0;
    public static final int NONE = 0;
    public static final int REVEAL_DOWN = 8;
    public static final int REVEAL_LEFT = 9;
    public static final int REVEAL_RIGHT = 10;
    public static final int REVEAL_UP = 11;

    /* loaded from: classes2.dex */
    public @interface EnumType {
    }

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 11;
    }

    public static void validate(int value) {
        if (!isKnownValue(value)) {
            throw new DeserializationException("Invalid enum value.");
        }
    }

    public static int toKnownValue(int value) {
        return value;
    }

    private CompositorFrameTransitionDirectiveEffect() {
    }
}
