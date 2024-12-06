package org.chromium.network.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class SslConfig extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 40;
    private static final DataHeader[] VERSION_ARRAY;
    public boolean cecpq2Enabled;
    public String[] clientCertPoolingPolicy;
    public short[] disabledCipherSuites;
    public boolean revCheckingEnabled;
    public boolean revCheckingRequiredLocalAnchors;
    public boolean sha1LocalAnchorsEnabled;
    public boolean symantecEnforcementDisabled;
    public boolean tripleDesEnabled;
    public int versionMax;
    public int versionMin;
    public int versionMinWarn;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private SslConfig(int version) {
        super(40, version);
        this.revCheckingEnabled = false;
        this.revCheckingRequiredLocalAnchors = false;
        this.sha1LocalAnchorsEnabled = false;
        this.symantecEnforcementDisabled = false;
        this.versionMin = 0;
        this.versionMinWarn = 2;
        this.versionMax = 3;
        this.cecpq2Enabled = true;
        this.tripleDesEnabled = true;
    }

    public SslConfig() {
        this(0);
    }

    public static SslConfig deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static SslConfig deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static SslConfig decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            SslConfig result = new SslConfig(elementsOrVersion);
            result.revCheckingEnabled = decoder0.readBoolean(8, 0);
            result.revCheckingRequiredLocalAnchors = decoder0.readBoolean(8, 1);
            result.sha1LocalAnchorsEnabled = decoder0.readBoolean(8, 2);
            result.symantecEnforcementDisabled = decoder0.readBoolean(8, 3);
            result.cecpq2Enabled = decoder0.readBoolean(8, 4);
            result.tripleDesEnabled = decoder0.readBoolean(8, 5);
            int readInt = decoder0.readInt(12);
            result.versionMin = readInt;
            SslVersion.validate(readInt);
            result.versionMin = SslVersion.toKnownValue(result.versionMin);
            int readInt2 = decoder0.readInt(16);
            result.versionMinWarn = readInt2;
            SslVersion.validate(readInt2);
            result.versionMinWarn = SslVersion.toKnownValue(result.versionMinWarn);
            int readInt3 = decoder0.readInt(20);
            result.versionMax = readInt3;
            SslVersion.validate(readInt3);
            result.versionMax = SslVersion.toKnownValue(result.versionMax);
            result.disabledCipherSuites = decoder0.readShorts(24, 0, -1);
            Decoder decoder1 = decoder0.readPointer(32, false);
            DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
            result.clientCertPoolingPolicy = new String[si1.elementsOrVersion];
            for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                result.clientCertPoolingPolicy[i1] = decoder1.readString((i1 * 8) + 8, false);
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
        encoder0.encode(this.revCheckingEnabled, 8, 0);
        encoder0.encode(this.revCheckingRequiredLocalAnchors, 8, 1);
        encoder0.encode(this.sha1LocalAnchorsEnabled, 8, 2);
        encoder0.encode(this.symantecEnforcementDisabled, 8, 3);
        encoder0.encode(this.cecpq2Enabled, 8, 4);
        encoder0.encode(this.tripleDesEnabled, 8, 5);
        encoder0.encode(this.versionMin, 12);
        encoder0.encode(this.versionMinWarn, 16);
        encoder0.encode(this.versionMax, 20);
        encoder0.encode(this.disabledCipherSuites, 24, 0, -1);
        String[] strArr = this.clientCertPoolingPolicy;
        if (strArr == null) {
            encoder0.encodeNullPointer(32, false);
            return;
        }
        Encoder encoder1 = encoder0.encodePointerArray(strArr.length, 32, -1);
        int i0 = 0;
        while (true) {
            String[] strArr2 = this.clientCertPoolingPolicy;
            if (i0 < strArr2.length) {
                encoder1.encode(strArr2[i0], (i0 * 8) + 8, false);
                i0++;
            } else {
                return;
            }
        }
    }
}
