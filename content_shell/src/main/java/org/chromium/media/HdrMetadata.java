package org.chromium.media;

import android.media.MediaFormat;
import android.os.Build;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.chromium.base.Log;
import org.chromium.base.annotations.JNINamespace;
import org.chromium.base.annotations.MainDex;
@JNINamespace("media")
@MainDex
/* loaded from: classes2.dex */
class HdrMetadata {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int MAX_CHROMATICITY = 50000;
    private static final String TAG = "HdrMetadata";
    private final Object mLock;
    private long mNativeJniHdrMetadata;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface Natives {
        int colorTransfer(long j, HdrMetadata hdrMetadata);

        float maxColorVolumeLuminance(long j, HdrMetadata hdrMetadata);

        int maxContentLuminance(long j, HdrMetadata hdrMetadata);

        int maxFrameAverageLuminance(long j, HdrMetadata hdrMetadata);

        float minColorVolumeLuminance(long j, HdrMetadata hdrMetadata);

        int primaries(long j, HdrMetadata hdrMetadata);

        float primaryBChromaticityX(long j, HdrMetadata hdrMetadata);

        float primaryBChromaticityY(long j, HdrMetadata hdrMetadata);

        float primaryGChromaticityX(long j, HdrMetadata hdrMetadata);

        float primaryGChromaticityY(long j, HdrMetadata hdrMetadata);

        float primaryRChromaticityX(long j, HdrMetadata hdrMetadata);

        float primaryRChromaticityY(long j, HdrMetadata hdrMetadata);

        int range(long j, HdrMetadata hdrMetadata);

        float whitePointChromaticityX(long j, HdrMetadata hdrMetadata);

        float whitePointChromaticityY(long j, HdrMetadata hdrMetadata);
    }

    private static HdrMetadata create(long nativeRef) {
        return new HdrMetadata(nativeRef);
    }

    HdrMetadata() {
        this.mLock = new Object();
        this.mNativeJniHdrMetadata = 0L;
    }

    private HdrMetadata(long nativeRef) {
        this.mLock = new Object();
        if (nativeRef == 0) {
            throw new AssertionError();
        }
        this.mNativeJniHdrMetadata = nativeRef;
    }

    private void close() {
        synchronized (this.mLock) {
            this.mNativeJniHdrMetadata = 0L;
        }
    }

    public void addMetadataToFormat(MediaFormat format) {
        synchronized (this.mLock) {
            if (this.mNativeJniHdrMetadata == 0) {
                throw new AssertionError();
            }
            if (Build.VERSION.SDK_INT < 24) {
                Log.e(TAG, "HDR not supported before Android N", new Object[0]);
                return;
            }
            int colorStandard = getColorStandard();
            if (colorStandard != -1) {
                format.setInteger("color-standard", colorStandard);
            }
            int colorTransfer = getColorTransfer();
            if (colorTransfer != -1) {
                format.setInteger("color-transfer", colorTransfer);
            }
            int colorRange = getColorRange();
            if (colorRange != -1) {
                format.setInteger("color-range", colorRange);
            }
            ByteBuffer hdrStaticInfo = ByteBuffer.wrap(new byte[25]);
            hdrStaticInfo.order(ByteOrder.LITTLE_ENDIAN);
            hdrStaticInfo.put((byte) 0);
            hdrStaticInfo.putShort((short) ((primaryRChromaticityX() * 50000.0f) + 0.5f));
            hdrStaticInfo.putShort((short) ((primaryRChromaticityY() * 50000.0f) + 0.5f));
            hdrStaticInfo.putShort((short) ((primaryGChromaticityX() * 50000.0f) + 0.5f));
            hdrStaticInfo.putShort((short) ((primaryGChromaticityY() * 50000.0f) + 0.5f));
            hdrStaticInfo.putShort((short) ((primaryBChromaticityX() * 50000.0f) + 0.5f));
            hdrStaticInfo.putShort((short) ((primaryBChromaticityY() * 50000.0f) + 0.5f));
            hdrStaticInfo.putShort((short) ((whitePointChromaticityX() * 50000.0f) + 0.5f));
            hdrStaticInfo.putShort((short) ((whitePointChromaticityY() * 50000.0f) + 0.5f));
            hdrStaticInfo.putShort((short) (maxColorVolumeLuminance() + 0.5f));
            hdrStaticInfo.putShort((short) (minColorVolumeLuminance() + 0.5f));
            hdrStaticInfo.putShort((short) maxContentLuminance());
            hdrStaticInfo.putShort((short) maxFrameAverageLuminance());
            hdrStaticInfo.rewind();
            format.setByteBuffer("hdr-static-info", hdrStaticInfo);
        }
    }

    private int getColorStandard() {
        switch (HdrMetadataJni.get().primaries(this.mNativeJniHdrMetadata, this)) {
            case 1:
                return 1;
            case 2:
            case 3:
            case 8:
            default:
                return -1;
            case 4:
            case 5:
            case 6:
            case 7:
                return 4;
            case 9:
                return 6;
        }
    }

    private int getColorTransfer() {
        switch (HdrMetadataJni.get().colorTransfer(this.mNativeJniHdrMetadata, this)) {
            case 1:
            case 6:
            case 7:
                return 3;
            case 8:
                return 1;
            case 16:
                return 6;
            case 18:
                return 7;
            default:
                return -1;
        }
    }

    private int getColorRange() {
        switch (HdrMetadataJni.get().range(this.mNativeJniHdrMetadata, this)) {
            case 1:
                return 2;
            case 2:
                return 1;
            default:
                return -1;
        }
    }

    private float primaryRChromaticityX() {
        return HdrMetadataJni.get().primaryRChromaticityX(this.mNativeJniHdrMetadata, this);
    }

    private float primaryRChromaticityY() {
        return HdrMetadataJni.get().primaryRChromaticityY(this.mNativeJniHdrMetadata, this);
    }

    private float primaryGChromaticityX() {
        return HdrMetadataJni.get().primaryGChromaticityX(this.mNativeJniHdrMetadata, this);
    }

    private float primaryGChromaticityY() {
        return HdrMetadataJni.get().primaryGChromaticityY(this.mNativeJniHdrMetadata, this);
    }

    private float primaryBChromaticityX() {
        return HdrMetadataJni.get().primaryBChromaticityX(this.mNativeJniHdrMetadata, this);
    }

    private float primaryBChromaticityY() {
        return HdrMetadataJni.get().primaryBChromaticityY(this.mNativeJniHdrMetadata, this);
    }

    private float whitePointChromaticityX() {
        return HdrMetadataJni.get().whitePointChromaticityX(this.mNativeJniHdrMetadata, this);
    }

    private float whitePointChromaticityY() {
        return HdrMetadataJni.get().whitePointChromaticityY(this.mNativeJniHdrMetadata, this);
    }

    private float maxColorVolumeLuminance() {
        return HdrMetadataJni.get().maxColorVolumeLuminance(this.mNativeJniHdrMetadata, this);
    }

    private float minColorVolumeLuminance() {
        return HdrMetadataJni.get().minColorVolumeLuminance(this.mNativeJniHdrMetadata, this);
    }

    private int maxContentLuminance() {
        return HdrMetadataJni.get().maxContentLuminance(this.mNativeJniHdrMetadata, this);
    }

    private int maxFrameAverageLuminance() {
        return HdrMetadataJni.get().maxFrameAverageLuminance(this.mNativeJniHdrMetadata, this);
    }
}
