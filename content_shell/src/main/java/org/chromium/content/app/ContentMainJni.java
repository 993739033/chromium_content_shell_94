package org.chromium.content.app;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content.app.ContentMain;
/* JADX INFO: Access modifiers changed from: package-private */
@MainDex
/* loaded from: classes2.dex */
public class ContentMainJni implements ContentMain.Natives {
    public static final JniStaticTestMocker<ContentMain.Natives> TEST_HOOKS = new JniStaticTestMocker<ContentMain.Natives>() { // from class: org.chromium.content.app.ContentMainJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(ContentMain.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                ContentMain.Natives unused = ContentMainJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static ContentMain.Natives testInstance;

    ContentMainJni() {
    }

    @Override // org.chromium.content.app.ContentMain.Natives
    public int start(boolean startMinimalBrowser) {
        return GEN_JNI.org_chromium_content_app_ContentMain_start(startMinimalBrowser);
    }

    public static ContentMain.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            ContentMain.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.app.ContentMain.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(true);
        return new ContentMainJni();
    }
}
