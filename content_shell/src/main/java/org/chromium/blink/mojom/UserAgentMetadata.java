package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class UserAgentMetadata extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 72;
    private static final DataHeader[] VERSION_ARRAY;
    public String architecture;
    public String bitness;
    public UserAgentBrandVersion[] brandVersionList;
    public String fullVersion;
    public boolean mobile;
    public String model;
    public String platform;
    public String platformVersion;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(72, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private UserAgentMetadata(int version) {
        super(72, version);
    }

    public UserAgentMetadata() {
        this(0);
    }

    public static UserAgentMetadata deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static UserAgentMetadata deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static UserAgentMetadata decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            UserAgentMetadata result = new UserAgentMetadata(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, false);
            DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
            result.brandVersionList = new UserAgentBrandVersion[si1.elementsOrVersion];
            for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                result.brandVersionList[i1] = UserAgentBrandVersion.decode(decoder2);
            }
            result.fullVersion = decoder0.readString(16, false);
            result.platform = decoder0.readString(24, false);
            result.platformVersion = decoder0.readString(32, false);
            result.architecture = decoder0.readString(40, false);
            result.model = decoder0.readString(48, false);
            result.mobile = decoder0.readBoolean(56, 0);
            result.bitness = decoder0.readString(64, false);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        UserAgentBrandVersion[] userAgentBrandVersionArr = this.brandVersionList;
        if (userAgentBrandVersionArr == null) {
            encoder0.encodeNullPointer(8, false);
        } else {
            Encoder encoder1 = encoder0.encodePointerArray(userAgentBrandVersionArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                UserAgentBrandVersion[] userAgentBrandVersionArr2 = this.brandVersionList;
                if (i0 >= userAgentBrandVersionArr2.length) {
                    break;
                }
                encoder1.encode((Struct) userAgentBrandVersionArr2[i0], (i0 * 8) + 8, false);
                i0++;
            }
        }
        encoder0.encode(this.fullVersion, 16, false);
        encoder0.encode(this.platform, 24, false);
        encoder0.encode(this.platformVersion, 32, false);
        encoder0.encode(this.architecture, 40, false);
        encoder0.encode(this.model, 48, false);
        encoder0.encode(this.mobile, 56, 0);
        encoder0.encode(this.bitness, 64, false);
    }
}
