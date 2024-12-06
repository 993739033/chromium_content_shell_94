package org.chromium.content_public.browser;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.LoadUrlParams;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class LoadUrlParamsJni implements LoadUrlParams.Natives {
    public static final JniStaticTestMocker<LoadUrlParams.Natives> TEST_HOOKS = new JniStaticTestMocker<LoadUrlParams.Natives>() { // from class: org.chromium.content_public.browser.LoadUrlParamsJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(LoadUrlParams.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                LoadUrlParams.Natives unused = LoadUrlParamsJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static LoadUrlParams.Natives testInstance;

    LoadUrlParamsJni() {
    }

    @Override // org.chromium.content_public.browser.LoadUrlParams.Natives
    public boolean isDataScheme(String url) {
        return GEN_JNI.org_chromium_content_1public_browser_LoadUrlParams_isDataScheme(url);
    }

    public static LoadUrlParams.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            LoadUrlParams.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content_public.browser.LoadUrlParams.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new LoadUrlParamsJni();
    }
}
