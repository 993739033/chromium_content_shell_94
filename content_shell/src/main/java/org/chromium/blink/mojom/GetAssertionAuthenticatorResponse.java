package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class GetAssertionAuthenticatorResponse extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 72;
    private static final DataHeader[] VERSION_ARRAY;
    public boolean appidExtension;
    public boolean echoAppidExtension;
    public boolean echoGetCredBlob;
    public boolean echoLargeBlob;
    public boolean echoLargeBlobWritten;
    public boolean echoPrf;
    public boolean echoUserVerificationMethods;
    public byte[] getCredBlob;
    public CommonCredentialInfo info;
    public byte[] largeBlob;
    public boolean largeBlobWritten;
    public boolean prfNotEvaluated;
    public PrfValues prfResults;
    public byte[] signature;
    public byte[] userHandle;
    public UvmEntry[] userVerificationMethods;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(72, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private GetAssertionAuthenticatorResponse(int version) {
        super(72, version);
    }

    public GetAssertionAuthenticatorResponse() {
        this(0);
    }

    public static GetAssertionAuthenticatorResponse deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static GetAssertionAuthenticatorResponse deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static GetAssertionAuthenticatorResponse decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            GetAssertionAuthenticatorResponse result = new GetAssertionAuthenticatorResponse(elementsOrVersion);
            result.info = CommonCredentialInfo.decode(decoder0.readPointer(8, false));
            result.signature = decoder0.readBytes(16, 0, -1);
            result.userHandle = decoder0.readBytes(24, 1, -1);
            result.echoAppidExtension = decoder0.readBoolean(32, 0);
            result.appidExtension = decoder0.readBoolean(32, 1);
            result.echoUserVerificationMethods = decoder0.readBoolean(32, 2);
            result.echoPrf = decoder0.readBoolean(32, 3);
            result.prfNotEvaluated = decoder0.readBoolean(32, 4);
            result.echoLargeBlob = decoder0.readBoolean(32, 5);
            result.echoLargeBlobWritten = decoder0.readBoolean(32, 6);
            result.largeBlobWritten = decoder0.readBoolean(32, 7);
            result.echoGetCredBlob = decoder0.readBoolean(33, 0);
            Decoder decoder1 = decoder0.readPointer(40, true);
            if (decoder1 == null) {
                result.userVerificationMethods = null;
            } else {
                DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
                result.userVerificationMethods = new UvmEntry[si1.elementsOrVersion];
                for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                    Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                    result.userVerificationMethods[i1] = UvmEntry.decode(decoder2);
                }
            }
            result.prfResults = PrfValues.decode(decoder0.readPointer(48, true));
            result.largeBlob = decoder0.readBytes(56, 1, -1);
            result.getCredBlob = decoder0.readBytes(64, 1, -1);
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
        encoder0.encode(this.signature, 16, 0, -1);
        encoder0.encode(this.userHandle, 24, 1, -1);
        encoder0.encode(this.echoAppidExtension, 32, 0);
        encoder0.encode(this.appidExtension, 32, 1);
        encoder0.encode(this.echoUserVerificationMethods, 32, 2);
        encoder0.encode(this.echoPrf, 32, 3);
        encoder0.encode(this.prfNotEvaluated, 32, 4);
        encoder0.encode(this.echoLargeBlob, 32, 5);
        encoder0.encode(this.echoLargeBlobWritten, 32, 6);
        encoder0.encode(this.largeBlobWritten, 32, 7);
        encoder0.encode(this.echoGetCredBlob, 33, 0);
        UvmEntry[] uvmEntryArr = this.userVerificationMethods;
        if (uvmEntryArr == null) {
            encoder0.encodeNullPointer(40, true);
        } else {
            Encoder encoder1 = encoder0.encodePointerArray(uvmEntryArr.length, 40, -1);
            int i0 = 0;
            while (true) {
                UvmEntry[] uvmEntryArr2 = this.userVerificationMethods;
                if (i0 >= uvmEntryArr2.length) {
                    break;
                }
                encoder1.encode((Struct) uvmEntryArr2[i0], (i0 * 8) + 8, false);
                i0++;
            }
        }
        encoder0.encode((Struct) this.prfResults, 48, true);
        encoder0.encode(this.largeBlob, 56, 1, -1);
        encoder0.encode(this.getCredBlob, 64, 1, -1);
    }
}
