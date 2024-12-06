package org.chromium.media.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
/* loaded from: classes2.dex */
public interface AndroidOverlayClient extends Interface {
    public static final Manager<AndroidOverlayClient, Proxy> MANAGER = AndroidOverlayClient_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface OnSynchronouslyDestroyedResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends AndroidOverlayClient, Interface.Proxy {
    }

    void onDestroyed();

    void onPowerEfficientState(boolean z);

    void onSurfaceReady(long j);

    void onSynchronouslyDestroyed(OnSynchronouslyDestroyedResponse onSynchronouslyDestroyedResponse);
}
