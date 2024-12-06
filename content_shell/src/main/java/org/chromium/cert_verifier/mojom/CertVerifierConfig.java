package org.chromium.cert_verifier.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo.bindings.Union;
import org.chromium.mojo_base.mojom.BigBuffer;
import org.chromium.network.mojom.X509Certificate;
/* loaded from: classes2.dex */
public final class CertVerifierConfig extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 48;
    private static final DataHeader[] VERSION_ARRAY;
    public X509Certificate[] additionalTrustAnchors;
    public X509Certificate[] additionalUntrustedAuthorities;
    public BigBuffer crlSet;
    public boolean disableSymantecEnforcement;
    public boolean enableRevChecking;
    public boolean enableSha1LocalAnchors;
    public boolean requireRevCheckingLocalAnchors;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(48, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private CertVerifierConfig(int version) {
        super(48, version);
    }

    public CertVerifierConfig() {
        this(0);
    }

    public static CertVerifierConfig deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static CertVerifierConfig deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static CertVerifierConfig decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            CertVerifierConfig result = new CertVerifierConfig(elementsOrVersion);
            result.enableRevChecking = decoder0.readBoolean(8, 0);
            result.requireRevCheckingLocalAnchors = decoder0.readBoolean(8, 1);
            result.enableSha1LocalAnchors = decoder0.readBoolean(8, 2);
            result.disableSymantecEnforcement = decoder0.readBoolean(8, 3);
            result.crlSet = BigBuffer.decode(decoder0, 16);
            Decoder decoder1 = decoder0.readPointer(32, false);
            DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
            result.additionalTrustAnchors = new X509Certificate[si1.elementsOrVersion];
            for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                result.additionalTrustAnchors[i1] = X509Certificate.decode(decoder2);
            }
            Decoder decoder12 = decoder0.readPointer(40, false);
            DataHeader si12 = decoder12.readDataHeaderForPointerArray(-1);
            result.additionalUntrustedAuthorities = new X509Certificate[si12.elementsOrVersion];
            for (int i12 = 0; i12 < si12.elementsOrVersion; i12++) {
                Decoder decoder22 = decoder12.readPointer((i12 * 8) + 8, false);
                result.additionalUntrustedAuthorities[i12] = X509Certificate.decode(decoder22);
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
        encoder0.encode(this.enableRevChecking, 8, 0);
        encoder0.encode(this.requireRevCheckingLocalAnchors, 8, 1);
        encoder0.encode(this.enableSha1LocalAnchors, 8, 2);
        encoder0.encode(this.disableSymantecEnforcement, 8, 3);
        encoder0.encode((Union) this.crlSet, 16, false);
        X509Certificate[] x509CertificateArr = this.additionalTrustAnchors;
        if (x509CertificateArr == null) {
            encoder0.encodeNullPointer(32, false);
        } else {
            Encoder encoder1 = encoder0.encodePointerArray(x509CertificateArr.length, 32, -1);
            int i0 = 0;
            while (true) {
                X509Certificate[] x509CertificateArr2 = this.additionalTrustAnchors;
                if (i0 >= x509CertificateArr2.length) {
                    break;
                }
                encoder1.encode((Struct) x509CertificateArr2[i0], (i0 * 8) + 8, false);
                i0++;
            }
        }
        X509Certificate[] x509CertificateArr3 = this.additionalUntrustedAuthorities;
        if (x509CertificateArr3 == null) {
            encoder0.encodeNullPointer(40, false);
            return;
        }
        Encoder encoder12 = encoder0.encodePointerArray(x509CertificateArr3.length, 40, -1);
        int i02 = 0;
        while (true) {
            X509Certificate[] x509CertificateArr4 = this.additionalUntrustedAuthorities;
            if (i02 < x509CertificateArr4.length) {
                encoder12.encode((Struct) x509CertificateArr4[i02], (i02 * 8) + 8, false);
                i02++;
            } else {
                return;
            }
        }
    }
}
