package org.chromium.components.url_formatter;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.components.url_formatter.UrlFormatter;
import org.chromium.url.GURL;
@MainDex
/* loaded from: classes2.dex */
public class UrlFormatterJni implements UrlFormatter.Natives {
    public static final JniStaticTestMocker<UrlFormatter.Natives> TEST_HOOKS = new JniStaticTestMocker<UrlFormatter.Natives>() { // from class: org.chromium.components.url_formatter.UrlFormatterJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(UrlFormatter.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                UrlFormatter.Natives unused = UrlFormatterJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static UrlFormatter.Natives testInstance;

    @Override // org.chromium.components.url_formatter.UrlFormatter.Natives
    public GURL fixupUrl(String url) {
        return (GURL) GEN_JNI.org_chromium_components_url_1formatter_UrlFormatter_fixupUrl(url);
    }

    @Override // org.chromium.components.url_formatter.UrlFormatter.Natives
    public String formatUrlForDisplayOmitScheme(String url) {
        return GEN_JNI.org_chromium_components_url_1formatter_UrlFormatter_formatUrlForDisplayOmitScheme(url);
    }

    @Override // org.chromium.components.url_formatter.UrlFormatter.Natives
    public String formatUrlForDisplayOmitHTTPScheme(String url) {
        return GEN_JNI.org_chromium_components_url_1formatter_UrlFormatter_formatUrlForDisplayOmitHTTPScheme(url);
    }

    @Override // org.chromium.components.url_formatter.UrlFormatter.Natives
    public String formatUrlForDisplayOmitSchemeOmitTrivialSubdomains(String url) {
        return GEN_JNI.org_chromium_components_url_1formatter_UrlFormatter_formatUrlForDisplayOmitSchemeOmitTrivialSubdomains(url);
    }

    @Override // org.chromium.components.url_formatter.UrlFormatter.Natives
    public String formatUrlForDisplayOmitSchemePathAndTrivialSubdomains(GURL url) {
        return GEN_JNI.org_chromium_components_url_1formatter_UrlFormatter_formatUrlForDisplayOmitSchemePathAndTrivialSubdomains(url);
    }

    @Override // org.chromium.components.url_formatter.UrlFormatter.Natives
    public String formatUrlForDisplayOmitUsernamePassword(String url) {
        return GEN_JNI.org_chromium_components_url_1formatter_UrlFormatter_formatUrlForDisplayOmitUsernamePassword(url);
    }

    @Override // org.chromium.components.url_formatter.UrlFormatter.Natives
    public String formatUrlForCopy(String url) {
        return GEN_JNI.org_chromium_components_url_1formatter_UrlFormatter_formatUrlForCopy(url);
    }

    @Override // org.chromium.components.url_formatter.UrlFormatter.Natives
    public String formatUrlForSecurityDisplay(GURL url, int schemeDisplay) {
        return GEN_JNI.org_chromium_components_url_1formatter_UrlFormatter_formatUrlForSecurityDisplay(url, schemeDisplay);
    }

    @Override // org.chromium.components.url_formatter.UrlFormatter.Natives
    public String formatStringUrlForSecurityDisplay(String url, int schemeDisplay) {
        return GEN_JNI.org_chromium_components_url_1formatter_UrlFormatter_formatStringUrlForSecurityDisplay(url, schemeDisplay);
    }

    public static UrlFormatter.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            UrlFormatter.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.url_formatter.UrlFormatter.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(true);
        return new UrlFormatterJni();
    }
}
