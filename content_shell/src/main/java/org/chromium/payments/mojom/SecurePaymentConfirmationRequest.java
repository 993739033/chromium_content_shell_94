package org.chromium.payments.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.mojo_base.mojom.TimeDelta;
/* loaded from: classes2.dex */
public final class SecurePaymentConfirmationRequest extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 40;
    private static final DataHeader[] VERSION_ARRAY;
    public byte[] challenge;
    public byte[][] credentialIds;
    public PaymentCredentialInstrument instrument;
    public TimeDelta timeout;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(40, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private SecurePaymentConfirmationRequest(int version) {
        super(40, version);
    }

    public SecurePaymentConfirmationRequest() {
        this(0);
    }

    public static SecurePaymentConfirmationRequest deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static SecurePaymentConfirmationRequest deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static SecurePaymentConfirmationRequest decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            SecurePaymentConfirmationRequest result = new SecurePaymentConfirmationRequest(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, false);
            DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
            result.credentialIds = new byte[si1.elementsOrVersion][];
            for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                result.credentialIds[i1] = decoder1.readBytes((i1 * 8) + 8, 0, -1);
            }
            result.challenge = decoder0.readBytes(16, 0, -1);
            result.instrument = PaymentCredentialInstrument.decode(decoder0.readPointer(24, false));
            result.timeout = TimeDelta.decode(decoder0.readPointer(32, true));
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        byte[][] bArr = this.credentialIds;
        if (bArr == null) {
            encoder0.encodeNullPointer(8, false);
        } else {
            Encoder encoder1 = encoder0.encodePointerArray(bArr.length, 8, -1);
            int i0 = 0;
            while (true) {
                byte[][] bArr2 = this.credentialIds;
                if (i0 >= bArr2.length) {
                    break;
                }
                encoder1.encode(bArr2[i0], (i0 * 8) + 8, 0, -1);
                i0++;
            }
        }
        encoder0.encode(this.challenge, 16, 0, -1);
        encoder0.encode((Struct) this.instrument, 24, false);
        encoder0.encode((Struct) this.timeout, 32, true);
    }
}
