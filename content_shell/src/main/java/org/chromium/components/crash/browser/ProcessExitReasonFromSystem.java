package org.chromium.components.crash.browser;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import org.chromium.base.ContextUtils;
import org.chromium.base.metrics.RecordHistogram;
/* loaded from: classes2.dex */
public class ProcessExitReasonFromSystem {

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    @interface ExitReason {
        public static final int NUM_ENTRIES = 14;
        public static final int REASON_ANR = 0;
        public static final int REASON_CRASH = 1;
        public static final int REASON_CRASH_NATIVE = 2;
        public static final int REASON_DEPENDENCY_DIED = 3;
        public static final int REASON_EXCESSIVE_RESOURCE_USAGE = 4;
        public static final int REASON_EXIT_SELF = 5;
        public static final int REASON_INITIALIZATION_FAILURE = 6;
        public static final int REASON_LOW_MEMORY = 7;
        public static final int REASON_OTHER = 8;
        public static final int REASON_PERMISSION_CHANGE = 9;
        public static final int REASON_SIGNALED = 10;
        public static final int REASON_UNKNOWN = 11;
        public static final int REASON_USER_REQUESTED = 12;
        public static final int REASON_USER_STOPPED = 13;
    }

    public static int getExitReason(int pid) {
        if (Build.VERSION.SDK_INT < 30) {
            return -1;
        }
        ActivityManager am = (ActivityManager) ContextUtils.getApplicationContext().getSystemService("activity");
        List<ApplicationExitInfo> reasons = am.getHistoricalProcessExitReasons(null, pid, 1);
        if (reasons.isEmpty() || reasons.get(0) == null || reasons.get(0).getPid() != pid) {
            return -1;
        }
        return reasons.get(0).getReason();
    }

    private static void recordExitReasonToUma(int pid, String umaName) {
        recordAsEnumHistogram(umaName, getExitReason(pid));
    }

    public static void recordAsEnumHistogram(String umaName, int systemReason) {
        int reason;
        switch (systemReason) {
            case 0:
                reason = 11;
                break;
            case 1:
                reason = 5;
                break;
            case 2:
                reason = 10;
                break;
            case 3:
                reason = 7;
                break;
            case 4:
                reason = 1;
                break;
            case 5:
                reason = 2;
                break;
            case 6:
                reason = 0;
                break;
            case 7:
                reason = 6;
                break;
            case 8:
                reason = 9;
                break;
            case 9:
                reason = 4;
                break;
            case 10:
                reason = 12;
                break;
            case 11:
                reason = 13;
                break;
            case 12:
                reason = 3;
                break;
            case 13:
                reason = 8;
                break;
            default:
                return;
        }
        RecordHistogram.recordEnumeratedHistogram(umaName, reason, 14);
    }
}
