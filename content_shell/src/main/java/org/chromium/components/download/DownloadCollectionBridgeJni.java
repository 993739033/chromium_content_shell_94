package org.chromium.components.download;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
class DownloadCollectionBridgeJni implements DownloadCollectionBridge.Natives {
  private static DownloadCollectionBridge.Natives testInstance;

  public static final JniStaticTestMocker<DownloadCollectionBridge.Natives> TEST_HOOKS = new JniStaticTestMocker<DownloadCollectionBridge.Natives>() {
    @Override
    public void setInstanceForTesting(
        DownloadCollectionBridge.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public int getExpirationDurationInDays() {
    return (int)GEN_JNI.org_chromium_components_download_DownloadCollectionBridge_getExpirationDurationInDays();
  }

  public static DownloadCollectionBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.download.DownloadCollectionBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new DownloadCollectionBridgeJni();
  }
}
