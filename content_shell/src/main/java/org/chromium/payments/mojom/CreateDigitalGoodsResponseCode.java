package org.chromium.payments.mojom;
/* loaded from: classes2.dex */
public final class CreateDigitalGoodsResponseCode {
    public static final int ERROR = 1;
    private static final boolean IS_EXTENSIBLE = true;
    public static final int MAX_VALUE = 3;
    public static final int MIN_VALUE = 0;
    public static final int OK = 0;
    public static final int UNSUPPORTED_CONTEXT = 3;
    public static final int UNSUPPORTED_PAYMENT_METHOD = 2;

    /* loaded from: classes2.dex */
    public @interface EnumType {
    }

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 3;
    }

    public static void validate(int value) {
    }

    public static int toKnownValue(int value) {
        return value;
    }

    private CreateDigitalGoodsResponseCode() {
    }
}
