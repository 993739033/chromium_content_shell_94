package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface WorkerTimingContainer extends Interface {
    public static final Manager<WorkerTimingContainer, Proxy> MANAGER = WorkerTimingContainer_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends WorkerTimingContainer, Interface.Proxy {
    }

    void addPerformanceEntry(PerformanceMarkOrMeasure performanceMarkOrMeasure);
}
