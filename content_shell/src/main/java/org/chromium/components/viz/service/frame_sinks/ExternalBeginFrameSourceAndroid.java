package org.chromium.components.viz.service.frame_sinks;

import org.chromium.base.ContextUtils;
import org.chromium.base.annotations.JNINamespace;
import org.chromium.base.annotations.MainDex;
import org.chromium.ui.VSyncMonitor;
@JNINamespace("viz")
@MainDex
/* loaded from: classes2.dex */
public class ExternalBeginFrameSourceAndroid {
    private final long mNativeExternalBeginFrameSourceAndroid;
    private final VSyncMonitor.Listener mVSyncListener;
    private final VSyncMonitor mVSyncMonitor;
    private boolean mVSyncNotificationsEnabled;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface Natives {
        void onVSync(long j, ExternalBeginFrameSourceAndroid externalBeginFrameSourceAndroid, long j2, long j3);
    }

    private ExternalBeginFrameSourceAndroid(long nativeExternalBeginFrameSourceAndroid, float refreshRate) {
        VSyncMonitor.Listener listener = new VSyncMonitor.Listener() { // from class: org.chromium.components.viz.service.frame_sinks.ExternalBeginFrameSourceAndroid.1
            @Override // org.chromium.ui.VSyncMonitor.Listener
            public void onVSync(VSyncMonitor monitor, long vsyncTimeMicros) {
                if (!ExternalBeginFrameSourceAndroid.this.mVSyncNotificationsEnabled) {
                    return;
                }
                Natives natives = ExternalBeginFrameSourceAndroidJni.get();
                long j = ExternalBeginFrameSourceAndroid.this.mNativeExternalBeginFrameSourceAndroid;
                ExternalBeginFrameSourceAndroid externalBeginFrameSourceAndroid = ExternalBeginFrameSourceAndroid.this;
                natives.onVSync(j, externalBeginFrameSourceAndroid, vsyncTimeMicros, externalBeginFrameSourceAndroid.mVSyncMonitor.getVSyncPeriodInMicroseconds());
                ExternalBeginFrameSourceAndroid.this.mVSyncMonitor.requestUpdate();
            }
        };
        this.mVSyncListener = listener;
        this.mNativeExternalBeginFrameSourceAndroid = nativeExternalBeginFrameSourceAndroid;
        this.mVSyncMonitor = new VSyncMonitor(ContextUtils.getApplicationContext(), listener, refreshRate);
    }

    private void setEnabled(boolean enabled) {
        if (this.mVSyncNotificationsEnabled == enabled) {
            return;
        }
        this.mVSyncNotificationsEnabled = enabled;
        if (enabled) {
            this.mVSyncMonitor.requestUpdate();
        }
    }

    private void updateRefreshRate(float refreshRate) {
        this.mVSyncMonitor.updateRefreshRate(refreshRate);
    }
}
