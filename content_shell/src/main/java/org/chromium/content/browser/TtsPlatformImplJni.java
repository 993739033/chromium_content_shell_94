package org.chromium.content.browser;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content.browser.TtsPlatformImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class TtsPlatformImplJni implements TtsPlatformImpl.Natives {
    public static final JniStaticTestMocker<TtsPlatformImpl.Natives> TEST_HOOKS = new JniStaticTestMocker<TtsPlatformImpl.Natives>() { // from class: org.chromium.content.browser.TtsPlatformImplJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(TtsPlatformImpl.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                TtsPlatformImpl.Natives unused = TtsPlatformImplJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static TtsPlatformImpl.Natives testInstance;

    TtsPlatformImplJni() {
    }

    @Override // org.chromium.content.browser.TtsPlatformImpl.Natives
    public void voicesChanged(long nativeTtsPlatformImplAndroid) {
        GEN_JNI.org_chromium_content_browser_TtsPlatformImpl_voicesChanged(nativeTtsPlatformImplAndroid);
    }

    @Override // org.chromium.content.browser.TtsPlatformImpl.Natives
    public void onEndEvent(long nativeTtsPlatformImplAndroid, int utteranceId) {
        GEN_JNI.org_chromium_content_browser_TtsPlatformImpl_onEndEvent(nativeTtsPlatformImplAndroid, utteranceId);
    }

    @Override // org.chromium.content.browser.TtsPlatformImpl.Natives
    public void onStartEvent(long nativeTtsPlatformImplAndroid, int utteranceId) {
        GEN_JNI.org_chromium_content_browser_TtsPlatformImpl_onStartEvent(nativeTtsPlatformImplAndroid, utteranceId);
    }

    @Override // org.chromium.content.browser.TtsPlatformImpl.Natives
    public void onErrorEvent(long nativeTtsPlatformImplAndroid, int utteranceId) {
        GEN_JNI.org_chromium_content_browser_TtsPlatformImpl_onErrorEvent(nativeTtsPlatformImplAndroid, utteranceId);
    }

    public static TtsPlatformImpl.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            TtsPlatformImpl.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.TtsPlatformImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new TtsPlatformImplJni();
    }
}
