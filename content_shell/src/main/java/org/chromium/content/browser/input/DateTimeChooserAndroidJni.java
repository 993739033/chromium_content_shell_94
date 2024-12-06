package org.chromium.content.browser.input;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content.browser.input.DateTimeChooserAndroid;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class DateTimeChooserAndroidJni implements DateTimeChooserAndroid.Natives {
    public static final JniStaticTestMocker<DateTimeChooserAndroid.Natives> TEST_HOOKS = new JniStaticTestMocker<DateTimeChooserAndroid.Natives>() { // from class: org.chromium.content.browser.input.DateTimeChooserAndroidJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(DateTimeChooserAndroid.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                DateTimeChooserAndroid.Natives unused = DateTimeChooserAndroidJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static DateTimeChooserAndroid.Natives testInstance;

    DateTimeChooserAndroidJni() {
    }

    @Override // org.chromium.content.browser.input.DateTimeChooserAndroid.Natives
    public void replaceDateTime(long nativeDateTimeChooserAndroid, DateTimeChooserAndroid caller, double dialogValue) {
        GEN_JNI.org_chromium_content_browser_input_DateTimeChooserAndroid_replaceDateTime(nativeDateTimeChooserAndroid, caller, dialogValue);
    }

    @Override // org.chromium.content.browser.input.DateTimeChooserAndroid.Natives
    public void cancelDialog(long nativeDateTimeChooserAndroid, DateTimeChooserAndroid caller) {
        GEN_JNI.org_chromium_content_browser_input_DateTimeChooserAndroid_cancelDialog(nativeDateTimeChooserAndroid, caller);
    }

    public static DateTimeChooserAndroid.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            DateTimeChooserAndroid.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.input.DateTimeChooserAndroid.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new DateTimeChooserAndroidJni();
    }
}
