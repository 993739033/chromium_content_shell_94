package org.chromium.base.library_loader;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
class LibraryLoaderJni implements LibraryLoader.Natives {
  private static LibraryLoader.Natives testInstance;

  public static final JniStaticTestMocker<LibraryLoader.Natives> TEST_HOOKS = new JniStaticTestMocker<LibraryLoader.Natives>() {
    @Override
    public void setInstanceForTesting(
        LibraryLoader.Natives instance) {
      if (!GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean libraryLoaded(int processType) {
    return (boolean)GEN_JNI.org_chromium_base_library_1loader_LibraryLoader_libraryLoaded(processType);
  }

  @Override
  public void registerNonMainDexJni() {
    GEN_JNI.org_chromium_base_library_1loader_LibraryLoader_registerNonMainDexJni();
  }

  public static LibraryLoader.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.library_loader.LibraryLoader.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new LibraryLoaderJni();
  }
}
