package org.chromium.content.browser.selection;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content.browser.selection.SmartSelectionClient;
import org.chromium.content_public.browser.WebContents;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class SmartSelectionClientJni implements SmartSelectionClient.Natives {
    public static final JniStaticTestMocker<SmartSelectionClient.Natives> TEST_HOOKS = new JniStaticTestMocker<SmartSelectionClient.Natives>() { // from class: org.chromium.content.browser.selection.SmartSelectionClientJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(SmartSelectionClient.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                SmartSelectionClient.Natives unused = SmartSelectionClientJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static SmartSelectionClient.Natives testInstance;

    SmartSelectionClientJni() {
    }

    @Override // org.chromium.content.browser.selection.SmartSelectionClient.Natives
    public long init(SmartSelectionClient caller, WebContents webContents) {
        return GEN_JNI.org_chromium_content_browser_selection_SmartSelectionClient_init(caller, webContents);
    }

    @Override // org.chromium.content.browser.selection.SmartSelectionClient.Natives
    public void requestSurroundingText(long nativeSmartSelectionClient, SmartSelectionClient caller, int numExtraCharacters, int callbackData) {
        GEN_JNI.org_chromium_content_browser_selection_SmartSelectionClient_requestSurroundingText(nativeSmartSelectionClient, caller, numExtraCharacters, callbackData);
    }

    @Override // org.chromium.content.browser.selection.SmartSelectionClient.Natives
    public void cancelAllRequests(long nativeSmartSelectionClient, SmartSelectionClient caller) {
        GEN_JNI.org_chromium_content_browser_selection_SmartSelectionClient_cancelAllRequests(nativeSmartSelectionClient, caller);
    }

    public static SmartSelectionClient.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            SmartSelectionClient.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.selection.SmartSelectionClient.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new SmartSelectionClientJni();
    }
}
