package org.chromium.content.browser.selection;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content.browser.selection.SelectionPopupControllerImpl;
import org.chromium.content_public.browser.WebContents;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class SelectionPopupControllerImplJni implements SelectionPopupControllerImpl.Natives {
    public static final JniStaticTestMocker<SelectionPopupControllerImpl.Natives> TEST_HOOKS = new JniStaticTestMocker<SelectionPopupControllerImpl.Natives>() { // from class: org.chromium.content.browser.selection.SelectionPopupControllerImplJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(SelectionPopupControllerImpl.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                SelectionPopupControllerImpl.Natives unused = SelectionPopupControllerImplJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static SelectionPopupControllerImpl.Natives testInstance;

    SelectionPopupControllerImplJni() {
    }

    @Override // org.chromium.content.browser.selection.SelectionPopupControllerImpl.Natives
    public long init(SelectionPopupControllerImpl caller, WebContents webContents) {
        return GEN_JNI.org_chromium_content_browser_selection_SelectionPopupControllerImpl_init(caller, webContents);
    }

    @Override // org.chromium.content.browser.selection.SelectionPopupControllerImpl.Natives
    public void setTextHandlesTemporarilyHidden(long nativeSelectionPopupController, SelectionPopupControllerImpl caller, boolean hidden) {
        GEN_JNI.org_chromium_content_browser_selection_SelectionPopupControllerImpl_setTextHandlesTemporarilyHidden(nativeSelectionPopupController, caller, hidden);
    }

    public static SelectionPopupControllerImpl.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            SelectionPopupControllerImpl.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.selection.SelectionPopupControllerImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new SelectionPopupControllerImplJni();
    }
}
