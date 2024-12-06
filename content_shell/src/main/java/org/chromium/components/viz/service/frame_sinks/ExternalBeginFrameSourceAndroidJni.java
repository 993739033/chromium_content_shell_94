package org.chromium.components.viz.service.frame_sinks;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.components.viz.service.frame_sinks.ExternalBeginFrameSourceAndroid;
/* JADX INFO: Access modifiers changed from: package-private */
@MainDex
/* loaded from: classes2.dex */
public class ExternalBeginFrameSourceAndroidJni implements ExternalBeginFrameSourceAndroid.Natives {
    public static final JniStaticTestMocker<ExternalBeginFrameSourceAndroid.Natives> TEST_HOOKS = new JniStaticTestMocker<ExternalBeginFrameSourceAndroid.Natives>() { // from class: org.chromium.components.viz.service.frame_sinks.ExternalBeginFrameSourceAndroidJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(ExternalBeginFrameSourceAndroid.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                ExternalBeginFrameSourceAndroid.Natives unused = ExternalBeginFrameSourceAndroidJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static ExternalBeginFrameSourceAndroid.Natives testInstance;

    ExternalBeginFrameSourceAndroidJni() {
    }

    @Override // org.chromium.components.viz.service.frame_sinks.ExternalBeginFrameSourceAndroid.Natives
    public void onVSync(long nativeExternalBeginFrameSourceAndroid, ExternalBeginFrameSourceAndroid caller, long vsyncTimeMicros, long vsyncPeriodMicros) {
        GEN_JNI.org_chromium_components_viz_service_frame_1sinks_ExternalBeginFrameSourceAndroid_onVSync(nativeExternalBeginFrameSourceAndroid, caller, vsyncTimeMicros, vsyncPeriodMicros);
    }

    public static ExternalBeginFrameSourceAndroid.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            ExternalBeginFrameSourceAndroid.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.viz.service.frame_sinks.ExternalBeginFrameSourceAndroid.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(true);
        return new ExternalBeginFrameSourceAndroidJni();
    }
}
