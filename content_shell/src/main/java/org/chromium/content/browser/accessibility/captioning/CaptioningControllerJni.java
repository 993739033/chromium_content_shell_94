package org.chromium.content.browser.accessibility.captioning;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content.browser.accessibility.captioning.CaptioningController;
import org.chromium.content_public.browser.WebContents;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class CaptioningControllerJni implements CaptioningController.Natives {
    public static final JniStaticTestMocker<CaptioningController.Natives> TEST_HOOKS = new JniStaticTestMocker<CaptioningController.Natives>() { // from class: org.chromium.content.browser.accessibility.captioning.CaptioningControllerJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(CaptioningController.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                CaptioningController.Natives unused = CaptioningControllerJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static CaptioningController.Natives testInstance;

    CaptioningControllerJni() {
    }

    @Override // org.chromium.content.browser.accessibility.captioning.CaptioningController.Natives
    public long init(CaptioningController caller, WebContents webContents) {
        return GEN_JNI.org_chromium_content_browser_accessibility_captioning_CaptioningController_init(caller, webContents);
    }

    @Override // org.chromium.content.browser.accessibility.captioning.CaptioningController.Natives
    public void setTextTrackSettings(long nativeCaptioningController, CaptioningController caller, boolean textTracksEnabled, String textTrackBackgroundColor, String textTrackFontFamily, String textTrackFontStyle, String textTrackFontVariant, String textTrackTextColor, String textTrackTextShadow, String textTrackTextSize) {
        GEN_JNI.org_chromium_content_browser_accessibility_captioning_CaptioningController_setTextTrackSettings(nativeCaptioningController, caller, textTracksEnabled, textTrackBackgroundColor, textTrackFontFamily, textTrackFontStyle, textTrackFontVariant, textTrackTextColor, textTrackTextShadow, textTrackTextSize);
    }

    public static CaptioningController.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            CaptioningController.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.accessibility.captioning.CaptioningController.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new CaptioningControllerJni();
    }
}
