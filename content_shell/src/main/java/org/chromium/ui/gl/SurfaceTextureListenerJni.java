package org.chromium.ui.gl;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.ui.gl.SurfaceTextureListener;
/* JADX INFO: Access modifiers changed from: package-private */
@MainDex
/* loaded from: classes2.dex */
public class SurfaceTextureListenerJni implements SurfaceTextureListener.Natives {
    public static final JniStaticTestMocker<SurfaceTextureListener.Natives> TEST_HOOKS = new JniStaticTestMocker<SurfaceTextureListener.Natives>() { // from class: org.chromium.ui.gl.SurfaceTextureListenerJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(SurfaceTextureListener.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                SurfaceTextureListener.Natives unused = SurfaceTextureListenerJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static SurfaceTextureListener.Natives testInstance;

    SurfaceTextureListenerJni() {
    }

    @Override // org.chromium.ui.gl.SurfaceTextureListener.Natives
    public void frameAvailable(long nativeSurfaceTextureListener, SurfaceTextureListener caller) {
        GEN_JNI.org_chromium_ui_gl_SurfaceTextureListener_frameAvailable(nativeSurfaceTextureListener, caller);
    }

    @Override // org.chromium.ui.gl.SurfaceTextureListener.Natives
    public void destroy(long nativeSurfaceTextureListener, SurfaceTextureListener caller) {
        GEN_JNI.org_chromium_ui_gl_SurfaceTextureListener_destroy(nativeSurfaceTextureListener, caller);
    }

    public static SurfaceTextureListener.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            SurfaceTextureListener.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.ui.gl.SurfaceTextureListener.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(true);
        return new SurfaceTextureListenerJni();
    }
}
