package org.chromium.device.time_zone_monitor;

import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.device.time_zone_monitor.TimeZoneMonitor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class TimeZoneMonitorJni implements TimeZoneMonitor.Natives {
    public static final JniStaticTestMocker<TimeZoneMonitor.Natives> TEST_HOOKS = new JniStaticTestMocker<TimeZoneMonitor.Natives>() { // from class: org.chromium.device.time_zone_monitor.TimeZoneMonitorJni.1
        @Override // org.chromium.base.JniStaticTestMocker
        public void setInstanceForTesting(TimeZoneMonitor.Natives instance) {
            if (GEN_JNI.TESTING_ENABLED) {
                TimeZoneMonitor.Natives unused = TimeZoneMonitorJni.testInstance = instance;
                return;
            }
            throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static TimeZoneMonitor.Natives testInstance;

    TimeZoneMonitorJni() {
    }

    @Override // org.chromium.device.time_zone_monitor.TimeZoneMonitor.Natives
    public void timeZoneChangedFromJava(long nativeTimeZoneMonitorAndroid, TimeZoneMonitor caller) {
        GEN_JNI.org_chromium_device_time_1zone_1monitor_TimeZoneMonitor_timeZoneChangedFromJava(nativeTimeZoneMonitorAndroid, caller);
    }

    public static TimeZoneMonitor.Natives get() {
        if (GEN_JNI.TESTING_ENABLED) {
            TimeZoneMonitor.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (GEN_JNI.REQUIRE_MOCK) {
                throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.device.time_zone_monitor.TimeZoneMonitor.Natives. The current configuration requires all native implementations to have a mock instance.");
            }
        }
        NativeLibraryLoadedStatus.checkLoaded(false);
        return new TimeZoneMonitorJni();
    }
}
