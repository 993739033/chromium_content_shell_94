package org.chromium.content_public.common;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.common.ResourceRequestBody;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ResourceRequestBodyJni implements ResourceRequestBody.Natives {
    public static final JniStaticTestMocker<ResourceRequestBody.Natives> TEST_HOOKS = new JniStaticTestMocker<ResourceRequestBody.Natives>() { // from class: org.chromium.content_public.common.ResourceRequestBodyJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(ResourceRequestBody.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                ResourceRequestBody.Natives unused = ResourceRequestBodyJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static ResourceRequestBody.Natives testInstance;

    ResourceRequestBodyJni() {
    }

    @Override // org.chromium.content_public.common.ResourceRequestBody.Natives
    public byte[] createResourceRequestBodyFromBytes(byte[] httpBody) {
        return GEN_JNI.org_chromium_content_1public_common_ResourceRequestBody_createResourceRequestBodyFromBytes(httpBody);
    }

    public static ResourceRequestBody.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            ResourceRequestBody.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content_public.common.ResourceRequestBody.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new ResourceRequestBodyJni();
    }
}
