package org.chromium.ui.resources;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.ui.resources.ResourceFactory;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ResourceFactoryJni implements ResourceFactory.Natives {
    public static final JniStaticTestMocker<ResourceFactory.Natives> TEST_HOOKS = new JniStaticTestMocker<ResourceFactory.Natives>() { // from class: org.chromium.ui.resources.ResourceFactoryJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(ResourceFactory.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                ResourceFactory.Natives unused = ResourceFactoryJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static ResourceFactory.Natives testInstance;

    ResourceFactoryJni() {
    }

    @Override // org.chromium.ui.resources.ResourceFactory.Natives
    public long createBitmapResource() {
        return GEN_JNI.org_chromium_ui_resources_ResourceFactory_createBitmapResource();
    }

    @Override // org.chromium.ui.resources.ResourceFactory.Natives
    public long createNinePatchBitmapResource(int paddingLeft, int paddingTop, int paddingRight, int paddingBottom, int apertureLeft, int apertureTop, int apertureRight, int apertureBottom) {
        return GEN_JNI.org_chromium_ui_resources_ResourceFactory_createNinePatchBitmapResource(paddingLeft, paddingTop, paddingRight, paddingBottom, apertureLeft, apertureTop, apertureRight, apertureBottom);
    }

    public static ResourceFactory.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            ResourceFactory.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.ui.resources.ResourceFactory.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new ResourceFactoryJni();
    }
}
