package org.chromium.device.sensors;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.device.sensors.PlatformSensor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class PlatformSensorJni implements PlatformSensor.Natives {
    public static final JniStaticTestMocker<PlatformSensor.Natives> TEST_HOOKS = new JniStaticTestMocker<PlatformSensor.Natives>() { // from class: org.chromium.device.sensors.PlatformSensorJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(PlatformSensor.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                PlatformSensor.Natives unused = PlatformSensorJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static PlatformSensor.Natives testInstance;

    PlatformSensorJni() {
    }

    @Override // org.chromium.device.sensors.PlatformSensor.Natives
    public void notifyPlatformSensorError(long nativePlatformSensorAndroid, PlatformSensor caller) {
        GEN_JNI.org_chromium_device_sensors_PlatformSensor_notifyPlatformSensorError(nativePlatformSensorAndroid, caller);
    }

    @Override // org.chromium.device.sensors.PlatformSensor.Natives
    public void updatePlatformSensorReading(long nativePlatformSensorAndroid, PlatformSensor caller, double timestamp, double value1, double value2, double value3, double value4) {
        GEN_JNI.org_chromium_device_sensors_PlatformSensor_updatePlatformSensorReading(nativePlatformSensorAndroid, caller, timestamp, value1, value2, value3, value4);
    }

    public static PlatformSensor.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            PlatformSensor.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.device.sensors.PlatformSensor.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new PlatformSensorJni();
    }
}
