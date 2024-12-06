package org.chromium.content.app;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content.app.ContentChildProcessServiceDelegate;
/* JADX INFO: Access modifiers changed from: package-private */
@MainDex
/* loaded from: classes2.dex */
public class ContentChildProcessServiceDelegateJni implements ContentChildProcessServiceDelegate.Natives {
    public static final JniStaticTestMocker<ContentChildProcessServiceDelegate.Natives> TEST_HOOKS = new JniStaticTestMocker<ContentChildProcessServiceDelegate.Natives>() { // from class: org.chromium.content.app.ContentChildProcessServiceDelegateJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(ContentChildProcessServiceDelegate.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                ContentChildProcessServiceDelegate.Natives unused = ContentChildProcessServiceDelegateJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static ContentChildProcessServiceDelegate.Natives testInstance;

    ContentChildProcessServiceDelegateJni() {
    }

    @Override // org.chromium.content.app.ContentChildProcessServiceDelegate.Natives
    public void initChildProcess(ContentChildProcessServiceDelegate caller, int cpuCount, long cpuFeatures) {
        GEN_JNI.org_chromium_content_app_ContentChildProcessServiceDelegate_initChildProcess(caller, cpuCount, cpuFeatures);
    }

    @Override // org.chromium.content.app.ContentChildProcessServiceDelegate.Natives
    public void initMemoryPressureListener() {
        GEN_JNI.org_chromium_content_app_ContentChildProcessServiceDelegate_initMemoryPressureListener();
    }

    @Override // org.chromium.content.app.ContentChildProcessServiceDelegate.Natives
    public void retrieveFileDescriptorsIdsToKeys(ContentChildProcessServiceDelegate caller) {
        GEN_JNI.org_chromium_content_app_ContentChildProcessServiceDelegate_retrieveFileDescriptorsIdsToKeys(caller);
    }

    public static ContentChildProcessServiceDelegate.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            ContentChildProcessServiceDelegate.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.app.ContentChildProcessServiceDelegate.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(true);
        return new ContentChildProcessServiceDelegateJni();
    }
}
