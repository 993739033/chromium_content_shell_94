package org.chromium.media.mojom;

import org.chromium.mojo.bindings.AssociatedInterfaceNotSupported;
import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.DeserializationException;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface CdmStorage extends Interface {
    public static final Manager<CdmStorage, Proxy> MANAGER = CdmStorage_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface OpenResponse extends Callbacks.Callback2<Integer, AssociatedInterfaceNotSupported> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends CdmStorage, Interface.Proxy {
    }

    void open(String str, OpenResponse openResponse);

    /* loaded from: classes2.dex */
    public static final class Status {
        public static final int FAILURE = 2;
        public static final int IN_USE = 1;
        private static final boolean IS_EXTENSIBLE = false;
        public static final int MAX_VALUE = 2;
        public static final int MIN_VALUE = 0;
        public static final int SUCCESS = 0;

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

        private Status() {
        }
    }
}
