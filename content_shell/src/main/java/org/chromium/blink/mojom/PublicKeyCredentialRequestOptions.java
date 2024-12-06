package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo_base.mojom.TimeDelta;
/* loaded from: classes2.dex */
public final class PublicKeyCredentialRequestOptions extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 80;
    private static final DataHeader[] VERSION_ARRAY;
    public PublicKeyCredentialDescriptor[] allowCredentials;
    public String appid;
    public CableAuthentication[] cableAuthenticationData;
    public byte[] challenge;
    public boolean getCredBlob;
    public boolean isConditional;
    public boolean largeBlobRead;
    public byte[] largeBlobWrite;
    public boolean prf;
    public PrfValues[] prfInputs;
    public String relyingPartyId;
    public TimeDelta timeout;
    public int userVerification;
    public boolean userVerificationMethods;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(80, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private PublicKeyCredentialRequestOptions(int version) {
        super(80, version);
    }

    public PublicKeyCredentialRequestOptions() {
        this(0);
    }

    public static PublicKeyCredentialRequestOptions deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static PublicKeyCredentialRequestOptions deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static PublicKeyCredentialRequestOptions decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            PublicKeyCredentialRequestOptions result = new PublicKeyCredentialRequestOptions(elementsOrVersion);
            result.isConditional = decoder0.readBoolean(8, 0);
            result.userVerificationMethods = decoder0.readBoolean(8, 1);
            result.prf = decoder0.readBoolean(8, 2);
            result.largeBlobRead = decoder0.readBoolean(8, 3);
            result.getCredBlob = decoder0.readBoolean(8, 4);
            int readInt = decoder0.readInt(12);
            result.userVerification = readInt;
            UserVerificationRequirement.validate(readInt);
            result.userVerification = UserVerificationRequirement.toKnownValue(result.userVerification);
            result.challenge = decoder0.readBytes(16, 0, -1);
            result.timeout = TimeDelta.decode(decoder0.readPointer(24, true));
            result.relyingPartyId = decoder0.readString(32, false);
            Decoder decoder1 = decoder0.readPointer(40, false);
            DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
            result.allowCredentials = new PublicKeyCredentialDescriptor[si1.elementsOrVersion];
            for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                result.allowCredentials[i1] = PublicKeyCredentialDescriptor.decode(decoder2);
            }
            result.appid = decoder0.readString(48, true);
            Decoder decoder12 = decoder0.readPointer(56, false);
            DataHeader si12 = decoder12.readDataHeaderForPointerArray(-1);
            result.cableAuthenticationData = new CableAuthentication[si12.elementsOrVersion];
            for (int i12 = 0; i12 < si12.elementsOrVersion; i12++) {
                Decoder decoder22 = decoder12.readPointer((i12 * 8) + 8, false);
                result.cableAuthenticationData[i12] = CableAuthentication.decode(decoder22);
            }
            Decoder decoder13 = decoder0.readPointer(64, false);
            DataHeader si13 = decoder13.readDataHeaderForPointerArray(-1);
            result.prfInputs = new PrfValues[si13.elementsOrVersion];
            for (int i13 = 0; i13 < si13.elementsOrVersion; i13++) {
                Decoder decoder23 = decoder13.readPointer((i13 * 8) + 8, false);
                result.prfInputs[i13] = PrfValues.decode(decoder23);
            }
            result.largeBlobWrite = decoder0.readBytes(72, 1, -1);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.isConditional, 8, 0);
        encoder0.encode(this.userVerificationMethods, 8, 1);
        encoder0.encode(this.prf, 8, 2);
        encoder0.encode(this.largeBlobRead, 8, 3);
        encoder0.encode(this.getCredBlob, 8, 4);
        encoder0.encode(this.userVerification, 12);
        encoder0.encode(this.challenge, 16, 0, -1);
        encoder0.encode((Struct) this.timeout, 24, true);
        encoder0.encode(this.relyingPartyId, 32, false);
        PublicKeyCredentialDescriptor[] publicKeyCredentialDescriptorArr = this.allowCredentials;
        if (publicKeyCredentialDescriptorArr == null) {
            encoder0.encodeNullPointer(40, false);
        } else {
            Encoder encoder1 = encoder0.encodePointerArray(publicKeyCredentialDescriptorArr.length, 40, -1);
            int i0 = 0;
            while (true) {
                PublicKeyCredentialDescriptor[] publicKeyCredentialDescriptorArr2 = this.allowCredentials;
                if (i0 >= publicKeyCredentialDescriptorArr2.length) {
                    break;
                }
                encoder1.encode((Struct) publicKeyCredentialDescriptorArr2[i0], (i0 * 8) + 8, false);
                i0++;
            }
        }
        encoder0.encode(this.appid, 48, true);
        CableAuthentication[] cableAuthenticationArr = this.cableAuthenticationData;
        if (cableAuthenticationArr == null) {
            encoder0.encodeNullPointer(56, false);
        } else {
            Encoder encoder12 = encoder0.encodePointerArray(cableAuthenticationArr.length, 56, -1);
            int i02 = 0;
            while (true) {
                CableAuthentication[] cableAuthenticationArr2 = this.cableAuthenticationData;
                if (i02 >= cableAuthenticationArr2.length) {
                    break;
                }
                encoder12.encode((Struct) cableAuthenticationArr2[i02], (i02 * 8) + 8, false);
                i02++;
            }
        }
        PrfValues[] prfValuesArr = this.prfInputs;
        if (prfValuesArr == null) {
            encoder0.encodeNullPointer(64, false);
        } else {
            Encoder encoder13 = encoder0.encodePointerArray(prfValuesArr.length, 64, -1);
            int i03 = 0;
            while (true) {
                PrfValues[] prfValuesArr2 = this.prfInputs;
                if (i03 >= prfValuesArr2.length) {
                    break;
                }
                encoder13.encode((Struct) prfValuesArr2[i03], (i03 * 8) + 8, false);
                i03++;
            }
        }
        encoder0.encode(this.largeBlobWrite, 72, 1, -1);
    }
}
