package org.chromium.media.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.gfx.mojom.Size;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.DeserializationException;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class VideoEncodeAcceleratorConfig extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 64;
    private static final DataHeader[] VERSION_ARRAY;
    public Bitrate bitrate;
    public int contentType;
    public int gopLength;
    public byte h264OutputLevel;
    public boolean hasGopLength;
    public boolean hasH264OutputLevel;
    public boolean hasInitialFramerate;
    public boolean hasStorageType;
    public int initialFramerate;
    public int inputFormat;
    public Size inputVisibleSize;
    public int interLayerPred;
    public boolean isConstrainedH264;
    public int outputProfile;
    public boolean requireLowDelay;
    public SpatialLayer[] spatialLayers;
    public int storageType;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(64, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    /* loaded from: classes2.dex */
    public static final class ContentType {
        public static final int CAMERA = 0;
        public static final int DISPLAY = 1;
        private static final boolean IS_EXTENSIBLE = false;
        public static final int MAX_VALUE = 1;
        public static final int MIN_VALUE = 0;

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

        private ContentType() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class InterLayerPredMode {
        private static final boolean IS_EXTENSIBLE = false;
        public static final int MAX_VALUE = 2;
        public static final int MIN_VALUE = 0;
        public static final int OFF = 0;
        public static final int ON = 1;
        public static final int ON_KEY_PIC = 2;

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

        private InterLayerPredMode() {
        }
    }

    /* loaded from: classes2.dex */
    public static final class StorageType {
        public static final int GPU_MEMORY_BUFFER = 1;
        private static final boolean IS_EXTENSIBLE = false;
        public static final int MAX_VALUE = 1;
        public static final int MIN_VALUE = 0;
        public static final int SHMEM = 0;

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

        private StorageType() {
        }
    }

    private VideoEncodeAcceleratorConfig(int version) {
        super(64, version);
    }

    public VideoEncodeAcceleratorConfig() {
        this(0);
    }

    public static VideoEncodeAcceleratorConfig deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static VideoEncodeAcceleratorConfig deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static VideoEncodeAcceleratorConfig decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            VideoEncodeAcceleratorConfig result = new VideoEncodeAcceleratorConfig(elementsOrVersion);
            int readInt = decoder0.readInt(8);
            result.inputFormat = readInt;
            VideoPixelFormat.validate(readInt);
            result.inputFormat = VideoPixelFormat.toKnownValue(result.inputFormat);
            int readInt2 = decoder0.readInt(12);
            result.outputProfile = readInt2;
            VideoCodecProfile.validate(readInt2);
            result.outputProfile = VideoCodecProfile.toKnownValue(result.outputProfile);
            Decoder decoder1 = decoder0.readPointer(16, false);
            result.inputVisibleSize = Size.decode(decoder1);
            Decoder decoder12 = decoder0.readPointer(24, false);
            result.bitrate = Bitrate.decode(decoder12);
            result.initialFramerate = decoder0.readInt(32);
            result.hasInitialFramerate = decoder0.readBoolean(36, 0);
            result.hasGopLength = decoder0.readBoolean(36, 1);
            result.hasH264OutputLevel = decoder0.readBoolean(36, 2);
            result.isConstrainedH264 = decoder0.readBoolean(36, 3);
            result.hasStorageType = decoder0.readBoolean(36, 4);
            result.requireLowDelay = decoder0.readBoolean(36, 5);
            result.h264OutputLevel = decoder0.readByte(37);
            result.gopLength = decoder0.readInt(40);
            int readInt3 = decoder0.readInt(44);
            result.storageType = readInt3;
            StorageType.validate(readInt3);
            result.storageType = StorageType.toKnownValue(result.storageType);
            int readInt4 = decoder0.readInt(48);
            result.contentType = readInt4;
            ContentType.validate(readInt4);
            result.contentType = ContentType.toKnownValue(result.contentType);
            int readInt5 = decoder0.readInt(52);
            result.interLayerPred = readInt5;
            InterLayerPredMode.validate(readInt5);
            result.interLayerPred = InterLayerPredMode.toKnownValue(result.interLayerPred);
            Decoder decoder13 = decoder0.readPointer(56, false);
            DataHeader si1 = decoder13.readDataHeaderForPointerArray(-1);
            result.spatialLayers = new SpatialLayer[si1.elementsOrVersion];
            for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                Decoder decoder2 = decoder13.readPointer((i1 * 8) + 8, false);
                result.spatialLayers[i1] = SpatialLayer.decode(decoder2);
            }
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.inputFormat, 8);
        encoder0.encode(this.outputProfile, 12);
        encoder0.encode((Struct) this.inputVisibleSize, 16, false);
        encoder0.encode((Struct) this.bitrate, 24, false);
        encoder0.encode(this.initialFramerate, 32);
        encoder0.encode(this.hasInitialFramerate, 36, 0);
        encoder0.encode(this.hasGopLength, 36, 1);
        encoder0.encode(this.hasH264OutputLevel, 36, 2);
        encoder0.encode(this.isConstrainedH264, 36, 3);
        encoder0.encode(this.hasStorageType, 36, 4);
        encoder0.encode(this.requireLowDelay, 36, 5);
        encoder0.encode(this.h264OutputLevel, 37);
        encoder0.encode(this.gopLength, 40);
        encoder0.encode(this.storageType, 44);
        encoder0.encode(this.contentType, 48);
        encoder0.encode(this.interLayerPred, 52);
        SpatialLayer[] spatialLayerArr = this.spatialLayers;
        if (spatialLayerArr == null) {
            encoder0.encodeNullPointer(56, false);
            return;
        }
        Encoder encoder1 = encoder0.encodePointerArray(spatialLayerArr.length, 56, -1);
        int i0 = 0;
        while (true) {
            SpatialLayer[] spatialLayerArr2 = this.spatialLayers;
            if (i0 < spatialLayerArr2.length) {
                encoder1.encode((Struct) spatialLayerArr2[i0], (i0 * 8) + 8, false);
                i0++;
            } else {
                return;
            }
        }
    }
}
