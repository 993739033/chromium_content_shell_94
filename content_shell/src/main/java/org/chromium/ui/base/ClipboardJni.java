package org.chromium.ui.base;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.ui.base.Clipboard;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ClipboardJni implements Clipboard.Natives {
    public static final JniStaticTestMocker<Clipboard.Natives> TEST_HOOKS = new JniStaticTestMocker<Clipboard.Natives>() { // from class: org.chromium.ui.base.ClipboardJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(Clipboard.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                Clipboard.Natives unused = ClipboardJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static Clipboard.Natives testInstance;

    ClipboardJni() {
    }

    @Override // org.chromium.ui.base.Clipboard.Natives
    public void onPrimaryClipChanged(long nativeClipboardAndroid, Clipboard caller) {
        GEN_JNI.org_chromium_ui_base_Clipboard_onPrimaryClipChanged(nativeClipboardAndroid, caller);
    }

    @Override // org.chromium.ui.base.Clipboard.Natives
    public void onPrimaryClipTimestampInvalidated(long nativeClipboardAndroid, Clipboard caller, long timestamp) {
        GEN_JNI.org_chromium_ui_base_Clipboard_onPrimaryClipTimestampInvalidated(nativeClipboardAndroid, caller, timestamp);
    }

    @Override // org.chromium.ui.base.Clipboard.Natives
    public long getLastModifiedTimeToJavaTime(long nativeClipboardAndroid) {
        return GEN_JNI.org_chromium_ui_base_Clipboard_getLastModifiedTimeToJavaTime(nativeClipboardAndroid);
    }

    public static Clipboard.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            Clipboard.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.ui.base.Clipboard.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new ClipboardJni();
    }
}
