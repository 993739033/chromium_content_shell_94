package org.chromium.device.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface ScreenOrientationListener extends Interface {
    public static final Manager<ScreenOrientationListener, Proxy> MANAGER = ScreenOrientationListener_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface IsAutoRotateEnabledByUserResponse extends Callbacks.Callback1<Boolean> {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends ScreenOrientationListener, Interface.Proxy {
    }

    void isAutoRotateEnabledByUser(IsAutoRotateEnabledByUserResponse isAutoRotateEnabledByUserResponse);
}
