package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class DispatchFetchEventParams extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 48;
    private static final DataHeader[] VERSION_ARRAY;
    public String clientId;
    public boolean isOfflineCapabilityCheck;
    public FetchEventPreloadHandle preloadHandle;
    public FetchApiRequest request;
    public WorkerTimingContainer workerTimingRemote;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(48, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private DispatchFetchEventParams(int version) {
        super(48, version);
        this.isOfflineCapabilityCheck = false;
    }

    public DispatchFetchEventParams() {
        this(0);
    }

    public static DispatchFetchEventParams deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static DispatchFetchEventParams deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static DispatchFetchEventParams decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            DispatchFetchEventParams result = new DispatchFetchEventParams(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, false);
            result.request = FetchApiRequest.decode(decoder1);
            result.clientId = decoder0.readString(16, false);
            Decoder decoder12 = decoder0.readPointer(24, true);
            result.preloadHandle = FetchEventPreloadHandle.decode(decoder12);
            result.workerTimingRemote = (WorkerTimingContainer) decoder0.readServiceInterface(32, true, WorkerTimingContainer.MANAGER);
            result.isOfflineCapabilityCheck = decoder0.readBoolean(40, 0);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode((Struct) this.request, 8, false);
        encoder0.encode(this.clientId, 16, false);
        encoder0.encode((Struct) this.preloadHandle, 24, true);
        encoder0.encode( this.workerTimingRemote, 32, true, WorkerTimingContainer.MANAGER);
        encoder0.encode(this.isOfflineCapabilityCheck, 40, 0);
    }
}
