package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo_base.mojom.UnguessableToken;
/* loaded from: classes2.dex */
public final class InspectorIssueDetails extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 80;
    private static final DataHeader[] VERSION_ARRAY;
    public BlockedByResponseIssueDetails blockedByResponseIssueDetails;
    public ContentSecurityPolicyIssueDetails cspIssueDetails;
    public HeavyAdIssueDetails heavyAdIssueDetails;
    public UnguessableToken issueId;
    public LowTextContrastIssue lowTextContrastDetails;
    public MixedContentIssueDetails mixedContentIssueDetails;
    public SharedArrayBufferIssueDetails sabIssueDetails;
    public SameSiteCookieIssueDetails samesiteCookieIssueDetails;
    public TrustedWebActivityIssueDetails twaIssueDetails;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(80, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private InspectorIssueDetails(int version) {
        super(80, version);
    }

    public InspectorIssueDetails() {
        this(0);
    }

    public static InspectorIssueDetails deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static InspectorIssueDetails deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static InspectorIssueDetails decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            InspectorIssueDetails result = new InspectorIssueDetails(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, true);
            result.samesiteCookieIssueDetails = SameSiteCookieIssueDetails.decode(decoder1);
            Decoder decoder12 = decoder0.readPointer(16, true);
            result.mixedContentIssueDetails = MixedContentIssueDetails.decode(decoder12);
            Decoder decoder13 = decoder0.readPointer(24, true);
            result.blockedByResponseIssueDetails = BlockedByResponseIssueDetails.decode(decoder13);
            Decoder decoder14 = decoder0.readPointer(32, true);
            result.cspIssueDetails = ContentSecurityPolicyIssueDetails.decode(decoder14);
            Decoder decoder15 = decoder0.readPointer(40, true);
            result.sabIssueDetails = SharedArrayBufferIssueDetails.decode(decoder15);
            Decoder decoder16 = decoder0.readPointer(48, true);
            result.twaIssueDetails = TrustedWebActivityIssueDetails.decode(decoder16);
            Decoder decoder17 = decoder0.readPointer(56, true);
            result.heavyAdIssueDetails = HeavyAdIssueDetails.decode(decoder17);
            Decoder decoder18 = decoder0.readPointer(64, true);
            result.lowTextContrastDetails = LowTextContrastIssue.decode(decoder18);
            Decoder decoder19 = decoder0.readPointer(72, true);
            result.issueId = UnguessableToken.decode(decoder19);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode((Struct) this.samesiteCookieIssueDetails, 8, true);
        encoder0.encode((Struct) this.mixedContentIssueDetails, 16, true);
        encoder0.encode((Struct) this.blockedByResponseIssueDetails, 24, true);
        encoder0.encode((Struct) this.cspIssueDetails, 32, true);
        encoder0.encode((Struct) this.sabIssueDetails, 40, true);
        encoder0.encode((Struct) this.twaIssueDetails, 48, true);
        encoder0.encode((Struct) this.heavyAdIssueDetails, 56, true);
        encoder0.encode((Struct) this.lowTextContrastDetails, 64, true);
        encoder0.encode((Struct) this.issueId, 72, true);
    }
}
