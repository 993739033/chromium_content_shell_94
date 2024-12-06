package org.chromium.viz.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class CompositorFrameTransitionDirectiveType {
    public static final int ANIMATE = 1;
    private static final boolean IS_EXTENSIBLE = false;
    public static final int MAX_VALUE = 1;
    public static final int MIN_VALUE = 0;
    public static final int SAVE = 0;

    /* loaded from: classes2.dex */
    public @interface EnumType {
    }

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 1;
    }

    public static void validate(int value) {
        if (!isKnownValue(value)) {
            throw new DeserializationException("Invalid enum value.");
        }
    }

    public static int toKnownValue(int value) {
        return value;
    }

    private CompositorFrameTransitionDirectiveType() {
    }
}
