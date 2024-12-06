package org.chromium.device.mojom;

import java.util.Map;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface FingerprintObserver extends Interface {
    public static final Manager<FingerprintObserver, Proxy> MANAGER = FingerprintObserver_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface Proxy extends FingerprintObserver, Interface.Proxy {
    }

    void onAuthScanDone(int i, Map<String, String[]> map);

    void onEnrollScanDone(int i, boolean z, int i2);

    void onRestarted();

    void onSessionFailed();
}
