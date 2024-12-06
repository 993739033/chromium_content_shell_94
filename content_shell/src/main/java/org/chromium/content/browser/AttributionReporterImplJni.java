package org.chromium.content.browser;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content.browser.AttributionReporterImpl;
import org.chromium.content_public.browser.WebContents;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class AttributionReporterImplJni implements AttributionReporterImpl.Natives {
    public static final JniStaticTestMocker<AttributionReporterImpl.Natives> TEST_HOOKS = new JniStaticTestMocker<AttributionReporterImpl.Natives>() { // from class: org.chromium.content.browser.AttributionReporterImplJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(AttributionReporterImpl.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                AttributionReporterImpl.Natives unused = AttributionReporterImplJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static AttributionReporterImpl.Natives testInstance;

    AttributionReporterImplJni() {
    }

    @Override // org.chromium.content.browser.AttributionReporterImpl.Natives
    public void reportAttributionForCurrentNavigation(WebContents webContents, String sourcePackageName, String sourceEventId, String destination, String reportTo, long expiry) {
        GEN_JNI.org_chromium_content_browser_AttributionReporterImpl_reportAttributionForCurrentNavigation(webContents, sourcePackageName, sourceEventId, destination, reportTo, expiry);
    }

    public static AttributionReporterImpl.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            AttributionReporterImpl.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.AttributionReporterImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new AttributionReporterImplJni();
    }
}
