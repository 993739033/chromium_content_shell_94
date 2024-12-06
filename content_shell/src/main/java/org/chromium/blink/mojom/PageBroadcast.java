package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.Callbacks;
import org.chromium.mojo.bindings.Interface;
import org.chromium.mojo_base.mojom.TimeTicks;
import org.chromium.skia.mojom.SkColor;
/* loaded from: classes2.dex */
public interface PageBroadcast extends Interface {
    public static final Manager<PageBroadcast, Proxy> MANAGER = PageBroadcast_Internal.MANAGER;

    /* loaded from: classes2.dex */
    public interface ActivatePrerenderedPageResponse extends Callbacks.Callback0 {
    }

    /* loaded from: classes2.dex */
    public interface Proxy extends PageBroadcast, Interface.Proxy {
    }

    /* loaded from: classes2.dex */
    public interface SetPageLifecycleStateResponse extends Callbacks.Callback0 {
    }

    void activatePrerenderedPage(TimeTicks timeTicks, ActivatePrerenderedPageResponse activatePrerenderedPageResponse);

    void audioStateChanged(boolean z);

    void setHistoryOffsetAndLength(int i, int i2);

    void setInsidePortal(boolean z);

    void setPageBaseBackgroundColor(SkColor skColor);

    void setPageLifecycleState(PageLifecycleState pageLifecycleState, PageRestoreParams pageRestoreParams, SetPageLifecycleStateResponse setPageLifecycleStateResponse);

    void updateRendererPreferences(RendererPreferences rendererPreferences);

    void updateWebPreferences(WebPreferences webPreferences);
}
