package org.chromium.media;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.media.MediaPlayerBridge;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class MediaPlayerBridgeJni implements MediaPlayerBridge.Natives {
    public static final JniStaticTestMocker<MediaPlayerBridge.Natives> TEST_HOOKS = new JniStaticTestMocker<MediaPlayerBridge.Natives>() { // from class: org.chromium.media.MediaPlayerBridgeJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(MediaPlayerBridge.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                MediaPlayerBridge.Natives unused = MediaPlayerBridgeJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static MediaPlayerBridge.Natives testInstance;

    MediaPlayerBridgeJni() {
    }

    @Override // org.chromium.media.MediaPlayerBridge.Natives
    public void onDidSetDataUriDataSource(long nativeMediaPlayerBridge, MediaPlayerBridge caller, boolean success) {
        GEN_JNI.org_chromium_media_MediaPlayerBridge_onDidSetDataUriDataSource(nativeMediaPlayerBridge, caller, success);
    }

    public static MediaPlayerBridge.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            MediaPlayerBridge.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.media.MediaPlayerBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new MediaPlayerBridgeJni();
    }
}
