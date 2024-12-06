package org.chromium.media;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.media.HdrMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
@MainDex
/* loaded from: classes2.dex */
public class HdrMetadataJni implements HdrMetadata.Natives {
    public static final JniStaticTestMocker<HdrMetadata.Natives> TEST_HOOKS = new JniStaticTestMocker<HdrMetadata.Natives>() { // from class: org.chromium.media.HdrMetadataJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(HdrMetadata.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                HdrMetadata.Natives unused = HdrMetadataJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static HdrMetadata.Natives testInstance;

    HdrMetadataJni() {
    }

    @Override // org.chromium.media.HdrMetadata.Natives
    public int primaries(long nativeJniHdrMetadata, HdrMetadata caller) {
        return GEN_JNI.org_chromium_media_HdrMetadata_primaries(nativeJniHdrMetadata, caller);
    }

    @Override // org.chromium.media.HdrMetadata.Natives
    public int colorTransfer(long nativeJniHdrMetadata, HdrMetadata caller) {
        return GEN_JNI.org_chromium_media_HdrMetadata_colorTransfer(nativeJniHdrMetadata, caller);
    }

    @Override // org.chromium.media.HdrMetadata.Natives
    public int range(long nativeJniHdrMetadata, HdrMetadata caller) {
        return GEN_JNI.org_chromium_media_HdrMetadata_range(nativeJniHdrMetadata, caller);
    }

    @Override // org.chromium.media.HdrMetadata.Natives
    public float primaryRChromaticityX(long nativeJniHdrMetadata, HdrMetadata caller) {
        return GEN_JNI.org_chromium_media_HdrMetadata_primaryRChromaticityX(nativeJniHdrMetadata, caller);
    }

    @Override // org.chromium.media.HdrMetadata.Natives
    public float primaryRChromaticityY(long nativeJniHdrMetadata, HdrMetadata caller) {
        return GEN_JNI.org_chromium_media_HdrMetadata_primaryRChromaticityY(nativeJniHdrMetadata, caller);
    }

    @Override // org.chromium.media.HdrMetadata.Natives
    public float primaryGChromaticityX(long nativeJniHdrMetadata, HdrMetadata caller) {
        return GEN_JNI.org_chromium_media_HdrMetadata_primaryGChromaticityX(nativeJniHdrMetadata, caller);
    }

    @Override // org.chromium.media.HdrMetadata.Natives
    public float primaryGChromaticityY(long nativeJniHdrMetadata, HdrMetadata caller) {
        return GEN_JNI.org_chromium_media_HdrMetadata_primaryGChromaticityY(nativeJniHdrMetadata, caller);
    }

    @Override // org.chromium.media.HdrMetadata.Natives
    public float primaryBChromaticityX(long nativeJniHdrMetadata, HdrMetadata caller) {
        return GEN_JNI.org_chromium_media_HdrMetadata_primaryBChromaticityX(nativeJniHdrMetadata, caller);
    }

    @Override // org.chromium.media.HdrMetadata.Natives
    public float primaryBChromaticityY(long nativeJniHdrMetadata, HdrMetadata caller) {
        return GEN_JNI.org_chromium_media_HdrMetadata_primaryBChromaticityY(nativeJniHdrMetadata, caller);
    }

    @Override // org.chromium.media.HdrMetadata.Natives
    public float whitePointChromaticityX(long nativeJniHdrMetadata, HdrMetadata caller) {
        return GEN_JNI.org_chromium_media_HdrMetadata_whitePointChromaticityX(nativeJniHdrMetadata, caller);
    }

    @Override // org.chromium.media.HdrMetadata.Natives
    public float whitePointChromaticityY(long nativeJniHdrMetadata, HdrMetadata caller) {
        return GEN_JNI.org_chromium_media_HdrMetadata_whitePointChromaticityY(nativeJniHdrMetadata, caller);
    }

    @Override // org.chromium.media.HdrMetadata.Natives
    public float maxColorVolumeLuminance(long nativeJniHdrMetadata, HdrMetadata caller) {
        return GEN_JNI.org_chromium_media_HdrMetadata_maxColorVolumeLuminance(nativeJniHdrMetadata, caller);
    }

    @Override // org.chromium.media.HdrMetadata.Natives
    public float minColorVolumeLuminance(long nativeJniHdrMetadata, HdrMetadata caller) {
        return GEN_JNI.org_chromium_media_HdrMetadata_minColorVolumeLuminance(nativeJniHdrMetadata, caller);
    }

    @Override // org.chromium.media.HdrMetadata.Natives
    public int maxContentLuminance(long nativeJniHdrMetadata, HdrMetadata caller) {
        return GEN_JNI.org_chromium_media_HdrMetadata_maxContentLuminance(nativeJniHdrMetadata, caller);
    }

    @Override // org.chromium.media.HdrMetadata.Natives
    public int maxFrameAverageLuminance(long nativeJniHdrMetadata, HdrMetadata caller) {
        return GEN_JNI.org_chromium_media_HdrMetadata_maxFrameAverageLuminance(nativeJniHdrMetadata, caller);
    }

    public static HdrMetadata.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            HdrMetadata.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.media.HdrMetadata.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(true);
        return new HdrMetadataJni();
    }
}
