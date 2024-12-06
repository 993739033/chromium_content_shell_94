package org.chromium.gpu.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class CommandBufferNamespace {
    public static final int GPU_IO = 0;
    public static final int INVALID = -1;
    public static final int IN_PROCESS = 1;
    private static final boolean IS_EXTENSIBLE = false;
    public static final int MAX_VALUE = 4;
    public static final int MIN_VALUE = -1;
    public static final int MOJO = 2;
    public static final int MOJO_LOCAL = 3;
    public static final int NUM_COMMAND_BUFFER_NAMESPACES = 4;

    /* loaded from: classes2.dex */
    public @interface EnumType {
    }

    public static boolean isKnownValue(int value) {
        return value >= -1 && value <= 4;
    }

    public static void validate(int value) {
        if (!isKnownValue(value)) {
            throw new DeserializationException("Invalid enum value.");
        }
    }

    public static int toKnownValue(int value) {
        return value;
    }

    private CommandBufferNamespace() {
    }
}
