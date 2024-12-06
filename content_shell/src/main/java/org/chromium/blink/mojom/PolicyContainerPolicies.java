package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.network.mojom.ContentSecurityPolicy;
import org.chromium.network.mojom.IpAddressSpace;
import org.chromium.network.mojom.ReferrerPolicy;
/* loaded from: classes2.dex */
public final class PolicyContainerPolicies extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 24;
    private static final DataHeader[] VERSION_ARRAY;
    public ContentSecurityPolicy[] contentSecurityPolicies;
    public int ipAddressSpace;
    public int referrerPolicy;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(24, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private PolicyContainerPolicies(int version) {
        super(24, version);
        this.referrerPolicy = 1;
        this.ipAddressSpace = 3;
    }

    public PolicyContainerPolicies() {
        this(0);
    }

    public static PolicyContainerPolicies deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static PolicyContainerPolicies deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static PolicyContainerPolicies decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            PolicyContainerPolicies result = new PolicyContainerPolicies(elementsOrVersion);
            int readInt = decoder0.readInt(8);
            result.referrerPolicy = readInt;
            ReferrerPolicy.validate(readInt);
            result.referrerPolicy = ReferrerPolicy.toKnownValue(result.referrerPolicy);
            int readInt2 = decoder0.readInt(12);
            result.ipAddressSpace = readInt2;
            IpAddressSpace.validate(readInt2);
            result.ipAddressSpace = IpAddressSpace.toKnownValue(result.ipAddressSpace);
            Decoder decoder1 = decoder0.readPointer(16, false);
            DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
            result.contentSecurityPolicies = new ContentSecurityPolicy[si1.elementsOrVersion];
            for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                result.contentSecurityPolicies[i1] = ContentSecurityPolicy.decode(decoder2);
            }
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.referrerPolicy, 8);
        encoder0.encode(this.ipAddressSpace, 12);
        ContentSecurityPolicy[] contentSecurityPolicyArr = this.contentSecurityPolicies;
        if (contentSecurityPolicyArr == null) {
            encoder0.encodeNullPointer(16, false);
            return;
        }
        Encoder encoder1 = encoder0.encodePointerArray(contentSecurityPolicyArr.length, 16, -1);
        int i0 = 0;
        while (true) {
            ContentSecurityPolicy[] contentSecurityPolicyArr2 = this.contentSecurityPolicies;
            if (i0 < contentSecurityPolicyArr2.length) {
                encoder1.encode((Struct) contentSecurityPolicyArr2[i0], (i0 * 8) + 8, false);
                i0++;
            } else {
                return;
            }
        }
    }
}
