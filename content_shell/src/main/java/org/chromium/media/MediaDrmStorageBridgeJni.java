package org.chromium.media;

import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.media.MediaDrmStorageBridge;
/* JADX INFO: Access modifiers changed from: package-private */
@MainDex
/* loaded from: classes2.dex */
public class MediaDrmStorageBridgeJni implements MediaDrmStorageBridge.Natives {
    public static final JniStaticTestMocker<MediaDrmStorageBridge.Natives> TEST_HOOKS = new JniStaticTestMocker<MediaDrmStorageBridge.Natives>() { // from class: org.chromium.media.MediaDrmStorageBridgeJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(MediaDrmStorageBridge.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                MediaDrmStorageBridge.Natives unused = MediaDrmStorageBridgeJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static MediaDrmStorageBridge.Natives testInstance;

    MediaDrmStorageBridgeJni() {
    }

    @Override // org.chromium.media.MediaDrmStorageBridge.Natives
    public void onProvisioned(long nativeMediaDrmStorageBridge, MediaDrmStorageBridge caller, Callback<Boolean> cb) {
        GEN_JNI.org_chromium_media_MediaDrmStorageBridge_onProvisioned(nativeMediaDrmStorageBridge, caller, cb);
    }

    @Override // org.chromium.media.MediaDrmStorageBridge.Natives
    public void onLoadInfo(long nativeMediaDrmStorageBridge, MediaDrmStorageBridge caller, byte[] sessionId, Callback<MediaDrmStorageBridge.PersistentInfo> cb) {
        GEN_JNI.org_chromium_media_MediaDrmStorageBridge_onLoadInfo(nativeMediaDrmStorageBridge, caller, sessionId, cb);
    }

    @Override // org.chromium.media.MediaDrmStorageBridge.Natives
    public void onSaveInfo(long nativeMediaDrmStorageBridge, MediaDrmStorageBridge caller, MediaDrmStorageBridge.PersistentInfo info, Callback<Boolean> cb) {
        GEN_JNI.org_chromium_media_MediaDrmStorageBridge_onSaveInfo(nativeMediaDrmStorageBridge, caller, info, cb);
    }

    @Override // org.chromium.media.MediaDrmStorageBridge.Natives
    public void onClearInfo(long nativeMediaDrmStorageBridge, MediaDrmStorageBridge caller, byte[] sessionId, Callback<Boolean> cb) {
        GEN_JNI.org_chromium_media_MediaDrmStorageBridge_onClearInfo(nativeMediaDrmStorageBridge, caller, sessionId, cb);
    }

    public static MediaDrmStorageBridge.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            MediaDrmStorageBridge.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.media.MediaDrmStorageBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(true);
        return new MediaDrmStorageBridgeJni();
    }
}
