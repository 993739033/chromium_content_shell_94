package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public final class SameSiteCookieIssueDetails extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 64;
    private static final DataHeader[] VERSION_ARRAY;
    public AffectedCookie cookie;
    public Url cookieUrl;
    public int[] exclusionReason;
    public int operation;
    public AffectedRequest request;
    public Url siteForCookies;
    public int[] warningReason;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(64, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private SameSiteCookieIssueDetails(int version) {
        super(64, version);
    }

    public SameSiteCookieIssueDetails() {
        this(0);
    }

    public static SameSiteCookieIssueDetails deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static SameSiteCookieIssueDetails deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static SameSiteCookieIssueDetails decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            SameSiteCookieIssueDetails result = new SameSiteCookieIssueDetails(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, false);
            result.cookie = AffectedCookie.decode(decoder1);
            result.exclusionReason = decoder0.readInts(16, 0, -1);
            int i1 = 0;
            while (true) {
                int[] iArr = result.exclusionReason;
                if (i1 >= iArr.length) {
                    break;
                }
                SameSiteCookieExclusionReason.validate(iArr[i1]);
                i1++;
            }
            result.warningReason = decoder0.readInts(24, 0, -1);
            int i12 = 0;
            while (true) {
                int[] iArr2 = result.warningReason;
                if (i12 < iArr2.length) {
                    SameSiteCookieWarningReason.validate(iArr2[i12]);
                    i12++;
                } else {
                    int readInt = decoder0.readInt(32);
                    result.operation = readInt;
                    SameSiteCookieOperation.validate(readInt);
                    result.operation = SameSiteCookieOperation.toKnownValue(result.operation);
                    Decoder decoder12 = decoder0.readPointer(40, true);
                    result.siteForCookies = Url.decode(decoder12);
                    Decoder decoder13 = decoder0.readPointer(48, true);
                    result.cookieUrl = Url.decode(decoder13);
                    Decoder decoder14 = decoder0.readPointer(56, true);
                    result.request = AffectedRequest.decode(decoder14);
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
        encoder0.encode((Struct) this.cookie, 8, false);
        encoder0.encode(this.exclusionReason, 16, 0, -1);
        encoder0.encode(this.warningReason, 24, 0, -1);
        encoder0.encode(this.operation, 32);
        encoder0.encode((Struct) this.siteForCookies, 40, true);
        encoder0.encode((Struct) this.cookieUrl, 48, true);
        encoder0.encode((Struct) this.request, 56, true);
    }
}
