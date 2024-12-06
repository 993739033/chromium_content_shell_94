package org.chromium.content.browser;

import android.view.Surface;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.UnguessableToken;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content.browser.GpuProcessCallback;
import org.chromium.content.common.SurfaceWrapper;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class GpuProcessCallbackJni implements GpuProcessCallback.Natives {
    public static final JniStaticTestMocker<GpuProcessCallback.Natives> TEST_HOOKS = new JniStaticTestMocker<GpuProcessCallback.Natives>() { // from class: org.chromium.content.browser.GpuProcessCallbackJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(GpuProcessCallback.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                GpuProcessCallback.Natives unused = GpuProcessCallbackJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static GpuProcessCallback.Natives testInstance;

    GpuProcessCallbackJni() {
    }

    @Override // org.chromium.content.browser.GpuProcessCallback.Natives
    public void completeScopedSurfaceRequest(UnguessableToken requestToken, Surface surface) {
        GEN_JNI.org_chromium_content_browser_GpuProcessCallback_completeScopedSurfaceRequest(requestToken, surface);
    }

    @Override // org.chromium.content.browser.GpuProcessCallback.Natives
    public SurfaceWrapper getViewSurface(int surfaceId) {
        return (SurfaceWrapper) GEN_JNI.org_chromium_content_browser_GpuProcessCallback_getViewSurface(surfaceId);
    }

    public static GpuProcessCallback.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            GpuProcessCallback.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.GpuProcessCallback.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new GpuProcessCallbackJni();
    }
}
