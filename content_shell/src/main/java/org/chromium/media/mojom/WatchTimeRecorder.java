package org.chromium.media.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.TimeDelta;
/* loaded from: classes2.dex */
public interface WatchTimeRecorder extends Interface {
    public static final Manager<WatchTimeRecorder, Proxy> MANAGER = WatchTimeRecorder_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends WatchTimeRecorder, Interface.Proxy {
    }

    void finalizeWatchTime(int[] iArr);

    void onCurrentTimestampChanged(TimeDelta timeDelta);

    void onDurationChanged(TimeDelta timeDelta);

    void onError(int i);

    void recordWatchTime(int i, TimeDelta timeDelta);

    void setAutoplayInitiated(boolean z);

    void updateSecondaryProperties(SecondaryPlaybackProperties secondaryPlaybackProperties);

    void updateUnderflowCount(int i);

    void updateUnderflowDuration(int i, TimeDelta timeDelta);

    void updateVideoDecodeStats(int i, int i2);
}
