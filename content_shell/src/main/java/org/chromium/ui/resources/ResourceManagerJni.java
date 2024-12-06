package org.chromium.ui.resources;

import android.graphics.Bitmap;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.ui.resources.ResourceManager;
/* JADX INFO: Access modifiers changed from: package-private */
@MainDex
/* loaded from: classes2.dex */
public class ResourceManagerJni implements ResourceManager.Natives {
    public static final JniStaticTestMocker<ResourceManager.Natives> TEST_HOOKS = new JniStaticTestMocker<ResourceManager.Natives>() { // from class: org.chromium.ui.resources.ResourceManagerJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(ResourceManager.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                ResourceManager.Natives unused = ResourceManagerJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static ResourceManager.Natives testInstance;

    ResourceManagerJni() {
    }

    @Override // org.chromium.ui.resources.ResourceManager.Natives
    public void onResourceReady(long nativeResourceManagerImpl, ResourceManager caller, int resType, int resId, Bitmap bitmap, int width, int height, long nativeResource) {
        GEN_JNI.org_chromium_ui_resources_ResourceManager_onResourceReady(nativeResourceManagerImpl, caller, resType, resId, bitmap, width, height, nativeResource);
    }

    @Override // org.chromium.ui.resources.ResourceManager.Natives
    public void removeResource(long nativeResourceManagerImpl, ResourceManager caller, int resType, int resId) {
        GEN_JNI.org_chromium_ui_resources_ResourceManager_removeResource(nativeResourceManagerImpl, caller, resType, resId);
    }

    @Override // org.chromium.ui.resources.ResourceManager.Natives
    public void clearTintedResourceCache(long nativeResourceManagerImpl, ResourceManager caller) {
        GEN_JNI.org_chromium_ui_resources_ResourceManager_clearTintedResourceCache(nativeResourceManagerImpl, caller);
    }

    public static ResourceManager.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            ResourceManager.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.ui.resources.ResourceManager.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(true);
        return new ResourceManagerJni();
    }
}
