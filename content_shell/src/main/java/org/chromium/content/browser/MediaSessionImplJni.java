package org.chromium.content.browser;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content.browser.MediaSessionImpl;
import org.chromium.content_public.browser.WebContents;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class MediaSessionImplJni implements MediaSessionImpl.Natives {
    public static final JniStaticTestMocker<MediaSessionImpl.Natives> TEST_HOOKS = new JniStaticTestMocker<MediaSessionImpl.Natives>() { // from class: org.chromium.content.browser.MediaSessionImplJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(MediaSessionImpl.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                MediaSessionImpl.Natives unused = MediaSessionImplJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static MediaSessionImpl.Natives testInstance;

    MediaSessionImplJni() {
    }

    @Override // org.chromium.content.browser.MediaSessionImpl.Natives
    public void resume(long nativeMediaSessionAndroid, MediaSessionImpl caller) {
        GEN_JNI.org_chromium_content_browser_MediaSessionImpl_resume(nativeMediaSessionAndroid, caller);
    }

    @Override // org.chromium.content.browser.MediaSessionImpl.Natives
    public void suspend(long nativeMediaSessionAndroid, MediaSessionImpl caller) {
        GEN_JNI.org_chromium_content_browser_MediaSessionImpl_suspend(nativeMediaSessionAndroid, caller);
    }

    @Override // org.chromium.content.browser.MediaSessionImpl.Natives
    public void stop(long nativeMediaSessionAndroid, MediaSessionImpl caller) {
        GEN_JNI.org_chromium_content_browser_MediaSessionImpl_stop(nativeMediaSessionAndroid, caller);
    }

    @Override // org.chromium.content.browser.MediaSessionImpl.Natives
    public void seek(long nativeMediaSessionAndroid, MediaSessionImpl caller, long millis) {
        GEN_JNI.org_chromium_content_browser_MediaSessionImpl_seek(nativeMediaSessionAndroid, caller, millis);
    }

    @Override // org.chromium.content.browser.MediaSessionImpl.Natives
    public void seekTo(long nativeMediaSessionAndroid, MediaSessionImpl caller, long millis) {
        GEN_JNI.org_chromium_content_browser_MediaSessionImpl_seekTo(nativeMediaSessionAndroid, caller, millis);
    }

    @Override // org.chromium.content.browser.MediaSessionImpl.Natives
    public void didReceiveAction(long nativeMediaSessionAndroid, MediaSessionImpl caller, int action) {
        GEN_JNI.org_chromium_content_browser_MediaSessionImpl_didReceiveAction(nativeMediaSessionAndroid, caller, action);
    }

    @Override // org.chromium.content.browser.MediaSessionImpl.Natives
    public void requestSystemAudioFocus(long nativeMediaSessionAndroid, MediaSessionImpl caller) {
        GEN_JNI.org_chromium_content_browser_MediaSessionImpl_requestSystemAudioFocus(nativeMediaSessionAndroid, caller);
    }

    @Override // org.chromium.content.browser.MediaSessionImpl.Natives
    public MediaSessionImpl getMediaSessionFromWebContents(WebContents contents) {
        return (MediaSessionImpl) GEN_JNI.org_chromium_content_browser_MediaSessionImpl_getMediaSessionFromWebContents(contents);
    }

    public static MediaSessionImpl.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            MediaSessionImpl.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.MediaSessionImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new MediaSessionImplJni();
    }
}
