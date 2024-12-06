package org.chromium.content.browser;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content.browser.ContentFeatureListImpl;
@MainDex
/* loaded from: classes2.dex */
public class ContentFeatureListImplJni implements ContentFeatureListImpl.Natives {
    public static final JniStaticTestMocker<ContentFeatureListImpl.Natives> TEST_HOOKS = new JniStaticTestMocker<ContentFeatureListImpl.Natives>() { // from class: org.chromium.content.browser.ContentFeatureListImplJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(ContentFeatureListImpl.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                ContentFeatureListImpl.Natives unused = ContentFeatureListImplJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static ContentFeatureListImpl.Natives testInstance;

    @Override // org.chromium.content.browser.ContentFeatureListImpl.Natives
    public boolean isEnabled(String featureName) {
        return GEN_JNI.org_chromium_content_browser_ContentFeatureListImpl_isEnabled(featureName);
    }

    public static ContentFeatureListImpl.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            ContentFeatureListImpl.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.ContentFeatureListImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(true);
        return new ContentFeatureListImplJni();
    }
}
