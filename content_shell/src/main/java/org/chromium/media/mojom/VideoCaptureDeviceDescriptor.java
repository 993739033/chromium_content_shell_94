package org.chromium.media.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class VideoCaptureDeviceDescriptor extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 56;
    private static final DataHeader[] VERSION_ARRAY;
    public int captureApi;
    public VideoCaptureControlSupport controlSupport;
    public String deviceId;
    public String displayName;
    public int facingMode;
    public String modelId;
    public int transportType;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(56, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private VideoCaptureDeviceDescriptor(int version) {
        super(56, version);
    }

    public VideoCaptureDeviceDescriptor() {
        this(0);
    }

    public static VideoCaptureDeviceDescriptor deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static VideoCaptureDeviceDescriptor deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static VideoCaptureDeviceDescriptor decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            VideoCaptureDeviceDescriptor result = new VideoCaptureDeviceDescriptor(elementsOrVersion);
            result.displayName = decoder0.readString(8, false);
            result.deviceId = decoder0.readString(16, false);
            result.modelId = decoder0.readString(24, false);
            int readInt = decoder0.readInt(32);
            result.facingMode = readInt;
            VideoFacingMode.validate(readInt);
            result.facingMode = VideoFacingMode.toKnownValue(result.facingMode);
            int readInt2 = decoder0.readInt(36);
            result.captureApi = readInt2;
            VideoCaptureApi.validate(readInt2);
            result.captureApi = VideoCaptureApi.toKnownValue(result.captureApi);
            Decoder decoder1 = decoder0.readPointer(40, false);
            result.controlSupport = VideoCaptureControlSupport.decode(decoder1);
            int readInt3 = decoder0.readInt(48);
            result.transportType = readInt3;
            VideoCaptureTransportType.validate(readInt3);
            result.transportType = VideoCaptureTransportType.toKnownValue(result.transportType);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.displayName, 8, false);
        encoder0.encode(this.deviceId, 16, false);
        encoder0.encode(this.modelId, 24, false);
        encoder0.encode(this.facingMode, 32);
        encoder0.encode(this.captureApi, 36);
        encoder0.encode((Struct) this.controlSupport, 40, false);
        encoder0.encode(this.transportType, 48);
    }
}
