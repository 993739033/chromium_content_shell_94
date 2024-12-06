package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class MakeCredentialAuthenticatorResponse extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 56;
    private static final DataHeader[] VERSION_ARRAY;
    public byte[] attestationObject;
    public boolean credBlob;
    public boolean credPropsRk;
    public boolean echoCredBlob;
    public boolean echoCredProps;
    public boolean echoHmacCreateSecret;
    public boolean echoLargeBlob;
    public boolean echoPrf;
    public boolean echoUserVerificationMethods;
    public boolean hasCredPropsRk;
    public boolean hmacCreateSecret;
    public CommonCredentialInfo info;
    public boolean prf;
    public int publicKeyAlgo;
    public byte[] publicKeyDer;
    public boolean supportsLargeBlob;
    public int[] transports;
    public UvmEntry[] userVerificationMethods;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(56, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private MakeCredentialAuthenticatorResponse(int version) {
        super(56, version);
    }

    public MakeCredentialAuthenticatorResponse() {
        this(0);
    }

    public static MakeCredentialAuthenticatorResponse deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static MakeCredentialAuthenticatorResponse deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static MakeCredentialAuthenticatorResponse decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            MakeCredentialAuthenticatorResponse result = new MakeCredentialAuthenticatorResponse(elementsOrVersion);
            result.info = CommonCredentialInfo.decode(decoder0.readPointer(8, false));
            result.attestationObject = decoder0.readBytes(16, 0, -1);
            result.transports = decoder0.readInts(24, 0, -1);
            int i1 = 0;
            while (true) {
                int[] iArr = result.transports;
                if (i1 >= iArr.length) {
                    break;
                }
                AuthenticatorTransport.validate(iArr[i1]);
                i1++;
            }
            result.echoHmacCreateSecret = decoder0.readBoolean(32, 0);
            result.hmacCreateSecret = decoder0.readBoolean(32, 1);
            result.echoPrf = decoder0.readBoolean(32, 2);
            result.prf = decoder0.readBoolean(32, 3);
            result.echoCredBlob = decoder0.readBoolean(32, 4);
            result.credBlob = decoder0.readBoolean(32, 5);
            result.echoUserVerificationMethods = decoder0.readBoolean(32, 6);
            result.echoCredProps = decoder0.readBoolean(32, 7);
            result.hasCredPropsRk = decoder0.readBoolean(33, 0);
            result.credPropsRk = decoder0.readBoolean(33, 1);
            result.echoLargeBlob = decoder0.readBoolean(33, 2);
            result.supportsLargeBlob = decoder0.readBoolean(33, 3);
            result.publicKeyAlgo = decoder0.readInt(36);
            result.publicKeyDer = decoder0.readBytes(40, 1, -1);
            Decoder decoder1 = decoder0.readPointer(48, true);
            if (decoder1 == null) {
                result.userVerificationMethods = null;
            } else {
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.userVerificationMethods = new UvmEntry[si1.elementsOrVersion];
                for (int i12 = 0; i12 < si1.elementsOrVersion; i12++) {
                    Decoder decoder2 = decoder1.readPointer((i12 * 8) + 8, false);
                    result.userVerificationMethods[i12] = UvmEntry.decode(decoder2);
                }
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
        encoder0.encode((Struct) this.info, 8, false);
        encoder0.encode(this.attestationObject, 16, 0, -1);
        encoder0.encode(this.transports, 24, 0, -1);
        encoder0.encode(this.echoHmacCreateSecret, 32, 0);
        encoder0.encode(this.hmacCreateSecret, 32, 1);
        encoder0.encode(this.echoPrf, 32, 2);
        encoder0.encode(this.prf, 32, 3);
        encoder0.encode(this.echoCredBlob, 32, 4);
        encoder0.encode(this.credBlob, 32, 5);
        encoder0.encode(this.echoUserVerificationMethods, 32, 6);
        encoder0.encode(this.echoCredProps, 32, 7);
        encoder0.encode(this.hasCredPropsRk, 33, 0);
        encoder0.encode(this.credPropsRk, 33, 1);
        encoder0.encode(this.echoLargeBlob, 33, 2);
        encoder0.encode(this.supportsLargeBlob, 33, 3);
        encoder0.encode(this.publicKeyAlgo, 36);
        encoder0.encode(this.publicKeyDer, 40, 1, -1);
        UvmEntry[] uvmEntryArr = this.userVerificationMethods;
        if (uvmEntryArr == null) {
            encoder0.encodeNullPointer(48, true);
            return;
        }
        Encoder encoder1 = encoder0.encodePointerArray(uvmEntryArr.length, 48, -1);
        int i0 = 0;
        while (true) {
            UvmEntry[] uvmEntryArr2 = this.userVerificationMethods;
            if (i0 < uvmEntryArr2.length) {
                encoder1.encode((Struct) uvmEntryArr2[i0], (i0 * 8) + 8, false);
                i0++;
            } else {
                return;
            }
        }
    }
}
