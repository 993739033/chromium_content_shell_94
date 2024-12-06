package org.chromium.content.browser;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content.browser.ContentViewStaticsImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ContentViewStaticsImplJni implements ContentViewStaticsImpl.Natives {
    public static final JniStaticTestMocker<ContentViewStaticsImpl.Natives> TEST_HOOKS = new JniStaticTestMocker<ContentViewStaticsImpl.Natives>() { // from class: org.chromium.content.browser.ContentViewStaticsImplJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(ContentViewStaticsImpl.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                ContentViewStaticsImpl.Natives unused = ContentViewStaticsImplJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static ContentViewStaticsImpl.Natives testInstance;

    ContentViewStaticsImplJni() {
    }

    @Override // org.chromium.content.browser.ContentViewStaticsImpl.Natives
    public void setWebKitSharedTimersSuspended(boolean suspend) {
        GEN_JNI.org_chromium_content_browser_ContentViewStaticsImpl_setWebKitSharedTimersSuspended(suspend);
    }

    public static ContentViewStaticsImpl.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            ContentViewStaticsImpl.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.ContentViewStaticsImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new ContentViewStaticsImplJni();
    }
}
