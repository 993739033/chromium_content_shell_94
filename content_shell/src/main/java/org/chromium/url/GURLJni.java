package org.chromium.url;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.url.GURL;
/* JADX INFO: Access modifiers changed from: package-private */
@MainDex
/* loaded from: classes2.dex */
public class GURLJni implements GURL.Natives {
    public static final JniStaticTestMocker<GURL.Natives> TEST_HOOKS = new JniStaticTestMocker<GURL.Natives>() { // from class: org.chromium.url.GURLJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(GURL.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                GURL.Natives unused = GURLJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static GURL.Natives testInstance;

    GURLJni() {
    }

    @Override // org.chromium.url.GURL.Natives
    public void init(String uri, GURL target) {
        GEN_JNI.org_chromium_url_GURL_init(uri, target);
    }

    @Override // org.chromium.url.GURL.Natives
    public void getOrigin(String spec, boolean isValid, long nativeParsed, GURL target) {
        GEN_JNI.org_chromium_url_GURL_getOrigin(spec, isValid, nativeParsed, target);
    }

    @Override // org.chromium.url.GURL.Natives
    public boolean domainIs(String spec, boolean isValid, long nativeParsed, String domain) {
        return GEN_JNI.org_chromium_url_GURL_domainIs(spec, isValid, nativeParsed, domain);
    }

    @Override // org.chromium.url.GURL.Natives
    public long createNative(String spec, boolean isValid, long nativeParsed) {
        return GEN_JNI.org_chromium_url_GURL_createNative(spec, isValid, nativeParsed);
    }

    public static GURL.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            GURL.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.url.GURL.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(true);
        return new GURLJni();
    }
}
