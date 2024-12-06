package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo_base.mojom.UnguessableToken;
import org.chromium.network.mojom.CredentialsMode;
import org.chromium.network.mojom.RedirectMode;
import org.chromium.network.mojom.RequestDestination;
import org.chromium.network.mojom.RequestPriority;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public final class FetchApiRequest extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 112;
    private static final DataHeader[] VERSION_ARRAY;
    public SerializedBlob blob;
    public FetchApiRequestBody body;
    public int cacheMode;
    public int credentialsMode;
    public int destination;
    public String devtoolsStackId;
    public UnguessableToken fetchWindowId;
    public int frameType;
    public FetchApiRequestHeaders headers;
    public String integrity;
    public boolean isHistoryNavigation;
    public boolean isMainResourceLoad;
    public boolean isReload;
    public boolean keepalive;
    public String method;
    public int mode;
    public int priority;
    public int redirectMode;
    public Referrer referrer;
    public Url url;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(112, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private FetchApiRequest(int version) {
        super(112, version);
        this.mode = 1;
        this.isMainResourceLoad = false;
        this.destination = 0;
        this.frameType = 2;
        this.credentialsMode = 0;
        this.cacheMode = 0;
        this.redirectMode = 0;
        this.priority = 1;
        this.keepalive = false;
        this.isReload = false;
        this.isHistoryNavigation = false;
    }

    public FetchApiRequest() {
        this(0);
    }

    public static FetchApiRequest deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static FetchApiRequest deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static FetchApiRequest decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            FetchApiRequest result = new FetchApiRequest(elementsOrVersion);
            int readInt = decoder0.readInt(8);
            result.mode = readInt;
            org.chromium.network.mojom.RequestMode.validate(readInt);
            result.mode = org.chromium.network.mojom.RequestMode.toKnownValue(result.mode);
            result.isMainResourceLoad = decoder0.readBoolean(12, 0);
            result.keepalive = decoder0.readBoolean(12, 1);
            result.isReload = decoder0.readBoolean(12, 2);
            result.isHistoryNavigation = decoder0.readBoolean(12, 3);
            int readInt2 = decoder0.readInt(16);
            result.destination = readInt2;
            RequestDestination.validate(readInt2);
            result.destination = RequestDestination.toKnownValue(result.destination);
            int readInt3 = decoder0.readInt(20);
            result.frameType = readInt3;
            RequestContextFrameType.validate(readInt3);
            result.frameType = RequestContextFrameType.toKnownValue(result.frameType);
            Decoder decoder1 = decoder0.readPointer(24, false);
            result.url = Url.decode(decoder1);
            result.method = decoder0.readString(32, false);
            Decoder decoder12 = decoder0.readPointer(40, false);
            result.headers = FetchApiRequestHeaders.decode(decoder12);
            Decoder decoder13 = decoder0.readPointer(48, true);
            result.blob = SerializedBlob.decode(decoder13);
            Decoder decoder14 = decoder0.readPointer(56, true);
            result.body = FetchApiRequestBody.decode(decoder14);
            Decoder decoder15 = decoder0.readPointer(64, true);
            result.referrer = Referrer.decode(decoder15);
            int readInt4 = decoder0.readInt(72);
            result.credentialsMode = readInt4;
            CredentialsMode.validate(readInt4);
            result.credentialsMode = CredentialsMode.toKnownValue(result.credentialsMode);
            int readInt5 = decoder0.readInt(76);
            result.cacheMode = readInt5;
            FetchCacheMode.validate(readInt5);
            result.cacheMode = FetchCacheMode.toKnownValue(result.cacheMode);
            int readInt6 = decoder0.readInt(80);
            result.redirectMode = readInt6;
            RedirectMode.validate(readInt6);
            result.redirectMode = RedirectMode.toKnownValue(result.redirectMode);
            int readInt7 = decoder0.readInt(84);
            result.priority = readInt7;
            RequestPriority.validate(readInt7);
            result.priority = RequestPriority.toKnownValue(result.priority);
            result.integrity = decoder0.readString(88, true);
            Decoder decoder16 = decoder0.readPointer(96, true);
            result.fetchWindowId = UnguessableToken.decode(decoder16);
            result.devtoolsStackId = decoder0.readString(104, true);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.mode, 8);
        encoder0.encode(this.isMainResourceLoad, 12, 0);
        encoder0.encode(this.keepalive, 12, 1);
        encoder0.encode(this.isReload, 12, 2);
        encoder0.encode(this.isHistoryNavigation, 12, 3);
        encoder0.encode(this.destination, 16);
        encoder0.encode(this.frameType, 20);
        encoder0.encode((Struct) this.url, 24, false);
        encoder0.encode(this.method, 32, false);
        encoder0.encode((Struct) this.headers, 40, false);
        encoder0.encode((Struct) this.blob, 48, true);
        encoder0.encode((Struct) this.body, 56, true);
        encoder0.encode((Struct) this.referrer, 64, true);
        encoder0.encode(this.credentialsMode, 72);
        encoder0.encode(this.cacheMode, 76);
        encoder0.encode(this.redirectMode, 80);
        encoder0.encode(this.priority, 84);
        encoder0.encode(this.integrity, 88, true);
        encoder0.encode((Struct) this.fetchWindowId, 96, true);
        encoder0.encode(this.devtoolsStackId, 104, true);
    }
}
