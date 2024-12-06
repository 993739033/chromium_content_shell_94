package org.chromium.device.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface VibrationManager extends Interface {
    public static final Manager<VibrationManager, Proxy> MANAGER = VibrationManager_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface CancelResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends VibrationManager, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface VibrateResponse extends Callbacks.Callback0 {
    }

    void cancel(CancelResponse cancelResponse);

    void vibrate(long j, VibrateResponse vibrateResponse);
}
