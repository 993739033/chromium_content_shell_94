package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo_base.mojom.Time;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public final class AppCacheInfo extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 104;
    private static final DataHeader[] VERSION_ARRAY;
    public long cacheId;
    public Time creationTime;
    public long groupId;
    public boolean isComplete;
    public Time lastAccessTime;
    public Time lastUpdateTime;
    public long manifestParserVersion;
    public String manifestScope;
    public Url manifestUrl;
    public long paddingSizes;
    public long responseSizes;
    public int status;
    public Time tokenExpires;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(104, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private AppCacheInfo(int version) {
        super(104, version);
    }

    public AppCacheInfo() {
        this(0);
    }

    public static AppCacheInfo deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static AppCacheInfo deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static AppCacheInfo decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            AppCacheInfo result = new AppCacheInfo(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, false);
            result.manifestUrl = Url.decode(decoder1);
            Decoder decoder12 = decoder0.readPointer(16, false);
            result.creationTime = Time.decode(decoder12);
            Decoder decoder13 = decoder0.readPointer(24, false);
            result.lastUpdateTime = Time.decode(decoder13);
            Decoder decoder14 = decoder0.readPointer(32, false);
            result.lastAccessTime = Time.decode(decoder14);
            Decoder decoder15 = decoder0.readPointer(40, false);
            result.tokenExpires = Time.decode(decoder15);
            result.cacheId = decoder0.readLong(48);
            result.groupId = decoder0.readLong(56);
            int readInt = decoder0.readInt(64);
            result.status = readInt;
            AppCacheStatus.validate(readInt);
            result.status = AppCacheStatus.toKnownValue(result.status);
            result.isComplete = decoder0.readBoolean(68, 0);
            result.responseSizes = decoder0.readLong(72);
            result.paddingSizes = decoder0.readLong(80);
            result.manifestParserVersion = decoder0.readLong(88);
            result.manifestScope = decoder0.readString(96, false);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode((Struct) this.manifestUrl, 8, false);
        encoder0.encode((Struct) this.creationTime, 16, false);
        encoder0.encode((Struct) this.lastUpdateTime, 24, false);
        encoder0.encode((Struct) this.lastAccessTime, 32, false);
        encoder0.encode((Struct) this.tokenExpires, 40, false);
        encoder0.encode(this.cacheId, 48);
        encoder0.encode(this.groupId, 56);
        encoder0.encode(this.status, 64);
        encoder0.encode(this.isComplete, 68, 0);
        encoder0.encode(this.responseSizes, 72);
        encoder0.encode(this.paddingSizes, 80);
        encoder0.encode(this.manifestParserVersion, 88);
        encoder0.encode(this.manifestScope, 96, false);
    }
}
