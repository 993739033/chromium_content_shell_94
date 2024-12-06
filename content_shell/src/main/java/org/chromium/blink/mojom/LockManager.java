package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.AssociatedInterfaceNotSupported;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.DeserializationException;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface LockManager extends Interface {
    public static final Manager<LockManager, Proxy> MANAGER = LockManager_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends LockManager, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface QueryStateResponse extends Callbacks.Callback2<LockInfo[], LockInfo[]> {
    }

    void queryState(QueryStateResponse queryStateResponse);

    void requestLock(String str, int i, int i2, AssociatedInterfaceNotSupported associatedInterfaceNotSupported);

    /* loaded from: classes2.dex */
    public static final class WaitMode {
        private static final boolean IS_EXTENSIBLE = false;
        public static final int MAX_VALUE = 2;
        public static final int MIN_VALUE = 0;
        public static final int NO_WAIT = 1;
        public static final int PREEMPT = 2;
        public static final int WAIT = 0;

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

        private WaitMode() {
        }
    }
}
