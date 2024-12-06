package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class NavigationDownloadPolicy extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 32;
    private static final DataHeader[] VERSION_ARRAY;
    public boolean blockingDownloadsInSandboxEnabled;
    public NavigationDownloadTypes disallowedTypes;
    public NavigationDownloadTypes observedTypes;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private NavigationDownloadPolicy(int version) {
        super(32, version);
        this.blockingDownloadsInSandboxEnabled = false;
    }

    public NavigationDownloadPolicy() {
        this(0);
    }

    public static NavigationDownloadPolicy deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static NavigationDownloadPolicy deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static NavigationDownloadPolicy decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            NavigationDownloadPolicy result = new NavigationDownloadPolicy(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, false);
            result.observedTypes = NavigationDownloadTypes.decode(decoder1);
            Decoder decoder12 = decoder0.readPointer(16, false);
            result.disallowedTypes = NavigationDownloadTypes.decode(decoder12);
            result.blockingDownloadsInSandboxEnabled = decoder0.readBoolean(24, 0);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode((Struct) this.observedTypes, 8, false);
        encoder0.encode((Struct) this.disallowedTypes, 16, false);
        encoder0.encode(this.blockingDownloadsInSandboxEnabled, 24, 0);
    }
}
