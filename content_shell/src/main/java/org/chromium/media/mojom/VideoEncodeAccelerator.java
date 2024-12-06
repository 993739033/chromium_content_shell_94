package org.chromium.media.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.DeserializationException;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.system.SharedBufferHandle;
/* loaded from: classes2.dex */
public interface VideoEncodeAccelerator extends Interface {
    public static final Manager<VideoEncodeAccelerator, Proxy> MANAGER = VideoEncodeAccelerator_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface EncodeResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface FlushResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface InitializeResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface IsFlushSupportedResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends VideoEncodeAccelerator, Interface.Proxy {
    }

    void encode(VideoFrame videoFrame, boolean z, EncodeResponse encodeResponse);

    void flush(FlushResponse flushResponse);

    void initialize(VideoEncodeAcceleratorConfig videoEncodeAcceleratorConfig, VideoEncodeAcceleratorClient videoEncodeAcceleratorClient, InitializeResponse initializeResponse);

    void isFlushSupported(IsFlushSupportedResponse isFlushSupportedResponse);

    void requestEncodingParametersChangeWithBitrate(Bitrate bitrate, int i);

    void requestEncodingParametersChangeWithLayers(VideoBitrateAllocation videoBitrateAllocation, int i);

    void useOutputBitstreamBuffer(int i, SharedBufferHandle sharedBufferHandle);

    /* loaded from: classes2.dex */
    public static final class Error {
        public static final int ILLEGAL_STATE = 0;
        public static final int INVALID_ARGUMENT = 1;
        private static final boolean IS_EXTENSIBLE = false;
        public static final int MAX_VALUE = 2;
        public static final int MIN_VALUE = 0;
        public static final int PLATFORM_FAILURE = 2;

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

        private Error() {
        }
    }
}
