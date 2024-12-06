package org.chromium.components.embedder_support.view;

import android.view.Surface;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class ContentViewRenderViewJni implements ContentViewRenderView.Natives {
  private static ContentViewRenderView.Natives testInstance;

  public static final JniStaticTestMocker<ContentViewRenderView.Natives> TEST_HOOKS = new JniStaticTestMocker<ContentViewRenderView.Natives>() {
    @Override
    public void setInstanceForTesting(
        ContentViewRenderView.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(ContentViewRenderView caller, WindowAndroid rootWindow) {
    return (long)GEN_JNI.org_chromium_components_embedder_1support_view_ContentViewRenderView_init(caller, rootWindow);
  }

  @Override
  public void destroy(long nativeContentViewRenderView, ContentViewRenderView caller) {
    GEN_JNI.org_chromium_components_embedder_1support_view_ContentViewRenderView_destroy(nativeContentViewRenderView, caller);
  }

  @Override
  public void setCurrentWebContents(long nativeContentViewRenderView, ContentViewRenderView caller,
      WebContents webContents) {
    GEN_JNI.org_chromium_components_embedder_1support_view_ContentViewRenderView_setCurrentWebContents(nativeContentViewRenderView, caller, webContents);
  }

  @Override
  public void onPhysicalBackingSizeChanged(long nativeContentViewRenderView,
      ContentViewRenderView caller, WebContents webContents, int width, int height) {
    GEN_JNI.org_chromium_components_embedder_1support_view_ContentViewRenderView_onPhysicalBackingSizeChanged(nativeContentViewRenderView, caller, webContents, width, height);
  }

  @Override
  public void surfaceCreated(long nativeContentViewRenderView, ContentViewRenderView caller) {
    GEN_JNI.org_chromium_components_embedder_1support_view_ContentViewRenderView_surfaceCreated(nativeContentViewRenderView, caller);
  }

  @Override
  public void surfaceDestroyed(long nativeContentViewRenderView, ContentViewRenderView caller) {
    GEN_JNI.org_chromium_components_embedder_1support_view_ContentViewRenderView_surfaceDestroyed(nativeContentViewRenderView, caller);
  }

  @Override
  public void surfaceChanged(long nativeContentViewRenderView, ContentViewRenderView caller,
      int format, int width, int height, Surface surface) {
    GEN_JNI.org_chromium_components_embedder_1support_view_ContentViewRenderView_surfaceChanged(nativeContentViewRenderView, caller, format, width, height, surface);
  }

  @Override
  public void setOverlayVideoMode(long nativeContentViewRenderView, ContentViewRenderView caller,
      boolean enabled) {
    GEN_JNI.org_chromium_components_embedder_1support_view_ContentViewRenderView_setOverlayVideoMode(nativeContentViewRenderView, caller, enabled);
  }

  public static ContentViewRenderView.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.embedder_support.view.ContentViewRenderView.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ContentViewRenderViewJni();
  }
}
