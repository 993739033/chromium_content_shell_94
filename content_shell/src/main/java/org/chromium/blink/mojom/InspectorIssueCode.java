package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;
/* loaded from: classes2.dex */
public final class InspectorIssueCode {
    public static final int BLOCKED_BY_RESPONSE_ISSUE = 2;
    public static final int CONTENT_SECURITY_POLICY_ISSUE = 3;
    public static final int HEAVY_AD_ISSUE = 6;
    private static final boolean IS_EXTENSIBLE = false;
    public static final int LOW_TEXT_CONTRAST_ISSUE = 7;
    public static final int MAX_VALUE = 7;
    public static final int MIN_VALUE = 0;
    public static final int MIXED_CONTENT_ISSUE = 1;
    public static final int SAME_SITE_COOKIE_ISSUE = 0;
    public static final int SHARED_ARRAY_BUFFER_ISSUE = 4;
    public static final int TRUSTED_WEB_ACTIVITY_ISSUE = 5;

    /* loaded from: classes2.dex */
    public @interface EnumType {
    }

    public static boolean isKnownValue(int value) {
        return value >= 0 && value <= 7;
    }

    public static void validate(int value) {
        if (!isKnownValue(value)) {
            throw new DeserializationException("Invalid enum value.");
        }
    }

    public static int toKnownValue(int value) {
        return value;
    }

    private InspectorIssueCode() {
    }
}
