package org.chromium.content.browser;

import java.nio.ByteBuffer;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content.browser.ContactsDialogHost;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ContactsDialogHostJni implements ContactsDialogHost.Natives {
    public static final JniStaticTestMocker<ContactsDialogHost.Natives> TEST_HOOKS = new JniStaticTestMocker<ContactsDialogHost.Natives>() { // from class: org.chromium.content.browser.ContactsDialogHostJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(ContactsDialogHost.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                ContactsDialogHost.Natives unused = ContactsDialogHostJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static ContactsDialogHost.Natives testInstance;

    ContactsDialogHostJni() {
    }

    @Override // org.chromium.content.browser.ContactsDialogHost.Natives
    public void addContact(long nativeContactsProviderAndroid, String[] names, String[] emails, String[] tel, ByteBuffer[] addresses, ByteBuffer[] icons) {
        GEN_JNI.org_chromium_content_browser_ContactsDialogHost_addContact(nativeContactsProviderAndroid, names, emails, tel, addresses, icons);
    }

    @Override // org.chromium.content.browser.ContactsDialogHost.Natives
    public void endContactsList(long nativeContactsProviderAndroid, int percentageShared, int propertiesRequested) {
        GEN_JNI.org_chromium_content_browser_ContactsDialogHost_endContactsList(nativeContactsProviderAndroid, percentageShared, propertiesRequested);
    }

    @Override // org.chromium.content.browser.ContactsDialogHost.Natives
    public void endWithPermissionDenied(long nativeContactsProviderAndroid) {
        GEN_JNI.org_chromium_content_browser_ContactsDialogHost_endWithPermissionDenied(nativeContactsProviderAndroid);
    }

    public static ContactsDialogHost.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            ContactsDialogHost.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.ContactsDialogHost.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new ContactsDialogHostJni();
    }
}
