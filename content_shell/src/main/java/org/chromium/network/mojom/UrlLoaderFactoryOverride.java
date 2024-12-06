package org.chromium.network.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.InterfaceRequest;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class UrlLoaderFactoryOverride extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 24;
    private static final DataHeader[] VERSION_ARRAY;
    public InterfaceRequest<UrlLoaderFactory> overriddenFactoryReceiver;
    public UrlLoaderFactory overridingFactory;
    public boolean skipCorsEnabledSchemeCheck;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private UrlLoaderFactoryOverride(int version) {
        super(24, version);
        this.skipCorsEnabledSchemeCheck = false;
    }

    public UrlLoaderFactoryOverride() {
        this(0);
    }

    public static UrlLoaderFactoryOverride deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static UrlLoaderFactoryOverride deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static UrlLoaderFactoryOverride decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            UrlLoaderFactoryOverride result = new UrlLoaderFactoryOverride(elementsOrVersion);
            result.overridingFactory = (UrlLoaderFactory) decoder0.readServiceInterface(8, false, UrlLoaderFactory.MANAGER);
            result.overriddenFactoryReceiver = decoder0.readInterfaceRequest(16, true);
            result.skipCorsEnabledSchemeCheck = decoder0.readBoolean(20, 0);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode( this.overridingFactory, 8, false,  UrlLoaderFactory.MANAGER);
        encoder0.encode((InterfaceRequest) this.overriddenFactoryReceiver, 16, true);
        encoder0.encode(this.skipCorsEnabledSchemeCheck, 20, 0);
    }
}
