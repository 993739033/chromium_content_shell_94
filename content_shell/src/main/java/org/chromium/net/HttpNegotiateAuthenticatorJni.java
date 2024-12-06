package org.chromium.net;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.net.HttpNegotiateAuthenticator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class HttpNegotiateAuthenticatorJni implements HttpNegotiateAuthenticator.Natives {
    public static final JniStaticTestMocker<HttpNegotiateAuthenticator.Natives> TEST_HOOKS = new JniStaticTestMocker<HttpNegotiateAuthenticator.Natives>() { // from class: org.chromium.net.HttpNegotiateAuthenticatorJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(HttpNegotiateAuthenticator.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                HttpNegotiateAuthenticator.Natives unused = HttpNegotiateAuthenticatorJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static HttpNegotiateAuthenticator.Natives testInstance;

    HttpNegotiateAuthenticatorJni() {
    }

    @Override // org.chromium.net.HttpNegotiateAuthenticator.Natives
    public void setResult(long nativeJavaNegotiateResultWrapper, HttpNegotiateAuthenticator caller, int status, String authToken) {
        GEN_JNI.org_chromium_net_HttpNegotiateAuthenticator_setResult(nativeJavaNegotiateResultWrapper, caller, status, authToken);
    }

    public static HttpNegotiateAuthenticator.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            HttpNegotiateAuthenticator.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.net.HttpNegotiateAuthenticator.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new HttpNegotiateAuthenticatorJni();
    }
}
