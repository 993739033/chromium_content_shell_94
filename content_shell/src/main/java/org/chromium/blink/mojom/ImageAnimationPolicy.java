package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class ImageAnimationPolicy {
    public static final int IMAGE_ANIMATION_POLICY_ALLOWED = 0;
    public static final int IMAGE_ANIMATION_POLICY_ANIMATE_ONCE = 1;
    public static final int IMAGE_ANIMATION_POLICY_NO_ANIMATION = 2;
    private static final boolean IS_EXTENSIBLE = false;
    public static final int MAX_VALUE = 2;
    public static final int MIN_VALUE = 0;

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

    private ImageAnimationPolicy() {
    }
}
