package org.chromium.media.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface OutputProtection extends Interface {
    public static final Manager<OutputProtection, Proxy> MANAGER = OutputProtection_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface EnableProtectionResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends OutputProtection, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface QueryStatusResponse extends Callbacks.Callback3<Boolean, Integer, Integer> {
    }

    void enableProtection(int i, EnableProtectionResponse enableProtectionResponse);

    void queryStatus(QueryStatusResponse queryStatusResponse);

    /* loaded from: classes2.dex */
    public static final class ProtectionType {
        public static final int DEFAULT_VALUE = 0;
        public static final int HDCP = 1;
        private static final boolean IS_EXTENSIBLE = true;
        public static final int MAX_VALUE = 1;
        public static final int MIN_VALUE = 0;
        public static final int NONE = 0;

        /* loaded from: classes2.dex */
        public @interface EnumType {
        }

        public static boolean isKnownValue(int value) {
            return value >= 0 && value <= 1;
        }

        public static void validate(int value) {
        }

        public static int toKnownValue(int value) {
            if (isKnownValue(value)) {
                return value;
            }
            return 0;
        }

        private ProtectionType() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class LinkType {
        public static final int DEFAULT_VALUE = 0;
        public static final int DISPLAYPORT = 32;
        public static final int DVI = 16;
        public static final int HDMI = 8;
        public static final int INTERNAL = 2;
        private static final boolean IS_EXTENSIBLE = true;
        public static final int MAX_VALUE = 64;
        public static final int MIN_VALUE = 0;
        public static final int NETWORK = 64;
        public static final int NONE = 0;
        public static final int UNKNOWN = 1;
        public static final int VGA = 4;

        /* loaded from: classes2.dex */
        public @interface EnumType {
        }

        public static boolean isKnownValue(int value) {
            switch (value) {
                case 0:
                case 1:
                case 2:
                case 4:
                case 8:
                case 16:
                case 32:
                case 64:
                    return true;
                default:
                    return false;
            }
        }

        public static void validate(int value) {
        }

        public static int toKnownValue(int value) {
            if (isKnownValue(value)) {
                return value;
            }
            return 0;
        }

        private LinkType() {
        }
    }
}
