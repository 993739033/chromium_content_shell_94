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
public final class TrustedWebActivityIssueDetails extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 40;
    private static final DataHeader[] VERSION_ARRAY;
    public int httpErrorCode;
    public String packageName;
    public String signature;
    public Url url;
    public int violationType;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private TrustedWebActivityIssueDetails(int version) {
        super(40, version);
        this.httpErrorCode = 0;
    }

    public TrustedWebActivityIssueDetails() {
        this(0);
    }

    public static TrustedWebActivityIssueDetails deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static TrustedWebActivityIssueDetails deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static TrustedWebActivityIssueDetails decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            TrustedWebActivityIssueDetails result = new TrustedWebActivityIssueDetails(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, false);
            result.url = Url.decode(decoder1);
            int readInt = decoder0.readInt(16);
            result.violationType = readInt;
            TwaQualityEnforcementViolationType.validate(readInt);
            result.violationType = TwaQualityEnforcementViolationType.toKnownValue(result.violationType);
            result.httpErrorCode = decoder0.readInt(20);
            result.packageName = decoder0.readString(24, true);
            result.signature = decoder0.readString(32, true);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode((Struct) this.url, 8, false);
        encoder0.encode(this.violationType, 16);
        encoder0.encode(this.httpErrorCode, 20);
        encoder0.encode(this.packageName, 24, true);
        encoder0.encode(this.signature, 32, true);
    }
}
