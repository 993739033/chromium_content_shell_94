package org.chromium.media;

import android.media.MediaCrypto;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.media.MediaDrmBridge;
/* JADX INFO: Access modifiers changed from: package-private */
@MainDex
/* loaded from: classes2.dex */
public class MediaDrmBridgeJni implements MediaDrmBridge.Natives {
    public static final JniStaticTestMocker<MediaDrmBridge.Natives> TEST_HOOKS = new JniStaticTestMocker<MediaDrmBridge.Natives>() { // from class: org.chromium.media.MediaDrmBridgeJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(MediaDrmBridge.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                MediaDrmBridge.Natives unused = MediaDrmBridgeJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static MediaDrmBridge.Natives testInstance;

    MediaDrmBridgeJni() {
    }

    @Override // org.chromium.media.MediaDrmBridge.Natives
    public void onMediaCryptoReady(long nativeMediaDrmBridge, MediaDrmBridge caller, MediaCrypto mediaCrypto) {
        GEN_JNI.org_chromium_media_MediaDrmBridge_onMediaCryptoReady(nativeMediaDrmBridge, caller, mediaCrypto);
    }

    @Override // org.chromium.media.MediaDrmBridge.Natives
    public void onProvisionRequest(long nativeMediaDrmBridge, MediaDrmBridge caller, String defaultUrl, byte[] requestData) {
        GEN_JNI.org_chromium_media_MediaDrmBridge_onProvisionRequest(nativeMediaDrmBridge, caller, defaultUrl, requestData);
    }

    @Override // org.chromium.media.MediaDrmBridge.Natives
    public void onProvisioningComplete(long nativeMediaDrmBridge, MediaDrmBridge caller, boolean success) {
        GEN_JNI.org_chromium_media_MediaDrmBridge_onProvisioningComplete(nativeMediaDrmBridge, caller, success);
    }

    @Override // org.chromium.media.MediaDrmBridge.Natives
    public void onPromiseResolved(long nativeMediaDrmBridge, MediaDrmBridge caller, long promiseId) {
        GEN_JNI.org_chromium_media_MediaDrmBridge_onPromiseResolved(nativeMediaDrmBridge, caller, promiseId);
    }

    @Override // org.chromium.media.MediaDrmBridge.Natives
    public void onPromiseResolvedWithSession(long nativeMediaDrmBridge, MediaDrmBridge caller, long promiseId, byte[] emeSessionId) {
        GEN_JNI.org_chromium_media_MediaDrmBridge_onPromiseResolvedWithSession(nativeMediaDrmBridge, caller, promiseId, emeSessionId);
    }

    @Override // org.chromium.media.MediaDrmBridge.Natives
    public void onPromiseRejected(long nativeMediaDrmBridge, MediaDrmBridge caller, long promiseId, String errorMessage) {
        GEN_JNI.org_chromium_media_MediaDrmBridge_onPromiseRejected(nativeMediaDrmBridge, caller, promiseId, errorMessage);
    }

    @Override // org.chromium.media.MediaDrmBridge.Natives
    public void onSessionMessage(long nativeMediaDrmBridge, MediaDrmBridge caller, byte[] emeSessionId, int requestType, byte[] message) {
        GEN_JNI.org_chromium_media_MediaDrmBridge_onSessionMessage(nativeMediaDrmBridge, caller, emeSessionId, requestType, message);
    }

    @Override // org.chromium.media.MediaDrmBridge.Natives
    public void onSessionClosed(long nativeMediaDrmBridge, MediaDrmBridge caller, byte[] emeSessionId) {
        GEN_JNI.org_chromium_media_MediaDrmBridge_onSessionClosed(nativeMediaDrmBridge, caller, emeSessionId);
    }

    @Override // org.chromium.media.MediaDrmBridge.Natives
    public void onSessionKeysChange(long nativeMediaDrmBridge, MediaDrmBridge caller, byte[] emeSessionId, Object[] keysInfo, boolean hasAdditionalUsableKey, boolean isKeyRelease) {
        GEN_JNI.org_chromium_media_MediaDrmBridge_onSessionKeysChange(nativeMediaDrmBridge, caller, emeSessionId, keysInfo, hasAdditionalUsableKey, isKeyRelease);
    }

    @Override // org.chromium.media.MediaDrmBridge.Natives
    public void onSessionExpirationUpdate(long nativeMediaDrmBridge, MediaDrmBridge caller, byte[] emeSessionId, long expirationTime) {
        GEN_JNI.org_chromium_media_MediaDrmBridge_onSessionExpirationUpdate(nativeMediaDrmBridge, caller, emeSessionId, expirationTime);
    }

    public static MediaDrmBridge.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            MediaDrmBridge.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.media.MediaDrmBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(true);
        return new MediaDrmBridgeJni();
    }
}
