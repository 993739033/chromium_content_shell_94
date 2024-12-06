package org.chromium.content.browser;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content.browser.SpeechRecognitionImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class SpeechRecognitionImplJni implements SpeechRecognitionImpl.Natives {
    public static final JniStaticTestMocker<SpeechRecognitionImpl.Natives> TEST_HOOKS = new JniStaticTestMocker<SpeechRecognitionImpl.Natives>() { // from class: org.chromium.content.browser.SpeechRecognitionImplJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(SpeechRecognitionImpl.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                SpeechRecognitionImpl.Natives unused = SpeechRecognitionImplJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static SpeechRecognitionImpl.Natives testInstance;

    SpeechRecognitionImplJni() {
    }

    @Override // org.chromium.content.browser.SpeechRecognitionImpl.Natives
    public void onAudioStart(long nativeSpeechRecognizerImplAndroid, SpeechRecognitionImpl caller) {
        GEN_JNI.org_chromium_content_browser_SpeechRecognitionImpl_onAudioStart(nativeSpeechRecognizerImplAndroid, caller);
    }

    @Override // org.chromium.content.browser.SpeechRecognitionImpl.Natives
    public void onSoundStart(long nativeSpeechRecognizerImplAndroid, SpeechRecognitionImpl caller) {
        GEN_JNI.org_chromium_content_browser_SpeechRecognitionImpl_onSoundStart(nativeSpeechRecognizerImplAndroid, caller);
    }

    @Override // org.chromium.content.browser.SpeechRecognitionImpl.Natives
    public void onSoundEnd(long nativeSpeechRecognizerImplAndroid, SpeechRecognitionImpl caller) {
        GEN_JNI.org_chromium_content_browser_SpeechRecognitionImpl_onSoundEnd(nativeSpeechRecognizerImplAndroid, caller);
    }

    @Override // org.chromium.content.browser.SpeechRecognitionImpl.Natives
    public void onAudioEnd(long nativeSpeechRecognizerImplAndroid, SpeechRecognitionImpl caller) {
        GEN_JNI.org_chromium_content_browser_SpeechRecognitionImpl_onAudioEnd(nativeSpeechRecognizerImplAndroid, caller);
    }

    @Override // org.chromium.content.browser.SpeechRecognitionImpl.Natives
    public void onRecognitionResults(long nativeSpeechRecognizerImplAndroid, SpeechRecognitionImpl caller, String[] results, float[] scores, boolean provisional) {
        GEN_JNI.org_chromium_content_browser_SpeechRecognitionImpl_onRecognitionResults(nativeSpeechRecognizerImplAndroid, caller, results, scores, provisional);
    }

    @Override // org.chromium.content.browser.SpeechRecognitionImpl.Natives
    public void onRecognitionError(long nativeSpeechRecognizerImplAndroid, SpeechRecognitionImpl caller, int error) {
        GEN_JNI.org_chromium_content_browser_SpeechRecognitionImpl_onRecognitionError(nativeSpeechRecognizerImplAndroid, caller, error);
    }

    @Override // org.chromium.content.browser.SpeechRecognitionImpl.Natives
    public void onRecognitionEnd(long nativeSpeechRecognizerImplAndroid, SpeechRecognitionImpl caller) {
        GEN_JNI.org_chromium_content_browser_SpeechRecognitionImpl_onRecognitionEnd(nativeSpeechRecognizerImplAndroid, caller);
    }

    public static SpeechRecognitionImpl.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            SpeechRecognitionImpl.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.SpeechRecognitionImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new SpeechRecognitionImplJni();
    }
}
