package org.chromium.media.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.DeserializationException;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.system.DataPipe;
/* loaded from: classes2.dex */
public interface DemuxerStream extends Interface {
    public static final Manager<DemuxerStream, Proxy> MANAGER = DemuxerStream_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface InitializeResponse extends Callbacks.Callback4<Integer, DataPipe.ConsumerHandle, AudioDecoderConfig, VideoDecoderConfig> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends DemuxerStream, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface ReadResponse extends Callbacks.Callback4<Integer, DecoderBuffer, AudioDecoderConfig, VideoDecoderConfig> {
    }

    void enableBitstreamConverter();

    void initialize(InitializeResponse initializeResponse);

    void read(ReadResponse readResponse);

    /* loaded from: classes2.dex */
    public static final class Type {
        private static final boolean IS_EXTENSIBLE = false;

        /* loaded from: classes2.dex */
        public @interface EnumType {
        }

        public static boolean isKnownValue(int value) {
            return false;
        }

        public static void validate(int value) {
            if (!isKnownValue(value)) {
                throw new DeserializationException("Invalid enum value.");
            }
        }

        public static int toKnownValue(int value) {
            return value;
        }

        private Type() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class Status {
        private static final boolean IS_EXTENSIBLE = false;

        /* loaded from: classes2.dex */
        public @interface EnumType {
        }

        public static boolean isKnownValue(int value) {
            return false;
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
