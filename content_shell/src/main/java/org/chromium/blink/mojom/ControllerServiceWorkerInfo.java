package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo_base.mojom.UnguessableToken;
/* loaded from: classes2.dex */
public final class ControllerServiceWorkerInfo extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 56;
    private static final DataHeader[] VERSION_ARRAY;
    public String clientId;
    public UnguessableToken fetchRequestWindowId;
    public int mode;
    public ServiceWorkerObjectInfo objectInfo;
    public ControllerServiceWorker remoteController;
    public int[] usedFeatures;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(56, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private ControllerServiceWorkerInfo(int version) {
        super(56, version);
        this.mode = 0;
    }

    public ControllerServiceWorkerInfo() {
        this(0);
    }

    public static ControllerServiceWorkerInfo deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static ControllerServiceWorkerInfo deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static ControllerServiceWorkerInfo decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            ControllerServiceWorkerInfo result = new ControllerServiceWorkerInfo(elementsOrVersion);
            int readInt = decoder0.readInt(8);
            result.mode = readInt;
            ControllerServiceWorkerMode.validate(readInt);
            result.mode = ControllerServiceWorkerMode.toKnownValue(result.mode);
            result.remoteController = (ControllerServiceWorker) decoder0.readServiceInterface(12, true, ControllerServiceWorker.MANAGER);
            result.clientId = decoder0.readString(24, false);
            Decoder decoder1 = decoder0.readPointer(32, true);
            result.fetchRequestWindowId = UnguessableToken.decode(decoder1);
            Decoder decoder12 = decoder0.readPointer(40, true);
            result.objectInfo = ServiceWorkerObjectInfo.decode(decoder12);
            result.usedFeatures = decoder0.readInts(48, 0, -1);
            int i1 = 0;
            while (true) {
                int[] iArr = result.usedFeatures;
                if (i1 < iArr.length) {
                    WebFeature.validate(iArr[i1]);
                    i1++;
                } else {
                    return result;
                }
            }
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.mode, 8);
        encoder0.encode( this.remoteController, 12, true,  ControllerServiceWorker.MANAGER);
        encoder0.encode(this.clientId, 24, false);
        encoder0.encode((Struct) this.fetchRequestWindowId, 32, true);
        encoder0.encode((Struct) this.objectInfo, 40, true);
        encoder0.encode(this.usedFeatures, 48, 0, -1);
    }
}
