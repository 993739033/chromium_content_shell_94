package org.chromium.network.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo_base.mojom.Time;
/* loaded from: classes2.dex */
public final class CanonicalCookie extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 96;
    private static final DataHeader[] VERSION_ARRAY;
    public Time creation;
    public String domain;
    public Time expiry;
    public boolean httponly;
    public Time lastAccess;
    public String name;
    public CookiePartitionKey partitionKey;
    public String path;
    public int priority;
    public boolean sameParty;
    public boolean secure;
    public int siteRestrictions;
    public int sourcePort;
    public int sourceScheme;
    public String value;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(96, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private CanonicalCookie(int version) {
        super(96, version);
        this.secure = false;
        this.httponly = false;
        this.siteRestrictions = 0;
        this.priority = 1;
        this.sourceScheme = 0;
        this.sameParty = false;
        this.sourcePort = -1;
    }

    public CanonicalCookie() {
        this(0);
    }

    public static CanonicalCookie deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static CanonicalCookie deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static CanonicalCookie decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            CanonicalCookie result = new CanonicalCookie(elementsOrVersion);
            result.name = decoder0.readString(8, false);
            result.value = decoder0.readString(16, false);
            result.domain = decoder0.readString(24, false);
            result.path = decoder0.readString(32, false);
            Decoder decoder1 = decoder0.readPointer(40, false);
            result.creation = Time.decode(decoder1);
            Decoder decoder12 = decoder0.readPointer(48, false);
            result.expiry = Time.decode(decoder12);
            Decoder decoder13 = decoder0.readPointer(56, false);
            result.lastAccess = Time.decode(decoder13);
            result.secure = decoder0.readBoolean(64, 0);
            result.httponly = decoder0.readBoolean(64, 1);
            result.sameParty = decoder0.readBoolean(64, 2);
            int readInt = decoder0.readInt(68);
            result.siteRestrictions = readInt;
            CookieSameSite.validate(readInt);
            result.siteRestrictions = CookieSameSite.toKnownValue(result.siteRestrictions);
            int readInt2 = decoder0.readInt(72);
            result.priority = readInt2;
            CookiePriority.validate(readInt2);
            result.priority = CookiePriority.toKnownValue(result.priority);
            int readInt3 = decoder0.readInt(76);
            result.sourceScheme = readInt3;
            CookieSourceScheme.validate(readInt3);
            result.sourceScheme = CookieSourceScheme.toKnownValue(result.sourceScheme);
            Decoder decoder14 = decoder0.readPointer(80, true);
            result.partitionKey = CookiePartitionKey.decode(decoder14);
            result.sourcePort = decoder0.readInt(88);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.name, 8, false);
        encoder0.encode(this.value, 16, false);
        encoder0.encode(this.domain, 24, false);
        encoder0.encode(this.path, 32, false);
        encoder0.encode((Struct) this.creation, 40, false);
        encoder0.encode((Struct) this.expiry, 48, false);
        encoder0.encode((Struct) this.lastAccess, 56, false);
        encoder0.encode(this.secure, 64, 0);
        encoder0.encode(this.httponly, 64, 1);
        encoder0.encode(this.sameParty, 64, 2);
        encoder0.encode(this.siteRestrictions, 68);
        encoder0.encode(this.priority, 72);
        encoder0.encode(this.sourceScheme, 76);
        encoder0.encode((Struct) this.partitionKey, 80, true);
        encoder0.encode(this.sourcePort, 88);
    }
}
