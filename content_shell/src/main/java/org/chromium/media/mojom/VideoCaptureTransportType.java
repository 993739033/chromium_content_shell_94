package org.chromium.media.mojom;
/* loaded from: classes2.dex */
public final class VideoCaptureTransportType {
    private static final boolean IS_EXTENSIBLE = true;
    public static final int MACOSX_USB_OR_BUILT_IN = 0;
    public static final int MAX_VALUE = 1;
    public static final int MIN_VALUE = 0;
    public static final int OTHER_TRANSPORT = 1;

    /* loaded from: classes2.dex */
    public @interface EnumType {
    }

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 1;
    }

    public static void validate(int value) {
    }

    public static int toKnownValue(int value) {
        return value;
    }

    private VideoCaptureTransportType() {
    }
}
