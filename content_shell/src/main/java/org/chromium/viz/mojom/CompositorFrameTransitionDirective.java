package org.chromium.viz.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class CompositorFrameTransitionDirective extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 32;
    private static final DataHeader[] VERSION_ARRAY;
    public int effect;
    public int sequenceId;
    public CompositorRenderPassId[] sharedRenderPassIds;
    public int type;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(32, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private CompositorFrameTransitionDirective(int version) {
        super(32, version);
    }

    public CompositorFrameTransitionDirective() {
        this(0);
    }

    public static CompositorFrameTransitionDirective deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static CompositorFrameTransitionDirective deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static CompositorFrameTransitionDirective decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            CompositorFrameTransitionDirective result = new CompositorFrameTransitionDirective(elementsOrVersion);
            result.sequenceId = decoder0.readInt(8);
            int readInt = decoder0.readInt(12);
            result.type = readInt;
            CompositorFrameTransitionDirectiveType.validate(readInt);
            result.type = CompositorFrameTransitionDirectiveType.toKnownValue(result.type);
            int readInt2 = decoder0.readInt(16);
            result.effect = readInt2;
            CompositorFrameTransitionDirectiveEffect.validate(readInt2);
            result.effect = CompositorFrameTransitionDirectiveEffect.toKnownValue(result.effect);
            Decoder decoder1 = decoder0.readPointer(24, false);
            DataHeader si1 = decoder1.readDataHeaderForPointerArray(-1);
            result.sharedRenderPassIds = new CompositorRenderPassId[si1.elementsOrVersion];
            for (int i1 = 0; i1 < si1.elementsOrVersion; i1++) {
                Decoder decoder2 = decoder1.readPointer((i1 * 8) + 8, false);
                result.sharedRenderPassIds[i1] = CompositorRenderPassId.decode(decoder2);
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
        encoder0.encode(this.sequenceId, 8);
        encoder0.encode(this.type, 12);
        encoder0.encode(this.effect, 16);
        CompositorRenderPassId[] compositorRenderPassIdArr = this.sharedRenderPassIds;
        if (compositorRenderPassIdArr == null) {
            encoder0.encodeNullPointer(24, false);
            return;
        }
        Encoder encoder1 = encoder0.encodePointerArray(compositorRenderPassIdArr.length, 24, -1);
        int i0 = 0;
        while (true) {
            CompositorRenderPassId[] compositorRenderPassIdArr2 = this.sharedRenderPassIds;
            if (i0 < compositorRenderPassIdArr2.length) {
                encoder1.encode((Struct) compositorRenderPassIdArr2[i0], (i0 * 8) + 8, false);
                i0++;
            } else {
                return;
            }
        }
    }
}
