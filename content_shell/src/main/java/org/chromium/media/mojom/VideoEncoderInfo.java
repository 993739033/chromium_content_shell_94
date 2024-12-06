package org.chromium.media.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class VideoEncoderInfo extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 40;
    private static final DataHeader[] VERSION_ARRAY;
    public byte[][] fpsAllocation;
    public boolean hasTrustedRateController;
    public String implementationName;
    public boolean isHardwareAccelerated;
    public ResolutionBitrateLimit[] resolutionBitrateLimits;
    public boolean supportsNativeHandle;
    public boolean supportsSimulcast;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private VideoEncoderInfo(int version) {
        super(40, version);
    }

    public VideoEncoderInfo() {
        this(0);
    }

    public static VideoEncoderInfo deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static VideoEncoderInfo deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static VideoEncoderInfo decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            VideoEncoderInfo result = new VideoEncoderInfo(elementsOrVersion);
            result.implementationName = decoder0.readString(8, false);
            result.supportsNativeHandle = decoder0.readBoolean(16, 0);
            result.hasTrustedRateController = decoder0.readBoolean(16, 1);
            result.isHardwareAccelerated = decoder0.readBoolean(16, 2);
            result.supportsSimulcast = decoder0.readBoolean(16, 3);
            Decoder decoder1 = decoder0.readPointer(24, false);
            DataHeader si1 = decoder1.readDataHeaderForPointerArray(5);
            result.fpsAllocation = new byte[si1.elementsOrVersion][];
            for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                result.fpsAllocation[i1] = decoder1.readBytes((i1 * 8) + 8, 0, -1);
            }
            Decoder decoder12 = decoder0.readPointer(32, false);
            DataHeader si12 = decoder12.readDataHeaderForPointerArray(-1);
            result.resolutionBitrateLimits = new ResolutionBitrateLimit[si12.elementsOrVersion];
            for (int i12 = 0; i12 < si12.elementsOrVersion; i12++) {
                Decoder decoder2 = decoder12.readPointer((i12 * 8) + 8, false);
                result.resolutionBitrateLimits[i12] = ResolutionBitrateLimit.decode(decoder2);
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
        encoder0.encode(this.implementationName, 8, false);
        encoder0.encode(this.supportsNativeHandle, 16, 0);
        encoder0.encode(this.hasTrustedRateController, 16, 1);
        encoder0.encode(this.isHardwareAccelerated, 16, 2);
        encoder0.encode(this.supportsSimulcast, 16, 3);
        byte[][] bArr = this.fpsAllocation;
        if (bArr == null) {
            encoder0.encodeNullPointer(24, false);
        } else {
            Encoder encoder1 = encoder0.encodePointerArray(bArr.length, 24, 5);
            int i0 = 0;
            while (true) {
                byte[][] bArr2 = this.fpsAllocation;
                if (i0 >= bArr2.length) {
                    break;
                }
                encoder1.encode(bArr2[i0], (i0 * 8) + 8, 0, -1);
                i0++;
            }
        }
        ResolutionBitrateLimit[] resolutionBitrateLimitArr = this.resolutionBitrateLimits;
        if (resolutionBitrateLimitArr == null) {
            encoder0.encodeNullPointer(32, false);
            return;
        }
        Encoder encoder12 = encoder0.encodePointerArray(resolutionBitrateLimitArr.length, 32, -1);
        int i02 = 0;
        while (true) {
            ResolutionBitrateLimit[] resolutionBitrateLimitArr2 = this.resolutionBitrateLimits;
            if (i02 < resolutionBitrateLimitArr2.length) {
                encoder12.encode((Struct) resolutionBitrateLimitArr2[i02], (i02 * 8) + 8, false);
                i02++;
            } else {
                return;
            }
        }
    }
}
