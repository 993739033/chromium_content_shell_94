package org.chromium.payments.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class CanMakePaymentEventResponseType {
    public static final int BOOLEAN_CONVERSION_ERROR = 4;
    public static final int BROWSER_ERROR = 5;
    public static final int INCOGNITO = 0;
    public static final int INTERNAL_ERROR = 6;
    public static final int INVALID_ACCOUNT_BALANCE_VALUE = 11;
    private static final boolean IS_EXTENSIBLE = false;
    public static final int MAX_VALUE = 15;
    public static final int MINIMAL_UI_RESPONSE_CONVERSION_ERROR = 12;
    public static final int MIN_VALUE = 0;
    public static final int NOT_INSTALLED = 2;
    public static final int NO_ACCOUNT_BALANCE_VALUE = 13;
    public static final int NO_CAN_MAKE_PAYMENT_VALUE = 14;
    public static final int NO_EXPLICITLY_VERIFIED_METHODS = 1;
    public static final int NO_READY_FOR_MINIMAL_UI_VALUE = 15;
    public static final int NO_RESPONSE = 7;
    public static final int NO_URL_BASED_PAYMENT_METHODS = 3;
    public static final int REJECT = 8;
    public static final int SUCCESS = 9;
    public static final int TIMEOUT = 10;

    /* loaded from: classes2.dex */
    public @interface EnumType {
    }

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 15;
    }

    public static void validate(int value) {
        if (!isKnownValue(value)) {
            throw new DeserializationException("Invalid enum value.");
        }
    }

    public static int toKnownValue(int value) {
        return value;
    }

    private CanMakePaymentEventResponseType() {
    }
}
