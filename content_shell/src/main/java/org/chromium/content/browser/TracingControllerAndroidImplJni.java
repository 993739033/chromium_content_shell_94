package org.chromium.content.browser;

import android.util.Pair;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content.browser.TracingControllerAndroidImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class TracingControllerAndroidImplJni implements TracingControllerAndroidImpl.Natives {
    public static final JniStaticTestMocker<TracingControllerAndroidImpl.Natives> TEST_HOOKS = new JniStaticTestMocker<TracingControllerAndroidImpl.Natives>() { // from class: org.chromium.content.browser.TracingControllerAndroidImplJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(TracingControllerAndroidImpl.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                TracingControllerAndroidImpl.Natives unused = TracingControllerAndroidImplJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static TracingControllerAndroidImpl.Natives testInstance;

    TracingControllerAndroidImplJni() {
    }

    @Override // org.chromium.content.browser.TracingControllerAndroidImpl.Natives
    public long init(TracingControllerAndroidImpl caller) {
        return GEN_JNI.org_chromium_content_browser_TracingControllerAndroidImpl_init(caller);
    }

    @Override // org.chromium.content.browser.TracingControllerAndroidImpl.Natives
    public void destroy(long nativeTracingControllerAndroid, TracingControllerAndroidImpl caller) {
        GEN_JNI.org_chromium_content_browser_TracingControllerAndroidImpl_destroy(nativeTracingControllerAndroid, caller);
    }

    @Override // org.chromium.content.browser.TracingControllerAndroidImpl.Natives
    public boolean startTracing(long nativeTracingControllerAndroid, TracingControllerAndroidImpl caller, String categories, String traceOptions, boolean useProtobuf) {
        return GEN_JNI.org_chromium_content_browser_TracingControllerAndroidImpl_startTracing(nativeTracingControllerAndroid, caller, categories, traceOptions, useProtobuf);
    }

    @Override // org.chromium.content.browser.TracingControllerAndroidImpl.Natives
    public void stopTracing(long nativeTracingControllerAndroid, TracingControllerAndroidImpl caller, String filename, boolean compressFile, boolean useProtobuf, Callback<Void> callback) {
        GEN_JNI.org_chromium_content_browser_TracingControllerAndroidImpl_stopTracing(nativeTracingControllerAndroid, caller, filename, compressFile, useProtobuf, callback);
    }

    @Override // org.chromium.content.browser.TracingControllerAndroidImpl.Natives
    public boolean getKnownCategoriesAsync(long nativeTracingControllerAndroid, TracingControllerAndroidImpl caller, Callback<String[]> callback) {
        return GEN_JNI.org_chromium_content_browser_TracingControllerAndroidImpl_getKnownCategoriesAsync(nativeTracingControllerAndroid, caller, callback);
    }

    @Override // org.chromium.content.browser.TracingControllerAndroidImpl.Natives
    public String getDefaultCategories(TracingControllerAndroidImpl caller) {
        return GEN_JNI.org_chromium_content_browser_TracingControllerAndroidImpl_getDefaultCategories(caller);
    }

    @Override // org.chromium.content.browser.TracingControllerAndroidImpl.Natives
    public boolean getTraceBufferUsageAsync(long nativeTracingControllerAndroid, TracingControllerAndroidImpl caller, Callback<Pair<Float, Long>> callback) {
        return GEN_JNI.org_chromium_content_browser_TracingControllerAndroidImpl_getTraceBufferUsageAsync(nativeTracingControllerAndroid, caller, callback);
    }

    public static TracingControllerAndroidImpl.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            TracingControllerAndroidImpl.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.TracingControllerAndroidImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new TracingControllerAndroidImplJni();
    }
}
