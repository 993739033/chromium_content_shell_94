package org.chromium.content.browser;

import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content.browser.RenderWidgetHostViewImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class RenderWidgetHostViewImplJni implements RenderWidgetHostViewImpl.Natives {
    public static final JniStaticTestMocker<RenderWidgetHostViewImpl.Natives> TEST_HOOKS = new JniStaticTestMocker<RenderWidgetHostViewImpl.Natives>() { // from class: org.chromium.content.browser.RenderWidgetHostViewImplJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(RenderWidgetHostViewImpl.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                RenderWidgetHostViewImpl.Natives unused = RenderWidgetHostViewImplJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static RenderWidgetHostViewImpl.Natives testInstance;

    RenderWidgetHostViewImplJni() {
    }

    @Override // org.chromium.content.browser.RenderWidgetHostViewImpl.Natives
    public boolean isReady(long nativeRenderWidgetHostViewAndroid, RenderWidgetHostViewImpl caller) {
        return GEN_JNI.org_chromium_content_browser_RenderWidgetHostViewImpl_isReady(nativeRenderWidgetHostViewAndroid, caller);
    }

    @Override // org.chromium.content.browser.RenderWidgetHostViewImpl.Natives
    public int getBackgroundColor(long nativeRenderWidgetHostViewAndroid, RenderWidgetHostViewImpl caller) {
        return GEN_JNI.org_chromium_content_browser_RenderWidgetHostViewImpl_getBackgroundColor(nativeRenderWidgetHostViewAndroid, caller);
    }

    @Override // org.chromium.content.browser.RenderWidgetHostViewImpl.Natives
    public void dismissTextHandles(long nativeRenderWidgetHostViewAndroid, RenderWidgetHostViewImpl caller) {
        GEN_JNI.org_chromium_content_browser_RenderWidgetHostViewImpl_dismissTextHandles(nativeRenderWidgetHostViewAndroid, caller);
    }

    @Override // org.chromium.content.browser.RenderWidgetHostViewImpl.Natives
    public void showContextMenuAtTouchHandle(long nativeRenderWidgetHostViewAndroid, RenderWidgetHostViewImpl caller, int x, int y) {
        GEN_JNI.org_chromium_content_browser_RenderWidgetHostViewImpl_showContextMenuAtTouchHandle(nativeRenderWidgetHostViewAndroid, caller, x, y);
    }

    @Override // org.chromium.content.browser.RenderWidgetHostViewImpl.Natives
    public void onViewportInsetBottomChanged(long nativeRenderWidgetHostViewAndroid, RenderWidgetHostViewImpl caller) {
        GEN_JNI.org_chromium_content_browser_RenderWidgetHostViewImpl_onViewportInsetBottomChanged(nativeRenderWidgetHostViewAndroid, caller);
    }

    @Override // org.chromium.content.browser.RenderWidgetHostViewImpl.Natives
    public void writeContentBitmapToDiskAsync(long nativeRenderWidgetHostViewAndroid, RenderWidgetHostViewImpl caller, int width, int height, String path, Callback<String> callback) {
        GEN_JNI.org_chromium_content_browser_RenderWidgetHostViewImpl_writeContentBitmapToDiskAsync(nativeRenderWidgetHostViewAndroid, caller, width, height, path, callback);
    }

    public static RenderWidgetHostViewImpl.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            RenderWidgetHostViewImpl.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.RenderWidgetHostViewImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new RenderWidgetHostViewImplJni();
    }
}
