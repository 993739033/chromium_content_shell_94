package org.chromium.url;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.url.Parsed;
/* JADX INFO: Access modifiers changed from: package-private */
@MainDex
/* loaded from: classes2.dex */
public class ParsedJni implements Parsed.Natives {
    public static final JniStaticTestMocker<Parsed.Natives> TEST_HOOKS = new JniStaticTestMocker<Parsed.Natives>() { // from class: org.chromium.url.ParsedJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(Parsed.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                Parsed.Natives unused = ParsedJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static Parsed.Natives testInstance;

    ParsedJni() {
    }

    @Override // org.chromium.url.Parsed.Natives
    public long createNative(int schemeBegin, int schemeLength, int usernameBegin, int usernameLength, int passwordBegin, int passwordLength, int hostBegin, int hostLength, int portBegin, int portLength, int pathBegin, int pathLength, int queryBegin, int queryLength, int refBegin, int refLength, boolean potentiallyDanglingMarkup, long innerUrl) {
        return GEN_JNI.org_chromium_url_Parsed_createNative(schemeBegin, schemeLength, usernameBegin, usernameLength, passwordBegin, passwordLength, hostBegin, hostLength, portBegin, portLength, pathBegin, pathLength, queryBegin, queryLength, refBegin, refLength, potentiallyDanglingMarkup, innerUrl);
    }

    public static Parsed.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            Parsed.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.url.Parsed.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(true);
        return new ParsedJni();
    }
}
