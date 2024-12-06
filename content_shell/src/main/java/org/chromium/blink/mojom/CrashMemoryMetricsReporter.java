package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.UnsafeSharedMemoryRegion;
/* loaded from: classes2.dex */
public interface CrashMemoryMetricsReporter extends Interface {
    public static final Manager<CrashMemoryMetricsReporter, Proxy> MANAGER = CrashMemoryMetricsReporter_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends CrashMemoryMetricsReporter, Interface.Proxy {
    }

    void setSharedMemory(UnsafeSharedMemoryRegion unsafeSharedMemoryRegion);
}
