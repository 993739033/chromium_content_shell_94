package org.chromium.device.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface ScreenOrientation extends Interface {
    public static final Manager<ScreenOrientation, Proxy> MANAGER = ScreenOrientation_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface LockOrientationResponse extends Callbacks.Callback1<Integer> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends ScreenOrientation, Interface.Proxy {
    }

    void lockOrientation(int i, LockOrientationResponse lockOrientationResponse);

    void unlockOrientation();
}
