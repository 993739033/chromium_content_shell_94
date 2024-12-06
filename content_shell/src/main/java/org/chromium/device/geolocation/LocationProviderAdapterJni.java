package org.chromium.device.geolocation;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.device.geolocation.LocationProviderAdapter;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class LocationProviderAdapterJni implements LocationProviderAdapter.Natives {
    public static final JniStaticTestMocker<LocationProviderAdapter.Natives> TEST_HOOKS = new JniStaticTestMocker<LocationProviderAdapter.Natives>() { // from class: org.chromium.device.geolocation.LocationProviderAdapterJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(LocationProviderAdapter.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                LocationProviderAdapter.Natives unused = LocationProviderAdapterJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static LocationProviderAdapter.Natives testInstance;

    LocationProviderAdapterJni() {
    }

    @Override // org.chromium.device.geolocation.LocationProviderAdapter.Natives
    public void newLocationAvailable(double latitude, double longitude, double timeStamp, boolean hasAltitude, double altitude, boolean hasAccuracy, double accuracy, boolean hasHeading, double heading, boolean hasSpeed, double speed) {
        GEN_JNI.org_chromium_device_geolocation_LocationProviderAdapter_newLocationAvailable(latitude, longitude, timeStamp, hasAltitude, altitude, hasAccuracy, accuracy, hasHeading, heading, hasSpeed, speed);
    }

    @Override // org.chromium.device.geolocation.LocationProviderAdapter.Natives
    public void newErrorAvailable(String message) {
        GEN_JNI.org_chromium_device_geolocation_LocationProviderAdapter_newErrorAvailable(message);
    }

    public static LocationProviderAdapter.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            LocationProviderAdapter.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.device.geolocation.LocationProviderAdapter.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new LocationProviderAdapterJni();
    }
}
