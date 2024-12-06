package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.network.mojom.UrlLoader;
import org.chromium.network.mojom.UrlLoaderClient;
/* loaded from: classes2.dex */
public final class FetchEventPreloadHandle extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 24;
    private static final DataHeader[] VERSION_ARRAY;
    public UrlLoader urlLoader;
    public InterfaceRequest<UrlLoaderClient> urlLoaderClientReceiver;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private FetchEventPreloadHandle(int version) {
        super(24, version);
    }

    public FetchEventPreloadHandle() {
        this(0);
    }

    public static FetchEventPreloadHandle deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static FetchEventPreloadHandle deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static FetchEventPreloadHandle decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            FetchEventPreloadHandle result = new FetchEventPreloadHandle(elementsOrVersion);
            result.urlLoader = (UrlLoader) decoder0.readServiceInterface(8, false, UrlLoader.MANAGER);
            result.urlLoaderClientReceiver = decoder0.readInterfaceRequest(16, false);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode( this.urlLoader, 8, false,  UrlLoader.MANAGER);
        encoder0.encode((InterfaceRequest) this.urlLoaderClientReceiver, 16, false);
    }
}
