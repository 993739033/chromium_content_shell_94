package org.chromium.blink.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
import org.chromium.url.mojom.Url;
/* loaded from: classes2.dex */
public final class SpeculationCandidate extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 32;
    private static final DataHeader[] VERSION_ARRAY;
    public int action;
    public Referrer referrer;
    public boolean requiresAnonymousClientIpWhenCrossOrigin;
    public Url url;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private SpeculationCandidate(int version) {
        super(32, version);
        this.action = 0;
        this.requiresAnonymousClientIpWhenCrossOrigin = false;
    }

    public SpeculationCandidate() {
        this(0);
    }

    public static SpeculationCandidate deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static SpeculationCandidate deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static SpeculationCandidate decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            SpeculationCandidate result = new SpeculationCandidate(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, false);
            result.url = Url.decode(decoder1);
            int readInt = decoder0.readInt(16);
            result.action = readInt;
            SpeculationAction.validate(readInt);
            result.action = SpeculationAction.toKnownValue(result.action);
            result.requiresAnonymousClientIpWhenCrossOrigin = decoder0.readBoolean(20, 0);
            Decoder decoder12 = decoder0.readPointer(24, false);
            result.referrer = Referrer.decode(decoder12);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode((Struct) this.url, 8, false);
        encoder0.encode(this.action, 16);
        encoder0.encode(this.requiresAnonymousClientIpWhenCrossOrigin, 20, 0);
        encoder0.encode((Struct) this.referrer, 24, false);
    }
}
