package org.chromium.content.browser.accessibility;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content.browser.accessibility.BrowserAccessibilityState;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class BrowserAccessibilityStateJni implements BrowserAccessibilityState.Natives {
    public static final JniStaticTestMocker<BrowserAccessibilityState.Natives> TEST_HOOKS = new JniStaticTestMocker<BrowserAccessibilityState.Natives>() { // from class: org.chromium.content.browser.accessibility.BrowserAccessibilityStateJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(BrowserAccessibilityState.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                BrowserAccessibilityState.Natives unused = BrowserAccessibilityStateJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static BrowserAccessibilityState.Natives testInstance;

    BrowserAccessibilityStateJni() {
    }

    @Override // org.chromium.content.browser.accessibility.BrowserAccessibilityState.Natives
    public void onAnimatorDurationScaleChanged() {
        GEN_JNI.org_chromium_content_browser_accessibility_BrowserAccessibilityState_onAnimatorDurationScaleChanged();
    }

    public static BrowserAccessibilityState.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            BrowserAccessibilityState.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.accessibility.BrowserAccessibilityState.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new BrowserAccessibilityStateJni();
    }
}
