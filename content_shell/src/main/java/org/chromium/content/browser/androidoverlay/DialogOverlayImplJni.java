package org.chromium.content.browser.androidoverlay;

import android.view.Surface;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content.browser.androidoverlay.DialogOverlayImpl;
import org.chromium.gfx.mojom.Rect;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class DialogOverlayImplJni implements DialogOverlayImpl.Natives {
    public static final JniStaticTestMocker<DialogOverlayImpl.Natives> TEST_HOOKS = new JniStaticTestMocker<DialogOverlayImpl.Natives>() { // from class: org.chromium.content.browser.androidoverlay.DialogOverlayImplJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(DialogOverlayImpl.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                DialogOverlayImpl.Natives unused = DialogOverlayImplJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static DialogOverlayImpl.Natives testInstance;

    DialogOverlayImplJni() {
    }

    @Override // org.chromium.content.browser.androidoverlay.DialogOverlayImpl.Natives
    public long init(DialogOverlayImpl caller, long high, long low, boolean isPowerEfficient) {
        return GEN_JNI.org_chromium_content_browser_androidoverlay_DialogOverlayImpl_init(caller, high, low, isPowerEfficient);
    }

    @Override // org.chromium.content.browser.androidoverlay.DialogOverlayImpl.Natives
    public void completeInit(long nativeDialogOverlayImpl, DialogOverlayImpl caller) {
        GEN_JNI.org_chromium_content_browser_androidoverlay_DialogOverlayImpl_completeInit(nativeDialogOverlayImpl, caller);
    }

    @Override // org.chromium.content.browser.androidoverlay.DialogOverlayImpl.Natives
    public void destroy(long nativeDialogOverlayImpl, DialogOverlayImpl caller) {
        GEN_JNI.org_chromium_content_browser_androidoverlay_DialogOverlayImpl_destroy(nativeDialogOverlayImpl, caller);
    }

    @Override // org.chromium.content.browser.androidoverlay.DialogOverlayImpl.Natives
    public void getCompositorOffset(long nativeDialogOverlayImpl, DialogOverlayImpl caller, Rect rect) {
        GEN_JNI.org_chromium_content_browser_androidoverlay_DialogOverlayImpl_getCompositorOffset(nativeDialogOverlayImpl, caller, rect);
    }

    @Override // org.chromium.content.browser.androidoverlay.DialogOverlayImpl.Natives
    public int registerSurface(Surface surface) {
        return GEN_JNI.org_chromium_content_browser_androidoverlay_DialogOverlayImpl_registerSurface(surface);
    }

    @Override // org.chromium.content.browser.androidoverlay.DialogOverlayImpl.Natives
    public void unregisterSurface(int surfaceId) {
        GEN_JNI.org_chromium_content_browser_androidoverlay_DialogOverlayImpl_unregisterSurface(surfaceId);
    }

    @Override // org.chromium.content.browser.androidoverlay.DialogOverlayImpl.Natives
    public Surface lookupSurfaceForTesting(int surfaceId) {
        return (Surface) GEN_JNI.org_chromium_content_browser_androidoverlay_DialogOverlayImpl_lookupSurfaceForTesting(surfaceId);
    }

    @Override // org.chromium.content.browser.androidoverlay.DialogOverlayImpl.Natives
    public void notifyDestroyedSynchronously(int messagePipeHandle) {
        GEN_JNI.org_chromium_content_browser_androidoverlay_DialogOverlayImpl_notifyDestroyedSynchronously(messagePipeHandle);
    }

    public static DialogOverlayImpl.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            DialogOverlayImpl.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.androidoverlay.DialogOverlayImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new DialogOverlayImplJni();
    }
}
