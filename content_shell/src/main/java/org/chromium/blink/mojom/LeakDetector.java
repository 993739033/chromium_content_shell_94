package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface LeakDetector extends Interface {
    public static final Manager<LeakDetector, Proxy> MANAGER = LeakDetector_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface PerformLeakDetectionResponse extends Callbacks.Callback1<LeakDetectionResult> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends LeakDetector, Interface.Proxy {
    }

    void performLeakDetection(PerformLeakDetectionResponse performLeakDetectionResponse);
}
