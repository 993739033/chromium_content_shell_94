package org.chromium.media.mojom;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.chromium.mojo.bindings.DataHeader;
import org.chromium.mojo.bindings.Decoder;
import org.chromium.mojo.bindings.Encoder;
import org.chromium.mojo.bindings.Message;
import org.chromium.mojo.bindings.Struct;
/* loaded from: classes2.dex */
public final class PlaybackProperties extends Struct {
    private static final DataHeader DEFAULT_STRUCT_INFO;
    private static final int STRUCT_SIZE = 16;
    private static final DataHeader[] VERSION_ARRAY;
    public boolean hasAudio;
    public boolean hasVideo;
    public boolean isBackground;
    public boolean isEmbeddedMediaExperience;
    public boolean isEme;
    public boolean isMse;
    public boolean isMuted;
    public int mediaStreamType;

    static {
        DataHeader[] dataHeaderArr = {new DataHeader(16, 0)};
        VERSION_ARRAY = dataHeaderArr;
        DEFAULT_STRUCT_INFO = dataHeaderArr[0];
    }

    private PlaybackProperties(int version) {
        super(16, version);
    }

    public PlaybackProperties() {
        this(0);
    }

    public static PlaybackProperties deserialize(Message message) {
        return decode(new Decoder(message));
    }

    public static PlaybackProperties deserialize(ByteBuffer data) {
        return deserialize(new Message(data, new ArrayList()));
    }

    public static PlaybackProperties decode(Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        try {
            DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            int elementsOrVersion = mainDataHeader.elementsOrVersion;
            PlaybackProperties result = new PlaybackProperties(elementsOrVersion);
            result.hasAudio = decoder0.readBoolean(8, 0);
            result.hasVideo = decoder0.readBoolean(8, 1);
            result.isBackground = decoder0.readBoolean(8, 2);
            result.isMuted = decoder0.readBoolean(8, 3);
            result.isMse = decoder0.readBoolean(8, 4);
            result.isEme = decoder0.readBoolean(8, 5);
            result.isEmbeddedMediaExperience = decoder0.readBoolean(8, 6);
            int readInt = decoder0.readInt(12);
            result.mediaStreamType = readInt;
            MediaStreamType.validate(readInt);
            result.mediaStreamType = MediaStreamType.toKnownValue(result.mediaStreamType);
            return result;
        } finally {
            decoder0.decreaseStackDepth();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.chromium.mojo.bindings.Struct
    public final void encode(Encoder encoder) {
        Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        encoder0.encode(this.hasAudio, 8, 0);
        encoder0.encode(this.hasVideo, 8, 1);
        encoder0.encode(this.isBackground, 8, 2);
        encoder0.encode(this.isMuted, 8, 3);
        encoder0.encode(this.isMse, 8, 4);
        encoder0.encode(this.isEme, 8, 5);
        encoder0.encode(this.isEmbeddedMediaExperience, 8, 6);
        encoder0.encode(this.mediaStreamType, 12);
    }
}
