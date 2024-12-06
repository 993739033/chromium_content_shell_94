package org.chromium.viz.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.gfx.mojom.ColorSpace;
import org.chromium.gfx.mojom.HdrMetadata;
import org.chromium.gfx.mojom.Size;
import org.chromium.gpu.mojom.MailboxHolder;
import org.chromium.gpu.mojom.VulkanYCbCrInfo;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class TransferableResource extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 72;
    private static final DataHeader[] VERSION_ARRAY;
    public ColorSpace colorSpace;
    public int filter;
    public int format;
    public HdrMetadata hdrMetadata;
    public ResourceId id;
    public boolean isBackedBySurfaceTexture;
    public boolean isOverlayCandidate;
    public boolean isSoftware;
    public MailboxHolder mailboxHolder;
    public boolean readLockFencesEnabled;
    public Size size;
    public boolean wantsPromotionHint;
    public VulkanYCbCrInfo ycbcrInfo;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(72, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private TransferableResource(int version) {
        super(72, version);
    }

    public TransferableResource() {
        this(0);
    }

    public static TransferableResource deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static TransferableResource deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static TransferableResource decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            TransferableResource result = new TransferableResource(elementsOrVersion);
            Decoder decoder1 = decoder0.readPointer(8, false);
            result.id = ResourceId.decode(decoder1);
            int readInt = decoder0.readInt(16);
            result.format = readInt;
            ResourceFormat.validate(readInt);
            result.format = ResourceFormat.toKnownValue(result.format);
            result.filter = decoder0.readInt(20);
            Decoder decoder12 = decoder0.readPointer(24, false);
            result.size = Size.decode(decoder12);
            Decoder decoder13 = decoder0.readPointer(32, false);
            result.mailboxHolder = MailboxHolder.decode(decoder13);
            result.readLockFencesEnabled = decoder0.readBoolean(40, 0);
            result.isSoftware = decoder0.readBoolean(40, 1);
            result.isOverlayCandidate = decoder0.readBoolean(40, 2);
            result.isBackedBySurfaceTexture = decoder0.readBoolean(40, 3);
            result.wantsPromotionHint = decoder0.readBoolean(40, 4);
            Decoder decoder14 = decoder0.readPointer(48, false);
            result.colorSpace = ColorSpace.decode(decoder14);
            Decoder decoder15 = decoder0.readPointer(56, true);
            result.hdrMetadata = HdrMetadata.decode(decoder15);
            Decoder decoder16 = decoder0.readPointer(64, true);
            result.ycbcrInfo = VulkanYCbCrInfo.decode(decoder16);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode((Struct) this.id, 8, false);
        encoder0.encode(this.format, 16);
        encoder0.encode(this.filter, 20);
        encoder0.encode((Struct) this.size, 24, false);
        encoder0.encode((Struct) this.mailboxHolder, 32, false);
        encoder0.encode(this.readLockFencesEnabled, 40, 0);
        encoder0.encode(this.isSoftware, 40, 1);
        encoder0.encode(this.isOverlayCandidate, 40, 2);
        encoder0.encode(this.isBackedBySurfaceTexture, 40, 3);
        encoder0.encode(this.wantsPromotionHint, 40, 4);
        encoder0.encode((Struct) this.colorSpace, 48, false);
        encoder0.encode((Struct) this.hdrMetadata, 56, true);
        encoder0.encode((Struct) this.ycbcrInfo, 64, true);
    }
}
