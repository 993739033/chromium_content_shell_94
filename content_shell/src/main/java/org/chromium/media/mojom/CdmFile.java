package org.chromium.media.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.DeserializationException;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface CdmFile extends Interface {
    public static final Manager<CdmFile, Proxy> MANAGER = CdmFile_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends CdmFile, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface ReadResponse extends Callbacks.Callback2<Integer, byte[]> {
    }

    /* loaded from: classes2.dex */
    public interface WriteResponse extends Callbacks.Callback1<Integer> {
    }

    void read(ReadResponse readResponse);

    void write(byte[] bArr, WriteResponse writeResponse);

    /* loaded from: classes2.dex */
    public static final class Status {
        public static final int FAILURE = 1;
        private static final boolean IS_EXTENSIBLE = false;
        public static final int MAX_VALUE = 1;
        public static final int MIN_VALUE = 0;
        public static final int SUCCESS = 0;

        /* loaded from: classes2.dex */
        public @interface EnumType {
        }

        public static boolean isKnownValue(int value) {
            return value >= 0 && value <= 1;
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
