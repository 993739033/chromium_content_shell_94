package org.chromium.ui.base;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.ui.base.SelectFileDialog;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class SelectFileDialogJni implements SelectFileDialog.Natives {
    public static final JniStaticTestMocker<SelectFileDialog.Natives> TEST_HOOKS = new JniStaticTestMocker<SelectFileDialog.Natives>() { // from class: org.chromium.ui.base.SelectFileDialogJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(SelectFileDialog.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                SelectFileDialog.Natives unused = SelectFileDialogJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static SelectFileDialog.Natives testInstance;

    SelectFileDialogJni() {
    }

    @Override // org.chromium.ui.base.SelectFileDialog.Natives
    public void onFileSelected(long nativeSelectFileDialogImpl, SelectFileDialog caller, String filePath, String displayName) {
        GEN_JNI.org_chromium_ui_base_SelectFileDialog_onFileSelected(nativeSelectFileDialogImpl, caller, filePath, displayName);
    }

    @Override // org.chromium.ui.base.SelectFileDialog.Natives
    public void onMultipleFilesSelected(long nativeSelectFileDialogImpl, SelectFileDialog caller, String[] filePathArray, String[] displayNameArray) {
        GEN_JNI.org_chromium_ui_base_SelectFileDialog_onMultipleFilesSelected(nativeSelectFileDialogImpl, caller, filePathArray, displayNameArray);
    }

    @Override // org.chromium.ui.base.SelectFileDialog.Natives
    public void onFileNotSelected(long nativeSelectFileDialogImpl, SelectFileDialog caller) {
        GEN_JNI.org_chromium_ui_base_SelectFileDialog_onFileNotSelected(nativeSelectFileDialogImpl, caller);
    }

    @Override // org.chromium.ui.base.SelectFileDialog.Natives
    public void onContactsSelected(long nativeSelectFileDialogImpl, SelectFileDialog caller, String contacts) {
        GEN_JNI.org_chromium_ui_base_SelectFileDialog_onContactsSelected(nativeSelectFileDialogImpl, caller, contacts);
    }

    public static SelectFileDialog.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            SelectFileDialog.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.ui.base.SelectFileDialog.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new SelectFileDialogJni();
    }
}
