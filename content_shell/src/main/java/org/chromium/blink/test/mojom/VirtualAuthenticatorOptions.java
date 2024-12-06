package org.chromium.blink.test.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.blink.mojom.AuthenticatorAttachment;
import org.chromium.blink.mojom.AuthenticatorTransport;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class VirtualAuthenticatorOptions extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 32;
    private static final DataHeader[] VERSION_ARRAY;
    public int attachment;
    public int ctap2Version;
    public boolean hasCredBlob;
    public boolean hasLargeBlob;
    public boolean hasResidentKey;
    public boolean hasUserVerification;
    public boolean isUserPresent;
    public int protocol;
    public int transport;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private VirtualAuthenticatorOptions(int version) {
        super(32, version);
        this.isUserPresent = true;
    }

    public VirtualAuthenticatorOptions() {
        this(0);
    }

    public static VirtualAuthenticatorOptions deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static VirtualAuthenticatorOptions deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static VirtualAuthenticatorOptions decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            VirtualAuthenticatorOptions result = new VirtualAuthenticatorOptions(elementsOrVersion);
            int readInt = decoder0.readInt(8);
            result.protocol = readInt;
            ClientToAuthenticatorProtocol.validate(readInt);
            result.protocol = ClientToAuthenticatorProtocol.toKnownValue(result.protocol);
            int readInt2 = decoder0.readInt(12);
            result.ctap2Version = readInt2;
            Ctap2Version.validate(readInt2);
            result.ctap2Version = Ctap2Version.toKnownValue(result.ctap2Version);
            int readInt3 = decoder0.readInt(16);
            result.transport = readInt3;
            AuthenticatorTransport.validate(readInt3);
            result.transport = AuthenticatorTransport.toKnownValue(result.transport);
            int readInt4 = decoder0.readInt(20);
            result.attachment = readInt4;
            AuthenticatorAttachment.validate(readInt4);
            result.attachment = AuthenticatorAttachment.toKnownValue(result.attachment);
            result.hasResidentKey = decoder0.readBoolean(24, 0);
            result.hasUserVerification = decoder0.readBoolean(24, 1);
            result.isUserPresent = decoder0.readBoolean(24, 2);
            result.hasLargeBlob = decoder0.readBoolean(24, 3);
            result.hasCredBlob = decoder0.readBoolean(24, 4);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.protocol, 8);
        encoder0.encode(this.ctap2Version, 12);
        encoder0.encode(this.transport, 16);
        encoder0.encode(this.attachment, 20);
        encoder0.encode(this.hasResidentKey, 24, 0);
        encoder0.encode(this.hasUserVerification, 24, 1);
        encoder0.encode(this.isUserPresent, 24, 2);
        encoder0.encode(this.hasLargeBlob, 24, 3);
        encoder0.encode(this.hasCredBlob, 24, 4);
    }
}
