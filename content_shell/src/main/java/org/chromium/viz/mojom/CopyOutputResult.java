package org.chromium.viz.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.gfx.mojom.ColorSpace;
import org.chromium.gfx.mojom.Rect;
import org.chromium.gpu.mojom.Mailbox;
import org.chromium.gpu.mojom.SyncToken;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class CopyOutputResult extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 64;
    private static final DataHeader[] VERSION_ARRAY;
    public BitmapInSharedMemory bitmap;
    public ColorSpace colorSpace;
    public int destination;
    public int format;
    public Mailbox mailbox;
    public Rect rect;
    public TextureReleaser releaser;
    public SyncToken syncToken;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(64, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private CopyOutputResult(int version) {
        super(64, version);
    }

    public CopyOutputResult() {
        this(0);
    }

    public static CopyOutputResult deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static CopyOutputResult deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static CopyOutputResult decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            CopyOutputResult result = new CopyOutputResult(elementsOrVersion);
            int readInt = decoder0.readInt(8);
            result.format = readInt;
            CopyOutputResultFormat.validate(readInt);
            result.format = CopyOutputResultFormat.toKnownValue(result.format);
            int readInt2 = decoder0.readInt(12);
            result.destination = readInt2;
            CopyOutputResultDestination.validate(readInt2);
            result.destination = CopyOutputResultDestination.toKnownValue(result.destination);
            Decoder decoder1 = decoder0.readPointer(16, false);
            result.rect = Rect.decode(decoder1);
            Decoder decoder12 = decoder0.readPointer(24, true);
            result.bitmap = BitmapInSharedMemory.decode(decoder12);
            Decoder decoder13 = decoder0.readPointer(32, true);
            result.mailbox = Mailbox.decode(decoder13);
            Decoder decoder14 = decoder0.readPointer(40, true);
            result.syncToken = SyncToken.decode(decoder14);
            Decoder decoder15 = decoder0.readPointer(48, true);
            result.colorSpace = ColorSpace.decode(decoder15);
            result.releaser = (TextureReleaser) decoder0.readServiceInterface(56, true, TextureReleaser.MANAGER);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.format, 8);
        encoder0.encode(this.destination, 12);
        encoder0.encode((Struct) this.rect, 16, false);
        encoder0.encode((Struct) this.bitmap, 24, true);
        encoder0.encode((Struct) this.mailbox, 32, true);
        encoder0.encode((Struct) this.syncToken, 40, true);
        encoder0.encode((Struct) this.colorSpace, 48, true);
        encoder0.encode(this.releaser, 56, true,  TextureReleaser.MANAGER);
    }
}
