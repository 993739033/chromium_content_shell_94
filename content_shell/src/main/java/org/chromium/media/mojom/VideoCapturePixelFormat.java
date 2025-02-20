package org.chromium.media.mojom;
/* loaded from: classes2.dex */
public final class VideoCapturePixelFormat {
    public static final int ABGR = 24;
    public static final int ARGB = 10;
    public static final int BGRA = 29;
    public static final int I420 = 1;
    public static final int I420A = 4;
    public static final int I422 = 3;
    public static final int I444 = 5;
    private static final boolean IS_EXTENSIBLE = true;
    public static final int MAX_VALUE = 30;
    public static final int MIN_VALUE = 0;
    public static final int MJPEG = 13;
    public static final int NV12 = 6;
    public static final int NV21 = 7;
    public static final int P016LE = 26;
    public static final int RGB24 = 12;
    public static final int RGBAF16 = 30;
    public static final int UNKNOWN = 0;
    public static final int UYVY = 8;
    public static final int XB30 = 28;
    public static final int XBGR = 25;
    public static final int XR30 = 27;
    public static final int XRGB = 11;
    public static final int Y16 = 23;
    public static final int YUV420P10 = 15;
    public static final int YUV420P12 = 20;
    public static final int YUV420P9 = 14;
    public static final int YUV422P10 = 17;
    public static final int YUV422P12 = 21;
    public static final int YUV422P9 = 16;
    public static final int YUV444P10 = 19;
    public static final int YUV444P12 = 22;
    public static final int YUV444P9 = 18;
    public static final int YUY2 = 9;
    public static final int YV12 = 2;

    /* loaded from: classes2.dex */
    public @interface EnumType {
    }

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 30;
    }

    public static void validate(int value) {
    }

    public static int toKnownValue(int value) {
        return value;
    }

    private VideoCapturePixelFormat() {
    }
}
