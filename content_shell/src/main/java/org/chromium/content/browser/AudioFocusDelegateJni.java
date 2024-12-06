package org.chromium.content.browser;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content.browser.AudioFocusDelegate;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class AudioFocusDelegateJni implements AudioFocusDelegate.Natives {
    public static final JniStaticTestMocker<AudioFocusDelegate.Natives> TEST_HOOKS = new JniStaticTestMocker<AudioFocusDelegate.Natives>() { // from class: org.chromium.content.browser.AudioFocusDelegateJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(AudioFocusDelegate.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                AudioFocusDelegate.Natives unused = AudioFocusDelegateJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static AudioFocusDelegate.Natives testInstance;

    AudioFocusDelegateJni() {
    }

    @Override // org.chromium.content.browser.AudioFocusDelegate.Natives
    public void onSuspend(long nativeAudioFocusDelegateAndroid, AudioFocusDelegate caller) {
        GEN_JNI.org_chromium_content_browser_AudioFocusDelegate_onSuspend(nativeAudioFocusDelegateAndroid, caller);
    }

    @Override // org.chromium.content.browser.AudioFocusDelegate.Natives
    public void onResume(long nativeAudioFocusDelegateAndroid, AudioFocusDelegate caller) {
        GEN_JNI.org_chromium_content_browser_AudioFocusDelegate_onResume(nativeAudioFocusDelegateAndroid, caller);
    }

    @Override // org.chromium.content.browser.AudioFocusDelegate.Natives
    public void onStartDucking(long nativeAudioFocusDelegateAndroid, AudioFocusDelegate caller) {
        GEN_JNI.org_chromium_content_browser_AudioFocusDelegate_onStartDucking(nativeAudioFocusDelegateAndroid, caller);
    }

    @Override // org.chromium.content.browser.AudioFocusDelegate.Natives
    public void onStopDucking(long nativeAudioFocusDelegateAndroid, AudioFocusDelegate caller) {
        GEN_JNI.org_chromium_content_browser_AudioFocusDelegate_onStopDucking(nativeAudioFocusDelegateAndroid, caller);
    }

    @Override // org.chromium.content.browser.AudioFocusDelegate.Natives
    public void recordSessionDuck(long nativeAudioFocusDelegateAndroid, AudioFocusDelegate caller) {
        GEN_JNI.org_chromium_content_browser_AudioFocusDelegate_recordSessionDuck(nativeAudioFocusDelegateAndroid, caller);
    }

    public static AudioFocusDelegate.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            AudioFocusDelegate.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.AudioFocusDelegate.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new AudioFocusDelegateJni();
    }
}
