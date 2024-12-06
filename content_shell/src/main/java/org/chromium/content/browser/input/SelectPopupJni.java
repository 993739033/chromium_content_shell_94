package org.chromium.content.browser.input;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content.browser.input.SelectPopup;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class SelectPopupJni implements SelectPopup.Natives {
    public static final JniStaticTestMocker<SelectPopup.Natives> TEST_HOOKS = new JniStaticTestMocker<SelectPopup.Natives>() { // from class: org.chromium.content.browser.input.SelectPopupJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(SelectPopup.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                SelectPopup.Natives unused = SelectPopupJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static SelectPopup.Natives testInstance;

    SelectPopupJni() {
    }

    @Override // org.chromium.content.browser.input.SelectPopup.Natives
    public void selectMenuItems(long nativeSelectPopup, SelectPopup caller, long nativeSelectPopupSourceFrame, int[] indices) {
        GEN_JNI.org_chromium_content_browser_input_SelectPopup_selectMenuItems(nativeSelectPopup, caller, nativeSelectPopupSourceFrame, indices);
    }

    public static SelectPopup.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            SelectPopup.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.input.SelectPopup.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new SelectPopupJni();
    }
}
