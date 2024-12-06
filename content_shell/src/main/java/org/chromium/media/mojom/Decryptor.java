package org.chromium.media.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.DeserializationException;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.system.DataPipe;
/* loaded from: classes2.dex */
public interface Decryptor extends Interface {
    public static final Manager<Decryptor, Proxy> MANAGER = Decryptor_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface DecryptAndDecodeAudioResponse extends Callbacks.Callback2<Integer, AudioBuffer[]> {
    }

    /* loaded from: classes2.dex */
    public interface DecryptAndDecodeVideoResponse extends Callbacks.Callback3<Integer, VideoFrame, FrameResourceReleaser> {
    }

    /* loaded from: classes2.dex */
    public interface DecryptResponse extends Callbacks.Callback2<Integer, DecoderBuffer> {
    }

    /* loaded from: classes2.dex */
    public interface InitializeAudioDecoderResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface InitializeVideoDecoderResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends Decryptor, Interface.Proxy {
    }

    void cancelDecrypt(int i);

    void decrypt(int i, DecoderBuffer decoderBuffer, DecryptResponse decryptResponse);

    void decryptAndDecodeAudio(DecoderBuffer decoderBuffer, DecryptAndDecodeAudioResponse decryptAndDecodeAudioResponse);

    void decryptAndDecodeVideo(DecoderBuffer decoderBuffer, DecryptAndDecodeVideoResponse decryptAndDecodeVideoResponse);

    void deinitializeDecoder(int i);

    void initialize(DataPipe.ConsumerHandle consumerHandle, DataPipe.ConsumerHandle consumerHandle2, DataPipe.ConsumerHandle consumerHandle3, DataPipe.ProducerHandle producerHandle);

    void initializeAudioDecoder(AudioDecoderConfig audioDecoderConfig, InitializeAudioDecoderResponse initializeAudioDecoderResponse);

    void initializeVideoDecoder(VideoDecoderConfig videoDecoderConfig, InitializeVideoDecoderResponse initializeVideoDecoderResponse);

    void resetDecoder(int i);

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

    /* loaded from: classes2.dex */
    public static final class StreamType {
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

        private StreamType() {
        }
    }
}
