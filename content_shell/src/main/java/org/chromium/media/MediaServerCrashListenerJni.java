package org.chromium.media;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.media.MediaServerCrashListener;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class MediaServerCrashListenerJni implements MediaServerCrashListener.Natives {
    public static final JniStaticTestMocker<MediaServerCrashListener.Natives> TEST_HOOKS = new JniStaticTestMocker<MediaServerCrashListener.Natives>() { // from class: org.chromium.media.MediaServerCrashListenerJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(MediaServerCrashListener.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                MediaServerCrashListener.Natives unused = MediaServerCrashListenerJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static MediaServerCrashListener.Natives testInstance;

    MediaServerCrashListenerJni() {
    }

    @Override // org.chromium.media.MediaServerCrashListener.Natives
    public void onMediaServerCrashDetected(long nativeMediaServerCrashListener, MediaServerCrashListener caller, boolean watchdogNeedsRelease) {
        GEN_JNI.org_chromium_media_MediaServerCrashListener_onMediaServerCrashDetected(nativeMediaServerCrashListener, caller, watchdogNeedsRelease);
    }

    public static MediaServerCrashListener.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            MediaServerCrashListener.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.media.MediaServerCrashListener.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new MediaServerCrashListenerJni();
    }
}
